import java.time.LocalDate;

public class User {

    // Fields (protected ตามโจทย์)
    protected String name;
    protected LocalDate dob;

    // User() -> name=null, dob=LocalDate.now()
    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    // User("Sylvester", 1946, 7, 6) -> dob = LocalDate.of(...)
    public User(String name, int year, int month, int date) {
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
    }

    public boolean isBirthday() {
        if(LocalDate.now().getMonth() == this.dob.getMonth() && LocalDate.now().getDayOfMonth() == this.dob.getDayOfMonth()) {
            return true;
        } else {
            return false;
        }
    }

    // displayInfo()
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}