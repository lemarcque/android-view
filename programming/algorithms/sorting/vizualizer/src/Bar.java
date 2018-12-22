import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * Represent a diagram bar
 */
public class Bar extends Group {

    private final int value;
    private final int width;
    private final int height;
    private Rectangle squareTop;
    private Rectangle rectBottom;

    // Properties specific for sorting algorithms
    private boolean ordered;


    public Bar(int value, int width) {
        this.value = value;
        this.width = width;
        this.height = value;

        // create shapes
        this.buildShape();
        this.setOrdered(true);

        // add shapes
        getChildren().add(squareTop);
        getChildren().add(rectBottom);
    }

    private void buildShape() {
        // create the shapes
        squareTop = new Rectangle(width, width, Color.BLACK);

        rectBottom = new Rectangle(width, value - squareTop.getHeight());
        rectBottom.setY(width);
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;

        if(ordered) {
            rectBottom.setFill(Color.BEIGE);
        }else {
            rectBottom.setFill(Color.GRAY);
        }
    }

    public int getValue() {
        return value;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
