package reservaciones.proyecto.CantantesDilan;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import reservaciones.proyecto.CancionesDilan.CancionesDilan;

@Data
@Entity
public class CantantesDilan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer edad;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeNacimiento;

    @JsonIgnoreProperties("cantante")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cantante")
    private List<CancionesDilan> canciones;
}
