package reservaciones.proyecto.CancionesDilan;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import reservaciones.proyecto.CantantesDilan.CantantesDilan;

@Data
@Entity
public class CancionesDilan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    
    private Boolean esHit;
    private Integer reproducciones;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeLanzamiento;

    @ManyToOne
    @JoinColumn(name = "cantante_id")
    @JsonIgnoreProperties("canciones")
    private CantantesDilan cantante;
}
