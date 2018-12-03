package io.capsulo.presenterexample.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import io.capsulo.presenterexample.R;
import io.capsulo.presenterexample.presenter.MainPresenter;
import io.capsulo.presenterexample.presenter.Presenter;

public class MainFragment extends Fragment implements
        io.capsulo.presenterexample.view.MainView, View.OnClickListener{

    // Android View components
    private EditText txtFirstnameInput;
    private EditText txtLastnameInput;
    private Button btnRetrieveData;
    private Button btnUpdateData;
    private Button btnClear;

    // Variable Instance
    private MainPresenter presenter;

    /**
     * Build a new Fragment via the factory method
     * @return MainFragment Object
     */
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_layout, null, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.init();
        Log.i(MainFragment.class.getSimpleName(), "2");
    }

    /**
     * Initialization of the application's computing
     */
    private void init() {
        txtFirstnameInput = getView().findViewById(R.id.txt_firstname_input);
        txtLastnameInput = getView().findViewById(R.id.txt_lastname_input);
        btnRetrieveData = getView().findViewById(R.id.btn_retrieve_data);
        btnUpdateData = getView().findViewById(R.id.btn_update_data);
        btnClear = getView().findViewById(R.id.btn_clear);

        // add event listener
        btnRetrieveData.setOnClickListener(this);
        btnUpdateData.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(MainFragment.class.getSimpleName(), "1");
        // start the presenter
        presenter.resume();
    }


    /**
     * Assign the presenter to the View
     *
     * @param presenter
     */
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = (MainPresenter) presenter; // Warning to casting
    }

    /**
     * Update the data from a Displayable model for View
     *
     * @param user
     */
    @Override
    public void updateData(DisplayableUser user) {
        txtFirstnameInput.setText(user.getFirstname());
        txtLastnameInput.setText(user.getLastname());
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_retrieve_data:
                presenter.getUserData();
                break;
            case R.id. btn_update_data:
                // Provide value to the presenter
                final String firstName = txtFirstnameInput.getText().toString();
                final String lastName = txtLastnameInput.getText().toString();
                presenter.updateUserData(firstName, lastName);

                // clear the input box
                this.clearEditText();
                break;
            case R.id.btn_clear:
                this.clearEditText();
                break;
        }
    }

    /**
     * Clear text in EditText Componenents
     */
    private void clearEditText() {
        txtFirstnameInput.setText("");
        txtLastnameInput.setText("");
    }

}
