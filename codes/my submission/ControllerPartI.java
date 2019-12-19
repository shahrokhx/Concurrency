

/**
 * Complete the implementation of this class in line with the FSP model
 */

import display.*;

public class Controller {

  public static int Max = 9;
  protected NumberCanvas passengers;

  // declaration(s):
  private int passengerCounter =0;

  public Controller(NumberCanvas nc) {
    passengers = nc;
  }

  public synchronized void newPassenger() throws InterruptedException {
	  // my implementation:
	  while (passengerCounter >= Max){
		  wait();
	  }
	  passengers.setValue(++passengerCounter);
	  notifyAll();
  }

  public synchronized int getPassengers(int mcar) throws InterruptedException {
    // my implementation:
	  while (!(mcar>0 && passengerCounter >= mcar)){
		  wait();
	  }
	  passengerCounter -=mcar;
	  passengers.setValue(passengerCounter);
	  notifyAll();
	  
	  return mcar;
  }

  public synchronized void goNow() {
    // complete implementation for part II
  }

}
