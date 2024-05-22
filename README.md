# JSON 
cantantes: localhost:7013/cantantes/

{
  "id": 1,
  "nombre": "dilan",
  "edad": 28,
  "fechaDeNacimiento": "2000-05-21"
}

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
