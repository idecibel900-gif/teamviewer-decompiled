package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pp1 extends d0 implements fi1 {
    public final nj6 A;
    public final j93 B;
    public final fi1 C;
    public final ud4 D;
    public final vd4 E;
    public final vd4 F;
    public final ud4 G;
    public final pw5 H;
    public final up I;
    public final tu5 q;
    public final h60 r;
    public final s67 s;
    public final js0 t;
    public final as4 u;
    public final cp1 v;
    public final ms0 w;
    public final fp1 x;
    public final ap4 y;
    public final op1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    public pp1(fp1 fp1Var, tu5 tu5Var, ty4 ty4Var, h60 h60Var, s67 s67Var) {
        ms0 ms0Var;
        ap4 ba7Var;
        boolean z;
        Boolean bool;
        super((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, et1.y(ty4Var, tu5Var.q).f());
        fp1Var.getClass();
        tu5Var.getClass();
        ty4Var.getClass();
        s67Var.getClass();
        this.q = tu5Var;
        this.r = h60Var;
        this.s = s67Var;
        this.t = et1.y(ty4Var, tu5Var.q);
        this.u = xz2.B0((kv5) im2.e.i(tu5Var.p));
        this.v = vt1.q((ow5) im2.d.i(tu5Var.p));
        su5 su5Var = (su5) im2.f.i(tu5Var.p);
        int i = su5Var == null ? -1 : sw5.b[su5Var.ordinal()];
        ms0 ms0Var2 = ms0.f1501o;
        ms0 ms0Var3 = ms0.m;
        switch (i) {
            case 1:
            default:
                ms0Var = ms0Var3;
                break;
            case 2:
                ms0Var3 = ms0.n;
                ms0Var = ms0Var3;
                break;
            case 3:
                ms0Var = ms0Var2;
                break;
            case 4:
                ms0Var3 = ms0.p;
                ms0Var = ms0Var3;
                break;
            case 5:
                ms0Var3 = ms0.q;
                ms0Var = ms0Var3;
                break;
            case 6:
            case 7:
                ms0Var3 = ms0.r;
                ms0Var = ms0Var3;
                break;
        }
        this.w = ms0Var;
        List list = tu5Var.s;
        list.getClass();
        gw5 gw5Var = tu5Var.Q;
        gw5Var.getClass();
        d22 d22Var = new d22(gw5Var);
        ed8 ed8Var = ed8.b;
        nw5 nw5Var = tu5Var.S;
        nw5Var.getClass();
        fp1 fp1VarA = fp1Var.a(this, list, ty4Var, d22Var, l47.m(nw5Var), h60Var);
        io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1VarA.a;
        xd4 xd4Var = (xd4) kVar.a;
        this.x = fp1VarA;
        boolean zBooleanValue = im2.m.i(tu5Var.p).booleanValue();
        byte b = 0;
        byte b2 = 1;
        if (ms0Var == ms0Var2) {
            if (zBooleanValue) {
                z = true;
            } else {
                switch (((xz2) kVar.s).m) {
                    case ep1.b /* 9 */:
                        bool = null;
                        break;
                    default:
                        bool = Boolean.TRUE;
                        break;
                }
                if (im3.n(bool, Boolean.TRUE)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            ba7Var = new ba7(xd4Var, this, z);
        } else {
            ba7Var = yo4.b;
        }
        this.y = ba7Var;
        this.z = new op1(this);
        rk5 rk5Var = nj6.d;
        ((q35) ((p35) kVar.q)).getClass();
        byte b3 = 3;
        cg0 cg0Var = new cg0(b3, b2, this);
        rk5Var.getClass();
        xd4Var.getClass();
        this.A = new nj6(this, xd4Var, cg0Var);
        this.B = ms0Var == ms0Var2 ? new j93(this) : null;
        fi1 fi1Var = (fi1) fp1Var.c;
        this.C = fi1Var;
        this.D = new ud4(xd4Var, new jp1(this, b));
        this.E = new vd4(xd4Var, new jp1(this, b2));
        new ud4(xd4Var, new jp1(this, (byte) 2));
        this.F = new vd4(xd4Var, new jp1(this, b3));
        this.G = new ud4(xd4Var, new jp1(this, (byte) 4));
        ty4 ty4Var2 = (ty4) fp1VarA.b;
        d22 d22Var2 = (d22) fp1VarA.d;
        pp1 pp1Var = fi1Var instanceof pp1 ? (pp1) fi1Var : null;
        this.H = new pw5(tu5Var, ty4Var2, d22Var2, s67Var, pp1Var != null ? pp1Var.H : null);
        this.I = !im2.c.i(tu5Var.p).booleanValue() ? yl7.p : new s45(xd4Var, new jp1(this, (byte) 5));
    }

    @Override // o.qo4
    public final boolean A() {
        return im2.j.i(this.q.p).booleanValue();
    }

    public final np1 C0() {
        ((q35) ((p35) ((io.sentry.android.replay.screenshot.k) this.x.a).q)).getClass();
        nj6 nj6Var = this.A;
        nj6Var.getClass();
        d0 d0Var = nj6Var.a;
        int i = bp1.a;
        zo1.d(d0Var).getClass();
        return (np1) ((zo4) i67.s(nj6Var.c, nj6.e[0]));
    }

    public final g07 D0(sy4 sy4Var) {
        Iterator it = C0().d(sy4Var, t35.s).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((bu5) next).S() == null) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        bu5 bu5Var = (bu5) obj;
        return (g07) (bu5Var != null ? bu5Var.getType() : null);
    }

    @Override // o.hi1
    public final s67 c() {
        return this.s;
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // o.ns4
    public final List e0() {
        fp1 fp1Var = this.x;
        d22 d22Var = (d22) fp1Var.d;
        tu5 tu5Var = this.q;
        tu5Var.getClass();
        List list = tu5Var.y;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = tu5Var.z;
            list2.getClass();
            arrayList = new ArrayList(mv0.Z(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                arrayList.add(d22Var.a(num.intValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new v14(q0(), new xb1(this, ((q48) fp1Var.h).g((aw5) it.next()), (sy4) null), yl7.p));
        }
        return arrayList2;
    }

    @Override // o.zs0
    public final boolean g() {
        return im2.g.i(this.q.p).booleanValue();
    }

    @Override // o.so
    public final up getAnnotations() {
        return this.I;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.fi1
    public final fi1 i() {
        return this.C;
    }

    @Override // o.ns4
    public final ms0 i0() {
        return this.w;
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        return ((q48) this.x.h).b();
    }

    @Override // o.ns4
    public final boolean m() {
        if (!im2.k.i(this.q.p).booleanValue()) {
            return false;
        }
        h60 h60Var = this.r;
        int i = h60Var.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = h60Var.c;
            if (i2 >= 4 && (i2 > 4 || h60Var.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.ns4
    public final Collection o0() {
        return (Collection) this.F.a();
    }

    @Override // o.qo4
    public final boolean p() {
        return im2.i.i(this.q.p).booleanValue();
    }

    @Override // o.ns4
    public final zo4 p0() {
        return this.y;
    }

    @Override // o.ys0
    public final k48 q() {
        return this.z;
    }

    @Override // o.ns4, o.qo4
    public final as4 r() {
        return this.u;
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        nj6 nj6Var = this.A;
        d0 d0Var = nj6Var.a;
        int i = bp1.a;
        zo1.d(d0Var).getClass();
        return (zo4) i67.s(nj6Var.c, nj6.e[0]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(A() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // o.ns4
    public final wr0 u0() {
        return (wr0) this.D.a();
    }

    @Override // o.ns4
    public final jb8 v0() {
        return (jb8) this.G.a();
    }

    @Override // o.ns4
    public final boolean w0() {
        return im2.f.i(this.q.p) == su5.COMPANION_OBJECT;
    }

    @Override // o.ns4
    public final boolean x0() {
        return im2.h.i(this.q.p).booleanValue();
    }

    @Override // o.ns4
    public final boolean y0() {
        return im2.l.i(this.q.p).booleanValue();
    }

    @Override // o.ns4
    public final Collection z() {
        return (Collection) this.E.a();
    }

    @Override // o.ns4
    public final boolean z0() {
        return im2.k.i(this.q.p).booleanValue() && this.r.a(1, 4, 2);
    }
}
