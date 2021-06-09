import java.util.Date;

public class Member extends Person {
    private Long memberID;
    private Date dateOfRegistration;
    private Date dateOfExpiration;
    private SecurityCredentials credential;

    public Member(Long memberID, Date dateOfRegistration, Date dateOfExpiration, SecurityCredentials credential) {
        this.memberID = memberID;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpiration = dateOfExpiration;
        this.credential = credential;
    }
}
