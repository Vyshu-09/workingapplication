import java.text.SimpleDateFormat;
import java.util.Date;

public class MarriageCertificate {

    // Declare variables for the marriage details
    private String husbandName;
    private String wifeName;
    private String marriageDate;
    private String marriageLocation;

    // Constructor to initialize the details of the marriage
    public MarriageCertificate(String husbandName, String wifeName, Date marriageDate, String marriageLocation) {
        this.husbandName = husbandName;
        this.wifeName = wifeName;
        // Format the marriage date into a readable format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        this.marriageDate = dateFormat.format(marriageDate);
        this.marriageLocation = marriageLocation;
    }

    // Method to generate the marriage certificate
    public void generateCertificate() {
        System.out.println("******************************");
        System.out.println("         MARRIAGE CERTIFICATE");
        System.out.println("******************************");
        System.out.println("Husband: " + husbandName);
        System.out.println("Wife: " + wifeName);
        System.out.println("Date of Marriage: " + marriageDate);
        System.out.println("Location: " + marriageLocation);
        System.out.println("******************************");
        System.out.println("This is to certify that the above-mentioned marriage has been solemnized.");
        System.out.println("******************************");
    }

    public static void main(String[] args) {
        // Create a marriage certificate instance with sample data
        String husbandName = "John Doe";
        String wifeName = "Jane Smith";
        Date marriageDate = new Date(); // Current date as marriage date
        String marriageLocation = "City Hall, Springfield";

        MarriageCertificate certificate = new MarriageCertificate(husbandName, wifeName, marriageDate, marriageLocation);
        // Generate the marriage certificate
        certificate.generateCertificate();
    }
}
