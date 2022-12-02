import java.util.Scanner;
public class T3Ej1 {
    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        int[] nums = new int[5];
        int arrayPos = 0;
        int numAnalysis;
        while(arrayPos <= 4) {
            System.out.print("Introduzca un número PAR: ");
            numAnalysis = into.nextInt();
            boolean test = isEven(numAnalysis);
            if (test == true) {
                addToArray(arrayPos, numAnalysis, nums);
                if (arrayPos != 4) {
                    arrayPos++;
                }
            } else {
                System.out.println("Este programa sólo reconoce números pares. Por favor, introduzca un número PAR.");
            }
        }
    }
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void addToArray(int arrayPos, int num, int[] numArray) {
        if(arrayPos < 0) {
            System.out.println("ERROR DESCONOCIDO");
            System.exit(1);
        } else if(arrayPos >= 0 && arrayPos <= 4) {
            numArray[arrayPos] = num;
            System.out.println("Número introducido: " + num);
            if(arrayPos == 4) {
                System.out.println("Fin del programa");
                System.exit(0);
            }
        } else if(arrayPos > 4) {
            System.out.println("ERROR: ÍNDICE DE ARRAY FUERA DE LÍMITES");
            System.exit(1);
        }
    }
}
