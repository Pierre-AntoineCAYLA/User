import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	// crait les propriétés des utilisateurs
	public static void main(String[] args) {
		ArrayList<User> users1 = new ArrayList<User>();
		User u1 = new User("Jo", 10, true);
		users1.add(u1);
		User u2 = new User("Marie", 50, false);
		users1.add(u2);
		User u3 = new User("Reymon", 21, true);
		users1.add(u3);
		User u4 = new User("Claire", 21, false);
		users1.add(u4);
		User u5 = new User("Pierre", 24, true);
		users1.add(u5);
		User u6 = new User("Antoine", 37, true);
		users1.add(u6);
		User u7 = new User("Jean", 34, true);
		users1.add(u7);
		User u8 = new User("Sarah", 78, false);
		users1.add(u8);
		User u9 = new User("Carinne", 35, false);
		users1.add(u9);
		User u10 = new User("Thomas", 28, true);
		users1.add(u10);

		ArrayList<User> users2 = new ArrayList<User>();
		User v1 = new User("Jack", 10, true);
		users2.add(v1);
		User v2 = new User("Isabelle", 50, false);
		users2.add(v2);
		User v3 = new User("Gerard", 21, true);
		users2.add(v3);
		User v4 = new User("Annie", 21, false);
		users2.add(v4);
		User v5 = new User("Jeremy", 24, true);
		users2.add(v5);
		User v6 = new User("Luc", 37, true);
		users2.add(v6);
		User v7 = new User("Franck", 34, true);
		users2.add(v7);

		// fusionne les tableaux
		users1.addAll(users2);

		// permet de trier le tableau
		Collections.sort(users1, new Comparator<User>() {
			public int compare(User utilisteur1, User utilisateur2) {
				return u1.name.compareTo(u2.name);
			}
		});

		// permet de supprimer l'élément 3 du tableau (ici reymond)
		users1.remove(users1.indexOf(u3));

		// affiche le tableau avec un for
		for (int i = 0; i < users1.size(); i++) {
			System.out.println(users1.get(i));
		}

		System.out.println("\n\n\n");

		// affiche un tableau avec un iterator
		Iterator<User> iterator = users1.iterator();
		System.out.println(users1);
	}
}
