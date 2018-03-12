import java.util.ArrayList;

public class DiningRooms extends Room {

    private String name;

    public DiningRooms(String name, int capacity){
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}