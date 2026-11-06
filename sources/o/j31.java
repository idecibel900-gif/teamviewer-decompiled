package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j31 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f1125o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j31(vs1 vs1Var, fs4 fs4Var, int i, int i2) {
        this.q = vs1Var;
        this.n = fs4Var;
        this.f1125o = i;
        this.p = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = this.p;
        byte b3 = this.f1125o;
        fs4 fs4Var = this.n;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vn4.L(yo1.Y(b3 | 1), b2, (Function0) obj3, (ux2) obj, fs4Var);
                break;
            default:
                ((Integer) obj2).getClass();
                xs1.c((vs1) obj3, fs4Var, (ux2) obj, yo1.Y(b3 | 1), b2);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j31(fs4 fs4Var, Function0 function0, int i, int i2) {
        this.n = fs4Var;
        this.q = function0;
        this.f1125o = i;
        this.p = i2;
    }
}
