package com.appside.losefatsquick.view.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.models.PatientsListItem;

import org.w3c.dom.Text;

import java.util.List;

public class MyPatientItemAdapter extends RecyclerView.Adapter<MyPatientItemAdapter.MyViewHolder> {
    public OnItemClickListener listener = null;
    public List<PatientsListItem> myDataSet = null;
    public MyPatientItemAdapter(List<PatientsListItem> myDataSet, OnItemClickListener listener){
        this.listener = listener;
        this.myDataSet = myDataSet;
    }


    @NonNull
    @Override
    public MyPatientItemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.patient_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyPatientItemAdapter.MyViewHolder holder, int position) {
        PatientsListItem currentItem = this.myDataSet.get(position);
        holder.patient.setText(currentItem.getPatientProcess().getName());
        holder.lastUpdate.setText(currentItem.getLastUpdate() + " " + currentItem.getMeasurementValue());
    }

    @Override
    public int getItemCount() {
        return myDataSet.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView patient = null;
        TextView lastUpdate = null;
        public MyViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            patient = itemView.findViewById(R.id.patient_textView);
            lastUpdate = itemView.findViewById(R.id.timelapse_textView);
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
