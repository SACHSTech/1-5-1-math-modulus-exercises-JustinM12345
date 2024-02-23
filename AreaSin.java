class AreaSin extends ConsoleProgram {

  /**
  * Description
  * calculate the area of a triangle, given two sides and the contained angle
  * @author: Justin Mui
  */
  
  public void run() {

    // start coding here

    // Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Asigning 
    dblSideA = readDouble("What is side A: ");
    dblSideB = readDouble("What is side B: ");
    dblAngleC = readDouble("What is Angle in degrees C: ");

    // Calculations
    dblArea = (dblSideA *  dblSideB * Math.sin(Math.toRadians(dblAngleC)))/2;

    // Outputs 
    System.out.println("Area is: " + dblArea);
  }
}