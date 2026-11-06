package o;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class el0 extends i67 {
    public final Typeface a;
    public final ev0 b;
    public boolean c;

    public el0(ev0 ev0Var, Typeface typeface) {
        this.a = typeface;
        this.b = ev0Var;
    }

    @Override // o.i67
    public final void v(int i) {
        if (this.c) {
            return;
        }
        this.b.a(this.a);
    }

    @Override // o.i67
    public final void w(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
