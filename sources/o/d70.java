package o;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class d70 extends oe8 {
    public nw4 A;
    public nw4 B;
    public nw4 C;
    public nw4 D;
    public nw4 E;
    public nw4 G;
    public nw4 I;
    public nw4 J;
    public g68 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ae f592o;
    public j93 p;
    public cj3 q;
    public xc0 r;
    public c70 s;
    public String t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public byte u = 0;
    public boolean F = true;
    public int H = 0;

    public static void Y0(nw4 nw4Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            nw4Var.setValue(obj);
        } else {
            nw4Var.postValue(obj);
        }
    }

    public final int V0() {
        ae aeVar = this.f592o;
        if (aeVar == null) {
            return 0;
        }
        j93 j93Var = this.p;
        int i = aeVar.b;
        if (i != 0) {
            return i;
        }
        return j93Var != null ? 15 : 255;
    }

    public final void W0(int i) {
        nw4 nw4Var = this.I;
        if (nw4Var == null) {
            nw4Var = new nw4();
            this.I = nw4Var;
        }
        Y0(nw4Var, Integer.valueOf(i));
    }

    public final void X0(boolean z) {
        nw4 nw4Var = this.E;
        if (nw4Var == null) {
            nw4Var = new nw4();
            this.E = nw4Var;
        }
        Y0(nw4Var, Boolean.valueOf(z));
    }
}
