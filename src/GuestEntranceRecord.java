import java.sql.Time;
import java.util.Date;

public class GuestEntranceRecord extends Guest{
    private  Guest guest;
    private String purpose;
    private Time timeArrived;
    private Time timeLeft;

    public GuestEntranceRecord(String name, Date dateOfBirth, String nicNumber, Long guestID, Guest guest, String purpose, Time timeArrived, Time timeLeft) {
        super(name, dateOfBirth, nicNumber, guestID);
        this.guest = guest;
        this.purpose = purpose;
        this.timeArrived = timeArrived;
        this.timeLeft = timeLeft;
    }
}
