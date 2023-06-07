import java.util.Scanner;

public class DibuixaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Escriu un numero per l'altura de la piramide: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i=1;i<=altura;i++){
            for(int espacios = 1; espacios <= altura-i; espacios++){
                System.out.print(" ");

            }
            for(int asteris = 1; asteris <= (i*2)-1; asteris++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
