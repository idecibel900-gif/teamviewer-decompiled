package o;

import android.view.View;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ M2MClientActivity n;

    public /* synthetic */ si4(M2MClientActivity m2MClientActivity, byte b) {
        this.m = b;
        this.n = m2MClientActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        M2MClientActivity m2MClientActivity = this.n;
        switch (b) {
            case 0:
                int i = M2MClientActivity.h0;
                View decorView = m2MClientActivity.getWindow().getDecorView();
                decorView.getClass();
                decorView.setSystemUiVisibility(5894);
                break;
            default:
                int i2 = M2MClientActivity.h0;
                View decorView2 = m2MClientActivity.getWindow().getDecorView();
                decorView2.getClass();
                decorView2.setSystemUiVisibility(5894);
                m2MClientActivity.Z = (short) 3000;
                break;
        }
    }
}
