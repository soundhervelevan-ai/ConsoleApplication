package MyApplication;
public class User {
    private String $mobileNumber;
    private String $Password;
    private String $name="Guest";
    private String $Location="Erode";
          User(){
              //default
          }
          User(String $mobileNumber,String $Password,String $name,String $Location) {
              this.$mobileNumber = $mobileNumber;
              this.$Password = $Password;
              this.$name=$name;
              this.$Location=$Location;
          }
          void changeLocation(String $Location){
              this.$Location=$Location;
          }
          String get$Location(){
              return $Location;
          }
}
