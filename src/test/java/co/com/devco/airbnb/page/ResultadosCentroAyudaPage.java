package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosCentroAyudaPage {
    public static Target resultadoBusqueda(String texto) {
        return Target.the("match con el primer resultado de busqueda")
                .locatedBy("//a[contains(text(),'" + texto + "')]");
    }}