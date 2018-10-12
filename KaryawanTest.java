public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("===jabatan PM===");
	ProjectManager m = new ProjectManager();
	m.setNama("Meli");
	m.setAlamat("Sukasari");
	m.setGaji(90);

	System.out.println("===jabatan Programmer===");
	Programmer p = new Programmer();
	p.setNama("Rian");
	p.setAlamat("Arahan");
	p.setGaji(60);

	System.out.println("===jabatan Desainer===");
	Designer d = new Designer();
	d.setNama("Desi");
	d.setAlamat("Pabean");
	d.setGaji(50);
	}
}