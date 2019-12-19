

/**
 * Complete the implementation of this class in line with the FSP model
 */

import display.*;

public class Controller {

  public static int Max = 9;
  protected NumberCanvas passengers;

  // declarations required


  public Controller(NumberCanvas nc) {
    passengers = nc;
  }

  public void newPassenger() throws InterruptedException {
     // complete implementation
     // use "passengers.setValue(integer value)" to update diplay
  }

  public int getPassengers(int mcar) throws InterruptedException {
     // complete implementation for part I
     // update for part II
     // use "passengers.setValue(integer value)" to update diplay
     return 0; // dummy value to allow compilation
  }

  public synchronized void goNow() {
    // complete implementation for part II
  }

}