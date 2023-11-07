import java.util.Scanner;

public class iseseisev7 {

    //alamprogramm sõna kontrollimiseks
    public static boolean palindroom(String sona) {
        int pikkus = sona.length();
        boolean palindroom = true;
        for (int i = 0; i < pikkus / 2; i++) {
            if (sona.charAt(i) != sona.charAt(pikkus - 1 - i)) {
                palindroom = false;
                break;
            }
        }
        return palindroom;
    }
    //peamine programm
    public static void main(String[] args) {
        try {
            //kasutaja poolt sõna sisestamine
            Scanner scanner = new Scanner(System.in);
            System.out.print("sisesta sona: ");
            String sona = scanner.nextLine();
            scanner.close();
            boolean palindroom = palindroom(sona);
            //vastus
            if (palindroom) {
                System.out.println("See on palindroom");
            } else {
                System.out.println("see pole palindroom");
            }
        } catch (Exception e) {
            System.err.println("viga: " + e.getMessage());
        }
    }
}
