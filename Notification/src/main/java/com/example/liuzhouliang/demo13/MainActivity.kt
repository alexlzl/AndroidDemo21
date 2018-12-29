package com.example.liuzhouliang.demo13

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*


/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2018/12/28 15:33
 *
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        show_notify.setOnClickListener {
            //            Toast.makeText(this,"test",Toast.LENGTH_LONG).show()
            showNotify()
        }
    }

    fun showNotify() {
        val notificationCompatBuilder = NotificationCompat.Builder(this, "name")
        val intent=Intent(this,DetailActivity::class.java)
        val pendingIntent= PendingIntent.getActivity(this,1, intent,0)
        val notificationCompatStyle=NotificationCompat.BigTextStyle()
        notificationCompatStyle .setBigContentTitle("setBigContentTitle")
        notificationCompatStyle.setSummaryText("setSummaryText")
        notificationCompatStyle.bigText("bigText")
        notificationCompatBuilder.setOngoing(true).setStyle(notificationCompatStyle).setTicker("setTicker").setColor(Color.RED).setContentTitle("setContentTitle").setContentInfo("contentInfo").setContentText("contentText").setSubText("subText").setNumber(2).setAutoCancel(true).setSmallIcon(R.drawable.icon).setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.ic_launcher)).setContentIntent(pendingIntent).setFullScreenIntent(pendingIntent,true).setDefaults(NotificationCompat.DEFAULT_ALL)
        val notificationCompat=notificationCompatBuilder.build()
        val notificationManager=getSystemService(Context.NOTIFICATION_SERVICE)
        (notificationManager as NotificationManager).notify(100,notificationCompat)

    }
}