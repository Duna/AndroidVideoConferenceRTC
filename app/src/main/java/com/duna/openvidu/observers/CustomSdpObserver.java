package com.duna.openvidu.observers;

/**
 * Created by Duna Marius dunatv@gmail.com
 * on 31/May/2022
 */

import android.util.Log;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

public class CustomSdpObserver implements SdpObserver {

    private String tag;

    public CustomSdpObserver(String tag) {
        this.tag = "SdpObserver-" + tag;
    }

    private void log(String s) {
        Log.d(tag, s);
    }

    @Override
    public void onCreateSuccess(SessionDescription sessionDescription) {
        log("onCreateSuccess " + sessionDescription);
    }

    @Override
    public void onSetSuccess() {
        log("onSetSuccess ");
    }

    @Override
    public void onCreateFailure(String s) {
        log("onCreateFailure " + s);
    }

    @Override
    public void onSetFailure(String s) {
        log("onSetFailure " + s);
    }
}
