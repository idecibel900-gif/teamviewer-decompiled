package o;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r73 {
    public static final z63 A;
    public static final a73 B;
    public static final b73 C;
    public static final c73 D;
    public static final d73 E;
    public static final f73 F;
    public static final g73 G;
    public static final h73 H;
    public static final i73 I;
    public static final /* synthetic */ r73[] J;
    public static final e73 m;
    public static final j73 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k73 f1897o;
    public static final l73 p;
    public static final m73 q;
    public static final n73 r;
    public static final o73 s;
    public static final p73 t;
    public static final q73 u;
    public static final u63 v;
    public static final v63 w;
    public static final w63 x;
    public static final x63 y;
    public static final y63 z;

    static {
        e73 e73Var = new e73();
        m = e73Var;
        j73 j73Var = new j73();
        n = j73Var;
        k73 k73Var = new k73();
        f1897o = k73Var;
        l73 l73Var = new l73();
        p = l73Var;
        m73 m73Var = new m73();
        q = m73Var;
        n73 n73Var = new n73();
        r = n73Var;
        o73 o73Var = new o73();
        s = o73Var;
        p73 p73Var = new p73();
        t = p73Var;
        q73 q73Var = new q73();
        u = q73Var;
        u63 u63Var = new u63();
        v = u63Var;
        v63 v63Var = new v63();
        w = v63Var;
        w63 w63Var = new w63();
        x = w63Var;
        x63 x63Var = new x63();
        y = x63Var;
        y63 y63Var = new y63();
        z = y63Var;
        z63 z63Var = new z63();
        A = z63Var;
        a73 a73Var = new a73();
        B = a73Var;
        b73 b73Var = new b73();
        C = b73Var;
        c73 c73Var = new c73();
        D = c73Var;
        d73 d73Var = new d73();
        E = d73Var;
        f73 f73Var = new f73();
        F = f73Var;
        g73 g73Var = new g73();
        G = g73Var;
        h73 h73Var = new h73();
        H = h73Var;
        i73 i73Var = new i73();
        I = i73Var;
        J = new r73[]{e73Var, j73Var, k73Var, l73Var, m73Var, n73Var, o73Var, p73Var, q73Var, u63Var, v63Var, w63Var, x63Var, y63Var, z63Var, a73Var, b73Var, c73Var, d73Var, f73Var, g73Var, h73Var, i73Var};
        String.valueOf((char) 0);
    }

    public static void a(ew7 ew7Var, t63 t63Var, cz7 cz7Var) {
        if (cz7Var != null) {
            t63Var.c.m(cz7Var);
        }
        t63Var.n = t63Var.m;
        t63Var.m = s;
        t63Var.M(ew7Var);
    }

    public static boolean b(sj5 sj5Var) {
        if (sj5Var.a == 5) {
            return lb7.f(((zv7) sj5Var).d.F());
        }
        return false;
    }

    public static void c(ew7 ew7Var, o82 o82Var) {
        int iT;
        s06 s06VarR;
        q06 q06Var;
        if (ew7Var.g != null) {
            ew7Var.j(ew7Var.k.g);
            ly lyVar = ew7Var.g;
            lyVar.getClass();
            ky kyVar = new ky(lyVar);
            while (kyVar.hasNext()) {
                jy jyVar = (jy) kyVar.next();
                String str = jyVar.m;
                ly lyVarG = o82Var.g();
                if (lyVarG.l(str) == -1) {
                    ly lyVar2 = jyVar.f1210o;
                    if (lyVar2 == null || (iT = lyVar2.t(str)) == -1 || (s06VarR = lyVar2.r()) == null || iT < 0) {
                        q06Var = q06.f;
                    } else {
                        int[] iArr = s06VarR.f;
                        int i = iT * 4;
                        int i2 = i + 2;
                        int i3 = i + 3;
                        if (i3 >= iArr.length) {
                            q06Var = q06.f;
                        } else {
                            int i4 = iArr[i];
                            q06Var = i4 == -1 ? q06.f : new q06(s06VarR.a, i4, iArr[i + 1], iArr[i2], iArr[i3]);
                        }
                    }
                    lyVarG.o(str, ly.c(jyVar.n));
                    jyVar.f1210o = lyVarG;
                    db8.o0(q06Var);
                    int iT2 = lyVarG.t(str);
                    if (iT2 != -1 && q06Var.b != -1) {
                        s06 s06VarR2 = lyVarG.r();
                        if (s06VarR2 == null) {
                            s06VarR2 = new s06();
                            lyVarG.a(s06VarR2, "/jsoup.spans");
                        }
                        r94 r94Var = q06Var.a;
                        int i5 = q06Var.b;
                        int i6 = q06Var.c;
                        int i7 = q06Var.d;
                        int i8 = q06Var.e;
                        if (i5 < 0 || i6 < 0 || i7 < 0 || i8 < 0) {
                            hk0.g("Attribute range positions must be non-negative");
                        } else {
                            r94 r94Var2 = s06VarR2.a;
                            if (r94Var2 == t06.d) {
                                s06VarR2.a = r94Var;
                            } else if (r94Var2 != r94Var) {
                                hk0.g("Source ranges must come from the same parse");
                            }
                            int i9 = iT2 * 4;
                            int i10 = i9 + 2;
                            int i11 = i9 + 4;
                            int[] iArr2 = s06VarR2.f;
                            if (iArr2.length < i11) {
                                int length = iArr2.length;
                                int[] iArrCopyOf = Arrays.copyOf(iArr2, i11);
                                s06VarR2.f = iArrCopyOf;
                                Arrays.fill(iArrCopyOf, length, iArrCopyOf.length, -1);
                            }
                            int[] iArr3 = s06VarR2.f;
                            iArr3[i9] = i5;
                            iArr3[i9 + 1] = i6;
                            iArr3[i10] = i7;
                            iArr3[i9 + 3] = i8;
                        }
                    }
                }
            }
        }
    }

    public static r73 valueOf(String str) {
        return (r73) Enum.valueOf(r73.class, str);
    }

    public static r73[] values() {
        return (r73[]) J.clone();
    }

    public boolean d(sj5 sj5Var, t63 t63Var) {
        boolean zD = sj5Var.d();
        p73 p73Var = t;
        if (zD && ((dw7) sj5Var).m().equals("caption")) {
            if (!t63Var.H(8, "caption")) {
                t63Var.C(this);
                return false;
            }
            t63Var.E(false);
            if (!t63Var.d("caption", "http://www.w3.org/1999/xhtml")) {
                t63Var.C(this);
            }
            t63Var.T("caption");
            t63Var.u();
            t63Var.m = p73Var;
            return true;
        }
        if ((!sj5Var.e() || !lb7.d(((ew7) sj5Var).m(), vn4.S)) && (!sj5Var.d() || !((dw7) sj5Var).m().equals("table"))) {
            if (!sj5Var.d() || !lb7.d(((dw7) sj5Var).m(), vn4.c0)) {
                return r.d(sj5Var, t63Var);
            }
            t63Var.C(this);
            return false;
        }
        if (!t63Var.H(8, "caption")) {
            t63Var.C(this);
            return false;
        }
        t63Var.E(false);
        if (!t63Var.d("caption", "http://www.w3.org/1999/xhtml")) {
            t63Var.C(this);
        }
        t63Var.T("caption");
        t63Var.u();
        t63Var.m = p73Var;
        p73Var.d(sj5Var, t63Var);
        return true;
    }
}
