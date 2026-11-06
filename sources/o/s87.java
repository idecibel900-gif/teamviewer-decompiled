package o;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s87 {
    public static final ht2 A;
    public static final ht2 B;
    public static final ht2 C;
    public static final ht2 D;
    public static final ht2 E;
    public static final ht2 F;
    public static final ht2 G;
    public static final ht2 H;
    public static final ht2 I;
    public static final ht2 J;
    public static final ht2 K;
    public static final ht2 L;
    public static final ht2 M;
    public static final ht2 N;
    public static final ht2 O;
    public static final ht2 P;
    public static final it2 Q;
    public static final js0 R;
    public static final js0 S;
    public static final js0 T;
    public static final js0 U;
    public static final js0 V;
    public static final ht2 W;
    public static final ht2 X;
    public static final ht2 Y;
    public static final ht2 Z;
    public static final HashSet a0;
    public static final HashSet b0;
    public static final HashMap c0;
    public static final it2 d;
    public static final HashMap d0;
    public static final it2 e;
    public static final it2 f;
    public static final it2 g;
    public static final it2 h;
    public static final it2 i;
    public static final it2 j;
    public static final ht2 k;
    public static final ht2 l;
    public static final ht2 m;
    public static final ht2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ht2 f1992o;
    public static final ht2 p;
    public static final ht2 q;
    public static final ht2 r;
    public static final ht2 s;
    public static final ht2 t;
    public static final ht2 u;
    public static final ht2 v;
    public static final ht2 w;
    public static final ht2 x;
    public static final ht2 y;
    public static final ht2 z;
    public static final it2 a = d("Any");
    public static final it2 b = d("Nothing");
    public static final it2 c = d("Cloneable");

    static {
        c("Suppress");
        d = d("Unit");
        e = d("CharSequence");
        f = d("String");
        g = d("Array");
        h = d("Boolean");
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number");
        j = d("Enum");
        d("Function");
        k = c("Throwable");
        l = c("Comparable");
        ht2 ht2Var = t87.f2091o;
        ht2Var.c(sy4.e("IntRange")).i().getClass();
        ht2Var.c(sy4.e("LongRange")).i().getClass();
        m = c("Deprecated");
        c("DeprecatedSinceKotlin");
        n = c("DeprecationLevel");
        f1992o = c("ReplaceWith");
        p = c("ExtensionFunctionType");
        q = c("ContextFunctionTypeParams");
        ht2 ht2VarC = c("ParameterName");
        r = ht2VarC;
        im3.h0(ht2VarC);
        s = c("Annotation");
        ht2 ht2VarA = a("Target");
        t = ht2VarA;
        im3.h0(ht2VarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        ht2 ht2VarA2 = a("Retention");
        w = ht2VarA2;
        im3.h0(ht2VarA2);
        im3.h0(a("Repeatable"));
        x = a("MustBeDocumented");
        y = c("UnsafeVariance");
        c("PublishedApi");
        t87.p.c(sy4.e("AccessibleLateinitPropertyLiteral"));
        ht2 ht2Var2 = new ht2("kotlin.internal.PlatformDependent");
        z = ht2Var2;
        im3.h0(ht2Var2);
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        ht2 ht2VarB = b("Map");
        G = ht2VarB;
        H = ht2VarB.c(sy4.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        ht2 ht2VarB2 = b("MutableMap");
        O = ht2VarB2;
        P = ht2VarB2.c(sy4.e("MutableEntry"));
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        it2 it2VarE = e("KProperty");
        e("KMutableProperty");
        R = im3.h0(it2VarE.g());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        ht2 ht2VarC2 = c("UByte");
        ht2 ht2VarC3 = c("UShort");
        ht2 ht2VarC4 = c("UInt");
        ht2 ht2VarC5 = c("ULong");
        S = im3.h0(ht2VarC2);
        T = im3.h0(ht2VarC3);
        U = im3.h0(ht2VarC4);
        V = im3.h0(ht2VarC5);
        W = c("UByteArray");
        X = c("UShortArray");
        Y = c("UIntArray");
        Z = c("ULongArray");
        int length = ps5.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (ps5 ps5Var : ps5.values()) {
            hashSet.add(ps5Var.m);
        }
        a0 = hashSet;
        int length2 = ps5.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (ps5 ps5Var2 : ps5.values()) {
            hashSet2.add(ps5Var2.n);
        }
        b0 = hashSet2;
        int length3 = ps5.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (ps5 ps5Var3 : ps5.values()) {
            String strB = ps5Var3.m.b();
            strB.getClass();
            map.put(d(strB), ps5Var3);
        }
        c0 = map;
        int length4 = ps5.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (ps5 ps5Var4 : ps5.values()) {
            String strB2 = ps5Var4.n.b();
            strB2.getClass();
            map2.put(d(strB2), ps5Var4);
        }
        d0 = map2;
    }

    public static ht2 a(String str) {
        return t87.m.c(sy4.e(str));
    }

    public static ht2 b(String str) {
        return t87.n.c(sy4.e(str));
    }

    public static ht2 c(String str) {
        return t87.l.c(sy4.e(str));
    }

    public static it2 d(String str) {
        it2 it2VarI = c(str).i();
        it2VarI.getClass();
        return it2VarI;
    }

    public static final it2 e(String str) {
        it2 it2VarI = t87.i.c(sy4.e(str)).i();
        it2VarI.getClass();
        return it2VarI;
    }
}
