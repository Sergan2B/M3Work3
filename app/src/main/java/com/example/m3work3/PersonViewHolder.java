package com.example.m3work3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    private TextView namePerson, numberPerson, namePersonContact;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        namePerson = itemView.findViewById(R.id.textViewName);
        numberPerson = itemView.findViewById(R.id.textViewNumber);
        namePersonContact = itemView.findViewById(R.id.buttonText);
    }

    public void onBind(String name, String number, String nameContact) {
        namePerson.setText(name);
        numberPerson.setText(number);
        namePersonContact.setText(nameContact);
    }
    public void onBind(String nameContact) {
        namePersonContact.setText(nameContact);
    }
    public void onBind(String name, String number) {
        namePerson.setText(name);
        numberPerson.setText(number);
    }
}
