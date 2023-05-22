package com.example.lovelanguadge

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private  var mPlayer: MediaPlayer? = null
    var count=0
    lateinit var btn:Button
    lateinit var btn11: ImageButton
    lateinit var btn2:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.button)
        mPlayer= MediaPlayer.create(this, R.raw.normpesna)
        btn11 = findViewById(R.id.imageButton)
        btn11.setImageResource(R.drawable.ic_baseline_music_off_24)
        btn2=findViewById(R.id.button2)
        btn3=findViewById(R.id.button3)
        btn.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))}
        btn2.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))}
        btn3.setOnClickListener{
            startActivity(Intent(this,MainActivity4::class.java))}
        btn11.setOnClickListener{
            count++
            if(count==1){
                mPlayer!!.start()
                btn11.setImageResource(R.drawable.ic_baseline_music_note_24)
            }
            else{
                mPlayer!!.stop()
                mPlayer!!.prepare()
                btn11.setImageResource(R.drawable.ic_baseline_music_off_24)
                count=0
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        if (mPlayer!!.isPlaying) {
            mPlayer!!.stop()
            mPlayer!!.prepare()
        }
    }

    override fun onStop() {
        super.onStop()
        if (mPlayer!!.isPlaying) {
            mPlayer!!.stop()
            mPlayer!!.prepare()
        }
    }

    override fun onPause() {
        super.onPause()
        if (mPlayer!!.isPlaying) {
            mPlayer!!.stop()
            mPlayer!!.prepare()
        }
    }

    override fun onStart() {
        super.onStart()
        count=0
        btn11.setImageResource(R.drawable.ic_baseline_music_off_24)

        }
    }

