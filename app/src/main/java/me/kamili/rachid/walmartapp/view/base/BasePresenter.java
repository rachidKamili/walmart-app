package me.kamili.rachid.walmartapp.view.base;

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);

    void detachView();
}
