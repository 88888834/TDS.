package TD2.EX3;

public class Livre {

    private String titre ;
    private  String auteur;
    private float prix ;
    private int annee ;

    public Livre(){}
    public Livre(String titre){
        this.titre=titre;
    }
    public Livre(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;

    }
    public Livre(String titre,String auteur,float prix){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;

    }
    public Livre(String titre,String auteur,float prix,int annee){

        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        this.annee=annee;

    }

    public String toString(){
        return "le nom de livre:"+this.titre+", l'auteur:"+this.auteur+", le prix:"+" "+this.prix+"$"+", publiée en"+" "+this.annee+".";

    }
}

