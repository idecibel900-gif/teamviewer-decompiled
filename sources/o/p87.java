package o;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p87 {
    public static final ht2 a;
    public static final ht2 b;
    public static final ht2 c;
    public static final ht2 d;
    public static final ht2 e;
    public static final ht2 f;
    public static final ht2 g;
    public static final js0 h;
    public static final js0 i;
    public static final js0 j;
    public static final js0 k;
    public static final js0 l;
    public static final js0 m;
    public static final js0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final js0 f1714o;
    public static final js0 p;
    public static final js0 q;
    public static final Set r;
    public static final Set s;
    public static final js0 t;
    public static final js0 u;
    public static final js0 v;
    public static final js0 w;

    static {
        ht2 ht2Var = new ht2("kotlin");
        a = ht2Var;
        ht2 ht2VarC = ht2Var.c(sy4.e("reflect"));
        b = ht2VarC;
        ht2 ht2VarC2 = ht2Var.c(sy4.e("collections"));
        c = ht2VarC2;
        ht2 ht2VarC3 = ht2Var.c(sy4.e("ranges"));
        d = ht2VarC3;
        ht2 ht2VarC4 = ht2Var.c(sy4.e(DebugImage.JVM));
        ht2VarC4.c(sy4.e("internal"));
        ht2VarC4.c(sy4.e("functions"));
        ht2 ht2VarC5 = ht2Var.c(sy4.e("annotation"));
        e = ht2VarC5;
        ht2 ht2VarC6 = ht2Var.c(sy4.e("internal"));
        ht2VarC6.c(sy4.e("ir"));
        ht2 ht2VarC7 = ht2Var.c(sy4.e("coroutines"));
        f = ht2VarC7;
        g = ht2Var.c(sy4.e("enums"));
        ht2Var.c(sy4.e("contracts"));
        ht2Var.c(sy4.e("concurrent"));
        ht2Var.c(sy4.e("test"));
        cx.h1(new ht2[]{ht2Var, ht2VarC2, ht2VarC3, ht2VarC5});
        cx.h1(new ht2[]{ht2Var, ht2VarC2, ht2VarC3, ht2VarC5, ht2VarC, ht2VarC6, ht2VarC7});
        r47.i("Nothing");
        h = r47.i("Unit");
        i = r47.i("Any");
        j = r47.i("Enum");
        r47.i("Annotation");
        k = r47.i("Array");
        js0 js0VarI = r47.i("Boolean");
        js0 js0VarI2 = r47.i("Char");
        js0 js0VarI3 = r47.i("Byte");
        js0 js0VarI4 = r47.i("Short");
        js0 js0VarI5 = r47.i("Int");
        js0 js0VarI6 = r47.i("Long");
        js0 js0VarI7 = r47.i("Float");
        js0 js0VarI8 = r47.i("Double");
        l = r47.D(js0VarI3);
        m = r47.D(js0VarI4);
        n = r47.D(js0VarI5);
        f1714o = r47.D(js0VarI6);
        r47.i("CharSequence");
        p = r47.i("String");
        r47.i("Throwable");
        r47.i("Cloneable");
        r47.B("KProperty");
        r47.B("KMutableProperty");
        r47.B("KProperty0");
        r47.B("KMutableProperty0");
        r47.B("KProperty1");
        r47.B("KMutableProperty1");
        r47.B("KProperty2");
        r47.B("KMutableProperty2");
        q = r47.B("KFunction");
        r47.B("KClass");
        r47.B("KCallable");
        r47.B("KType");
        r47.i("Comparable");
        r47.i("Number");
        r47.i("Function");
        Set setH1 = cx.h1(new js0[]{js0VarI, js0VarI2, js0VarI3, js0VarI4, js0VarI5, js0VarI6, js0VarI7, js0VarI8});
        r = setH1;
        cx.h1(new js0[]{js0VarI3, js0VarI4, js0VarI5, js0VarI6});
        Set set = setH1;
        int iQ = xm4.Q(mv0.Z(set, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
        for (Object obj : set) {
            linkedHashMap.put(obj, r47.A(((js0) obj).f()));
        }
        r47.y(linkedHashMap);
        Set setH2 = cx.h1(new js0[]{l, m, n, f1714o});
        s = setH2;
        Set set2 = setH2;
        int iQ2 = xm4.Q(mv0.Z(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iQ2 >= 16 ? iQ2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, r47.A(((js0) obj2).f()));
        }
        r47.y(linkedHashMap2);
        Set set3 = r;
        Set set4 = s;
        LinkedHashSet linkedHashSetA0 = fv6.a0(set3, set4);
        js0 js0Var = p;
        fv6.b0(linkedHashSetA0, js0Var);
        ht2 ht2Var2 = f;
        sy4 sy4VarE = sy4.e("Continuation");
        ht2Var2.getClass();
        ht2.j(sy4VarE).d();
        r47.k("Iterator");
        r47.k("Iterable");
        r47.k("Collection");
        r47.k("List");
        r47.k("ListIterator");
        r47.k("Set");
        js0 js0VarK = r47.k("Map");
        r47.k("MutableIterator");
        r47.k("CharIterator");
        r47.k("MutableIterable");
        r47.k("MutableCollection");
        t = r47.k("MutableList");
        r47.k("MutableListIterator");
        u = r47.k("MutableSet");
        js0 js0VarK2 = r47.k("MutableMap");
        v = js0VarK2;
        js0VarK.d(sy4.e("Entry"));
        js0VarK2.d(sy4.e("MutableEntry"));
        r47.i("Result");
        ht2 ht2Var3 = d;
        sy4 sy4VarE2 = sy4.e("IntRange");
        ht2Var3.getClass();
        ht2.j(sy4VarE2).d();
        ht2.j(sy4.e("LongRange")).d();
        ht2.j(sy4.e("CharRange")).d();
        ht2 ht2Var4 = e;
        sy4 sy4VarE3 = sy4.e("AnnotationRetention");
        ht2Var4.getClass();
        ht2.j(sy4VarE3).d();
        ht2.j(sy4.e("AnnotationTarget")).d();
        r47.i("DeprecationLevel");
        w = new js0(g, sy4.e("EnumEntries"));
        fv6.b0(fv6.b0(fv6.b0(fv6.b0(fv6.a0(set3, set4), js0Var), h), i), j);
    }
}
