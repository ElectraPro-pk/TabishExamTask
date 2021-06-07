public class square extends shape{
  private double side;

  public square(double s){
    super("Square");
    this.side = s;
  }
  public square(){
    super("Square");
  }

  public void setSide(double s){
    this.side = s;
  }
  public double getSide(){
    return this.side;
  }
  public double CalculateArea(){
    this.area = side * side;
    return this.area;
  }
  public void OutputArea(){
    System.out.println("Shape : "+this.shapeType
    +"\nArea  : "+CalculateArea());
  }
}