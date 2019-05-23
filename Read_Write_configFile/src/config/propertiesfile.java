package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertiesfile {	
	public static void main(String[]args) {
		readpropertiesfile();
	}

	public static void readpropertiesfile() {
			// prop =new Properties();
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\mashu.garg\\eclipse-workspace\\Read_Write_configFile\\src\\config\\config.properties");
			//prop.load(input);
			//prop.getProperty("browser");
		//System.out.println(((System) prop).getProperty("browser"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


