public class ConferenceRooms extends Room {

    private String name;
    private int price;

    public ConferenceRooms(int capacity, String name, int price){
        super(capacity);
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getCapacity(){
        return this.capacity;
    }
}