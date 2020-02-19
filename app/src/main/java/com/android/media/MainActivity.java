package com.android.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button mPlayBtn;
    private Button mDownloadBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayBtn = (Button) findViewById(R.id.play_btn);
        mDownloadBtn = (Button) findViewById(R.id.download_btn);
        mPlayBtn.setOnClickListener(this);
        mDownloadBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mPlayBtn) {
            Intent intent = new Intent(this, PlayFunctionActivity.class);
            startActivity(intent);
        } else if (v == mDownloadBtn) {
            Intent intent = new Intent(this, DownloadFunctionActivity.class);
            startActivity(intent);
        }
    }
}
