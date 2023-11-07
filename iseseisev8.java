import java.util.Scanner;

public class iseseisev8 {

    //alamprogramm mis pöörab ümber lause
    public static String pööralause(String sisend) {
        String[] sonad = sisend.split(" ");
        StringBuilder tulemus = new StringBuilder();
        for (int i = sonad.length - 1; i >= 0; i--) {
            tulemus.append(sonad[i]);
            if (i > 0) {
                tulemus.append(" ");
            }
        }
        return tulemus.toString();
    }
    //põhiprogramm
    public static void main(String[] args) {
        try {
            //skänner mis küsib kasutajalt lause
            Scanner scanner = new Scanner(System.in);
            System.out.print("sisesta lause: ");
            String kasutajalause = scanner.nextLine();
            scanner.close();
            
            String pööratudlause = pööralause(kasutajalause);
            System.out.println("tagurpidine tekst: " + pööratudlause);
        } catch (Exception e) {
            System.err.println("viga: " + e.getMessage());
        }
    }
}
