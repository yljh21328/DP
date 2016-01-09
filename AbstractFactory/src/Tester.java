
public class Tester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rectangle rectangle = new Rectangle(10,10);
        PointCornerFactory factory = new PointCornerFactoryImplement();
        rectangle.paint(factory);
    }

}
