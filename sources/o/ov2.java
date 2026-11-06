package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ov2 implements df7 {
    public final Context m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nd f1681o;
    public final boolean p;
    public final boolean q;
    public final kh7 r;
    public boolean s;

    public ov2(Context context, String str, nd ndVar, boolean z, boolean z2) {
        ndVar.getClass();
        this.m = context;
        this.n = str;
        this.f1681o = ndVar;
        this.p = z;
        this.q = z2;
        this.r = new kh7(new zz0(this, (byte) 18));
    }

    @Override // o.df7
    public final bf7 R() {
        return ((nv2) this.r.getValue()).e(false);
    }

    @Override // o.df7
    public final bf7 X() {
        return ((nv2) this.r.getValue()).e(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kh7 kh7Var = this.r;
        if (kh7Var.a()) {
            ((nv2) kh7Var.getValue()).close();
        }
    }

    @Override // o.df7
    public final String getDatabaseName() {
        return this.n;
    }

    @Override // o.df7
    public final void setWriteAheadLoggingEnabled(boolean z) {
        kh7 kh7Var = this.r;
        if (kh7Var.a()) {
            ((nv2) kh7Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.s = z;
    }
}
