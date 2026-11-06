package o;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class bq7 {
    public float c;
    public final WeakReference e;
    public ap7 f;
    public final TextPaint a = new TextPaint(1);
    public final wq0 b = new wq0(this, 1);
    public boolean d = true;

    public bq7(aq7 aq7Var) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(aq7Var);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        float fMeasureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = fMeasureText;
        this.d = false;
        return fMeasureText;
    }

    public final void b(ap7 ap7Var, Context context) {
        if (this.f != ap7Var) {
            this.f = ap7Var;
            WeakReference weakReference = this.e;
            if (ap7Var != null) {
                TextPaint textPaint = this.a;
                wq0 wq0Var = this.b;
                ap7Var.f(context, textPaint, wq0Var);
                aq7 aq7Var = (aq7) weakReference.get();
                if (aq7Var != null) {
                    textPaint.drawableState = aq7Var.getState();
                }
                ap7Var.e(context, textPaint, wq0Var);
                this.d = true;
            }
            aq7 aq7Var2 = (aq7) weakReference.get();
            if (aq7Var2 != null) {
                aq7Var2.a();
                aq7Var2.onStateChange(aq7Var2.getState());
            }
        }
    }
}
