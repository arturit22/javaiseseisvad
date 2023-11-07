public class iseseisev12 {

    public static void main(String[] args) {
        //kolmnurkade väljastamine
        System.out.println("a)");
        kolmnurkA();
        System.out.println("\nb)");
        kolmnurkB();
        System.out.println("\nc)");
        kolmnurkC();
        System.out.println("\nd)");
        kolmnurkD();
    }
//kolmnurk a alamprogramm
    public static void kolmnurkA() {
        int[] tahed = {1,3,5,3,1};
        for (int i = 0; i < tahed.length; i++) {
            for (int j = 0; j < tahed[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//kolmnurk b alamprogramm
    public static void kolmnurkB() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//kolmnurk c alamprogramm
    public static void kolmnurkC() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//kolmnurk d alamprogramm
    public static void kolmnurkD() {
        int[] tahed2 = {5,4,3,2,1,1,2,3,4};
        for (int i = 0; i < tahed2.length; i++) {
            for (int j = 0; j < tahed2[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
