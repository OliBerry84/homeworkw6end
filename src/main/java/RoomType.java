public enum RoomType {
    SINGLE("Single", 1),
    DOUBLE("Double", 2),
    TRIPLE("Triple", 3),
    FAMILY("Family", 5);


    private String type;
    private int capacity;

    RoomType(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
    }

    public String getType(){
        return this.type;
    }

    public int getCapacity(){
        return this.capacity;
    }

}