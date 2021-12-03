package id.ac.uns.vokasi.multiplat.konekdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class MahasiswaModel {
	static Connection con;
	static Statement st;
	static ResultSet rs;
	static ArrayList<Mahasiswa> dataMahasiswa;
	
	public MahasiswaModel() {
		String server="jdbc:mysql://127.0.0.1/universitas?user=root&password=";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(server);;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dataMahasiswa = new ArrayList<Mahasiswa>();
	}
	
	public static ArrayList<Mahasiswa> getData(){
		String Query = "Select * FROM mahasiswa";
		try {
			st = con.createStatement();
			rs = st.executeQuery(Query);
			
			while(rs.next()) {
				Mahasiswa mhs = new Mahasiswa();
				mhs.setNim(rs.getString(1));
				mhs.setNama(rs.getString(2));
				mhs.setJk(rs.getString(3));
				mhs.setTmpLahir(rs.getString(4));
				mhs.setTglLahir(rs.getString(5));
				mhs.setAlamat(rs.getString(6));
				
				dataMahasiswa.add(mhs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataMahasiswa;
	}
	
	public static ArrayList<Mahasiswa> getDataByNim(String nim) {
		String Query = "Select * FROM mahasiswa WHERE nim'" +nim+"'";
		try {
			st = con.createStatement();
			rs = st.executeQuery(Query);
			while(rs.next()) {
				Mahasiswa mhs = new Mahasiswa();
				mhs.setNim(rs.getString(1));
				mhs.setNama(rs.getString(2));
				mhs.setJk(rs.getString(3));
				mhs.setTmpLahir(rs.getString(4));
				mhs.setTglLahir(rs.getString(5));
				mhs.setAlamat(rs.getString(6));
				
				dataMahasiswa.add(mhs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataMahasiswa;
	}
	
	public void insertMahasiswa(Mahasiswa mahasiswa) {
		String query = "INSERT INTO mahasiswa(nim, nama, jk, tempat_lahir, tanggal_lahir, alamat) VALUES("
				+ "'"+mahasiswa.getNim()+"','"+mahasiswa.getNama()+"','"+mahasiswa.getJk()+"','"+mahasiswa.getTmpLahir()+"'"+",'"
				+mahasiswa.getTglLahir()+"','"+mahasiswa.getAlamat()+"')";
		try {
			st = con.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertSeveralMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
		String query="INSERT INTO mahasiswa(nim,nama,jk,tempat_lahir,tanggal_lahir,alamat)VALUES(?,?,?,?,?,?)";
		try {
			st =con.createStatement();
			PreparedStatement prepare=con.prepareStatement(query);
			int countMahasiswa = mahasiswa.size();
			
			for(int i=0; i<countMahasiswa; i++) {
			prepare.setString(1, mahasiswa.get(i).getNim());
			prepare.setString(2, mahasiswa.get(i).getNama());
			prepare.setString(3, mahasiswa.get(i).getJk());
			prepare.setString(4, mahasiswa.get(i).getTmpLahir());
			prepare.setString(5, mahasiswa.get(i).getTglLahir());
			prepare.setString(6, mahasiswa.get(i).getAlamat());
			prepare.addBatch();
			}
			prepare.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void updateMahasiswa(Mahasiswa mahasiswa) {
		String query = "UPDATE mahasiswa SET nim='"+mahasiswa.getNim()+"', nama='"+mahasiswa.getNama()+"', jk='"+mahasiswa.getJk()+"',"+
				"tempat_lahir='"+mahasiswa.getTmpLahir()+"', tanggal_lahir='"+mahasiswa.getTglLahir()+"', alamat='"+mahasiswa.getAlamat()+"' "+
				"where nim='"+mahasiswa.getNim()+"' ";
		
		try {
			st = con.createStatement();
			st.executeUpdate(query);
			System.out.println("Berhasil update data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("gagal update data");
		}
	}
	
	public static void deleteMahasiswa(Mahasiswa mahasiswa) {
		String query = "DELETE FROM mahasiswa where nim='"+mahasiswa.getNim()+"'";
		
		try {
			st = con.createStatement();
			st.executeUpdate(query);
			System.out.println("Berhasil hapus data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("gagal hapus data");
		}
	}
}
