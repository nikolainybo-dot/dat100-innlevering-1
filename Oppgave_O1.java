//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Oppgave_O1 {
    public static void main(String[] args) {

        double trinn1 = 0.017;
        double trinn2 = 0.04;
        double trinn3 = 0.137;
        double trinn4 = 0.168;
        double trinn5 = 0.178;

        double grense1 = 226101;
        double grense2 = 318301;
        double grense3 = 725051;
        double grense4 = 980101;
        double grense5 = 1467201;

        double heleTrinn1 = (grense2 - grense1) * trinn1;
        double heleTrinn2 = (grense3 - grense2) * trinn2;
        double heleTrinn3 = (grense4 - grense3) * trinn3;
        double heleTrinn4 = (grense5 - grense4) * trinn4;

        double skatt = 0;

        int trinnTeller = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn inntekt: ");

        double inntekt = scanner.nextInt();



        if (inntekt >= grense5) {
            skatt = (inntekt - grense5) * trinn5;
            skatt = skatt + heleTrinn1 + heleTrinn2 + heleTrinn3 + heleTrinn4;
            trinnTeller = 5;
        }
        else if (inntekt >= grense4){
            skatt = (inntekt - grense4) * trinn4;
            skatt = skatt + heleTrinn1 + heleTrinn2 + heleTrinn3;
            trinnTeller = 4;
        }
        else if (inntekt >= grense3){
            skatt = (inntekt - grense3) * trinn3;
            skatt = skatt + heleTrinn1 + heleTrinn2;
            trinnTeller = 3;
        }
        else if (inntekt >= grense2){
            skatt = (inntekt - grense2) * trinn2;
            skatt = skatt + heleTrinn1;
            trinnTeller = 2;
        }
        else if (inntekt >= grense1){
            skatt = (inntekt - grense1) * trinn1;
            trinnTeller = 1;
        }


        if (trinnTeller >= 1){
            System.out.println("Skatt: " + skatt + "Kr");
            System.out.println(("Skattetrinn: " + trinnTeller));
        }
        else{
            System.out.println("Ingen skatt.");
        }

    }
}