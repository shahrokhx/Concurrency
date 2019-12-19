

/**
 * Complete the implementation of this class in line with the FSP model
 */

public class PlatformAccess {

   // declaration(s):
	private boolean freeSpace = true;

  public synchronized void arrive() throws InterruptedException {
    // my implementation:
	  while (!freeSpace){
		  wait();
	  }
	  freeSpace = false;
  }

  public synchronized void depart() {
    // my implementation:
	  freeSpace = true;
	  notifyAll();
  }

}