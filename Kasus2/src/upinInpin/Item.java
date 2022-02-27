package upinInpin;

/*
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 27-02-2022
 */

public class Item {
		private String name;
		private Item() { //membuat item menjadi private
			name = "Ipin";
		}
		public Item(String name) { //Constuctor
			this.name = "Ipin";
			System.out.println(this.name);
		}

}
