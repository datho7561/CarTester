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
     * pre: none
     * post: a new car is created
     * @param carMake The brand of the car
     * @param carModel The model of the car
     * @param carYear The year of the car
     * @param carPrice The car's price
     * @param carLength The length of the car
     * @param carWidth The width of the car
     */
    public Car(String carMake, String carModel, int carYear, double carPrice, double carLength, double carWidth) {
        make = carMake;
        model = carModel;
        year = carYear;
        price = carPrice;
        length = carLength;
        width = carWidth;
    }
    
    /**
     * Creates a new car with the average car's length and width.
     * pre: none
     * post: a new car is created
     * @param carMake The brand of the car
     * @param carModel The model of the car
     * @param carYear The year of the car
     * @param carPrice The car's price
     */
    public Car(String carMake, String carModel, int carYear, double carPrice) {
        this(carMake, carModel, carYear, carPrice, 3.5, 2);
    }
    
    /**
     * Creates a car with unknown brand and model, a random year between 1990 and 2016,
     * and a price of $20,000.
     * pre: none
     * post: a new car is created
     */
    public Car() {
        this("Unknown Brand", "Unknown Model", 1990 + (int)(Math.random()*17), 20000.0);
    }
    /**
     * Honks the car's horn.
     * pre: none
     * post: "BEEP, BEEP!" output to chat
     */
    public void honk() {
        System.out.println("BEEP, BEEP!");
    }
    
    /**
     * Prints out information describing the car.
     * @return The year, make, model, length and width, and price of the car
     */
    @Override
    public String toString() {
        String strRep = "";
        strRep += year + " " + make + " " + model + ", " + length + "m x " + width + "m, $" + price; 
        return strRep;
    }
}
