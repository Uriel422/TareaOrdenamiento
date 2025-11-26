import java.util.Scanner;

public class BurbujaCadenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de palabras: ");
        int n = sc.nextInt();
        sc.nextLine();

        char[][] Arr = new char[n][];
        char[] aux;

        // Captura
        for (int i = 0; i < Arr.length; i++) {
            System.out.print("Palabra " + (i+1) + ": ");
            Arr[i] = sc.nextLine().toCharArray();
        }

        // original
        System.out.println("\nPalabras originales:");
        for (char[] palabra : Arr) {
            System.out.println(String.valueOf(palabra));
        }

        for (int i = 0; i < Arr.length; i++) {
            for (int y = i + 1; y < Arr.length; y++) {
                if (comparar(Arr[y], Arr[i]) < 0) {
                    aux = Arr[i];
                    Arr[i] = Arr[y];
                    Arr[y] = aux;
                }
            }
        }

        // ordenada
        System.out.println("\nPalabras ordenadas:");
        for (char[] palabra : Arr) {
            System.out.println(String.valueOf(palabra));
        }
        espera();
    }

    public static int comparar(char[] a, char[] b) {
        int min = Math.min(a.length, b.length);

        for (int i = 0; i < min; i++) {
            if (a[i] != b[i]) {
                return a[i] - b[i];
            }
        }
        return a.length - b.length;
    }
    public static void espera() {
        Scanner scanner = new Scanner (System.in);
        String espera = scanner.nextLine();
        scanner.nextLine();
    }
}
