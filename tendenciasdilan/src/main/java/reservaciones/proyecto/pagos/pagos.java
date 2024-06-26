package reservaciones.proyecto.pagos;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.Data;
import reservaciones.proyecto.reservas.Reservas;

@Data
@Entity
public class pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago;

    @Column(columnDefinition = "DECIMAL(10, 2)")
    private BigDecimal monto; 

    @Column(length = 50)
    private String metodoPago; 

    @Column(length = 20)
    private String estadoPago; 

    @ManyToOne
    private Reservas reserva;
}
