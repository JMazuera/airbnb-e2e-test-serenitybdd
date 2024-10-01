package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleFiltrosOpcionesPage {
    public static Target PRECIO_MINIMO_INPUT = Target.the("input de precio minimo").locatedBy("//input[@id='price_filter_min']");
    public static Target PRECIO_MAXIMO_INPUT = Target.the("input de precio minimo").locatedBy("//input[@id='price_filter_max']");
    public static Target SECCION_RANGO_PRECIOS = Target.the("seccion del rango de precios").locatedBy("//h2[@id='filter-section-heading-id-FILTER_SECTION_CONTAINER:PRICE_RANGE']");
    public static Target MOSTRAR_LUGARES_BOT = Target.the("boton para realizar el filtrado").locatedBy("//footer/button/..//a");
}
