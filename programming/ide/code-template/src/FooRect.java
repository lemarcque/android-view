/**
 * @author Henoc Sese
 */

public class FooRect {

    private int width;
    private int height;

    private String name;

    public FooRect(int width, int height) {
        this.width = width;
        this.height = height;
        this.name = "FooRect";
    }

    /**
     * Return the width of the rectangle
     *
     * @return height the height of the rectangle in centimeter.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Return the height of the rectangle
     *
     * @return height the height of the rectangle in centimeter.
     */
    public int getHeight() {
        return height;
    }
}