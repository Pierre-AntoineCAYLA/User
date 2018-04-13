import java.util.ArrayList;

public class User {
	//declaration de variable
	String name;
	Integer age;
	boolean isMale=false;
	String sex;
	
	
	public User(String name, Integer age, boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	
	public String toString() {	
		if(this.isMale==true)
			 this.sex="un Homme";
		else this.sex="une Femme";
			return "Je m'appele "+this.name+" j'ai "+this.age+"ans et je suis "+this.sex+"\n";
			
	}
	
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
	
	for(int i=0; i<users.size();i++)
	System.out.println(users.get(i));	
	}
	
}