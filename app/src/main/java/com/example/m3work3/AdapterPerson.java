package com.example.m3work3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterPerson extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<String> names, number, namePersonContact;


 /*   public AdapterPerson(ArrayList<String> names, ArrayList<String> number, ArrayList<String> namePersonContact) {
        this.names = names;
        this.number = number;
        this.namePersonContact = namePersonContact;
    }
    public AdapterPerson(ArrayList<String> namePersonContact) {
        this.namePersonContact = namePersonContact;
    }*/
    public AdapterPerson(ArrayList<String> names, ArrayList<String> number) {
        this.names = names;
        this.number = number;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.onBind(names.get(position), number.get(position));
   //     holder.onBind(names.get(position), number.get(position), namePersonContact.get(position));
  //      holder.onBind(namePersonContact.get(position));
    }

    @Override
    public int getItemCount() {
        return number.size();
    }
}
