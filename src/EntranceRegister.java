
import java.util.Date;

public class EntranceRegister extends MemberEntranceRecord{
    private Date date;
    private MemberEntranceRecord memberEntranceRecord;
    private GuestEntranceRecord guestEntranceRecord;

    public EntranceRegister(Date date, MemberEntranceRecord memberEntranceRecord, GuestEntranceRecord guestEntranceRecord) {
        this.date = date;
        this.memberEntranceRecord = memberEntranceRecord;
        this.guestEntranceRecord = guestEntranceRecord;
    }
}
