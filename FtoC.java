class FtoC extends ConsoleProgram {

  /**
  * Description
  * Enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure
  * @author: Justin Mui 
  */
  
  public void run() {
    
    // variables
    double dblFahrenheit;
    double dblCelsius;

    // input
    dblFahrenheit = readDouble("Enter a temperature in fahrenheit: ");

    // calculations
    dblCelsius = ((dblFahrenheit - 32) * (5.0 / 9.045
    ));

    // output
    System.out.println("The temperature in degrees celsius is: " + dblCelsius);
  }
}