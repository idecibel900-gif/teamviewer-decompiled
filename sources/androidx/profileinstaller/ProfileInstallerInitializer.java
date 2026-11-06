package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import o.ei3;
import o.rk5;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements ei3 {
    @Override // o.ei3
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.ei3
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: o.mt5
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new fs(applicationContext, (byte) 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new rk5((byte) 2);
    }
}
