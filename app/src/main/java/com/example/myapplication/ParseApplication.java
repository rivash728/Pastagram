package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2GYqMvzaIRAMhCm1EgjpXT74y9b64ALJzpfec9vC")
                .clientKey("eT5gRvmpnr1F7SJPP0OK8l7cMRkZ9tbRzhvSBpzB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
