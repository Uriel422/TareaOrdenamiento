import java.util.Scanner;
public class BurbujaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aux = 0;
        //Tamaño del arreglo
        System.out.println("Dame la cantidad de elementos");
        int N = scanner.nextInt();
        int [] Numeros = new int [N];
        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Dame un número");
            Numeros [i] = scanner.nextInt();
        }
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print(Numeros[i] + " ");
        };
        System.out.println();
        for (int i = 0; i < Numeros.length; i++) {
            for (int j = i+1; j < Numeros.length; j++) {
                if (Numeros[j] < Numeros[i]){
                    aux = Numeros[i];
                    Numeros [i] = Numeros [j];
                    Numeros [j] = aux;
                }
            }

        }
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print(Numeros[i] + " ");
        }
        System.out.println();
        espera();
        //Ordenamiento
    }

    private static void espera() {
        Scanner scanner = new Scanner (System.in);
        String espera = scanner.nextLine();
    }

}
