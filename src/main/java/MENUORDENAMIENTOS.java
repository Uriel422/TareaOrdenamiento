import java.util.Scanner;
public class MENUORDENAMIENTOS {
    public static void main(String[] args) {
        int op = -1;
        Scanner scanner = new Scanner (System.in);
        while (op != 0){
            System.out.println("===================");
            System.out.println("        Menú       ");
            System.out.println("===================");
            System.out.println("1. Ordenar Números");
            System.out.println("2. Ordenar Cadenas");
            System.out.println("0. Salir");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    BurbujaNumeros.main(null);
                    break;
                case 2:
                    BurbujaCadenas.main(null);
                    break;
                case 0:
                    break;
            }
        }
    }
}
