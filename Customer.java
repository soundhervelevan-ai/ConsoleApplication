package MyApplication;
import java.util.Scanner;
public class Customer extends User{
    User Instance;
    Scanner sc=new Scanner(System.in);
    Customer(String $mobileNumber,String $password,String $name, String $Location ){
        Instance=new User($mobileNumber,$password,$name,$Location);
    }
    void OpenApplication(){
        boolean isExit=false;
        while(!isExit){
            System.out.print("Press 1 for Order Food \nPress 2 to change Location \nPress 3 to Exit the Application \nEnter your Choice :");
            switch(sc.nextInt()){
                case 1:
                    //order food
                    Region cus1=new Region(get$Location());
                    cus1.OpenApplication();
                    break;
                case 2:
                    System.out.println("Your current Location is "+get$Location());
                    System.out.print("Update to :");
                    System.out.print("Choose your Location \nPress 1 if your Location is Coimbatore \nPress Any number if Erode");
                    String $Location="Erode";
                    switch(sc.nextInt()){
                        case 1:
                            $Location="Coimbatore";
                            break;
                    }
                    Instance.changeLocation($Location);
                    //change location
                    break;
                case 3:
                    //Exit application
                    System.out.print("Are you want to Exit the Application \nPress 1 to Confirm the Action");
                    switch(sc.nextInt()) {
                        case 1:
                            isExit = true;
                            System.out.println("Exiting the Application \nCome back Again ");
                            break;
                    }
                    break;
                default :
                    System.out.println("Enter a valid Option--->");
            }
        }
    }
}
