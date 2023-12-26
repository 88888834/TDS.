package TD2.EX1;

public class  Point {
    private char nom;
   private double abscisse;

    // public   Point( char nom , double abscisse){
       //this.nom = nom;
      // this.abscisse = abscisse;
       //}
   public Point(){
   }

  //public void display(){
     // System.out.println("le nom  de point="+nom);
     // System.out.println("L'abscisse de point="+abscisse);

  // }
   public void  setNom(char n){
       this.nom=n;
   }
    public  char getNom(){
        return nom;
    }
    public void  setAbscisse(double a){
        this.abscisse=a;
    }
    public  double getAbscisse(){
        return abscisse;
    }
}
