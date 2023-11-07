public class iseseisev9 {

    public static void main(String[] args) {
        //põhiprogramm mis annab arvud reana 1 kuni 66
        try {
            for (int i = 1; i <= 66; i++) {
                System.out.print(i);
            }
        } catch (Exception e) {
            System.err.println("viga: " + e.getMessage());
        }
    }
}
