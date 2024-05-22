package reservaciones.proyecto.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
  info = @Info(
    title = "Sistema de reservas de hotel",
    version = "1.0.0",
    description = "reservas de hotel"
  )
)
public class SwaggerConfiguration {
}