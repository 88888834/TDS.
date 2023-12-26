package TD2.EX6;

public class  Main {
    public static void main(String[] args) {
     Banque B=  new Banque(1, 5000.75 ,"AB 1200");
        B.deposer(500);
        System.out.println(B.toString());
        B.retirer(200);
        System.out.println(B.toString());
    }

}