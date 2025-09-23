import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Colaborador extends NumRandom {
    public static void main (String[] args) {
        Colaborador colaborador = new Colaborador();

        colaborador.generaryGuardarNumeros();
    }

    public void generaryGuardarNumeros(){

        //Generamos el fichero de texto
        try(BufferedWriter bufwrite = new BufferedWriter(new FileWriter("numeros.txt"))){
           //Repetimos 10 veces la iteración
            for (int i = 1; i <= 10; i++) {
                List<Integer> numeros = generarNumeros();

                //Creamos el bucle para generar los números
                for(Integer numero : numeros){
                    bufwrite.write(numero.toString());
                    bufwrite.write(" ");
                }
                bufwrite.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
