package o;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z64 extends oe8 implements hb3 {
    public final yt2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j93 f2675o;
    public final l97 p;
    public final t36 q;

    public z64(yt2 yt2Var, j93 j93Var) {
        this.n = yt2Var;
        this.f2675o = j93Var;
        l97 l97VarK = im3.k(new v64(false, false, false, false, ea2.m));
        this.p = l97VarK;
        this.q = yo1.u(l97VarK);
    }

    public final boolean V0() {
        Context context = (Context) this.f2675o.n;
        Locale localeB = new ld4(new md4(context.getResources().getConfiguration().getLocales())).b(0);
        if (im3.n(localeB, Locale.KOREA)) {
            return true;
        }
        if (im3.n(localeB != null ? localeB.getCountry() : null, "KR")) {
            return true;
        }
        if (im3.n(localeB != null ? localeB.getLanguage() : null, "ko")) {
            return true;
        }
        Locale localeB2 = new ld4(new md4(context.getResources().getConfiguration().getLocales())).b(0);
        if (im3.n(localeB2, Locale.SIMPLIFIED_CHINESE)) {
            return true;
        }
        return im3.n(localeB2 != null ? localeB2.getCountry() : null, "CN");
    }
}
