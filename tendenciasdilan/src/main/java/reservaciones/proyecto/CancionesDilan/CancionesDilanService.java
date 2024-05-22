package reservaciones.proyecto.CancionesDilan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancionesDilanService {
    @Autowired
    CancionesDilanRepository repository;
    
    public CancionesDilan saveDilan(CancionesDilan entity){
        return repository.save(entity);
    }

    public void deleteByIdDilan(long id){
        repository.deleteById(id);
    }

    public CancionesDilan findByIdDilan(long id){
        return repository.findById(id).orElse(null);
    }

    public List<CancionesDilan> findAllDilan(){
        return repository.findAll();
    }

    public void deleteByTituloDilan(String titulo){
        repository.deleteByTitulo(titulo);
        return;
    }
}
