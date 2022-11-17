class Shape {
    void draw(){
        System.out.println("Shape is drawing");
    }
    void erase(){
        System.out.println("Shape is erasing");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle is drawing");
    }
    void erase(){
        System.out.println("Circle is erasing");
    }
}


class Triangle extends Shape{
    void draw(){
        System.out.println("Traingle is drawing");
    }
    void erase(){
        System.out.println("Triangle is erasing");
    }
}


class Square extends Shape{
    void draw(){
        System.out.println("Square is drawing");
    }
    void erase(){
        System.out.println("Square is erasing");
    }
}
public class Final{
    public static void main(String[] args){
    Shape a = new Circle();
    Shape b = new Triangle();
    Shape c = new Square();
    a.draw();
    a.erase();
    b.draw();
    b.erase();
    c.draw();
    c.erase();
}
}
