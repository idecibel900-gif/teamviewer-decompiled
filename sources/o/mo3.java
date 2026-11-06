package o;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mo3 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final js0 e;
    public static final ht2 f;
    public static final js0 g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    static {
        StringBuilder sb = new StringBuilder();
        dx2 dx2Var = dx2.c;
        sb.append(dx2Var.a);
        sb.append('.');
        sb.append(dx2Var.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        ex2 ex2Var = ex2.c;
        sb2.append(ex2Var.a);
        sb2.append('.');
        sb2.append(ex2Var.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        gx2 gx2Var = gx2.c;
        sb3.append(gx2Var.a);
        sb3.append('.');
        sb3.append(gx2Var.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        fx2 fx2Var = fx2.c;
        sb4.append(fx2Var.a);
        sb4.append('.');
        sb4.append(fx2Var.b);
        d = sb4.toString();
        js0 js0VarH0 = im3.h0(new ht2("kotlin.jvm.functions.FunctionN"));
        e = js0VarH0;
        f = js0VarH0.a();
        g = p87.q;
        d(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        js0 js0VarH1 = im3.h0(s87.B);
        ht2 ht2Var = s87.J;
        ht2 ht2Var2 = js0VarH1.a;
        lo3 lo3Var = new lo3(d(Iterable.class), js0VarH1, new js0(ht2Var2, vt1.N(ht2Var, ht2Var2), false));
        js0 js0VarH2 = im3.h0(s87.A);
        ht2 ht2Var3 = s87.I;
        ht2 ht2Var4 = js0VarH2.a;
        lo3 lo3Var2 = new lo3(d(Iterator.class), js0VarH2, new js0(ht2Var4, vt1.N(ht2Var3, ht2Var4), false));
        js0 js0VarH3 = im3.h0(s87.C);
        ht2 ht2Var5 = s87.K;
        ht2 ht2Var6 = js0VarH3.a;
        lo3 lo3Var3 = new lo3(d(Collection.class), js0VarH3, new js0(ht2Var6, vt1.N(ht2Var5, ht2Var6), false));
        js0 js0VarH4 = im3.h0(s87.D);
        ht2 ht2Var7 = s87.L;
        ht2 ht2Var8 = js0VarH4.a;
        lo3 lo3Var4 = new lo3(d(List.class), js0VarH4, new js0(ht2Var8, vt1.N(ht2Var7, ht2Var8), false));
        js0 js0VarH5 = im3.h0(s87.F);
        ht2 ht2Var9 = s87.N;
        ht2 ht2Var10 = js0VarH5.a;
        lo3 lo3Var5 = new lo3(d(Set.class), js0VarH5, new js0(ht2Var10, vt1.N(ht2Var9, ht2Var10), false));
        js0 js0VarH6 = im3.h0(s87.E);
        ht2 ht2Var11 = s87.M;
        ht2 ht2Var12 = js0VarH6.a;
        lo3 lo3Var6 = new lo3(d(ListIterator.class), js0VarH6, new js0(ht2Var12, vt1.N(ht2Var11, ht2Var12), false));
        ht2 ht2Var13 = s87.G;
        js0 js0VarH7 = im3.h0(ht2Var13);
        ht2 ht2Var14 = s87.O;
        ht2 ht2Var15 = js0VarH7.a;
        lo3 lo3Var7 = new lo3(d(Map.class), js0VarH7, new js0(ht2Var15, vt1.N(ht2Var14, ht2Var15), false));
        js0 js0VarH8 = im3.h0(ht2Var13);
        sy4 sy4VarF = s87.H.f();
        sy4VarF.getClass();
        js0 js0VarD = js0VarH8.d(sy4VarF);
        ht2 ht2Var16 = s87.P;
        ht2 ht2Var17 = js0VarD.a;
        List<lo3> listL = qf0.L(lo3Var, lo3Var2, lo3Var3, lo3Var4, lo3Var5, lo3Var6, lo3Var7, new lo3(d(Map.Entry.class), js0VarD, new js0(ht2Var17, vt1.N(ht2Var16, ht2Var17), false)));
        n = listL;
        c(Object.class, s87.a);
        c(String.class, s87.f);
        c(CharSequence.class, s87.e);
        b(Throwable.class, s87.k);
        c(Cloneable.class, s87.c);
        c(Number.class, s87.i);
        b(Comparable.class, s87.l);
        c(Enum.class, s87.j);
        b(Annotation.class, s87.s);
        for (lo3 lo3Var8 : listL) {
            js0 js0Var = lo3Var8.a;
            js0 js0Var2 = lo3Var8.b;
            js0 js0Var3 = lo3Var8.c;
            a(js0Var, js0Var2);
            i.put(js0Var3.a().i(), js0Var);
            l.put(js0Var3, js0Var2);
            m.put(js0Var2, js0Var3);
            ht2 ht2VarA = js0Var2.a();
            ht2 ht2VarA2 = js0Var3.a();
            j.put(js0Var3.a().i(), ht2VarA);
            k.put(ht2VarA.i(), ht2VarA2);
        }
        for (ts3 ts3Var : ts3.values()) {
            ht2 ht2Var18 = ts3Var.p;
            ht2 ht2VarE = ht2Var18.e();
            sy4 sy4VarF2 = ht2Var18.f();
            sy4VarF2.getClass();
            js0 js0Var4 = new js0(ht2VarE, sy4VarF2);
            ps5 ps5VarC = ts3Var.c();
            ps5VarC.getClass();
            ht2 ht2VarC = t87.l.c(ps5VarC.m);
            ht2 ht2VarE2 = ht2VarC.e();
            sy4 sy4VarF3 = ht2VarC.f();
            sy4VarF3.getClass();
            a(js0Var4, new js0(ht2VarE2, sy4VarF3));
        }
        for (js0 js0Var5 : nx0.a) {
            ht2 ht2Var19 = new ht2("kotlin.jvm.internal." + js0Var5.f().b() + "CompanionObject");
            ht2 ht2VarE3 = ht2Var19.e();
            sy4 sy4VarF4 = ht2Var19.f();
            sy4VarF4.getClass();
            a(new js0(ht2VarE3, sy4VarF4), js0Var5.d(a87.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            ht2 ht2Var20 = new ht2(fx3.e(i2, "kotlin.jvm.functions.Function"));
            ht2 ht2VarE4 = ht2Var20.e();
            sy4 sy4VarF5 = ht2Var20.f();
            sy4VarF5.getClass();
            a(new js0(ht2VarE4, sy4VarF5), new js0(t87.l, sy4.e("Function" + i2)));
            i.put(new ht2(b + i2).i(), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            fx2 fx2Var2 = fx2.c;
            i.put(new ht2(fx3.e(i3, fx2Var2.a + '.' + fx2Var2.b)).i(), g);
        }
        i.put(s87.b.g().i(), d(Void.class));
    }

    public static void a(js0 js0Var, js0 js0Var2) {
        h.put(js0Var.a().i(), js0Var2);
        i.put(js0Var2.a().i(), js0Var);
    }

    public static void b(Class cls, ht2 ht2Var) {
        js0 js0VarD = d(cls);
        ht2Var.getClass();
        ht2 ht2VarE = ht2Var.e();
        sy4 sy4VarF = ht2Var.f();
        sy4VarF.getClass();
        a(js0VarD, new js0(ht2VarE, sy4VarF));
    }

    public static void c(Class cls, it2 it2Var) {
        b(cls, it2Var.g());
    }

    public static js0 d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return d(declaringClass).d(sy4.e(cls.getSimpleName()));
        }
        ht2 ht2Var = new ht2(cls.getCanonicalName());
        ht2 ht2VarE = ht2Var.e();
        sy4 sy4VarF = ht2Var.f();
        sy4VarF.getClass();
        return new js0(ht2VarE, sy4VarF);
    }

    public static boolean e(it2 it2Var, String str) {
        Integer numO;
        String str2 = it2Var.a;
        if (str2 == null) {
            it2.a(4);
            throw null;
        }
        if (bc7.N(false, str2, str)) {
            String strSubstring = str2.substring(str.length());
            if ((strSubstring.length() <= 0 || !qf0.u(strSubstring.charAt(0), '0', false)) && (numO = bc7.O(strSubstring)) != null && numO.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static js0 f(ht2 ht2Var) {
        ht2Var.getClass();
        return (js0) h.get(ht2Var.i());
    }

    public static js0 g(it2 it2Var) {
        if (e(it2Var, a) || e(it2Var, c)) {
            return e;
        }
        return (e(it2Var, b) || e(it2Var, d)) ? g : (js0) i.get(it2Var);
    }
}
