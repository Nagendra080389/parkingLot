/**
 * Created by Nagendra on 10-12-2016.
 */
public class Vehicle {

    private String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return vehicleNumber.equals(vehicle.vehicleNumber);
    }

    @Override
    public int hashCode() {
        return vehicleNumber.hashCode();
    }
}
