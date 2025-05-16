package multas;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int idConductor;
        String nombre;
        int tipoVia;
        double velocidadRegistrada;
        boolean read = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

        do {
            try {
                System.out.println("Ingrese la velocidad registrada: ");
                velocidadRegistrada = Double.parseDouble(br.readLine());
                read = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                System.out.println("Error al ingresar el velocidad registrada. Vuelva a intentarlo.");
                read = false;
            }
        }while(!read);

        do {
            try {
                System.out.println("Ingrese el tipo de via: ");
                System.out.print("1 == Residencial \n 2 == Escolar \n 3 == Autopista \n");
                tipoVia = Integer.parseInt(br.readLine());

                while(tipoVia > 3 || tipoVia < 1){
                    System.out.println("Opcion no valida. Escoja un numero del 1 al 3 ");
                    System.out.println("Ingrese el tipo de via: ");
                    System.out.print("1 == Residencial \n 2 == Escolar \n 3 == Autopista \n");
                    tipoVia = Integer.parseInt(br.readLine());
                }

                read = true;

            }catch (IOException e){
                throw new RuntimeException(e);
            }catch (NumberFormatException e) {
                System.out.println("Error. El valor no es valido, vuelva a intentarlo.");
                read = false;
            }
        }while(!read);

        switch (tipoVia){
            case 1:
                Residencial residencial = new Residencial(velocidadRegistrada);
        }


    }
}
