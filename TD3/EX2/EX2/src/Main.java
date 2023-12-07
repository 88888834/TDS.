package TD3.EX2.EX2.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       PointNom p1 = new PointNom(1,3,"H");
        PointNom p2 = new PointNom();
        PointNom p3 = new PointNom();

        p1.affCoordNom();
        System.out.println(p2.setPointNom(2, 3, "Alice"));
        System.out.println(p3.setNom("L"));


    }
}