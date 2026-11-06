package o;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t63 extends o28 {
    public static final String[] A = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] B = {"desc", "foreignObject", "title"};
    public static final String[] C = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    public r73 m;
    public r73 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2085o;
    public o82 p;
    public ys2 q;
    public o82 r;
    public ArrayList s;
    public ArrayList t;
    public yt2 u;
    public ArrayList v;
    public dw7 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static boolean Q(o82 o82Var) {
        hn7 hn7Var = o82Var.p;
        if ("http://www.w3.org/1998/Math/MathML".equals(hn7Var.m) && o82Var.t("annotation-xml")) {
            String strI = us1.I(o82Var.c("encoding"));
            if (strI.equals("text/html") || strI.equals("application/xhtml+xml")) {
                return true;
            }
        }
        return "http://www.w3.org/2000/svg".equals(hn7Var.m) && lb7.c(hn7Var.n, B);
    }

    public static o82 X(o82 o82Var) {
        o82 o82Var2 = new o82(o82Var.p, null, o82Var.g().clone());
        s06 s06VarO = o82Var2.O();
        if (s06VarO != null) {
            s06VarO.d = -1;
            s06VarO.e = -1;
        }
        return o82Var2;
    }

    public final void A() {
        yt2 yt2Var = this.u;
        if (yt2Var == null) {
            throw new fb8("Bug: noscript fallback closed with no island state");
        }
        o82 o82Var = (o82) yt2Var.n;
        ArrayList arrayList = this.e;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (arrayList.get(size) == o82Var) {
                break;
            } else {
                size--;
            }
        }
        if (size == -1) {
            C(this.m);
            c0();
            return;
        }
        if (ua5.j(1, arrayList) != o82Var) {
            C(this.m);
        }
        while (arrayList.size() > size) {
            m();
        }
        c0();
    }

    public final void B(o82 o82Var) {
        this.u = new yt2((Object) o82Var, (Object) this.q, (byte) 8);
        this.q = null;
    }

    public final void C(r73 r73Var) {
        if (this.a.n.a()) {
            this.a.n.add(new fk3(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.f.getClass().getSimpleName(), this.f, r73Var}));
        }
    }

    public final void D(String str) {
        while (i() && c().p.b(32)) {
            if (str != null && d(str, "http://www.w3.org/1999/xhtml")) {
                return;
            } else {
                m();
            }
        }
    }

    public final void E(boolean z) {
        int i = z ? 64 : 32;
        while (i() && c().p.b(i)) {
            m();
        }
    }

    public final o82 F(String str) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o82 o82Var = (o82) arrayList.get(size);
            if (o82Var.X(str)) {
                return o82Var;
            }
        }
        return null;
    }

    public final boolean G(String str) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o82 o82Var = (o82) arrayList.get(size);
            if (o82Var.p.f993o.equals(str)) {
                return true;
            }
            if (!o82Var.p.b(16)) {
                return false;
            }
        }
        return false;
    }

    public final boolean H(int i, String str) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o82 o82Var = (o82) arrayList.get(size);
            hn7 hn7Var = o82Var.p;
            if ("http://www.w3.org/1999/xhtml".equals(hn7Var.m) && o82Var.p.f993o.equals(str)) {
                return true;
            }
            if (hn7Var.b(i)) {
                return false;
            }
        }
        return false;
    }

    public final void I(zv7 zv7Var, boolean z) {
        lh7 lh7Var = zv7Var.d;
        String strF = lh7Var.F();
        if (strF.indexOf(0) != -1) {
            String strReplace = z ? strF.replace((char) 0, (char) 65533) : strF.replace(zv7.e, "");
            lh7Var.A();
            lh7Var.n = strReplace;
        }
        J(zv7Var, b());
    }

    public final void J(zv7 zv7Var, o82 o82Var) {
        x35 xg1Var;
        String strF = zv7Var.d.F();
        if (zv7Var instanceof yv7) {
            xg1Var = new di0(strF);
        } else {
            xg1Var = o82Var.p.c(256) ? new xg1(strF) : new et7(strF);
        }
        o82Var.Q(xg1Var);
    }

    public final void K(aw7 aw7Var) {
        L(aw7Var, b());
    }

    public final void L(aw7 aw7Var, o82 o82Var) {
        o82Var.Q(new zw0(aw7Var.d.F()));
    }

    public final o82 M(ew7 ew7Var) {
        o82 o82VarY = y(ew7Var, "http://www.w3.org/1999/xhtml", false);
        hn7 hn7Var = o82VarY.p;
        z(o82VarY);
        if (ew7Var.f) {
            hn7Var.p |= 32;
            if (!hn7Var.d()) {
                if ((hn7Var.p & 1) == 0 || !hn7Var.e()) {
                    kw7 kw7Var = this.c;
                    Object[] objArr = {hn7Var.f993o};
                    hg5 hg5Var = kw7Var.b;
                    if (hg5Var.a()) {
                        hg5Var.add(new fk3(kw7Var.a, "Tag [%s] cannot be self-closing; not a void tag", objArr));
                    }
                } else {
                    this.c.m(cz7.m);
                    kw7 kw7Var2 = this.c;
                    dw7 dw7Var = this.w;
                    dw7Var.f();
                    dw7Var.k(hn7Var.n);
                    kw7Var2.g(dw7Var);
                }
            }
        }
        if (hn7Var.d()) {
            m();
        }
        return o82VarY;
    }

    public final o82 N(ew7 ew7Var) {
        o82 o82VarY = y(ew7Var, "http://www.w3.org/1999/xhtml", false);
        z(o82VarY);
        m();
        return o82VarY;
    }

    public final void O(ew7 ew7Var, String str) {
        o82 o82VarY = y(ew7Var, str, true);
        z(o82VarY);
        if (ew7Var.f) {
            o82VarY.p.p |= 32;
            m();
        }
    }

    public final void P(ew7 ew7Var, boolean z, boolean z2) {
        ys2 ys2Var = (ys2) y(ew7Var, "http://www.w3.org/1999/xhtml", false);
        if (!z2 || !R("template")) {
            this.q = ys2Var;
        }
        z(ys2Var);
        if (z) {
            return;
        }
        m();
    }

    public final boolean R(String str) {
        return F(str) != null;
    }

    public final boolean S(String[] strArr) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!lb7.d(((o82) arrayList.get(size)).p.f993o, strArr)) {
                return true;
            }
        }
        return false;
    }

    public final void T(String str) {
        for (int size = this.e.size() - 1; size >= 0 && !m().X(str); size--) {
        }
    }

    public final void U() {
        if (this.t.size() > 0) {
            ArrayList arrayList = this.t;
        }
    }

    public final void V(r73 r73Var) {
        this.t.add(r73Var);
    }

    public final void W() {
        boolean z = true;
        o82 o82Var = this.s.size() > 0 ? (o82) ua5.j(1, this.s) : null;
        if (o82Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList.contains(o82Var)) {
            return;
        }
        int size = this.s.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            o82Var = (o82) this.s.get(i3);
            if (o82Var == null || arrayList.contains(o82Var)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                o82Var = (o82) this.s.get(i3);
            }
            db8.o0(o82Var);
            o82 o82VarX = X(o82Var);
            z(o82VarX);
            this.s.set(i3, o82VarX);
            if (i3 == i2) {
                return;
            } else {
                z = false;
            }
        }
    }

    public final void Y(o82 o82Var) {
        for (int size = this.s.size() - 1; size >= 0; size--) {
            if (((o82) this.s.get(size)) == o82Var) {
                this.s.remove(size);
                return;
            }
        }
    }

    public final void Z(o82 o82Var) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o82) arrayList.get(size)) == o82Var) {
                arrayList.remove(size);
                return;
            }
        }
    }

    @Override // o.o28
    public final List a() {
        List list;
        o82 o82Var = this.r;
        if (o82Var == null) {
            return this.d.l();
        }
        o82 o82Var2 = o82Var.m;
        if (o82Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList<x35> arrayList = (ArrayList) o82Var2.o();
            ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
            for (x35 x35Var : arrayList) {
                if (x35Var != o82Var) {
                    arrayList2.add(x35Var);
                }
            }
            list = arrayList2;
        }
        if (!list.isEmpty()) {
            o82 o82Var3 = this.r;
            o82Var3.getClass();
            int size = o82Var3.q.size();
            db8.e0("Insert position out of bounds.", size >= 0);
            o82Var3.b(size, (x35[]) list.toArray(new x35[0]));
        }
        return this.r.l();
    }

    public final void a0() {
        if (!R("body")) {
            i32 i32Var = this.d;
            o82 o82VarD0 = i32Var.d0();
            while (true) {
                if (o82VarD0 == null) {
                    o82VarD0 = i32Var.R("html");
                    break;
                } else if (o82VarD0.t("html")) {
                    break;
                } else {
                    o82VarD0 = o82VarD0.v();
                }
            }
            o82 o82VarD1 = o82VarD0.d0();
            while (true) {
                if (o82VarD1 == null) {
                    o82VarD1 = o82VarD0.R("body");
                    break;
                } else if (o82VarD1.t("body") || o82VarD1.t("frameset")) {
                    break;
                } else {
                    o82VarD1 = o82VarD1.v();
                }
            }
            this.e.add(o82VarD1);
        }
        this.m = r73.r;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0144 A[LOOP:0: B:6:0x0014->B:102:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    public final boolean b0() {
        String str;
        r73 r73Var = this.m;
        ArrayList arrayList = this.e;
        if (arrayList.size() == 0) {
            this.m = r73.r;
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            boolean z = size == 0;
            o82 o82Var = (z && this.z) ? this.r : (o82) arrayList.get(size);
            if (o82Var != null) {
                hn7 hn7Var = o82Var.p;
                if ("http://www.w3.org/1999/xhtml".equals(hn7Var.m)) {
                    str = hn7Var.f993o;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            str.getClass();
            switch (str) {
                case "frameset":
                    this.m = r73.E;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "template":
                    r73 r73Var2 = this.t.size() > 0 ? (r73) ua5.j(1, this.t) : null;
                    if (r73Var2 == null) {
                        throw new fb8("Bug: no template insertion mode on stack!");
                    }
                    this.m = r73Var2;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "select":
                    this.m = r73.A;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "colgroup":
                    this.m = r73.w;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "td":
                case "th":
                    if (z) {
                        if (z) {
                            size--;
                        } else {
                            this.m = r73.r;
                        }
                        break;
                    } else {
                        this.m = r73.z;
                    }
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "tr":
                    this.m = r73.y;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "body":
                    this.m = r73.r;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "head":
                    if (z) {
                        if (z) {
                            size--;
                        } else {
                            this.m = r73.r;
                        }
                        break;
                    } else {
                        this.m = r73.p;
                    }
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "html":
                    this.m = this.p == null ? r73.f1897o : r73.q;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "table":
                    this.m = r73.t;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "tbody":
                case "tfoot":
                case "thead":
                    this.m = r73.x;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                case "caption":
                    this.m = r73.v;
                    if (this.m != r73Var) {
                        return true;
                    }
                    return false;
                default:
                    if (z) {
                        this.m = r73.r;
                        if (this.m != r73Var) {
                            return true;
                        }
                        return false;
                    }
                    size--;
                    break;
                    break;
            }
        }
        if (this.m != r73Var) {
            return true;
        }
        return false;
    }

    public final void c0() {
        yt2 yt2Var = this.u;
        if (yt2Var == null) {
            throw new fb8("Bug: no noscript island state to restore");
        }
        this.u = null;
        this.q = (ys2) yt2Var.f2642o;
    }

    @Override // o.o28
    public final void j(Reader reader, String str, kg5 kg5Var) {
        super.j(reader, str, kg5Var);
        this.m = r73.m;
        this.n = null;
        this.f2085o = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = null;
        this.v = new ArrayList();
        this.w = new dw7(3, this);
        this.x = true;
        this.y = false;
        this.z = false;
    }

    @Override // o.o28
    public final void k() {
        this.m = r73.m;
        this.z = true;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    /* JADX WARN: Code duplicated, block: B:96:0x0160  */
    @Override // o.o28
    public final boolean n(sj5 sj5Var) {
        yt2 yt2Var = this.u;
        ArrayList arrayList = this.e;
        boolean zC = true;
        if (yt2Var != null) {
            r73 r73Var = this.m;
            o73 o73Var = r73.s;
            if (r73Var != o73Var) {
                int iB = ua5.B(sj5Var.a);
                if (iB == 0) {
                    C(this.m);
                    return false;
                }
                if (iB == 1) {
                    ew7 ew7Var = (ew7) sj5Var;
                    cz7 cz7VarI = r(ew7Var).i();
                    o82 o82VarM = M(ew7Var);
                    if (cz7VarI != null) {
                        if (!ew7Var.f) {
                            this.c.m(cz7VarI);
                            this.n = this.m;
                            this.m = o73Var;
                        } else if (c() == o82VarM) {
                            m();
                        }
                    }
                    this.x = false;
                    return true;
                }
                if (iB != 2) {
                    if (iB == 3) {
                        K((aw7) sj5Var);
                        return true;
                    }
                    if (iB == 4) {
                        zv7 zv7Var = (zv7) sj5Var;
                        I(zv7Var, false);
                        if (!lb7.f(zv7Var.d.F())) {
                            this.x = false;
                        }
                        return true;
                    }
                    if (iB != 6) {
                        hk0.l("Unexpected state: ".concat(to7.r(sj5Var.a)));
                        return false;
                    }
                    C(this.m);
                    A();
                    return n(sj5Var);
                }
                String strM = ((dw7) sj5Var).m();
                yt2 yt2Var2 = this.u;
                if (yt2Var2 == null) {
                    throw new fb8("Bug: noscript end tag processed with no island state");
                }
                if (strM.equals("noscript") && ((o82) yt2Var2.n) != this.r) {
                    A();
                    return true;
                }
                yt2 yt2Var3 = this.u;
                if (yt2Var3 != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        o82 o82Var = (o82) arrayList.get(size);
                        if (o82Var == ((o82) yt2Var3.n)) {
                            break;
                        }
                        if (o82Var.t(strM)) {
                            if (!d(strM, "http://www.w3.org/1999/xhtml")) {
                                C(this.m);
                            }
                            T(strM);
                            return true;
                        }
                    }
                }
                C(this.m);
                return false;
            }
        }
        if (!arrayList.isEmpty()) {
            o82 o82VarC = c();
            String str = o82VarC.p.m;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                hn7 hn7Var = o82VarC.p;
                if ("http://www.w3.org/1998/Math/MathML".equals(hn7Var.m) && lb7.d(hn7Var.f993o, A)) {
                    if (sj5Var.e()) {
                        ew7 ew7Var2 = (ew7) sj5Var;
                        if ("mglyph".equals(ew7Var2.e) || "malignmark".equals(ew7Var2.e)) {
                            if (sj5Var.a != 5) {
                                zC = "http://www.w3.org/1998/Math/MathML".equals(str) ? sj5Var.c() : sj5Var.c();
                            }
                        }
                    } else if (sj5Var.a != 5) {
                        if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                        }
                    }
                } else if (("http://www.w3.org/1998/Math/MathML".equals(str) || !o82VarC.t("annotation-xml") || !sj5Var.e() || !"svg".equals(((ew7) sj5Var).e)) && (!Q(o82VarC) || (!sj5Var.e() && sj5Var.a != 5))) {
                }
            }
        }
        return (zC ? this.m : r73.I).d(sj5Var, this);
    }

    public final o82 s(o82 o82Var) {
        ArrayList arrayList = this.e;
        if (!arrayList.contains(o82Var)) {
            return null;
        }
        for (int size = arrayList.size() - 1; size > 0; size--) {
            if (((o82) arrayList.get(size)) == o82Var) {
                return (o82) arrayList.get(size - 1);
            }
        }
        return null;
    }

    public final void t(o82 o82Var) {
        int size = this.s.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            o82 o82Var2 = (o82) this.s.get(i3);
            if (o82Var2 == null) {
                return;
            }
            if (o82Var.p.f993o.equals(o82Var2.p.f993o) && o82Var.g().equals(o82Var2.g())) {
                i2++;
            }
            if (i2 == 3) {
                this.s.remove(i3);
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TreeBuilder{currentToken=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.m);
        sb.append(", currentElement=");
        sb.append(i() ? c() : "none");
        sb.append('}');
        return sb.toString();
    }

    public final void u() {
        while (!this.s.isEmpty()) {
            int size = this.s.size();
            if ((size > 0 ? (o82) this.s.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void v(String... strArr) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o82 o82Var = (o82) arrayList.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(o82Var.p.m) && (lb7.c(o82Var.p.f993o, strArr) || o82Var.t("html"))) {
                return;
            }
            m();
        }
    }

    public final void w() {
        v("table", "template");
    }

    public final void x() {
        v("tr", "template");
    }

    public final o82 y(ew7 ew7Var, String str, boolean z) {
        ig5 ig5Var = ig5.d;
        ly lyVar = ew7Var.g;
        if (lyVar != null && lyVar.size() != 0) {
            if (!z) {
                this.g.a(lyVar);
            }
            if (lyVar.g(this.g) > 0) {
                h("Dropped duplicate attribute(s) in tag [%s]", ew7Var.e);
            }
            ew7Var.j(z ? ig5Var : this.g);
        }
        String strF = ew7Var.d.F();
        String str2 = ew7Var.e;
        if (!z) {
            ig5Var = this.g;
        }
        hn7 hn7VarD = this.h.d(strF, str2, str, ig5Var.a);
        return hn7VarD.f993o.equals("form") ? new ys2(hn7VarD, lyVar) : new o82(hn7VarD, null, lyVar);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    public final void z(o82 o82Var) {
        ArrayList arrayList;
        o82 o82VarS;
        boolean z;
        hn7 hn7Var = o82Var.p;
        this.a.getClass();
        while (true) {
            arrayList = this.e;
            if (arrayList.size() < 512) {
                break;
            }
            o82 o82VarM = m();
            if (o82VarM == this.p) {
                this.p = null;
            }
            if (o82VarM == this.q) {
                this.q = null;
            }
            Y(o82VarM);
            if (o82VarM.t("template")) {
                u();
                if (this.t.size() > 0) {
                    U();
                }
                b0();
            } else {
                yt2 yt2Var = this.u;
                if (yt2Var != null && o82VarM == ((o82) yt2Var.n)) {
                    c0();
                }
            }
        }
        if (this.q != null && hn7Var.m.equals("http://www.w3.org/1999/xhtml") && lb7.d(hn7Var.f993o, C)) {
            this.q.v.add(o82Var);
        }
        if (this.a.n.a() && o82Var.r("xmlns") && !o82Var.c("xmlns").equals(hn7Var.m)) {
            h("Invalid xmlns attribute [%s] on tag [%s]", o82Var.c("xmlns"), hn7Var.n);
        }
        o82 o82VarB = b();
        if (this.y && lb7.d(o82VarB.p.f993o, vn4.U)) {
            o82 o82VarF = F("table");
            if (o82VarF != null) {
                o82VarS = o82VarF.m;
                if (o82VarS != null) {
                    z = true;
                } else {
                    o82VarS = s(o82VarF);
                }
                if (z) {
                    db8.o0(o82VarF);
                    db8.o0(o82VarF.m);
                    if (o82Var.m == o82VarF.m) {
                        o82Var.K();
                    }
                    o82VarF.m.b(o82VarF.N(), o82Var);
                } else {
                    o82VarS.Q(o82Var);
                }
            } else {
                o82VarS = (o82) arrayList.get(0);
            }
            z = false;
            if (z) {
                db8.o0(o82VarF);
                db8.o0(o82VarF.m);
                if (o82Var.m == o82VarF.m) {
                    o82Var.K();
                }
                o82VarF.m.b(o82VarF.N(), o82Var);
            } else {
                o82VarS.Q(o82Var);
            }
        } else {
            o82VarB.Q(o82Var);
        }
        arrayList.add(o82Var);
    }
}
