package recursos.figuras;

/**
 * • Añade a la clase Triangulo también un constructor sin parámetros, que
 * invoque al constructor sin parámetros de la clase base (aunque se hace por
 * defecto) y que ponga el estilo a null. • Añade otro constructor a la clase
 * Triangulo, con un solo parámetro, para aquellos que tienen igual alto que
 * ancho (en este caso el estilo será ‘igualBaseAltura’).
 */
public class Triangulo_v5 extends Figura2D_v5 {
    private String estilo;

    public Triangulo_v5 (float alto, float ancho, String estilo){
        super(alto, ancho);
        switch (estilo){
            case "equilátero":
            case "rectángulo":
            case "isósceles":
            case "escaleno":
                this.estilo = estilo;
                break;
            default: this.estilo = null;
        }
    }

    public Triangulo_v5 (float baseAltura){
        super(baseAltura);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v5 (){
        super();
        this.estilo = null;
    }

    public float area (){
        return getAlto()*getAncho();
    }

    public String verEstilo (){
        return this.estilo;
    }
}
