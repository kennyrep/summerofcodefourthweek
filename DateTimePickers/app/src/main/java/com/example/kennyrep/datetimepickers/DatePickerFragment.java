package com.example.kennyrep.datetimepickers;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class	DatePickerFragment	extends DialogFragment
        implements	DatePickerDialog.OnDateSetListener	{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle	savedInstanceState)	{
        //	Use	the	current	date	as	the	default	date	in	the	picker.
        final Calendar c	=	Calendar.getInstance();
        int	year	=	c.get(Calendar.YEAR);
        int	month	=	c.get(Calendar.MONTH);
        int	day	=	c.get(Calendar.DAY_OF_MONTH);
        //	Create	a	new	instance	of	DatePickerDialog	and	return	it.
        return	new	DatePickerDialog(getActivity(),	this,	year,	month,	day);

    }

    @Override
    public	void	onDateSet(DatePicker	view,	int	year,	int	month,	int	day)	{
        //	Set	the	activity	to	the	Main	Activity.
        MainActivity	activity	=	(MainActivity)	getActivity();
        //	Invoke	Main	Activity's	processDatePickerResult()	method.
        activity.processDatePickerResult(year,	month,	day);
    }

    public	void	processTimePickerResult(int	hourOfDay,	int	minute)	{
        //	Convert	time	elements	into	strings.
        String	hour_string	=	Integer.toString(hourOfDay);
        String	minute_string	=	Integer.toString(minute);
        //	Assign	the	concatenated	strings	to	timeMessage.
        String	timeMessage	=	(hour_string	+	":"	+	minute_string);
       // Toast.makeText(this,	getString(R.string.time)	+	timeMessage,
         //       Toast.LENGTH_SHORT).show();
    }
}
