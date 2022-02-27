package satuDua;

/*
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 27-02-2022
 */

class KelasSatu {
	{
	System.out.println(11); //akan dieksekusi setiap KelasSatu dipanggil
	}
	static { //hal pertama yang dieksekusi ketika class KelasSatu dijalankan
		System.out.println(2);
		}
	public KelasSatu(int i) { //akan dieksekusi jika ada objek baru yang memiliki parameter
		System.out.println(3);
		}
	public KelasSatu() {
		System.out.println(4);
		}
	}


