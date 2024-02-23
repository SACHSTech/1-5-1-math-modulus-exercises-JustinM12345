class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  * User enters an amount of minutes
  * Program turns that into hours, days, and minutes
  * @author: Justin Mui
  */

  public void run() {

    // start coding here
    // Variables
    int intMins;
    int intDays;
    int intHours;
    int intRemainingMins;

    // Assignments
    intMins = readInt("Enter an amount of minutes: ");

    // Calculations
    intDays = (intMins/60)/24;
    intHours = (intMins/60) - intDays * 24;
    intRemainingMins = intMins - (intHours * 60) - intDays* 24 * 60;

    // Outputs
    System.out.println(intDays+" Day(s), "+intHours+" Hour(s), "+intRemainingMins+" Minute(s)");

  }
} 