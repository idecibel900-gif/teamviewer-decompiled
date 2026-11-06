package o;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i32 extends o82 {
    public h32 v;
    public kg5 w;
    public int x;

    public i32(String str, String str2, kg5 kg5Var) {
        super(new hn7("#root", us1.I("#root"), str), str2, null);
        this.v = new h32();
        this.x = 1;
        this.w = kg5Var;
    }

    @Override // o.x35
    public final void C(lq1 lq1Var) {
        x35 x35VarP = p();
        if (x35VarP != null) {
            ep3 ep3VarA = ep3.A(x35VarP, lq1Var);
            while (x35VarP != null) {
                lq1.P(ep3VarA, x35VarP);
                x35VarP = x35VarP.w();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void i0(Charset charset) {
        co8 co8Var;
        h32 h32Var = this.v;
        h32Var.n = charset;
        int i = h32Var.p;
        if (i != 1) {
            if (i == 2) {
                x35 x35VarP = p();
                if (x35VarP instanceof co8) {
                    co8Var = (co8) x35VarP;
                    if (!co8Var.Q().equals("xml")) {
                        co8Var = new co8("xml", false);
                        b(0, co8Var);
                    }
                } else {
                    co8Var = new co8("xml", false);
                    b(0, co8Var);
                }
                co8Var.d("version", "1.0");
                co8Var.d("encoding", this.v.n.displayName());
                return;
            }
            return;
        }
        db8.l0("meta[charset]");
        td2 td2VarB0 = vy5.b0("meta[charset]");
        o82 o82Var = (o82) xk0.I(td2VarB0, this).findFirst().orElse(null);
        td2VarB0.e();
        if (o82Var != null) {
            o82Var.d("charset", this.v.n.displayName());
        } else {
            o82 o82VarD0 = d0();
            while (true) {
                if (o82VarD0 == null) {
                    o82VarD0 = R("html");
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
                    String str = o82VarD0.p.m;
                    i32 i32VarE = o82VarD0.E();
                    kg5 kg5Var = i32VarE != null ? i32VarE.w : new kg5(new t63());
                    jn7 jn7VarG = kg5Var.p;
                    if (jn7VarG == null) {
                        jn7VarG = kg5Var.m.g();
                        kg5Var.p = jn7VarG;
                    }
                    o82 o82Var2 = new o82(jn7VarG.d("head", null, str, kg5Var.f1262o.a), o82VarD0.h(), null);
                    o82VarD0.b(0, o82Var2);
                    o82VarD1 = o82Var2;
                    break;
                }
                if (o82VarD1.t("head")) {
                    break;
                } else {
                    o82VarD1 = o82VarD1.v();
                }
            }
            o82VarD1.R("meta").d("charset", this.v.n.displayName());
        }
        db8.l0("meta[name=charset]");
        Iterator<E> it = xk0.p(vy5.b0("meta[name=charset]"), this).iterator();
        while (it.hasNext()) {
            ((x35) it.next()).K();
        }
    }

    @Override // o.o82, o.x35
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i32 m() {
        i32 i32Var = (i32) super.m();
        ly lyVar = this.r;
        if (lyVar != null) {
            i32Var.r = lyVar.clone();
        }
        i32Var.v = this.v.clone();
        return i32Var;
    }

    @Override // o.o82, o.x35
    public final String x() {
        return "#document";
    }

    public i32(String str, String str2) {
        this(str, str2, new kg5(new t63()));
    }
}
