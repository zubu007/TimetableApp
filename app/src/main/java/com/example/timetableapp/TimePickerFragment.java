package com.example.timetableapp;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;

import static android.content.Intent.getIntent;

public class TimePickerFragment extends DialogFragment {

    int a, digit = 0, hour, min, b, x, y;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        b = a;

        while(a>0)
        {
            a= a/10;
            digit ++;
        }
        x = b/100;
        y = (b - (x*100)) /10;

        hour = x;
        min = y;
        return new TimePickerDialog(getActivity(),(TimePickerDialog.OnTimeSetListener) getActivity(), hour, min, android.text.format.DateFormat.is24HourFormat(getActivity()));
    }


}
