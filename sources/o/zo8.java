package o;

/* JADX INFO: loaded from: classes.dex */
public final class zo8 implements c20 {
    public final /* synthetic */ vz2 a;

    public zo8(vz2 vz2Var) {
        this.a = vz2Var;
    }

    @Override // o.c20
    public final void onBackgroundStateChanged(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        xp8 xp8Var = this.a.m;
        xp8Var.sendMessage(xp8Var.obtainMessage(1, boolValueOf));
    }
}
