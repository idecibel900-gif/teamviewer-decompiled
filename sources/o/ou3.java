package o;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ou3 implements vr0 {
    public static final e96 m = new e96("<v#(\\d+)>");

    public static void d(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean zN = im3.n(lv0.w0(arrayList2), DefaultConstructorMarker.class);
        List listSubList = arrayList2;
        if (zN) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            arrayList.add(cls);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    public static Method v(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodV;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodY = y(cls, str, clsArr, cls2);
        if (methodY != null) {
            return methodY;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodV = v(superclass, str, clsArr, cls2, z)) != null) {
            return methodV;
        }
        j1 j1VarV = hm3.v(cls.getInterfaces());
        while (true) {
            Class<?> cls3 = null;
            if (!j1VarV.hasNext()) {
                return null;
            }
            Class cls4 = (Class) j1VarV.next();
            cls4.getClass();
            Method methodV2 = v(cls4, str, clsArr, cls2, z);
            if (methodV2 != null) {
                return methodV2;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, p76.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodY2 = y(cls3, str, clsArr, cls2);
                    if (methodY2 != null) {
                        return methodY2;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static Method y(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (im3.n(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (im3.n(method.getName(), str) && im3.n(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method h(boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(a());
        }
        yt2 yt2VarW = w(str2, true);
        d(arrayList, (ArrayList) yt2VarW.n, false);
        Class clsT = t();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) yt2VarW.f2642o;
        cls.getClass();
        return v(clsT, strConcat, clsArr, cls, z);
    }

    public final Method i(String str, String str2) {
        Method methodV;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        yt2 yt2VarW = w(str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) yt2VarW.n).toArray(new Class[0]);
        Class cls = (Class) yt2VarW.f2642o;
        cls.getClass();
        Method methodV2 = v(t(), str, clsArr, cls, false);
        if (methodV2 != null) {
            return methodV2;
        }
        if (!t().isInterface() || (methodV = v(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodV;
    }

    public Collection n() {
        throw new kz3("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public Collection q(sy4 sy4Var) {
        throw new kz3("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public bu5 r(int i) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    public final List s(zo4 zo4Var, mu3 mu3Var) {
        vt3 vt3Var;
        zo4Var.getClass();
        nu3 nu3Var = new nu3(this, (byte) 24);
        Collection<fi1> collectionN = qs1.N(zo4Var, null, 3);
        ArrayList arrayList = new ArrayList();
        for (fi1 fi1Var : collectionN) {
            if (fi1Var instanceof zi0) {
                zi0 zi0Var = (zi0) fi1Var;
                if (im3.n(zi0Var.e(), dp1.h)) {
                    vt3Var = null;
                } else if ((zi0Var.k() != 2) == (mu3Var == mu3.m)) {
                    vt3Var = (vt3) fi1Var.o(nu3Var, f88.a);
                } else {
                    vt3Var = null;
                }
            } else {
                vt3Var = null;
            }
            if (vt3Var != null) {
                arrayList.add(vt3Var);
            }
        }
        return lv0.P0(arrayList);
    }

    public Class t() {
        Class clsA = a();
        List list = p76.a;
        clsA.getClass();
        Class cls = (Class) p76.c.get(clsA);
        return cls == null ? a() : cls;
    }

    public Collection u(sy4 sy4Var) {
        throw new kz3("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public final yt2 w(String str, boolean z) {
        int iY;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (ub7.R("VZCBSIFJD", cCharAt)) {
                iY = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new kz3("Unknown type prefix in the method signature: ".concat(str));
                }
                iY = ub7.Y(str, ';', i, 4) + 1;
            }
            arrayList.add(x(i, iY, str));
            i = iY;
        }
        return new yt2((Object) arrayList, (Object) (z ? x(i + 1, str.length(), str) : null), (byte) 13);
    }

    public final Class x(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = p76.d(a());
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', '.');
            strReplace.getClass();
            Class<?> clsLoadClass = classLoaderD.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsX = x(i + 1, i2, str);
            ht2 ht2Var = pa8.a;
            clsX.getClass();
            return Array.newInstance((Class<?>) clsX, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new kz3("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
