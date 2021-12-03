package id.ac.uns.vokasi.multiplat.konekdatabase;

public class Mahasiswa {
	private String nim;
	private String nama;
	private String jk;
	private String tmpLahir;
	private String tglLahir;
	private String alamat;
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNim() {
		return nim;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {
		return nama;
	}
	public void setJk(String jk) {
		this.jk = jk;
	}
	public String getJk() {
		return jk;
	}
	public void setTmpLahir(String tmpLahir) {
		this.tmpLahir = tmpLahir;
	}
	public String getTmpLahir() {
		return tmpLahir;
	}
	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}
	public String getTglLahir() {
		return tglLahir;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getAlamat() {
		return alamat;
	}
	
}
