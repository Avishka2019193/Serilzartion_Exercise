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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MemberEntranceRecord getMemberEntranceRecord() {
        return memberEntranceRecord;
    }

    public void setMemberEntranceRecord(MemberEntranceRecord memberEntranceRecord) {
        this.memberEntranceRecord = memberEntranceRecord;
    }

    public GuestEntranceRecord getGuestEntranceRecord() {
        return guestEntranceRecord;
    }

    public void setGuestEntranceRecord(GuestEntranceRecord guestEntranceRecord) {
        this.guestEntranceRecord = guestEntranceRecord;
    }
}
