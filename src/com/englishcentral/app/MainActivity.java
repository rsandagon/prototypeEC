
package com.englishcentral.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.englishcentral.app.rest.RestClient;
import com.englishcentral.app.widget.LanguageSpinner;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.res.StringArrayRes;
import com.googlecode.androidannotations.annotations.rest.RestService;

@EActivity
public class MainActivity extends Activity
{
	@ViewById
	TextView facebook_button, send_email_checkbox,register_email;
	
	@ViewById 
	ImageView divider;
	
	@ViewById
	LanguageSpinner language_spinner;
    
	@RestService
    RestClient restClient;

	@StringArrayRes(R.array.locations)
	String [] items;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
        	setContentView(R.layout.activity_main);
        }else{
        	setContentView(R.layout.activity_main_landscape);        	
        }
    }
	
    @AfterViews
    void afterViews() {
    	initFonts();
    	initSpinner();
    }

    //	sets the LanguageSpinner
    private void initSpinner() {
    	language_spinner.setEntries(items);
	}

	//	sets the fonts
    private void initFonts() {
    	Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Roboto-BoldCondensed.ttf");
    	Typeface thinFont = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
    	facebook_button.setTypeface(font);
    	register_email.setTypeface(font);
    	send_email_checkbox.setTypeface(thinFont);
    	
	}

    @Click(R.id.register_email)
    void registerEmail(){
    	//	showDialog here
    }
    
    @Click(R.id.facebook_button)
    void loginToFacebook(){
    	//Todo: connect to FB sdk 
    }
    
    
    
//	NOTE: Could be handy when we get to use REST call soon.
//	@UiThread
//    void doSomethingElseOnUiThread() {
//    }

//    @Background
//    void doSomethingInBackground() {
//        restClient.main();
//        doSomethingElseOnUiThread();
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }

}
