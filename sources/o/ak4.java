package o;

import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ MainActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f332o;

    public /* synthetic */ ak4(MainActivity mainActivity, Object obj, byte b) {
        this.m = b;
        this.n = mainActivity;
        this.f332o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.f332o;
        MainActivity mainActivity = this.n;
        switch (b) {
            case 0:
                int i = MainActivity.w0;
                mainActivity.b0(w05.Partnerlist, new f4(obj));
                break;
            default:
                int i2 = MainActivity.w0;
                mainActivity.b0(w05.Connect, new yt2(mainActivity, obj, (byte) 22));
                break;
        }
    }
}
