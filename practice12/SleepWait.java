package practice12;

public class SleepWait {
	private static Object obj = new Object();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (obj) 
        {
            obj.wait(1000);
            System.out.println("Object '" + obj + "' is woken after waiting for 1 second");
        }


	}

}
