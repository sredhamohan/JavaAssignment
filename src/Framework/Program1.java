package Framework;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir") + "\\File\\Read.txt");
// Read using Scanner
		Scanner sc;
		try {
			sc = new Scanner(f);
			System.out.println("Reading using Scanner");

			while (sc.hasNextLine())
				System.out.println(sc.nextLine());

//Read using buffer reader

			BufferedReader br = new BufferedReader(new FileReader(f));
			System.out.println("Reading using Buffer reader");
			String s;

			while ((s = br.readLine()) != null)

				System.out.println(s);

// Read using bufferinputstream

			FileInputStream fin = new FileInputStream(System.getProperty("user.dir") + "\\File\\Read.txt");
			System.out.println("Reading using bufferinputstream");
			BufferedInputStream bis = new BufferedInputStream(fin);
			while (bis.available() > 0) {
				System.out.print((char) bis.read());

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
