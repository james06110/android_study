package com.stuart.mvpdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.stuart.mvpdemo.R;
import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 下午 15:11
 * description:
 */
public class ZNewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    private Context context;
    private ZhihuDailyLatest zhihuDailyLatest;
    private OnItemClickListener mOnItemClickListener;


    public interface OnItemClickListener
    {
        void onItemClick(View view,int position);
        void onItemLongClick(View view, int position);
    }

    public  void setmOnItemClickListener(OnItemClickListener mOnItemClickListener){

           this.mOnItemClickListener= mOnItemClickListener;

    }


    public ZNewsAdapter(Context context, ZhihuDailyLatest zhihuDailyLatest){
        this.context=context;
        this.zhihuDailyLatest = zhihuDailyLatest;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v =View.inflate(parent.getContext(),R.layout.list_item_card_main,null);
        MovieViewHolder movieViewHolder =new MovieViewHolder(v);

        return movieViewHolder;


    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof MovieViewHolder)
        {
               final MovieViewHolder movieViewHolder = (MovieViewHolder) holder;
               movieViewHolder.tx.setText(zhihuDailyLatest.getStories().get(position).getTitle());
               Glide.with(context).load(zhihuDailyLatest.getStories().get(position).getImages().get(0)).into(movieViewHolder.img);
               if(mOnItemClickListener !=null){
                   movieViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           int position =movieViewHolder.getLayoutPosition();
                           mOnItemClickListener.onItemClick(movieViewHolder.itemView,position);
                       }
                   });
                   movieViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                       @Override
                       public boolean onLongClick(View view) {
                           int position = movieViewHolder.getLayoutPosition();
                           mOnItemClickListener.onItemLongClick(movieViewHolder.itemView,position);
                           return false;
                       }
                   });

        }

        }



    }

    @Override
    public int getItemCount() {
        return zhihuDailyLatest.getStories().size();
    }

    class MovieViewHolder extends  RecyclerView.ViewHolder{
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.tx)
        TextView tx;
        public MovieViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }



}
