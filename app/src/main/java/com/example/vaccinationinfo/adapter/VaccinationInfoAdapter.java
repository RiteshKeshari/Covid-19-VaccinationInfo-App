package com.example.vaccinationinfo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vaccinationinfo.R;
import com.example.vaccinationinfo.model.VaccineModel;

import java.util.List;

public class VaccinationInfoAdapter extends RecyclerView.Adapter<VaccinationInfoAdapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<VaccineModel> list_vaccine_center;

    public VaccinationInfoAdapter(Context mcontext, List<VaccineModel> list_vaccine_center) {
        this.layoutInflater = LayoutInflater.from(mcontext);
        this.list_vaccine_center = list_vaccine_center;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.vaccination_info_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.vaccineCentre.setText(list_vaccine_center.get(position).getVaccineCenter());
        holder.vaccinationCenterAddr.setText(list_vaccine_center.get(position).getVaccinationCenterAddress());
        holder.vaccinationTimings.setText(list_vaccine_center.get(position).getVaccineTimings() + "-" +
                list_vaccine_center.get(position).getVaccineCenterTime());
        holder.vaccineName.setText(list_vaccine_center.get(position).getVaccineName());
        holder.vaccinationAvailable.setText(list_vaccine_center.get(position).getVaccineAvailable());
        holder.vaccineCharges.setText(list_vaccine_center.get(position).getVaccinationCharges());
        holder.vaccinationAge.setText(list_vaccine_center.get(position).getVaccinationAge());
    }

    @Override
    public int getItemCount() {

        return list_vaccine_center.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView vaccineCentre;
        TextView vaccinationCenterAddr;
        TextView vaccinationTimings;
        TextView vaccineName;
        TextView vaccineCharges;
        TextView vaccinationAge;
        TextView vaccinationAvailable;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            vaccinationAge = itemView.findViewById(R.id.vaccinationage);
            vaccinationAge = itemView.findViewById(R.id.isAvailable);
            vaccinationAge = itemView.findViewById(R.id.vaccineCharges);
            vaccinationAge = itemView.findViewById(R.id.vaccineName);
            vaccinationAge = itemView.findViewById(R.id.vaccineTimings);
            vaccinationAge = itemView.findViewById(R.id.vaccineCentre);
            vaccinationAge = itemView.findViewById(R.id.vaccineLocation);
        }
    }
}
