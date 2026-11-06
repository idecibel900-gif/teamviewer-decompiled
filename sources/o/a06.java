package o;

import android.content.res.Configuration;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a06 {
    public final me1 a;
    public final ml8 b;
    public final boolean c;
    public final boolean d;
    public final yx6 e;
    public final t36 f;
    public final String g;

    public a06(Configuration configuration, me1 me1Var, ml8 ml8Var, l51 l51Var) {
        configuration.getClass();
        me1Var.getClass();
        this.a = me1Var;
        this.b = ml8Var;
        byte b = 1;
        this.c = configuration.orientation == 2;
        this.d = configuration.screenHeightDp <= 540;
        this.e = au8.l(0, 7, null);
        this.f = yo1.W(new yo2(l51Var.b, new g6((Object) this, (hc1) null, (byte) 4), b), me1Var, new d97(5000L, Long.MAX_VALUE), Boolean.valueOf(l51Var.a()));
        String language = configuration.getLocales().get(0).getLanguage();
        language.getClass();
        this.g = language;
    }

    public final boolean a() {
        boolean z = this.c;
        ml8 ml8Var = this.b;
        if (z) {
            int i = ml8Var.b;
            Set set = kj8.n;
            if (w32.a(o67.d(i), o67.d(0)) > 0) {
                return true;
            }
        } else {
            int i2 = ml8Var.a;
            Set set2 = ol8.n;
            if (w32.a(n37.g(i2), n37.g(0)) > 0) {
                return true;
            }
        }
        return false;
    }
}
