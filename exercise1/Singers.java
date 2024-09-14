import java.time.LocalDate;

public class Singers {
    
    private int singerId;
    private String singerName;
    private String singerAddress;
    private LocalDate dateOfBirth;
    private int numberOfAlbumsPublished;

    
    public Singers() {
        this.singerId = 0;
        this.singerName = null;        
        this.singerAddress = null;     
        this.dateOfBirth = null;       
        this.numberOfAlbumsPublished = 0;
    }

   
    public Singers(int singerId) {
        this();
        this.singerId = singerId;
    }

  
    public Singers(int singerId, String singerName) {
        this(singerId);
        this.singerName = singerName;
    }


    public Singers(int singerId, String singerName, String singerAddress) {
        this(singerId, singerName);
        this.singerAddress = singerAddress;
    }

    
    public Singers(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth) {
        this(singerId, singerName, singerAddress);
        this.dateOfBirth = dateOfBirth;
    }


    public Singers(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth, int numberOfAlbumsPublished) {
        this(singerId, singerName, singerAddress, dateOfBirth);
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

  
    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfAlbumsPublished() {
        return numberOfAlbumsPublished;
    }

    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }


    public void setSingerDetails(int singerId, String singerName, String singerAddress, LocalDate dateOfBirth, int numberOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

   
    public void displaySingerDetails() {
        System.out.println("Singer ID: " + singerId);
        System.out.println("Singer Name: " + singerName);
        System.out.println("Singer Address: " + singerAddress);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Albums Published: " + numberOfAlbumsPublished);
    }
}
