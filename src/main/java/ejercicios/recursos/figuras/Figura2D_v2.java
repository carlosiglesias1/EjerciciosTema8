package ejercicios.recursos.figuras;

public class Figura2D_v2 {
    private float ancho;
    private float alto;

    public Figura2D_v2 (float alto, float ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }
    
    public float getAncho() {
        return ancho;
    }

    public String verDim (){
        return String.format("alto = %.2f %nancho = %.2f", alto, ancho);
    }
}
