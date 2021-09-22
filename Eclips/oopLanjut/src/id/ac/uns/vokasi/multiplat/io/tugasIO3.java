package id.ac.uns.vokasi.multiplat.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class tugasIO3 {
	Path path;
	String isiandata = "";
	public static void main(String[] args) {
		String lokasi = "";
		String isidata ="";
		System.out.println("Masukan letak file:");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		try {
			lokasi = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Masukan isi dari file!");
		try {
			isidata = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tugasIO3 tugas = new tugasIO3();
		tugas.setFile(lokasi, isidata);
		tugas.analisisFile(Paths.get(lokasi));
		tugas.bacaIsiFile(Paths.get(lokasi));
	}
	
	public void setFile(String lokasi, String isidata) {
		path = Paths.get(lokasi);
		try {
			BufferedWriter bf = Files.newBufferedWriter(path, 
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			bf.write(isidata, 0,isidata.length());
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Foler sudah ada sebelumnya ditemukan");
			//System.exit(0);
		}
	}
	
	public void analisisFile(Path path) {
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
	
	public void bacaIsiFile(Path path) {
		System.out.print("Isi filenya adalah ");
		String baca = "", isifile = "";
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader(new File(path.toString())));
			baca = fileInput.readLine();
			isifile = baca + "\n";
			while (baca != null) {
				baca = fileInput.readLine();
				if (baca != null) isifile += baca + "/n"; }
			fileInput.close();
		}
		
		catch(EOFException eofe) {
			System.out.println("No more lines to read.");
			System.exit(0); 
			}
		catch(IOException ioe) {
			System.out.println("Error reading file.");
			System.exit(0); 
		}
		
		System.out.println("Isi File: ");
		System.out.println(isifile);
		
	}
}
