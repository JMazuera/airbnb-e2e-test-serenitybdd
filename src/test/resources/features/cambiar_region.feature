# language: es

Característica: Cambiar la región de la pagina.

  Esquema del escenario: Cambiar la región de la pagina.
    Dado que "<nombreUsuario>" quiera cambiar la región de la pagina
    Cuando "<nombreUsuario>" seleccione "<region>"
    Entonces "<nombreUsuario>" visualiza la pagina en la "<region>"
    Ejemplos:
      | nombreUsuario | region        |
      | Juan          | Guatemala     |
      | Sebastian     | Italia        |
      | Jia           | United States |