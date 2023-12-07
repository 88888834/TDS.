package TD2.EX2;


import java.lang.Math;
public class Point {

    private double x;
    private double y;


    // Constructeur par défaut
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    // Constructeur d'initialisation
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return this.x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    // Méthode Norme
    public double norme() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }


}
