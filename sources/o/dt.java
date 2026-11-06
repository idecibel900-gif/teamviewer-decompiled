package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class dt extends cj3 {
    public final ct t;
    public Drawable u;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public boolean x;
    public boolean y;

    public dt(ct ctVar) {
        super((Object) ctVar, (byte) 1);
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = false;
        this.t = ctVar;
    }

    @Override // o.cj3
    public final void K(AttributeSet attributeSet, int i) {
        super.K(attributeSet, R.attr.seekBarStyle);
        ct ctVar = this.t;
        Context context = ctVar.getContext();
        int[] iArr = zz5.g;
        ep3 ep3VarX = ep3.x(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        be8.l(ctVar, ctVar.getContext(), iArr, attributeSet, (TypedArray) ep3VarX.f733o, R.attr.seekBarStyle);
        Drawable drawableM = ep3VarX.m(0);
        if (drawableM != null) {
            ctVar.setThumb(drawableM);
        }
        Drawable drawableL = ep3VarX.l(1);
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.u = drawableL;
        if (drawableL != null) {
            drawableL.setCallback(ctVar);
            drawableL.setLayoutDirection(ctVar.getLayoutDirection());
            if (drawableL.isStateful()) {
                drawableL.setState(ctVar.getDrawableState());
            }
            a0();
        }
        ctVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.w = h62.c(typedArray.getInt(3, -1), this.w);
            this.y = true;
        }
        if (typedArray.hasValue(2)) {
            this.v = ep3VarX.i(2);
            this.x = true;
        }
        ep3VarX.B();
        a0();
    }

    public final void a0() {
        Drawable drawable = this.u;
        if (drawable != null) {
            if (this.x || this.y) {
                Drawable drawableMutate = drawable.mutate();
                this.u = drawableMutate;
                if (this.x) {
                    drawableMutate.setTintList(this.v);
                }
                if (this.y) {
                    this.u.setTintMode(this.w);
                }
                if (this.u.isStateful()) {
                    this.u.setState(this.t.getDrawableState());
                }
            }
        }
    }

    public final void b0(Canvas canvas) {
        if (this.u != null) {
            ct ctVar = this.t;
            int max = ctVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.u.getIntrinsicWidth();
                int intrinsicHeight = this.u.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.u.setBounds(-i, -i2, i, i2);
                float width = ((ctVar.getWidth() - ctVar.getPaddingLeft()) - ctVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(ctVar.getPaddingLeft(), ctVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.u.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
