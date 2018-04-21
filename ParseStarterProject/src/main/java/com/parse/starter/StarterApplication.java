/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("7deba573ffcea10f4c81e7cac6d5f262a9ecbd15")
            .clientKey("0b7f9ea3db4945a07b10c6edbfeee2312ebfbfbd")
            .server("http://18.222.40.131:80/parse/")//ec2-18-222-40-131.us-east-2.compute.amazonaws.com
//BeqQiHO8Stiw
            //http://18.222.40.131/apps/My%20Bitnami%20Parse%20API/browser/ExampleObject
            //https://us-east-2.console.aws.amazon.com/ec2/v2/home?region=us-east-2#Instances:search=i-017f75be698aea50c;sort=instanceId
            .build()
    );





    //ParseUser.enableAutomaticUser();

    ParseACL defaultACL = new ParseACL();
    defaultACL.setPublicReadAccess(true);
    defaultACL.setPublicWriteAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);

  }
}
