package ie.atu;

public class TestPerson {
    public static void main(String[] args) {
        Person dave = new Person();
        dave.setName("Dave");
        dave.setAddress("Mervue");
        dave.setNumber("1234");

        System.out.println("Here are Daves details " + dave.toString() );

        Customer myCust = new Customer( "Devin",  "Mervue",  "1234" ,  "abc1234",  true);

        System.out.println("Details " + myCust.toString());



    }
}
