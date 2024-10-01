# language: es

Característica: Filtrar resultados de busqueda por precio
  
  Esquema del escenario: Filtrar estadías dentro de un rango de precios
    Dado que "<nombreUsuario>" busca un airbnb para "<lugarEstadia>", por <diasEstadia> días y para <cantidadIndividuo> "<tipoIndividuo>"
    Y que "<nombreUsuario>" ha seleccionado un rango de precios entre "<precioMinimo>" y "<precioMaximo>" COP por noche
    Cuando "<nombreUsuario>" aplica el filtro de precios
    Entonces debería ver solo alojamientos que estén dentro de ese rango de precios
    Ejemplos:
      | nombreUsuario | lugarEstadia         | diasEstadia | cantidadIndividuo | tipoIndividuo | precioMinimo | precioMaximo |
      | Carlos        | París, Francia       | 5           | 2                 | Adultos       | 100000       | 200000       |
      | Jia           | Nueva York, EE. UU.  | 7           | 1                 | Adultos       | 500000       | 1500000      |
      | Juan          | Tokio, Japón         | 10          | 3                 | Adultos       | 2000000      | 3000000      |
      | Sebastian     | Londres, Reino Unido | 3           | 1                 | Adultos       | 0            | 1000000      |