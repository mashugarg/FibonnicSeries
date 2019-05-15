package FindFibonnicSeries;

public class Fibonnic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int maxnumber=10;
		int previousnumber=0;
		int nextnumber=1;
		
		
		for(int i=1;i<=maxnumber;i++)
		{
			System.out.println(previousnumber+" ");
			int sum = previousnumber+nextnumber;
			previousnumber=nextnumber;
			nextnumber=sum;
		}

	}

}
