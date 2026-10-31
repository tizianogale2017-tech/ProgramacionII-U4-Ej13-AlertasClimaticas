package Ejercicio13_AlertasClimaticas;

public abstract class AlertaClimatica {
    private final String zona;

    protected AlertaClimatica(String zona) {
        if (zona == null || zona.isBlank()) {
            throw new IllegalArgumentException("La zona es obligatoria");
        }
        this.zona = zona;
    }

    public abstract void emitirAdvertencia(double magnitudMedida);

    protected String clasificar(double valor, double umbralAmarillo, double umbralNaranja, double umbralRojo) {
        if (valor >= umbralRojo) return "ROJA";
        if (valor >= umbralNaranja) return "NARANJA";
        if (valor >= umbralAmarillo) return "AMARILLA";
        return "SIN ALERTA";
    }

    public String getZona() { return zona; }
}
