import java.util.Scanner;

public class Oppgave_O3 {
    public static void main(String[] args) {

        int resultat = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn tall: ");
        int n = scanner.nextInt();

        while(n <= 0){
            System.out.println("Ugyldig tall");
            System.out.println(("Skriv inn tall: "));
            n = scanner.nextInt();
        }

        System.out.print(n + "! = ");

        for (int i = 1; i <= n; i++){
            resultat = resultat * i;
            if(i < n){
                System.out.print(i + " * ");
            }
            else{
                System.out.print(i + " = ");
            }
        }
        System.out.print(resultat);



    }
}
