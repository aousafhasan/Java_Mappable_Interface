import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usersDOB = "1999";
        int dob = Integer.parseInt(usersDOB);
        int currYear = 2023;
        System.out.println("Enter your dob");
        usersDOB = sc.nextLine();
        while (true){
            if((currYear - Integer.parseInt(usersDOB) < 0) || (currYear - Integer.parseInt(usersDOB) > 120) )
            {   System.out.println("Please enter proper DOB");
                usersDOB = sc.nextLine();
            }
            else {
                break;
            }
        }
        System.out.println("Your age is " + (currYear-Integer.parseInt(usersDOB)) + " years");
    }
}
