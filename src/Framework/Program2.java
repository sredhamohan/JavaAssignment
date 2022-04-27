package Framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Program2 {
	// this is to read the file
	public static void read() {
		File f = new File(System.getProperty("user.dir") + "\\File\\Read.txt");
		Scanner sc;
		try {
			sc = new Scanner(f);

			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
// write using Filewriter class
		FileWriter fw;
		try {
			fw = new FileWriter(System.getProperty("user.dir") + "\\File\\Read.txt");

			fw.write("Wrote using File writer class");
			fw.append(" and appending the test");
			fw.close();
			read();

	// Write using buffered writer
			FileWriter writer = new FileWriter(System.getProperty("user.dir") + "\\File\\Read.txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write("Wrote using Buffered Writer");
			buffer.append(" and appending the text");

			buffer.close();

			read();
	// Write Using FileOutputStream Class

			FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "\\File\\Read.txt");
			String s = "Wrote using fileoutput straem.";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			read();

	// Write using write string
			Path filePath = Paths.get(System.getProperty("user.dir") + "\\File\\Read.txt");
			Files.writeString(filePath, "Wrote using Write string!!");
			read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
