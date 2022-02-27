package barangInventory;
/*
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 27-02-2022
 */
public class Inventori {
	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang[2]; //proses membuat objek baru
		barangs[0] = new Barang("001", "Baju", 10); //objek pertama
		barangs[1] = new Barang("002", "Celana", 20); //objek kedua
	}
	
	void showBarang() { //untuk menampilkan nama dan stok barang
		System.out.printf("==========Stok Barang==========\n");
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	void pengadaan() {
		initBarang();
		barangs[0].setStok(20); //menambahkan stok barang[0] (Baju) sebanyak 20
		showBarang();		
	}
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
		}

}
