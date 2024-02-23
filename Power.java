class Power extends ConsoleProgram {

  /**
  * Description
  * Takes in 2 numbers
  * One is the base 
  * Other is exponent
  * does the calculations
  * @author: Justin Mui
  */

  public void run() {

    // start coding here
    // Variables
    double dblBase;
    double dblExponent;
    double dblResult;

    // Assigning
    dblBase = readDouble("Enter the Base: ");
    dblExponent = readDouble("Enter the Exponent: ");

    // Calculations 
    dblResult = Math.pow(dblBase,dblExponent);

    // Outputs
    System.out.println("The result is: " + dblResult);

  }
}