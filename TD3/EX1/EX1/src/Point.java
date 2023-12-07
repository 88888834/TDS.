package TD3.EX1.EX1.src;

public class Point {
   private int x,y;
   int dx,dy;

   public Point(){}

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void Point(int x , int y){
        this.x=x;
        this.y=y;
    }
    public void deplace( int dx,int dy){
         x+=dx;
         y+=dy;
    }

//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
