import java.sql.Time;
import java.util.Date;

public class MemberEntranceRecord extends Member{
    private Member member;
    private Time timeArrived;
    private Time timeLeft;

    public MemberEntranceRecord(String name, Date dateOfBirth, String nicNumber, Long memberID, Date dateOfRegistration, Date dateOfExpiration, SecurityCredentials credential, Member member, Time timeArrived, Time timeLeft) {
        super(name, dateOfBirth, nicNumber, memberID, dateOfRegistration, dateOfExpiration, credential);
        this.member = member;
        this.timeArrived = timeArrived;
        this.timeLeft = timeLeft;
    }
}
