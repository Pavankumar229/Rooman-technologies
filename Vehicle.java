package Vehicle;

public class VehicleList {
    String name;
    int year;
    int price;

    void add(String name,int year,int price){
        this.name=name;
        this.year=year;
        this.price=price;
    }
    void show(){
        System.out.println(name +"  "+ year +"  "+ price);
    }
   
    public static void main(String[] args) {
        VehicleList v1=new VehicleList();
        VehicleList v2=new VehicleList();
        VehicleList v3=new VehicleList();
        v1.add("Gt 650",2020,450000);
        v2.add("NS200",2019,170000);
        v3.add("RTR 300 ",2021,200000);

    }
}
