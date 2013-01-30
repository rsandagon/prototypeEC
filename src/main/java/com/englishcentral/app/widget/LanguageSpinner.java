package com.englishcentral.app.widget;

import com.englishcentral.app.R;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class LanguageSpinner extends Spinner {
	private Context thisContext = null; 
	public LanguageSpinner(Context context, AttributeSet attrs) {
		super(context,attrs);
		thisContext = context;
	}
	
	public void setEntries(String [] items){
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(thisContext,android.R.layout.simple_spinner_item, items) {
	
			     public View getView(int position, View convertView, ViewGroup parent) {
			             View v = super.getView(position, convertView, parent);
			
			             Typeface externalFont=Typeface.createFromAsset(thisContext.getAssets(), "fonts/Roboto-BoldCondensed.ttf");
			             ((TextView) v).setTypeface(externalFont);
			             ((TextView) v).setTextColor(Color.WHITE);
			
			             return v;
			     }
			
			
			     public View getDropDownView(int position,  View convertView,  ViewGroup parent) {
				    	 View v = super.getView(position, convertView, parent);
				    	 int padding = (int) getResources().getDimension(R.dimen.padding_medium);
				 		
			             Typeface externalFont=Typeface.createFromAsset(thisContext.getAssets(), "fonts/Neou-Bold.ttf");
			             ((TextView) v).setTypeface(externalFont);
			             ((TextView) v).setTextSize(getResources().getDimension(R.dimen.context_small));
			             ((TextView) v).setPadding(padding, padding, padding, padding);
			             ((TextView) v).setTextColor(Color.BLACK);
			
			             return v;
			     }
	   	};
   	
   		this.setAdapter(adapter);
	}
	
	
}
