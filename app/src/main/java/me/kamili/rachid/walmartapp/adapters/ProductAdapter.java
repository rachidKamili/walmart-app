package me.kamili.rachid.walmartapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.kamili.rachid.walmartapp.R;
import me.kamili.rachid.walmartapp.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private Context mContext;
    private OnEventClickListener clickListener;
    private List<Product> mDataset;

    public ProductAdapter(Context context, List<Product> myDataset) {
        this.mDataset = myDataset;
        this.mContext = context;
//        this.clickListener = (OnEventClickListener) context;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_product, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final Product data = mDataset.get(position);

        holder.tvName.setText(data.getName());
        holder.tvPrice.setText("$"+(Math.floor(data.getSalePrice() * 100) / 100));
        Glide.with(mContext)
                .load(data.getMediumImage())
                .apply(new RequestOptions().override(180, 180))
                .into(holder.ivImage);

        holder.bind(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface OnEventClickListener {
        void onItemClick(Product item);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvName)
        public TextView tvName;
        @BindView(R.id.tvPrice)
        public TextView tvPrice;
        @BindView(R.id.ivImage)
        public ImageView ivImage;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(final Product item) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(item);
                }
            });
        }
    }

}
