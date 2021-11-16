package com.example.news.getcatagory;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.news.R;
import com.example.news.jason_class.mode_class;
import com.example.news.webview;

import java.util.List;

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.hoder> {
    List<mode_class> list;
    Context context;
    public recycler_adapter(List<mode_class> list, Context context)
    {
        this.list=list;
        this.context=context;
        notifyDataSetChanged();
    }
    public void setlist(List<mode_class> list)
    {
        this.list=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public hoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent,false);
        return new hoder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull hoder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, webview.class);
                intent.putExtra("url",list.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        holder.auther.setText(list.get(position).getAuther());
        holder.publish.setText(list.get(position).getPublishedAt());
        holder.header.setText(list.get(position).getTitle());
        holder.content.setText(list.get(position).getContent());
        Glide.with(context).load(list.get(position).getUrlToImage()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class hoder extends RecyclerView.ViewHolder
    {
        TextView publish,auther,content,header;
        ImageView image;
        CardView cardView;
        public hoder(@NonNull View itemView) {

            super(itemView);
            publish=(TextView)itemView.findViewById(R.id.time);
            auther=(TextView)itemView.findViewById(R.id.auther);
            content=(TextView)itemView.findViewById(R.id.content);
            header=(TextView)itemView.findViewById(R.id.main_head);
            image=(ImageView)itemView.findViewById(R.id.imageView);
            cardView=(CardView)itemView.findViewById(R.id.cardview);
        }
    }
}
