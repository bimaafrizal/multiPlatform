package innerClassInterface;

public class innerUkuran {
	class besarUkuran {
		double besar= 0.0;
		int awal= 0;
		int akhir = 0;
		double pengali = 1;
		
		public besarUkuran(String awal, String akhir, double besar) {
			switch(awal) {
			case "km":this.awal = 1; break;
			case "hm":this.awal = 2; break;
			case "dam":this.awal = 3; break;
			case "m":this.awal = 4; break;
			case "dm":this.awal = 5; break;
			case "cm":this.awal = 6; break;
			case "mm":this.awal = 7; break;
			}
			
			switch(akhir) {
			case "km":this.akhir = 1; break;
			case "hm":this.akhir = 2; break;
			case "dam":this.akhir = 3; break;
			case "m":this.akhir = 4; break;
			case "dm":this.akhir = 5; break;
			case "cm":this.akhir = 6; break;
			case "mm":this.akhir = 7; break;
			}
			
			this.besar=besar;
		}
		
		public double getBesar() {
			return besar;
		}
		
		public double getSelisih() {
			int selisih = 0;
			selisih = awal-akhir;
			if(selisih > 0) {
				for(int i = 0; i <selisih; i++) {
					pengali = pengali/10;
				}
			}else if(selisih < 0) {
				for(int i=0; i<selisih;i++) {
					pengali=pengali*10;
					
				}
			}
			return pengali;
		}
	}
	
	
	double hasil = 0;
	
	besarUkuran Ukuranbesar = new besarUkuran("mm", "dm", 7);
	
	public innerUkuran() {
		hasil = Ukuranbesar.getBesar() * Ukuranbesar.getSelisih();
	}
	
	public static void main(String[] args) {
		innerUkuran cetak = new innerUkuran();
		System.out.println(cetak.hasil);
	}
}
