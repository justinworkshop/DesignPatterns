package com.example.bridge;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.bridge.uml.Client;

public class MainActivity extends AppCompatActivity {

    private Button btnAudio;

    private AudioManager audioManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Client.main(null);

        audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);

        btnAudio = findViewById(R.id.btn_audio);
        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAudio();
            }
        });
    }

    private void getAudio() {
        int streamMusic = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        int streamAlarm = audioManager.getStreamVolume(AudioManager.STREAM_ALARM);
        int streamRing = audioManager.getStreamVolume(AudioManager.STREAM_RING);
        int streamSystem = audioManager.getStreamVolume(AudioManager.STREAM_SYSTEM);
        int streamVoiceCall = audioManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL);
        int streamAccessibility = audioManager.getStreamVolume(AudioManager.STREAM_ACCESSIBILITY);

        Log.d("TEST_VOLUME", "streamMusic:" + streamMusic + ", streamAlarm:" + streamAlarm
                + ", streamRing:" + streamRing
                + ", streamSystem:" + streamSystem
                + ", streamVoiceCall:" + streamVoiceCall
                + ", streamAccessibility:" + streamAccessibility);
    }
}
