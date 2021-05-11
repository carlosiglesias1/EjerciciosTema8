package recursos.figuras;

public class Triangulo_v2 extends Figura2D_v2{
    private String estilo;

    public Triangulo_v2 (float alto, float ancho, String estilo){
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
        return getAlto()*getAncho();
    }

    public String verEstilo (){
        return this.estilo;
    }
}
