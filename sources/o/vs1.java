package o;

import android.app.Application;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.view.MotionEvent;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class vs1 {
    public static String a;
    public static int b;
    public static Boolean c;
    public static nf d;

    public static final int B(pg6 pg6Var) {
        pg6Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0("SELECT changes()");
        try {
            ug6VarJ0.F0();
            int i = (int) ug6VarJ0.getLong(0);
            iq8.l(ug6VarJ0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(ug6VarJ0, th);
                throw th2;
            }
        }
    }

    public static final long C(long j) {
        if (j < 0) {
            aw awVar = c72.n;
            return c72.p;
        }
        aw awVar2 = c72.n;
        return c72.f496o;
    }

    public static final void D(r8 r8Var, String str) {
        r8Var.q(r8Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static boolean E(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final float G(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int H(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static final CharSequence I(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String J(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return e41.l(sb, str != null ? fx3.g(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final wf1 K(br2 br2Var, int i) {
        int iOrdinal = br2Var.Z0().ordinal();
        wf1 wf1Var = wf1.m;
        if (iOrdinal != 0) {
            wf1 wf1Var2 = wf1.n;
            if (iOrdinal == 1) {
                br2 br2VarL = xs1.L(br2Var);
                if (br2VarL == null) {
                    hk0.g("ActiveParent with no focused child");
                    return null;
                }
                wf1 wf1VarK = K(br2VarL, i);
                wf1 wf1Var3 = wf1VarK != wf1Var ? wf1VarK : null;
                if (wf1Var3 != null) {
                    return wf1Var3;
                }
                if (br2Var.C) {
                    return wf1Var;
                }
                br2Var.C = true;
                try {
                    oq2 oq2VarW0 = br2Var.W0();
                    cl0 cl0Var = new cl0(i);
                    lq2 lq2Var = (lq2) vn4.q0(br2Var).getFocusOwner();
                    br2 br2VarG = lq2Var.g();
                    oq2VarW0.k.invoke(cl0Var);
                    br2 br2VarG2 = lq2Var.g();
                    if (cl0Var.b) {
                        sq2 sq2Var = sq2.b;
                        return wf1Var2;
                    }
                    if (br2VarG == br2VarG2 || br2VarG2 == null) {
                        return wf1Var;
                    }
                    return sq2.d == sq2.c ? wf1Var2 : wf1.f2408o;
                } finally {
                    br2Var.C = false;
                }
            }
            if (iOrdinal == 2) {
                return wf1Var2;
            }
            if (iOrdinal != 3) {
                gk0.s();
                return null;
            }
        }
        return wf1Var;
    }

    public static final wf1 L(br2 br2Var, int i) {
        if (!br2Var.D) {
            br2Var.D = true;
            try {
                oq2 oq2VarW0 = br2Var.W0();
                cl0 cl0Var = new cl0(i);
                lq2 lq2Var = (lq2) vn4.q0(br2Var).getFocusOwner();
                br2 br2VarG = lq2Var.g();
                oq2VarW0.j.invoke(cl0Var);
                br2 br2VarG2 = lq2Var.g();
                boolean z = cl0Var.b;
                wf1 wf1Var = wf1.n;
                if (z) {
                    sq2 sq2Var = sq2.b;
                    return wf1Var;
                }
                if (br2VarG != br2VarG2 && br2VarG2 != null) {
                    return sq2.d == sq2.c ? wf1Var : wf1.f2408o;
                }
            } finally {
                br2Var.D = false;
            }
        }
        return wf1.m;
    }

    public static final wf1 M(br2 br2Var, int i) {
        es4 es4VarL0;
        nf nfVar;
        int iOrdinal = br2Var.Z0().ordinal();
        wf1 wf1Var = wf1.m;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                br2 br2VarL = xs1.L(br2Var);
                if (br2VarL != null) {
                    return K(br2VarL, i);
                }
                hk0.g("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    gk0.s();
                    return null;
                }
                if (!br2Var.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4 es4Var = br2Var.m.q;
                LayoutNode layoutNodeP0 = vn4.p0(br2Var);
                loop0: while (true) {
                    if (layoutNodeP0 == null) {
                        es4VarL0 = null;
                        break;
                    }
                    if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                        while (es4Var != null) {
                            if ((es4Var.f737o & 1024) != 0) {
                                es4VarL0 = es4Var;
                                xx4 xx4Var = null;
                                while (es4VarL0 != null) {
                                    if (es4VarL0 instanceof br2) {
                                        break loop0;
                                    }
                                    if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                        int i2 = 0;
                                        for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                            if ((es4Var2.f737o & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    es4VarL0 = es4Var2;
                                                } else {
                                                    if (xx4Var == null) {
                                                        xx4Var = new xx4(new es4[16]);
                                                    }
                                                    if (es4VarL0 != null) {
                                                        xx4Var.b(es4VarL0);
                                                        es4VarL0 = null;
                                                    }
                                                    xx4Var.b(es4Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    es4VarL0 = vn4.l0(xx4Var);
                                }
                            }
                            es4Var = es4Var.q;
                        }
                    }
                    layoutNodeP0 = layoutNodeP0.F();
                    es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
                }
                br2 br2Var2 = (br2) es4VarL0;
                if (br2Var2 == null) {
                    return wf1Var;
                }
                int iOrdinal2 = br2Var2.Z0().ordinal();
                if (iOrdinal2 == 0) {
                    return L(br2Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return M(br2Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return wf1.n;
                }
                if (iOrdinal2 != 3) {
                    gk0.s();
                    return null;
                }
                wf1 wf1VarM = M(br2Var2, i);
                wf1 wf1Var2 = wf1VarM != wf1Var ? wf1VarM : null;
                return wf1Var2 == null ? L(br2Var2, i) : wf1Var2;
            }
        }
        return wf1Var;
    }

    public static final boolean N(br2 br2Var) {
        xx4 xx4Var;
        nf nfVar;
        boolean z;
        nf nfVar2;
        lq2 lq2Var = (lq2) vn4.q0(br2Var).getFocusOwner();
        br2 br2VarG = lq2Var.g();
        wq2 wq2VarZ0 = br2Var.Z0();
        if (br2VarG == br2Var) {
            br2Var.V0(wq2VarZ0, wq2VarZ0);
            return true;
        }
        if ((br2VarG == null || br2VarG.A) && !br2Var.A && !((lq2) vn4.q0(br2Var).getFocusOwner()).a.D()) {
            return false;
        }
        if (br2VarG != null) {
            xx4Var = new xx4(new br2[16]);
            if (!br2VarG.m.z) {
                ki3.c("visitAncestors called on an unattached node");
            }
            es4 es4Var = br2VarG.m.q;
            LayoutNode layoutNodeP0 = vn4.p0(br2VarG);
            while (layoutNodeP0 != null) {
                if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                    while (es4Var != null) {
                        if ((es4Var.f737o & 1024) != 0) {
                            es4 es4VarL0 = es4Var;
                            xx4 xx4Var2 = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof br2) {
                                    xx4Var.b((br2) es4VarL0);
                                } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i = 0;
                                    for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                        if ((es4Var2.f737o & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                es4VarL0 = es4Var2;
                                            } else {
                                                if (xx4Var2 == null) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var2.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var2.b(es4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var2);
                            }
                        }
                        es4Var = es4Var.q;
                    }
                }
                layoutNodeP0 = layoutNodeP0.F();
                es4Var = (layoutNodeP0 == null || (nfVar2 = layoutNodeP0.S) == null) ? null : (kn7) nfVar2.f;
            }
        } else {
            xx4Var = null;
        }
        Object[] objArr = new br2[16];
        Object[] objArr2 = new br2[16];
        if (!br2Var.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var3 = br2Var.m.q;
        LayoutNode layoutNodeP1 = vn4.p0(br2Var);
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        while (layoutNodeP1 != null) {
            if ((((es4) layoutNodeP1.S.g).p & 1024) != 0) {
                while (es4Var3 != null) {
                    if ((es4Var3.f737o & 1024) != 0) {
                        es4 es4VarL1 = es4Var3;
                        xx4 xx4Var3 = null;
                        while (es4VarL1 != null) {
                            if (es4VarL1 instanceof br2) {
                                br2 br2Var2 = (br2) es4VarL1;
                                if (im3.n(xx4Var != null ? Boolean.valueOf(xx4Var.j(br2Var2)) : null, Boolean.TRUE)) {
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i2] = br2Var2;
                                    i2 = i4;
                                } else {
                                    lq2Var = lq2Var;
                                    int i5 = i3 + 1;
                                    if (objArr2.length < i5) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i3] = br2Var2;
                                    i3 = i5;
                                }
                                if (br2Var2 == br2VarG) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                lq2Var = lq2Var;
                                z = true;
                            }
                            if (z && (es4VarL1.f737o & 1024) != 0 && (es4VarL1 instanceof vm1)) {
                                int i6 = 0;
                                for (es4 es4Var4 = ((vm1) es4VarL1).B; es4Var4 != null; es4Var4 = es4Var4.r) {
                                    if ((es4Var4.f737o & 1024) != 0) {
                                        int i7 = i6 + 1;
                                        if (i7 == 1) {
                                            es4VarL1 = es4Var4;
                                            i7 = i7;
                                        } else {
                                            xx4 xx4Var4 = xx4Var3 == null ? new xx4(new es4[16]) : xx4Var3;
                                            if (es4VarL1 != null) {
                                                xx4Var4.b(es4VarL1);
                                                es4VarL1 = null;
                                            }
                                            xx4Var4.b(es4Var4);
                                            xx4Var3 = xx4Var4;
                                        }
                                        i6 = i7;
                                    }
                                }
                                if (i6 != 1) {
                                    es4VarL1 = vn4.l0(xx4Var3);
                                }
                            } else {
                                es4VarL1 = vn4.l0(xx4Var3);
                            }
                        }
                    }
                    es4Var3 = es4Var3.q;
                    lq2Var = lq2Var;
                }
            }
            lq2 lq2Var2 = lq2Var;
            layoutNodeP1 = layoutNodeP1.F();
            es4Var3 = (layoutNodeP1 == null || (nfVar = layoutNodeP1.S) == null) ? null : (kn7) nfVar.f;
            lq2Var = lq2Var2;
        }
        lq2 lq2Var3 = lq2Var;
        if (z2 && br2VarG != null && !O(br2VarG, false)) {
            return false;
        }
        bt1.J(br2Var, new zz0(br2Var, (byte) 17));
        int iOrdinal = br2Var.Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((lq2) vn4.q0(br2Var).getFocusOwner()).j(br2Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    gk0.s();
                    return false;
                }
                ((lq2) vn4.q0(br2Var).getFocusOwner()).j(br2Var);
            }
        }
        wq2 wq2Var = wq2.f2437o;
        wq2 wq2Var2 = wq2.m;
        if (z2 && br2VarG != null) {
            br2VarG.V0(wq2Var2, wq2Var);
        }
        wq2 wq2Var3 = wq2.n;
        if (xx4Var != null) {
            int i8 = xx4Var.f2559o - 1;
            Object[] objArr5 = xx4Var.m;
            if (i8 < objArr5.length) {
                while (i8 >= 0) {
                    br2 br2Var3 = (br2) objArr5[i8];
                    if (lq2Var3.g() != br2Var) {
                        return false;
                    }
                    br2Var3.V0(wq2Var3, wq2Var);
                    i8--;
                }
            }
        }
        int i9 = i3 - 1;
        if (i9 < objArr2.length) {
            while (i9 >= 0) {
                br2 br2Var4 = (br2) objArr2[i9];
                if (lq2Var3.g() != br2Var) {
                    return false;
                }
                br2Var4.V0(br2Var4 == br2VarG ? wq2Var2 : wq2Var, wq2Var3);
                i9--;
            }
        }
        if (lq2Var3.g() != br2Var) {
            return false;
        }
        br2Var.V0(wq2VarZ0, wq2Var2);
        return lq2Var3.g() == br2Var;
    }

    public static final boolean O(br2 br2Var, boolean z) {
        int iOrdinal = br2Var.Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                br2 br2VarL = xs1.L(br2Var);
                if (!(br2VarL != null ? O(br2VarL, z) : true)) {
                    return false;
                }
                br2Var.V0(wq2.n, wq2.f2437o);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                gk0.s();
                return false;
            }
        }
        return true;
    }

    public static void P(gz3 gz3Var, Annotation annotation) throws InvocationTargetException {
        Class clsZ = et1.z(et1.x(annotation));
        ez3 ez3VarE = gz3Var.e(p76.a(clsZ), new o76(annotation));
        if (ez3VarE != null) {
            Q(ez3VarE, annotation, clsZ);
        }
    }

    public static void Q(ez3 ez3Var, Annotation annotation, Class cls) throws InvocationTargetException {
        j1 j1VarV = hm3.v(cls.getDeclaredMethods());
        while (j1VarV.hasNext()) {
            Method method = (Method) j1VarV.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                sy4 sy4VarE = sy4.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    ez3Var.f(sy4VarE, k((Class) objInvoke));
                } else if (s86.a.contains(enclosingClass)) {
                    ez3Var.h(sy4VarE, objInvoke);
                } else {
                    List list = p76.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        ez3Var.g(sy4VarE, p76.a(enclosingClass), sy4.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) cx.c1(interfaces);
                        cls2.getClass();
                        ez3 ez3VarW = ez3Var.w(p76.a(cls2), sy4VarE);
                        if (ez3VarW != null) {
                            Q(ez3VarW, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        fz3 fz3VarS = ez3Var.s(sy4VarE);
                        if (fz3VarS != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            int i = 0;
                            if (componentType.isEnum()) {
                                js0 js0VarA = p76.a(componentType);
                                Object[] objArr = (Object[]) objInvoke;
                                int length = objArr.length;
                                while (i < length) {
                                    Object obj = objArr[i];
                                    obj.getClass();
                                    fz3VarS.m(js0VarA, sy4.e(((Enum) obj).name()));
                                    i++;
                                }
                            } else if (componentType.equals(Class.class)) {
                                Object[] objArr2 = (Object[]) objInvoke;
                                int length2 = objArr2.length;
                                while (i < length2) {
                                    Object obj2 = objArr2[i];
                                    obj2.getClass();
                                    fz3VarS.b(k((Class) obj2));
                                    i++;
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) objInvoke;
                                int length3 = objArr3.length;
                                while (i < length3) {
                                    Object obj3 = objArr3[i];
                                    ez3 ez3VarK = fz3VarS.k(p76.a(componentType));
                                    if (ez3VarK != null) {
                                        obj3.getClass();
                                        Q(ez3VarK, (Annotation) obj3, componentType);
                                    }
                                    i++;
                                }
                            } else {
                                Object[] objArr4 = (Object[]) objInvoke;
                                int length4 = objArr4.length;
                                while (i < length4) {
                                    fz3VarS.i(objArr4[i]);
                                    i++;
                                }
                            }
                            fz3VarS.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        ez3Var.a();
    }

    public static final px4 R(f62 f62Var, jj1 jj1Var, Object obj, Function0 function0, hw2 hw2Var, ux2 ux2Var) {
        jj1Var.getClass();
        obj.getClass();
        function0.getClass();
        hw2Var.getClass();
        ((ub6) ux2Var.j(wb6.b)).getClass();
        tb6 tb6VarA = ub6.a(ux2Var);
        boolean zF = ux2Var.f(f62Var) | ux2Var.f(jj1Var) | ux2Var.f(obj) | ux2Var.f(tb6VarA);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = h57.p(vn4.u0(ba2.m, new vt4(hw2Var, tb6VarA, null, (byte) 12)));
            ux2Var.g0(objK);
        }
        return (px4) objK;
    }

    public static final sb0 S(ux2 ux2Var) {
        zw5 zw5Var = un4.a;
        List listL = qf0.L(new rv0(((rn4) ux2Var.j(zw5Var)).a.B), new rv0(((rn4) ux2Var.j(zw5Var)).a.r), new rv0(((rn4) ux2Var.j(zw5Var)).a.B));
        rh3 rh3VarK = nv1.k(nv1.G("deviceTabShimmer", ux2Var, 0), 0.0f, 1000.0f, db8.J(db8.I0(1200, 2, q72.c), 4), "deviceTabShimmerOffset", ux2Var, 29112, 0);
        float fFloatValue = ((Number) rh3VarK.f1923o.getValue()).floatValue();
        bg5 bg5Var = rh3VarK.f1923o;
        boolean zC = ux2Var.c(fFloatValue) | ux2Var.f(listL);
        Object objK = ux2Var.K();
        if (zC || objK == e01.a) {
            float fFloatValue2 = ((Number) bg5Var.getValue()).floatValue();
            float fFloatValue3 = ((Number) bg5Var.getValue()).floatValue();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue3)) & 4294967295L);
            float fFloatValue4 = ((Number) bg5Var.getValue()).floatValue() + 200.0f;
            float fFloatValue5 = ((Number) bg5Var.getValue()).floatValue() + 200.0f;
            Object t94Var = new t94(listL, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fFloatValue4)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fFloatValue5))), 0);
            ux2Var.g0(t94Var);
            objK = t94Var;
        }
        return (sb0) objK;
    }

    public static final zk3 T(v56 v56Var) {
        return new zk3(Math.round(v56Var.a), Math.round(v56Var.b), Math.round(v56Var.c), Math.round(v56Var.d));
    }

    public static final long U(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        g72 g72Var = g72.NANOSECONDS;
        if (j4 >= 0) {
            return lq1.L(j3, g72Var);
        }
        g72 g72Var2 = g72.MILLISECONDS;
        if (g72Var.compareTo(g72Var2) >= 0) {
            return c72.h(C(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        aw awVar = c72.n;
        return c72.f(lq1.L(j5, g72Var2), lq1.L(j6, g72Var));
    }

    public static final void V(List list, rj rjVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        rj rjVar2 = rjVar;
        Path path = rjVar2.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        vh5 vh5Var = list2.isEmpty() ? dh5.c : (vh5) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i < size) {
            vh5 vh5Var2 = (vh5) list2.get(i);
            if (vh5Var2 instanceof dh5) {
                path.close();
                path = path;
                size = size;
                f11 = f11;
                i = i;
                vh5Var2 = vh5Var2;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (vh5Var2 instanceof ph5) {
                    ph5 ph5Var = (ph5) vh5Var2;
                    float f18 = ph5Var.c;
                    f14 += f18;
                    float f19 = ph5Var.d;
                    f15 += f19;
                    path.rMoveTo(f18, f19);
                    path = path;
                    f16 = f14;
                    f17 = f15;
                } else if (vh5Var2 instanceof hh5) {
                    hh5 hh5Var = (hh5) vh5Var2;
                    float f20 = hh5Var.c;
                    float f21 = hh5Var.d;
                    path.moveTo(f20, f21);
                    f15 = f21;
                    f17 = f15;
                    f14 = f20;
                    f16 = f14;
                } else if (vh5Var2 instanceof oh5) {
                    oh5 oh5Var = (oh5) vh5Var2;
                    float f22 = oh5Var.d;
                    float f23 = oh5Var.c;
                    path.rLineTo(f23, f22);
                    f14 += f23;
                    f15 += f22;
                } else if (vh5Var2 instanceof gh5) {
                    gh5 gh5Var = (gh5) vh5Var2;
                    float f24 = gh5Var.d;
                    float f25 = gh5Var.c;
                    rjVar2.e(f25, f24);
                    f14 = f25;
                    f15 = f24;
                } else if (vh5Var2 instanceof nh5) {
                    float f26 = ((nh5) vh5Var2).c;
                    path.rLineTo(f26, f11);
                    f14 += f26;
                } else if (vh5Var2 instanceof fh5) {
                    float f27 = ((fh5) vh5Var2).c;
                    rjVar2.e(f27, f15);
                    f14 = f27;
                } else if (vh5Var2 instanceof th5) {
                    float f28 = ((th5) vh5Var2).c;
                    path.rLineTo(f11, f28);
                    f15 += f28;
                } else if (vh5Var2 instanceof uh5) {
                    float f29 = ((uh5) vh5Var2).c;
                    rjVar2.e(f14, f29);
                    f15 = f29;
                } else {
                    if (vh5Var2 instanceof mh5) {
                        mh5 mh5Var = (mh5) vh5Var2;
                        path.rCubicTo(mh5Var.c, mh5Var.d, mh5Var.e, mh5Var.f, mh5Var.g, mh5Var.h);
                        f3 = mh5Var.e + f14;
                        f4 = mh5Var.f + f15;
                        f14 += mh5Var.g;
                        f10 = mh5Var.h;
                    } else {
                        if (vh5Var2 instanceof eh5) {
                            eh5 eh5Var = (eh5) vh5Var2;
                            path.cubicTo(eh5Var.c, eh5Var.d, eh5Var.e, eh5Var.f, eh5Var.g, eh5Var.h);
                            f3 = eh5Var.e;
                            f5 = eh5Var.f;
                            f6 = eh5Var.g;
                            f7 = eh5Var.h;
                        } else if (vh5Var2 instanceof rh5) {
                            if (vh5Var.a) {
                                f8 = f14 - f12;
                                f9 = f15 - f13;
                            } else {
                                f8 = f11;
                                f9 = f8;
                            }
                            rh5 rh5Var = (rh5) vh5Var2;
                            path.rCubicTo(f8, f9, rh5Var.c, rh5Var.d, rh5Var.e, rh5Var.f);
                            f3 = rh5Var.c + f14;
                            f4 = rh5Var.d + f15;
                            f14 += rh5Var.e;
                            f10 = rh5Var.f;
                        } else if (vh5Var2 instanceof jh5) {
                            if (vh5Var.a) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            jh5 jh5Var = (jh5) vh5Var2;
                            path.cubicTo(f14, f15, jh5Var.c, jh5Var.d, jh5Var.e, jh5Var.f);
                            f3 = jh5Var.c;
                            f5 = jh5Var.d;
                            f6 = jh5Var.e;
                            f7 = jh5Var.f;
                        } else if (vh5Var2 instanceof qh5) {
                            qh5 qh5Var = (qh5) vh5Var2;
                            float f30 = qh5Var.f;
                            float f31 = qh5Var.e;
                            float f32 = qh5Var.d;
                            float f33 = qh5Var.c;
                            path.rQuadTo(f33, f32, f31, f30);
                            float f34 = f33 + f14;
                            float f35 = f32 + f15;
                            f14 += f31;
                            f15 += f30;
                            f12 = f34;
                            f13 = f35;
                        } else if (vh5Var2 instanceof ih5) {
                            ih5 ih5Var = (ih5) vh5Var2;
                            float f36 = ih5Var.f;
                            float f37 = ih5Var.e;
                            float f38 = ih5Var.d;
                            f3 = ih5Var.c;
                            path.quadTo(f3, f38, f37, f36);
                            f15 = f36;
                            f14 = f37;
                            f13 = f38;
                            f12 = f3;
                        } else if (vh5Var2 instanceof sh5) {
                            if (vh5Var.b) {
                                f = f14 - f12;
                                f2 = f15 - f13;
                            } else {
                                f = f11;
                                f2 = f;
                            }
                            sh5 sh5Var = (sh5) vh5Var2;
                            float f39 = sh5Var.d;
                            float f40 = sh5Var.c;
                            path.rQuadTo(f, f2, f40, f39);
                            f3 = f + f14;
                            f4 = f2 + f15;
                            f14 += f40;
                            f15 += f39;
                            f13 = f4;
                            f12 = f3;
                        } else if (vh5Var2 instanceof kh5) {
                            if (vh5Var.b) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            kh5 kh5Var = (kh5) vh5Var2;
                            float f41 = kh5Var.d;
                            float f42 = kh5Var.c;
                            path.quadTo(f14, f15, f42, f41);
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            f13 = f15;
                            vh5Var2 = vh5Var2;
                            f15 = f41;
                            f12 = f14;
                            f14 = f42;
                        } else if (vh5Var2 instanceof lh5) {
                            lh5 lh5Var = (lh5) vh5Var2;
                            float f43 = lh5Var.h + f14;
                            float f44 = lh5Var.i + f15;
                            size = size;
                            f11 = 0.0f;
                            path = path;
                            i = i;
                            n(rjVar, f14, f15, f43, f44, lh5Var.c, lh5Var.d, lh5Var.e, lh5Var.f, lh5Var.g);
                            f12 = f43;
                            f14 = f12;
                            f13 = f44;
                            f15 = f13;
                            vh5Var2 = vh5Var2;
                        } else {
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            if (!(vh5Var2 instanceof ch5)) {
                                gk0.s();
                                return;
                            }
                            ch5 ch5Var = (ch5) vh5Var2;
                            float f45 = ch5Var.i;
                            float f46 = ch5Var.h;
                            vh5Var2 = vh5Var2;
                            n(rjVar, f14, f15, f46, f45, ch5Var.c, ch5Var.d, ch5Var.e, ch5Var.f, ch5Var.g);
                            f13 = f45;
                            f15 = f13;
                            f12 = f46;
                            f14 = f12;
                        }
                        path = path;
                        f14 = f6;
                        f15 = f7;
                        f13 = f5;
                        f12 = f3;
                    }
                    f15 += f10;
                    f13 = f4;
                    f12 = f3;
                }
                vh5Var2 = vh5Var2;
            }
            i++;
            list2 = list;
            rjVar2 = rjVar;
            size = size;
            path = path;
            vh5Var = vh5Var2;
            f11 = f11;
        }
    }

    public static String W(long j) {
        return to7.j(j, "PointerId(value=", ")");
    }

    public static final void X(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            ni3.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        ni3.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void a(t94 t94Var, ux2 ux2Var, int i) {
        ux2Var.Y(1449439592);
        int i2 = (ux2Var.f(t94Var) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarB = ka0.B(iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(8.0f)), 16.0f);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            ua0.a(au8.r(iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a(8.0f)), t94Var, null, 6), ux2Var, 0);
            fs4 fs4VarF = ka0.F(cs4Var, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarF);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            ua0.a(au8.r(iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 144.0f), 16.0f), sf6.a(8.0f)), t94Var, null, 6), ux2Var, 0);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 8.0f));
            ua0.a(au8.r(iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 220.0f), 14.0f), sf6.a(8.0f)), t94Var, null, 6), ux2Var, 0);
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t0((byte) 20, i, t94Var);
        }
    }

    public static final void b(fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(-103045);
        int i2 = (i & 6) == 0 ? (ux2Var.f(fs4Var) ? 4 : 2) | i : i;
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            h72 h72Var = un4.a;
            List listL = qf0.L(new rv0(((rn4) ux2Var.j(h72Var)).a.B), new rv0(((rn4) ux2Var.j(h72Var)).a.r), new rv0(((rn4) ux2Var.j(h72Var)).a.B));
            rh3 rh3VarK = nv1.k(nv1.G("shimmer", ux2Var, 0), 0.0f, 1000.0f, db8.J(db8.I0(1200, 2, q72.c), 4), "deviceInfoConnectionMethodsShimmer", ux2Var, 29112, 0);
            float fFloatValue = ((Number) rh3VarK.f1923o.getValue()).floatValue();
            bg5 bg5Var = rh3VarK.f1923o;
            t94 t94Var = new t94(listL, null, (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32), (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) << 32) | (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) & 4294967295L), 0);
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, "TVTA-devicesScreen-deviceInfoScreen-connectionMethods-shimmer");
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            lv1.A(0, m77.z(R.string.other_connection_methods_title, ux2Var), ux2Var, null);
            ux2Var.W(725769663);
            for (int i3 = 0; i3 < 2; i3++) {
                a(t94Var, ux2Var, 0);
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta0(fs4Var, i, b2);
        }
    }

    public static final void c(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(1831371708);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            str2 = "TVTA-settings-eula";
            x37.e(new sk7(y57.g(R.string.tv_options_EULA), null, new yk7(R.drawable.document_checkmark), null, 26), fs4Var, null, function0, "TVTA-settings-eula", ux2Var, ((i2 << 9) & 7168) | (i2 & 112) | 24576, 36);
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(function0, fs4Var, str2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    public static final void d(Function0 function0, Function0 function1, boolean z, Function1 function2, fs4 fs4Var, d13 d13Var, ux2 ux2Var, int i, int i2) {
        int i3;
        d13 d13Var2;
        int i4;
        d13 d13Var3;
        fs4 fs4Var2;
        int i5;
        d13 d13Var4 = d13Var;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var2.Y(694608633);
        if ((i & 6) == 0) {
            i3 = (ux2Var2.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var2.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var2.h(function2) ? 2048 : 1024;
        }
        int i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i5 = 65536;
            } else {
                if ((262144 & i) == 0 ? ux2Var2.f(d13Var4) : ux2Var2.h(d13Var4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
            }
            i6 |= i5;
        }
        if (ux2Var2.N(i6 & 1, (74899 & i6) != 74898)) {
            ux2Var2.S();
            int i7 = i & 1;
            cs4 cs4Var = cs4.b;
            if (i7 == 0 || ux2Var2.x()) {
                if ((i2 & 32) != 0) {
                    d13Var4 = new d13(32.0f, R.drawable.ic_drop_down_menu, ((rn4) ux2Var2.j(un4.a)).a.s);
                    i6 &= -458753;
                }
                i4 = i6;
                d13Var3 = d13Var4;
                fs4Var2 = cs4Var;
            } else {
                ux2Var2.Q();
                if ((i2 & 32) != 0) {
                    i6 &= -458753;
                }
                i4 = i6;
                d13Var3 = d13Var4;
                fs4Var2 = fs4Var;
            }
            ux2Var2.q();
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var2);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var, d13Var3.c), "TVTA-devicesScreen-groupsList-moreActionsButton");
            int i8 = i4 & 7168;
            boolean z2 = i8 == 2048;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                objK = new qv1(function2, (byte) 10);
                ux2Var2.g0(objK);
            }
            d13 d13Var5 = d13Var3;
            int i9 = i4;
            fs4Var = fs4Var2;
            xo1.k((Function0) objK, fs4VarA, false, null, null, au8.O(1405943509, new t0(d13Var3, (byte) 25), ux2Var2), ux2Var2, 1572864, 60);
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new ji2((byte) 9);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarA2 = cp6.a(cs4Var, false, (Function1) objK2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-12.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long j = ((rn4) ux2Var2.j(un4.a)).a.p;
            boolean z3 = i8 == 2048;
            Object objK3 = ux2Var2.K();
            if (z3 || objK3 == awVar) {
                objK3 = new qv1(function2, (byte) 11);
                ux2Var2.g0(objK3);
            }
            jj.a(z, (Function0) objK3, fs4VarA2, jFloatToRawIntBits, null, null, null, j, 0.0f, au8.O(1913290990, new c91(function2, function0, function1), ux2Var2), ux2Var, ((i9 >> 6) & 14) | 3072, 1904);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            d13Var2 = d13Var5;
        } else {
            ux2Var2.Q();
            d13Var2 = d13Var4;
        }
        fs4 fs4Var3 = fs4Var;
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new w4(function0, function1, z, function2, fs4Var3, d13Var2, i, i2);
        }
    }

    public static final zk3 e(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new zk3(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void f(Function0 function0, fs4 fs4Var, x34 x34Var, n44 n44Var, ux2 ux2Var, int i) {
        ux2Var.Y(1055276397);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | (ux2Var.f(x34Var) ? 256 : 128) | (ux2Var.f(n44Var) ? 2048 : 1024);
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            et1.e(au8.O(-933153643, new q34(x34Var, fs4Var, n44Var, h57.t(function0, ux2Var), (byte) 0), ux2Var), ux2Var, 6);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) function0, fs4Var, (Object) x34Var, (Object) n44Var, i, (byte) 10);
        }
    }

    public static final void g(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(1449868412);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        byte b2 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            yy0 yy0VarO = au8.O(-1858381004, new z10((Context) ux2Var.j(lh.b), function0, b2), ux2Var);
            yy0 yy0VarO2 = au8.O(-1349602190, new v4(function0, (byte) 25), ux2Var);
            yy0 yy0Var = di1.k;
            yy0 yy0Var2 = di1.l;
            int i4 = (i3 & 14) | 1772976;
            fs4Var2 = cs4.b;
            uf0.b(function0, yy0VarO, fs4Var2, yy0VarO2, yy0Var, yy0Var2, null, 0L, 0L, 0L, 0L, null, ux2Var, i4, 0, 16272);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a20(function0, fs4Var2, i, (byte) 3);
        }
    }

    public static final void h(fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1462921666);
        if (ux2Var2.N(i & 1, (i & 3) != 2)) {
            w50 w50Var = xz2.B;
            fs4 fs4VarB = ka0.B(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 24.0f);
            kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarB);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strZ = m77.z(R.string.search_placeholder_title, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.h, ux2Var, 0, 0, 130042);
            qs7.b(m77.z(R.string.search_placeholder_subtitle, ux2Var), null, ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 0, 130042);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final fp6 i(LayoutNode layoutNode, boolean z) {
        es4 es4Var = (es4) layoutNode.S.g;
        um1 um1Var = null;
        if ((es4Var.p & 8) != 0) {
            loop0: while (es4Var != null) {
                if ((es4Var.f737o & 8) == 0) {
                    if ((es4Var.p & 8) != 0) {
                        break;
                        break;
                    }
                    es4Var = es4Var.r;
                } else {
                    es4 es4VarL0 = es4Var;
                    xx4 xx4Var = null;
                    while (es4VarL0 != null) {
                        if (es4VarL0 instanceof dp6) {
                            um1Var = es4VarL0;
                            break loop0;
                        }
                        if ((es4VarL0.f737o & 8) != 0 && (es4VarL0 instanceof vm1)) {
                            int i = 0;
                            for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                if ((es4Var2.f737o & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        es4VarL0 = es4Var2;
                                    } else {
                                        if (xx4Var == null) {
                                            xx4Var = new xx4(new es4[16]);
                                        }
                                        if (es4VarL0 != null) {
                                            xx4Var.b(es4VarL0);
                                            es4VarL0 = null;
                                        }
                                        xx4Var.b(es4Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        es4VarL0 = vn4.l0(xx4Var);
                    }
                    if ((es4Var.p & 8) != 0) {
                        break;
                    }
                    es4Var = es4Var.r;
                }
            }
        }
        um1Var.getClass();
        es4 es4Var3 = ((es4) ((dp6) um1Var)).m;
        ap6 ap6VarH = layoutNode.H();
        if (ap6VarH == null) {
            ap6VarH = new ap6();
        }
        return new fp6(es4Var3, z, layoutNode, ap6VarH);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(x84 x84Var, jc1 jc1Var) throws Throwable {
        d94 d94Var;
        x84 x84Var2;
        k76 k76Var;
        Throwable th;
        u84 u84Var;
        u84 u84Var2;
        if (jc1Var instanceof d94) {
            d94Var = (d94) jc1Var;
            int i = d94Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                d94Var.p = i - Integer.MIN_VALUE;
            } else {
                d94Var = new d94(jc1Var);
            }
        } else {
            d94Var = new d94(jc1Var);
        }
        Object obj = d94Var.f599o;
        int i2 = d94Var.p;
        f88 f88Var = f88.a;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k76Var = d94Var.n;
            x84Var2 = d94Var.m;
            try {
                ct1.a0(obj);
                u84Var2 = (u84) k76Var.m;
                if (u84Var2 != null) {
                    x84Var2.f(u84Var2);
                }
                return f88Var;
            } catch (Throwable th2) {
                th = th2;
                u84Var = (u84) k76Var.m;
                if (u84Var != null) {
                    x84Var2.f(u84Var);
                }
                throw th;
            }
        }
        ct1.a0(obj);
        if (x84Var.i.compareTo(m84.p) >= 0) {
            return f88Var;
        }
        k76 k76Var2 = new k76();
        try {
            d94Var.m = x84Var;
            d94Var.n = k76Var2;
            d94Var.p = 1;
            gl0 gl0Var = new gl0(1, vt1.A(d94Var));
            gl0Var.t();
            e94 e94Var = new e94(gl0Var);
            k76Var2.m = e94Var;
            x84Var.a(e94Var);
            Object objQ = gl0Var.q();
            ne1 ne1Var = ne1.m;
            if (objQ == ne1Var) {
                return ne1Var;
            }
            x84Var2 = x84Var;
            k76Var = k76Var2;
            u84Var2 = (u84) k76Var.m;
            if (u84Var2 != null) {
                x84Var2.f(u84Var2);
            }
            return f88Var;
        } catch (Throwable th3) {
            x84Var2 = x84Var;
            k76Var = k76Var2;
            th = th3;
            u84Var = (u84) k76Var.m;
            if (u84Var != null) {
                x84Var2.f(u84Var);
            }
            throw th;
        }
    }

    public static ns0 k(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            js0 js0VarA = p76.a(cls);
            String str = mo3.a;
            js0 js0VarF = mo3.f(js0VarA.a());
            if (js0VarF != null) {
                js0VarA = js0VarF;
            }
            return new ns0(js0VarA, i);
        }
        if (cls.equals(Void.TYPE)) {
            ht2 ht2VarG = s87.d.g();
            ht2 ht2VarE = ht2VarG.e();
            sy4 sy4VarF = ht2VarG.f();
            sy4VarF.getClass();
            return new ns0(new js0(ht2VarE, sy4VarF), i);
        }
        ps5 ps5VarC = ts3.b(cls.getName()).c();
        ps5VarC.getClass();
        if (i > 0) {
            ht2 ht2Var = (ht2) ps5VarC.p.getValue();
            ht2Var.getClass();
            ht2 ht2VarE2 = ht2Var.e();
            sy4 sy4VarF2 = ht2Var.f();
            sy4VarF2.getClass();
            return new ns0(new js0(ht2VarE2, sy4VarF2), i - 1);
        }
        ht2 ht2Var2 = (ht2) ps5VarC.f1771o.getValue();
        ht2Var2.getClass();
        ht2 ht2VarE3 = ht2Var2.e();
        sy4 sy4VarF3 = ht2Var2.f();
        sy4VarF3.getClass();
        return new ns0(new js0(ht2VarE3, sy4VarF3), i);
    }

    public static int l(int i, int i2) {
        int i3 = i - i2;
        if (i3 <= i2) {
            i3 = i2;
            i2 = i3;
        }
        int i4 = 1;
        int i5 = 1;
        while (i > i3) {
            i4 *= i;
            if (i5 <= i2) {
                i4 /= i5;
                i5++;
            }
            i--;
        }
        while (i5 <= i2) {
            i4 /= i5;
            i5++;
        }
        return i4;
    }

    public static final int m(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return vn4.s0((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    public static final void n(rj rjVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            n(rjVar, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan3 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan3 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i = 0;
        double d39 = d35;
        double d40 = d3;
        while (i < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i2 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            rjVar.a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            dSin2 = dSin2;
            d27 = d27;
            d2 = d42;
            i++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i2;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final boolean o(long j, long j2) {
        return j == j2;
    }

    public static final float p(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final ns4 q(ps4 ps4Var, js0 js0Var) {
        ps4Var.getClass();
        js0Var.getClass();
        ys0 ys0VarR = r(ps4Var, js0Var);
        if (ys0VarR instanceof ns4) {
            return (ns4) ys0VarR;
        }
        return null;
    }

    public static final ys0 r(ps4 ps4Var, js0 js0Var) {
        ps4Var.getClass();
        js0Var.getClass();
        if (ps4Var.L(ka0.u) != null) {
            io.sentry.h2.f();
            return null;
        }
        b54 b54VarY = ps4Var.y(js0Var.a);
        List listE = js0Var.b.a.e();
        d54 d54Var = b54VarY.s;
        Object objM0 = lv0.m0(listE);
        objM0.getClass();
        t35 t35Var = t35.s;
        ys0 ys0VarG = d54Var.g((sy4) objM0, t35Var);
        if (ys0VarG != null) {
            for (sy4 sy4Var : listE.subList(1, listE.size())) {
                if (ys0VarG instanceof ns4) {
                    zo4 zo4VarR0 = ((ns4) ys0VarG).r0();
                    sy4Var.getClass();
                    ys0 ys0VarG2 = zo4VarR0.g(sy4Var, t35Var);
                    ys0VarG = ys0VarG2 instanceof ns4 ? (ns4) ys0VarG2 : null;
                    if (ys0VarG != null) {
                    }
                }
            }
            return ys0VarG;
        }
        return null;
    }

    public static final r86 s(f71 f71Var, js0 js0Var, ps3 ps3Var) {
        js0Var.getClass();
        ps3Var.getClass();
        String strReplace = js0Var.b.b().replace('.', '$');
        strReplace.getClass();
        ht2 ht2Var = js0Var.a;
        if (!ht2Var.d()) {
            strReplace = ht2Var + '.' + strReplace;
        }
        nx3 nx3VarB = f71Var.b(strReplace);
        if (nx3VarB != null) {
            return (r86) nx3VarB.n;
        }
        return null;
    }

    public static final ns4 t(ps4 ps4Var, js0 js0Var, j93 j93Var) {
        ps4Var.getClass();
        js0Var.getClass();
        j93Var.getClass();
        ns4 ns4VarQ = q(ps4Var, js0Var);
        return ns4VarQ != null ? ns4VarQ : j93Var.P(js0Var, bq6.l0(new h18(bq6.h0(js0Var, hl2.m), ek.H)));
    }

    public static final String u(String str, String str2, int i, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !ub7.b0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !ub7.b0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static String w(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case ep1.b /* 9 */:
                    break;
                case ep1.c /* 10 */:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case ep1.d /* 12 */:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    io.sentry.android.core.v0.c("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static String x() throws Throwable {
        BufferedReader bufferedReader;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        int iMyPid = b;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            b = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        if (iMyPid > 0) {
            try {
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                    sb.append("/proc/");
                    sb.append(iMyPid);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new io.sentry.instrumentation.file.i(new io.sentry.instrumentation.file.f(io.sentry.instrumentation.file.f.e(new File(string), null))));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader.readLine();
                            nv1.s(line);
                            strTrim = line.trim();
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                            }
                            a = strTrim;
                            return strTrim;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
        a = strTrim;
        return strTrim;
    }

    public static int z(int[] iArr, int i, boolean z) {
        boolean z2;
        int[] iArr2 = iArr;
        int i2 = 0;
        for (int i3 : iArr2) {
            i2 += i3;
        }
        int length = iArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = length - 1;
            if (i4 >= i7) {
                return i5;
            }
            int i8 = 1 << i4;
            i6 |= i8;
            int i9 = 1;
            while (i9 < iArr2[i4]) {
                int i10 = i2 - i9;
                int i11 = length - i4;
                int i12 = i11 - 2;
                int iL = l(i10 - 1, i12);
                if (z && i6 == 0) {
                    int i13 = i11 - 1;
                    if (i10 - i13 >= i13) {
                        iL -= l(i10 - i11, i12);
                    }
                }
                boolean z3 = true;
                if (i11 - 1 > 1) {
                    int i14 = i10 - i12;
                    int iL2 = 0;
                    while (i14 > i) {
                        iL2 += l((i10 - i14) - 1, i11 - 3);
                        i14--;
                        z3 = z3;
                    }
                    z2 = z3;
                    iL -= (i7 - i4) * iL2;
                } else {
                    z2 = true;
                    if (i10 > i) {
                        iL--;
                    }
                }
                i5 += iL;
                i9++;
                i6 &= ~i8;
                iArr2 = iArr;
            }
            i2 -= i9;
            i4++;
            iArr2 = iArr;
        }
    }

    public abstract ka0 A();

    public boolean F() {
        return true;
    }

    public abstract v56 v();

    public abstract Function0 y();
}
