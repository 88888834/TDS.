package TD2.EX5;

public class TestRectangle {

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println(rectangle.toString());
            System.out.println("Périmètre: " + rectangle.perimetre());
            System.out.println("Aire: " + rectangle.aire());
            System.out.println("Est-ce un carré? " + rectangle.isCarre());
        }
}
