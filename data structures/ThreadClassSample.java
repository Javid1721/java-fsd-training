package javanewsample;


class Hi extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{ Thread.sleep(1000); } catch(Exception e) {}
		}
	}
	
}

class Hello extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{ Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}


public class ThreadClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		
		obj1.start();
		obj2.start();
		
	}

}
