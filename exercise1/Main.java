import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
         
        Singers singer1 = new Singers();
        
        
        System.out.println("Singer 1 default values:");
        System.out.println("Singer's id: " + singer1.getSingerId());
        System.out.println("Singer's name: " + singer1.getSingerName());
        System.out.println("Singer's address: " + singer1.getSingerAddress());
        System.out.println("Date of birth: " + singer1.getDateOfBirth());
        System.out.println("Albums: " + singer1.getNumberOfAlbumsPublished());
       
        LocalDate dob = LocalDate.of(1970, 1, 1);
        singer1.setSingerDetails(1, "John Doe", "123 Main St", dob, 5);
        
        
        System.out.println("Singer 1 updated values:");
        System.out.println("Singer's id: " + singer1.getSingerId());
        System.out.println("Singer's name: " + singer1.getSingerName());
        System.out.println("Singer's address: " + singer1.getSingerAddress());
        System.out.println("Date of birth: " + singer1.getDateOfBirth());
        System.out.println("Albums: " + singer1.getNumberOfAlbumsPublished());
        
        
        
        dob = LocalDate.of(1980, 3, 3);
        singer1.setSingerId(2);
        singer1.setSingerName("Jane Smith");
        singer1.setSingerAddress("456 Park Ave");
        singer1.setDateOfBirth(dob);
        singer1.setNumberOfAlbumsPublished(8);
        
   
        System.out.println("Singer 1 final values:");
        System.out.println("Singer's id: " + singer1.getSingerId());
        System.out.println("Singer's name: " + singer1.getSingerName());
        System.out.println("Singer's address: " + singer1.getSingerAddress());
        System.out.println("Date of birth: " + singer1.getDateOfBirth());
        System.out.println("Albums: " + singer1.getNumberOfAlbumsPublished());
    }
}
