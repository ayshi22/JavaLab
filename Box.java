public class Box {
    int h;
    int w;
    int l;
    public static void area(int h,int w)
    {
        System.out.println(h*w);
    }
    public static void area(int h,int w,int l)
    {
        System.out.println(h*w*l);
    }
    void display()
    {
        System.out.println("Heigth=" +h);
        System.out.println("Width=" +w);
        System.out.println("Length=" +l);
    }

    public static void main(String[] args) {
        Box obj=new Box();
        obj.h=2;
        obj.w=3;
        obj.l=4;
        area(obj.h, obj.w);
        area(obj.h, obj.w, obj.l);
        obj.display();

    }
}
