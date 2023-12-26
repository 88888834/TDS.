package TD3.EX2.EX2.src;

public class  PointNom extends Point {
         private String nom;



        public  PointNom() {

        }
        public PointNom(int x, int y, String nom) {
            super(x,y);
            this.nom = nom;
        }
        public String setPointNom(int x, int y, String nom) {
//            super(x,y);
            this.nom = nom;
            return nom;
        }

        public String getNom() {
            return nom;
        }

        public String setNom(String nom) {
            this.nom = nom;
            return nom;
        }

        public void affCoordNom() {
            System.out.println("Coordonnees : " + getX()+ " " + getY()+"\n"+"Nom"+"  "+nom);
        }


    }

