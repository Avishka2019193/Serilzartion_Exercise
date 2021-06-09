
import java.sql.Time;
import java.util.Date;

public class EntranceRegister extends MemberEntranceRecord{
    private Date date;
    private MemberEntranceRecord memberEntranceRecord;
    private GuestEntranceRecord guestEntranceRecord;

    public EntranceRegister(String name, Date dateOfBirth, String nicNumber, Long memberID, Date dateOfRegistration, Date dateOfExpiration, SecurityCredentials credential, Member member, Time timeArrived, Time timeLeft, Date date, MemberEntranceRecord memberEntranceRecord, GuestEntranceRecord guestEntranceRecord) {
        super(name, dateOfBirth, nicNumber, memberID, dateOfRegistration, dateOfExpiration, credential, member, timeArrived, timeLeft);
        this.date = date;
        this.memberEntranceRecord = memberEntranceRecord;
        this.guestEntranceRecord = guestEntranceRecord;
    }
}
