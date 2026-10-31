package Ejercicio13_AlertasClimaticas;

public class SistemaMonitoreo {
    public void disparar(AlertaClimatica alerta, double medicion) {
        alerta.emitirAdvertencia(medicion);
    }
}
