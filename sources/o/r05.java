package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r05 {
    public final l97 a = im3.k(s05.e);
    public final l97 b;
    public final t36 c;
    public final kw d;
    public final kw e;
    public o05 f;
    public int g;
    public q05 h;
    public final bx4 i;
    public final bx4 j;
    public final bx4 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public r05() {
        l97 l97VarK = im3.k(new p05());
        this.b = l97VarK;
        this.c = yo1.u(l97VarK);
        this.d = new kw();
        this.e = new kw();
        this.i = cb5.a();
        this.j = cb5.a();
        this.k = cb5.a();
    }

    public final void a(j93 j93Var, q05 q05Var, int i) {
        bx4 bx4Var;
        boolean z;
        j93Var.getClass();
        if (q05Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(q05Var);
            j93 j93Var2 = q05Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(j93Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            bx4Var = i != 1 ? this.i : this.j;
        } else {
            bx4Var = this.k;
        }
        bx4Var.g(q05Var);
        q05Var.a = j93Var;
        ((p05) this.c.m.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        q05Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        long j;
        p05 p05Var;
        kw kwVar = this.d;
        if (!kwVar.isEmpty()) {
            Iterator it = kwVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((o05) it.next()).b) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        kw kwVar2 = this.e;
        if (!kwVar2.isEmpty()) {
            Iterator it2 = kwVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((o05) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        bx4 bx4Var = this.k;
        char c = 31;
        if (z4) {
            Object[] objArr = bx4Var.b;
            long[] jArr = bx4Var.c;
            j = 2147483647L;
            int i = bx4Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((q05) objArr[i]).b(z);
                i = i2;
                kwVar2 = kwVar2;
            }
        } else {
            j = 2147483647L;
        }
        kw kwVar3 = kwVar2;
        bx4 bx4Var2 = this.j;
        if (z5) {
            Object[] objArr2 = bx4Var2.b;
            long[] jArr2 = bx4Var2.c;
            int i3 = bx4Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> c) & j);
                ((q05) objArr2[i3]).b(z2);
                c = c;
                i3 = i4;
            }
        }
        char c2 = c;
        bx4 bx4Var3 = this.i;
        if (z6) {
            Object[] objArr3 = bx4Var3.b;
            long[] jArr3 = bx4Var3.c;
            int i5 = bx4Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> c2) & j);
                ((q05) objArr3[i5]).b(z3);
                i5 = i6;
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        o05 o05VarC = this.f;
        if (o05VarC == null) {
            o05VarC = c(0);
        }
        o05 o05VarC2 = this.f;
        if (o05VarC2 == null) {
            o05VarC2 = c(0);
        }
        if (im3.n(o05VarC2, o05VarC)) {
            if (o05VarC2 == null) {
                p05Var = new p05();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = kwVar.iterator();
                while (it3.hasNext()) {
                    boolean z7 = ((o05) it3.next()).b;
                }
                Iterator<E> it4 = kwVar3.iterator();
                while (it4.hasNext()) {
                    boolean z8 = ((o05) it4.next()).b;
                }
                p05Var = new p05(o05VarC2.a, arrayList, ea2.m, arrayList.size());
            }
            l97 l97Var = this.b;
            if (im3.n((p05) l97Var.getValue(), p05Var)) {
                return;
            }
            l97Var.l(null, p05Var);
            Object[] objArr4 = bx4Var.b;
            long[] jArr4 = bx4Var.c;
            int i7 = bx4Var.e;
            while (i7 != Integer.MAX_VALUE) {
                int i8 = (int) ((jArr4[i7] >> c2) & j);
                ((q05) objArr4[i7]).getClass();
                i7 = i8;
            }
            Object[] objArr5 = bx4Var2.b;
            long[] jArr5 = bx4Var2.c;
            int i9 = bx4Var2.e;
            while (i9 != Integer.MAX_VALUE) {
                int i10 = (int) ((jArr5[i9] >> c2) & j);
                ((q05) objArr5[i9]).getClass();
                i9 = i10;
            }
            Object[] objArr6 = bx4Var3.b;
            long[] jArr6 = bx4Var3.c;
            int i11 = bx4Var3.e;
            while (i11 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr6[i11] >> c2) & j);
                ((q05) objArr6[i11]).getClass();
                i11 = i12;
            }
        }
    }

    public final o05 c(int i) {
        Object next;
        Object next2;
        kw kwVar = this.e;
        kw kwVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = kwVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((o05) next).b);
            o05 o05Var = (o05) next;
            if (o05Var != null) {
                return o05Var;
            }
            for (Object obj2 : kwVar) {
                if (((o05) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            return (o05) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = kwVar2.iterator();
            while (it2.hasNext()) {
                ((o05) it2.next()).getClass();
            }
            Iterator it3 = kwVar.iterator();
            while (it3.hasNext()) {
                ((o05) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = kwVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((o05) next2).b);
        o05 o05Var2 = (o05) next2;
        if (o05Var2 != null) {
            return o05Var2;
        }
        for (Object obj3 : kwVar) {
            if (((o05) obj3).b) {
                obj = obj3;
                break;
            }
        }
        return (o05) obj;
    }
}
