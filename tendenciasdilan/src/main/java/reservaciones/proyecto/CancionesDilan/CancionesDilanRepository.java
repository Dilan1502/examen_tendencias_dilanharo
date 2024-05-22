package reservaciones.proyecto.CancionesDilan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;



public interface CancionesDilanRepository extends JpaRepository<CancionesDilan, Long> {
    @Transactional
    void deleteByTitulo(String titulo);
}
