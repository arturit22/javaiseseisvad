import java.util.Scanner;

public class iseseisev13 {

    //alamprogramm kolmnurga tegemiseks
    public static void kolmnurk(int read) {
        for (int i = 1; i <= read; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //põhiprogramm mis küsib kasutajalt ridade arvu
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("sisesta kolmnurga suurus: ");
            int kasutaja = scanner.nextInt();
            scanner.close();
            kolmnurk(kasutaja);
        } catch (Exception e) {
            System.err.println("viga: " + e.getMessage());
        }
    }
}
