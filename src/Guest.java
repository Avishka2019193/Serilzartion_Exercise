import java.util.Date;

public class Guest extends Person{
    private Long guestID;

    public Guest(String name, Date dateOfBirth, String nicNumber, Long guestID) {
        super(name, dateOfBirth, nicNumber);
        this.guestID = guestID;
    }
}
