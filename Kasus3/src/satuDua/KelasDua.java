package satuDua;

/*
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 27-02-2022
 */

public class KelasDua {
	{
		System.out.println(5);
	}

	public static void main(String[] args) {
		System.out.println(6); //hal yang pertama dieksekusi bila class KelasDua di run
		KelasSatu satu = new KelasSatu();  //membuat objek baru dengan class KelasSatu, tanpa parameter
		KelasSatu dua = new KelasSatu(10); //membuat objek baru dengan class KelasSatu baru, dengan parameter 10
	}

}
