package com.joserivasgomez.tesloshop

import io.flutter.embedding.android.FlutterActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity: FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppCenter.start(getApplication(), "0cb17681-bcd7-4b49-a0b8-103ef93c951c",
                  Analytics.class, Crashes.class);

    }



}
