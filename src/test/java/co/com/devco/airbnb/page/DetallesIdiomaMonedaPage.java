package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesIdiomaMonedaPage {
    public static Target BOTON_IDIOMA = Target.the("boton para seleccionar el idioma").locatedBy("//div[@id=\"panel--language_region_and_currency--0\"]/section//ul/li/a/div[text()='{0}']");
}
