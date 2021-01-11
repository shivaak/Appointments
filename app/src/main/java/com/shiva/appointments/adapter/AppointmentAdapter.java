package com.shiva.appointments.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shiva.appointments.R;
import com.shiva.appointments.model.AppointmentModel;

import java.text.SimpleDateFormat;
import java.util.List;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.ViewHolderItem> {

    private List<AppointmentModel> data;
    private Context context;

    public AppointmentAdapter(Context context, List<AppointmentModel> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.appointment_container, parent, false);
        return new ViewHolderItem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItem holder, int position) {
        holder.txtType.setText(data.get(position).getType());
        holder.txtTime.setText(new SimpleDateFormat("hh:mm aa").format(data.get(position).getDate()));
        holder.txtDesc.setText(data.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        if(data!=null){
            return data.size();
        }
        return 0;
    }

    static class ViewHolderItem extends RecyclerView.ViewHolder{

        private TextView txtType;
        private TextView txtTime;
        private TextView txtDesc;

        public ViewHolderItem(@NonNull View itemView) {
            super(itemView);
            txtType = itemView.findViewById(R.id.txtType);
            txtTime = itemView.findViewById(R.id.txtTime);
            txtDesc = itemView.findViewById(R.id.txtDesc);
        }
    }
}
