import java.util.Scanner;
public class RendimientoDeEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] nombres = new String[5];
        int [][] produccion = new int[5][3];

        System.out.println("========PRODUCCION SEMANAL EN LA FÁBRICA========");
        System.out.println("hola! Por favor ingresa el nombre de cada uno de los operarios de tu fábrica :");
         int fin = nombres.length;
        for (int i = 0; i < fin; i++) {
            System.out.println("-ingresa el nombre del operario "+(i+1)+" :");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Acontinuacion debera ingresar la produccion de cada operario en cada uno de sus turnos : ");
        for (int i = 0; i < 5; i++) {
            System.out.println("-ingreso de datos para el operario "+(i+1));
            for (int j = 0; j < 3 ; j++) {
               switch (j) {
                case 0:
                    System.out.println("-produccion en la mañana: ");
                    produccion[i][j]= scanner.nextInt();
                    break;

                case 1:
                    System.out.println("-produccion en la tarde: ");
                    produccion[i][j]= scanner.nextInt();
                    break;

                case 2:
                    System.out.println("-produccion en la noched: ");
                    produccion[i][j]= scanner.nextInt();
                    break;

                default:
                    break;
               }
            }
        }
          int [] totalOperario = new int[5];
          TotalProductosPorOperarios(produccion, totalOperario);
          System.out.println("El total de productos por operario es :");
          for (int i = 0; i < totalOperario.length; i++) {
            System.out.println("-operario "+(i+1)+" : "+totalOperario[i]);
          }
          System.out.println("El operario que mas produjo en total fue el operario : "+OperarioDeMayorProduccion(totalOperario));
          scanner.close();
    }

    //métodos

    public static void TotalProductosPorOperarios(int[][] produccion, int[] totalOperario){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                totalOperario[i] += produccion[i][j];
            }
        }
    }

    public static int OperarioDeMayorProduccion(int[] totalOperario){
        int produccionMaxima = 0;
        int indice = 0;
        for (int i = 0; i < totalOperario.length; i++) {
            if(totalOperario[i]> produccionMaxima){
                produccionMaxima = totalOperario[i];
                indice = i;
            }
        }
        return indice;
    }
   

}
