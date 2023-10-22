
public class Greeting {

	private static String name;
	private int age;

	public Greeting(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static Greeting message(String name, int age) {
		return new Greeting(name, age);

	}

	public static String getName() {
		try {
			return name;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Greeting g1 = Greeting.message("kiran", 24);
		Greeting g2 = Greeting.message("leo", 34);

		System.out.println("Hi your name is " + g1.getName() + " your Age is " + g1.getAge());
		System.out.println("Hi your name is " + Greeting.getName() + " your Age is " + g1.getAge());


	}

}
