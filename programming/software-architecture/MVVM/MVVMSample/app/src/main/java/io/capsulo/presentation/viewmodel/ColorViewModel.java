/**
 * MIT License
 * Copyright (C) 2018 Henoc Sese
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.capsulo.presentation.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.graphics.Color;

import java.util.Timer;
import java.util.TimerTask;

/**
 * View model represent data formatted to be displayed in a View.
 */
public class ColorViewModel extends ViewModel {

    private MutableLiveData<Color> color;        // Color of the application

    public ColorViewModel() {

    }

    /**
     * Return the current color of the application.
     * @return A color object
     */
    public MutableLiveData<Color> getColor() {
        if(color == null) {
            color = new MutableLiveData<>();
            loadColors();
        }
        return color;
    }

    /**
     * Load data from a data source (Example : Model)
     * @return a color object
     */
    private Color loadColor() {
        // Do something to load (Network or Database)
        return Color.valueOf(Color.rgb(255, 0, 0));
    }

    private void loadColors() {
        // List of colors
        final Color[] colors = {
                Color.valueOf(Color.rgb(255, 0, 0)),       // RED
                Color.valueOf(Color.rgb(0, 255, 0)),       // GREEN
                Color.valueOf(Color.rgb(0, 0, 255)),       // BLUE
                Color.valueOf(Color.rgb(100, 65, 0)),      // YELLOW
                Color.valueOf(Color.rgb(50, 0, 50)),      // PURPLE
        };

        // Create a timer to simulate data change from the  network
        final int[] count = new int[1];
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(count[0] + 1 == colors.length) {
                    count[0] = 0;
                }
                else {
                    count[0]++;
                }

                // Expose the new value to the Observer (view)
                color.postValue(colors[count[0]]);
            }
        }, 0, 700);
    }
}
