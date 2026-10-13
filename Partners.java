package MyApplication;
import java.util.Scanner;
public class Partners extends User {
    Scanner sc=new Scanner(System.in);
    User Instance;
    private String $resturantName;
    Partners(String $mobileNumber, String $password, String $name, String $Location, String $resturantName){
        this.$resturantName=$resturantName;
        Instance =new User($mobileNumber,$password,$name,$Location);
        setFoodList($Location);
    }
    void setFoodList(String $Location){
        System.out.print("Enter Your Resturant Name");
        String ResName=sc.nextLine();
        System.out.print("Enter Food 1 :");
        String F1=sc.nextLine();
        System.out.print("Enter Price of Food ! :");
        int p1=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Food 2 :");
        String F2=sc.nextLine();
        System.out.print("Enter price of Food 2");
        int p2=sc.nextInt();
        Region Patner1=new Region($Location,ResName,F1,F2,p1,p2);
    }
}
