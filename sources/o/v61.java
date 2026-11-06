package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v61 implements a17, p04 {
    public long b;
    public ArrayList c;

    @Override // o.p04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        h(j);
        jl5 jl5VarC = zn4Var.C(j);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.a17
    public final Object e(hc1 hc1Var) throws Throwable {
        u61 u61Var;
        k76 k76Var;
        Throwable th;
        j12 g12Var;
        if (hc1Var instanceof u61) {
            u61Var = (u61) hc1Var;
            int i = u61Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                u61Var.p = i - Integer.MIN_VALUE;
            } else {
                u61Var = new u61(this, (jc1) hc1Var);
            }
        } else {
            u61Var = new u61(this, (jc1) hc1Var);
        }
        Object obj = u61Var.n;
        int i2 = u61Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            if (r61.l(this.b)) {
                k76 k76Var2 = new k76();
                try {
                    u61Var.m = k76Var2;
                    u61Var.p = 1;
                    gl0 gl0Var = new gl0(1, vt1.A(u61Var));
                    gl0Var.t();
                    k76Var2.m = gl0Var;
                    this.c.add(gl0Var);
                    Object objQ = gl0Var.q();
                    ne1 ne1Var = ne1.m;
                    if (objQ == ne1Var) {
                        return ne1Var;
                    }
                    k76Var = k76Var2;
                    ArrayList arrayList = this.c;
                    Object obj2 = k76Var.m;
                    e8.f(arrayList);
                    arrayList.remove(obj2);
                } catch (Throwable th2) {
                    k76Var = k76Var2;
                    th = th2;
                    ArrayList arrayList2 = this.c;
                    Object obj3 = k76Var.m;
                    e8.f(arrayList2);
                    arrayList2.remove(obj3);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k76Var = u61Var.m;
            try {
                ct1.a0(obj);
                ArrayList arrayList3 = this.c;
                Object obj4 = k76Var.m;
                e8.f(arrayList3);
                arrayList3.remove(obj4);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.c;
                Object obj5 = k76Var.m;
                e8.f(arrayList4);
                arrayList4.remove(obj5);
                throw th;
            }
        }
        long j = this.b;
        int i3 = r61.i(j);
        j12 g12Var2 = h12.a;
        if (i3 != Integer.MAX_VALUE) {
            g12.a(i3);
            g12Var = new g12(i3);
        } else {
            g12Var = g12Var2;
        }
        int iH = r61.h(j);
        if (iH != Integer.MAX_VALUE) {
            g12.a(iH);
            g12Var2 = new g12(iH);
        }
        return new w07(g12Var, g12Var2);
    }

    public final void h(long j) {
        this.b = j;
        if (r61.l(j)) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hc1) it.next()).resumeWith(f88.a);
        }
    }
}
