package MyApplication;
import java.util.Scanner;
public class Region {
    String CusLocation;
    Scanner sc=new Scanner(System.in);
    Location[] res=new Location[4];
     static Location res1;
      Region(String CusLocation) {
          this.CusLocation=CusLocation;
          res[0]=new Location("Erode", "Dhanabal", "Bryani", "Barota", 120,60);
          res[1]=new Location("Erode","Murugasen","Chapati","Fried Rice",50,120);
          res[2]=new Location("Coimbatore","Saravana Bhavan","Dosa","Idly",100,50);
          res[3]=new Location("Coimbatore","Vasantham","Tomato Rice","Curd Rice",60,45);
      }
      Region(String location,String ResName,String F1,String F2,int p1,int p2){
          res1=new Location(location,ResName,F1,F2,p1,p2);
      }
      void OpenApplication(){
          boolean isExit=false;
          while(!isExit){
              if(res1 !=null && res1.$Location.equals(CusLocation)) {
                  res1.Orders(sc);

                  if (res1.isOrdered) {
                      res1.isOrderedInHotel(sc);
                  }
              }
              for(int i=0;i<4;i++){
                  if(res[i].$Location.equals(CusLocation)){
                      System.out.println("Hotel Name :"+res[i].ResturantName);
                      res[i].Orders(sc);
                      if(res[i].isOrdered){
                          res[i].isOrderedInHotel(sc);//review
                      }
                  }
              }
              isExit=true;
          }
      }
    }
class Location extends Resturants{
      String $Location;

      Location(String $Location,String ResturantName,String F1,String F2,int p1,int p2){
          this.$Location=$Location;
          super(ResturantName,F1,F2,p1,p2);
          }
      }

class Resturants {
    String ResturantName;
    boolean isOrdered=false;
    FoodLists[] foods=new FoodLists[2];
    Resturants(String ResturantName,String F1,String F2,int p1,int p2){
        this.ResturantName=ResturantName;
        foods[0]=new FoodLists(F1,p1);
        foods[1]=new FoodLists(F2,p2);
    }
    void isOrderedInHotel(Scanner sc){
        boolean isExit=false;
        while(!isExit){
            System.out.println("Enter 1 to give review \n enter any number to exit ");
            switch(sc.nextInt()){
                case 1:
                    System.out.print("Give Reviews :");
                    sc.nextLine();
                    String s=sc.nextLine();
                    System.out.println("Thanks for your Review :"+s);
                    isExit=true;
                    break;
                default :
                    System.out.println("Thank You");
                    isExit=true;
            }
        }
    }
    void Orders(Scanner sc){
        boolean isExit=false;
        while(!isExit) {
        System.out.println("Enter 1 to Order :"+foods[0].Food+"\nPrice :"+foods[0].prise);
        System.out.println("Enter 2 to Order :"+foods[1].Food+"\nPrice :"+foods[1].prise);
        System.out.println("Enter 3 to exit the Hotel :");
        System.out.print("Enter your choise :");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("you Ordered " + foods[0].Food + " Costs :" + foods[0].prise);
                    isOrdered=true;
                    break;
                case 2:
                    System.out.println("your Ordered :"+foods[1].Food + " Costs " + foods[1].prise);
                    isOrdered=true;
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.out.println("Enter a Valid Options-->");
            }
        }
        }
    }

class FoodLists{
    String Food;
    int prise;
    FoodLists(String Food,int Prise){
        this.Food=Food;
        this.prise=Prise;
    }
}
