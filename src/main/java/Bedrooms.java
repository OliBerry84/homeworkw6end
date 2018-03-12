public class Bedrooms extends Room {

    private RoomType type;
    int number;
    int price;

    public Bedrooms(RoomType type, int number, int price, int capacity){
        super(capacity);
        this.type = type;
        this.number = number;
        this.price = price;

    }

    public RoomType getType(){
        return this.type;
    }

    public int getRoomNumber(){
        return this.number;
    }

    public int getPrice(){
        return this.price;
    }
}
