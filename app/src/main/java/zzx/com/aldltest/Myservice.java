package zzx.com.aldltest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by zhangzhixin on 2017/8/2.
 */

public class Myservice extends Service {
    private MyAldl.Stub mbinder= new MyAldl.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String sendText(String text) throws RemoteException {
          String str="Service get"+text;
            return str;
        }
    };
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mbinder;
    }
}
