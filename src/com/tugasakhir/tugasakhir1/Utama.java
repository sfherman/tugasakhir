package com.tugasakhir.tugasakhir1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Utama extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_utama);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.utama, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void aries(View y){
		Intent a = new Intent(getApplicationContext(),Aries.class);
		startActivity(a);
	}
	public void aquarius(View n){
		Intent b = new Intent(getApplicationContext(),Aquarius.class);
		startActivity(b);
	}
	public void cancer(View o){
		Intent c = new Intent(getApplicationContext(),Cancer.class);
		startActivity(c);
	}
	public void capricorn(View p){
		Intent d = new Intent(getApplicationContext(),Capricorn.class);
		startActivity(d);
	}
	public void gemini(View q){
		Intent e = new Intent(getApplicationContext(),Gemini.class);
		startActivity(e);
	}
	public void leo(View r){
		Intent f = new Intent(getApplicationContext(),Leo.class);
		startActivity(f);
	}
	public void libra(View s){
		Intent g = new Intent(getApplicationContext(),Libra.class);
		startActivity(g);
	}
	public void pisces(View t){
		Intent h = new Intent(getApplicationContext(),Pisces.class);
		startActivity(h);
	}
	public void sagitarius(View u){
		Intent j = new Intent(getApplicationContext(),Sagitarius.class);
		startActivity(j);
	}
	public void scorpio(View v){
		Intent k = new Intent(getApplicationContext(),Scorpio.class);
		startActivity(k);
	}
	public void taurus(View w){
		Intent l = new Intent(getApplicationContext(),Taurus.class);
		startActivity(l);
	}
	public void virgo(View x){
		Intent m = new Intent(getApplicationContext(),Virgo.class);
		startActivity(m);
	}
}
