package reservaciones.proyecto.CancionesDilan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("canciones")
@Tag(name = "canciones")
@CrossOrigin({"*"})
public class CancionesDilanController {
    @Autowired
    CancionesDilanService service;

    @Operation(summary = "Obtiene una cancion por su id")
    @GetMapping("/{id}/")
    public CancionesDilan findByIdDilan(@PathVariable long id){
        return service.findByIdDilan(id);
    }

    @Operation(summary = "Obtiene todas las canciones")
    @GetMapping("/")
    public List<CancionesDilan> findAllDilan(){
        return service.findAllDilan();
    }

    //Create
    @Operation(summary = "Agrega una cancion")
    @PostMapping("/")
    public CancionesDilan saveDilan (@RequestBody CancionesDilan entity){
        return service.saveDilan(entity);
    }

    @Operation(summary = "Actualizar campo completo de una cancion, el id va en el body")
    @PutMapping("/")
    public CancionesDilan updateDilan (@RequestBody CancionesDilan entity){
        return service.saveDilan(entity);
    }

    @Operation(summary = "Elimina una cancion por su id")
    @DeleteMapping("/{id}/")
    public void deeteByIdDilan(@PathVariable long id){
        service.deleteByIdDilan(id);
    }

    @Operation(summary = "Elimina una cancion por su titulo")
    @DeleteMapping("/titulo/{titulo}/")
    public void deeteByTituloDilan(@PathVariable String titulo){
        service.deleteByTituloDilan(titulo);
    }
}
