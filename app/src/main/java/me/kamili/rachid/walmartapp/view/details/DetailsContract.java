package me.kamili.rachid.walmartapp.view.details;

import me.kamili.rachid.walmartapp.model.Product;
import me.kamili.rachid.walmartapp.view.base.BasePresenter;
import me.kamili.rachid.walmartapp.view.base.BaseView;

public interface DetailsContract {
    interface View extends BaseView {
        void loadProduct(Product product);
        void swipeToNext();
        void swipeToPrev();
    }

    interface Presenter extends BasePresenter<View> {
        boolean checkProductExists(int position);
        Product getProductByPosition(int position);
    }
}
