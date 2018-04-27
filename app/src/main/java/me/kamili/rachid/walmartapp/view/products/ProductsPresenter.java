package me.kamili.rachid.walmartapp.view.products;

import android.content.Context;

import me.kamili.rachid.walmartapp.managers.ProductsManager;
import me.kamili.rachid.walmartapp.model.ResponseProducts;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductsPresenter implements ProductsContract.Presenter {

    private Context mContext;
    private ProductsManager mProductsManager;

    ProductsContract.View view;


    public ProductsPresenter(Context context) {
        mContext = context;
        mProductsManager = ProductsManager.getInstance();
    }

    @Override
    public void loadData() {
        mProductsManager.createAPI().getProducts()
                .enqueue(new Callback<ResponseProducts>() {
                    @Override
                    public void onResponse(Call<ResponseProducts> call, Response<ResponseProducts> response) {
                        ResponseProducts data = response.body();
                        if (data != null) {
                            if (view != null)
                                view.onLoadData(data.getItems(), data.getNextPage());
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseProducts> call, Throwable t) {

                    }
                });
    }

    @Override
    public void loadNextPage(String nextPage) {
        mProductsManager.createAPI().getNextProducts(nextPage)
                .enqueue(new Callback<ResponseProducts>() {
                    @Override
                    public void onResponse(Call<ResponseProducts> call, Response<ResponseProducts> response) {
                        ResponseProducts data = response.body();
                        if (data != null) {
                            if (view != null)
                                view.onLoadNextPage(data.getItems(), data.getNextPage());
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseProducts> call, Throwable t) {

                    }
                });
    }

    @Override
    public void attachView(ProductsContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
