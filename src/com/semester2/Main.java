package com.semester2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create storage units
        StorageUnit su1 = new StorageUnit(10, 150, UnitSize.SMALL);
        StorageUnit su2 = new StorageUnit(20, 200, UnitSize.MEDIUM);
        StorageUnit su3 = new StorageUnit(50, 400, UnitSize.LARGE);
        ArrayList<StorageUnit> storageUnits = new ArrayList<>();
        storageUnits.add(su1);
        storageUnits.add(su2);
        storageUnits.add(su3);

        //Create Owner Marco
        Owner owner = new Owner("Marco", storageUnits);

        //Create Customer Jean-Paul
        Customer jp = new Customer("Jean-Paul");

        //Create Stuff owned by Jean-Paul
        //String name, double value, int weight, Customer customer
        Stuff s1 = new Stuff("Teddybeer", 4.95, 1, jp);
        Stuff s2 = new Stuff("Bureau", 50.00, 30, jp);
        Stuff s3 = new Stuff("Fiets", 0.00, 27, jp);
        Stuff s4 = new Stuff("Tiger Tank", 100000.00, 54000, jp);
        Stuff s5 = new Stuff("Gouden Badeend", 500.00, 35, jp);

        ArrayList<Stuff> listOfStuff = new ArrayList<>();
        listOfStuff.add(s1);
        listOfStuff.add(s2);
        listOfStuff.add(s3);
        listOfStuff.add(s4);
        listOfStuff.add(s5);
        System.out.println("Welkom bij Store Stuff.");
        System.out.println("Welke Storage Unit wil je huren? " + UnitSize.SMALL + ", " + UnitSize.MEDIUM + ", of " + UnitSize.LARGE);

        String desiredUnit = scanner.nextLine().toUpperCase();
        isUnitSizeCorrect(desiredUnit);

        System.out.println("Wat wil je opslaan in je storage unit?");
        renderListOfStuff(listOfStuff);

        System.out.println("Voer het nummer in van het artikel dat je wil toevoegen");
        int stuffNo = scanner.nextInt();
        System.out.println("Je hebt gekozen voor " + listOfStuff.get(stuffNo).getName() + ".");
        ArrayList<Stuff> storageStuff = new ArrayList<>();
        storageStuff.add(listOfStuff.get(stuffNo));
        listOfStuff.remove(stuffNo);

        System.out.println("Wil je nog iets toevoegen? Y/N");
        String yesOrNo = scanner.next();

        //ToDo: Hier moet een while van gemaakt, maar zoals de else doet vermoeden: We houden het voor gezien!
        if (yesOrNo.toUpperCase().equals("Y")) {
            renderListOfStuff(listOfStuff);
        } else {
            System.out.println("We houden het voor gezien.");
        }

        //ToDo: controleren of het artikel al eerder is toegevoegd aan storageStuff
//        System.out.println("Wil je nog iets toevoegen?");
//        for (int i = 0; i < listOfStuff.size(); i++) {
//            if(listOfStuff.get(i).getName().contains(storageStuff.get(stuffNo).getName()))
//
//            System.out.println(i + ": " + listOfStuff.get(i).getName() + ", waarde: € " + listOfStuff.get(i).getValue() + ", weight: " + listOfStuff.get(i).getWeight() + "kg");
//        }


    }

    public static boolean isUnitSizeCorrect(String unitSizeName) {

        Scanner scanner = new Scanner(System.in);

        boolean unitSizeCorrect = false;
        while (!unitSizeCorrect) {
            switch (unitSizeName) {
                case "SMALL":
                    System.out.println("Je hebt voor een kleine unit gekozen");
                    unitSizeCorrect = true;
                    break;
                case "MEDIUM":
                    System.out.println("Je hebt voor een medium unit gekozen");
                    unitSizeCorrect = true;
                    break;
                case "LARGE":
                    System.out.println("Je hebt voor een grote unit gekozen");
                    unitSizeCorrect = true;
                    break;
                default:
                    System.out.println("Je hebt geen goed formaat geselecteerd, gelieve een juist formaat te selecteren.");
                    unitSizeName = scanner.nextLine().toUpperCase();
            }
        }
        return true;
    }

    public static void renderListOfStuff(ArrayList<Stuff> listOfStuff) {
        for (int i = 0; i < listOfStuff.size(); i++) {

            System.out.println(i + ": " + listOfStuff.get(i).getName() + ", waarde: € " + listOfStuff.get(i).getValue() + ", weight: " + listOfStuff.get(i).getWeight() + "kg");
        }
    }
}
