package o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class mh2 extends l47 {
    public final Object a;
    public final String b;
    public final tc8 c;
    public final nl8 d;

    public mh2(Object obj, String str, z06 z06Var, tc8 tc8Var) {
        this.a = obj;
        this.b = str;
        this.c = tc8Var;
        nl8 nl8Var = new nl8(str + " value: " + obj);
        StackTraceElement[] stackTrace = nl8Var.getStackTrace();
        stackTrace.getClass();
        nl8Var.setStackTrace((StackTraceElement[]) cx.M0(2, stackTrace).toArray(new StackTraceElement[0]));
        this.d = nl8Var;
    }

    @Override // o.l47
    public final Object l() throws nl8 {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            throw this.d;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            gk0.s();
            return null;
        }
        Log.d("qz6", this.b + " value: " + this.a);
        return null;
    }
}
