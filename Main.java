package Ejercicio13_AlertasClimaticas;

public class Main {
    public static void main(String[] args) {
        SistemaMonitoreo sistema = new SistemaMonitoreo();
        AlertaClimatica[] alertas = {
            new AlertaTormenta("Gran Mendoza"),
            new AlertaCalor("Este mendocino"),
            new AlertaViento("Valle de Uco")
        };
        double[][] mediciones = {{5, 35, 75}, {34, 39.5, 42}, {30, 85, 120}};

        for (int i = 0; i < alertas.length; i++) {
            for (double medicion : mediciones[i]) {
                sistema.disparar(alertas[i], medicion);
            }
        }
    }
}
