package me.kamili.rachid.walmartapp.managers;

import me.kamili.rachid.walmartapp.model.ResponseProducts;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ProductAPI {
    static final String API_KEY = "utra95z3dvqh8jv27mte3385";


    @GET("v1/paginated/items?format=json&apiKey="+API_KEY)
    Call<ResponseProducts> getProducts();


    @GET("v1/paginated/items?format=json&apiKey="+API_KEY)
    Call<ResponseProducts> getNextProducts(@Query("maxId") String nextPage);

}
