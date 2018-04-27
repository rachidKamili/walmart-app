package me.kamili.rachid.walmartapp.view.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.kamili.rachid.walmartapp.R;
import me.kamili.rachid.walmartapp.model.Product;

public class DetailsActivity extends AppCompatActivity implements DetailsContract.View {

    DetailsPresenter presenter;
    @BindView(R.id.ivImage)
    ImageView ivImage;
    @BindView(R.id.tvPrice)
    TextView tvPrice;
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvDesc)
    TextView tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        int position = getIntent().getIntExtra("position", -1);
        presenter = new DetailsPresenter(position);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(this);
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
    public void loadProduct(Product product) {
        Glide.with(this).load(product.getLargeImage()).into(ivImage);
        tvPrice.setText("$"+product.getSalePrice());
        tvName.setText(product.getName());
        tvDesc.setText(product.getShortDescription());
    }
}
