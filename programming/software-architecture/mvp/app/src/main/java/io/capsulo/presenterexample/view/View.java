/**
 * @author Henoc Sese (lemarcque)
 */

package io.capsulo.presenterexample.view;

import io.capsulo.presenterexample.presenter.Presenter;

/**
 * Interface that allow to make a contract for the Presenter  {@link io.capsulo.presenterexample.presenter.Presenter}
 */
public interface View {

    /**
     * Assign the presenter to the View
     */
    void setPresenter(Presenter presenter);
}
