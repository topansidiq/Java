public class TipeDataArray {
	public static void main(String[] args) {

		/// Data Array
		String[] organizations;
		organizations = new String[3];
		organizations[0] = "UKM Cybertech PNP";

		/// Mengambil data di Array
		System.out.println(organizations[0]);

		/// Cara lain menulis Array
		String[] locates = new String[] {
				"Jl. Limau Manis"
		};

		String[] users = {

		};
		users[0] = "Topan Sidiq";

		/// Mengubah/menambah data di Array
		users[0] = "Topan";
		users[1] = "Sidiq";

		/// Mengakses panjang dari Array
		int arrayLength = users.length;

		/// Array dalam Array
		String[][] data = {
				{ "player 1" }, { "player 2" }, { "player 3" }, { "player 4" },
		};

		System.out.println(data[0][1]); // "player 2"
	}
}
