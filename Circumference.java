class Circumference extends ConsoleProgram {

  /**
  * Description
  * Computes the circumference of a circle given a radius from user entry.
  * @author: Justin M
  */
  
  public void run() {
    
    // Variables
    double dblRadius;
    double dblCircumference;

    // Input
    dblRadius = readDouble("What is the radius of your circle? ");

    // Calculations
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output5
    System.out.println("The circumference is "+ dblCircumference);
  }
}