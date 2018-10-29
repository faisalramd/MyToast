package com.pcpcpcpc.mytoast;
import android.content.Context;
import android.widget.Toast;

public class MyToast {
    private void show(Context c, String t){
        Toast.makeText(c, t, Toast.LENGTH_LONG).show();
    }
}
