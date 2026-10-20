package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine().trim();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine().trim();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine().trim();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine().trim();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine().trim();



        //String builder
        StringBuilder billing = new StringBuilder();
        billing.append(billingStreet);
        billing.append("\n");
        billing.append(billingCity);
        billing.append(", ");
        billing.append(billingState);
        billing.append(" ");
        billing.append(billingZip);

        String myBilling = billing.toString();


        StringBuilder shipping = new StringBuilder();
        shipping.append(shippingStreet);
        shipping.append("\n");
        shipping.append(shippingCity);
        shipping.append(", ");
        shipping.append(shippingState);
        shipping.append(" ");
        shipping.append(shippingZip);

        String myShipping = shipping.toString();

        //Output

        System.out.println(fullName);
        System.out.println("Billing Address: ");
        System.out.println(myBilling);
        System.out.println("Shipping Address: ");
        System.out.println(myShipping);
       // System.out.println("Billing Address:" + "\n" + billingStreet + "\n" + billingCity + ", " + billingState + " " + billingZip);
       // System.out.println("Shipping Address:" + "\n" + shippingStreet + "\n" + shippingCity + ", " + shippingCity + " " + shippingZip);

    }

}
