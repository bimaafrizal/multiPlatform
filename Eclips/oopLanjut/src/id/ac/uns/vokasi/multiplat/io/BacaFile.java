package id.ac.uns.vokasi.multiplat.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BacaFile {
	public static void main(String[] args) {
		String letak = "D:/Kuliah/Semester 3/Multi-Platform/multiPlatform/dataIO.txt";
		String line="", fileContent="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(letak));
			line = br.readLine();
			fileContent=line+"\n";
			while(line != null) {
				line= br.readLine();
				if(line != null) fileContent=fileContent+line+"/n";
			}
			br.close();
			Path path = Paths.get(letak);
			System.out.println(letak + "berisi= " + fileContent);
			System.out.println("nama file " + path.getFileName());
			System.out.println("file readble=" + Files.isReadable(path));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File tidak ditemukan");
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File tidak dapat dibaca");
			System.exit(0);
		}
	}
}
