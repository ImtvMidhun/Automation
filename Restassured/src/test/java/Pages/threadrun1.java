package Pages;



public class threadrun1 extends Thread {
	
	
	public void run() {
		
		try {
			
			System.out.println("current running is "+Thread.currentThread().getId());
			
		}
		catch(Exception e) {
			
			
		}
	}
	


}
