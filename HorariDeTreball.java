import java.util.Scanner;

public class HorariDeTreball {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu l'horari d'entrada");
        int hora = sc.nextInt();
        sc.close();
        
        if (hora >= 0 && hora <= 23){
            if (hora >= 9 && hora <= 17){
                System.out.println("Treball");
            }
            else{
                System.out.println("Temps lliure");
            }
        }else{
            System.out.println("Error no has introduit l'hora be");
        }
    }
}

