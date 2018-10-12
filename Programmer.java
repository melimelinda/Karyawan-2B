public class Programmer extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("selamat gaji anda sebanyak = "+uang);
		}else{
			System.out.println("maaf gaji anda tidak sesuai dengan standarisasi perusahaan");
		}
	}
}