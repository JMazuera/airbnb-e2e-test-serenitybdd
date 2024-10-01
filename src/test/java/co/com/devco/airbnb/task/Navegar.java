package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Navegar {
    public static Performable haciaCentroAyuda() {
        return Task.where("navega hacia el centro de ayuda",
                Scroll.to(AirBnbHomePage.BOTON_CENTRO_AYUDA),
                Click.on(AirBnbHomePage.BOTON_CENTRO_AYUDA)
        );
    }
}
