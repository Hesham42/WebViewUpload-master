package com.cyhd.webviewupload;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

/**
 */public class FileUtils {


    /**
     *
     * Check if the SD card is mounted
     *
     * @return
     */
    public static boolean checkSDcard(Context context){
        boolean flag = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        if (!flag) {
            Toast.makeText(context, "Check if the SD card is mounted", Toast.LENGTH_SHORT).show();
        }
        return flag;
    }
}