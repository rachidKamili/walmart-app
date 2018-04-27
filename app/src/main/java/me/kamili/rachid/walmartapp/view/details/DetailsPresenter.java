package me.kamili.rachid.walmartapp.view.details;

public class DetailsPresenter implements DetailsContract.Presenter {


    DetailsContract.View view;

    @Override
    public void attachView(DetailsContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
