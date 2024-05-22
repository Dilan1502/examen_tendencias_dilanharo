package reservaciones.proyecto.CantantesDilan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CantantesDilanService {
    @Autowired
    CantantesDilanRepository repository;
    
    public CantantesDilan saveDilan(CantantesDilan entity){
        return repository.save(entity);
    }

    public void deleteByIdDilan(long id){
        repository.deleteById(id);
    }

    public CantantesDilan findByIdDilan(long id){
        return repository.findById(id).orElse(null);
    }

    public List<CantantesDilan> findAllDilan(){
        return repository.findAll();
    }

    public void deleteByNombreDilan(String nombre){
        repository.deleteByNombre(nombre);
        return;
    }
}
