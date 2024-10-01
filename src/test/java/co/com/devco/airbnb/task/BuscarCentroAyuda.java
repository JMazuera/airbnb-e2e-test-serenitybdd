package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.CentroAyudaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuscarCentroAyuda {
    public static Performable busqueda(String busqueda) {
        return Task.where("Ingresa la pregunta y busca",
                Enter.theValue(busqueda).into(CentroAyudaPage.BARRA_BUSQUEDA),
                Click.on(CentroAyudaPage.BOTON_BUSQUEDA)
        );
    }
}
