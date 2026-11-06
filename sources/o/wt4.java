package o;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class wt4 implements ut4 {
    public final Context m;
    public fc1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wf5 f2443o = new wf5(1.0f);
    public n87 p;

    public wt4(Context context) {
        this.m = context;
    }

    @Override // o.ut4
    public final float G() {
        hc1 hc1Var;
        j97 j97Var;
        if (this.p == null) {
            Context context = this.m;
            jx4 jx4Var = kl8.a;
            synchronized (jx4Var) {
                try {
                    Object objG = jx4Var.g(context);
                    hc1Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        kf0 kf0VarD = ka0.d(-1, 6, null);
                        objG = yo1.W(new ih1(new gy4(contentResolver, uriFor, new uy(kf0VarD, yo1.x(Looper.getMainLooper())), kf0VarD, context, null), (byte) 2), hm3.e(), new d97(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        jx4Var.m(context, objG);
                    }
                    j97Var = (j97) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f2443o.A(((Number) j97Var.getValue()).floatValue());
            fc1 fc1Var = this.n;
            if (fc1Var == null) {
                hk0.l("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.p = im3.R(fc1Var, null, null, new vt4(j97Var, this, hc1Var, (byte) 0), 3);
        }
        return this.f2443o.z();
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        return xk0.v(this, ce1Var);
    }
}
