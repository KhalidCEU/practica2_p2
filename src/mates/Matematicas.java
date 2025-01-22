package mates;

public class Matematicas {
    /**
     * Genera una aproximacion del número PI usando el metodo Monte-Carlo
     *
     * @param pasos el numero de puntos que generamos. Define el numero de
     *  iteraciones que se realizaran.
     *
     * @return La aproximacion del numero PI obtenida
     */
    public static double generarNumeroPiIterativo(long pasos) {
        double x = 0;
        double y = 0;
        long puntosDentro = 0;
        double numeroPi = 0;

        for (int i = 0; i < pasos; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1) {
                puntosDentro++;
            }
        }
        numeroPi = 4.0 * puntosDentro / pasos;

        return numeroPi;
    }
}
