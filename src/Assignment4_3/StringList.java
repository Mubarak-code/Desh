package Assignment4_3;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecretClass secretClass = new SecretClass();

		secretClass.add("Bob");
		System.out.println("The list of size " + secretClass.size() + " is " + secretClass.toString());
		
		secretClass.add("Steve");
		System.out.println("The list of size " + secretClass.size() + " is " + secretClass.toString());
		
		secretClass.add("Susan");
		System.out.println("The list of size " + secretClass.size() + " is " + secretClass.toString());
		
		secretClass.add("Mark");
		System.out.println("The list of size " + secretClass.size() + " is " + secretClass.toString());
		
		secretClass.add("Bob");
		System.out.println("The list of size " + secretClass.size() + " is " + secretClass.toString());
		
		
		
		
		
		
		System.out.println(secretClass.remove("Bob"));
		System.out.println(secretClass.find("Susan"));

	}

}
