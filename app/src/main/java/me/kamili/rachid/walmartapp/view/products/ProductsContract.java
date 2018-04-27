package me.kamili.rachid.walmartapp.view.products;

import java.util.List;

import me.kamili.rachid.walmartapp.model.Product;
import me.kamili.rachid.walmartapp.view.base.BasePresenter;
import me.kamili.rachid.walmartapp.view.base.BaseView;

public interface ProductsContract {
    interface View extends BaseView {
        void onLoadData(List<Product> data, String nextPage);
        void onLoadNextPage(List<Product> data, String nextPage);
    }

    interface Presenter extends BasePresenter<View> {
        void loadData();
        void loadNextPage(String nextPage);
    }
}
