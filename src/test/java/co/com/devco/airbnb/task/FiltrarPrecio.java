package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.DetalleFiltrosOpcionesPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FiltrarPrecio {
    public static Performable buscarPrecio() {
        return Task.where("filtrar por precio '",
                Click.on(DetalleFiltrosOpcionesPage.MOSTRAR_LUGARES_BOT)
        );
    }
}
