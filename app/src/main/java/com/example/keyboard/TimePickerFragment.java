package com.example.keyboard;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        final Calendar t = Calendar.getInstance();
        int hour = t.get(Calendar.HOUR);
        int minute = t.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),this, hour, minute, true);

    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        MainActivity activity = (MainActivity) getActivity();
        activity.proccesTimePickerResult(hourOfDay,minute);
    }


}
