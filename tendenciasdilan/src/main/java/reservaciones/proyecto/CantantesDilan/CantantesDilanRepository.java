package reservaciones.proyecto.CantantesDilan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CantantesDilanRepository extends JpaRepository<CantantesDilan, Long>{
    @Transactional
    void deleteByNombre(String nombre);
}
