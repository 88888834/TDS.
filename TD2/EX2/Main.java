package TD2.EX2;

public class Main {
    public static void main(String[] args) {

       Point origine  = new Point();
       Point varie = new Point(3,5);


        System.out.println("Le point d'origine est : " +origine);
        System.out.println("La norme d'origine est : " +origine.norme());
        System.out.println("Le point qui varie est : " + varie);
        System.out.println("La norme de point qui varie est : " + varie.norme());




    }
}