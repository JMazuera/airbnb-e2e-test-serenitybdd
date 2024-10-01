package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.DetallesIdiomaMonedaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CambiarMoneda {
    public static Performable a(String moneda) {
        return Task.where("seleccionar moneda", actor -> {
            actor.attemptsTo(
                    Click.on(AirBnbHomePage.BOTON_IDIOMA),
                    Click.on(DetallesIdiomaMonedaPage.BOTON_SECCION_MONEDA),
                    Scroll.to(DetallesIdiomaMonedaPage.BOTON_MONEDA),
                    Click.on(DetallesIdiomaMonedaPage.BOTON_MONEDA)
            );
        });
    }
}
