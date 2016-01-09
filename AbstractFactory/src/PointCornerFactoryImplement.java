
public class PointCornerFactoryImplement implements PointCornerFactory{

    @Override
    public Point getPoint() {
        // TODO Auto-generated method stub
        return new PointImplement();
    }

    @Override
    public Corner getCorner() {
        // TODO Auto-generated method stub
        return new CornerImplement();
    }

}
