import java.util.Date;

public class Member extends Person {
    private Long memberID;
    private Date dateOfRegistration;
    private Date dateOfExpiration;
    private SecurityCredentials credential;

    public Member(String name, Date dateOfBirth, String nicNumber, Long memberID, Date dateOfRegistration, Date dateOfExpiration, SecurityCredentials credential) {
        super(name, dateOfBirth, nicNumber);
        this.memberID = memberID;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpiration = dateOfExpiration;
        this.credential = credential;
    }
}
