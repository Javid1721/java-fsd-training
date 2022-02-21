package java_training4;



public class userDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		i=8;
		j=9;
		try {
			int k = i/j; //0
			if(k==0)
			{
				throw new JaviException("this is not i wanted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
