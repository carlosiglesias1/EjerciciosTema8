package ejercicios.recursos.figuras;

/**
 * • Define una clase llamada Triángulo que es hija de Figura2D y añádele una
 * cadena llamada estilo (vale: isósceles, rectángulo, equilátero, etc.), un
 * método llamado área que devuelva la superficie del triángulo y un último
 * método llamado verEstilo que muestre por consola el valor del atributo
 * estilo.
 */
public class Triangulo extends Figura2D {
    public String estilo;

    public Triangulo (float alto, float ancho, String estilo){
        super(alto, ancho);
        switch (estilo){
            case "equilátero":
            case "rectángulo":
            case "isósceles":
            case "escaleno":
                this.estilo = estilo;
                break;
            default: this.estilo = "unknown";
        }
    }

    public float area (){
        return this.alto*this.ancho;
    }

    public String verEstilo (){
        return this.estilo;
    }
}
