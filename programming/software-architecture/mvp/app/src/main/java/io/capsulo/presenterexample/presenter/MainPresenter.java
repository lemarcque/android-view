/**
 * @author Henoc Sese (lemarcque)
 */

package io.capsulo.presenterexample.presenter;


import io.capsulo.presenterexample.model.UserModel;
import io.capsulo.presenterexample.view.DisplayableUser;
import io.capsulo.presenterexample.view.MainView;
import io.capsulo.presenterexample.view.View;

/**
 * Implementation of the Presenter {@link Presenter}
 */
public class MainPresenter implements Presenter {

    private UserModel userModel;
    private MainView view;

    public MainPresenter(UserModel userModel, MainView view) {
        this.userModel = userModel;
        this.view = view;
        this.view.setPresenter(this);
    }


    @Override
    public void resume() {
        // do nothing
    }

    /**
     * Return a model object that can the View can consume
     * @return
     */
    public void getUserData() {

        // get data from the model
        String firstName = userModel.getFirstName();
        String lastName = userModel.getLastName();
        final DisplayableUser displayableUser =  new DisplayableUser(firstName, lastName);

        // update the view
        view.updateData(displayableUser);
    }

    /**
     * Modify the user data unto the Model
     * @param firstname String the user's firstname
     * @param lastname  String the user's lastname
     */
    public void updateUserData(String firstname, String lastname) {
        userModel.setFirstName(firstname);
        userModel.setLastName(lastname);
    }
}
