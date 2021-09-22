package id.ac.uns.vokasi.multiplat.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class tugasIO {
	Path path;
	String isiData="";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letak  ="";
		String inputan ="";
		Path path = Paths.get(letak);
		
		System.out.println("Selamat datang di aplikasi membuat file baru: ");
		System.out.println("Masukan letak dan nama file!");
		letak = sc.nextLine();
		System.out.println(letak);
		System.out.println("Masukan isi dari file!");
		inputan = sc.nextLine();
		System.out.println(inputan);
		
		tambahFile(letak, inputan);
		setAnalisis(Paths.get(letak));
		bacaFile(letak);
		
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
			//e.printStackTrace();
			System.out.println("Foler sudah ada sebelumnya ditemukan");
			//System.exit(0);
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File tidak dapat dibaca");
			System.exit(0);
		}
	}
	
	public void setAnalisis(Path path) {
		System.out.print("Nama File:");
		System.out.println(path.getFileName());
		System.out.print("Parent File");
		System.out.println(path.getParent());
		System.out.print("Jumlah subfolder: ");
		System.out.println(path.getNameCount());
		System.out.print("Path merupakan absolute:");
		System.out.println(path.isAbsolute());
		System.out.print("Subpath dari 0 ke 1: ");
		System.out.println(path.subpath(0, 1));
		
		System.out.print("Tipe Readable:");
		System.out.println(Files.isReadable(path));
		System.out.print("Tipe Writeable:");
		System.out.println(Files.isWritable(path));
		System.out.print("Tipe executeable");
		System.out.println(Files.isExecutable(path));
		System.out.print("Tipe Hidden:");
		
		try {
			System.out.println(Files.isHidden(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("apakah sama filenya:");
		try {
			System.out.println(Files.isSameFile(path, path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file ada: ");
		System.out.println(Files.exists(path,LinkOption.NOFOLLOW_LINKS));
	}
}
