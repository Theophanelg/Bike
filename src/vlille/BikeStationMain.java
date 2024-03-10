package vlille;

import java.io.IOException;

import vlille.util.BikeModel;

public class BikeStationMain {
    public static void main(String[] args) {
        
        BikeStation station = new BikeStation("Timoleon", 10);
        Bike bike = new Bike("b001", BikeModel.ELECTRIC);
        Bike bike2 = new Bike("b002", BikeModel.CLASSIC);
        station.dropBike(bike);
        station.dropBike(bike2);

        if(args.length >= 1) {
        int arg1 = Integer.parseInt(args[0]);
            try{
                Bike takebike = station.takeBike(arg1);
                System.out.println("The " + takebike + " was open");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }      
        } else {
            throw new IllegalArgumentException("No values was found ! ");
        }
    }
}
