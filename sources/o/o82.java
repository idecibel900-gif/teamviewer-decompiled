package o;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public class o82 extends x35 implements Iterable {
    public static final List s = Collections.EMPTY_LIST;
    public static final n82 t = new n82(0);
    public static final String u = "/baseUri";
    public final hn7 p;
    public n82 q;
    public ly r;

    public o82(hn7 hn7Var, String str, ly lyVar) {
        db8.o0(hn7Var);
        this.q = t;
        this.r = lyVar;
        this.p = hn7Var;
        if (lb7.f(str)) {
            return;
        }
        db8.o0(str);
        W(str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    public static void S(StringBuilder sb, et7 et7Var) {
        String strQ = et7Var.Q();
        o82 o82Var = et7Var.m;
        if (o82Var != null) {
            int i = 0;
            do {
                if ((o82Var.p.p & 64) == 0) {
                    o82Var = o82Var.m;
                    i++;
                    if (i >= 6) {
                        break;
                    }
                }
            } while (o82Var != null);
            if (!(et7Var instanceof di0)) {
                lb7.a(strQ, sb, et7.T(sb));
                return;
            }
        } else if (!(et7Var instanceof di0)) {
            lb7.a(strQ, sb, et7.T(sb));
            return;
        }
        sb.append(strQ);
    }

    @Override // o.x35
    public final String A() {
        return this.p.f993o;
    }

    @Override // o.x35
    public void D(lq1 lq1Var, h32 h32Var) {
        int i = h32Var.p;
        hn7 hn7Var = this.p;
        String strA = i == 2 ? jy.a(2, hn7Var.n) : hn7Var.n;
        lq1Var.j('<').k(strA);
        ly lyVar = this.r;
        if (lyVar != null) {
            lyVar.k(lq1Var, h32Var);
        }
        if (!this.q.isEmpty()) {
            lq1Var.j('>');
            return;
        }
        boolean z = h32Var.p == 2 || !hn7Var.m.equals("http://www.w3.org/1999/xhtml");
        if (z && (hn7Var.c(32) || ((1 & hn7Var.p) != 0 && (hn7Var.d() || hn7Var.e())))) {
            lq1Var.k(" />");
        } else if (z || !hn7Var.d()) {
            lq1Var.k("></").k(strA).j('>');
        } else {
            lq1Var.j('>');
        }
    }

    public final void Q(x35 x35Var) {
        db8.o0(x35Var);
        P(x35Var);
        o82 o82Var = x35Var.m;
        if (o82Var != null) {
            o82Var.L(x35Var);
        }
        x35Var.m = this;
        o();
        this.q.add(x35Var);
        x35Var.n = this.q.size() - 1;
    }

    public final o82 R(String str) {
        String str2 = this.p.m;
        i32 i32VarE = E();
        kg5 kg5Var = i32VarE != null ? i32VarE.w : new kg5(new t63());
        jn7 jn7VarG = kg5Var.p;
        if (jn7VarG == null) {
            jn7VarG = kg5Var.m.g();
            kg5Var.p = jn7VarG;
        }
        o82 o82Var = new o82(jn7VarG.d(str, null, str2, kg5Var.f1262o.a), h(), null);
        Q(o82Var);
        return o82Var;
    }

    public final List T() {
        List list;
        Integer num;
        ly lyVar = this.r;
        if (lyVar != null && lyVar.l("/jsoup.userdata") != -1) {
            Map mapS = this.r.s();
            WeakReference weakReference = (WeakReference) mapS.get("jsoup.childEls");
            if (weakReference != null && (list = (List) weakReference.get()) != null && (num = (Integer) mapS.get("jsoup.childElsMod")) != null && num.intValue() == this.q.b()) {
                return list;
            }
        }
        return null;
    }

    public final List U() {
        List listT;
        if (this.q.size() == 0) {
            return s;
        }
        synchronized (this.q) {
            try {
                listT = T();
                if (listT == null) {
                    listT = a0(o82.class);
                    Map mapS = g().s();
                    mapS.put("jsoup.childEls", new WeakReference(listT));
                    mapS.put("jsoup.childElsMod", Integer.valueOf(this.q.b()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return listT;
    }

    @Override // o.x35
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public o82 m() {
        return (o82) super.m();
    }

    public final void W(String str) {
        g().o(u, str);
    }

    public final boolean X(String str) {
        hn7 hn7Var = this.p;
        return hn7Var.f993o.equals(str) && hn7Var.m.equals("http://www.w3.org/1999/xhtml");
    }

    public final int Z() {
        o82 o82Var = this.m;
        if (o82Var == null) {
            return 0;
        }
        List listU = o82Var.U();
        int size = listU.size();
        for (int i = 0; i < size; i++) {
            if (listU.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    public final List a0(final Class cls) {
        return (List) this.q.stream().filter(new l82(cls, (byte) 0)).map(new Function() { // from class: o.m82
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast((x35) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new k82((byte) 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o82 d0() {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            x35 x35Var = (x35) this.q.get(i);
            if (x35Var instanceof o82) {
                return (o82) x35Var;
            }
        }
        return null;
    }

    public final boolean e0() {
        return (this.p.p & 4) != 0;
    }

    public void f0(lq1 lq1Var, h32 h32Var) {
        if (this.q.isEmpty()) {
            return;
        }
        lq1 lq1VarK = lq1Var.k("</");
        int i = h32Var.p;
        hn7 hn7Var = this.p;
        lq1VarK.k(i == 2 ? jy.a(2, hn7Var.n) : hn7Var.n).j('>');
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        ds1.i0(this, o82.class).forEach(consumer);
    }

    @Override // o.x35
    public final ly g() {
        ly lyVar = this.r;
        if (lyVar != null) {
            return lyVar;
        }
        ly lyVar2 = new ly();
        this.r = lyVar2;
        return lyVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g0() {
        StringBuilder sbB = lb7.b();
        for (int i = 0; i < this.q.size(); i++) {
            x35 x35Var = (x35) this.q.get(i);
            if (x35Var instanceof et7) {
                S(sbB, (et7) x35Var);
            } else if (x35Var.t("br") && !et7.T(sbB)) {
                sbB.append(" ");
            }
        }
        return lb7.k(sbB).trim();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[RETURN] */
    @Override // o.x35
    public final String h() {
        String strH;
        while (this != null) {
            ly lyVar = this.r;
            if (lyVar != null) {
                String str = u;
                if (lyVar.l(str) != -1) {
                    strH = this.r.h(str);
                    if (strH != null) {
                        return strH;
                    }
                    return "";
                }
            }
            this = this.m;
        }
        strH = null;
        if (strH != null) {
            return strH;
        }
        return "";
    }

    public final String h0() {
        StringBuilder sbB = lb7.b();
        lq1.P(new xk1((Object) sbB, (byte) 11), this);
        return lb7.k(sbB).trim();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j45(this, o82.class);
    }

    @Override // o.x35
    public final int k() {
        return this.q.size();
    }

    @Override // o.x35
    public final x35 n(x35 x35Var) {
        o82 o82Var = (o82) super.n(x35Var);
        n82 n82Var = new n82(this.q.size());
        o82Var.q = n82Var;
        n82Var.addAll(this.q);
        ly lyVar = this.r;
        if (lyVar != null) {
            ly lyVarD = lyVar.clone();
            o82Var.r = lyVarD;
            if (lyVarD.l("/jsoup.userdata") != -1) {
                lyVarD.s().remove("jsoup.childEls");
            }
        }
        return o82Var;
    }

    @Override // o.x35
    public final List o() {
        n82 n82Var = this.q;
        if (n82Var != t) {
            return n82Var;
        }
        n82 n82Var2 = new n82(4);
        this.q = n82Var2;
        return n82Var2;
    }

    @Override // o.x35
    public final boolean s() {
        return this.r != null;
    }

    @Override // o.x35
    public String x() {
        return this.p.n;
    }

    @Override // o.x35
    public final String y() {
        Stream map = this.q.stream().map(new k82((byte) 0));
        String[] strArr = lb7.a;
        return (String) map.collect(Collector.of(new hb7(""), new ib7(), new jb7(), new k82((byte) 3), new Collector.Characteristics[0]));
    }
}
