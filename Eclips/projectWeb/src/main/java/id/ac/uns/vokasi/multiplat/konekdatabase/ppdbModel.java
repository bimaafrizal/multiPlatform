package id.ac.uns.vokasi.multiplat.konekdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ppdbModel {
	static Connection con = null;
	static Statement st;
	static ResultSet rs;
	static ArrayList<PPDB> dataPPDB;
	
	public ppdbModel() {
		String server = "jdbc:mysql://localhost/multiplat_backup?user=root&password=";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(server);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dataPPDB = new ArrayList<PPDB>();		
	}
	
	public static void insertData(PPDB ppdb) {
		String query = "INSERT INTO ppdb(nama_siswa, nis, alamat, nilai, status) VALUES("
				+"'"+ppdb.getNama()+"','"+ppdb.getNis()+"','"+ppdb.getAlamat()+"','"
				+ppdb.getNilai()+"','"+0+"')";
		try {
			st = con.createStatement();
			st.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<PPDB> getData(){
		String Query = "SELECT * FROM ppdb";
		try {
			st = con.createStatement();
			rs = st.executeQuery(Query);
			
			while(rs.next()) {
				PPDB ppdb = new PPDB();
				ppdb.setId_ppdb(rs.getString(1));
				ppdb.setNama(rs.getString(2));
				ppdb.setNis(rs.getString(3));
				ppdb.setAlamat(rs.getString(4));
				ppdb.setNilai(rs.getString(5));
				ppdb.setStatus(rs.getString(6));
				dataPPDB.add(ppdb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataPPDB;
	}

	public static void update(PPDB ppdb) {
		String query = "UPDATE ppdb SET status='"+ppdb.getStatus()+"'WHERE id_ppdb='"+ ppdb.getId_ppdb() +"'";
		
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
	
	public static void delete(PPDB ppdb) {
		String query = "DELETE FROM ppdb where id_ppdb='"+ppdb.getId_ppdb()+"'";
		
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
	
	public static void edit(PPDB ppdb) {
		String query = "UPDATE ppdb SET nama_siswa='"+ppdb.getNama()+"', nis='"+ppdb.getNis()+"', alamat='"+ppdb.getAlamat()+"',"+
				"nilai='"+ppdb.getNilai()+"' "+
				"where id_ppdb='"+ppdb.getId_ppdb()+"' ";
		
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
	
	public static ArrayList<PPDB> getDataByid(String id_ppdb) {
		String Query = "Select * FROM ppdb WHERE id_ppdb='" +id_ppdb+"'";
		try {
			st = con.createStatement();
			rs = st.executeQuery(Query);
			while(rs.next()) {
				PPDB ppdb = new PPDB();
				ppdb.setId_ppdb(rs.getString(1));
				ppdb.setNama(rs.getString(2));
				ppdb.setNis(rs.getString(3));
				ppdb.setAlamat(rs.getString(4));
				ppdb.setNilai(rs.getString(5));
				dataPPDB.add(ppdb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataPPDB;
	}
}
