
package com.englishcentral.app;

import android.app.Application;
import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

@ReportsCrashes(formKey = "YOUR_FORM_KEY")
public class EnglishCentralApplication
    extends Application
{


    @Override
    public void onCreate() {
    	//	uncomment once checking ACRA
        //ACRA.init(this);
        super.onCreate();
    }

}
