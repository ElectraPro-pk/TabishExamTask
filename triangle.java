public class triangle extends shape{
  private double height;
  private double base;

  public triangle(double h,double b){
    super("Triangle");
    this.height = h;
    this.base = b;
  }
  public triangle(){
    super("Triangle");
  }

  public void setBase(double b){
    this.base = b;
  }
  public double getBase(){
    return this.base;
  }
  public void setHeight(double h){
    this.height = h;
  }
  public double getHeight(){
    return this.height;
  }
  public double CalculateArea(){
    this.area = (base * height)/2;
    return this.area;
  }
  public void OutputArea(){
    System.out.println("Shape : "+this.shapeType
    +"\nArea  : "+CalculateArea());
  }
}