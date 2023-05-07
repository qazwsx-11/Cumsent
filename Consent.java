import java.util.Scanner;

public class Consent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Consent?");
        String consentString = input.nextLine();
        boolean consent;
        if (consentString.equalsIgnoreCase("yes")) {
            consent = true;
        } else {
            consent = false;
        }
        if (consent) {
            haveSex();
        } else {
            rape();
        }
    }
    public static void haveSex() {
        System.out.println("cums in you");
    }
    public static void rape() {
        System.out.println("Rapes you because you didnt give consent >:(");
    }
}
