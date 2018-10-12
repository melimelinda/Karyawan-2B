public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("PROJECT MANAGER");
	ProjectManager m = new ProjectManager();
	m.setNama("Meli");
	m.setAlamat("Sukasari");
	m.setGaji(1000);

	System.out.println("PROGRAMMER");
	Programmer p = new Programmer();
	p.setNama("Rian");
	p.setAlamat("Arahan");
	p.setGaji(30);

	System.out.println("DESIGNER");
	Designer d = new Designer();
	d.setNama("Desi");
	d.setAlamat("Pabean");
	d.setGaji(60);
	}
}