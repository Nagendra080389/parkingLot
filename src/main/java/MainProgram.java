/**
 * Created by Nagendra on 10-12-2016.
 */
public class MainProgram {

    public static void main(String[] args) {

        Garage garage = new Garage();
        GarageManager garageManager = new GarageManager();
        garage.addObserver(garageManager);

        garage.parkVehicle(new Vehicle("1230"));
        garage.parkVehicle(new Vehicle("1231"));
        garage.parkVehicle(new Vehicle("1232"));
        garage.parkVehicle(new Vehicle("1233"));
        garage.parkVehicle(new Vehicle("1234"));

    }
}
