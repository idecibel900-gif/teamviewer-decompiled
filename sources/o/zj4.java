package o;

import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ MainActivity n;

    public /* synthetic */ zj4(MainActivity mainActivity, byte b) {
        this.m = b;
        this.n = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        MainActivity mainActivity = this.n;
        switch (b) {
            case 0:
                int i = MainActivity.w0;
                mainActivity.b0(w05.Connect, new ju((byte) 24));
                break;
            default:
                int i2 = MainActivity.w0;
                mainActivity.b0(w05.Partnerlist, new ir((byte) 24));
                break;
        }
    }
}
