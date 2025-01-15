package lv.rvt;

public class Box {

    private double width;
    private double height;
    private double length;
    private double side;


public Box(double width, double height, double length) {
    this.width = width;
    this.height = height;
    this.length = length;
}

public Box(double side) {
    this.side = side;
}

public double volume() {
    return width * length * height;
}

double area() {
  return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
}

public double faceArea() {
    return width * height;
}

public double topArea() {
    return width * length;
}

public double sideArea() {
    return length * height;
}

public Box( Box oldBox ) {
    
}

}
















