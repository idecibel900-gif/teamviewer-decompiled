package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ut2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f1301o;

    public /* synthetic */ kt2(ut2 ut2Var, Bundle bundle, byte b) {
        this.m = b;
        this.n = ut2Var;
        this.f1301o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Bundle bundle = this.f1301o;
        ut2 ut2Var = this.n;
        switch (b) {
            case 0:
                ut2Var.h0(bundle);
                break;
            case 1:
                ut2Var.X(bundle);
                break;
            case 2:
                ut2Var.l0(bundle);
                break;
            default:
                ut2Var.k0(ut2Var.U, bundle);
                break;
        }
    }
}
