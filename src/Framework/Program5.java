package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Program5 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Framework\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);

		File F1 = new File(prop.getProperty("Source"));
		File F2 = new File(prop.getProperty("Destination"));
		if (F1.compareTo(F2) == 0) {
			System.out.println("Both file path are equal");
		} else
			System.out.println("Both file path are  not equal");

		// TODO Auto-generated method stub

	}

}
