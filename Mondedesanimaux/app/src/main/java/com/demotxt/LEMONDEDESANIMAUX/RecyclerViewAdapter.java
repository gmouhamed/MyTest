package com.demotxt.LEMONDEDESANIMAUX;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.demotxt.LEMONDEDESANIMAUX.R;

import java.util.List;

/**
 * Created by Aws on 28/01/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Animal> mData ;


    public RecyclerViewAdapter(Context mContext, List<Animal> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_animal,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_animal_titre.setText(mData.get(position).getTitre());
        holder.img_animal_image.setImageResource(mData.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Animal_Activity.class);

                // passing data to the book activity
                intent.putExtra("Titre",mData.get(position).getTitre());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("image",mData.get(position).getImage());
                // start the activity
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_animal_titre;
        ImageView img_animal_image;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_animal_titre = (TextView) itemView.findViewById(R.id.animal_titre_id) ;
            img_animal_image = (ImageView) itemView.findViewById(R.id.animal_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }


}
