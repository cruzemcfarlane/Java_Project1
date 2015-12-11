import java.util.*;

public class Seller
{
    public static void main(String[] arg)
    {
        String name;
        String model;
        int year;
        int colours;
        double cost;
        int quantity;
        double sellingPrice;
        String regNum;
        int markup;
        int amt;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter vehicle name: ");
        name = scan.nextLine();
        
        System.out.print("\nEnter registration number: ");
        regNum = scan.nextLine();
        
        System.out.print("\nEnter model: ");
        model = scan.nextLine();
        
        System.out.print("\nEnter year: ");
        year = scan.nextInt();
        
        System.out.print("\nEnter quantity: ");
        quantity = scan.nextInt();
        
        System.out.print("\nEnter cost: ");
        cost = scan.nextDouble();
        
        System.out.print("\nEnter amt: ");
        amt = scan.nextInt();
        
        System.out.print("\nEnter colour value: ");
        colours = scan.nextInt();
        
        System.out.print("\nEnter markup price: ");
        markup = scan.nextInt();
                                                       
        Vehicle cars = new Vehicle(name, model, quantity, cost, colours, regNum);
        
        cars.calSellingPrice(markup) ;
        cars.setYear(year);
        cars.updateQuantity(amt);
        cars.setColour(0);
        
        System.out.print("\n\n"+cars.toString());
    }
}