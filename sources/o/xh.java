package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2515o;
    public final /* synthetic */ Object p;

    public /* synthetic */ xh(jl5 jl5Var, kv7 kv7Var, float f) {
        this.m = (byte) 2;
        this.f2515o = jl5Var;
        this.p = kv7Var;
        this.n = f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        float fFloatValue = 0.0f;
        f88 f88Var = f88.a;
        Object obj2 = this.p;
        float f = this.n;
        Object obj3 = this.f2515o;
        switch (b) {
            case 0:
                vi viVar = (vi) obj3;
                t70 t70Var = (t70) obj2;
                d14 d14Var = (d14) obj;
                d14Var.a();
                iu iuVar = d14Var.m.n;
                long jD = iuVar.D();
                iuVar.x().g();
                try {
                    xc0 xc0Var = (xc0) iuVar.f1103o;
                    xc0Var.V(f, 0.0f);
                    xc0Var.T(45.0f, 0L);
                    u52.S(d14Var, viVar, 0L, 0.0f, t70Var, 46);
                    return f88Var;
                } finally {
                    ua5.x(iuVar, jD);
                }
            case 1:
                h76 h76Var = (h76) obj3;
                df dfVar = (df) obj2;
                io ioVar = (io) obj;
                if (f > 0.0f) {
                    fFloatValue = ((Number) ioVar.e.getValue()).floatValue();
                    if (fFloatValue > f) {
                        fFloatValue = f;
                    }
                } else if (f < 0.0f) {
                    fFloatValue = ((Number) ioVar.e.getValue()).floatValue();
                    if (fFloatValue < f) {
                        fFloatValue = f;
                    }
                }
                float f2 = fFloatValue - h76Var.m;
                if (f2 != ((dk6) dfVar.b).a(f2) || fFloatValue != ((Number) ioVar.e.getValue()).floatValue()) {
                    ioVar.a();
                }
                h76Var.m += f2;
                return f88Var;
            case 2:
                jl5 jl5Var = (jl5) obj3;
                il5 il5Var = (il5) obj;
                km kmVar = ((kv7) obj2).E;
                il5.k(il5Var, jl5Var, kmVar != null ? (int) ((Number) kmVar.d()).floatValue() : (int) f, 0);
                return f88Var;
            default:
                o98 o98Var = (o98) obj3;
                Function1 function1 = (Function1) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = o98Var.b;
                if (j == Long.MIN_VALUE) {
                    o98Var.b = jLongValue;
                    j = jLongValue;
                }
                float f3 = o98Var.e;
                mo moVar = new mo(f3);
                mo moVar2 = o98.f;
                long jB = f == 0.0f ? o98Var.a.b(new mo(f3), moVar2, o98Var.c) : vn4.t0((jLongValue - j) / f);
                float f4 = ((mo) o98Var.a.u(jB, moVar, moVar2, o98Var.c)).a;
                o98Var.c = (mo) o98Var.a.h(jB, moVar, moVar2, o98Var.c);
                o98Var.b = jLongValue;
                float f5 = o98Var.e - f4;
                o98Var.e = f4;
                function1.invoke(Float.valueOf(f5));
                return f88Var;
        }
    }

    public /* synthetic */ xh(float f, Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = f;
        this.f2515o = obj;
        this.p = obj2;
    }

    public /* synthetic */ xh(o98 o98Var, float f, Function1 function1) {
        this.m = (byte) 3;
        this.f2515o = o98Var;
        this.n = f;
        this.p = function1;
    }
}
