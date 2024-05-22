public class Circulo extends Figura{
    private double raio;

    public Circulo (double raio, String cor) {
        this.raio = raio;
        super (cor);
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public double area() {

    }
    public double getDiametro() {
        return raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
