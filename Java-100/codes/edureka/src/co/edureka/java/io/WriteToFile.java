package co.edureka.java.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteToFile {

	public static void main(String[] args) throws Exception {
		//OutputStream outFile = new FileOutputStream("src/co/edureka/java/io/edureka.txt");
		OutputStream outFile = new FileOutputStream("src/co/edureka/java/io/edureka.txt", true); //true-appending mode
		
		String str = "Enroll in Edureka's certification courses & give your Tech career a much-needed boost.\n";
		byte[] data = str.getBytes();
		outFile.write(data);
		
		System.out.println("file saved!");
		outFile.close();
	}
}
