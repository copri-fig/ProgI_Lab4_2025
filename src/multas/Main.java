package multas;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int idConductor = 0;
        String nombre = "";
        int tipoVia = 0;
        double velocidadRegistrada = 0;
        boolean read = true;

        //Creación del bufferedreader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Obtener el nombre del conductor
        do{
            try{
                System.out.println("Ingrese el nombre: ");
                nombre = br.readLine();
                read = true;
            }catch(IOException e){
                System.out.println(e.getMessage());
                read = false;
            }
        }while(!read);

        //Obtener el nombre del ID del conductor
        do{
            try{
                System.out.println("Ingrese la identificacion del conductor: ");
                idConductor = Integer.parseInt(br.readLine());
                read = true;
            }catch(NumberFormatException e){
                System.out.println("Error al ingresar el identificacion del conductor. Vuelva a intentarlo.");
                read = false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while(!read);

        //Obtener la velocidad registrada
        do {
            try {
                System.out.println("Ingrese la velocidad registrada: ");
                velocidadRegistrada = Double.parseDouble(br.readLine());
                read = true;

                if(velocidadRegistrada < 0){ //Condición para que la velocidad no sea negativa
                    System.out.println("La velocidad registrada no puede ser negativo.");
                    read = false;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                System.out.println("Error al ingresar el velocidad registrada. Vuelva a intentarlo.");
                read = false;
            }
        }while(!read);

        //Obtener el tipo de vía
        do {
            try {
                System.out.println("Ingrese el tipo de via: ");
                System.out.print("1 == Residencial \n2 == Escolar \n3 == Autopista \n");
                tipoVia = Integer.parseInt(br.readLine());

                if(tipoVia > 3 || tipoVia < 1){ //Condición para que el tipo de via sea del 1 al 3
                    System.out.println("Opcion no valida. Escoja un numero del 1 al 3 ");
                    read = false;
                }

                read = true;

            }catch (IOException e){
                throw new RuntimeException(e);
            }catch (NumberFormatException e) {
                System.out.println("Error. El valor no es valido, vuelva a intentarlo.");
                read = false;
            }
        }while(!read);

        //Objeto de la clase Conductor
        Conductor conductor = new Conductor(velocidadRegistrada, idConductor, nombre, tipoVia);

        conductor.imprimirMulta();

    }
}
