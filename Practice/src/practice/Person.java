package practice;

public class Person {

	public static void main(String[] args) {
	

		Person p= new Person();
		System.out.println(p.kid("Ashu", "31", "Basketball"));
		System.out.println(p.women("Anita", "56", "Sharayu"));
		System.out.println(p.man("Jivan", "61"));
	}

	public String man(String name, String age)
	{
		return name + age;
	}
	
	public String women(String name, String age, String kid)
	{
		return name + age + kid;
	}
	
	public String kid(String name, String age, String play)
	{
		return name + age + play;
	}
	
}
