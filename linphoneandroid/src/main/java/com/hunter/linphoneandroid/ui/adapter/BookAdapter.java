package com.hunter.linphoneandroid.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.hunter.fastandroid.R;
import com.hunter.linphoneandroid.base.BaseRecyclerAdapter;
import com.hunter.linphoneandroid.base.RecyclerViewHolder;
import com.hunter.linphoneandroid.utils.ImageLoadUtils;
import com.hunter.linphoneandroid.vo.Book;

public class BookAdapter extends BaseRecyclerAdapter<Book> {

    public BookAdapter(Context context) {
        super(context);
    }

    @Override
    public void bindView(RecyclerViewHolder holder, int position) {
        TextView tvName = holder.getView(R.id.tv_name);
        TextView tvPub = holder.getView(R.id.tv_publisher);
        TextView tvPrice = holder.getView(R.id.tv_price);
        ImageView ivImage = holder.getView(R.id.iv_image);

        tvName.setText(getItemData(position).getTitle());
        tvPub.setText(getItemData(position).getPublisher());
        tvPrice.setText(getItemData(position).getPrice());
        ImageLoadUtils.loadImage(getContext(), getItemData(position).getImage(), ivImage);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_book;
    }
}
