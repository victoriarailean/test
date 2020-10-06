import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date;

class Application {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	private static Date currentDate;

	public static void main(String args[]) throws Exception {
		ArrayList<User> users = new ArrayList<User>();

		currentDate = dateFormat.parse("30.09.2020");

		users.add(new User("John",      "Smith",     22, "js@mail.com", Status.NEW,      dateFormat.parse("18.09.2020")));
		users.add(new User("Gema",      "Maylis",    34, "gm@mail.com", Status.ACTIVE,   dateFormat.parse("12.05.2020")));
		users.add(new User("Karam",     "Quirin",    32, "kq@mail.com", Status.ACTIVE,   dateFormat.parse("10.08.2020")));
		users.add(new User("Jaakob",    "Lucretius", 54, "jl@mail.com", Status.NEW,      dateFormat.parse("30.09.2020")));
		users.add(new User("Eurydike",  "Ilu",       25, "ei@mail.com", Status.INACTIVE, dateFormat.parse("04.09.2020")));
		users.add(new User("Bada",      "Hanna",     31, "bh@mail.com", Status.INACTIVE, dateFormat.parse("01.05.2020")));
		users.add(new User("Madelaine", "Hasan",     41, "mh@mail.com", Status.NEW,      dateFormat.parse("28.09.2020")));

		System.out.println("Original users list:");

		printUsers(users);

		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Updated: users list:");

		updateStatus(users);

		printUsers(users);
	}

	private static void updateStatus(ArrayList<User> users) {
		for (User user : users)  
        { 
            Date diff = new Date(currentDate.getTime() - user.getTimestamp().getTime());
            Long daysSince = diff.getTime() / 1000 / 60 / 60 / 24;
            
            if((daysSince >= 1) && user.getStatus() == Status.NEW) {
            	user.setStatus(Status.ACTIVE);
            }

            if ((daysSince >= 30) && user.getStatus() == Status.INACTIVE) {
            	user.setStatus(Status.BLOCKED);
            }
        } 
    }

	private static void printUsers(ArrayList<User> users) {
		for (User user : users)  
        { 
            System.out.println(
            	user.getFirstname() + " ; " +
            	user.getLastname() +  " ; " +
            	user.getAge() + " ; " +
            	user.getStatus() + " ; " +
            	user.getTimestamp()     
            );
        } 
	}
}