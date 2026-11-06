package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class qs0 implements wt3, vr0 {
    public static final Map n;
    public final Class m;

    static {
        List listL = qf0.L(Function0.class, Function1.class, hw2.class, iw2.class, jw2.class, kw2.class, lw2.class, mw2.class, nw2.class, ow2.class, uv2.class, vv2.class, wv2.class, xv2.class, yv2.class, zv2.class, aw2.class, bw2.class, cw2.class, dw2.class, ew2.class, fw2.class, gw2.class);
        ArrayList arrayList = new ArrayList(mv0.Z(listL, 10));
        int i = 0;
        for (Object obj : listL) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            arrayList.add(new vd5((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        n = xm4.U(arrayList);
    }

    public qs0(Class cls) {
        cls.getClass();
        this.m = cls;
    }

    public static void d() {
        throw new lz3();
    }

    @Override // o.vr0
    public final Class a() {
        return this.m;
    }

    @Override // o.wt3
    public final String c() {
        String strZ;
        Class cls = this.m;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strZ2 = vn4.Z(cls.getName());
            return strZ2 == null ? cls.getCanonicalName() : strZ2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strZ = vn4.Z(componentType.getName())) != null) {
            strConcat = strZ.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // o.wt3
    public final boolean e() {
        d();
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qs0) && et1.A(this).equals(et1.A((wt3) obj));
    }

    @Override // o.wt3
    public final String f() {
        String strW0;
        Class cls = this.m;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strW1 = vn4.w0(cls.getName());
                return strW1 == null ? cls.getSimpleName() : strW1;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strW0 = vn4.w0(componentType.getName())) != null) {
                strConcat = strW0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ub7.p0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iY = ub7.Y(simpleName, '$', 0, 6);
            return iY == -1 ? simpleName : simpleName.substring(iY + 1, simpleName.length());
        }
        return ub7.p0(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // o.wt3
    public final boolean g() {
        d();
        throw null;
    }

    @Override // o.qt3
    public final List getAnnotations() {
        throw null;
    }

    @Override // o.wt3
    public final int hashCode() {
        return et1.A(this).hashCode();
    }

    @Override // o.wt3
    public final Object j() {
        d();
        throw null;
    }

    @Override // o.wt3
    public final boolean m() {
        d();
        throw null;
    }

    @Override // o.wt3
    public final boolean o(Object obj) {
        Class clsA = this.m;
        clsA.getClass();
        Map map = n;
        map.getClass();
        Integer num = (Integer) map.get(clsA);
        if (num != null) {
            return e8.p(num.intValue(), obj);
        }
        if (clsA.isPrimitive()) {
            clsA = et1.A(w86.a.b(clsA));
        }
        return clsA.isInstance(obj);
    }

    @Override // o.wt3
    public final boolean p() {
        d();
        throw null;
    }

    public final String toString() {
        return this.m.toString() + " (Kotlin reflection is not available)";
    }
}
