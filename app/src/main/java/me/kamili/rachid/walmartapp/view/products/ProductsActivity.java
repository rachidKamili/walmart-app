package me.kamili.rachid.walmartapp.view.products;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import me.kamili.rachid.walmartapp.view.details.DetailsActivity;
import me.kamili.rachid.walmartapp.utils.AttributesUtils;
import me.kamili.rachid.walmartapp.utils.EndlessRecyclerOnScrollListener;

public class ProductsActivity extends AppCompatActivity implements ProductsContract.View, ProductAdapter.OnProductClickListener {

    @BindView(R.id.rvProducts)
    RecyclerView mRecyclerView;
    ProductsPresenter presenter;
    public static List<Product> myDataset = new ArrayList<>();
    private RecyclerView.Adapter mAdapter;
    private String mNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        ButterKnife.bind(this);
        presenter = new ProductsPresenter(this);
        initRecycler();
    }

    private void initRecycler() {
        GridLayoutManager mGridLayoutManager;
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mGridLayoutManager = new GridLayoutManager(this, 2);
        } else {
            mGridLayoutManager = new GridLayoutManager(this, 3);
        }
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mAdapter = new ProductAdapter(this, myDataset);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                if (mNextPage != null){
                    presenter.loadNextPage(mNextPage);
                    Toast.makeText(ProductsActivity.this, "Loading more items", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(this);
        presenter.loadData();
    }

    @Override
    public void onLoadData(List<Product> data, String nextPage) {
        myDataset.clear();
        myDataset.addAll(data);
        mAdapter.notifyDataSetChanged();
        mNextPage = AttributesUtils.getAttributeValue(nextPage,"maxId");
    }

    @Override
    public void onLoadNextPage(List<Product> data, String nextPage) {
        myDataset.addAll(data);
        mAdapter.notifyDataSetChanged();
        mNextPage = AttributesUtils.getAttributeValue(nextPage,"maxId");
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

    @Override
    public void onItemClick(Product item, int position) {
        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("position",position);
        startActivity(intent);
    }
}
