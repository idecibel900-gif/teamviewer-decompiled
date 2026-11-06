package o;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class zo7 extends i67 {
    public final /* synthetic */ TextPaint a;
    public final /* synthetic */ i67 b;
    public final /* synthetic */ ap7 c;

    public zo7(ap7 ap7Var, TextPaint textPaint, i67 i67Var) {
        this.c = ap7Var;
        this.a = textPaint;
        this.b = i67Var;
    }

    @Override // o.i67
    public final void v(int i) {
        this.b.v(i);
    }

    @Override // o.i67
    public final void w(Typeface typeface, boolean z) {
        this.c.g(this.a, typeface);
        this.b.w(typeface, z);
    }
}
