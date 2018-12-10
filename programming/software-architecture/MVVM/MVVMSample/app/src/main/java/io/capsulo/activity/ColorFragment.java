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
package io.capsulo.activity;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.capsulo.mvvmsample.R;
import io.capsulo.presentation.view.Shape;
import io.capsulo.presentation.viewmodel.ColorViewModel;

/**
 * A fragment containing shape.
 */
public class ColorFragment extends Fragment {


    // Android View
    private Shape circle;
    private Shape rectangle1;
    private Shape rectangle2;

    /**
     * Static factory methpd that create an new instance of the ColorFragment
     * @return a ColorFragment object
     */
    public static ColorFragment newInstance() {
        return new ColorFragment();
    }

    /**
     * Construct thew view by inflating a XML Layout and displaying it into a ViewGroup
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.color_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // binding views
        circle = view.findViewById(R.id.circle_fragment_color);
        rectangle1 = view.findViewById(R.id.rect1_fragment_color);
        rectangle2 = view.findViewById(R.id.rect2_fragment_color);

        // Instantiate ViewModel
        ColorViewModel colorViewModel = ViewModelProviders
                .of(this)
                .get(ColorViewModel.class);

        // Observe changes of the color from the ViewModel
        // Retrieve data from the ViewModel

        colorViewModel.getColor().observe(this, this::updateColorApp);
    }

    private void updateColorApp(Color colorApp) {
        circle.setBackgroundColor(colorApp.toArgb());
        rectangle1.setBackgroundColor(colorApp.toArgb());
        rectangle2.setBackgroundColor(colorApp.toArgb());
    }
}
