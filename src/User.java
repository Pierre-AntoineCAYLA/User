public class User {
	// declaration de variable
	String name;
	Integer age;
	boolean isMale = false;
	String sex;

	// initialisation des propri�t� de l'utilisaeur
	public User(String name, Integer age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	// permet de retourner un texte et de d�clarer le sex
	public String toString() {
		if (this.isMale == true)
			this.sex = "un Homme";
		else
			this.sex = "une Femme";
		return "Je m'appele " + this.name + " j'ai " + this.age + "ans et je suis " + this.sex + "\n";

	}

}