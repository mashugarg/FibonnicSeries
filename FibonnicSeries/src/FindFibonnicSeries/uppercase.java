package FindFibonnicSeries;

public class uppercase {

	public static void main(String[] args) {
		String text ="this is testing uppercase";
		int output=text.indexOf("is");
		concatination c = new concatination();
		c.addtwostring();
		System.out.println("String in uppercase  " +output);

	}
}
	
	class concatination
	{
		void addtwostring() {
		String firstname ="john";
		String lastname ="kumar";
		System.out.println(firstname.concat(lastname));
		}
	}
	

