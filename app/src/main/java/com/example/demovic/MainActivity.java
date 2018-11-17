/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.example.demovic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.cordova.*;
import org.apache.cordova.engine.SystemWebView;

import java.util.concurrent.ExecutorService;

public class MainActivity extends Activity implements CordovaInterface {

    SystemWebView cwv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cwv = (SystemWebView) findViewById(R.id.tutorialView    );
        Config.init(this);
        cwv.loadUrl(Config.getStartUrl());
//        launchUrl = "file:///android_asset/www/index.html";
//        cwv.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public void startActivityForResult(CordovaPlugin command, Intent intent, int requestCode) {

    }

    @Override
    public void setActivityResultCallback(CordovaPlugin plugin) {

    }

    @Override
    public Activity getActivity() {
        return null;
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public Object onMessage(String id, Object data) {
        return null;
    }

    @Override
    public ExecutorService getThreadPool() {
        return null;
    }

    @Override
    public void requestPermission(CordovaPlugin plugin, int requestCode, String permission) {

    }

    @Override
    public void requestPermissions(CordovaPlugin plugin, int requestCode, String[] permissions) {

    }

    @Override
    public boolean hasPermission(String permission) {
        return false;
    }
}
