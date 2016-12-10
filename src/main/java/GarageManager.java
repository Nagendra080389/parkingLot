import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Nagendra on 10-12-2016.
 */
public class GarageManager implements Observer {

    @Override
    public void update(Observable observable, Object arg) {

        CopyOnWriteArrayList<Slot> slots = ((Garage) observable).getSlots();
        for (Slot slot : slots) {
            System.out.println("Garage Manager : " + slot.getVehicle().getVehicleNumber());
        }

    }
}
