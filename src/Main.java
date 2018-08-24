import java.util.HashMap;

import pattern.Driver;

public class Main {

	public static void main(String[] args) {
		
		Driver driver = new Driver.DriverBuilder("chrome")
				.setMaximize(true)
				.setAllowPopUP("yes").build();
		
		System.out.println(driver);
	
	}

}
