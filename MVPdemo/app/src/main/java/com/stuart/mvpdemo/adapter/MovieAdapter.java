package com.stuart.mvpdemo.adapter;

import android.content.Context;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.stuart.mvpdemo.R;
import com.stuart.mvpdemo.model.entity.MovieInfo;



import butterknife.ButterKnife;
import butterknife.BindView;

/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 下午 15:11
 * description:
 */
public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    private Context context;
    private MovieInfo movieInfo;


    public MovieAdapter(Context context,MovieInfo movieInfo){
        this.context=context;
        this.movieInfo=movieInfo;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v =View.inflate(parent.getContext(),R.layout.list_item_card_main,null);
        return new MovieViewHolder(v);


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof MovieViewHolder)
        {
               MovieViewHolder movieViewHolder = (MovieViewHolder) holder;
               movieViewHolder.tx.setText(movieInfo.getSubjects().get(position).getSubject().getTitle());
               Glide.with(context).load(movieInfo.getSubjects().get(position).getSubject().getImages().getMedium()).into(movieViewHolder.img);
        }



    }

    @Override
    public int getItemCount() {
        return movieInfo.getSubjects().size();
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
