package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        double carpetNeeded = totalArea(4.90, 5.20);
        double carpetCost = carpetNeeded * carpetPricePerSqMtr(22.85);
        double underlayNeeded = carpetNeeded * 7.00;
        double carpetfitting = carpetNeeded * 4.50;
        double carpetUplift = carpetNeeded * 3.35;
        double gripper = totalPerimeter(4.90, 5.20);
        double gripperCost = gripper * 1.16666666667;
        double numOfStaircases = staircaseCharge();

        double totalInstallCost = carpetCost + underlayNeeded + carpetfitting
                + carpetUplift + gripper + gripperCost + numOfStaircases;

        System.out.println("The total cost of supplying and Installing the new carpet is £" + totalInstallCost);

    }

    public static double carpetPricePerSqMtr(double squareMtrPrice) {

        return squareMtrPrice;


    }


    public static double totalArea(double areaWidth, double areaLength) {
        double floorArea = areaWidth * areaLength;
        return floorArea;
    }

    public static double totalPerimeter(double roomWidth, double roomLength) {
        double totalPerim = roomLength + roomWidth;
        double perimCalculated = totalPerim * 6.50;

        return totalPerim;


    }


    public static double staircaseCharge(double stairSupplement) {
        double supplementCost = 60;
        if (stairSupplement < 1) {
            return -1;
        } else {
            return stairSupplement * supplementCost;
        }

    }

}











