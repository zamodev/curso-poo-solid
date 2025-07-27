package src.liskovSubstitution.example.lsp;

public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int calculateArea() {
        return width * height;
    }
    public int getArea() {
        return calculateArea();
    }
}
