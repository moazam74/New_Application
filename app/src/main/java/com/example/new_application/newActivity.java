package com.example.new_application;

import android.net.wifi.p2p.WifiP2pManager;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class newActivity extends AppCompatActivity implements WifiP2pManager.ActionListener {

    @Override
    public String toString() {
        return "newActivity{}";
    }

}
