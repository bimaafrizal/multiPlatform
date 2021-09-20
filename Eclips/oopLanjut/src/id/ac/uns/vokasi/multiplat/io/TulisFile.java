package id.ac.uns.vokasi.multiplat.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TulisFile {
	public static void main(String [] args) {
		String letak = "D:/Kuliah/Semester 3/Multi-Platform/multiPlatform/dataIO.txt";
		Path path = Paths.get(letak);
		try {
			BufferedWriter bf = Files.newBufferedWriter(path, 
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			String content ="File pertama";
			bf.write(content, 0,content.length());
			bf.close();
			System.out.println("File " + letak + " berhasil dibuat");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Foler tidak ditemukan");
			System.exit(0);
		}	
	}
}
