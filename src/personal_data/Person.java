package personal_data;

public class Person {
    public String firstName;
    public String lastName;
    public int age;


    /*
    *   Constructors - 3 overloads
    * */

    public Person(String firstName, String lastName, int age) { // First constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String _firstName, String _lastName) { // Second constructor
        firstName = _firstName;
        lastName = _lastName;
    }
    public Person() {} // Third constructor - empty


    /*
    * Methods
    * */

    public void ShowData() {
        System.out.println("Person");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + this.age);
    }
}
