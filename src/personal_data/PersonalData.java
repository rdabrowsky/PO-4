package personal_data;

public class PersonalData {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 15);
        person1.ShowData();
        System.out.println("----------------------------------------");

        Person person2 = new Person("Test", "Doe");
        person2.ShowData();
        System.out.println("----------------------------------------");

        person2.firstName = "Adam";
        person2.age = 12;

        person2.ShowData();

        System.out.println("----------------------------------------");
    }
}
