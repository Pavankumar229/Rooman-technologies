package Vehicle;
import java.util.*;
public class user extends VehicleList{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to garage");
        System.out.println();
        System.out.println("Sign up");
        System.out.println("Please enter your username");
        String userName=sc.nextLine();
        // System.out.println("Enter Your pasword");
        // String password=sc.nextLine();
        System.out.println("login Sucessfull__Welcome "+userName);
        System.out.println("list of vehicles");
        VehicleList v1=new VehicleList();
        VehicleList v2=new VehicleList();
        VehicleList v3=new VehicleList();
        v1.add("Gt 650",2020,450000);
        v2.add("NS200",2019,170000);
        v3.add("RTR 300 ",2021,200000);
        v1.show();
        v2.show();
        v2.show();
System.out.println("Sort by price : 1");
System.out.println("Sort by year : 2");
int x=sc.nextInt();
if (x==1){
v2.show();
v3.show();
v1.show();
}
else if(x==2){
    v3.show();;
    v1.show();
    v2.show();
}
else{
    System.err.println("invalid input");
}
sc.close();
    }
}
