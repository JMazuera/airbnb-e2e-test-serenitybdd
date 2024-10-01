package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class BusquedasEstadiaStepDefinitions {

    @Entonces("{actor} debe encontrar al menos {int} locación")
    public void encontrarCantidadLocaciones(Actor actor, Integer cantidadLocaciones) {
        int cantidadResultados = ResultadosEstadiaPage.LISTA_RESULTADOS.resolveAllFor(actor).size();
        actor.attemptsTo(
                Ensure.that(cantidadResultados).isGreaterThanOrEqualTo(cantidadLocaciones)
        );
    }
}
