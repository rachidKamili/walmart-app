package me.kamili.rachid.walmartapp.view.details;

import java.util.List;

import me.kamili.rachid.walmartapp.model.Product;
import me.kamili.rachid.walmartapp.view.products.ProductsActivity;

public class DetailsPresenter implements DetailsContract.Presenter {

    List<Product> mPoducts;
    DetailsContract.View view;
    private Product product;

    public DetailsPresenter(int position) {
        if (position != -1)
            getItems(position);
    }

    private void getItems(int position){
        mPoducts = ProductsActivity.myDataset;
        product = mPoducts.get(position);
    }

    @Override
    public void attachView(DetailsContract.View view) {
        this.view = view;
        this.view.loadProduct(product);
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
