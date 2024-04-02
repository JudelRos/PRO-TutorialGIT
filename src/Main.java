import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, mundo!");
        System.out.println("¿Cual es tu nombre?");
        String numUsuario = scanner.nextLine();
        System.out.println(numUsuario);
    }
}
