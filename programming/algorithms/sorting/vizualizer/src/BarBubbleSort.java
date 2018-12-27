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
import java.util.List;

public class BarBubbleSort {


    public static void sortLive(List<Bar> barList) {

        new Thread(new Runnable() {

            boolean swapped;

            @Override
            public void run() {
                do {
                    swapped = false;

                    // n - 1 for optimizing the process
                    for (int i = 0; i < barList.size() - 1; i++) {
                        if(i != barList.size() - 1) {

                            if(barList.get(i).getValue() > barList.get(i + 1).getValue()) {

                                // swap the items in the list
                                final Bar tempBar = barList.get(i);
                                barList.set(i, barList.get(i + 1));
                                barList.set(i + 1, tempBar);

                                // swap the order of displaying
                                final double tempPosXA = barList.get(i).getLayoutX();
                                barList.get(i).setLayoutX(barList.get(i + 1).getLayoutX());
                                barList.get(i + 1).setLayoutX(tempPosXA);

                                // Catch the an Exception
                                final int animationDelay = 150;
                                try {
                                    Thread.sleep(animationDelay);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                swapped = true;
                            }
                        }
                    }
                }while (swapped);
            }
        }).start();


    }
}
