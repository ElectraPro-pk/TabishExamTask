public class Main{
  public static void main(String[] args){
    System.out.println("==========================");
    System.out.println("Running For Circle with Radius { 2.7 }");
    circle c = new circle(2.7);
    c.OutputArea();
System.out.println("==========================");
    System.out.println("Running For Rectangle with Width { 3 } and Height { 4 }");
    rectangle r = new rectangle(4,3);
    r.OutputArea();
System.out.println("==========================");
    System.out.println("Running For Triangle with Base { 5 } and Height { 4 }");
    triangle t = new triangle(4,5);
    t.OutputArea();
System.out.println("==========================");
    System.out.println("Running For Square with Side { 5 }");
    square s = new square(5);
    s.OutputArea();
    System.out.println("==========================");

  }
}