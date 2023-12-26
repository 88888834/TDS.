package TD2.EX4;
public class  Main {
    public static void main(String[] args) {
        Temps t = new Temps(20,23,1);
        System.out.println(t.toString());
        t.ajouterM(300);
        System.out.println(t.toString());
        t.ajouterS(3600);
        System.out.println(t.toString());



    }
}