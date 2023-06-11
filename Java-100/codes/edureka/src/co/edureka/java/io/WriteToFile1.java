package co.edureka.java.io;

import java.io.FileWriter;
import java.io.Writer;

public class WriteToFile1 {

	public static void main(String[] args) throws Exception {
		Writer outFile = new FileWriter("src/co/edureka/java/io/edureka1.txt");
		
		String str = "Enroll in Edureka's certification courses & give your Tech career a much-needed boost.\n";
		outFile.write(str);
		
		System.out.println("file saved!");
		outFile.close();

	}

}
