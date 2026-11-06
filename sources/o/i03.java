package o;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class i03 extends ds1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f1022o;
    public final TextPaint p;

    public i03(CharSequence charSequence, TextPaint textPaint) {
        this.f1022o = charSequence;
        this.p = textPaint;
    }

    @Override // o.ds1
    public final int Z(int i) {
        CharSequence charSequence = this.f1022o;
        return this.p.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // o.ds1
    public final int c0(int i) {
        CharSequence charSequence = this.f1022o;
        return this.p.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
