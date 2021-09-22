package id.ac.uns.vokasi.multiplat.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class tugasIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letak  ="";
		String inputan ="";
		
		
		System.out.println("Selamat datang di aplikasi membuat file baru: ");
		System.out.println("Masukan letak dan nama file!");
		letak = sc.nextLine();
		System.out.println(letak);
		System.out.println("Masukan isi dari file!");
		inputan = sc.nextLine();
		System.out.println(inputan);
	}
	
	public void tambahFile(String letak, String inputan) {
		Path path = Paths.get(letak);
		try {
			BufferedWriter bf = Files.newBufferedWriter(path, 
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			bf.write(inputan, 0,inputan.length());
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Foler tidak ditemukan");
			System.exit(0);
		}
	}
	
	public void bacaFile(String letak) {
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
