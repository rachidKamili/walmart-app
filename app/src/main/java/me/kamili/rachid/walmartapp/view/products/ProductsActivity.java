package me.kamili.rachid.walmartapp.view.products;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.kamili.rachid.walmartapp.R;
import me.kamili.rachid.walmartapp.adapters.ProductAdapter;
import me.kamili.rachid.walmartapp.model.Product;

public class ProductsActivity extends AppCompatActivity implements ProductsContract.View{

    private List<Product> myDataset = new ArrayList<>();
    @BindView(R.id.rvProducts)
    RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;


    ProductsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        presenter = new ProductsPresenter(this);
        initRecycler();
    }

    private void initRecycler() {
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }
        else{
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        }

        mAdapter = new ProductAdapter(this,myDataset);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(this);
        presenter.loadData();
    }

    @Override
    public void onLoadData(List<Product> data, String nextPage) {
        myDataset.addAll(data);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onLoadNextPage(List<Product> data, String nextPage) {
        System.out.println(123);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}
