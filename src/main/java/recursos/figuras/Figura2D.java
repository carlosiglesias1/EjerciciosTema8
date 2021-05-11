package recursos.figuras;

/**
 * • Crea una clase llamada Figura2D con atributos numéricos con decimales y
 * públicos: ancho y alto y un método verDim que muestre por consola el alto y
 * el ancho en una sola línea, con dos decimales.
 */

public class Figura2D {
    public float ancho;
    public float alto;

    public Figura2D (float alto, float ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public String verDim (){
        return String.format("alto = %.2f %nancho = %.2f", alto, ancho);
    }
}
