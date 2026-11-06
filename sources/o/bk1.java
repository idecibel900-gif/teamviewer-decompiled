package o;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public bk1() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
