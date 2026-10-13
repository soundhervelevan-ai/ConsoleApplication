package MyApplication;
import java.util.Scanner;
public class Main {
   static String setNumber(Scanner sc){
        sc.nextLine();
        System.out.print("Enter your Mobile Number : ");
        return sc.nextLine();
    }
    static String setPassword(Scanner sc){
        System.out.print("Enter your Password : ");
        return sc.nextLine();
    }
    static String setName(Scanner sc){
        System.out.print("Enter your Name : ");
        return sc.nextLine();
    }
    static String setLocation(Scanner sc){
        System.out.print("Choose your Location \nPress 1 if your Location is Coimbatore \nPress Any number if Erode");
        String $Location="Erode";
        switch(sc.nextInt()){
            case 1:
                $Location="Coimbatore";
                break;
        }
        return $Location;
    }
    static String setResturantName(Scanner sc){
       return sc.nextLine();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean isLoggedIn=false;
        while(!isLoggedIn){
            System.out.println("-------------------Login---------------");
            System.out.println("Enter 1 for Loggin in as Customor : \nEnter 2 for Login in as Patner : ");
            switch(sc.nextInt()){
                case 1:
                    Customer c1=new Customer(setNumber(sc),setPassword(sc),setName(sc),setLocation(sc));
                    isLoggedIn=true;
                    c1.OpenApplication();
                    break;
                case 2:
                    Partners p1=new Partners(setNumber(sc),setPassword(sc),setName(sc),setLocation(sc),setResturantName(sc));
                   // isLoggedIn=true;
                    break;
                default :
                    System.out.println("Enter a valid option ");
            }
        }
        //After Loggin
    }
}

