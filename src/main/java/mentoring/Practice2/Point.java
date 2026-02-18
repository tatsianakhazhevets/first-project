package mentoring.Practice2;

public class Point {
    int x;
    int y;

    Point(int coordinateX, int coordinateY){
        this.x = coordinateX;
        this.y = coordinateY;
    }

    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }

    void setX(int newX){
        this.x = newX;
    }

    public void print(){
        System.out.println("Координаты: x = " + this.x + ", y = " + this.y);
    }
}
