package TD2.EX6;

public class  Banque {
   int NCompte ;
     double Solde ;
       String CIN;


    public Banque(){}

    public Banque(int NCompte,double Solde,String CIN){

        this.NCompte=NCompte;
        this.Solde= Solde;
        this.CIN=CIN;
    }

 public void deposer(double S){
      this.Solde += S;

 }
    public void retirer(double R){
        this.Solde -= R;

    }
 public String toString(){

  return "deposer 500dh le solde est : "+Solde+"dh ,"+"apres retirer 200dh le solde est: "+Solde+"dh." ;
}

}
