package o;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;

/* JADX INFO: loaded from: classes.dex */
public final class d62 implements Drawable.Callback {
    public final /* synthetic */ DrawablePainter m;

    public d62(DrawablePainter drawablePainter) {
        this.m = drawablePainter;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long jFloatToRawIntBits;
        drawable.getClass();
        DrawablePainter drawablePainter = this.m;
        bg5 bg5Var = drawablePainter.s;
        bg5Var.setValue(Integer.valueOf(((Number) bg5Var.getValue()).intValue() + 1));
        Drawable drawable2 = drawablePainter.r;
        u14 u14Var = e62.a;
        if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable2.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable2.getIntrinsicHeight())) & 4294967295L);
        }
        drawablePainter.t.setValue(new y07(jFloatToRawIntBits));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) e62.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) e62.a.getValue()).removeCallbacks(runnable);
    }
}
