public class circle extends shape{
  private double radius;
  public circle(double r){
    super("Circle");
    this.radius = r;
  }
  public circle(){
    super("Circle");
  }
  public void setRadius(double r){
    this.radius = r;
  }
  public double getradius(){
    return this.radius;
  }
  public double CalculateArea(){
    this.area = 2 * 3.14 *3.14 * radius * radius;
    return this.area;
  }
  public void OutputArea(){
    System.out.println("Shape : "+this.shapeType
    +"\nArea  : "+CalculateArea());
  }
}