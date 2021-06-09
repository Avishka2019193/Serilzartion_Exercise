import java.util.Date;

public class SecurityCredentials extends Member{
    private Long userID;
    private int pin;
    private Date dateCreated;
    private Date dateOfExpiration;

    public SecurityCredentials(Long memberID, Date dateOfRegistration, Date dateOfExpiration, SecurityCredentials credential, Long userID, int pin, Date dateCreated, Date dateOfExpiration1) {
        super(memberID, dateOfRegistration, dateOfExpiration, credential);
        this.userID = userID;
        this.pin = pin;
        this.dateCreated = dateCreated;
        this.dateOfExpiration = dateOfExpiration1;
    }
}
