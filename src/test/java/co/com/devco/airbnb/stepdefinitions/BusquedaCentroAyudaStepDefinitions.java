package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.ResultadosCentroAyudaPage;
import co.com.devco.airbnb.task.BuscarCentroAyuda;
import co.com.devco.airbnb.task.Navegar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class BusquedaCentroAyudaStepDefinitions {
    @Dado("que {actor} navega hasa la seccion de centro de ayuda")
    public void abrirPaginaAirbnb(Actor actor){
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class),
                Navegar.haciaCentroAyuda()
        );
    }

    @Cuando("{actor} busca {string}")
    public void realizarBusquedaCentroAyuda(Actor actor, String busqueda){
        actor.attemptsTo(
                BuscarCentroAyuda.busqueda(busqueda)
        );
    }

    @Entonces("{actor} debe encontrar el resultado {string}")
    public void encontrarResultadoBusqueda(Actor actor, String busqueda) {
        actor.attemptsTo(
                Scroll.to(ResultadosCentroAyudaPage.resultadoBusqueda(busqueda)),
                Ensure.that(Text.of(ResultadosCentroAyudaPage.resultadoBusqueda(busqueda)))
                        .asAString().isEqualTo(busqueda)
        );
    }
}
