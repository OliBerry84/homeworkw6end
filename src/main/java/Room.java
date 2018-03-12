import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guests> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guests>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guests> getGuests() {
        return this.guests;
    }

    public boolean roomAtCapacity(){
        return (guests.size() == this.capacity);
    }

    public void checkInGuest(){
        this.guests.add(guest);
    }

    public void checkOutGuest(){
        this.guests.remove(guest);
    }

    public int guestTotal(){
       return guests.size();
    }


}
