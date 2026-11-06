package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k54 extends ns4 {
    public final ns4 m;
    public final m58 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m58 f1231o;
    public ArrayList p;
    public ArrayList q;
    public ss0 r;

    public k54(ns4 ns4Var, m58 m58Var) {
        this.m = ns4Var;
        this.n = m58Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void A0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case ep1.c /* 10 */:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case ep1.b /* 9 */:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case ep1.d /* 12 */:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "getConstructors";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // o.qo4
    public final boolean A() {
        return this.m.A();
    }

    public final m58 B0() {
        if (this.f1231o == null) {
            m58 m58Var = this.n;
            if (m58Var.a.e()) {
                this.f1231o = m58Var;
            } else {
                List parameters = this.m.q().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.p = arrayList;
                this.f1231o = xo1.Y(parameters, m58Var.a, this, arrayList);
                ArrayList arrayList2 = this.p;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((d58) obj).U()) {
                        arrayList3.add(obj);
                    }
                }
                this.q = arrayList3;
            }
        }
        return this.f1231o;
    }

    @Override // o.ns4, o.ys0
    public final g07 W() {
        g48 g48VarN;
        List listD = p58.d(q().getParameters());
        up annotations = getAnnotations();
        if (annotations.isEmpty()) {
            g48.n.getClass();
            g48VarN = g48.f858o;
        } else {
            lh7 lh7Var = g48.n;
            List listK = qf0.K(new xp(annotations));
            lh7Var.getClass();
            g48VarN = lh7.n(listK);
        }
        return bt1.Q(listD, s0(), g48VarN, q(), false);
    }

    @Override // o.hi1
    public final s67 c() {
        return s67.h;
    }

    @Override // o.ie7
    public final hi1 d(m58 m58Var) {
        if (m58Var != null) {
            k58 k58Var = m58Var.a;
            return k58Var.e() ? this : new k54(this, m58.e(k58Var, B0().a));
        }
        A0(23);
        throw null;
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        cp1 cp1VarE = this.m.e();
        if (cp1VarE != null) {
            return cp1VarE;
        }
        A0(27);
        throw null;
    }

    @Override // o.ns4
    public final List e0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(17);
        throw null;
    }

    @Override // o.zs0
    public final boolean g() {
        return this.m.g();
    }

    @Override // o.so
    public final up getAnnotations() {
        up annotations = this.m.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        A0(19);
        throw null;
    }

    @Override // o.fi1
    public final sy4 getName() {
        sy4 name = this.m.getName();
        if (name != null) {
            return name;
        }
        A0(20);
        throw null;
    }

    @Override // o.qo4
    public final boolean h0() {
        return this.m.h0();
    }

    @Override // o.fi1
    public final fi1 i() {
        fi1 fi1VarI = this.m.i();
        if (fi1VarI != null) {
            return fi1VarI;
        }
        A0(22);
        throw null;
    }

    @Override // o.ns4
    public final ms0 i0() {
        ms0 ms0VarI0 = this.m.i0();
        if (ms0VarI0 != null) {
            return ms0VarI0;
        }
        A0(25);
        throw null;
    }

    @Override // o.ns4
    public final zo4 j0(k58 k58Var) {
        bp1.h(zo1.d(this));
        return m0(k58Var, uz3.a);
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        B0();
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            return arrayList;
        }
        A0(30);
        throw null;
    }

    @Override // o.ns4
    public final boolean m() {
        return this.m.m();
    }

    @Override // o.ns4
    public final zo4 m0(k58 k58Var, uz3 uz3Var) {
        zo4 zo4VarM0 = this.m.m0(k58Var, uz3Var);
        if (!this.n.a.e()) {
            return new je7(zo4VarM0, B0());
        }
        if (zo4VarM0 != null) {
            return zo4VarM0;
        }
        A0(7);
        throw null;
    }

    @Override // o.fi1
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final ns4 a() {
        ns4 ns4VarA = this.m.a();
        if (ns4VarA != null) {
            return ns4VarA;
        }
        A0(21);
        throw null;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.u(this, obj);
    }

    @Override // o.ns4
    public final Collection o0() {
        Collection collectionO0 = this.m.o0();
        if (collectionO0 != null) {
            return collectionO0;
        }
        A0(31);
        throw null;
    }

    @Override // o.qo4
    public final boolean p() {
        return this.m.p();
    }

    @Override // o.ns4
    public final zo4 p0() {
        zo4 zo4VarP0 = this.m.p0();
        if (zo4VarP0 != null) {
            return zo4VarP0;
        }
        A0(15);
        throw null;
    }

    @Override // o.ys0
    public final k48 q() {
        k48 k48VarQ = this.m.q();
        if (this.n.a.e()) {
            if (k48VarQ != null) {
                return k48VarQ;
            }
            A0(0);
            throw null;
        }
        ss0 ss0Var = this.r;
        if (ss0Var != null) {
            return ss0Var;
        }
        m58 m58VarB0 = B0();
        Collection collectionB = k48VarQ.b();
        ArrayList arrayList = new ArrayList(collectionB.size());
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(m58VarB0.h((oz3) it.next(), ub8.f2197o));
        }
        ss0 ss0Var2 = new ss0(this, this.p, arrayList, xd4.e);
        this.r = ss0Var2;
        return ss0Var2;
    }

    @Override // o.ns4, o.qo4
    public final as4 r() {
        as4 as4VarR = this.m.r();
        if (as4VarR != null) {
            return as4VarR;
        }
        A0(26);
        throw null;
    }

    @Override // o.ns4
    public final zo4 r0() {
        zo4 zo4VarR0 = this.m.r0();
        if (zo4VarR0 != null) {
            return zo4VarR0;
        }
        A0(28);
        throw null;
    }

    @Override // o.ns4
    public final zo4 s0() {
        bp1.h(zo1.d(this.m));
        return t0(uz3.a);
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        zo4 zo4VarT0 = this.m.t0(uz3Var);
        if (!this.n.a.e()) {
            return new je7(zo4VarT0, B0());
        }
        if (zo4VarT0 != null) {
            return zo4VarT0;
        }
        A0(14);
        throw null;
    }

    @Override // o.ns4
    public final wr0 u0() {
        return this.m.u0();
    }

    @Override // o.ns4
    public final jb8 v0() {
        jb8 jb8VarV0 = this.m.v0();
        if (jb8VarV0 == null) {
            return null;
        }
        boolean z = jb8VarV0 instanceof oi3;
        ub8 ub8Var = ub8.f2197o;
        m58 m58Var = this.n;
        if (z) {
            oi3 oi3Var = (oi3) jb8VarV0;
            sy4 sy4Var = oi3Var.a;
            g07 g07Var = (g07) oi3Var.b;
            if (g07Var != null && !m58Var.a.e()) {
                g07Var = (g07) B0().h(g07Var, ub8Var);
            }
            return new oi3(sy4Var, g07Var);
        }
        if (!(jb8VarV0 instanceof su4)) {
            gk0.s();
            return null;
        }
        ArrayList<vd5> arrayList = ((su4) jb8VarV0).a;
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        for (vd5 vd5Var : arrayList) {
            sy4 sy4Var2 = (sy4) vd5Var.m;
            g07 g07Var2 = (g07) ((i07) vd5Var.n);
            if (g07Var2 != null && !m58Var.a.e()) {
                g07Var2 = (g07) B0().h(g07Var2, ub8Var);
            }
            arrayList2.add(new vd5(sy4Var2, g07Var2));
        }
        return new su4(arrayList2);
    }

    @Override // o.ns4
    public final boolean w0() {
        return this.m.w0();
    }

    @Override // o.ns4
    public final boolean x0() {
        return this.m.x0();
    }

    @Override // o.ns4
    public final boolean y0() {
        return this.m.y0();
    }

    @Override // o.ns4
    public final Collection z() {
        Collection<wr0> collectionZ = this.m.z();
        ArrayList arrayList = new ArrayList(collectionZ.size());
        for (wr0 wr0Var : collectionZ) {
            wr0Var.getClass();
            yw2 yw2VarI0 = wr0Var.I0(m58.b);
            yw2VarI0.q = wr0Var.a();
            yw2VarI0.t(wr0Var.r());
            yw2VarI0.g(wr0Var.e());
            yw2VarI0.f(wr0Var.k());
            yw2VarI0.y = false;
            arrayList.add(((wr0) yw2VarI0.J.F0(yw2VarI0)).d(B0()));
        }
        return arrayList;
    }

    @Override // o.ns4
    public final boolean z0() {
        return this.m.z0();
    }
}
