package reservaciones.proyecto.CantantesDilan;

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
@RequestMapping("cantantes")
@Tag(name = "cantantes")
@CrossOrigin({"*"})
public class CantantesDilanController {
      @Autowired
    CantantesDilanService service;

    @Operation(summary = "Obtiene un cantante por su id")
    @GetMapping("/{id}/")
    public CantantesDilan findByIdDilan(@PathVariable long id){
        return service.findByIdDilan(id);
    }

    @Operation(summary = "Obtiene todos los cantantes")
    @GetMapping("/")
    public List<CantantesDilan> findAllDilan(){
        return service.findAllDilan();
    }

    //Create
    @Operation(summary = "Agrega un cantante")
    @PostMapping("/")
    public CantantesDilan saveDilan (@RequestBody CantantesDilan entity){
        return service.saveDilan(entity);
    }

    @Operation(summary = "Actualizar campo completo de un cantante, el id va en el body")
    @PutMapping("/")
    public CantantesDilan updateDilan (@RequestBody CantantesDilan entity){
        return service.saveDilan(entity);
    }

    @Operation(summary = "Elimina una cantante por su id")
    @DeleteMapping("/{id}/")
    public void deeteByIdDilan(@PathVariable long id){
        service.deleteByIdDilan(id);
    }

    @Operation(summary = "Elimina un cantante por su nombre")
    @DeleteMapping("/nombre/{nombre}/")
    public void deeteByTituloDilan(@PathVariable String nombre){
        service.deleteByNombreDilan(nombre);
    }
}
