/**
 * @author Henoc Sese (lemarcque)
 */

package io.capsulo.presenterexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.capsulo.presenterexample.R;
import io.capsulo.presenterexample.model.UserModel;
import io.capsulo.presenterexample.presenter.MainPresenter;
import io.capsulo.presenterexample.presenter.Presenter;

/**
 * The only activity of the application for displaying and managing  data.
 */
public class MainActivity extends AppCompatActivity {


    /**
     * First method called
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main_layout);

        // create dependencies
        UserModel userModel = new UserModel();                      // Model
        MainView view = MainFragment.newInstance();                 // View
        Presenter presenter = new MainPresenter(userModel, view);   // Presenter



        // add the Fragment
        super.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.activity_main_framelayout, (MainFragment) view)
                .commit();
    }
}
