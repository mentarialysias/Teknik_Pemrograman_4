package barangInventory;

/*
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 27-02-2022
 */

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; //membuat stok menjadi private

	//enkapsulasi
	public void setStok(int stk) { //setter (Mutator)
		this.stok += stk; //stok barang hanya bisa ditambah
	}
	public int getStok() { //getter (Acessor)
		return this.stok;
	}
	
	public Barang(String kode, String nama, int stk) { 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
		}
}

