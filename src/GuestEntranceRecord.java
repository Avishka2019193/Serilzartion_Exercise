import java.sql.Time;

public class GuestEntranceRecord extends Guest{
    private  Guest guest;
    private String purpose;
    private Time timeArrived;
    private Time timeLeft;

    public GuestEntranceRecord(Long guestID, Guest guest, String purpose, Time timeArrived, Time timeLeft) {
        super(guestID);
        this.guest = guest;
        this.purpose = purpose;
        this.timeArrived = timeArrived;
        this.timeLeft = timeLeft;
    }
}
