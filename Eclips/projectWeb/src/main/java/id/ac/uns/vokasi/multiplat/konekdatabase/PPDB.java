package id.ac.uns.vokasi.multiplat.konekdatabase;


public class PPDB {
	private String id_ppdb;
	private String nama_siswa;
	private String nis;
	private String nilai;
	private String alamat;
	private String status;
	
	public void setId_ppdb(String id_ppdb) {
		this.id_ppdb = id_ppdb;
	}
	public String getId_ppdb() {
		return id_ppdb;
	}
	
	public void setNama(String nama) {
		this.nama_siswa = nama;
	}
	public String getNama() {
		return nama_siswa;
	}
	
	public void setNis(String nis) {
		this.nis = nis;
	}
	public String getNis() {
		return nis;
	}
	public void setNilai(String nilai) {
		this.nilai = nilai;
	}
	public String getNilai() {
		return nilai;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
}
