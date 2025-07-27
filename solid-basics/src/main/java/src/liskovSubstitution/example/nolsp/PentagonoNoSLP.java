package src.liskovSubstitution.example.nolsp;

public class PentagonoNoSLP extends RectangleNoSLP {
    public void setMeasurement(int a) {
        super.setHeight(a);
        super.setWidth(a);
    }
}

