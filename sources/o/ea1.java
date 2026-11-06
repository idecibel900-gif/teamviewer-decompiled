package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea1 extends cx2 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        boolean zB;
        boolean zB2;
        Object value2;
        Object value3;
        byte b = this.n;
        t34 t34Var = null;
        Object[] objArr = 0;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                l97 l97Var = ((qa1) this.receiver).r;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, iIntValue, iIntValue2, false, null, false, null, false, false, 259071)));
                return f88Var;
            case 1:
                wq2 wq2Var = (wq2) obj;
                wq2 wq2Var2 = (wq2) obj2;
                zq2 zq2Var = (zq2) this.receiver;
                if (zq2Var.z && (zB = wq2Var2.b()) != wq2Var.b()) {
                    if (zB) {
                        k76 k76Var = new k76();
                        bt1.J(zq2Var, new ql1(k76Var, zq2Var, (byte) 4));
                        t34 t34Var2 = (t34) k76Var.m;
                        if (t34Var2 != null) {
                            t34Var2.a();
                            t34Var = t34Var2;
                        }
                        zq2Var.D = t34Var;
                    } else {
                        t34 t34Var3 = zq2Var.D;
                        if (t34Var3 != null) {
                            t34Var3.b();
                        }
                        zq2Var.D = null;
                    }
                }
                return f88Var;
            case 2:
                wq2 wq2Var3 = (wq2) obj;
                wq2 wq2Var4 = (wq2) obj2;
                fr2 fr2Var = (fr2) this.receiver;
                if (fr2Var.z && (zB2 = wq2Var4.b()) != wq2Var3.b()) {
                    Function1 function1 = fr2Var.D;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(zB2));
                    }
                    vv vvVar = gr2.A;
                    if (zB2) {
                        im3.R(fr2Var.I0(), null, pe1.p, new y0(fr2Var, objArr == true ? 1 : 0, (byte) 14), 1);
                        k76 k76Var2 = new k76();
                        bt1.J(fr2Var, new ql1(k76Var2, fr2Var, (byte) 6));
                        t34 t34Var4 = (t34) k76Var2.m;
                        if (t34Var4 != null) {
                            t34Var4.a();
                        } else {
                            t34Var4 = null;
                        }
                        fr2Var.F = t34Var4;
                        e45 e45Var = fr2Var.G;
                        if (e45Var != null && e45Var.a1().z && fr2Var.z) {
                            g57.i(fr2Var, vvVar);
                        }
                    } else {
                        t34 t34Var5 = fr2Var.F;
                        if (t34Var5 != null) {
                            t34Var5.b();
                        }
                        fr2Var.F = null;
                        if (fr2Var.z) {
                            g57.i(fr2Var, vvVar);
                        }
                    }
                    vn4.p0(fr2Var).U();
                    mw4 mw4Var = fr2Var.C;
                    if (mw4Var != null) {
                        dq2 dq2Var = fr2Var.E;
                        if (zB2) {
                            if (dq2Var != null) {
                                fr2Var.X0(mw4Var, new eq2(dq2Var));
                                fr2Var.E = null;
                            }
                            dq2 dq2Var2 = new dq2();
                            fr2Var.X0(mw4Var, dq2Var2);
                            fr2Var.E = dq2Var2;
                        } else if (dq2Var != null) {
                            fr2Var.X0(mw4Var, new eq2(dq2Var));
                            fr2Var.E = null;
                        }
                    }
                }
                return f88Var;
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                l97 l97Var2 = ((f33) this.receiver).C;
                do {
                    value2 = l97Var2.getValue();
                } while (!l97Var2.j(value2, v23.a((v23) value2, null, false, false, false, null, false, null, false, false, false, false, false, iIntValue3, iIntValue4, 4095)));
                return f88Var;
            case 4:
                fq6 fq6Var = (fq6) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fq6Var.getClass();
                nq3 nq3Var = (nq3) this.receiver;
                nq3Var.getClass();
                boolean z = !fq6Var.i(iIntValue5) && fq6Var.h(iIntValue5).c();
                nq3Var.b = z;
                return Boolean.valueOf(z);
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ye4.c(str, str2);
                return f88Var;
            case 6:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                ((ye4) this.receiver).b(str3, str4);
                return f88Var;
            default:
                int iIntValue6 = ((Number) obj).intValue();
                int iIntValue7 = ((Number) obj2).intValue();
                l97 l97Var3 = ((xr6) this.receiver).r;
                do {
                    value3 = l97Var3.getValue();
                } while (!l97Var3.j(value3, or6.a((or6) value3, null, null, false, false, false, false, false, false, null, iIntValue6, iIntValue7, 511)));
                return f88Var;
        }
    }
}
