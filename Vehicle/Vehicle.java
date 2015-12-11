/**
 * @author: Cruze McFarlane
 * ID #:   620040546
 * Project 1 : A simple class for demonstration of how to use classes and objects
 */
import java.text.NumberFormat;

public class Vehicle
{
    enum Colour{Red, White, Blue, Black, Silver} //The available colour of vehicles
    
    private String name;
    private String model;
    private int year;
    private Colour colours;
    private double cost;
    private int quantity;
    private double sellingPrice;
        
    private int sold; //Variable used to determine # of vehicle sold
    
    /**
     * Constructor #1 - initialize class variables through formal parameter
     */
    public Vehicle(String name, String model, int year, int colours, double cost)
    {
        this.name = name;
        this.model = model;
        this.year = year;
        setColour(colours);
        this.cost = cost;
        
        quantity = 0;
        sellingPrice = 0;
        
        sold = 0;
    }
    
    /**
     * Constructor #2 - initialize class variables through formal parameter
     */
    public Vehicle(String name, String model, int quantity, double cost, int colours, String regNum)
    {
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.cost = cost;
        setColour(colours);
                
        sellingPrice = this.cost;  
        
        sold = 0;
    }
    
    /**
     * choose to vehicle colour
     * @param colours colours to select
     * @return void
     */
    public void setColour(int colours)
    {
        if (colours == 0)
        {
            this.colours = Colour.Red;
        }
        
        else if(colours == 1)
        {
            this.colours = Colour.White;
        }
        
        else if(colours == 2)
        {
            this.colours = Colour.Blue;
        }
        
        else if(colours == 3)
        {
            this.colours = Colour.Black;
        }
        
        else if(colours == 4)
        {
            this.colours = Colour.Silver;
        }
        
        else
        {
            System.out.println("\nInvalid!\n");
        }
    }
    
    /**
     * choose to which year required
     * @param year year of the vehicle
     * @return void
     */
    public void setYear(int year)
    {
        this.year = year;
    }
    
    
    /**
     * show the vehicle name 
     * @param none
     * @return name of vehicle
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * show selling price of vehicle
     * @param none
     * @return the selling price
     */
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    
    /**
     * calculate the selling price of the vehicle
     * @param markup markup/profit on the vehicle 
     * @return the selling price
     */
    public double calSellingPrice(int markup)
    {
        return sellingPrice += (sellingPrice *((double) markup / 100.0));        
    }
    
    /**
     * update the remaining quantity after sale, and the amount sold
     * @param amt the number of vehicles sold
     * @return the amount sold if anny
     */
    public int updateQuantity(int amt)
    {
        if((quantity - sold) > 0)
        {
            quantity -= amt;
            sold += amt;
            return sold;
        }
        
        else
        {
            return -1;
        }
    }
    
    /**
     * display the data held on vehicle
     * @param none
     * @return the data on vehicle
     */
    public String toString()
    {
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        return  ("\nVehicle \t" + "\t<<"+ name +">>" + "\t<<"+ model +">>"+ "\t<<"+ year +">>")+
                ("\nColour\t\t\t:" + "\t\t<<"+ colours.name() +">>")+
                ("\nOriginal Cost\t\t:" + "\t\t<<"+ curr.format(cost) +">>")+ 
                ("\nSelling Price\t\t:" + "\t\t<<"+ curr.format(sellingPrice) +">>")+ 
                ("\nQuantity in Stock\t:" +  "\t\t<<"+ quantity +">>");
    }
}