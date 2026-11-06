package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IStartChatUIModelAndroid;
import com.teamviewer.remotecontrollib.swig.CommercialUseViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class im3 {
    public static final hr2 A;
    public static final hr2 B;
    public static final Type[] C;
    public static boolean D = true;
    public static final yy0 a = new yy0(-1999741299, false, new p20(4));
    public static final yy0 b = new yy0(-1952047285, false, new p20(5));
    public static final yy0 c = new yy0(37419045, false, new zy0(23));
    public static final yy0 d = new yy0(635354302, false, new bz0(27));
    public static final yy0 e = new yy0(942785281, false, new bz0(28));
    public static final yy0 f = new yy0(-1936082763, false, new bz0(29));
    public static final yy0 g = new yy0(1447311928, false, new fz0(0));
    public static final yy0 h = new yy0(-1086848986, false, new gz0(3));
    public static final yy0 i = new yy0(-860079153, false, new gz0(18));
    public static final yy0 j = new yy0(-1646077043, false, new gz0(19));
    public static final yy0 k = new yy0(-305746202, false, new iz0(7));
    public static final yy0 l = new yy0(-698745147, false, new iz0(8));
    public static final char[] m;
    public static final o48 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f1077o;
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public static final String[] v;
    public static final String[] w;
    public static final String[] x;
    public static final hk y;
    public static final fq6[] z;

    static {
        new yy0(249658108, false, new iz0((byte) 9));
        m = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};
        n = new o48((byte) 16);
        f1077o = new String[]{"applet", "caption", "html", "marquee", "object", "select", "table", "td", "template", "th"};
        p = new String[]{"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
        q = new String[]{"desc", "foreignobject", "title"};
        r = new String[]{"ol", "ul"};
        s = new String[]{"button"};
        t = new String[]{"html", "table", "template"};
        u = new String[]{"optgroup", "option"};
        v = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
        w = new String[]{"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        x = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
        y = new hk((byte) 4);
        z = new fq6[0];
        byte b2 = 14;
        A = new hr2("NONE", b2);
        B = new hr2("PENDING", b2);
        C = new Type[0];
    }

    public static final Object A(long j2, hc1 hc1Var) {
        if (j2 > 0) {
            gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
            gl0Var.t();
            if (j2 < Long.MAX_VALUE) {
                E(gl0Var.q).J(j2, gl0Var);
            }
            Object objQ = gl0Var.q();
            if (objQ == ne1.m) {
                return objQ;
            }
        }
        return f88.a;
    }

    public static final Object B(long j2, jc1 jc1Var) {
        Object objA = A(g0(j2), jc1Var);
        return objA == ne1.m ? objA : f88.a;
    }

    public static boolean C(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return C(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static js0 D(String str, boolean z2) {
        String strL;
        str.getClass();
        int iY = ub7.Y(str, '`', 0, 6);
        if (iY == -1) {
            iY = str.length();
        }
        int iE0 = ub7.e0(str, iY, 4, "/");
        String str2 = "";
        if (iE0 == -1) {
            strL = bc7.L(str, "`", "");
        } else {
            String strReplace = str.substring(0, iE0).replace('/', '.');
            strReplace.getClass();
            strL = bc7.L(str.substring(iE0 + 1), "`", "");
            str2 = strReplace;
        }
        return new js0(new ht2(str2), new ht2(strL), z2);
    }

    public static final nm1 E(de1 de1Var) {
        be1 be1VarL0 = de1Var.l0(d82.y);
        nm1 nm1Var = be1VarL0 instanceof nm1 ? (nm1) be1VarL0 : null;
        return nm1Var == null ? xj1.a : nm1Var;
    }

    public static Type F(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return F(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return F(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final gl0 G(hc1 hc1Var) {
        Unsafe unsafe;
        gl0 gl0Var;
        gl0 gl0Var2;
        if (!(hc1Var instanceof a22)) {
            return new gl0(1, hc1Var);
        }
        a22 a22Var = (a22) hc1Var;
        hr2 hr2Var = ga0.t;
        long j2 = a22.t;
        loop0: while (true) {
            unsafe = defpackage.a.a;
            Object objectVolatile = unsafe.getObjectVolatile(a22Var, j2);
            gl0Var = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(a22Var, j2, hr2Var);
                gl0Var2 = null;
                break;
            }
            if (objectVolatile instanceof gl0) {
                do {
                    unsafe = defpackage.a.a;
                    if (unsafe.compareAndSwapObject(a22Var, a22.t, objectVolatile, hr2Var)) {
                        gl0Var2 = (gl0) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(a22Var, j2) == objectVolatile);
            } else if (objectVolatile != hr2Var && !(objectVolatile instanceof Throwable)) {
                hk0.f(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (gl0Var2 != null) {
            long j3 = gl0.t;
            Object objectVolatile2 = unsafe.getObjectVolatile(gl0Var2, j3);
            if (!(objectVolatile2 instanceof vx0) || ((vx0) objectVolatile2).d == null) {
                unsafe.putIntVolatile(gl0Var2, gl0.r, 536870911);
                unsafe.putObjectVolatile(gl0Var2, j3, r7.m);
                gl0Var = gl0Var2;
            } else {
                gl0Var2.m();
            }
            if (gl0Var != null) {
                return gl0Var;
            }
        }
        return new gl0(2, hc1Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public static byte[] H(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigest;
        PackageInfo packageInfo = xn8.a(context).a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfo.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfo.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static Type I(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbK = fx3.k(i2, "Index ", " not in range [0,");
        sbK.append(actualTypeArguments.length);
        sbK.append(") for ");
        sbK.append(parameterizedType);
        throw new IllegalArgumentException(sbK.toString());
    }

    public static final bp4 J(qv5 qv5Var, ty4 ty4Var, d22 d22Var, boolean z2, boolean z3, boolean z4) {
        ty4Var.getClass();
        my2 my2Var = jt3.d;
        my2Var.getClass();
        dt3 dt3Var = (dt3) it1.C(qv5Var, my2Var);
        if (dt3Var != null) {
            if (z2) {
                dg2 dg2Var = kt3.a;
                ns3 ns3VarB = kt3.b(qv5Var, ty4Var, d22Var, z4);
                if (ns3VarB != null) {
                    return lv1.J(ns3VarB);
                }
            } else if (z3 && (dt3Var.n & 2) == 2) {
                bt3 bt3Var = dt3Var.p;
                bt3Var.getClass();
                return new bp4(ty4Var.getString(bt3Var.f453o).concat(ty4Var.getString(bt3Var.p)));
            }
        }
        return null;
    }

    public static Class L(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            yq4.f();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) L(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return L(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        an4.o(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type M(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return X(type, cls, F(type, cls, Map.class));
        }
        yq4.f();
        return null;
    }

    public static boolean N(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return N(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            yq4.s("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (N(type2)) {
                return true;
            }
        }
        return false;
    }

    public static final int O(ax axVar, Object obj, int i2) {
        int i3 = axVar.f369o;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iS = j51.s(i3, i2, axVar.m);
            if (iS < 0 || n(obj, axVar.n[iS])) {
                return iS;
            }
            int i4 = iS + 1;
            while (i4 < i3 && axVar.m[i4] == i2) {
                if (n(obj, axVar.n[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iS - 1; i5 >= 0 && axVar.m[i5] == i2; i5--) {
                if (n(obj, axVar.n[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            gk0.c();
            return 0;
        }
    }

    public static boolean P(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static final n87 Q(me1 me1Var, de1 de1Var, pe1 pe1Var, hw2 hw2Var) {
        de1 de1VarM = j51.M(me1Var, de1Var);
        pe1Var.getClass();
        n87 e54Var = pe1Var == pe1.n ? new e54(de1VarM, hw2Var) : new n87(de1VarM, true);
        e54Var.e0(pe1Var, e54Var, hw2Var);
        return e54Var;
    }

    public static n87 R(me1 me1Var, de1 de1Var, pe1 pe1Var, hw2 hw2Var, int i2) {
        if ((i2 & 1) != 0) {
            de1Var = ba2.m;
        }
        if ((i2 & 2) != 0) {
            pe1Var = pe1.m;
        }
        return Q(me1Var, de1Var, pe1Var, hw2Var);
    }

    public static IllegalArgumentException S(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static final fs4 T(u15 u15Var, x15 x15Var) {
        return new y15(u15Var, x15Var);
    }

    public static IllegalArgumentException U(Method method, int i2, String str, Object... objArr) {
        return S(method, null, to7.k(str, " (", pl5.b.f(method, i2), ")"), objArr);
    }

    public static IllegalArgumentException V(Method method, Exception exc, int i2, String str, Object... objArr) {
        return S(method, exc, to7.k(str, " (", pl5.b.f(method, i2), ")"), objArr);
    }

    public static final hk6 W(ux2 ux2Var) {
        Object[] objArr = new Object[0];
        boolean zD = ux2Var.d(0);
        Object objK = ux2Var.K();
        if (zD || objK == e01.a) {
            objK = new w26((byte) 14);
            ux2Var.g0(objK);
        }
        return (hk6) zu1.O(objArr, hk6.k, (Function0) objK, ux2Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type X(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeX;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i2 = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeX2 = X(type, cls, componentType);
                        return componentType == typeX2 ? cls2 : new qa8(typeX2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeX3 = X(type, cls, genericComponentType);
                    return genericComponentType == typeX3 ? genericArrayType : new qa8(typeX3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeX4 = X(type, cls, ownerType);
                    boolean z2 = typeX4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type typeX5 = X(type, cls, actualTypeArguments[i2]);
                        if (typeX5 != actualTypeArguments[i2]) {
                            if (!z2) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z2 = true;
                            }
                            actualTypeArguments[i2] = typeX5;
                        }
                        i2++;
                    }
                    return z2 ? new ra8(typeX4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeX6 = X(type, cls, lowerBounds[0]);
                        if (typeX6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new sa8(new Type[]{Object.class}, new Type[]{typeX6});
                        }
                    } else if (upperBounds.length == 1 && (typeX = X(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new sa8(new Type[]{typeX}, C);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeF = F(type, cls, cls3);
                if (typeF instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i2 >= typeParameters.length) {
                            yq4.p();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type4 = ((ParameterizedType) typeF).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static void Y(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static fs4 Z(fs4 fs4Var, hk6 hk6Var, boolean z2) {
        gb5 gb5Var = gb5.m;
        gb5 gb5Var2 = z2 ? gb5Var : gb5.n;
        mw4 mw4Var = hk6Var.e;
        cs4 cs4Var = cs4.b;
        return fs4Var.f(gb5Var2 == gb5Var ? iq8.j(cs4Var, pr0.d) : iq8.j(cs4Var, pr0.c)).f(new ik6(null, null, null, mw4Var, gb5Var2, hk6Var, true, true)).f(new ScrollingLayoutElement(hk6Var, z2));
    }

    public static final void a(Object obj, fs4 fs4Var, Function1 function1, he heVar, String str, Function1 function2, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        Function1 function3;
        ux2Var.Y(1501828832);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ux2Var.f(obj) : ux2Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(function1) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= ux2Var.f(str) ? 16384 : 8192;
        }
        int i6 = i5 | 196608;
        if ((1572864 & i2) == 0) {
            i6 |= ux2Var.h(yy0Var) ? 1048576 : 524288;
        }
        if (ux2Var.N(i6 & 1, (599187 & i6) != 599186)) {
            heVar = xz2.f2564o;
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = zm.f2717o;
                ux2Var.g0(objK);
            }
            Function1 function4 = (Function1) objK;
            u18 u18VarY0 = ck3.y0(obj, str, ux2Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
            int i7 = i6 & 8176;
            int i8 = i6 >> 3;
            b(u18VarY0, function1, function4, yy0Var, ux2Var, i7 | (57344 & i8) | (i8 & 458752));
            fs4Var = cs4.b;
            function3 = function4;
        } else {
            ux2Var.Q();
            function3 = function2;
        }
        fs4 fs4Var2 = fs4Var;
        he heVar2 = heVar;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new an(obj, fs4Var2, function1, heVar2, str, function3, yy0Var, i2);
        }
    }

    public static final Object a0(br2 br2Var, int i2, Function1 function1) {
        int i3;
        int i4;
        Object objInvoke;
        es4 es4VarL0;
        e34 e34VarY0;
        int i5;
        nf nfVar;
        if (!br2Var.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var = br2Var.m.q;
        LayoutNode layoutNodeP0 = vn4.p0(br2Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objInvoke = null;
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
                                int i6 = 0;
                                for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                    if ((es4Var2.f737o & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
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
        if ((br2Var2 == null || !n(br2Var2.Y0(), br2Var.Y0())) && (e34VarY0 = br2Var.Y0()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i7 = 2;
                            } else if (i2 == 2) {
                                i7 = 1;
                            } else {
                                hk0.l("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (e34VarY0.A.a.j().f1627o <= 0 || e34VarY0.A.a.j().l.isEmpty() || !e34VarY0.z) {
                return function1.invoke(e34.D);
            }
            boolean zV0 = e34VarY0.V0(i7);
            g44 g44Var = e34VarY0.A;
            int iMin = zV0 ? Math.min(g44Var.a.j().f1627o - 1, ((p44) lv0.v0(g44Var.a.j().l)).a) : Math.max(0, g44Var.a.h());
            k76 k76Var = new k76();
            eb0 eb0Var = e34VarY0.B;
            eb0Var.getClass();
            a34 a34Var = new a34(iMin, iMin);
            eb0Var.a.b(a34Var);
            k76Var.m = a34Var;
            w44 w44Var = e34VarY0.A.a;
            if (w44Var.j().l.isEmpty()) {
                i4 = 0;
            } else {
                o44 o44VarJ = w44Var.j();
                int i8 = (int) (o44VarJ.p == gb5.m ? o44VarJ.i() & 4294967295L : o44VarJ.i() >> 32);
                int iD0 = ct1.d0(w44Var.j());
                if (iD0 != 0 && (i5 = i8 / iD0) >= 1) {
                    i4 = i5;
                }
            }
            int i9 = i4 * 2;
            int i10 = e34VarY0.A.a.j().f1627o;
            if (i9 > i10) {
                i9 = i10;
            }
            while (objInvoke == null && e34VarY0.U0((a34) k76Var.m, i7) && i3 < i9) {
                a34 a34Var2 = (a34) k76Var.m;
                int i11 = a34Var2.a;
                int i12 = a34Var2.b;
                if (e34VarY0.V0(i7)) {
                    i12++;
                } else {
                    i11--;
                }
                eb0 eb0Var2 = e34VarY0.B;
                eb0Var2.getClass();
                a34 a34Var3 = new a34(i11, i12);
                eb0Var2.a.b(a34Var3);
                e34VarY0.B.a.j((a34) k76Var.m);
                k76Var.m = a34Var3;
                i3++;
                vn4.p0(e34VarY0).m();
                objInvoke = function1.invoke(new d34(e34VarY0, k76Var, i7));
            }
            e34VarY0.B.a.j((a34) k76Var.m);
            vn4.p0(e34VarY0).m();
            return objInvoke;
        }
        return null;
    }

    public static final void b(u18 u18Var, Function1 function1, Function1 function2, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        Object obj = xz2.f2564o;
        ux2Var.Y(511725103);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(u18Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        cs4 cs4Var = cs4.b;
        if (i4 == 0) {
            i3 |= ux2Var.f(cs4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(obj) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var.h(function2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 131072 : 65536;
        }
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = zm.p;
                ux2Var.g0(objK);
            }
            c(u18Var, cs4Var, function1, function2, (Function1) objK, yy0Var, ux2Var, ((i3 << 3) & 3670016) | 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bn(u18Var, function1, function2, yy0Var, i2);
        }
    }

    public static final void b0(Activity activity, String str, long j2, boolean z2, String str2, long j3) {
        Intent intent = new Intent(activity, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(335544320);
        intent.putExtra("KEY_ACCOUNTNAME", str);
        intent.putExtra("IS_SHORTCUT", z2);
        intent.putExtra("MEMBER_ID", j2);
        intent.putExtra("SHORTCUT_DYNGATE_ID", j3);
        intent.putExtra("MDV2_MANAGEMENT_ID", str2);
        activity.startActivity(intent);
    }

    public static final void c(u18 u18Var, fs4 fs4Var, Function1 function1, Function1 function2, Function1 function3, yy0 yy0Var, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        n18 n18Var;
        Object obj;
        jx4 jx4Var;
        j57 j57Var;
        n18 n18Var2;
        pn pnVar;
        j57 j57Var2;
        n18 n18VarY;
        ux2 ux2Var3;
        boolean z2;
        int i3;
        int i4;
        g2 g2Var = u18Var.a;
        y50 y50Var = xz2.f2564o;
        ux2Var.Y(1935038908);
        int i5 = (i2 & 6) == 0 ? (ux2Var.f(u18Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= ux2Var.f(y50Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= ux2Var.h(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= ux2Var.h(function3) ? 131072 : 65536;
        }
        yy0 yy0Var2 = yy0Var;
        if ((1572864 & i2) == 0) {
            i5 |= ux2Var.h(yy0Var2) ? 1048576 : 524288;
        }
        if (ux2Var.N(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z3 || objK == awVar) {
                objK = new pn(u18Var);
                ux2Var.g0(objK);
            }
            pn pnVar2 = (pn) objK;
            boolean z4 = i6 == 4;
            Object objK2 = ux2Var.K();
            Object obj2 = objK2;
            if (z4 || objK2 == awVar) {
                Object[] objArr = {g2Var.p0()};
                j57 j57Var3 = new j57();
                j57Var3.addAll(cx.g1(objArr));
                ux2Var.g0(j57Var3);
                obj2 = j57Var3;
            }
            j57 j57Var4 = (j57) obj2;
            bg5 bg5Var = u18Var.e;
            bg5 bg5Var2 = u18Var.d;
            boolean zF = ux2Var.f(bg5Var.getValue()) | (i6 == 4);
            Object objK3 = ux2Var.K();
            if (zF || objK3 == awVar) {
                long[] jArr = ti6.a;
                objK3 = new jx4();
                ux2Var.g0(objK3);
            }
            jx4 jx4Var2 = (jx4) objK3;
            if (!j57Var4.contains(g2Var.p0())) {
                j57Var4.clear();
                j57Var4.add(g2Var.p0());
            }
            if (n(g2Var.p0(), bg5Var2.getValue()) && bg5Var.getValue() == null) {
                if (j57Var4.size() != 1 || !n(j57Var4.get(0), g2Var.p0())) {
                    j57Var4.clear();
                    j57Var4.add(g2Var.p0());
                }
                if (jx4Var2.e != 1 || jx4Var2.c(g2Var.p0())) {
                    jx4Var2.a();
                }
                pnVar2.getClass();
            }
            Object value = bg5Var.getValue();
            if (value != null && !value.equals(g2Var.p0())) {
                ListIterator listIterator = j57Var4.listIterator();
                int i7 = 0;
                while (true) {
                    v53 v53Var = (v53) listIterator;
                    if (!v53Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (n(function2.invoke(v53Var.next()), function2.invoke(value))) {
                            i4 = i7;
                            break;
                        }
                        i7++;
                    }
                }
                if (i4 == -1) {
                    j57Var4.add(value);
                } else if (!n(j57Var4.get(i4), value)) {
                    j57Var4.set(i4, value);
                }
            }
            if (!n(g2Var.p0(), bg5Var2.getValue())) {
                ListIterator listIterator2 = j57Var4.listIterator();
                int i8 = 0;
                while (true) {
                    v53 v53Var2 = (v53) listIterator2;
                    if (!v53Var2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (n(function2.invoke(v53Var2.next()), function2.invoke(bg5Var2.getValue()))) {
                            i3 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                if (i3 == -1) {
                    j57Var4.add(bg5Var2.getValue());
                } else if (!n(j57Var4.get(i3), bg5Var2.getValue()) || i3 != j57Var4.size() - 1) {
                    n(bg5Var2.getValue(), j57Var4.get(i3));
                    j57Var4.remove(i3);
                    j57Var4.add(bg5Var2.getValue());
                }
            }
            Object value2 = bg5Var.getValue();
            boolean zF2 = ux2Var.f(value2);
            Object objK4 = ux2Var.K();
            if (zF2 || objK4 == awVar) {
                objK4 = value2 != null ? new ci5(pnVar2, bg5Var2.getValue(), value2) : null;
                ux2Var.g0(objK4);
            }
            ci5 ci5Var = (ci5) objK4;
            boolean zF3 = ux2Var.f(ci5Var) | ((i5 & 458752) == 131072);
            Object objK5 = ux2Var.K();
            if (!zF3 && objK5 != awVar) {
                obj = objK5;
                n18Var = null;
            } else if (ci5Var != null && function3.invoke(ci5Var) != null) {
                io.sentry.h2.f();
                return;
            } else {
                n18Var = null;
                ux2Var.g0(null);
                obj = null;
            }
            if (obj != null) {
                io.sentry.h2.f();
                return;
            }
            if (jx4Var2.b(bg5Var2.getValue()) && jx4Var2.b(g2Var.p0()) && (value2 == null || jx4Var2.b(value2))) {
                ux2Var.W(-297322234);
                ux2Var.p(false);
                jx4Var = jx4Var2;
                j57Var = j57Var4;
                n18Var2 = n18Var;
                pnVar = pnVar2;
            } else {
                ux2Var.W(-302069574);
                jx4Var2.a();
                int size = j57Var4.size();
                int i9 = 0;
                while (i9 < size) {
                    int i10 = size;
                    Object obj3 = j57Var4.get(i9);
                    jx4 jx4Var3 = jx4Var2;
                    pn pnVar3 = pnVar2;
                    j57 j57Var5 = j57Var4;
                    jx4Var3.m(obj3, au8.O(427839334, new gn(obj3, u18Var, ci5Var, function1, pnVar3, j57Var5, yy0Var2), ux2Var));
                    i9++;
                    j57Var4 = j57Var5;
                    jx4Var2 = jx4Var3;
                    pnVar2 = pnVar3;
                    size = i10;
                    n18Var = n18Var;
                    yy0Var2 = yy0Var;
                }
                j57 j57Var6 = j57Var4;
                jx4Var = jx4Var2;
                j57Var = j57Var6;
                n18Var2 = n18Var;
                pnVar = pnVar2;
                ux2Var.p(false);
            }
            boolean zF4 = ux2Var.f(u18Var.f()) | ux2Var.f(pnVar) | ux2Var.f(bg5Var.getValue());
            Object objK6 = ux2Var.K();
            if (zF4 || objK6 == awVar) {
                objK6 = (tb1) function1.invoke(pnVar);
                ux2Var.g0(objK6);
            }
            tb1 tb1Var = (tb1) objK6;
            u18 u18Var2 = pnVar.a;
            boolean zF5 = ux2Var.f(pnVar);
            Object objK7 = ux2Var.K();
            if (zF5 || objK7 == awVar) {
                objK7 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK7);
            }
            px4 px4Var = (px4) objK7;
            px4 px4VarT = h57.t(tb1Var.d, ux2Var);
            if (n(u18Var2.a.p0(), u18Var2.d.getValue())) {
                px4Var.setValue(Boolean.FALSE);
            } else if (px4VarT.getValue() != null) {
                px4Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
            fs4 fs4VarK = cs4.b;
            if (zBooleanValue) {
                ux2Var.W(1353077497);
                j57Var2 = j57Var;
                ux2 ux2Var4 = ux2Var;
                n18VarY = ck3.y(pnVar.a, vn4.q0, null, ux2Var4, 0, 2);
                boolean zF6 = ux2Var4.f(n18VarY);
                Object objK8 = ux2Var4.K();
                if (zF6 || objK8 == awVar) {
                    b17 b17Var = (b17) px4VarT.getValue();
                    if (b17Var == null || b17Var.a) {
                        fs4VarK = iq8.k(fs4VarK);
                    }
                    fs4 fs4Var2 = fs4VarK;
                    ux2Var4.g0(fs4Var2);
                    objK8 = fs4Var2;
                }
                fs4VarK = (fs4) objK8;
                ux2Var4.p(false);
                ux2Var3 = ux2Var4;
            } else {
                ux2 ux2Var5 = ux2Var;
                j57Var2 = j57Var;
                ux2Var5.W(1353343539);
                ux2Var5.p(false);
                n18VarY = n18Var2;
                ux2Var3 = ux2Var5;
            }
            fs4 fs4VarF = fs4Var.f(fs4VarK.f(new mn(n18VarY, px4VarT, pnVar)));
            Object objK9 = ux2Var3.K();
            if (objK9 == awVar) {
                objK9 = new in(pnVar);
                ux2Var3.g0(objK9);
            }
            in inVar = (in) objK9;
            int iHashCode = Long.hashCode(ux2Var3.T);
            yj5 yj5VarL = ux2Var3.l();
            fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF);
            yz0.c.getClass();
            ux2Var3.a0();
            if (ux2Var3.S) {
                ux2Var3.k(LayoutNode.e0);
            } else {
                ux2Var3.j0();
            }
            o67.n(inVar, d82.v, ux2Var3);
            o67.n(yj5VarL, d82.u, ux2Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var = d82.w;
            if (ux2Var3.S) {
                ux2Var3.b(numValueOf, iz0Var);
            }
            o67.l(ux2Var3);
            o67.n(fs4VarS, d82.t, ux2Var3);
            ux2Var3.W(758586195);
            int size2 = j57Var2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj4 = j57Var2.get(i11);
                ux2Var3.U(1420119555, function2.invoke(obj4));
                hw2 hw2Var = (hw2) jx4Var.g(obj4);
                if (hw2Var == null) {
                    ux2Var3.W(1074069702);
                    z2 = false;
                } else {
                    z2 = false;
                    ux2Var3.W(1420120731);
                    hw2Var.invoke(ux2Var3, 0);
                }
                ux2Var3.p(z2);
                ux2Var3.p(z2);
            }
            ux2Var3.p(false);
            ux2Var3.p(true);
            ux2Var2 = ux2Var3;
        } else {
            function1 = function1;
            ux2 ux2Var6 = ux2Var;
            ux2Var6.Q();
            ux2Var2 = ux2Var6;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new cn(u18Var, fs4Var, function1, function2, function3, yy0Var, i2);
        }
    }

    public static void c0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void d(int i2, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1323596956);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var.h(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            uf0.b(function1, au8.O(772223516, new v4(function0, b2), ux2Var), cs4Var, au8.O(-575910054, new v4(function1, (byte) 5), ux2Var), hm3.e, hm3.f, null, 0L, 0L, 0L, 0L, null, ux2Var, ((i4 >> 3) & 14) | 1772976, 0, 16272);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new qk0(function0, function1, fs4Var2, i2, (byte) 1);
        }
    }

    public static void d0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final void e(boolean z2, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ux2 ux2Var2;
        ux2Var.Y(-481794777);
        int i3 = (ux2Var.g(z2) ? 4 : 2) | i2 | (ux2Var.f(fs4Var) ? 32 : 16);
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            g38 g38Var = z2 ? new g38(Integer.valueOf(R.drawable.empty_invitation_contacts_background), Integer.valueOf(R.string.device_tab_invitation_contacts_empty_title), Integer.valueOf(R.string.device_tab_invitation_contacts_empty_subtitle)) : new g38(Integer.valueOf(R.drawable.empty_contacts_background), Integer.valueOf(R.string.device_tab_contacts_empty_title), Integer.valueOf(R.string.device_tab_contacts_empty_subtitle));
            fs4Var2 = fs4Var;
            ux2Var2 = ux2Var;
            io1.f(((Number) g38Var.m).intValue(), m77.z(((Number) g38Var.n).intValue(), ux2Var), m77.z(((Number) g38Var.f855o).intValue(), ux2Var), fs4Var2, ux2Var2, (i3 << 6) & 7168);
        } else {
            fs4Var2 = fs4Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z2, fs4Var2, i2, (byte) 3);
        }
    }

    public static void e0(String str) {
        b88 b88Var = new b88(fx3.g("lateinit property ", str, " has not been initialized"));
        Y(b88Var, im3.class.getName());
        throw b88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(boolean z2, h71 h71Var, Function1 function1, fs4 fs4Var, Function1 function2, Function1 function3, Function1 function4, Function1 function5, qa1 qa1Var, ux2 ux2Var, int i2) {
        int i3;
        qa1 qa1Var2;
        ux2 ux2Var2;
        ux2 ux2Var3;
        final qa1 qa1Var3;
        int i4;
        Object obj;
        final qa1 qa1Var4;
        Object obj2;
        Object obj3;
        int i5;
        byte b2;
        px4 px4Var;
        byte b3;
        Object obj4;
        ux2 ux2Var4;
        ux2 ux2Var5;
        Object obj5;
        int i6;
        int i7;
        Object obj6;
        ux2 ux2Var6 = ux2Var;
        function1.getClass();
        ux2Var6.Y(2053512843);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var6.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var6.h(h71Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var6.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var6.f(fs4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var6.h(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var6.h(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var6.h(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ux2Var6.h(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= 33554432;
        }
        byte b4 = 1;
        if (ux2Var6.N(i3 & 1, (38347923 & i3) != 38347922)) {
            ux2Var6.S();
            if ((i2 & 1) == 0 || ux2Var6.x()) {
                dl5 dl5Var = new dl5(new y01((byte) 26), b4);
                we8 we8VarA = id4.a(ux2Var6);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    ux2Var3 = ux2Var6;
                    qa1Var3 = (qa1) g57.t(w86.a.b(qa1.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var6);
                    i4 = i3 & (-234881025);
                }
            } else {
                ux2Var6.Q();
                i4 = i3 & (-234881025);
                ux2Var3 = ux2Var6;
                qa1Var3 = qa1Var;
            }
            int i8 = i4;
            ux2Var3.q();
            px4 px4VarT = h57.t(function1, ux2Var3);
            final px4 px4VarT2 = h57.t(function5, ux2Var3);
            px4 px4VarG = g57.g(qa1Var3.s, ux2Var3);
            boolean zF = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var3);
            Object objK = ux2Var3.K();
            Object obj7 = e01.a;
            Object obj8 = objK;
            if (zF || objK == obj7) {
                final byte b5 = 0;
                Object obj9 = new Function0() { // from class: o.y91
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b6 = b5;
                        f88 f88Var = f88.a;
                        qa1 qa1Var5 = qa1Var3;
                        px4 px4Var2 = px4VarT2;
                        switch (b6) {
                            case 0:
                                ((Function1) px4Var2.getValue()).invoke(new z91(qa1Var5, (byte) 1));
                                break;
                            default:
                                ((Function1) px4Var2.getValue()).invoke(new z91(qa1Var5, (byte) 0));
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj9);
                obj8 = obj9;
            }
            Function0 function0 = (Function0) obj8;
            boolean zF2 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var3);
            Object objK2 = ux2Var3.K();
            Object obj10 = objK2;
            if (zF2 || objK2 == obj7) {
                final byte b6 = 1;
                Object obj11 = new Function1() { // from class: o.w91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj12) {
                        byte b7 = b6;
                        f88 f88Var = f88.a;
                        final qa1 qa1Var5 = qa1Var3;
                        px4 px4Var2 = px4VarT2;
                        switch (b7) {
                            case 0:
                                final h71 h71Var2 = (h71) obj12;
                                h71Var2.getClass();
                                final byte b8 = 0;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b9 = b8;
                                        byte b10 = 1;
                                        hc1 hc1Var = null;
                                        byte b11 = 0;
                                        h71 h71Var3 = h71Var2;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b9) {
                                            case 0:
                                                Integer num = h71Var3.n;
                                                int i9 = qa1Var6.n;
                                                byte b12 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var3.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b11), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b12), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var2, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var3.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var3, hc1Var, b11), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var3.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var3, hc1Var, b10), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 1:
                                a91 a91Var = (a91) obj12;
                                a91Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var5, a91Var, (byte) 26));
                                break;
                            case 2:
                                l71 l71Var = (l71) obj12;
                                l71Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var5, l71Var, (byte) 27));
                                break;
                            case 3:
                                final h71 h71Var3 = (h71) obj12;
                                h71Var3.getClass();
                                final byte b9 = 3;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b10 = b9;
                                        byte b11 = 1;
                                        hc1 hc1Var = null;
                                        byte b12 = 0;
                                        h71 h71Var4 = h71Var3;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b10) {
                                            case 0:
                                                Integer num = h71Var4.n;
                                                int i9 = qa1Var6.n;
                                                byte b13 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var4.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b12), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b13), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var3, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var4.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var4, hc1Var, b12), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var4.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var4, hc1Var, b11), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 4:
                                final h71 h71Var4 = (h71) obj12;
                                h71Var4.getClass();
                                final byte b10 = 2;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b11 = b10;
                                        byte b12 = 1;
                                        hc1 hc1Var = null;
                                        byte b13 = 0;
                                        h71 h71Var5 = h71Var4;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b11) {
                                            case 0:
                                                Integer num = h71Var5.n;
                                                int i9 = qa1Var6.n;
                                                byte b14 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b13), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b14), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var4, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var5.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var5, hc1Var, b13), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var5.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var5, hc1Var, b12), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            default:
                                final h71 h71Var5 = (h71) obj12;
                                h71Var5.getClass();
                                final byte b11 = 1;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b12 = b11;
                                        byte b13 = 1;
                                        hc1 hc1Var = null;
                                        byte b14 = 0;
                                        h71 h71Var6 = h71Var5;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b12) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var6.n;
                                                byte b15 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b14), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b15), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var5, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b14), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b13), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj11);
                obj10 = obj11;
            }
            Function1 function6 = (Function1) obj10;
            boolean zF3 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var3);
            Object objK3 = ux2Var3.K();
            Object obj12 = objK3;
            if (zF3 || objK3 == obj7) {
                final byte b7 = 1;
                Object obj13 = new Function0() { // from class: o.y91
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b8 = b7;
                        f88 f88Var = f88.a;
                        qa1 qa1Var5 = qa1Var3;
                        px4 px4Var2 = px4VarT2;
                        switch (b8) {
                            case 0:
                                ((Function1) px4Var2.getValue()).invoke(new z91(qa1Var5, (byte) 1));
                                break;
                            default:
                                ((Function1) px4Var2.getValue()).invoke(new z91(qa1Var5, (byte) 0));
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj13);
                obj12 = obj13;
            }
            Function0 function7 = (Function0) obj12;
            boolean zF4 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var3);
            Object objK4 = ux2Var3.K();
            if (zF4 || objK4 == obj7) {
                final byte b8 = 2;
                Object obj14 = new Function1() { // from class: o.w91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        byte b9 = b8;
                        f88 f88Var = f88.a;
                        final qa1 qa1Var5 = qa1Var3;
                        px4 px4Var2 = px4VarT2;
                        switch (b9) {
                            case 0:
                                final h71 h71Var2 = (h71) obj15;
                                h71Var2.getClass();
                                final byte b10 = 0;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b12 = b10;
                                        byte b13 = 1;
                                        hc1 hc1Var = null;
                                        byte b14 = 0;
                                        h71 h71Var6 = h71Var2;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b12) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var6.n;
                                                byte b15 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b14), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b15), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var2, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b14), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b13), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 1:
                                a91 a91Var = (a91) obj15;
                                a91Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var5, a91Var, (byte) 26));
                                break;
                            case 2:
                                l71 l71Var = (l71) obj15;
                                l71Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var5, l71Var, (byte) 27));
                                break;
                            case 3:
                                final h71 h71Var3 = (h71) obj15;
                                h71Var3.getClass();
                                final byte b11 = 3;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b12 = b11;
                                        byte b13 = 1;
                                        hc1 hc1Var = null;
                                        byte b14 = 0;
                                        h71 h71Var6 = h71Var3;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b12) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var6.n;
                                                byte b15 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b14), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b15), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var3, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b14), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b13), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 4:
                                final h71 h71Var4 = (h71) obj15;
                                h71Var4.getClass();
                                final byte b12 = 2;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b13 = b12;
                                        byte b14 = 1;
                                        hc1 hc1Var = null;
                                        byte b15 = 0;
                                        h71 h71Var6 = h71Var4;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b13) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var6.n;
                                                byte b16 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b15), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b16), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var4, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b15), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b14), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            default:
                                final h71 h71Var5 = (h71) obj15;
                                h71Var5.getClass();
                                final byte b13 = 1;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b14 = b13;
                                        byte b15 = 1;
                                        hc1 hc1Var = null;
                                        byte b16 = 0;
                                        h71 h71Var6 = h71Var5;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var6 = qa1Var5;
                                        switch (b14) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var6.n;
                                                byte b17 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var6), null, null, new oa1(qa1Var6, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b16), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var6), null, null, new la1(qa1Var6, hc1Var, b17), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var6.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var5, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = true;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b16), 2);
                                                break;
                                            default:
                                                qa1Var6.B = Integer.valueOf(h71Var6.m);
                                                qa1Var6.C = false;
                                                im3.R(e8.n(qa1Var6), qa1Var6.q, null, new ma1(qa1Var6, h71Var6, hc1Var, b15), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj14);
                obj = obj14;
            } else {
                obj = objK4;
            }
            Function1 function8 = (Function1) obj;
            boolean zH = ux2Var3.h(qa1Var3);
            Object objK5 = ux2Var3.K();
            if (zH || objK5 == obj7) {
                qa1 qa1Var5 = qa1Var3;
                objK5 = new ea1(2, qa1Var5, qa1.class, "saveScrollPosition", "saveScrollPosition(II)V", 0, (byte) 0);
                qa1Var4 = qa1Var5;
                ux2Var3.g0(objK5);
            } else {
                qa1Var4 = qa1Var3;
            }
            ja1 ja1Var = new ja1(function0, function6, function7, function8, (hw2) ((pu3) objK5));
            px4 px4VarT3 = h57.t(function3, ux2Var3);
            px4 px4VarT4 = h57.t(function4, ux2Var3);
            boolean zF5 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var4);
            Object objK6 = ux2Var3.K();
            final byte b9 = 3;
            Object obj15 = objK6;
            if (zF5 || objK6 == obj7) {
                Object obj16 = new Function1() { // from class: o.w91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj17) {
                        byte b10 = b9;
                        f88 f88Var = f88.a;
                        final qa1 qa1Var6 = qa1Var4;
                        px4 px4Var2 = px4VarT2;
                        switch (b10) {
                            case 0:
                                final h71 h71Var2 = (h71) obj17;
                                h71Var2.getClass();
                                final byte b11 = 0;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b14 = b11;
                                        byte b15 = 1;
                                        hc1 hc1Var = null;
                                        byte b16 = 0;
                                        h71 h71Var6 = h71Var2;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b14) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b17 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b16), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b17), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var2, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b15), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 1:
                                a91 a91Var = (a91) obj17;
                                a91Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, a91Var, (byte) 26));
                                break;
                            case 2:
                                l71 l71Var = (l71) obj17;
                                l71Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, l71Var, (byte) 27));
                                break;
                            case 3:
                                final h71 h71Var3 = (h71) obj17;
                                h71Var3.getClass();
                                final byte b12 = 3;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b14 = b12;
                                        byte b15 = 1;
                                        hc1 hc1Var = null;
                                        byte b16 = 0;
                                        h71 h71Var6 = h71Var3;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b14) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b17 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b16), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b17), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var3, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b15), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 4:
                                final h71 h71Var4 = (h71) obj17;
                                h71Var4.getClass();
                                final byte b13 = 2;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b14 = b13;
                                        byte b15 = 1;
                                        hc1 hc1Var = null;
                                        byte b16 = 0;
                                        h71 h71Var6 = h71Var4;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b14) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b17 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b16), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b17), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var4, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b15), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            default:
                                final h71 h71Var5 = (h71) obj17;
                                h71Var5.getClass();
                                final byte b14 = 1;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b15 = b14;
                                        byte b16 = 1;
                                        hc1 hc1Var = null;
                                        byte b17 = 0;
                                        h71 h71Var6 = h71Var5;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b15) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b18 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b17), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b18), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var5, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj16);
                obj15 = obj16;
            }
            Function1 function9 = (Function1) obj15;
            boolean zF6 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var4);
            Object objK7 = ux2Var3.K();
            Object obj17 = objK7;
            if (zF6 || objK7 == obj7) {
                final byte b10 = 4;
                Object obj18 = new Function1() { // from class: o.w91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj19) {
                        byte b11 = b10;
                        f88 f88Var = f88.a;
                        final qa1 qa1Var6 = qa1Var4;
                        px4 px4Var2 = px4VarT2;
                        switch (b11) {
                            case 0:
                                final h71 h71Var2 = (h71) obj19;
                                h71Var2.getClass();
                                final byte b12 = 0;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b15 = b12;
                                        byte b16 = 1;
                                        hc1 hc1Var = null;
                                        byte b17 = 0;
                                        h71 h71Var6 = h71Var2;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b15) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b18 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b17), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b18), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var2, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 1:
                                a91 a91Var = (a91) obj19;
                                a91Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, a91Var, (byte) 26));
                                break;
                            case 2:
                                l71 l71Var = (l71) obj19;
                                l71Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, l71Var, (byte) 27));
                                break;
                            case 3:
                                final h71 h71Var3 = (h71) obj19;
                                h71Var3.getClass();
                                final byte b13 = 3;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b15 = b13;
                                        byte b16 = 1;
                                        hc1 hc1Var = null;
                                        byte b17 = 0;
                                        h71 h71Var6 = h71Var3;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b15) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b18 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b17), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b18), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var3, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 4:
                                final h71 h71Var4 = (h71) obj19;
                                h71Var4.getClass();
                                final byte b14 = 2;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b15 = b14;
                                        byte b16 = 1;
                                        hc1 hc1Var = null;
                                        byte b17 = 0;
                                        h71 h71Var6 = h71Var4;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b15) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b18 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b17), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b18), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var4, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b16), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            default:
                                final h71 h71Var5 = (h71) obj19;
                                h71Var5.getClass();
                                final byte b15 = 1;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b16 = b15;
                                        byte b17 = 1;
                                        hc1 hc1Var = null;
                                        byte b18 = 0;
                                        h71 h71Var6 = h71Var5;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b16) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b19 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b18), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b19), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var5, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj18);
                obj17 = obj18;
            }
            Function1 function10 = (Function1) obj17;
            boolean zF7 = ux2Var3.f(px4VarT);
            Object objK8 = ux2Var3.K();
            Object obj19 = objK8;
            if (zF7 || objK8 == obj7) {
                Object vaVar = new va(px4VarT, (byte) 11);
                ux2Var3.g0(vaVar);
                obj19 = vaVar;
            }
            Function1 function11 = (Function1) obj19;
            boolean zF8 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var4);
            Object objK9 = ux2Var3.K();
            Object obj20 = objK9;
            if (zF8 || objK9 == obj7) {
                final byte b11 = 0;
                Object obj21 = new Function1() { // from class: o.w91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        byte b12 = b11;
                        f88 f88Var = f88.a;
                        final qa1 qa1Var6 = qa1Var4;
                        px4 px4Var2 = px4VarT2;
                        switch (b12) {
                            case 0:
                                final h71 h71Var2 = (h71) obj110;
                                h71Var2.getClass();
                                final byte b13 = 0;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b16 = b13;
                                        byte b17 = 1;
                                        hc1 hc1Var = null;
                                        byte b18 = 0;
                                        h71 h71Var6 = h71Var2;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b16) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b19 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b18), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b19), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var2, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 1:
                                a91 a91Var = (a91) obj110;
                                a91Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, a91Var, (byte) 26));
                                break;
                            case 2:
                                l71 l71Var = (l71) obj110;
                                l71Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, l71Var, (byte) 27));
                                break;
                            case 3:
                                final h71 h71Var3 = (h71) obj110;
                                h71Var3.getClass();
                                final byte b14 = 3;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b16 = b14;
                                        byte b17 = 1;
                                        hc1 hc1Var = null;
                                        byte b18 = 0;
                                        h71 h71Var6 = h71Var3;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b16) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b19 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b18), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b19), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var3, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 4:
                                final h71 h71Var4 = (h71) obj110;
                                h71Var4.getClass();
                                final byte b15 = 2;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b16 = b15;
                                        byte b17 = 1;
                                        hc1 hc1Var = null;
                                        byte b18 = 0;
                                        h71 h71Var6 = h71Var4;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b16) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b19 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b18), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b19), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var4, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b17), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            default:
                                final h71 h71Var5 = (h71) obj110;
                                h71Var5.getClass();
                                final byte b16 = 1;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b17 = b16;
                                        byte b18 = 1;
                                        hc1 hc1Var = null;
                                        byte b19 = 0;
                                        h71 h71Var6 = h71Var5;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b17) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b110 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b19), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b110), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var5, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b19), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj21);
                obj20 = obj21;
            }
            Function1 function12 = (Function1) obj20;
            boolean z3 = (((i8 & 57344) ^ 24576) > 16384 && ux2Var3.f(function2)) || (i8 & 24576) == 16384;
            Object objK10 = ux2Var3.K();
            Object obj22 = objK10;
            if (z3 || objK10 == obj7) {
                Object jbVar = new jb(function2, (byte) 1);
                ux2Var3.g0(jbVar);
                obj22 = jbVar;
            }
            Function1 function13 = (Function1) obj22;
            boolean zF9 = ux2Var3.f(px4VarT2) | ux2Var3.h(qa1Var4);
            Object objK11 = ux2Var3.K();
            final byte b12 = 5;
            Object obj23 = objK11;
            if (zF9 || objK11 == obj7) {
                Object obj24 = new Function1() { // from class: o.w91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj110) {
                        byte b13 = b12;
                        f88 f88Var = f88.a;
                        final qa1 qa1Var6 = qa1Var4;
                        px4 px4Var2 = px4VarT2;
                        switch (b13) {
                            case 0:
                                final h71 h71Var2 = (h71) obj110;
                                h71Var2.getClass();
                                final byte b14 = 0;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b17 = b14;
                                        byte b18 = 1;
                                        hc1 hc1Var = null;
                                        byte b19 = 0;
                                        h71 h71Var6 = h71Var2;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b17) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b110 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b19), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b110), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var2, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b19), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 1:
                                a91 a91Var = (a91) obj110;
                                a91Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, a91Var, (byte) 26));
                                break;
                            case 2:
                                l71 l71Var = (l71) obj110;
                                l71Var.getClass();
                                ((Function1) px4Var2.getValue()).invoke(new x8(qa1Var6, l71Var, (byte) 27));
                                break;
                            case 3:
                                final h71 h71Var3 = (h71) obj110;
                                h71Var3.getClass();
                                final byte b15 = 3;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b17 = b15;
                                        byte b18 = 1;
                                        hc1 hc1Var = null;
                                        byte b19 = 0;
                                        h71 h71Var6 = h71Var3;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b17) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b110 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b19), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b110), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var3, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b19), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            case 4:
                                final h71 h71Var4 = (h71) obj110;
                                h71Var4.getClass();
                                final byte b16 = 2;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b17 = b16;
                                        byte b18 = 1;
                                        hc1 hc1Var = null;
                                        byte b19 = 0;
                                        h71 h71Var6 = h71Var4;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b17) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b110 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b19), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b110), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var4, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b19), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b18), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                            default:
                                final h71 h71Var5 = (h71) obj110;
                                h71Var5.getClass();
                                final byte b17 = 1;
                                ((Function1) px4Var2.getValue()).invoke(new Function0() { // from class: o.aa1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b18 = b17;
                                        byte b19 = 1;
                                        hc1 hc1Var = null;
                                        byte b110 = 0;
                                        h71 h71Var6 = h71Var5;
                                        f88 f88Var2 = f88.a;
                                        qa1 qa1Var7 = qa1Var6;
                                        switch (b18) {
                                            case 0:
                                                Integer num = h71Var6.n;
                                                int i9 = qa1Var7.n;
                                                byte b111 = 3;
                                                if (num == null || num.intValue() != i9) {
                                                    GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var6.m));
                                                    if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                                im3.R(e8.n(qa1Var7), null, null, new oa1(qa1Var7, chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var, b110), 3);
                                                            } else {
                                                                im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 6), 3);
                                                            }
                                                        } else {
                                                            ye4.a.g("ContactsScreenViewModel", "openChat: No chat UI model");
                                                            im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 5), 3);
                                                        }
                                                    } else {
                                                        im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, (byte) 4), 3);
                                                    }
                                                } else {
                                                    im3.R(e8.n(qa1Var7), null, null, new la1(qa1Var7, hc1Var, b111), 3);
                                                }
                                                break;
                                            case 1:
                                                l97 l97Var = qa1Var7.r;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, true, h71Var5, false, null, false, false, 249855)));
                                                break;
                                            case 2:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = true;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b110), 2);
                                                break;
                                            default:
                                                qa1Var7.B = Integer.valueOf(h71Var6.m);
                                                qa1Var7.C = false;
                                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new ma1(qa1Var7, h71Var6, hc1Var, b19), 2);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                });
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj24);
                obj23 = obj24;
            }
            Function1 function14 = (Function1) obj23;
            boolean zH2 = ux2Var3.h(qa1Var4);
            Object objK12 = ux2Var3.K();
            Object obj25 = objK12;
            if (zH2 || objK12 == obj7) {
                final byte b13 = 0;
                Object obj26 = new Function1() { // from class: o.ca1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj27) {
                        byte b14 = b13;
                        qa1 qa1Var6 = qa1Var4;
                        f88 f88Var = f88.a;
                        switch (b14) {
                            case 0:
                                h71 h71Var2 = (h71) obj27;
                                h71Var2.getClass();
                                qa1Var6.D = Integer.valueOf(h71Var2.m);
                                break;
                            case 1:
                                h71 h71Var3 = (h71) obj27;
                                h71Var3.getClass();
                                Integer num = qa1Var6.D;
                                int i9 = h71Var3.m;
                                if (num != null && num.intValue() == i9) {
                                    qa1Var6.D = null;
                                }
                                break;
                            default:
                                z31 z31Var = (z31) obj27;
                                z31Var.getClass();
                                qa1 qa1Var7 = qa1Var4;
                                boolean z4 = qa1Var7.C;
                                qa1Var7.C = false;
                                qa1Var7.V0();
                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new oa1(z4, qa1Var7, z31Var, null, (byte) 1), 2);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj26);
                obj25 = obj26;
            }
            Function1 function15 = (Function1) obj25;
            boolean zH3 = ux2Var3.h(qa1Var4);
            Object objK13 = ux2Var3.K();
            if (zH3 || objK13 == obj7) {
                final byte b14 = 1;
                Object obj27 = new Function1() { // from class: o.ca1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj28) {
                        byte b15 = b14;
                        qa1 qa1Var6 = qa1Var4;
                        f88 f88Var = f88.a;
                        switch (b15) {
                            case 0:
                                h71 h71Var2 = (h71) obj28;
                                h71Var2.getClass();
                                qa1Var6.D = Integer.valueOf(h71Var2.m);
                                break;
                            case 1:
                                h71 h71Var3 = (h71) obj28;
                                h71Var3.getClass();
                                Integer num = qa1Var6.D;
                                int i9 = h71Var3.m;
                                if (num != null && num.intValue() == i9) {
                                    qa1Var6.D = null;
                                }
                                break;
                            default:
                                z31 z31Var = (z31) obj28;
                                z31Var.getClass();
                                qa1 qa1Var7 = qa1Var4;
                                boolean z4 = qa1Var7.C;
                                qa1Var7.C = false;
                                qa1Var7.V0();
                                im3.R(e8.n(qa1Var7), qa1Var7.q, null, new oa1(z4, qa1Var7, z31Var, null, (byte) 1), 2);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var3.g0(obj27);
                obj2 = obj27;
            } else {
                obj2 = objK13;
            }
            r81 r81Var = new r81(function9, function10, function11, function12, function13, function14, function15, (Function1) obj2);
            Object objK14 = ux2Var3.K();
            hc1 hc1Var = null;
            byte b15 = 6;
            if (objK14 == obj7) {
                Object l5Var = new l5(2, hc1Var, b15);
                ux2Var3.g0(l5Var);
                obj3 = l5Var;
            } else {
                obj3 = objK14;
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) obj3, ux2Var3);
            Object[] objArr = {Boolean.valueOf(z2), ((ka1) px4VarG.getValue()).a, ((ka1) px4VarG.getValue()).b, h71Var};
            int i9 = i8 & 14;
            boolean zF10 = (i9 == 4) | ux2Var3.f(px4VarG) | ux2Var3.h(h71Var) | ux2Var3.f(px4VarT);
            Object objK15 = ux2Var3.K();
            if (zF10 || objK15 == obj7) {
                i5 = i9;
                b2 = 1;
                Object j0Var = new j0(z2, h71Var, px4VarT, px4VarG, (hc1) null);
                px4Var = px4VarG;
                ux2Var3.g0(j0Var);
                objK15 = j0Var;
            } else {
                i5 = i9;
                px4Var = px4VarG;
                b2 = 1;
            }
            ck3.j(objArr, (hw2) objK15, ux2Var3);
            boolean zH4 = ux2Var3.h(qa1Var4) | ux2Var3.f(px4VarT3);
            Object objK16 = ux2Var3.K();
            if (zH4 || objK16 == obj7) {
                b3 = 0;
                Object da1Var = new da1(qa1Var4, px4VarT3, null, b3);
                ux2Var3.g0(da1Var);
                obj4 = da1Var;
            } else {
                b3 = 0;
                obj4 = objK16;
            }
            ck3.i(f88Var, (hw2) obj4, ux2Var3);
            boolean zH5 = ux2Var3.h(qa1Var4) | ux2Var3.f(r16);
            Object objK17 = ux2Var3.K();
            Object obj28 = objK17;
            if (zH5 || objK17 == obj7) {
                Object da1Var2 = new da1(qa1Var4, px4VarT4, null, b2);
                ux2Var3.g0(da1Var2);
                obj28 = da1Var2;
            }
            ck3.i(f88Var, (hw2) obj28, ux2Var3);
            int i10 = i8 << 6;
            boolean z4 = b3;
            ux2 ux2Var7 = ux2Var3;
            final byte b16 = 2;
            g(z2, (ka1) px4Var.getValue(), ja1Var, h71Var, function1, fs4Var, r81Var, ux2Var7, i5 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752));
            ux2 ux2Var8 = ux2Var7;
            if (((ka1) px4Var.getValue()).f) {
                ux2Var8.W(-1308874184);
                vn4.P(null, null, function6, function0, ((ka1) px4Var.getValue()).i, ux2Var8, 0);
                ux2Var8.p(z4);
            } else {
                ux2Var8.W(-1308684681);
                ux2Var8.p(z4);
            }
            if (((ka1) px4Var.getValue()).g) {
                ux2Var8.W(-1308619922);
                hm3.b(((ka1) px4Var.getValue()).j, null, ((ka1) px4Var.getValue()).h, function8, function7, null, ux2Var, 0);
                ux2 ux2Var9 = ux2Var;
                ux2Var9.p(z4);
                ux2Var4 = ux2Var9;
            } else {
                ux2Var8.W(-1308334505);
                ux2Var8.p(z4);
                ux2Var4 = ux2Var8;
            }
            if (((ka1) px4Var.getValue()).m) {
                ux2Var4.W(-1308279232);
                String strZ = m77.z(R.string.contact_remove_dialog_title, ux2Var4);
                String strZ2 = m77.z(R.string.contact_remove_dialog_message, ux2Var4);
                boolean zH6 = ux2Var4.h(qa1Var4);
                Object objK18 = ux2Var4.K();
                if (zH6 || objK18 == obj7) {
                    obj6 = objK18;
                    Object z91Var = new z91(qa1Var4, b16);
                    ux2Var4.g0(z91Var);
                    obj6 = z91Var;
                }
                Function0 function16 = (Function0) obj6;
                boolean zH7 = ux2Var4.h(qa1Var4);
                Object objK19 = ux2Var4.K();
                Object obj29 = objK19;
                if (zH7 || objK19 == obj7) {
                    Object z91Var2 = new z91(qa1Var4, (byte) 3);
                    ux2Var4.g0(z91Var2);
                    obj29 = z91Var2;
                }
                yo1.q(strZ, strZ2, "TVTA-devicesScreen-removeContactDialog", function16, (Function0) obj29, null, ux2Var, 384);
                ux2 ux2Var10 = ux2Var;
                ux2Var10.p(z4);
                ux2Var5 = ux2Var10;
            } else {
                ux2Var4.W(-1307888105);
                ux2Var4.p(z4);
                ux2Var5 = ux2Var4;
            }
            if (((ka1) px4Var.getValue()).f1244o) {
                ux2Var5.W(-1307823594);
                List list = ((ka1) px4Var.getValue()).p;
                if (((ka1) px4Var.getValue()).q) {
                    i6 = -1307672593;
                    i7 = R.string.select_contact_device_description_file_transfer;
                } else {
                    i6 = -1307563659;
                    i7 = R.string.select_contact_device_description_connect;
                }
                String strM = to7.m(ux2Var5, i6, i7, ux2Var5, z4);
                boolean zH8 = ux2Var5.h(qa1Var4);
                Object objK20 = ux2Var5.K();
                Object obj30 = objK20;
                if (zH8 || objK20 == obj7) {
                    Object obj31 = new Function1() { // from class: o.ca1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj210) {
                            byte b17 = b16;
                            qa1 qa1Var6 = qa1Var4;
                            f88 f88Var2 = f88.a;
                            switch (b17) {
                                case 0:
                                    h71 h71Var2 = (h71) obj210;
                                    h71Var2.getClass();
                                    qa1Var6.D = Integer.valueOf(h71Var2.m);
                                    break;
                                case 1:
                                    h71 h71Var3 = (h71) obj210;
                                    h71Var3.getClass();
                                    Integer num = qa1Var6.D;
                                    int i11 = h71Var3.m;
                                    if (num != null && num.intValue() == i11) {
                                        qa1Var6.D = null;
                                    }
                                    break;
                                default:
                                    z31 z31Var = (z31) obj210;
                                    z31Var.getClass();
                                    qa1 qa1Var7 = qa1Var4;
                                    boolean z5 = qa1Var7.C;
                                    qa1Var7.C = false;
                                    qa1Var7.V0();
                                    im3.R(e8.n(qa1Var7), qa1Var7.q, null, new oa1(z5, qa1Var7, z31Var, null, (byte) 1), 2);
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var5.g0(obj31);
                    obj30 = obj31;
                }
                Function1 function17 = (Function1) obj30;
                boolean zH9 = ux2Var5.h(qa1Var4);
                Object objK21 = ux2Var5.K();
                Object obj32 = objK21;
                if (zH9 || objK21 == obj7) {
                    Object z91Var3 = new z91(qa1Var4, (byte) 4);
                    ux2Var5.g0(z91Var3);
                    obj32 = z91Var3;
                }
                io1.r(list, strM, function17, (Function0) obj32, null, false, null, null, ux2Var5, 0, 240);
                ux2Var5.p(z4);
            } else {
                ux2Var5.W(-1307269097);
                ux2Var5.p(z4);
            }
            if (((ka1) px4Var.getValue()).r) {
                ux2Var5.W(-1307217637);
                boolean zH10 = ux2Var5.h(qa1Var4);
                Object objK22 = ux2Var5.K();
                if (zH10 || objK22 == obj7) {
                    obj5 = objK22;
                    Object z91Var4 = new z91(qa1Var4, (byte) 5);
                    ux2Var5.g0(z91Var4);
                    obj5 = z91Var4;
                }
                j51.n((Function0) obj5, ux2Var5, z4 ? 1 : 0);
                ux2Var5.p(z4);
            } else {
                ux2Var5.W(-1307098473);
                ux2Var5.p(z4);
            }
            qa1Var2 = qa1Var4;
            ux2Var2 = ux2Var5;
        } else {
            ux2Var6.Q();
            qa1Var2 = qa1Var;
            ux2Var2 = ux2Var6;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new x91(z2, h71Var, function1, fs4Var, function2, function3, function4, function5, qa1Var2, i2);
        }
    }

    public static char f0(int i2) throws at2 {
        if (i2 < 45) {
            return m[i2];
        }
        throw at2.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(boolean z2, final ka1 ka1Var, ja1 ja1Var, h71 h71Var, Function1 function1, fs4 fs4Var, r81 r81Var, ux2 ux2Var, int i2) {
        int i3;
        int i4;
        w44 w44Var;
        aw awVar;
        a91 a91Var;
        boolean z3;
        Object y90Var;
        boolean z4;
        boolean z5;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1947290011);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var2.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.h(ka1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.h(ja1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.h(h71Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var2.h(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var2.h(r81Var) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (ux2Var2.N(i5 & 1, (i5 & 599187) != 599186)) {
            ux2Var2.S();
            if ((i2 & 1) != 0 && !ux2Var2.x()) {
                ux2Var2.Q();
            }
            ux2Var2.q();
            Object objK = ux2Var2.K();
            aw awVar2 = e01.a;
            if (objK == awVar2) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var = (me1) objK;
            int i6 = ka1Var.k;
            List list = ka1Var.b;
            boolean z6 = ka1Var.c;
            boolean z7 = ka1Var.d;
            boolean z8 = ka1Var.e;
            l71 l71Var = ka1Var.j;
            w44 w44VarA = z44.a(i6, ka1Var.l, ux2Var2, 0);
            Object[] objArr = new Object[0];
            boolean zH = ux2Var2.h(ka1Var);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar2) {
                i4 = 0;
                final Object[] objArr2 = 0 == true ? 1 : 0;
                objK2 = new Function0() { // from class: o.ba1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b2 = objArr2;
                        ka1 ka1Var2 = ka1Var;
                        switch (b2) {
                            case 0:
                                return h57.p(ka1Var2.i);
                            default:
                                return h57.p(ka1Var2.j);
                        }
                    }
                };
                ux2Var2.g0(objK2);
            } else {
                i4 = 0;
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK2, ux2Var2, i4);
            Object[] objArr3 = new Object[i4];
            boolean zH2 = ux2Var2.h(ka1Var);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar2) {
                final byte b2 = 1;
                objK3 = new Function0() { // from class: o.ba1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b3 = b2;
                        ka1 ka1Var2 = ka1Var;
                        switch (b3) {
                            case 0:
                                return h57.p(ka1Var2.i);
                            default:
                                return h57.p(ka1Var2.j);
                        }
                    }
                };
                ux2Var2.g0(objK3);
            }
            px4 px4Var2 = (px4) zu1.L(objArr3, (Function0) objK3, ux2Var2, 0);
            a91 a91Var2 = ka1Var.i;
            boolean zF = ux2Var2.f(px4Var) | ux2Var2.h(ka1Var) | ux2Var2.f(w44VarA) | ux2Var2.f(px4Var2);
            Object objK4 = ux2Var2.K();
            if (zF || objK4 == awVar2) {
                w44Var = w44VarA;
                awVar = awVar2;
                a91Var = a91Var2;
                tb tbVar = new tb(ka1Var, w44Var, px4Var, px4Var2, null, (byte) 1);
                ux2Var2.g0(tbVar);
                objK4 = tbVar;
            } else {
                w44Var = w44VarA;
                awVar = awVar2;
                a91Var = a91Var2;
            }
            ck3.h(a91Var, l71Var, (hw2) objK4, ux2Var2);
            boolean zH3 = ux2Var2.h(ja1Var) | ux2Var2.f(w44Var);
            Object objK5 = ux2Var2.K();
            if (zH3 || objK5 == awVar) {
                objK5 = new g0(ja1Var, w44Var, (byte) 22);
                ux2Var2.g0(objK5);
            }
            ck3.e(f88.a, (Function1) objK5, ux2Var2);
            int iOrdinal = l71Var.ordinal();
            if (iOrdinal == 0) {
                z3 = z7 || z6 || z8;
            } else if (iOrdinal == 1) {
                z3 = z6;
            } else if (iOrdinal == 2) {
                z3 = z7;
            } else {
                if (iOrdinal != 3) {
                    gk0.s();
                    return;
                }
                z3 = z8;
            }
            fs4 fs4VarF = fs4Var.f(androidx.compose.foundation.layout.b.c);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z9 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z9) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            j((z3 || list.isEmpty()) ? false : true, ka1Var.j, ka1Var.i, ja1Var.c, ja1Var.a, null, ux2Var, 0);
            ux2Var2 = ux2Var;
            boolean zIsEmpty = list.isEmpty();
            cs4 cs4Var = cs4.b;
            if (zIsEmpty) {
                ux2Var2.W(-437273374);
                e(l71Var == l71.p, lw0.a(cs4Var), ux2Var2, 0);
                ux2Var2.p(false);
                z4 = true;
            } else {
                ux2Var2.W(-437019205);
                fs4 fs4VarA = lw0.a(cs4Var);
                pd5 pd5VarJ = ka0.j(0.0f, 0.0f, 0.0f, 121.0f, 7);
                boolean zH4 = ((i5 & 14) == 4) | ux2Var2.h(ka1Var) | ux2Var2.h(h71Var) | ux2Var2.h(me1Var) | ux2Var2.f(w44Var) | ((i5 & 57344) == 16384) | ux2Var2.h(r81Var);
                Object objK6 = ux2Var2.K();
                if (zH4 || objK6 == awVar) {
                    w44 w44Var2 = w44Var;
                    y90Var = new y90(ka1Var, h71Var, z2, me1Var, w44Var2, function1, r81Var, (byte) 1);
                    w44Var = w44Var2;
                    ux2Var2.g0(y90Var);
                } else {
                    y90Var = objK6;
                }
                yo1.i(384, 504, (Function1) y90Var, null, null, null, null, ux2Var, w44Var, fs4VarA, pd5VarJ, false);
                ux2Var2 = ux2Var;
                if (z3) {
                    ux2Var2.W(-435826914);
                    fs4 fs4VarB = ka0.B(lw0.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f)), 24.0f);
                    z5 = false;
                    do4 do4VarC = ua0.c(xz2.p, false);
                    int iHashCode2 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL2 = ux2Var2.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarB);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC, iz0Var, ux2Var2);
                    o67.n(yj5VarL2, iz0Var2, ux2Var2);
                    e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                    o67.n(fs4VarS2, iz0Var4, ux2Var2);
                    st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var, 0, 63);
                    ux2Var2 = ux2Var;
                    z4 = true;
                    ux2Var2.p(true);
                    ux2Var2.p(false);
                } else {
                    z4 = true;
                    z5 = false;
                    ux2Var2.W(-435501135);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z5);
            }
            ux2Var2.p(z4);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new i5(z2, ka1Var, ja1Var, h71Var, function1, fs4Var, r81Var, i2);
        }
    }

    public static final long g0(long j2) {
        aw awVar = c72.n;
        boolean z2 = j2 > 0;
        if (z2) {
            long jF = c72.f(j2, lq1.L(999999L, g72.NANOSECONDS));
            return ((((int) jF) & 1) != 1 || c72.d(jF)) ? c72.g(jF, g72.MILLISECONDS) : jF >> 1;
        }
        if (!z2) {
            return 0L;
        }
        gk0.s();
        return 0L;
    }

    public static final void h(int i2, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(48201439);
        int i3 = i2 | (ux2Var.h(function0) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            uf0.b(function0, au8.O(2074858791, new v4(function1, (byte) 8), ux2Var), cs4Var, au8.O(669667113, new v4(function0, (byte) 9), ux2Var), iq8.l, iq8.m, null, 0L, 0L, 0L, 0L, null, ux2Var, (i3 & 14) | 1772976, 0, 16272);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u71(function0, function1, fs4Var2, i2, (byte) 1);
        }
    }

    public static js0 h0(ht2 ht2Var) {
        ht2Var.getClass();
        ht2 ht2VarE = ht2Var.e();
        sy4 sy4VarF = ht2Var.f();
        sy4VarF.getClass();
        return new js0(ht2VarE, sy4VarF);
    }

    public static ICommercialUseViewModel i() {
        long jCommercialUseViewModelFactory_GetCommercialUseViewModel = CommercialUseViewModelFactorySWIGJNI.CommercialUseViewModelFactory_GetCommercialUseViewModel();
        if (jCommercialUseViewModelFactory_GetCommercialUseViewModel == 0) {
            return null;
        }
        ICommercialUseViewModel iCommercialUseViewModel = new ICommercialUseViewModel();
        iCommercialUseViewModel.b = true;
        iCommercialUseViewModel.a = jCommercialUseViewModelFactory_GetCommercialUseViewModel;
        return iCommercialUseViewModel;
    }

    public static String i0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final void j(boolean z2, l71 l71Var, a91 a91Var, Function0 function0, Function0 function1, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2047299777);
        int i8 = i2 | (ux2Var2.g(z2) ? 4 : 2) | (ux2Var2.d(l71Var.ordinal()) ? 32 : 16) | (ux2Var2.d(a91Var.ordinal()) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024) | (ux2Var2.h(function1) ? 16384 : 8192) | 196608;
        if (ux2Var2.N(i8 & 1, (74899 & i8) != 74898)) {
            int iOrdinal = l71Var.ordinal();
            if (iOrdinal == 0) {
                i3 = -360054268;
                i4 = R.string.contacts_all;
            } else if (iOrdinal == 1) {
                i3 = -360049239;
                i4 = R.string.contacts_personal;
            } else if (iOrdinal == 2) {
                i3 = -360051832;
                i4 = R.string.contacts_company;
            } else {
                if (iOrdinal != 3) {
                    throw fx3.m(-360055812, ux2Var2, false);
                }
                i3 = -360046549;
                i4 = R.string.contacts_invitation;
            }
            String strM = to7.m(ux2Var2, i3, i4, ux2Var2, false);
            int iOrdinal2 = l71Var.ordinal();
            if (iOrdinal2 == 0) {
                i5 = R.drawable.ic_all_contacts;
            } else if (iOrdinal2 == 1) {
                i5 = R.drawable.ic_personal_contact;
            } else if (iOrdinal2 == 2) {
                i5 = R.drawable.ic_company_contact;
            } else {
                if (iOrdinal2 != 3) {
                    gk0.s();
                    return;
                }
                i5 = R.drawable.ic_invitation_contact;
            }
            int iOrdinal3 = a91Var.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                i6 = -360030553;
                i7 = R.string.sort_name_label;
            } else if (iOrdinal3 == 2) {
                i6 = -360028118;
                i7 = R.string.sort_status_online;
            } else if (iOrdinal3 == 3) {
                i6 = -360025557;
                i7 = R.string.sort_status_offline;
            } else {
                if (iOrdinal3 != 4) {
                    throw fx3.m(-360032972, ux2Var2, false);
                }
                i6 = -360022965;
                i7 = R.string.sort_status_pending;
            }
            String strM2 = to7.m(ux2Var2, i6, i7, ux2Var2, false);
            int i9 = i5;
            i97 i97VarA = vm.a(a91Var == a91.n ? 180.0f : 0.0f, null, "sortRotation", ux2Var, 3072, 22);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarB = ka0.B(Z(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), W(ux2Var), false), 8.0f);
            ju juVar = iq8.a;
            dg6 dg6VarA = cg6.a(juVar, xz2.x, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z3 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
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
            fs4 fs4VarJ = iq8.j(cs4Var, sf6.a(8.0f));
            boolean z4 = (i8 & 7168) == 2048;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z4 || objK == awVar) {
                objK = new a9(function0, (byte) 20);
                ux2Var.g0(objK);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(androidx.compose.foundation.b.b(fs4VarJ, false, null, null, (Function0) objK, 15), 12.0f, 6.0f), "TVTA-devicesScreen-contactList-filtersItem");
            x50 x50Var = xz2.y;
            dg6 dg6VarA2 = cg6.a(juVar, x50Var, ux2Var, 48);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            fs4Var2 = cs4Var;
            qs7.b(strM, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), "TVTA-devicesScreen-contactList-filterLabel"), ep1.r(ux2Var).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var).m, ux2Var, 48, 24960, 110584);
            td3.b(lv1.T(i9, ux2Var, 0), m77.z(R.string.filter_contacts_content_description, ux2Var), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(fs4Var2, 18.0f), "TVTA-devicesScreen-contactList-filterIcon"), ep1.r(ux2Var).s, ux2Var, 392, 0);
            ux2Var.p(true);
            fs4 fs4VarJ2 = iq8.j(fs4Var2, sf6.a(8.0f));
            boolean z5 = (i8 & 57344) == 16384;
            Object objK2 = ux2Var.K();
            if (z5 || objK2 == awVar) {
                objK2 = new a9(function1, (byte) 21);
                ux2Var.g0(objK2);
            }
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(ka0.C(androidx.compose.foundation.b.b(fs4VarJ2, z2, null, null, (Function0) objK2, 14), 12.0f, 6.0f), "TVTA-devicesScreen-contactList-sortingItem");
            dg6 dg6VarA3 = cg6.a(juVar, x50Var, ux2Var, 48);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarA2);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA3, iz0Var, ux2Var);
            o67.n(yj5VarL3, iz0Var2, ux2Var);
            e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS3, iz0Var4, ux2Var);
            qs7.b(strM2, androidx.compose.ui.platform.a.a(ka0.F(fs4Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), "TVTA-devicesScreen-contactList-sortingLabel"), rv0.b(z2 ? 1.0f : 0.38f, ep1.r(ux2Var).s), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var).m, ux2Var, 48, 24960, 110584);
            ux2Var2 = ux2Var;
            fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(iq8.j(io1.e0(fs4Var2, ((Number) i97VarA.getValue()).floatValue()), sf6.a), 18.0f), "TVTA-devicesScreen-contactList-sortingIcon");
            td3.b(lv1.T(R.drawable.ic_sort, ux2Var2, 0), m77.z(R.string.sort_contacts_content_description, ux2Var2), fs4VarA3, rv0.b(z2 ? 1.0f : 0.38f, ep1.r(ux2Var2).s), ux2Var2, 8, 0);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new a5(z2, l71Var, a91Var, function0, function1, fs4Var2, i2);
        }
    }

    public static final Object j0(de1 de1Var, hw2 hw2Var, hc1 hc1Var) {
        Unsafe unsafe;
        long j2;
        de1 context = hc1Var.getContext();
        de1 de1VarH0 = !((Boolean) de1Var.b0(Boolean.FALSE, new iz0((byte) 25))).booleanValue() ? context.H0(de1Var) : j51.G(context, de1Var, false);
        ds1.H(de1VarH0);
        if (de1VarH0 == context) {
            mj6 mj6Var = new mj6(hc1Var, de1VarH0);
            return h67.p(mj6Var, true, mj6Var, hw2Var);
        }
        d82 d82Var = d82.y;
        if (n(de1VarH0.l0(d82Var), context.l0(d82Var))) {
            t78 t78Var = new t78(hc1Var, de1VarH0);
            de1 de1Var2 = t78Var.f577o;
            Object objY = j51.Y(de1Var2, null);
            try {
                return h67.p(t78Var, true, t78Var, hw2Var);
            } finally {
                j51.Q(de1Var2, objY);
            }
        }
        b22 b22Var = new b22(hc1Var, de1VarH0);
        try {
            ga0.t(f88.a, vt1.A(vt1.p(b22Var, b22Var, hw2Var)));
            do {
                unsafe = defpackage.a.a;
                j2 = b22.q;
                int intVolatile = unsafe.getIntVolatile(b22Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        hk0.l("Already suspended");
                        return null;
                    }
                    Object objI = ka0.I(b22Var.E());
                    if (objI instanceof xx0) {
                        throw ((xx0) objI).a;
                    }
                    return objI;
                }
            } while (!unsafe.compareAndSwapInt(b22Var, j2, 0, 1));
            return ne1.m;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof z12) {
                th2 = ((z12) th2).m;
            }
            b22Var.resumeWith(new sc6(th2));
            throw th2;
        }
    }

    public static final l97 k(Object obj) {
        if (obj == null) {
            obj = g68.s;
        }
        return new l97(obj);
    }

    public static b17 l(int i2) {
        return new b17((i2 & 1) != 0);
    }

    public static final void m(g4 g4Var, fp6 fp6Var) {
        ap6 ap6Var = fp6Var.d;
        jx4 jx4Var = ap6Var.m;
        Object objG = ap6Var.m.g(kp6.z);
        if (objG == null) {
            objG = null;
        }
        pe6 pe6Var = (pe6) objG;
        if (vn4.c0(fp6Var)) {
            if (pe6Var != null && pe6Var.a == 8) {
                return;
            }
            Object objG2 = jx4Var.g(zo6.y);
            if (objG2 == null) {
                objG2 = null;
            }
            m3 m3Var = (m3) objG2;
            if (m3Var != null) {
                g4Var.b(new a4(android.R.id.accessibilityActionPageUp, m3Var.a));
            }
            Object objG3 = jx4Var.g(zo6.A);
            if (objG3 == null) {
                objG3 = null;
            }
            m3 m3Var2 = (m3) objG3;
            if (m3Var2 != null) {
                g4Var.b(new a4(android.R.id.accessibilityActionPageDown, m3Var2.a));
            }
            Object objG4 = jx4Var.g(zo6.z);
            if (objG4 == null) {
                objG4 = null;
            }
            m3 m3Var3 = (m3) objG4;
            if (m3Var3 != null) {
                g4Var.b(new a4(android.R.id.accessibilityActionPageLeft, m3Var3.a));
            }
            Object objG5 = jx4Var.g(zo6.B);
            m3 m3Var4 = (m3) (objG5 != null ? objG5 : null);
            if (m3Var4 != null) {
                g4Var.b(new a4(android.R.id.accessibilityActionPageRight, m3Var4.a));
            }
        }
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static em1 o(me1 me1Var, de1 de1Var, hw2 hw2Var, int i2) {
        if ((i2 & 1) != 0) {
            de1Var = ba2.m;
        }
        em1 em1Var = new em1(j51.M(me1Var, de1Var), true);
        em1Var.e0(pe1.m, em1Var, hw2Var);
        return em1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void p(jc1 jc1Var) {
        om1 om1Var;
        if (jc1Var instanceof om1) {
            om1Var = (om1) jc1Var;
            int i2 = om1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                om1Var.n = i2 - Integer.MIN_VALUE;
            } else {
                om1Var = new om1(jc1Var);
            }
        } else {
            om1Var = new om1(jc1Var);
        }
        Object obj = om1Var.m;
        int i3 = om1Var.n;
        if (i3 == 0) {
            ct1.a0(obj);
            om1Var.n = 1;
            gl0 gl0Var = new gl0(1, vt1.A(om1Var));
            gl0Var.t();
            if (gl0Var.q() == ne1.m) {
                return;
            }
        } else {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ct1.a0(obj);
        }
        hk0.b();
    }

    public static final Set q(fq6 fq6Var) {
        fq6Var.getClass();
        if (fq6Var instanceof mi0) {
            return ((mi0) fq6Var).b();
        }
        HashSet hashSet = new HashSet(fq6Var.e());
        int iE = fq6Var.e();
        for (int i2 = 0; i2 < iE; i2++) {
            hashSet.add(fq6Var.f(i2));
        }
        return hashSet;
    }

    public static void r(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            yq4.f();
        }
    }

    public static final fq6[] s(List list) {
        fq6[] fq6VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fq6VarArr = (fq6[]) list.toArray(new fq6[0])) == null) ? z : fq6VarArr;
    }

    public static int t(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int u(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void v(l70 l70Var, StringBuilder sb, int i2, boolean z2) throws at2 {
        while (i2 > 1) {
            if (l70Var.a() < 11) {
                throw at2.a();
            }
            int iC = l70Var.c(11);
            sb.append(f0(iC / 45));
            sb.append(f0(iC % 45));
            i2 -= 2;
        }
        if (i2 == 1) {
            if (l70Var.a() < 6) {
                throw at2.a();
            }
            sb.append(f0(l70Var.c(6)));
        }
        if (z2) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i3 = length + 1;
                        if (sb.charAt(i3) == '%') {
                            sb.deleteCharAt(i3);
                        } else {
                            sb.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0147  */
    /* JADX WARN: Code duplicated, block: B:121:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0157  */
    /* JADX WARN: Code duplicated, block: B:125:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0160  */
    /* JADX WARN: Code duplicated, block: B:129:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x016f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0178  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:140:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x018e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0196  */
    /* JADX WARN: Code duplicated, block: B:155:0x0199  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1 A[PHI: r17
      0x00f1: PHI (r17v2 int) = (r17v1 int), (r17v1 int), (r17v4 int), (r17v1 int) binds: [B:68:0x00d5, B:74:0x00e1, B:81:0x00ef, B:80:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109 A[PHI: r28
      0x0109: PHI (r28v6 boolean) = (r28v5 boolean), (r28v5 boolean), (r28v5 boolean), (r28v7 boolean), (r28v7 boolean), (r28v7 boolean) binds: [B:95:0x010f, B:97:0x0113, B:99:0x0117, B:86:0x00fb, B:88:0x00ff, B:90:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    public static void w(l70 l70Var, StringBuilder sb, int i2, un0 un0Var, ArrayList arrayList, Map map) throws at2 {
        Charset charsetForName;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        boolean z7;
        Charset charset;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        byte b2;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        byte b3;
        if (i2 * 8 > l70Var.a()) {
            throw at2.a();
        }
        byte[] bArr = new byte[i2];
        int i12 = 0;
        for (int i13 = 0; i13 < i2; i13++) {
            bArr[i13] = (byte) l70Var.c(8);
        }
        if (un0Var == null) {
            Charset charset2 = mb7.b;
            if (map != null) {
                pi1 pi1Var = pi1.CHARACTER_SET;
                if (map.containsKey(pi1Var)) {
                    charsetForName = Charset.forName(map.get(pi1Var).toString());
                } else {
                    z2 = true;
                    if (i2 > 2 || !(((b3 = bArr[0]) == -2 && bArr[1] == -1) || (b3 == -1 && bArr[1] == -2))) {
                        if (charset2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i2 <= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i14 = 0;
                        int i15 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i7 = 0;
                        i8 = 0;
                        i9 = 0;
                        int i16 = 0;
                        int i17 = 0;
                        z5 = z3;
                        z6 = true;
                        while (i3 < i2 && (z2 || z5 || z6)) {
                            z11 = z2;
                            b2 = bArr[i3];
                            Charset charset3 = charset2;
                            i10 = b2 & 255;
                            if (z6) {
                                if (i4 > 0) {
                                    if ((b2 & 128) != 0) {
                                        i4--;
                                    }
                                    if (!z11) {
                                        z13 = z11;
                                    } else if (i10 > 127 || i10 >= 160) {
                                        if (i10 > 159 && (i10 < 192 || i10 == 215 || i10 == 247)) {
                                            i9++;
                                        }
                                        z13 = z11;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z5) {
                                        z14 = z13;
                                    } else if (i5 > 0) {
                                        z14 = z13;
                                        if (i10 >= 64 || i10 == 127 || i10 > 252) {
                                            z5 = false;
                                        } else {
                                            i5--;
                                        }
                                    } else {
                                        z14 = z13;
                                        if (i10 != 128 || i10 == 160 || i10 > 239) {
                                            z5 = false;
                                        } else if (i10 <= 160 || i10 >= 224) {
                                            if (i10 > 127) {
                                                i5++;
                                                int i18 = i16 + 1;
                                                if (i18 > i14) {
                                                    i14 = i18;
                                                    i16 = i14;
                                                } else {
                                                    i16 = i18;
                                                }
                                            } else {
                                                i16 = 0;
                                            }
                                            i17 = 0;
                                        } else {
                                            i15++;
                                            int i19 = i17 + 1;
                                            if (i19 > i12) {
                                                i12 = i19;
                                                i17 = i12;
                                            } else {
                                                i17 = i19;
                                            }
                                            i16 = 0;
                                        }
                                    }
                                    i3++;
                                    z2 = z14;
                                    charset2 = charset3;
                                } else {
                                    z12 = z6;
                                    if ((b2 & 128) != 0) {
                                        if ((b2 & 64) != 0) {
                                            i11 = i4 + 1;
                                            if ((b2 & 32) == 0) {
                                                i6++;
                                            } else {
                                                i11 = i4 + 2;
                                                if ((b2 & 16) == 0) {
                                                    i7++;
                                                } else {
                                                    i4 += 3;
                                                    if ((b2 & 8) == 0) {
                                                        i8++;
                                                    }
                                                    if (!z11) {
                                                        z13 = z11;
                                                    } else {
                                                        if (i10 > 127) {
                                                        }
                                                        if (i10 > 159) {
                                                            i9++;
                                                        }
                                                        z13 = z11;
                                                    }
                                                    if (z5) {
                                                        z14 = z13;
                                                    } else if (i5 > 0) {
                                                        z14 = z13;
                                                        if (i10 >= 64) {
                                                            z5 = false;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                    } else {
                                                        z14 = z13;
                                                        if (i10 != 128) {
                                                            z5 = false;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                    }
                                                    i3++;
                                                    z2 = z14;
                                                    charset2 = charset3;
                                                }
                                            }
                                            i4 = i11;
                                        }
                                    }
                                }
                                z6 = false;
                                if (!z11) {
                                    z13 = z11;
                                } else {
                                    if (i10 > 127) {
                                    }
                                    if (i10 > 159) {
                                        i9++;
                                    }
                                    z13 = z11;
                                }
                                if (z5) {
                                    z14 = z13;
                                } else if (i5 > 0) {
                                    z14 = z13;
                                    if (i10 >= 64) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                } else {
                                    z14 = z13;
                                    if (i10 != 128) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                i3++;
                                z2 = z14;
                                charset2 = charset3;
                            } else {
                                z12 = z6;
                            }
                            z6 = z12;
                            if (!z11) {
                                z13 = z11;
                            } else {
                                if (i10 > 127) {
                                }
                                if (i10 > 159) {
                                    i9++;
                                }
                                z13 = z11;
                            }
                            if (z5) {
                                z14 = z13;
                            } else if (i5 > 0) {
                                z14 = z13;
                                if (i10 >= 64) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z14 = z13;
                                if (i10 != 128) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            }
                            i3++;
                            z2 = z14;
                            charset2 = charset3;
                        }
                        z7 = z2;
                        charset = charset2;
                        z8 = z6;
                        if (z8 || i4 <= 0) {
                            z9 = z8;
                        } else {
                            z9 = false;
                        }
                        if (z5 || i5 <= 0) {
                            z10 = z5;
                        } else {
                            z10 = false;
                        }
                        if (!z9 && (z4 || i6 + i7 + i8 > 0)) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else if (!z10 && (mb7.d || i12 >= 3 || i14 >= 3)) {
                            charsetForName = charset;
                        } else if (z7 || !z10) {
                            if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (!(i12 == 2 && i15 == 2) && i9 * 10 < i2) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else {
                            charsetForName = charset;
                        }
                    } else {
                        charsetForName = StandardCharsets.UTF_16;
                    }
                }
            } else {
                z2 = true;
                if (i2 > 2) {
                    if (charset2 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i2 <= 3) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    int i110 = 0;
                    int i111 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    int i112 = 0;
                    int i113 = 0;
                    z5 = z3;
                    z6 = true;
                    while (i3 < i2) {
                        z11 = z2;
                        b2 = bArr[i3];
                        Charset charset4 = charset2;
                        i10 = b2 & 255;
                        if (z6) {
                            if (i4 > 0) {
                                if ((b2 & 128) != 0) {
                                    i4--;
                                }
                                if (!z11) {
                                    z13 = z11;
                                } else {
                                    if (i10 > 127) {
                                    }
                                    if (i10 > 159) {
                                        i9++;
                                    }
                                    z13 = z11;
                                }
                                if (z5) {
                                    z14 = z13;
                                } else if (i5 > 0) {
                                    z14 = z13;
                                    if (i10 >= 64) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                } else {
                                    z14 = z13;
                                    if (i10 != 128) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                i3++;
                                z2 = z14;
                                charset2 = charset4;
                            } else {
                                z12 = z6;
                                if ((b2 & 128) != 0) {
                                    if ((b2 & 64) != 0) {
                                        i11 = i4 + 1;
                                        if ((b2 & 32) == 0) {
                                            i6++;
                                        } else {
                                            i11 = i4 + 2;
                                            if ((b2 & 16) == 0) {
                                                i7++;
                                            } else {
                                                i4 += 3;
                                                if ((b2 & 8) == 0) {
                                                    i8++;
                                                }
                                                if (!z11) {
                                                    z13 = z11;
                                                } else {
                                                    if (i10 > 127) {
                                                    }
                                                    if (i10 > 159) {
                                                        i9++;
                                                    }
                                                    z13 = z11;
                                                }
                                                if (z5) {
                                                    z14 = z13;
                                                } else if (i5 > 0) {
                                                    z14 = z13;
                                                    if (i10 >= 64) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } else {
                                                    z14 = z13;
                                                    if (i10 != 128) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                }
                                                i3++;
                                                z2 = z14;
                                                charset2 = charset4;
                                            }
                                        }
                                        i4 = i11;
                                    }
                                }
                            }
                            z6 = false;
                            if (!z11) {
                                z13 = z11;
                            } else {
                                if (i10 > 127) {
                                }
                                if (i10 > 159) {
                                    i9++;
                                }
                                z13 = z11;
                            }
                            if (z5) {
                                z14 = z13;
                            } else if (i5 > 0) {
                                z14 = z13;
                                if (i10 >= 64) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z14 = z13;
                                if (i10 != 128) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            }
                            i3++;
                            z2 = z14;
                            charset2 = charset4;
                        } else {
                            z12 = z6;
                        }
                        z6 = z12;
                        if (!z11) {
                            z13 = z11;
                        } else {
                            if (i10 > 127) {
                            }
                            if (i10 > 159) {
                                i9++;
                            }
                            z13 = z11;
                        }
                        if (z5) {
                            z14 = z13;
                        } else if (i5 > 0) {
                            z14 = z13;
                            if (i10 >= 64) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                        } else {
                            z14 = z13;
                            if (i10 != 128) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                        }
                        i3++;
                        z2 = z14;
                        charset2 = charset4;
                    }
                    z7 = z2;
                    charset = charset2;
                    z8 = z6;
                    if (z8) {
                        z9 = z8;
                    } else {
                        z9 = z8;
                    }
                    if (z5) {
                        z10 = z5;
                    } else {
                        z10 = z5;
                    }
                    if (!z9) {
                        if (!z10) {
                            if (z7) {
                                if (z7) {
                                    charsetForName = StandardCharsets.ISO_8859_1;
                                } else if (z10) {
                                    charsetForName = charset;
                                } else if (z9) {
                                    charsetForName = StandardCharsets.UTF_8;
                                } else {
                                    charsetForName = mb7.a;
                                }
                            } else if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (z7) {
                            if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (z7) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z10) {
                            charsetForName = charset;
                        } else if (z9) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = mb7.a;
                        }
                    } else if (!z10) {
                        if (z7) {
                            if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (z7) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z10) {
                            charsetForName = charset;
                        } else if (z9) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = mb7.a;
                        }
                    } else if (z7) {
                        if (z7) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z10) {
                            charsetForName = charset;
                        } else if (z9) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = mb7.a;
                        }
                    } else if (z7) {
                        charsetForName = StandardCharsets.ISO_8859_1;
                    } else if (z10) {
                        charsetForName = charset;
                    } else if (z9) {
                        charsetForName = StandardCharsets.UTF_8;
                    } else {
                        charsetForName = mb7.a;
                    }
                } else {
                    if (charset2 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i2 <= 3) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    int i114 = 0;
                    int i115 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    int i116 = 0;
                    int i117 = 0;
                    z5 = z3;
                    z6 = true;
                    while (i3 < i2) {
                        z11 = z2;
                        b2 = bArr[i3];
                        Charset charset5 = charset2;
                        i10 = b2 & 255;
                        if (z6) {
                            if (i4 > 0) {
                                if ((b2 & 128) != 0) {
                                    i4--;
                                }
                                if (!z11) {
                                    z13 = z11;
                                } else {
                                    if (i10 > 127) {
                                    }
                                    if (i10 > 159) {
                                        i9++;
                                    }
                                    z13 = z11;
                                }
                                if (z5) {
                                    z14 = z13;
                                } else if (i5 > 0) {
                                    z14 = z13;
                                    if (i10 >= 64) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                } else {
                                    z14 = z13;
                                    if (i10 != 128) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                i3++;
                                z2 = z14;
                                charset2 = charset5;
                            } else {
                                z12 = z6;
                                if ((b2 & 128) != 0) {
                                    if ((b2 & 64) != 0) {
                                        i11 = i4 + 1;
                                        if ((b2 & 32) == 0) {
                                            i6++;
                                        } else {
                                            i11 = i4 + 2;
                                            if ((b2 & 16) == 0) {
                                                i7++;
                                            } else {
                                                i4 += 3;
                                                if ((b2 & 8) == 0) {
                                                    i8++;
                                                }
                                                if (!z11) {
                                                    z13 = z11;
                                                } else {
                                                    if (i10 > 127) {
                                                    }
                                                    if (i10 > 159) {
                                                        i9++;
                                                    }
                                                    z13 = z11;
                                                }
                                                if (z5) {
                                                    z14 = z13;
                                                } else if (i5 > 0) {
                                                    z14 = z13;
                                                    if (i10 >= 64) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } else {
                                                    z14 = z13;
                                                    if (i10 != 128) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                }
                                                i3++;
                                                z2 = z14;
                                                charset2 = charset5;
                                            }
                                        }
                                        i4 = i11;
                                    }
                                }
                            }
                            z6 = false;
                            if (!z11) {
                                z13 = z11;
                            } else {
                                if (i10 > 127) {
                                }
                                if (i10 > 159) {
                                    i9++;
                                }
                                z13 = z11;
                            }
                            if (z5) {
                                z14 = z13;
                            } else if (i5 > 0) {
                                z14 = z13;
                                if (i10 >= 64) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z14 = z13;
                                if (i10 != 128) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            }
                            i3++;
                            z2 = z14;
                            charset2 = charset5;
                        } else {
                            z12 = z6;
                        }
                        z6 = z12;
                        if (!z11) {
                            z13 = z11;
                        } else {
                            if (i10 > 127) {
                            }
                            if (i10 > 159) {
                                i9++;
                            }
                            z13 = z11;
                        }
                        if (z5) {
                            z14 = z13;
                        } else if (i5 > 0) {
                            z14 = z13;
                            if (i10 >= 64) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                        } else {
                            z14 = z13;
                            if (i10 != 128) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                        }
                        i3++;
                        z2 = z14;
                        charset2 = charset5;
                    }
                    z7 = z2;
                    charset = charset2;
                    z8 = z6;
                    if (z8) {
                        z9 = z8;
                    } else {
                        z9 = z8;
                    }
                    if (z5) {
                        z10 = z5;
                    } else {
                        z10 = z5;
                    }
                    if (!z9) {
                        if (!z10) {
                            if (z7) {
                                if (z7) {
                                    charsetForName = StandardCharsets.ISO_8859_1;
                                } else if (z10) {
                                    charsetForName = charset;
                                } else if (z9) {
                                    charsetForName = StandardCharsets.UTF_8;
                                } else {
                                    charsetForName = mb7.a;
                                }
                            } else if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (z7) {
                            if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (z7) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z10) {
                            charsetForName = charset;
                        } else if (z9) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = mb7.a;
                        }
                    } else if (!z10) {
                        if (z7) {
                            if (z7) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z10) {
                                charsetForName = charset;
                            } else if (z9) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = mb7.a;
                            }
                        } else if (z7) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z10) {
                            charsetForName = charset;
                        } else if (z9) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = mb7.a;
                        }
                    } else if (z7) {
                        if (z7) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z10) {
                            charsetForName = charset;
                        } else if (z9) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = mb7.a;
                        }
                    } else if (z7) {
                        charsetForName = StandardCharsets.ISO_8859_1;
                    } else if (z10) {
                        charsetForName = charset;
                    } else if (z9) {
                        charsetForName = StandardCharsets.UTF_8;
                    } else {
                        charsetForName = mb7.a;
                    }
                }
            }
        } else {
            charsetForName = Charset.forName(un0Var.name());
        }
        sb.append(new String(bArr, charsetForName));
        arrayList.add(bArr);
    }

    public static void x(l70 l70Var, StringBuilder sb, int i2) throws at2 {
        if (mb7.c == null) {
            throw at2.a();
        }
        if (i2 * 13 > l70Var.a()) {
            throw at2.a();
        }
        byte[] bArr = new byte[i2 * 2];
        int i3 = 0;
        while (i2 > 0) {
            int iC = l70Var.c(13);
            int i4 = (iC % 96) | ((iC / 96) << 8);
            int i5 = i4 + (i4 < 2560 ? 41377 : 42657);
            bArr[i3] = (byte) ((i5 >> 8) & 255);
            bArr[i3 + 1] = (byte) (i5 & 255);
            i3 += 2;
            i2--;
        }
        sb.append(new String(bArr, mb7.c));
    }

    public static void y(l70 l70Var, StringBuilder sb, int i2) throws at2 {
        if (mb7.b == null) {
            throw at2.a();
        }
        if (i2 * 13 > l70Var.a()) {
            throw at2.a();
        }
        byte[] bArr = new byte[i2 * 2];
        int i3 = 0;
        while (i2 > 0) {
            int iC = l70Var.c(13);
            int i4 = (iC % 192) | ((iC / 192) << 8);
            int i5 = i4 + (i4 < 7936 ? 33088 : 49472);
            bArr[i3] = (byte) (i5 >> 8);
            bArr[i3 + 1] = (byte) i5;
            i3 += 2;
            i2--;
        }
        sb.append(new String(bArr, mb7.b));
    }

    public static void z(l70 l70Var, StringBuilder sb, int i2) throws at2 {
        while (i2 >= 3) {
            if (l70Var.a() < 10) {
                throw at2.a();
            }
            int iC = l70Var.c(10);
            if (iC >= 1000) {
                throw at2.a();
            }
            sb.append(f0(iC / 100));
            sb.append(f0((iC / 10) % 10));
            sb.append(f0(iC % 10));
            i2 -= 3;
        }
        if (i2 == 2) {
            if (l70Var.a() < 7) {
                throw at2.a();
            }
            int iC2 = l70Var.c(7);
            if (iC2 >= 100) {
                throw at2.a();
            }
            sb.append(f0(iC2 / 10));
            sb.append(f0(iC2 % 10));
            return;
        }
        if (i2 == 1) {
            if (l70Var.a() < 4) {
                throw at2.a();
            }
            int iC3 = l70Var.c(4);
            if (iC3 >= 10) {
                throw at2.a();
            }
            sb.append(f0(iC3));
        }
    }
}
