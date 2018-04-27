package me.kamili.rachid.walmartapp.managers;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductsManager {
    private static final String API_BASE_URL = "http://api.walmartlabs.com";

    private static ProductsManager instance;

    private ProductsManager() {}

    public static ProductsManager getInstance(){
        if(instance==null)
            instance = new ProductsManager();
        return instance;
    }

    public ProductAPI createAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getAPIBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ProductAPI.class);
    }

    public String getAPIBaseUrl() {
        return API_BASE_URL;
    }
}
