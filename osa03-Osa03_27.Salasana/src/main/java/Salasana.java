import java.util.Scanner;
 
public class Salasana {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana";
 
        while (true) {
            System.out.print("Anna salasana: ");
            String luettuSalasana = lukija.nextLine();
 
            if (luettuSalasana.equals(salasana)) {
                break;
            }
 
            System.out.println("Väärin!");
        }
 
        System.out.println("Oikein! \n");
        System.out.println("Salaisuus on: znvavbfgv grugl!");
    }
}