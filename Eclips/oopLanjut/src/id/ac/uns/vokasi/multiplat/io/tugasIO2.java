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

public class tugasIO2 {
	Path path;
	String isiandata;
	
	
	public void setPath(String data)
	{
		path=Paths.get(data);
		try {
			Files.createFile(Paths.get(data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File sudah ada sebelumnya");
			//e.printStackTrace();
		}
	}
	
	public void setAnalisis(Path path)
	{
		System.out.print("nama file:");
		System.out.println(path.getFileName());
		System.out.print("Parent file:");
		System.out.println(path.getParent());
		System.out.print("Jumlah subfolder:");
		System.out.println(path.getNameCount());
		System.out.print("Path merupakan absolut:");
		System.out.println(path.isAbsolute());
		System.out.print("Subpath dari 0 ke 3:");
		System.out.println(path.subpath(0, 3));
		System.out.print("Tipe Readable:");
		System.out.println(Files.isReadable(path));
		System.out.print("Tipe Writeable:");
		System.out.println(Files.isWritable(path));
		System.out.print("Tipe executeable:");
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
		System.out.print("file ada:");
		System.out.println(Files.exists(path, LinkOption.NOFOLLOW_LINKS));
	}
	
	
	public static void main(String args[]) {
		String line = "";
		System.out.print("Masukkan path file: ");
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		try {
			line = in.readLine(); 
			} catch (IOException e) {
		}
		
		tugasIO2 tugas = new tugasIO2();
		tugas.setPath(line);
		tugas.setAnalisis(Paths.get(line));
		
		//Membaca input keyboard
		String tulis = "";
		System.out.print("Masukkan kata/kalimat: ");
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader rd = new BufferedReader(inp);
		try {
			tulis = rd.readLine(); }
		catch (IOException e) {
		}
		
		//Menulis Isi File
		Path path=Paths.get(line);
		try {
		BufferedWriter bw =
		Files.newBufferedWriter( path
		, Charset.forName("ISO-8859-1") , StandardOpenOption.CREATE , StandardOpenOption.APPEND );
		String fileContent= tulis;
		bw.write(fileContent, 0, fileContent.length());
		bw.close(); }
		catch(IOException ioe) {
		System.out.println("Error reading file.");
		System.exit(0); }
		
		//Baca File
		String baca = "", isifile = "";
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader(new File(line)));//masukkan URL yang ada filenya
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

