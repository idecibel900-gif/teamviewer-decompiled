package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class qw6 {
    public static final m96 m = new m96(0.5f);
    public uf0 a = new tf6();
    public uf0 b = new tf6();
    public uf0 c = new tf6();
    public uf0 d = new tf6();
    public zd1 e = new n(0.0f);
    public zd1 f = new n(0.0f);
    public zd1 g = new n(0.0f);
    public zd1 h = new n(0.0f);
    public d82 i;
    public d82 j;
    public d82 k;
    public d82 l;

    public qw6() {
        byte b = 0;
        this.i = new d82(b);
        this.j = new d82(b);
        this.k = new d82(b);
        this.l = new d82(b);
    }

    public static y85 a(Context context, int i, int i2, zd1 zd1Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, hz5.B);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            zd1 zd1VarC = c(typedArrayObtainStyledAttributes, 5, zd1Var);
            zd1 zd1VarC2 = c(typedArrayObtainStyledAttributes, 8, zd1VarC);
            zd1 zd1VarC3 = c(typedArrayObtainStyledAttributes, 9, zd1VarC);
            zd1 zd1VarC4 = c(typedArrayObtainStyledAttributes, 7, zd1VarC);
            zd1 zd1VarC5 = c(typedArrayObtainStyledAttributes, 6, zd1VarC);
            y85 y85Var = new y85((byte) 1);
            y85Var.a = yo1.y(i4);
            y85Var.e = zd1VarC2;
            y85Var.b = yo1.y(i5);
            y85Var.f = zd1VarC3;
            y85Var.c = yo1.y(i6);
            y85Var.g = zd1VarC4;
            y85Var.d = yo1.y(i7);
            y85Var.h = zd1VarC5;
            return y85Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static y85 b(Context context, AttributeSet attributeSet, int i, int i2) {
        n nVar = new n(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.u, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, nVar);
    }

    public static zd1 c(TypedArray typedArray, int i, zd1 zd1Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new n(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new m96(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return zd1Var;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(d82.class) && this.j.getClass().equals(d82.class) && this.i.getClass().equals(d82.class) && this.k.getClass().equals(d82.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof tf6) && (this.a instanceof tf6) && (this.c instanceof tf6) && (this.d instanceof tf6));
    }

    public final y85 e() {
        y85 y85Var = new y85();
        y85Var.a = this.a;
        y85Var.b = this.b;
        y85Var.c = this.c;
        y85Var.d = this.d;
        y85Var.e = this.e;
        y85Var.f = this.f;
        y85Var.g = this.g;
        y85Var.h = this.h;
        y85Var.i = this.i;
        y85Var.j = this.j;
        y85Var.k = this.k;
        y85Var.l = this.l;
        return y85Var;
    }
}
