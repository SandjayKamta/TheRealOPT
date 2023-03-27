import java.util.ArrayList;
import java.util.Scanner;

class Scheepsbouwer{
    ArrayList<String> klanttypes = new ArrayList<String>();
    public static void selecteerKlantType(){

    }

}

class Klantgegevens {

}

class Offerteberekenig{

}
class Offerte{

}




public class TestClass {
    //particulier
    //bedrijf
    //overheden
    public static void main(String[] args) {
        System.out.println("Toets het getal dat hoort bij uw type bestelling.");
        System.out.println("particulier: 1");
        System.out.println("bedrijf: 2");
        System.out.println("overheden:3");

        //Scanner voor de input van de klanten zodat .
        Scanner Userinput = new Scanner(System.in);
        int getal1 = Userinput.nextInt();

        //Object van Scheepsbouwer.
        Scheepsbouwer leeftijd = new Scheepsbouwer();

        leeftijd.klanttypes.add(String.valueOf(getal1));







        System.out.print(leeftijd.klanttypes.get(0));
    }
}