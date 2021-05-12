package recursos.figuras;

public class Triangulo_v6 extends Figura2D_v6{
    private String estilo;

    public Triangulo_v6 (float alto, float ancho, String estilo){
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

    public Triangulo_v6 (float baseAltura){
        super(baseAltura);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v6(){
        super();
        this.estilo = null;
    }

    public float area (){
        return (getAlto()*getAncho())/2;
    }

    public String verEstilo (){
        return this.estilo;
    }
}
