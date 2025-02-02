class Circumference extends ConsoleProgram {

  /**
  * Description
  * Computes the circumference of a circle given a radius from user entry.
  * @author: Justin Mui
  */
  
  public void run() {
    
    // Variables
    double dblRadius;
    double dblCircumference;

    // Input
    dblRadius = readDouble("Enter a radius: ");

    // Calculations
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output5
    System.out.println("The circumference is "+ dblCircumference);
  }
}