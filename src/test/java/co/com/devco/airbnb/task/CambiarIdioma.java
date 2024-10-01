package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.DetallesIdiomaMonedaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CambiarIdioma {
    public static Performable a(String idioma) {
        return Task.where("seleccionar idioma", actor -> {
            actor.attemptsTo(
                    Click.on(AirBnbHomePage.BOTON_IDIOMA),
                    Scroll.to(DetallesIdiomaMonedaPage.BOTON_IDIOMA.of(idioma)),
                    Click.on(DetallesIdiomaMonedaPage.BOTON_IDIOMA.of(idioma))
            );
        });
    }
}
