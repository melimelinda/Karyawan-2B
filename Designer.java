public class Designer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji Anda bulan ini adalah "+gaji);
		}else{
			System.out.println("maaf gaji anda melebihi standarisasi perusahaan");
		}
	}
}