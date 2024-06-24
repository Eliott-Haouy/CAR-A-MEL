package test;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class file {

	public static void main(String[] args) {

		File file = new File("C://Users/Eleve/OneDrive - Conseil régional Grand Est - Numérique Educatif/Bureau/Application/doc.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {

			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write("hello");
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
