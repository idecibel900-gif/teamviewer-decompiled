package o;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class jw6 extends CharacterStyle implements UpdateAppearance {
    public final iw6 m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f1208o = h57.p(new y07(9205357640488583168L));
    public final eo1 p = d57.b(new y26(this, 18));

    public jw6(iw6 iw6Var, float f) {
        this.m = iw6Var;
        this.n = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        di1.D(textPaint, this.n);
        textPaint.setShader((Shader) this.p.getValue());
    }
}
