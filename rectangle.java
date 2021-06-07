public class rectangle extends shape{
  private double height;
  private double width;

  public rectangle(double h,double w){
    super("Rectangle");
    this.height = h;
    this.width = w;
  }
  public rectangle(){
    super("Rectangle");
  }

  public void setWidth(double w){
    this.width = w;
  }
  public double getWidth(){
    return this.width;
  }
  public void setHeight(double h){
    this.height = h;
  }
  public double getHeight(){
    return this.height;
  }
  public double CalculateArea(){
    this.area = width * height;
    return this.area;
  }
  public void OutputArea(){
    System.out.println("Shape : "+this.shapeType
    +"\nArea  : "+CalculateArea());
  }
}