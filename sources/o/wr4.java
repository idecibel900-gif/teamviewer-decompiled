package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ xy6 n;

    public /* synthetic */ wr4(xy6 xy6Var, byte b) {
        this.m = b;
        this.n = xy6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        xy6 xy6Var = this.n;
        switch (b) {
            case 0:
                return Boolean.valueOf(((yy6) xy6Var.f.getValue()) != yy6.m);
            default:
                nf nfVar = xy6Var.g;
                if (((bg5) nfVar.f).getValue() != null) {
                    return (yy6) ((eo1) nfVar.h).getValue();
                }
                float fZ = ((wf5) nfVar.i).z();
                if (Float.isNaN(fZ)) {
                    return xy6Var.c();
                }
                float f = nfVar.e().f(xy6Var.c());
                if (Float.isNaN(f) || fZ == f) {
                    return xy6Var.c();
                }
                yy6 yy6Var = (yy6) nfVar.e().a(fZ);
                return yy6Var == null ? xy6Var.c() : yy6Var;
        }
    }
}
