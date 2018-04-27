package me.kamili.rachid.walmartapp.view.details;

import android.view.MotionEvent;
import android.view.View;

import java.util.List;

import me.kamili.rachid.walmartapp.model.Product;
import me.kamili.rachid.walmartapp.view.products.ProductsActivity;

public class DetailsPresenter implements DetailsContract.Presenter, View.OnTouchListener {

    List<Product> mPoducts;
    DetailsContract.View view;
    private Product product;

    final int MIN_DISTANCE = 100;
    private float downX, upX;
    private int position;

    public DetailsPresenter(int position) {
        if (position != -1)
            getItems(position);
    }

    private void getItems(int position){
        mPoducts = ProductsActivity.myDataset;
        product = mPoducts.get(position);
        this.position= position;
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

    @Override
    public boolean checkProductExists(int position) {
        return position>-1 && mPoducts.get(position)!=null;
    }

    @Override
    public Product getProductByPosition() {
        return mPoducts.get(position);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                downX = event.getX();
                return true;
            }
            case MotionEvent.ACTION_UP: {
                upX = event.getX();
                float deltaX = downX - upX;
                if (Math.abs(deltaX) > MIN_DISTANCE) {
                    if (deltaX < 0) {
                        onLeftToRightSwipe();
                        return true;
                    }
                    if (deltaX > 0) {
                        onRightToLeftSwipe();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    private void onLeftToRightSwipe() {
        if (checkProductExists(position-1)){
            position--;
            product = getProductByPosition();
            view.loadProduct(product);
        }
    }

    private void onRightToLeftSwipe() {
        if (checkProductExists(position+1)){
            position++;
            product = getProductByPosition();
            view.loadProduct(product);
        }
    }
}
