class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  * Converts Degrees to radians
  * @author: Justin Mui
  */

  public void run() {

    // start coding here
    // Variables
    double dblDegrees;
    double dblRadians;

    // Assigning Variables
    dblDegrees = readDouble("Enter a value for degrees: ");

    // Calculations
    dblRadians = Math.toRadians(dblDegrees);

    // Outputs
    System.out.println("Radians: "+dblRadians);

  }
}