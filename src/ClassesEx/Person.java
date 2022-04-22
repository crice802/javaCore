package ClassesEx;

public class Person {
	String name;
	int age;
	String company;
	String job;
	String hobby;

	public Person(String name, int age, String company, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.job = job;
		this.hobby = hobby;
	}

	public Person(String newName) {
		name = newName;
	}

	public Person(String newName, int newAge) {
		this(newName);
		age = newAge;
	}

	public void talkAboutYourself() {
		System.out.println("Hi, I'm " + name + ".");
		System.out.println("I'm " + age + " years old.");
		System.out.println("I work at " + company + " as a " + job + ".");
		System.out.println("When I get some free time, I like to " + hobby + ".");
	}
}
