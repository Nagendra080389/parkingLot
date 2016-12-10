import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Nagendra on 10-12-2016.
 */
public class Garage extends Observable{

    private CopyOnWriteArrayList<Slot> slots;

    private int MAX_SLOTS = 4;

    public Garage() {
        slots = new CopyOnWriteArrayList<>();
    }

    public void parkVehicle(Vehicle vehicle){
        Slot slot = new Slot();
        slot.setVehicle(vehicle);
        if(slots.size() < MAX_SLOTS) {
            slots.add(slot);
            this.notifyObservers(Notification.PARKED);
            this.setChanged();
            System.out.println("Observer Notified : " + Notification.PARKED.name());
        }else {
            this.setChanged();
            this.notifyObservers(Notification.NOTPARKED);
            System.out.println("Observer Notified : " + Notification.NOTPARKED.name());
        }
    }

    public CopyOnWriteArrayList<Slot> getSlots() {
        return slots;
    }

    public void removeVehicle(Vehicle vehicle){
        slots.remove(vehicle);
        this.setChanged();
        this.notifyObservers(Notification.EXITED);
    }


}
