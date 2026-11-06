package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class za5 {
    public final Context a;
    public final w07 b;
    public final oi6 c;
    public final pp5 d;
    public final String e;
    public final sj2 f;
    public final ii0 g;
    public final ii0 h;
    public final ii0 i;
    public final tg2 j;

    public za5(Context context, w07 w07Var, oi6 oi6Var, pp5 pp5Var, String str, sj2 sj2Var, ii0 ii0Var, ii0 ii0Var2, ii0 ii0Var3, tg2 tg2Var) {
        this.a = context;
        this.b = w07Var;
        this.c = oi6Var;
        this.d = pp5Var;
        this.e = str;
        this.f = sj2Var;
        this.g = ii0Var;
        this.h = ii0Var2;
        this.i = ii0Var3;
        this.j = tg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za5)) {
            return false;
        }
        za5 za5Var = (za5) obj;
        return im3.n(this.a, za5Var.a) && im3.n(this.b, za5Var.b) && this.c == za5Var.c && this.d == za5Var.d && im3.n(this.e, za5Var.e) && im3.n(this.f, za5Var.f) && this.g == za5Var.g && this.h == za5Var.h && this.i == za5Var.i && im3.n(this.j, za5Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}
