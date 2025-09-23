import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.*;


public class NumRandom {
    public static void main(String[] args) {
        //Creamos una instancia para usar los métodos de esta clase

        NumRandom numRandom = new NumRandom();

        //Generamos 35 numeros aleatorios

        List<Integer> numeros = numRandom.generarNumeros();

        //Mostramos los números por la salida estándar
        System.out.println("Numeros de la lista: " + numeros);
    }

    //Definimos los métodos que vamos a usar
    public List<Integer> generarNumeros(){
        //Instanciamos un generador de números aleatorios
        Random random = new Random();

        //Creamos la lista donde almacenaremos los números aleatorios
        List<Integer> numeros = new ArrayList<>();

        //Bucle para generar números aleatorios
        for(int i = 0; i < 35; i++){
            int numero = random.nextInt(100);
            numeros.add(numero);
        }
        return numeros;
    }

    public void mostrarNumeros(List<Integer> numeros){
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        System.out.println();
    }

}
