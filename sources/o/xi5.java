package o;

import android.app.Application;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class xi5 {
    public static final xi5 c = new xi5(qa2.f1815o, new h31((byte) 27));
    public final h31 a;
    public final at5 b;

    public xi5(qa2 qa2Var, h31 h31Var) {
        at5 at5Var;
        this.a = h31Var;
        if (qa2Var.n) {
            at5Var = qa2.p;
        } else {
            int iMyPid = Process.myPid();
            String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : fx3.f(iMyPid, "Process pid(", ")");
            synchronized (qa2Var.m) {
                if (!qa2Var.n) {
                    qa2.p = new at5(qa2Var, iMyPid, processName);
                    qa2Var.n = true;
                }
            }
            at5Var = qa2.p;
        }
        this.b = at5Var;
    }
}
