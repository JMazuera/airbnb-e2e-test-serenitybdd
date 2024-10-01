# language: es

Característica: Cambiar la región de la pagina.

  Esquema del escenario: Cambiar la moneda de la pagina.
    Dado que "<nombreUsuario>" quiera cambiar la moneda de la pagina
    Cuando "<nombreUsuario>" seleccione la "<moneda>"
    Entonces "<nombreUsuario>" visualiza la pagina con la "<moneda>"
    Ejemplos:
      | nombreUsuario | moneda               |
      | Juan          | Peso colombiano      |
      | Carlos        | Franco suizo         |
      | Enmanuel      | Dólar estadounidense |