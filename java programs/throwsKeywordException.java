package java_training4;
//checked Exception - compile time exception
public class throwsKeywordException {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
