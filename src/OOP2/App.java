package OOP2;

public class App {
    public static void main(String[] args) {
        User userA = new User();
        userA.setFirstName("lolof");
        System.out.println(userA.getFirstName());

        User userB = new User();
        userB.setFirstName("Apple");
        System.out.println(userB.getFirstName());
    }
}
