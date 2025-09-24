import java.util.Scanner;
public class MyShape {
  public static void main(String[] args) {
    // declare variables for length, width, and area
    double length;
    double width;
    double area;
    // use a Scanner object to get length and width values
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println("Give me a length.");
     length = scan.nextDouble();
    System.out.println("Give me a width.");
     width = scan.nextDouble();
    
    
    // call your methods to test your program
    System.out.println("Perimeter = " + calcPerimeter(length, width));
    System.out.println("Area = " + calcArea(length, width));


    scan.close();
  }



  // write your perimeter method here
  public static double calcPerimeter(double _length, double _width){
    return (_length * 2) + (_width * 2);
  }

  // write your area method here
  public static double calcArea(double _length, double _width){
    return (_length * _width);
  }
}
