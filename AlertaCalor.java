package Ejercicio13_AlertasClimaticas;

public class AlertaCalor extends AlertaClimatica {
    public AlertaCalor(String zona) {
        super(zona);
    }

    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        String nivel = clasificar(magnitudMedida, 35, 38, 41);
        System.out.printf("[Ola de calor - %s] %.1f °C -> alerta %s%n", getZona(), magnitudMedida, nivel);
    }
}
