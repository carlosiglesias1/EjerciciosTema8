package recursos.figuras;

public class Triangulo_v8 extends Figura2D_v8 {
    private String estilo;

    public Triangulo_v8 (float alto, float ancho, String estilo){
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

    public Triangulo_v8 (float baseAltura){
        super(baseAltura);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v8 (Triangulo_v7 tV7){
        super(tV7);
        this.estilo = tV7.verEstilo();
    }

    public Triangulo_v8(){
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
