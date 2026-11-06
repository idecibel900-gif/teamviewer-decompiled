package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z60 implements j30 {
    public boolean m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2673o;
    public Object p;
    public Object q;
    public final Object r;

    public z60(fp1 fp1Var, j93 j93Var) {
        j93Var.getClass();
        this.n = fp1Var;
        this.f2673o = j93Var;
        this.p = hm3.e();
        this.q = new qf2(new fj4(this, (byte) 0));
        this.r = new qf2(new fj4(this, (byte) 1));
    }

    public void a(w41 w41Var) {
        ap8 ap8Var = (ap8) ((vz2) this.r).j.get((gr) this.f2673o);
        if (ap8Var != null) {
            ap8Var.m(w41Var);
        }
    }

    @Override // o.j30
    public void c(w41 w41Var) {
        ((vz2) this.r).m.post(new it8((byte) 22, this, w41Var, false));
    }

    public z60(LockManager lockManager, RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.n = lockManager;
        this.f2673o = remoteControlApplication;
        this.p = sharedPreferences;
        k6 k6Var = new k6((Object) this, (byte) 1);
        this.r = k6Var;
        AccountViewModelBase accountViewModelBaseG = di1.g();
        this.q = accountViewModelBaseG;
        if (accountViewModelBaseG != null) {
            accountViewModelBaseG.b(k6Var);
        }
    }

    public z60(vz2 vz2Var, com.google.android.gms.common.internal.a aVar, gr grVar) {
        Objects.requireNonNull(vz2Var);
        this.r = vz2Var;
        this.p = null;
        this.q = null;
        this.m = false;
        this.n = aVar;
        this.f2673o = grVar;
    }
}
