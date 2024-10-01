# language: es

Característica: Cambiar el idioma de la pagina.

  Esquema del escenario: Cambiar el idioma de la pagina.
    Dado que "<nombreUsuario>" quiera cambiar el idioma de la pagina
    Cuando "<nombreUsuario>" seleccione "<idioma>"
    Entonces "<nombreUsuario>" visualiza la pagina en "<idioma>"
    Ejemplos:
      | nombreUsuario | idioma   |
      | Juan          | Español  |
      | Sebastian     | English  |
      | Jia           | Italiano |