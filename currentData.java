import java.time.LocalDate;
import java.util.*;

public class currentData {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        List<String> date = Arrays.asList(localDate.toString().split("-"));
        switch(date.get(1)){
            case "01":
                System.out.println("January " + date.get(2) + ", " + date.get(0));
                break;
            case "02":
                System.out.println("Febrary " + date.get(2) + ", " + date.get(0));
                break;
            case "03":
                System.out.println("March " + date.get(2) + ", " + date.get(0));
                break;
            case "04":
                System.out.println("April " + date.get(2) + ", " + date.get(0));
                break;
            case "05":
                System.out.println("May " + date.get(2) + ", " + date.get(0));
                break;
            case "06":
                System.out.println("June " + date.get(2) + ", " + date.get(0));
                break;
            case "07":
                System.out.println("July " + date.get(2) + ", " + date.get(0));
                break;
            case "08":
                System.out.println("Agoust " + date.get(2) + ", " + date.get(0));
                break;
            case "09":
                System.out.println("September " + date.get(2) + ", " + date.get(0));
                break;
            case "10":
                System.out.println("October " + date.get(2) + ", " + date.get(0));
                break;
            case "11":
                System.out.println("November " + date.get(2) + ", " + date.get(0));
                break;
            case "12":
                System.out.println("December " + date.get(2) + ", " + date.get(0));
                break;
        }
    }
}
