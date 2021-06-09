import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String nicNumber;

    public Person(String name, Date dateOfBirth, String nicNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nicNumber = nicNumber;
    }
}
