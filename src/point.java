public class point
{
    public static void main(String[] args)
    {
    point point1=new point(3.0,4.0);
        System.out.println(point1.x);
        System.out.println(point1.y);
    }

    double x;
    double y=100;
    public point(double _x,double _y)
    {
    x=_x;
    y=_y;
    }
}
