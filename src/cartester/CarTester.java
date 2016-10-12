/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

import java.util.Scanner;

/**
 *
 * @author DaTho7561
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare some cars
        Car randomCar, coolCar, neatoCar;
        
        // make a scanner to get input
        Scanner sc = new Scanner(System.in);
        
        // make some variables to store the first car's values
        String coolCarMake, coolCarModel;
        int coolCarYear;
        double coolCarPrice, coolCarLength, coolCarWidth;
        
        // Get the user's input
        System.out.println("Please enter the make:");
        coolCarMake = sc.nextLine();
        System.out.println("Please enter the model:");
        coolCarModel = sc.nextLine();
        System.out.println("Please enter the year:");
        coolCarYear = sc.nextInt();
        System.out.println("Please enter the price:");
        coolCarPrice = sc.nextDouble();
        System.out.println("Please enter the length:");
        coolCarLength = sc.nextDouble();
        System.out.println("Please enter the width:");
        coolCarWidth = sc.nextDouble();
        
        // print out the information about the cars
        randomCar = new Car();
        coolCar = new Car(coolCarMake, coolCarModel, coolCarYear, coolCarPrice, coolCarLength, coolCarWidth);
        neatoCar = new Car("Land Rover", "LR4", 2016, 59990.0, 4.829, 2.053);
        System.out.println(randomCar);
        System.out.println(coolCar);
        System.out.println(neatoCar);
        randomCar.honk();
    }
    
}
