import java.util.Date;

public class SecurityCredentials extends Member{
    private Long userID;
    private int pin;
    private Date dateCreated;
    private Date dateOfExpiration;

    public SecurityCredentials(String name, Date dateOfBirth, String nicNumber, Long memberID, Date dateOfRegistration, Date dateOfExpiration, SecurityCredentials credential, Long userID, int pin, Date dateCreated, Date dateOfExpiration1) {
        super(name, dateOfBirth, nicNumber, memberID, dateOfRegistration, dateOfExpiration, credential);
        this.userID = userID;
        this.pin = pin;
        this.dateCreated = dateCreated;
        this.dateOfExpiration = dateOfExpiration1;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    @Override
    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }
}
