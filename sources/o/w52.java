package o;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class w52 extends CharacterStyle implements UpdateAppearance {
    public final v52 m;

    public w52(v52 v52Var) {
        this.m = v52Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            zk2 zk2Var = zk2.a;
            v52 v52Var = this.m;
            if (im3.n(v52Var, zk2Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(v52Var instanceof cc7)) {
                gk0.s();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            cc7 cc7Var = (cc7) v52Var;
            textPaint.setStrokeWidth(cc7Var.a);
            textPaint.setStrokeMiter(cc7Var.b);
            int i = cc7Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = cc7Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
