
public class Rectangle {
    private int _width;
    private int _height;
    
    Rectangle(int width, int height) {
        _width = width;
        _height = height;
    }
    
    void paint(PointCornerFactory factory) {
        Point point = factory.getPoint();
        Corner corner = factory.getCorner();
        
        corner.leftUp();
        point.line(_width - 2);
        corner.rightUp();
        System.out.println();
        for (int i = 0; i < _height - 2; i++) {
            point.line(_width);
            System.out.println();
        }
        corner.leftDown();
        point.line(_width - 2);
        corner.rightDown();
        System.out.println();
    }
}
