//class Main {
//
//    public class Animal {
//        String eye;
//        String mouth;
//
//        void eat() {}
//        void sleep() {}
//    }
//
//    class Eagle extends Animal{
//        String wing;
//        
//        void fly(){}
//    }
//
//    class Tiger extends Animal{
//        String leg;
//
//        void run(){}
//    }
//
//    class Goldfish extends Animal{
//        String fin;
//
//        void swim(){}
//    }
//
//
//}

//class Circle{
//
//    private void secret(){
//        System.out.println("비밀");
//    }
//
//    protected void findRadius(){
//        System.out.println("반지름 : 10.0cm");
//    }
//
//    public void findArea(){
//        System.out.println("넓이 : 반지름 * 반지름 * 3.141592");
//    }
//
//}
//
//class Ball extends Circle{
//    private String color;
//
//    public Ball(String color){
//        this.color = color;
//    }
//
//    public void findColor() {
//        System.out.println(color + "공");
//    }
//
//    public void findVolume(){
//        System.out.println("부피 : 4/3 * 반지름 * 반지름 *3.141592");
//    }
//
//
//}
//
//
//class Main {
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        Ball c2 = new Ball("빨간색");
//
//        System.out.println("원 : ");
//        c1.findRadius();
//        c1.findArea();
//
//        System.out.println("공 : ");
//        c2.findRadius();
//        c2.findColor();
//        c2.findArea();
//        c2.findVolume();
//
//    }
//
//}



//class Point {
//    int x, y;
//
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//        
//    
//    void getLocation(){
//        System.out.println("x : " + x + ", y : " + y + ", z : " + z);
//    }
//    
//}
//
//
//class Point3D (){
//    Point3D(int x, int y, int z){
//        super(x, y);
//        this.z = z;
//    }
//
//}
//
//
//public class Inheritance3 {
//    public static void main(String[] args) {
//       point3D p1 = new Point3D();
//       p1.getLocation();
//       Point3D p2 = new point3D(1, 2, 3);
//       p2.getLocation();
//    }
//}


class MyAnimal{
    String name;
    int leg;

    void sleep(){
        System.out.println("쿨쿨");
    }
    void sound(){
        System.out.println("--");
    }
}

class Dog extends MyAnimal{
    void sound(){
        System.out.println("멍멍");
    }
    void like(){
        System.out.println("산책");
    }
}

public class Main{
    public static void main(String[] args){
        MyAnimal a1;
        Dog d1 = new Dog();
        Dog d2;

        a1 = (MyAnimal)d1;
        a1.sleep();
        a1.sound();

        d2 = (Dog)a1;
        d2.sleep();
        d2.sound();
        d2.like();

    }
}
