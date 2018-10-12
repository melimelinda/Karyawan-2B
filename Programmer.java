public class Programmer extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Gaji Anda bulan ini adalah "+gaji);
		}else{
			System.out.println("maaf gaji anda melebihi standarisasi perusahaan");
		}
	}
}