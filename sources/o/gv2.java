package o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gv2 implements a53, ai6, we8 {
    public final ut2 m;
    public final ve8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jt2 f925o;
    public se8 p;
    public x84 q = null;
    public a65 r = null;

    public gv2(ut2 ut2Var, ve8 ve8Var, jt2 jt2Var) {
        this.m = ut2Var;
        this.n = ve8Var;
        this.f925o = jt2Var;
    }

    public final void a(l84 l84Var) {
        this.q.d(l84Var);
    }

    public final void e() {
        if (this.q == null) {
            this.q = new x84(this, true);
            a65 a65Var = new a65(new zh6(this, new y26(this, (byte) 7)));
            this.r = a65Var;
            a65Var.M0();
            this.f925o.run();
        }
    }

    @Override // o.a53
    public final se8 k() {
        Application application;
        ut2 ut2Var = this.m;
        se8 se8VarK = ut2Var.k();
        if (se8VarK != ut2Var.h0) {
            this.p = se8VarK;
            return se8VarK;
        }
        se8 se8Var = this.p;
        if (se8Var != null) {
            return se8Var;
        }
        for (Context applicationContext = ut2Var.r0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                bi6 bi6Var = new bi6(application, ut2Var, ut2Var.r);
                this.p = bi6Var;
                return bi6Var;
            }
        }
        application = null;
        bi6 bi6Var2 = new bi6(application, ut2Var, ut2Var.r);
        this.p = bi6Var2;
        return bi6Var2;
    }

    @Override // o.a53
    public final hw4 l() {
        Application application;
        ut2 ut2Var = this.m;
        Context applicationContext = ut2Var.r0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        hw4 hw4Var = new hw4(0);
        LinkedHashMap linkedHashMap = hw4Var.a;
        if (application != null) {
            linkedHashMap.put(re8.d, application);
        }
        linkedHashMap.put(j51.u, ut2Var);
        linkedHashMap.put(j51.v, this);
        Bundle bundle = ut2Var.r;
        if (bundle != null) {
            linkedHashMap.put(j51.w, bundle);
        }
        return hw4Var;
    }

    @Override // o.we8
    /* JADX INFO: renamed from: o */
    public final ve8 getG0() {
        e();
        return this.n;
    }

    @Override // o.ai6
    public final a65 r() {
        e();
        return (a65) this.r.f302o;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        e();
        return this.q;
    }
}
