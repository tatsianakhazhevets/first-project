package Practice2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    public int calculateArea(int width, int height){
        return width * height;
    }

    void print(){
        int area = calculateArea(this.width, this.height);
        System.out.println("Площадь прямоугольника: " + area);
    }


}
