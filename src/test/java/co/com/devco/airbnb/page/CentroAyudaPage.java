package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class CentroAyudaPage {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda en centro de ayuda").locatedBy("//input[@data-testid=\"search-input\"]");
    public static Target BOTON_BUSQUEDA = Target.the("boton para realizr la busqueda").locatedBy("//button[@data-testid=\"search-submit-button\"]");
}
