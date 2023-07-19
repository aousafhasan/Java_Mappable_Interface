import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String usersDOB = "1999";
//        int dob = Integer.parseInt(usersDOB);
//        int currYear = 2023;
//        System.out.println("Enter your dob");
//        usersDOB = sc.nextLine();
//        while (true){
//            if((currYear - Integer.parseInt(usersDOB) < 0) || (currYear - Integer.parseInt(usersDOB) > 120) )
//            {   System.out.println("Please enter proper DOB");
//                usersDOB = sc.nextLine();
//            }
//            else {
//                break;
//            }
//        }
//        System.out.println("Your age is " + (currYear-Integer.parseInt(usersDOB)) + " years");
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        
        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for(var m: mappables){
            Mappable.mapIt(m);
        }
    }
}
