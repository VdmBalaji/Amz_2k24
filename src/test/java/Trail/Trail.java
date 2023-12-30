package Trail;

import java.util.Random;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail {

	public static void main(String[] args) {
		
		Random rand=new Random();
	    int one=rand.nextInt(1000)+600000;
		String value=String.valueOf(one);
		System.out.println(value);

	}

}
