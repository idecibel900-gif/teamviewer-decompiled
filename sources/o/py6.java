package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f1790o;

    public /* synthetic */ py6(float f, xy6 xy6Var) {
        this.m = (byte) 2;
        this.f1790o = f;
        this.n = xy6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        float fD0;
        Object sc6Var;
        byte b = this.m;
        Object obj = this.n;
        float f = this.f1790o;
        switch (b) {
            case 0:
                fD0 = ((in1) obj).d0(f);
                break;
            case 1:
                fD0 = ((in1) obj).d0(f);
                break;
            default:
                try {
                    sc6Var = Float.valueOf(((xy6) obj).g.j());
                } catch (Throwable th) {
                    sc6Var = new sc6(th);
                }
                Object objValueOf = Float.valueOf(Float.MAX_VALUE);
                if (sc6Var instanceof sc6) {
                    sc6Var = objValueOf;
                }
                fD0 = ct1.u(((Number) sc6Var).floatValue() / f, 0.0f, 1.0f);
                break;
        }
        return Float.valueOf(fD0);
    }

    public /* synthetic */ py6(in1 in1Var, float f, byte b) {
        this.m = b;
        this.n = in1Var;
        this.f1790o = f;
    }
}
