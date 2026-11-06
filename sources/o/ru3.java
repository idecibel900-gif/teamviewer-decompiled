package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ru3 extends vt3 implements rw2, pu3, Function0, Function1, uv2, vv2, wv2, xv2, yv2, zv2, aw2, bw2, cw2, dw2, hw2, ew2, fw2, gw2, iw2, jw2, kw2, lw2, mw2, nw2, ow2 {
    public static final /* synthetic */ fw3[] x;
    public final ou3 r;
    public final String s;
    public final Object t;
    public final u86 u;
    public final u14 v;
    public final u14 w;

    static {
        x86 x86Var = w86.a;
        x = new fw3[]{x86Var.g(new gu5(x86Var.b(ru3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ru3(ou3 ou3Var, String str, String str2, xw2 xw2Var, Object obj) {
        this.r = ou3Var;
        this.s = str2;
        this.t = obj;
        this.u = et1.F(xw2Var, new e3((byte) 14, this, str, false));
        qu3 qu3Var = new qu3(this, 0 == true ? 1 : 0);
        l54 l54Var = l54.m;
        this.v = ds1.X(l54Var, qu3Var);
        this.w = ds1.X(l54Var, new qu3(this, (byte) 1));
    }

    public final ck0 A(Constructor constructor, xw2 xw2Var, boolean z) {
        Object obj = this.t;
        Class cls = null;
        if (!z) {
            wr0 wr0Var = xw2Var instanceof wr0 ? (wr0) xw2Var : null;
            if (wr0Var != null && !dp1.e(wr0Var.e())) {
                ns4 ns4VarU = wr0Var.u();
                ns4VarU.getClass();
                if (!pi3.e(ns4VarU) && !zo1.q(wr0Var.u())) {
                    List listJ = wr0Var.J();
                    listJ.getClass();
                    if (!listJ.isEmpty()) {
                        Iterator it = listJ.iterator();
                        while (it.hasNext()) {
                            oz3 type = ((qb8) it.next()).getType();
                            type.getClass();
                            if (xo1.X(type)) {
                                if (z()) {
                                    return new nj0(constructor, n67.i(obj, w()), (byte) 0);
                                }
                                Class declaringClass = constructor.getDeclaringClass();
                                declaringClass.getClass();
                                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                genericParameterTypes.getClass();
                                return new oj0(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : cx.L0(genericParameterTypes, 0, genericParameterTypes.length - 1)), (byte) 0);
                            }
                        }
                    }
                }
            }
        }
        if (z()) {
            return new nj0(constructor, n67.i(obj, w()), (byte) 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        declaringClass2.getClass();
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls2 = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        genericParameterTypes2.getClass();
        return new oj0(constructor, declaringClass2, cls2, genericParameterTypes2, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final wj0 B(Method method) {
        boolean z = false;
        if (!z()) {
            return new bk0((byte) 2, 6, method, z);
        }
        v14 v14VarO = w().O();
        Object objI = this.t;
        if (v14VarO != null) {
            oz3 type = v14VarO.getType();
            int i = pi3.a;
            ys0 ys0VarA = type.o0().a();
            if (ys0VarA != null ? pi3.b(ys0VarA) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) cx.S0(parameterTypes);
                if (cls == null || !cls.isInterface()) {
                    objI = n67.i(objI, w());
                }
            } else {
                objI = n67.i(objI, w());
            }
        } else {
            objI = n67.i(objI, w());
        }
        return new zj0(method, objI);
    }

    @Override // o.vt3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final xw2 w() {
        fw3 fw3Var = x[0];
        Object objA = this.u.a();
        objA.getClass();
        return (xw2) objA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        return call(new Object[0]);
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    public final boolean equals(Object obj) {
        ru3 ru3VarB = pa8.b(obj);
        return ru3VarB != null && im3.n(this.r, ru3VarB.r) && getName().equals(ru3VarB.getName()) && im3.n(this.s, ru3VarB.s) && im3.n(this.t, ru3VarB.t);
    }

    @Override // o.rw2
    public final int getArity() {
        mj0 mj0VarT = t();
        mj0VarT.getClass();
        return mj0VarT.a().size();
    }

    @Override // o.rt3
    public final String getName() {
        String strB = ((gi1) w()).getName().b();
        strB.getClass();
        return strB;
    }

    @Override // o.mw2
    public final Object h(Object obj, Integer num, j74 j74Var, Boolean bool, Object obj2, Object obj3, Integer num2) {
        return call(obj, num, j74Var, bool, obj2, obj3, num2);
    }

    public final int hashCode() {
        return this.s.hashCode() + ((getName().hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // o.rt3
    public final boolean l() {
        return w().l();
    }

    @Override // o.kw2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // o.nw2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, num);
    }

    @Override // o.vt3
    public final mj0 t() {
        return (mj0) this.v.getValue();
    }

    public final String toString() {
        qo1 qo1Var = z86.a;
        return z86.b(w());
    }

    @Override // o.vt3
    public final ou3 u() {
        return this.r;
    }

    @Override // o.vt3
    public final mj0 v() {
        return (mj0) this.w.getValue();
    }

    @Override // o.vt3
    public final boolean z() {
        return this.t != bj0.NO_RECEIVER;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ru3(ou3 ou3Var, xw2 xw2Var) {
        xw2Var.getClass();
        String strB = ((gi1) xw2Var).getName().b();
        strB.getClass();
        this(ou3Var, strB, og6.c(xw2Var).l(), xw2Var, bj0.NO_RECEIVER);
    }
}
