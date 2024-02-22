class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * Lets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side
  * @author: Justin M 
  */
  
  public void run() {
    
    // Variables
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleC;

    // Input
    dblSideA = readDouble("Input the length of side A: ");
    dblSideB = readDouble("Input the length of side B: ");
    dblAngleC = readDouble("Input angle C: ");

    // Calculcations
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - (2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC))));

    // Output
    System.out.println("The length of side C is "+ dblSideC);
    
  }
}