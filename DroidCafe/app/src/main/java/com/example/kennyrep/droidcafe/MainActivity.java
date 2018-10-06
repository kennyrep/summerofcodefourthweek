package com.example.kennyrep.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public	void	displayToast(String	message)	{
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     *	Shows	a	message	that	the	donut	image	was	clicked.
     */
    public	void	showDonutOrder(View view)	{
        showFoodOrder(getString(R.string.donut_order_message));
    }
    /**
     *	Shows	a	message	that	the	ice	cream	sandwich	image	was	clicked.
     */
    public	void	showIceCreamOrder(View	view)	{
        showFoodOrder(getString(R.string.ice_cream_order_message));
    }
    /**
     *	Shows	a	message	that	the	froyo	image	was	clicked.
     */
    public	void	showFroyoOrder(View	view)	{
        showFoodOrder(getString(R.string.froyo_order_message));
    }


    /**
     *	Displays	a	toast	message	for	the	food	order
     *	and	starts	the	OrderActivity	activity.
     *	@param	message			Message	to	display.
     */
    public	void	showFoodOrder(String	message)	{
        displayToast(message);
        Intent intent	=	new	Intent(this,	OrderActivity.class);
        startActivity(intent);
    }

    @Override
    public	boolean	onOptionsItemSelected(MenuItem item)	{
        switch	(item.getItemId())	{

            case	R.id.status:
                displayToast(getString(R.string.action_status_message));
                return	true;
            case	R.id.favorites:
                displayToast(getString(R.string.action_favorites_message));
                return	true;
            case	R.id.contact:
                displayToast(getString(R.string.action_contact_message));
                return	true;
            case	R.id.orders:
                displayToast(getString(R.string.action_order_message));
                return	true;
            default:
                //	Do	nothing
        }
        return	super.onOptionsItemSelected(item);
    }
}
