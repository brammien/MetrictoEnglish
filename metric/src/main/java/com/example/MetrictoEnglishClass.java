package com.example;

public class MetrictoEnglishClass {

 public static void main(String args[]) {
  int meters = 28;
  int kilo = 168;
  int cent = 47;
  int kilo2 = 27; //per hour to feet per sec
  int liters = 92;
  int kilograms = 200;
  int mileseconds = 60;
  int yards = 1;
  //conversion ratios.
  double a = 1.09; //one mter to one yard conversion
  double b = 0.62; //one kilometer to one mile conversion
  double c = 0.39; //one centimeter to one inch conversion
  double d = 1.06; //one liter to one quart conversion
  double e = 32.15; //kilograms to ounces
  double f = 3280.84; //kilometers to feet
        /*Convert 28 meters to yards
         Convert 168 kilometers to miles
         Convert 47 centimeters to inches
         Convert 27 kilometers to feet and then divide by minsecs 60, and minsecs again to find feet per second.
         Convert 92 liters to quarts
         Convert 200 kilometers to ounces
         Instructions: convert each ratio var a - f * the value to find out how units,
         length, volume of each metric value calculates into english system of values.
         Var a - f give the ratio values per unit of measurement converted for 1 unit.
         Multiply these units to get results.*/
  System.out.println("28 meters" + " = " +( meters * a)+ " yards");
  System.out.println("168 Kilometers" + " = " +( kilo * b)+ " miles");
  System.out.println("47 Cenimeters" + " = " +( cent * c)+ " inches");
  System.out.println("27 Kilometer" + " / " +( kilo2 * f)+ " feet " +" = " + (( kilo2 * f)/ mileseconds)+" per second");
  System.out.println("92 liters" + " = " +( liters * d)+ " quarts");
  System.out.println("200 kilograms" + " = " +( kilograms * e)+ " ounces");
 }


}
