/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author DaTho7561
 */
public class Car {
    
    private String make, model;
    private int year;
    private double price, length, width;
    
    /**
     * Creates a new car with the given parameters as properties.
     * @param carMake The brand of the car
     * @param carModel
     * @param carYear
     * @param carPrice
     * @param carLength
     * @param carWidth 
     */
    public Car(String carMake, String carModel, int carYear, double carPrice, double carLength, double carWidth) {
        make = carMake;
        model = carModel;
        year = carYear;
        price = carPrice;
        length = carLength;
        width = carWidth;
    }
    
    public Car(String carMake, String carModel, int carYear, double carPrice) {
        this(carMake, carModel, carYear, carPrice, 3.5, 2);
    }
    
    /**
     * Default constructor.
     * pre: none
     * post: a new boring car is made
     */
    public Car() {
        this("Unknown Brand", "Unknown Model", 1990 + (int)(Math.random()*17), 20000.0);
    }
    
    public void honk() {
        System.out.println("BEEP, BEEP!");
    }
    
    @Override
    public String toString() {
        String strRep = "";
        strRep += year + " " + make + " " + model + ", " + length + "m x " + width + "m, $" + price; 
        return strRep;
    }
}
