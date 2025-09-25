import java.util.Random;
import java.util.Scanner;
public class RoundThingsDriver {
  public static void main(String[] args) {
    // declare variable for radius, area, circumference, surfaceArea, and volume here
    double radius;
    double area;
    double circum;
    double surfaceArea;
    double volume;
    // use a Scanner object to get radius value
    Scanner scan = new Scanner(System.in);

    System.out.println("Give me a length.");
     radius = scan.nextDouble();
    // call your methods to test your program

    
  }
  // write your outPut() method here

}

  // write your RoundThings class here
  class Roundthings {

public static double calcCircum(double _radius) {
  double circumf = 2* _radius * Math.PI;
  return circumf;
}
  public static double calcArea( double _radius) {
    return Math.PI * (_radius * _radius);

  }
  public static double calcVol( double _radius){
    return 0.0;
  }


  }

  
