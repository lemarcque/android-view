/**
 * MIT License
 *
 * Copyright (c) 2018 Henoc Sese
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
