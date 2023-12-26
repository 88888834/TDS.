package TD2.EX5;


public class  Rectangle {
    private double longueur, largeur;

    public Rectangle(){}
    public Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }
    public Rectangle(Rectangle rectangle){
        this.longueur = rectangle.getLO();
        this.largeur = rectangle.getLA();

    }


    public void setLO(double longueur){
        if (longueur >= 0)
            this.longueur = longueur;
        else  this.longueur = 0;
    }
    public double getLO(){
        return longueur;
    }
    public void setLA(double largeur){
        if (largeur >= 0)
            this.largeur = largeur;
        else  this.largeur = 0;
    }
    public double getLA(){
        return largeur;
    }
    public double perimetre(){
        return 2*(longueur+largeur) ;
    }
    public double aire(){
        return longueur*largeur;
    }
    public boolean isCarre(){
        return  largeur == longueur;
    }
    public String toString(){
       return  "Le périmètre de cette rectangle est :"+" "+perimetre()
               +" son Air est :"+" "+aire()+"la rectangle est care?"+isCarre()+"." ;
    }
}