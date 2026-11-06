package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z90 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2681o;

    public /* synthetic */ z90(float f, g76 g76Var) {
        this.m = (byte) 1;
        this.n = f;
        this.f2681o = g76Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z2 = false;
        float f = this.n;
        Object obj2 = this.f2681o;
        switch (b) {
            case 0:
                jd6 jd6Var = (jd6) obj;
                float fZ = ((wf5) ((xy6) obj2).g.i).z();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jd6Var.C & 4294967295L));
                if (!Float.isNaN(fZ) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    jd6Var.k(da0.c(jd6Var, f));
                    jd6Var.l(da0.d(jd6Var, f));
                    jd6Var.z(u47.c(0.5f, (fZ + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return f88Var;
            case 1:
                g76 g76Var = (g76) obj2;
                l52 l52Var = (l52) obj;
                boolean zN = im3.n(l52Var.N(), "waiting");
                if (l52Var.W() == null) {
                    z = false;
                } else {
                    gb5 gb5VarW = l52Var.W();
                    gb5VarW.getClass();
                    int i = n52.a;
                    if (gb5VarW != gb5.n ? f <= 30.0f || f > 90.0f : f > 30.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (g76Var.m || (zN && z)) {
                    z2 = true;
                }
                g76Var.m = z2;
                return Boolean.valueOf(!z2);
            case 2:
                il5 il5Var = (il5) obj;
                il5Var.g((jl5) obj2, il5Var.q0(f), 0, 0.0f);
                return f88Var;
            default:
                u18 u18Var = (u18) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = u18Var.g();
                zf5 zf5Var = u18Var.h;
                if (!zG) {
                    if (zf5Var.z() == Long.MIN_VALUE) {
                        zf5Var.A(jLongValue);
                        ((bg5) u18Var.a.m).setValue(Boolean.TRUE);
                    }
                    long jZ = jLongValue - zf5Var.z();
                    if (f != 0.0f) {
                        jZ = vn4.t0(jZ / ((double) f));
                    }
                    if (u18Var.b == null) {
                        u18Var.g.A(jZ);
                    }
                    u18Var.h(jZ, f == 0.0f);
                }
                return f88Var;
        }
    }

    public /* synthetic */ z90(Object obj, float f, byte b) {
        this.m = b;
        this.f2681o = obj;
        this.n = f;
    }
}
