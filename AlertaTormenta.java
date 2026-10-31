package Ejercicio13_AlertasClimaticas;

public class AlertaTormenta extends AlertaClimatica {
    public AlertaTormenta(String zona) {
        super(zona);
    }

    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        String nivel = clasificar(magnitudMedida, 10, 30, 60);
        System.out.printf("[Tormenta - %s] %.0f descargas/min -> alerta %s%n", getZona(), magnitudMedida, nivel);
    }
}
