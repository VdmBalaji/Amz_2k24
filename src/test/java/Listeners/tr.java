package Listeners;

public class tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a= 100;
		int b = 0;
		try {
			int c;
			c = a%b;
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
		
		String[] a = {"java" , "selenium" , "testng"};
		for (int i = 0 ; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			
		}
		
		String java = "java";
		String selenium = "selenium";
		String testng = "testng";

		String joinedString = java.concat(selenium).concat(testng);

		System.out.println(joinedString);

		
		
		
	}

}
