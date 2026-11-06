package o;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class jm8 {
    public final yc4 a;
    public final dt5 b;
    public final an8 c;

    static {
        we4.i("WMFgUpdater");
    }

    public jm8(WorkDatabase workDatabase, dt5 dt5Var, yc4 yc4Var) {
        this.b = dt5Var;
        this.a = yc4Var;
        this.c = workDatabase.w();
    }
}
