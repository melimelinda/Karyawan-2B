public class ProjectManager extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("selamat gaji anda sebanyak = "+gaji);
		}else{
			System.out.println("maaf gaji anda tidak sesuai dengan standarisasi perusahaan");
		}
	}
}