package FakerAPI;
import com.github.javafaker.Faker;

public class Testdata {

	    public static void main(String[] args) {
	        Faker faker = new Faker();

	        String name = faker.name().fullName();
	        String email = faker.internet().emailAddress();
	        String phone = faker.phoneNumber().phoneNumber();

	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Phone: " + phone);
	    }
	}

