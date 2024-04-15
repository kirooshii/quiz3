import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create a hotel with 10 rooms
        HotelManager hotelManager = new HotelManager(10);

        // Create a Person with your name and surname
        Person myself = new Person();
        myself.setId("MY_ID");
                // Get a list of persons from the PersonManager class
                List<Person> personsList = PersonManager.getPersons();

                // Check-in the hotel with myself and one of the persons from the list
                if (!personsList.isEmpty()) {
                    Person randomPerson = personsList.get(0); // Assuming the list is not empty
                    hotelManager.checkIn(1, myself); // Check myself into room 1
                    hotelManager.checkIn(2, randomPerson); // Check the random person into room 2
                } else {
                    System.out.println("No persons available to check-in.");
                }
        }

        // Print hotel guests and room information
        displayInfo();
    }
