import java.util.Scanner;
class HelperClass{
        int age;
        float height;
        String name, address;
        Scanner sc = new Scanner(System.in);
        void getInfoFromUser(){
            System.out.println("Enter a Name");
            name = sc.nextLine();
            System.out.println("Enter a Address");
            address = sc.nextLine();
            System.out.println("Enter a age");
            age = sc.nextInt();
            System.out.println("Enter a Height");
            height = sc.nextFloat();
        }
        void displayInfo(){
                    System.out.println("Name: "+ name + " Address: "+ address + " Age: "+ age + " Height: "+ height);
        }
}

public class BasicClass{
    public static void main(String[] args){
        HelperClass hc = new HelperClass();
        hc.getInfoFromUser();
        hc.displayInfo();  
    }

} 