package TD3.EX2.EX2.src;

public class Point {
        public Point(){
        }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
        public void Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        private int x, y;


}
