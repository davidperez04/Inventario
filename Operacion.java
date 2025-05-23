public class Operacion {

     public static float Sumar(float[] array){
        float suma = 0;
        for (float f : array) {
            suma+=f;
        }
        return suma;
        
    }
    public static void NotaMax(float[] array){
        float notaMaxima = -1 ;
        for (float f : array) {
            if (f > notaMaxima){
                notaMaxima = f;
            }
        }
        System.out.println("la nota màxima es : "+notaMaxima);
    }

     public static void NotaMinima(float[] array){
        float notaMinima = 11;
        for (float f : array) {
            if(f < notaMinima){
                notaMinima = f;
            }
        }

        System.out.println("la nota mìnima es : "+notaMinima);
    }
}
