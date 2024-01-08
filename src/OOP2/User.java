package OOP2;

public class User {

    // PROPRIEDADES (PRIVATE)
    private String firstName;
    private String lastName;
    //SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();//this refere se ao firstName do objeto
    }
    //GETTER
    public String getFirstName() {
        return firstName;
    }
}
