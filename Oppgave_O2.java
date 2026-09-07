import java.util.Scanner;

public class Oppgave_O2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        for (int i = 1; i < 11; i ++){

            System.out.print("Skriv inn poengsum for elev " + i + ": ");
            int poeng = scanner.nextInt();

            while (poeng > 100 || poeng < 0){
                System.out.println("Ugyldig poengsum.");
                System.out.print("Skriv inn poengsum for elev " + i + ": ");
                poeng = scanner.nextInt();
            }

            if (poeng > 89){
                System.out.println("Eleven fikk karakteren A.");

            }
            else if (poeng > 79){
                System.out.println("Eleven fikk karakteren B.");
            }
            else if (poeng > 59){
                System.out.println("Eleven fikk karakteren C.");
            }
            else if (poeng > 49){
                System.out.println("Eleven fikk karakteren D.");
            }
            else if (poeng > 39){
                System.out.println("Eleven fikk karakteren E.");
            }
            else{
                System.out.println("Eleven fikk karakteren F.");
            }

        }

    }

}
