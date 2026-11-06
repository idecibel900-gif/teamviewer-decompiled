package o;

import android.app.PendingIntent;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jh6 implements t96 {
    public di6 m;
    public nh6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1166o;
    public Object p;
    public Object[] q;
    public mh6 r;
    public final y26 s = new y26(this, 4);

    public jh6(di6 di6Var, nh6 nh6Var, String str, Object obj, Object[] objArr) {
        this.m = di6Var;
        this.n = nh6Var;
        this.f1166o = str;
        this.p = obj;
        this.q = objArr;
    }

    @Override // o.t96
    public final void a() {
        mh6 mh6Var = this.r;
        if (mh6Var != null) {
            ((ep3) mh6Var).G();
        }
    }

    @Override // o.t96
    public final void b() {
        mh6 mh6Var = this.r;
        if (mh6Var != null) {
            ((ep3) mh6Var).G();
        }
    }

    @Override // o.t96
    public final void c() throws NoSuchMethodException, PendingIntent.CanceledException, ClassNotFoundException, IOException {
        d();
    }

    public final void d() throws NoSuchMethodException, PendingIntent.CanceledException, ClassNotFoundException, IOException {
        String strU;
        nh6 nh6Var = this.n;
        mh6 mh6Var = this.r;
        if (mh6Var != null) {
            an4.q(mh6Var, ") is not null", "entry(");
            return;
        }
        if (nh6Var != null) {
            y26 y26Var = this.s;
            Object objA = y26Var.a();
            if (objA == null || nh6Var.a(objA)) {
                this.r = nh6Var.g(this.f1166o, y26Var);
                return;
            }
            if (objA instanceof a57) {
                a57 a57Var = (a57) objA;
                if (a57Var.e() == xz2.P || a57Var.e() == yl7.X || a57Var.e() == yl7.T) {
                    strU = "MutableState containing " + a57Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strU = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strU = zu1.u(objA);
            }
            throw new IllegalArgumentException(strU);
        }
    }
}
