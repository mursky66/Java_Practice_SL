package mypackage;

public class MyClass extends Thread
{
	public void run ()
	{
		System.out.println("Thread is running ");
	}

	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1;i<=100;i++)
		{
		//  create object of myclass
		MyClass t1 = new MyClass();
		t1.start();
		System.out.println(t1.getId());
		t1.sleep(200);
		}
	}

}
