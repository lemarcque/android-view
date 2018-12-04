/**
 * @author Henoc Sese (lemarcque)
 */
package io.capsulo.presenterexample.view;

/**
 * View for the Main Screen
 */
public interface MainView extends View {

    /**
     * Update the data from a Displayable model for View
     * @param user
     */
    void updateData(DisplayableUser user);

}
