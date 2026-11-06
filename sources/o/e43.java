package o;

import java.text.Collator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e43 extends oe8 {
    public final d11 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l97 f678o;
    public final l97 p;
    public final l97 q;
    public final l97 r;
    public final t36 s;
    public final r36 t;
    public final ox0 u;
    public final l33 v;
    public final t36 w;

    public e43(int i) {
        d11 d11Var = new d11(new xl4(), new nx3((byte) 9));
        this.n = d11Var;
        l97 l97VarK = im3.k(l67.m);
        this.f678o = l97VarK;
        this.p = im3.k(0);
        this.q = im3.k(0);
        ea2 ea2Var = ea2.m;
        l97 l97VarK2 = im3.k(ea2Var);
        this.r = l97VarK2;
        this.s = (t36) d11Var.p;
        this.t = (r36) d11Var.r;
        ji2 ji2Var = new ji2((byte) 19);
        Locale locale = Locale.ROOT;
        locale.getClass();
        Collator collator = Collator.getInstance(locale);
        collator.setStrength(0);
        this.u = new ox0(ji2Var, collator, (byte) 1);
        this.v = new l33(new h33(-1), null, 14);
        this.w = yo1.W(new jp2(l97VarK2, l97VarK, new c43(this, null), (byte) 0), e8.n(this), new d97(5000L, Long.MAX_VALUE), ea2Var);
    }

    public e43() {
        this(0);
    }
}
