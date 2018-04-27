package me.kamili.rachid.walmartapp.view.products;

public class ProductsPresenter implements ProductsContract.Presenter {


    ProductsContract.View view;

    @Override
    public void attachView(ProductsContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
