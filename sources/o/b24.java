package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b24 extends as0 {
    public final boolean A;
    public final op1 B;
    public final g24 C;
    public final nj6 D;
    public final ri3 E;
    public final u24 F;
    public final z14 G;
    public final vd4 H;
    public final yc4 s;
    public final a86 t;
    public final ns4 u;
    public final yc4 v;
    public final kh7 w;
    public final ms0 x;
    public final as4 y;
    public final p7 z;

    static {
        cx.h1(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b24(yc4 yc4Var, fi1 fi1Var, a86 a86Var, ns4 ns4Var) throws IllegalAccessException, InvocationTargetException {
        super(((io3) yc4Var.m).a, fi1Var, a86Var.e(), d82.z(a86Var));
        yc4Var.getClass();
        fi1Var.getClass();
        a86Var.getClass();
        this.s = yc4Var;
        this.t = a86Var;
        this.u = ns4Var;
        yc4 yc4VarK = pm8.k(yc4Var, this, a86Var, 4);
        this.v = yc4VarK;
        xd4 xd4Var = ((io3) yc4VarK.m).a;
        this.w = new kh7(new a24(this, (byte) 0));
        Class cls = a86Var.a;
        this.x = cls.isAnnotation() ? ms0.q : cls.isInterface() ? ms0.n : cls.isEnum() ? ms0.f1501o : ms0.m;
        boolean zIsAnnotation = cls.isAnnotation();
        as4 as4Var = as4.n;
        byte b = 1;
        if (!zIsAnnotation && !cls.isEnum()) {
            boolean zH = a86Var.h();
            boolean z = a86Var.h() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            as4.m.getClass();
            if (zH) {
                as4Var = as4.f355o;
            } else if (z) {
                as4Var = as4.q;
            } else if (!zIsFinal) {
                as4Var = as4.p;
            }
        }
        this.y = as4Var;
        int modifiers = cls.getModifiers();
        this.z = Modifier.isPublic(modifiers) ? lg8.p : Modifier.isPrivate(modifiers) ? ig8.p : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? ap3.p : zo3.p : yo3.p;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.A = ((declaringClass != null ? new a86(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.B = new op1(this);
        g24 g24Var = new g24(yc4VarK, this, a86Var, ns4Var != null, null);
        this.C = g24Var;
        rk5 rk5Var = nj6.d;
        t tVar = new t(this, (byte) 20);
        rk5Var.getClass();
        this.D = new nj6(this, xd4Var, tVar);
        this.E = new ri3(g24Var);
        this.F = new u24(yc4VarK, a86Var, this);
        this.G = ep1.D(yc4VarK, a86Var);
        this.H = new vd4(xd4Var, new a24(this, b));
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    public final g24 C0() {
        return (g24) super.s0();
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        cp1 cp1Var = dp1.a;
        p7 p7Var = this.z;
        if (im3.n(p7Var, cp1Var)) {
            Class<?> declaringClass = this.t.a.getDeclaringClass();
            if ((declaringClass != null ? new a86(declaringClass) : null) == null) {
                cp1 cp1Var2 = ao3.a;
                cp1Var2.getClass();
                return cp1Var2;
            }
        }
        return h57.y(p7Var);
    }

    @Override // o.zs0
    public final boolean g() {
        return this.A;
    }

    @Override // o.so
    public final up getAnnotations() {
        return this.G;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.ns4
    public final ms0 i0() {
        return this.x;
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        return (List) this.H.a();
    }

    @Override // o.ns4
    public final boolean m() {
        return false;
    }

    @Override // o.ns4
    public final Collection o0() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        zp6 fxVar;
        if (this.y != as4.f355o) {
            return ea2.m;
        }
        Object obj = null;
        po3 po3VarI = lq1.I(n58.n, false, null, 7);
        Class cls = this.t.a;
        j93 j93Var = wo1.e;
        if (j93Var == null) {
            try {
                j93Var = new j93(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
            } catch (NoSuchMethodException unused) {
                j93Var = new j93(obj, obj, obj, obj, (byte) 21);
            }
            wo1.e = j93Var;
        }
        Method method = (Method) j93Var.f1141o;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new c86(cls2));
            }
            fxVar = new fx(arrayList, (byte) 1);
        } else {
            fxVar = ka2.a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = fxVar.iterator();
        while (it.hasNext()) {
            ys0 ys0VarA = ((iu) this.v.q).V((c86) it.next(), po3VarI).o0().a();
            ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
            if (ns4Var != null) {
                arrayList2.add(ns4Var);
            }
        }
        return lv0.J0(arrayList2, new gj2((byte) 21));
    }

    @Override // o.ns4
    public final zo4 p0() {
        return this.F;
    }

    @Override // o.ys0
    public final k48 q() {
        return this.B;
    }

    @Override // o.ns4, o.qo4
    public final as4 r() {
        return this.y;
    }

    @Override // o.d0, o.ns4
    public final zo4 r0() {
        return this.E;
    }

    @Override // o.ns4
    public final zo4 s0() {
        return (g24) super.s0();
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        nj6 nj6Var = this.D;
        d0 d0Var = nj6Var.a;
        int i = bp1.a;
        zo1.d(d0Var).getClass();
        return (g24) ((zo4) i67.s(nj6Var.c, nj6.e[0]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = bp1.a;
        it2 it2VarG = zo1.g(this);
        it2VarG.getClass();
        sb.append(it2VarG);
        return sb.toString();
    }

    @Override // o.ns4
    public final wr0 u0() {
        return null;
    }

    @Override // o.ns4
    public final jb8 v0() {
        return null;
    }

    @Override // o.ns4
    public final boolean w0() {
        return false;
    }

    @Override // o.ns4
    public final boolean x0() {
        return false;
    }

    @Override // o.ns4
    public final boolean y0() {
        return false;
    }

    @Override // o.ns4
    public final Collection z() {
        return (List) this.C.q.a();
    }

    @Override // o.ns4
    public final boolean z0() {
        return false;
    }
}
