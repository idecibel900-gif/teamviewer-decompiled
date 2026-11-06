package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mj1 {
    public static final mj1 a = new mj1();

    public final void a(d11 d11Var, ux2 ux2Var, int i) {
        fs4 ct0Var;
        ux2Var.Y(1384887329);
        int i2 = (ux2Var.f(d11Var) ? 4 : 2) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            final xu7 xu7Var = (xu7) d11Var.m;
            boolean zH = ux2Var.h(xu7Var);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zH || objK == obj) {
                objK = new Function1() { // from class: o.kj1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long jO;
                        byte b3 = b;
                        xu7 xu7Var2 = xu7Var;
                        switch (b3) {
                            case 0:
                                vk3 vk3Var = (vk3) obj2;
                                vu7 vu7VarF = xu7Var2.m.f();
                                if (vu7VarF == null) {
                                    vu7VarF = null;
                                }
                                if (vu7VarF != null) {
                                    vc vcVar = vu7VarF.f;
                                    jO = vk3Var.a;
                                    km kmVar = (km) vcVar.p;
                                    long j = vcVar.m;
                                    if (((Boolean) ((uu7) vcVar.f2297o).a()).booleanValue()) {
                                        float[] fArr = (float[]) vcVar.q;
                                        long j2 = ((dl3) ((uu7) vcVar.n).a()).a;
                                        wn4.e(fArr, d18.b(j) * ((int) (j2 >> 32)), d18.c(j) * ((int) (j2 & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) kmVar.d()).floatValue(), ((Number) kmVar.d()).floatValue(), 1276);
                                        jO = us1.O(wn4.b((((long) Float.floatToRawIntBits((int) (jO >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jO & 4294967295L))) & 4294967295L), fArr));
                                    }
                                } else {
                                    jO = vk3Var.a;
                                }
                                return new vk3(jO);
                            case 1:
                                return Boolean.valueOf(!((cv7) obj2).a(xu7Var2.n).equals(xz2.R));
                            default:
                                return Boolean.valueOf(!((cv7) obj2).a(xu7Var2.n).equals(xz2.R));
                        }
                    }
                };
                ux2Var.g0(objK);
            }
            Function1 function1 = (Function1) objK;
            boolean zN = im3.n((qe5) xu7Var.f2551o.getValue(), yl7.H);
            boolean zH2 = ux2Var.h(xu7Var);
            Object objK2 = ux2Var.K();
            if (zH2 || objK2 == obj) {
                objK2 = new zz0(xu7Var, (byte) 8);
                ux2Var.g0(objK2);
            }
            Function0 function0 = (Function0) objK2;
            yu7 yu7Var = xu7Var.n;
            zu7 zu7Var = xu7Var.m;
            ce5 ce5VarA = ((cv7) zu7Var.b().d.getValue()).a(yu7Var);
            fs4 fs4Var = (fs4) d11Var.n;
            k76 k76Var = new k76();
            cs4 cs4Var = cs4.b;
            k76Var.m = cs4Var;
            k76 k76Var2 = new k76();
            k76Var2.m = cs4Var;
            fs4Var.b(new o43(k76Var, k76Var2, (byte) 21));
            fs4 fs4Var2 = (fs4) k76Var.m;
            fs4 fs4Var3 = (fs4) k76Var2.m;
            u18 u18VarB = zu7Var.b();
            boolean zH3 = ux2Var.h(xu7Var);
            Object objK3 = ux2Var.K();
            if (zH3 || objK3 == obj) {
                objK3 = new Function1() { // from class: o.kj1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long jO;
                        byte b3 = b2;
                        xu7 xu7Var2 = xu7Var;
                        switch (b3) {
                            case 0:
                                vk3 vk3Var = (vk3) obj2;
                                vu7 vu7VarF = xu7Var2.m.f();
                                if (vu7VarF == null) {
                                    vu7VarF = null;
                                }
                                if (vu7VarF != null) {
                                    vc vcVar = vu7VarF.f;
                                    jO = vk3Var.a;
                                    km kmVar = (km) vcVar.p;
                                    long j = vcVar.m;
                                    if (((Boolean) ((uu7) vcVar.f2297o).a()).booleanValue()) {
                                        float[] fArr = (float[]) vcVar.q;
                                        long j2 = ((dl3) ((uu7) vcVar.n).a()).a;
                                        wn4.e(fArr, d18.b(j) * ((int) (j2 >> 32)), d18.c(j) * ((int) (j2 & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) kmVar.d()).floatValue(), ((Number) kmVar.d()).floatValue(), 1276);
                                        jO = us1.O(wn4.b((((long) Float.floatToRawIntBits((int) (jO >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jO & 4294967295L))) & 4294967295L), fArr));
                                    }
                                } else {
                                    jO = vk3Var.a;
                                }
                                return new vk3(jO);
                            case 1:
                                return Boolean.valueOf(!((cv7) obj2).a(xu7Var2.n).equals(xz2.R));
                            default:
                                return Boolean.valueOf(!((cv7) obj2).a(xu7Var2.n).equals(xz2.R));
                        }
                    }
                };
                ux2Var.g0(objK3);
            }
            Function1 function2 = (Function1) objK3;
            fs4 fs4VarK = cs4Var;
            fs4 fs4VarF = rn.b.f(new wm(function0, (rl2) d11Var.q, function1, xu7Var, zN));
            Object obj2 = zu7Var.g().get(yu7Var);
            obj2.getClass();
            fs4 fs4VarN = uf0.n(fs4VarF, (sq2) obj2);
            boolean zBooleanValue = ((Boolean) xu7Var.p.getValue()).booleanValue();
            h72 h72Var = ne5.a;
            fs4 fs4VarY = qf0.y(xk0.t(fs4VarN), new qu(b2, zBooleanValue));
            if (zBooleanValue) {
                ct0Var = db8.t(fs4VarK, new fj3((Object) yu7Var, (byte) 19));
            } else {
                at4 at4Var = new at4((byte) 29);
                AtomicInteger atomicInteger = cp6.a;
                ct0Var = new ct0(at4Var);
            }
            fs4 fs4VarF2 = fs4VarY.f(ct0Var);
            if (!zN) {
                fs4VarK = iq8.k(fs4VarK);
            }
            vn4.F(u18VarB, function2, fs4VarF2.f(fs4VarK).f(fs4Var2), (bc2) d11Var.f578o, (hf2) d11Var.p, au8.O(1961513632, new q34(d11Var, xu7Var, fs4Var3, ce5VarA), ux2Var), ux2Var, 196608, 0);
            hw2 hw2Var = (hw2) lv1.U(null, ux2Var).a;
            if (hw2Var == null) {
                ux2Var.W(-54401809);
                ux2Var.p(false);
            } else {
                ux2Var.W(-54401808);
                u18 u18VarB2 = zu7Var.b();
                boolean zH4 = ux2Var.h(xu7Var);
                Object objK4 = ux2Var.K();
                if (zH4 || objK4 == obj) {
                    final byte b3 = 2;
                    objK4 = new Function1() { // from class: o.kj1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            long jO;
                            byte b4 = b3;
                            xu7 xu7Var2 = xu7Var;
                            switch (b4) {
                                case 0:
                                    vk3 vk3Var = (vk3) obj3;
                                    vu7 vu7VarF = xu7Var2.m.f();
                                    if (vu7VarF == null) {
                                        vu7VarF = null;
                                    }
                                    if (vu7VarF != null) {
                                        vc vcVar = vu7VarF.f;
                                        jO = vk3Var.a;
                                        km kmVar = (km) vcVar.p;
                                        long j = vcVar.m;
                                        if (((Boolean) ((uu7) vcVar.f2297o).a()).booleanValue()) {
                                            float[] fArr = (float[]) vcVar.q;
                                            long j2 = ((dl3) ((uu7) vcVar.n).a()).a;
                                            wn4.e(fArr, d18.b(j) * ((int) (j2 >> 32)), d18.c(j) * ((int) (j2 & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) kmVar.d()).floatValue(), ((Number) kmVar.d()).floatValue(), 1276);
                                            jO = us1.O(wn4.b((((long) Float.floatToRawIntBits((int) (jO >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jO & 4294967295L))) & 4294967295L), fArr));
                                        }
                                    } else {
                                        jO = vk3Var.a;
                                    }
                                    return new vk3(jO);
                                case 1:
                                    return Boolean.valueOf(!((cv7) obj3).a(xu7Var2.n).equals(xz2.R));
                                default:
                                    return Boolean.valueOf(!((cv7) obj3).a(xu7Var2.n).equals(xz2.R));
                            }
                        }
                    };
                    ux2Var.g0(objK4);
                }
                vn4.F(u18VarB2, (Function1) objK4, null, (bc2) d11Var.f578o, (hf2) d11Var.p, au8.O(1382806544, new lj1(hw2Var, (byte) 0), ux2Var), ux2Var, 196608, 2);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 13, i, (Object) this, (Object) d11Var);
        }
    }
}
