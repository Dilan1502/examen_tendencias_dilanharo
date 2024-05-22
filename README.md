# JSON cantantes 
cantantes: localhost:7013/cantantes/

{
  "id": 1,
  "nombre": "dilan",
  "edad": 28,
  "fechaDeNacimiento": "2000-05-21"
}

# JSON canciones 
canciones: localhost:7013/canciones/

{
  "titulo": "lagrimas de amor",
  "esHit": true,
  "reproducciones": 28,
  "fechaDeLanzamiento": "2024-05-21",
  "cantante":{
    "id":1
  }
}

# Link de swagger 
swagger: http://localhost:7013/swagger-ui/index.html 
