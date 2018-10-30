package com.pcpcpcpc.mytoast;
import android.content.Context;
import android.widget.Toast;

public class MyToast {
    public void show(Context c, String t){
        Toast.makeText(c, t, Toast.LENGTH_LONG).show();
    }
    public void showMultiplier(Context c, Integer x, Integer y){
        Toast.makeText(c, ""+(x*y), Toast.LENGTH_LONG).show();
    }
}
