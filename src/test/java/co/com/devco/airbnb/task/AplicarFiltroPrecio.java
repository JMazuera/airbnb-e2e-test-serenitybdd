package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.DetalleFiltrosOpcionesPage;
import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class AplicarFiltroPrecio {

    public static Performable conRango(String precioMinimo, String precioMaximo) {
        return Task.where("ver el detalle del elemento'", actor -> {
            actor.attemptsTo(
                    Click.on(ResultadosEstadiaPage.FILTROS_BOTON_OPCIONES),
                    Scroll.to(DetalleFiltrosOpcionesPage.SECCION_RANGO_PRECIOS),
                    Enter.theValue(precioMinimo).into(DetalleFiltrosOpcionesPage.PRECIO_MINIMO_INPUT),
                    Enter.theValue(precioMaximo).into(DetalleFiltrosOpcionesPage.PRECIO_MAXIMO_INPUT)
            );
        });

    }
}
