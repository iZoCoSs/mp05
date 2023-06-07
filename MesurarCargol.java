import java.util.Scanner;

public class MesurarCargol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriu la mesurar del cargol:");
        String mesura = sc.nextLine();

        switch(mesura){
            case "1":
            case "2":
                System.out.println("Petit");
                break;
            case "3":
            case "4":
                System.out.println("Mitja");
                break;
            case "5":
            case "6":
            case "7":
                System.out.println("Gran");
                break;
            case "8":
            case "9":
            case "10":
                System.out.println("Molt Gran");
                break;
            default:
                System.out.println("La mida del cargol és incorrecta");
        }

    sc.close();
    }
}
