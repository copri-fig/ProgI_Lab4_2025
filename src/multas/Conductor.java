package multas;

public class Conductor {
    double velocidadRegistrada;
    double multa;
    int idConductor;
    String nombre;
    int tipoVia;
    String nombreVia;


    public Conductor(double velocidadRegistrada, int idConductor, String nombre, int tipoVia) {
        this.velocidadRegistrada = velocidadRegistrada;
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.tipoVia = tipoVia;
    }

    //Calcula la multa segun el tipo de via en la que se cometió la infracción
    public double calcularMulta(){
        switch (tipoVia){
            case 1: //Residencial
                multa = (velocidadRegistrada - 40) * 5;
                break;
            case 2: //Escolar
                multa = (velocidadRegistrada - 25) * 10;
                break;
            case 3: //Autopista
                multa = (velocidadRegistrada - 100) * 2;
                break;
            default:
                multa = 0;
                break;
        }
        return multa;
    }

    public void imprimirMulta(){
        switch (tipoVia) {
            case 1:
                nombreVia = "Residencial";
                break;
            case 2:
                nombreVia = "Escolar";
                break;
            case 3:
                nombreVia = "Autopista";
                break;
            default:
                nombreVia = "Desconocido";
                break;
        }
            System.out.println("==================== Información de conductor ====================");
            System.out.println("Identificación: " + idConductor);
            System.out.println("Nombre: " + nombre);
            System.out.println("Velocidad Registrada: " + velocidadRegistrada + "km/h");
            System.out.println("Tipo de vía: " + nombreVia);

        if (calcularMulta() > 0) {
            System.out.println("==================== Resultado de la infracción ==================");
            System.out.println("Total a pagar: $" + calcularMulta());

        }else{
            System.out.println("==================== Resultado de la infracción ==================");
            System.out.println("El conductor no excedió el limite de velocidad. ");

        }
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

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(int tipoVia) {
        this.tipoVia = tipoVia;
    }
}
