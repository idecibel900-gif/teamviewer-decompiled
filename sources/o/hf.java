package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ nf n;

    public /* synthetic */ hf(nf nfVar, byte b) {
        this.m = b;
        this.n = nfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        nf nfVar = this.n;
        switch (b) {
            case 0:
                Object value = ((bg5) nfVar.f).getValue();
                if (value != null) {
                    return value;
                }
                float fZ = ((wf5) nfVar.i).z();
                bg5 bg5Var = (bg5) nfVar.d;
                if (Float.isNaN(fZ)) {
                    return bg5Var.getValue();
                }
                float f = nfVar.e().f(bg5Var.getValue());
                if (Float.isNaN(f) || fZ == f) {
                    return bg5Var.getValue();
                }
                Object objA = nfVar.e().a(fZ);
                return objA == null ? bg5Var.getValue() : objA;
            case 1:
                return nfVar.e();
            default:
                return new vd5(nfVar.e(), ((eo1) nfVar.h).getValue());
        }
    }
}
