import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class User {
	//declaration de variable
	String name;
	Integer age;
	boolean isMale=false;
	String sex;

	//initialisation des propriété de l'utilisaeur
	public User(String name, Integer age, boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	
	//permet de retourner un texte et de déclarer le sex
	public String toString() {	
		if(this.isMale==true)
			 this.sex="un Homme";
		else this.sex="une Femme";
			return "Je m'appele "+this.name+" j'ai "+this.age+"ans et je suis "+this.sex+"\n";
		
	}
	
	//crait les propriétés des utilisateurs
	public static void main(String[] args){
	ArrayList<User>users=new ArrayList();
	User u1= new User("Jo", 10, true);
	users.add(u1);
	User u2= new User("Marie", 50, false);
	users.add(u2);
	User u3= new User("Reymon", 21, true);
	users.add(u3);
	User u4= new User("Claire", 21, false);
	users.add(u4);
	User u5= new User("Pierre", 24, true);
	users.add(u5);
	User u6= new User("Antoine", 37, true);
	users.add(u6);
	User u7= new User("Jean", 34, true);
	users.add(u7);
	User u8= new User("Sarah", 78, false);
	users.add(u8);
	User u9= new User("Carinne", 35, false);
	users.add(u9);
	User u10= new User("Thomas", 28, true);
	users.add(u10);
	
	//permet de trier le tableau
	Collections.sort(users, new Comparator<User>(){
	    public int compare(User u1, User u2){
	      return u1.name.compareTo(u2.name);
	    }
	    });
	
	//permet de supprimer l'élément 3 du tableau (ici reymond) 
	users.remove(users.indexOf(u3));
	
	//affiche le tableau
	for(int i=0; i<users.size();i++) {
	System.out.println(users.get(i));	
	}
	
	
	}
}