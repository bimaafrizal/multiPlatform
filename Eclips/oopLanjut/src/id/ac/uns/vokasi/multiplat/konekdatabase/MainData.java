package id.ac.uns.vokasi.multiplat.konekdatabase;

import java.util.ArrayList;

public class MainData {
	public static void main(String[] args) {
		//insert
		/**Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNim("V3420018");
		mhs1.setNama("Bima AM");
		mhs1.setJk("L");
		mhs1.setTmpLahir("Wsb");
		mhs1.setTglLahir("2001-11-23");
		mhs1.setAlamat("Solo");
		
		MahasiswaModel modelMahasiswa = new MahasiswaModel();
		modelMahasiswa.insertMahasiswa(mhs1);**/
		
		//insert interval
		/**ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<Mahasiswa>();
		Mahasiswa mhs2 = new Mahasiswa();
		mhs2.setNim("V3420011");
		mhs2.setNama("Anung");
		mhs2.setJk("P");
		mhs2.setTmpLahir("Pati");
		mhs2.setTglLahir("2002-3-21");
		mhs2.setAlamat("rembang");
		dataMahasiswa.add(mhs2);
		
		Mahasiswa mhs3 = new Mahasiswa();
		mhs3.setNim("V3420081");
		mhs3.setNama("Peh");
		mhs3.setJk("P");
		mhs3.setTmpLahir("Solo");
		mhs3.setTglLahir("2001-12-22");
		mhs3.setAlamat("Karanganyar");
		dataMahasiswa.add(mhs3);
		
		MahasiswaModel newMahasiswa = new MahasiswaModel();
		newMahasiswa.insertSeveralMahasiswa(dataMahasiswa);**/
		
		//delete
		Mahasiswa maba = new Mahasiswa();
		maba.setNim("M3111002");
		MahasiswaModel newMahasiswa = new MahasiswaModel();
		newMahasiswa.deleteMahasiswa(maba);
		
		//update
		/**MahasiswaModel newMahasiswa = new MahasiswaModel();
		Mahasiswa mhs2 = new Mahasiswa();
		mhs2.setNim("V342002");
		mhs2.setNama("Arif");
		mhs2.setJk("P");
		mhs2.setTmpLahir("pati");
		mhs2.setTglLahir("2002-10-8");
		mhs2.setAlamat("Blora");
		newMahasiswa.updateMahasiswa(mhs2);**/
		
		MahasiswaModel mhs = new MahasiswaModel();
		int jmlh = mhs.getData().size();
		for(int i = 0; i< jmlh;i++) {
			System.out.println(mhs.getData().get(i).getNim());
			System.out.println(mhs.getData().get(i).getNama());
			System.out.println(mhs.getData().get(i).getJk());
			System.out.println(mhs.getData().get(i).getTmpLahir());
			System.out.println(mhs.getData().get(i).getTglLahir());
			System.out.println(mhs.getData().get(i).getAlamat());
		}
	}
}
