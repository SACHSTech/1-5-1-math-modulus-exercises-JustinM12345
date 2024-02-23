class Hours extends ConsoleProgram {

  /**
  * Description
  * Lets you enter a number of hours, and that converts it to days and hours. For example, 111 hours = 4 days and 15 hours
  * @author: Justin Mui
  */
  
  public void run() {
    
    // Variables
    int intTotalHours;
    int intDays;
    int intRemainderHours;

    // Input
    intTotalHours = readInt("What is the total number of hours?: ");

    // Calculations
    intDays = intTotalHours / 24;
    intRemainderHours = intTotalHours % 24;

    // Output
    System.out.println(intTotalHours + " hours converted is "+ intDays + " day(s) and " + intRemainderHours + " hour(s)");
    
  }
}