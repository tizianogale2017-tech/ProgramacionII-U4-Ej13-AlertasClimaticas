package Ejercicio13_AlertasClimaticas;

public class AlertaViento extends AlertaClimatica {
    public AlertaViento(String zona) {
        super(zona);
    }

    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        String nivel = clasificar(magnitudMedida, 40, 70, 100);
        System.out.printf("[Viento zonda - %s] %.0f km/h -> alerta %s%n", getZona(), magnitudMedida, nivel);
    }
}
