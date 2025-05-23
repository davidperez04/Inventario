import java.util.Arrays;
import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float [] notas = new float[5];
        int fin = notas.length;

        System.out.println("por favor digite sus 5 notas ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingresa la nota "+(i+1));
            notas[i]= scanner.nextFloat();
        }

        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        System.out.println("la suma de las notas es : "+Sumar(notas));
        float promedio = Sumar(notas)/fin;
        System.out.println("El promedio de las notas es : "+promedio);
        Operacion.NotaMax(notas);
        Operacion.NotaMinima(notas);
        scanner.close();
    
    }

    //mètodos.
    public static float Sumar(float[] array){
        float suma = 0;
        for (float f : array) {
            suma+=f;
        }
        return suma;
        
    }

}
