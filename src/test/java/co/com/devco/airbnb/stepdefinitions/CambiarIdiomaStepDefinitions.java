package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.task.CambiarIdioma;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class CambiarIdiomaStepDefinitions {
    @Dado("que {actor} quiera cambiar el idioma de la pagina")
    public void abrirPaginaAirbnb(Actor actor){
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class)
        );
    }

    @Cuando("{actor} seleccione {string}")
    public void seleccionarIdioma(Actor actor, String idioma){
        actor.attemptsTo(
                CambiarIdioma.a(idioma)
        );
    }

    @Entonces("{actor} visualiza la pagina en {string}")
    public void verificarIdioma(Actor actor, String idioma) {
        String expected = "";
        switch (idioma) {
            case "Español":
                expected = "Alojamientos";
                break;
            case "English":
                expected = "Stays";
                break;
            case "Italiano":
                expected = "Soggiorni";
                break;
        }

        actor.attemptsTo(
                Ensure.that(Text.of(AirBnbHomePage.TEXTO_IDIOMA)).asAString().isEqualTo(expected)
        );
    }
}
