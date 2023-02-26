public class Room {
    int roomname;
    String roomtype;
    float roomarea;
    boolean Acmachine;
    public Room()
    {
        System.out.println("Hello");
    }
    public Room(int a,String b,float c,boolean d)
    {
        this.roomname=a;
        this.roomtype=b;
        this.roomarea=c;
        this.Acmachine=d;
    }
    void displayData()
    {
        System.out.println(roomname);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(Acmachine);
    }

    public static void main(String[] args) {
        Room obj1=new Room();
        Room obj2=new Room(1,"single",50.1f,true);
        obj2.displayData();
    }
}
