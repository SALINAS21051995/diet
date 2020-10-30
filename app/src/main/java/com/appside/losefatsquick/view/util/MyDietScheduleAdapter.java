package com.appside.losefatsquick.view.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.models.DietColumns;

import java.util.List;

public class MyDietScheduleAdapter extends RecyclerView.Adapter<MyDietScheduleAdapter.MyViewHolder>{

    public MyDietScheduleAdapter.OnItemClickListener listener;
    public List<DietColumns> myDataSet;

    public MyDietScheduleAdapter(List<DietColumns> myDataSet, MyDietScheduleAdapter.OnItemClickListener listener){
        this.listener = listener;
        this.myDataSet = myDataSet;
    }

    @NonNull
    @Override
    public MyDietScheduleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.diet_schedule, parent, false));
    }

    @Override
    public void onBindViewHolder(MyDietScheduleAdapter.MyViewHolder holder, int position) {
        DietColumns currentItem = this.myDataSet.get(position);
        holder.col1.setText(currentItem.getCol1());
        holder.col2.setText(currentItem.getCol2());
        holder.col3.setText(currentItem.getCol3());
        holder.col4.setText(currentItem.getCol4());
    }

    @Override
    public int getItemCount() {
        return myDataSet.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView col1;
        TextView col2;
        TextView col3;
        TextView col4;
        public MyViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            col1 = itemView.findViewById(R.id.col1_textView);
            col2 = itemView.findViewById(R.id.col2_textView);
            col3 = itemView.findViewById(R.id.col3_textView);
            col4 = itemView.findViewById(R.id.col4_textView);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if(position != RecyclerView.NO_POSITION){
                listener.onItemClick(position);
            }
        }
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
