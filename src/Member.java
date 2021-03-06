import java.util.Date;

public class Member extends Person {
    private Long memberID;
    private Date dateOfRegistration;
    private Date dateOfExpiration;
    private String credential;

    public Member(String name, Date dateOfBirth, String nicNumber, Long memberID, Date dateOfRegistration, Date dateOfExpiration, String credential) {
        super(name, dateOfBirth, nicNumber);
        this.memberID = memberID;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpiration = dateOfExpiration;
        this.credential = credential;
    }

    public Long getMemberID() {
        return memberID;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }
}
