package multas;

public class Residencial {
    double velocidadRegistrada;
    double multa;

    Residencial(double velocidadRegistrada){
        this.velocidadRegistrada = velocidadRegistrada;
    }

    double calcularMulta(){
            multa = (velocidadRegistrada * 5);
        return multa;
    }

    public double getVelocidadRegistrada() {
        return velocidadRegistrada;
    }

    public void setVelocidadRegistrada(double velocidadRegistrada) {
        this.velocidadRegistrada = velocidadRegistrada;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}
