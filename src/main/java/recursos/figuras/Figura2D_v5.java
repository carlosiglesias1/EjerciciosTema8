package recursos.figuras;

/**
 * • Añade un constructor más a la clase Figura2D, a este se le pasa solo un
 * parámetro que se le asigna tanto al alto como al ancho (figura igual alto que
 * ancho).• Hacer el constructor sin parámetros (ya no se crea por defecto) en
 * este caso tanto alto como ancho igual a cero.
 */

public class Figura2D_v5 {
    private float ancho;
    private float alto;

    public Figura2D_v5(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Figura2D_v5(float altoYAncho) {
        this.alto = altoYAncho;
        this.ancho = altoYAncho;
    }

    public Figura2D_v5 (){
        this.alto = this.ancho = 0;
    }

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    public String verDim() {
        return String.format("alto = %.2f %nancho = %.2f", alto, ancho);
    }
}
