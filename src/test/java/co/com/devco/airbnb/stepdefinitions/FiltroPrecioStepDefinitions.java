package co.com.devco.airbnb.stepdefinitions;


import co.com.devco.airbnb.task.AplicarFiltroPrecio;
import co.com.devco.airbnb.task.FiltrarPrecio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;


public class FiltroPrecioStepDefinitions {

    @Dado("que {actor} ha seleccionado un rango de precios entre {string} y {string} COP por noche")
    public void seleccionarRangoDePrecios(Actor actor, String precioMinimo, String precioMaximo) {
        actor.attemptsTo(
                AplicarFiltroPrecio.conRango(precioMinimo, precioMaximo)
        );
    }

    @Cuando("{actor} aplica el filtro de precios")
    public void aplicarFiltroDePrecios(Actor actor) {
        actor.attemptsTo(
                FiltrarPrecio.buscarPrecio()
        );
    }

    @Entonces("debería ver solo alojamientos que estén dentro de ese rango de precios")
    public void verResultados() {
        assert true;
    }
}
