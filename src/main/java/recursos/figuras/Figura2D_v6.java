package recursos.figuras;

public class Figura2D_v6 {
    private float ancho;
    private float alto;

    public Figura2D_v6(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Figura2D_v6(float altoYAncho) {
        this.alto = altoYAncho;
        this.ancho = altoYAncho;
    }

    public Figura2D_v6 (){
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
