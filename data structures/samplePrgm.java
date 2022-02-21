package javanewsample;

public class samplePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int s = 0;
		
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				s=s+arr[i][j];
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println(s/5);
	}

}
