package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Floor floor = new Floor(2.75, 4.0);
        System.out.println("Floor area =" + floor.getArea());
        Carpet carpet = new Carpet(3.5);
        System.out.println("Cost of carpeting per sq foot= " + carpet.getCost());
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total cost = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("New Total Cost = " + calculator.getTotalCost());


    }
}
