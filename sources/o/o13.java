package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o13 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j23 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iw7 f1620o;

    public /* synthetic */ o13(j23 j23Var, iw7 iw7Var, byte b) {
        this.m = b;
        this.n = j23Var;
        this.f1620o = iw7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        iw7 iw7Var = this.f1620o;
        j23 j23Var = this.n;
        switch (b) {
            case 0:
                return Boolean.valueOf(j23Var.v == iw7Var);
            case 1:
                return Boolean.valueOf(j23Var.w == iw7Var);
            default:
                return Boolean.valueOf(j23Var.x == iw7Var);
        }
    }
}
