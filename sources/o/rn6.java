package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rn6 extends g2 {
    public static final mo E = new mo(0.0f);
    public static final mo F = new mo(1.0f);
    public mn6 A;
    public final ln6 B;
    public float C;
    public final ln6 D;
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f1933o;
    public Object p;
    public u18 q;
    public long r;
    public final y26 s;
    public br5 t;
    public final wf5 u;
    public gl0 v;
    public final my4 w;
    public final jy4 x;
    public long y;
    public final zw4 z;

    /* JADX WARN: Type inference failed for: r3v6, types: [o.ln6] */
    /* JADX WARN: Type inference failed for: r3v7, types: [o.ln6] */
    public rn6(cv7 cv7Var) {
        super((byte) 7);
        this.n = h57.p(cv7Var);
        this.f1933o = h57.p(cv7Var);
        this.p = cv7Var;
        this.s = new y26(this, (byte) 10);
        this.u = new wf5(0.0f);
        this.w = new my4();
        this.x = new jy4();
        this.y = Long.MIN_VALUE;
        this.z = new zw4();
        final byte b = 0;
        this.B = new Function1(this) { // from class: o.ln6
            public final /* synthetic */ rn6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                f88 f88Var = f88.a;
                rn6 rn6Var = this.n;
                long jLongValue = ((Long) obj).longValue();
                switch (b2) {
                    case 0:
                        rn6Var.y = jLongValue;
                        break;
                    default:
                        long j = jLongValue - rn6Var.y;
                        rn6Var.y = jLongValue;
                        long jT0 = vn4.t0(j / ((double) rn6Var.C));
                        zw4 zw4Var = rn6Var.z;
                        if (zw4Var.i()) {
                            Object[] objArr = zw4Var.a;
                            int i = zw4Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                mn6 mn6Var = (mn6) objArr[i3];
                                rn6.D0(mn6Var, jT0);
                                mn6Var.c = true;
                            }
                            u18 u18Var = rn6Var.q;
                            if (u18Var != null) {
                                u18Var.n();
                            }
                            int i4 = zw4Var.b;
                            Object[] objArr2 = zw4Var.a;
                            yk3 yk3VarB0 = ct1.b0(0, i4);
                            int i5 = yk3VarB0.m;
                            int i6 = yk3VarB0.n;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((mn6) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            cx.N0(i4 - i2, i4, null, objArr2);
                            zw4Var.b -= i2;
                        }
                        mn6 mn6Var2 = rn6Var.A;
                        if (mn6Var2 != null) {
                            mn6Var2.g = rn6Var.r;
                            rn6.D0(mn6Var2, jT0);
                            rn6Var.u.A(mn6Var2.d);
                            if (mn6Var2.d == 1.0f) {
                                rn6Var.A = null;
                            }
                            rn6Var.F0();
                        }
                        break;
                }
                return f88Var;
            }
        };
        final byte b2 = 1;
        this.D = new Function1(this) { // from class: o.ln6
            public final /* synthetic */ rn6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                f88 f88Var = f88.a;
                rn6 rn6Var = this.n;
                long jLongValue = ((Long) obj).longValue();
                switch (b3) {
                    case 0:
                        rn6Var.y = jLongValue;
                        break;
                    default:
                        long j = jLongValue - rn6Var.y;
                        rn6Var.y = jLongValue;
                        long jT0 = vn4.t0(j / ((double) rn6Var.C));
                        zw4 zw4Var = rn6Var.z;
                        if (zw4Var.i()) {
                            Object[] objArr = zw4Var.a;
                            int i = zw4Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                mn6 mn6Var = (mn6) objArr[i3];
                                rn6.D0(mn6Var, jT0);
                                mn6Var.c = true;
                            }
                            u18 u18Var = rn6Var.q;
                            if (u18Var != null) {
                                u18Var.n();
                            }
                            int i4 = zw4Var.b;
                            Object[] objArr2 = zw4Var.a;
                            yk3 yk3VarB0 = ct1.b0(0, i4);
                            int i5 = yk3VarB0.m;
                            int i6 = yk3VarB0.n;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((mn6) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            cx.N0(i4 - i2, i4, null, objArr2);
                            zw4Var.b -= i2;
                        }
                        mn6 mn6Var2 = rn6Var.A;
                        if (mn6Var2 != null) {
                            mn6Var2.g = rn6Var.r;
                            rn6.D0(mn6Var2, jT0);
                            rn6Var.u.A(mn6Var2.d);
                            if (mn6Var2.d == 1.0f) {
                                rn6Var.A = null;
                            }
                            rn6Var.F0();
                        }
                        break;
                }
                return f88Var;
            }
        };
    }

    public static void D0(mn6 mn6Var, long j) {
        long j2 = mn6Var.a + j;
        mn6Var.a = j2;
        long j3 = mn6Var.h;
        if (j2 >= j3) {
            mn6Var.d = 1.0f;
            return;
        }
        hc8 hc8Var = mn6Var.b;
        mo moVar = mn6Var.e;
        if (hc8Var == null) {
            float f = j2 / j3;
            mn6Var.d = (f * 1.0f) + ((1.0f - f) * moVar.a(0));
            return;
        }
        mo moVar2 = mn6Var.f;
        if (moVar2 == null) {
            moVar2 = E;
        }
        mn6Var.d = ct1.u(((mo) hc8Var.u(j2, moVar, F, moVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // o.g2
    public final void A0() {
        this.q = null;
        br5 br5Var = this.t;
        if (br5Var != null) {
            br5Var.b(this);
        }
    }

    public final Object B0(jc1 jc1Var) {
        float fP = i67.p(jc1Var.getContext());
        f88 f88Var = f88.a;
        if (fP <= 0.0f) {
            C0();
            return f88Var;
        }
        this.C = fP;
        Object objA = qs1.O(jc1Var.getContext()).a(this.D, jc1Var);
        return objA == ne1.m ? objA : f88Var;
    }

    public final void C0() {
        u18 u18Var = this.q;
        if (u18Var != null) {
            u18Var.c();
        }
        this.z.d();
        if (this.A != null) {
            this.A = null;
            this.u.A(1.0f);
            F0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E0(jc1 jc1Var) {
        on6 on6Var;
        if (jc1Var instanceof on6) {
            on6Var = (on6) jc1Var;
            int i = on6Var.f1663o;
            if ((i & Integer.MIN_VALUE) != 0) {
                on6Var.f1663o = i - Integer.MIN_VALUE;
            } else {
                on6Var = new on6(this, jc1Var);
            }
        } else {
            on6Var = new on6(this, jc1Var);
        }
        Object obj = on6Var.m;
        int i2 = on6Var.f1663o;
        zw4 zw4Var = this.z;
        f88 f88Var = f88.a;
        Object obj2 = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj);
            if (zw4Var.h() && this.A == null) {
                return f88Var;
            }
            if (i67.p(on6Var.getContext()) == 0.0f) {
                C0();
                this.y = Long.MIN_VALUE;
                return f88Var;
            }
            if (this.y == Long.MIN_VALUE) {
                on6Var.f1663o = 1;
                if (qs1.O(on6Var.getContext()).a(this.B, on6Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        do {
            if (!zw4Var.i() && this.A == null) {
                this.y = Long.MIN_VALUE;
                return f88Var;
            }
            on6Var.f1663o = 2;
        } while (B0(on6Var) != obj2);
        return obj2;
    }

    public final void F0() {
        u18 u18Var = this.q;
        if (u18Var == null) {
            return;
        }
        u18Var.k(vn4.t0(((double) this.u.z()) * ((Number) u18Var.m.getValue()).longValue()));
    }

    public final void G0(br5 br5Var) {
        ar arVar;
        if (im3.n(this.t, br5Var)) {
            return;
        }
        br5 br5Var2 = this.t;
        if (br5Var2 != null) {
            br5Var2.b(this);
        }
        br5 br5Var3 = this.t;
        if (br5Var3 != null && (arVar = (ar) br5Var3.i) != null) {
            arVar.n();
        }
        this.t = br5Var;
        if (br5Var != null) {
            br5Var.g();
        }
        br5 br5Var4 = this.t;
        if (br5Var4 != null) {
            br5Var4.f(this, ck3.N, this.s);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(jc1 jc1Var) {
        pn6 pn6Var;
        Object value;
        Object obj;
        if (jc1Var instanceof pn6) {
            pn6Var = (pn6) jc1Var;
            int i = pn6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn6Var.p = i - Integer.MIN_VALUE;
            } else {
                pn6Var = new pn6(this, jc1Var);
            }
        } else {
            pn6Var = new pn6(this, jc1Var);
        }
        Object obj2 = pn6Var.n;
        int i2 = pn6Var.p;
        my4 my4Var = this.w;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj2);
            value = this.n.getValue();
            pn6Var.m = value;
            pn6Var.p = 1;
            if (my4Var.e(pn6Var) != ne1Var) {
            }
            return ne1Var;
        }
        if (i2 == 1) {
            Object obj3 = pn6Var.m;
            ct1.a0(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = pn6Var.m;
            ct1.a0(obj2);
        }
        if (im3.n(obj2, obj)) {
            return f88.a;
        }
        this.y = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        pn6Var.m = value;
        pn6Var.p = 2;
        gl0 gl0Var = new gl0(1, vt1.A(pn6Var));
        gl0Var.t();
        this.v = gl0Var;
        my4Var.j(null);
        Object objQ = gl0Var.q();
        if (objQ != ne1Var) {
            obj = value;
            obj2 = objQ;
            if (im3.n(obj2, obj)) {
                return f88.a;
            }
            this.y = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return ne1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    public final Object I0(jc1 jc1Var) {
        qn6 qn6Var;
        Object value;
        Object obj;
        if (jc1Var instanceof qn6) {
            qn6Var = (qn6) jc1Var;
            int i = qn6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn6Var.p = i - Integer.MIN_VALUE;
            } else {
                qn6Var = new qn6(this, jc1Var);
            }
        } else {
            qn6Var = new qn6(this, jc1Var);
        }
        Object obj2 = qn6Var.n;
        int i2 = qn6Var.p;
        my4 my4Var = this.w;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj2);
            value = this.n.getValue();
            qn6Var.m = value;
            qn6Var.p = 1;
            if (my4Var.e(qn6Var) != ne1Var) {
            }
            return ne1Var;
        }
        if (i2 == 1) {
            Object obj3 = qn6Var.m;
            ct1.a0(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = qn6Var.m;
            ct1.a0(obj2);
        }
        if (!im3.n(obj2, obj)) {
            this.y = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return f88.a;
        if (!im3.n(value, this.p)) {
            qn6Var.m = value;
            qn6Var.p = 2;
            gl0 gl0Var = new gl0(1, vt1.A(qn6Var));
            gl0Var.t();
            this.v = gl0Var;
            my4Var.j(null);
            Object objQ = gl0Var.q();
            if (objQ != ne1Var) {
                obj = value;
                obj2 = objQ;
                if (!im3.n(obj2, obj)) {
                    this.y = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return ne1Var;
        }
        my4Var.j(null);
        return f88.a;
    }

    @Override // o.g2
    public final Object p0() {
        return this.f1933o.getValue();
    }

    @Override // o.g2
    public final Object r0() {
        return this.n.getValue();
    }

    @Override // o.g2
    public final void y0(Object obj) {
        this.f1933o.setValue(obj);
    }

    @Override // o.g2
    public final void z0(u18 u18Var) {
        u18 u18Var2 = this.q;
        if (u18Var2 != null && !u18Var.equals(u18Var2)) {
            wp5.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.q + ", new instance: " + u18Var);
        }
        this.q = u18Var;
    }
}
