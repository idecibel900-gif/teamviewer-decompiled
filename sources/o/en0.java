package o;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class en0 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f726o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public en0(k76 k76Var, ho2 ho2Var, String[] strArr, int[] iArr) {
        this.m = (byte) 6;
        this.n = k76Var;
        this.q = ho2Var;
        this.f726o = strArr;
        this.p = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object a(jl3 jl3Var, hc1 hc1Var) {
        tx4 tx4Var;
        Iterator it;
        jl3 jl3Var2;
        f4 f4Var = (f4) this.q;
        f4 f4Var2 = (f4) this.p;
        f4 f4Var3 = (f4) this.n;
        ux4 ux4Var = (ux4) this.f726o;
        if (hc1Var instanceof tx4) {
            tx4Var = (tx4) hc1Var;
            int i = tx4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                tx4Var.r = i - Integer.MIN_VALUE;
            } else {
                tx4Var = new tx4(this, hc1Var);
            }
        } else {
            tx4Var = new tx4(this, hc1Var);
        }
        Object obj = tx4Var.p;
        int i2 = tx4Var.r;
        f88 f88Var = f88.a;
        if (i2 == 0) {
            ct1.a0(obj);
            if (jl3Var instanceof yr5) {
                f4Var3.a(jl3Var);
                ux4Var.c.a(1, true);
                return f88Var;
            }
            if (jl3Var instanceof zr5) {
                f4Var3.d(((zr5) jl3Var).a);
                ux4Var.c.a(1, f4Var3.m != null);
                return f88Var;
            }
            if (jl3Var instanceof xr5) {
                f4Var3.d(((xr5) jl3Var).a);
                ux4Var.c.a(1, f4Var3.m != null);
                return f88Var;
            }
            if (jl3Var instanceof j63) {
                f4Var2.a(jl3Var);
                ux4Var.c.a(2, true);
                return f88Var;
            }
            if (jl3Var instanceof k63) {
                f4Var2.d(((k63) jl3Var).a);
                ux4Var.c.a(2, f4Var2.m != null);
                return f88Var;
            }
            if (jl3Var instanceof dq2) {
                f4Var.a(jl3Var);
                ux4Var.c.a(4, true);
                return f88Var;
            }
            if (jl3Var instanceof eq2) {
                f4Var.d(((eq2) jl3Var).a);
                ux4Var.c.a(4, f4Var.m != null);
                return f88Var;
            }
            it = ux4Var.b.n.iterator();
            jl3Var2 = jl3Var;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = tx4Var.f2152o;
            ux4 ux4Var2 = tx4Var.n;
            jl3 jl3Var3 = tx4Var.m;
            ct1.a0(obj);
            ux4Var = ux4Var2;
            jl3Var2 = jl3Var3;
        }
        while (it.hasNext()) {
            zc7 zc7Var = (zc7) ((Map.Entry) it.next()).getKey();
            tx4Var.m = jl3Var2;
            tx4Var.n = ux4Var;
            tx4Var.f2152o = it;
            tx4Var.r = 1;
            zc7Var.getClass();
            ne1 ne1Var = ne1.m;
            if (f88Var == ne1Var) {
                return ne1Var;
            }
        }
        return f88Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4.c(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r4.c(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int[] r18, o.hc1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.f726o
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r4 = r0.q
            o.ho2 r4 = (o.ho2) r4
            boolean r5 = r2 instanceof o.x28
            if (r5 == 0) goto L21
            r5 = r2
            o.x28 r5 = (o.x28) r5
            int r6 = r5.q
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L21
            int r6 = r6 - r7
            r5.q = r6
            goto L26
        L21:
            o.x28 r5 = new o.x28
            r5.<init>(r0, r2)
        L26:
            java.lang.Object r2 = r5.f2474o
            int r6 = r5.q
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L47
            if (r6 == r9) goto L3a
            if (r6 != r8) goto L34
            goto L3a
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r0)
            return r7
        L3a:
            int[] r0 = r5.n
            o.en0 r1 = r5.m
            o.ct1.a0(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto Lad
        L47:
            o.ct1.a0(r2)
            java.lang.Object r2 = r0.n
            o.k76 r2 = (o.k76) r2
            java.lang.Object r6 = r2.m
            o.ne1 r10 = o.ne1.m
            if (r6 != 0) goto L65
            java.util.Set r2 = o.cx.h1(r3)
            r5.m = r0
            r5.n = r1
            r5.q = r9
            java.lang.Object r2 = r4.c(r2, r5)
            if (r2 != r10) goto Lad
            goto Lac
        L65:
            java.lang.Object r6 = r0.p
            int[] r6 = (int[]) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r3.length
            r12 = 0
            r13 = r12
        L71:
            if (r12 >= r11) goto L96
            r14 = r3[r12]
            int r15 = r13 + 1
            r19 = r7
            java.lang.Object r7 = r2.m
            if (r7 == 0) goto L90
            int[] r7 = (int[]) r7
            r13 = r6[r13]
            r7 = r7[r13]
            r13 = r1[r13]
            if (r7 == r13) goto L8a
            r9.add(r14)
        L8a:
            int r12 = r12 + 1
            r7 = r19
            r13 = r15
            goto L71
        L90:
            java.lang.String r0 = "Required value was null."
            o.hk0.l(r0)
            return r19
        L96:
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lad
            java.util.Set r2 = o.lv0.T0(r9)
            r5.m = r0
            r5.n = r1
            r5.q = r8
            java.lang.Object r2 = r4.c(r2, r5)
            if (r2 != r10) goto Lad
        Lac:
            return r10
        Lad:
            java.lang.Object r0 = r0.n
            o.k76 r0 = (o.k76) r0
            r0.m = r1
            o.f88 r0 = o.f88.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en0.b(int[], o.hc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        dn0 dn0Var;
        Object obj2 = obj;
        byte b = this.m;
        boolean z = true;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        Object obj4 = this.f726o;
        Object obj5 = this.p;
        Object obj6 = this.n;
        switch (b) {
            case 0:
                k76 k76Var = (k76) obj6;
                if (hc1Var instanceof dn0) {
                    dn0Var = (dn0) hc1Var;
                    int i = dn0Var.p;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dn0Var.p = i - Integer.MIN_VALUE;
                    } else {
                        dn0Var = new dn0(this, hc1Var);
                    }
                } else {
                    dn0Var = new dn0(this, hc1Var);
                }
                Object obj7 = dn0Var.n;
                int i2 = dn0Var.p;
                if (i2 == 0) {
                    ct1.a0(obj7);
                    bp3 bp3Var = (bp3) k76Var.m;
                    if (bp3Var != null) {
                        bp3Var.j(new mq0("Child of the scoped flow was cancelled"));
                        dn0Var.m = obj2;
                        dn0Var.p = 1;
                        Object objX0 = bp3Var.x0(dn0Var);
                        ne1 ne1Var = ne1.m;
                        if (objX0 == ne1Var) {
                            return ne1Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = dn0Var.m;
                    ct1.a0(obj7);
                }
                k76Var.m = im3.R((me1) obj4, null, pe1.p, new cn0((fn0) obj5, (ho2) obj3, obj2, null), 1);
                return f88Var;
            case 1:
                pr7 pr7Var = (pr7) obj5;
                j64 j64Var = (j64) obj6;
                if (((Boolean) obj2).booleanValue() && j64Var.b()) {
                    ka0.G((js7) obj4, j64Var, pr7Var.l(), (bf3) obj3, pr7Var.b);
                } else {
                    ka0.t(j64Var);
                }
                return f88Var;
            case 2:
                jl3 jl3Var = (jl3) obj2;
                i76 i76Var = (i76) obj5;
                i76 i76Var2 = (i76) obj4;
                i76 i76Var3 = (i76) obj6;
                if (jl3Var instanceof yr5) {
                    i76Var3.m++;
                } else if ((jl3Var instanceof zr5) || (jl3Var instanceof xr5)) {
                    i76Var3.m--;
                } else if (jl3Var instanceof j63) {
                    i76Var2.m++;
                } else if (jl3Var instanceof k63) {
                    i76Var2.m--;
                } else if (jl3Var instanceof dq2) {
                    i76Var.m++;
                } else if (jl3Var instanceof eq2) {
                    i76Var.m--;
                }
                boolean z2 = false;
                boolean z3 = i76Var3.m > 0;
                boolean z4 = i76Var2.m > 0;
                boolean z5 = i76Var.m > 0;
                sj1 sj1Var = (sj1) obj3;
                if (sj1Var.B != z3) {
                    sj1Var.B = z3;
                    z2 = true;
                }
                if (sj1Var.C != z4) {
                    sj1Var.C = z4;
                    z2 = true;
                }
                if (sj1Var.D != z5) {
                    sj1Var.D = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    yo1.H(sj1Var);
                }
                return f88Var;
            case 3:
                x13 x13Var = (x13) obj2;
                if (((Boolean) ((Function0) obj6).a()).booleanValue()) {
                    ((Function1) obj4).invoke(x13Var.a);
                    ((Function1) obj5).invoke(Boolean.valueOf(x13Var.b));
                    ((Function1) obj3).invoke(Boolean.valueOf(x13Var.c));
                }
                return f88Var;
            case 4:
                d37 d37Var = (d37) obj2;
                vy1 vy1VarI0 = io1.i0(d37Var);
                ((Function1) ((px4) obj5).getValue()).invoke(new ul7((sl7) vy1VarI0.b, vy1VarI0.x((Context) obj6), (g37) vy1VarI0.c, ((Resources) obj4).getString(R.string.dismiss), null, new ql1(d37Var, (px4) obj3, (byte) 11), 168));
                return f88Var;
            case 5:
                return a((jl3) obj2, hc1Var);
            case 6:
                return b((int[]) obj2, hc1Var);
            default:
                h37 h37Var = (h37) obj2;
                yd7 yd7Var = new yd7((Function0) obj5, (byte) 8);
                Resources resources = ((ComposeView) obj4).getResources();
                resources.getClass();
                ((Function1) obj6).invoke(lv1.O(h37Var, yd7Var, resources));
                a47 a47Var = h37Var.c;
                if (a47Var != null) {
                    h57.x(a47Var, ((th8) obj3).A0());
                }
                return f88Var;
        }
    }

    public /* synthetic */ en0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f726o = obj2;
        this.p = obj3;
        this.q = obj4;
    }
}
