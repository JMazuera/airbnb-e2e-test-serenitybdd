package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesIdiomaMonedaPage {
    public static Target BOTON_IDIOMA = Target.the("boton para seleccionar el idioma").locatedBy("//div[@id=\"panel--language_region_and_currency--0\"]/section//ul/li/a/div[text()='{0}']");
    public static Target BOTON_SECCION_MONEDA = Target.the("boton para abrir la sección de monedas").locatedBy("//button[@id=\"tab--language_region_and_currency--1\"]");
    public static Target BOTON_MONEDA = Target.the("boton para abrir la sección de monedas").locatedBy("//div[@id=\"panel--language_region_and_currency--1\"]//button/div[text()='{0}']");
}
