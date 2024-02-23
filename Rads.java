class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  * Converts Degrees to radians
  * @author: J. Menezes
  */

  public void run() {

    // start coding here
    // Variables
    double dblDegrees;
    double dblRadians;

    // Assigning Variables
    dblDegrees = readDouble("Enter Degrees: ");

    // Calculations
    dblRadians = Math.toRadians(dblDegrees);

    // Outputs
    System.out.println("Radians: "+dblRadians);

  }
}