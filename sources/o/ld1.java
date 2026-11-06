package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1352o;

    public /* synthetic */ ld1(byte b, Object obj, boolean z) {
        this.m = b;
        this.n = z;
        this.f1352o = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        nx4 nx4VarI;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj = this.f1352o;
        boolean z = this.n;
        switch (b) {
            case 0:
                cj cjVar = (cj) obj;
                if (z && (nx4VarI = cjVar.i()) != null) {
                    ((yx6) nx4VarI).r(f88Var);
                }
                break;
            default:
                px4 px4Var = (px4) obj;
                if (!z) {
                    px4Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return f88Var;
    }
}
