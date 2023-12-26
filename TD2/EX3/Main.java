package TD2.EX3;

public class  Main {
    public static void main(String[] args) {
        Livre l5= new Livre();
        Livre l1= new Livre("NO LONGER HUMAN");
        Livre l2= new Livre("NO LONGER HUMAN", "Osamu Dazai");
        Livre l3= new Livre("NO LONGER HUMAN", "Osamu Dazai",324);
        Livre l4= new Livre("NO LONGER HUMAN", "Osamu Dazai",324,1948);


       System.out.println(l4.toString());


    }
}
