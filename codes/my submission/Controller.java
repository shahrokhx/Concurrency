

/**
 * Complete the implementation of this class in line with the FSP model
 */

import display.*;

public class Controller {

  public static int Max = 9;
  protected NumberCanvas passengers;

  // declaration(s):
  private int passengerCounter =0;
  private boolean goButton = false;
  private boolean carWait  = false;
  
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
	  carWait = true;
	  while (!(mcar>0 && passengerCounter >= mcar) && !goButton){
		  wait();
	  }
	  int currPassenger;
	  if (passengerCounter >= mcar){
		  currPassenger = mcar;
		  passengerCounter -= currPassenger;
	  }else{
		  currPassenger = passengerCounter;
		  passengerCounter =0;
	  }
	  passengers.setValue(passengerCounter);
	  goButton = false;
	  carWait = false;
	  notifyAll();
	  
	  return currPassenger;
  }

  public synchronized void goNow() {
	  // my implementation:
	  if (passengerCounter > 0 && carWait){
		  goButton = true;
		  notifyAll();
	  }
  }
}