abstract class shape {
  double area;
 String shapeType;
  
  abstract double CalculateArea();
  abstract void OutputArea();

  public shape(String name){
    this.shapeType = name;
  }


}