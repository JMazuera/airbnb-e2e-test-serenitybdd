package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.task.CambiarMoneda;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class CambiarMonedaStepDefinitions {

    @Dado("que {actor} quiera cambiar la moneda de la pagina")
    public void abrirPagina (Actor actor){
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class)
        );
    }

    @Cuando("{actor} seleccione la {string}")
    public void cambiarMoneda (Actor actor, String moneda){
        actor.attemptsTo(
                CambiarMoneda.a(moneda)
        );
    }

    @Entonces("{actor} visualiza la pagina con la {string}")
    public void comprobarMoneda (Actor actor, String moneda){
        String expected = "";
        switch (moneda) {
            case "Peso colombiano":
                expected = "COP";
                break;
            case "Franco suizo":
                expected = "CHF";
                break;
            case "Dólar estadounidense":
                expected = "USD";
                break;
        }

        actor.attemptsTo(
                Scroll.to(AirBnbHomePage.TEXTO_MONEDA),
                Ensure.that(Text.of(AirBnbHomePage.TEXTO_MONEDA)).asAString().isEqualTo(expected)
        );
    }
}
