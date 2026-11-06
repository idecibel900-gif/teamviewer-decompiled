package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.Metadata;
import o.bg5;
import o.cg;
import o.ct1;
import o.dg;
import o.e62;
import o.gk0;
import o.h57;
import o.j04;
import o.kh7;
import o.ll0;
import o.t96;
import o.tv0;
import o.u14;
import o.u52;
import o.ud5;
import o.v3;
import o.vn4;
import o.y07;
import o.zz0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lo/ud5;", "Lo/t96;", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawablePainter extends ud5 implements t96 {
    public final Drawable r;
    public final bg5 s = h57.p(0);
    public final bg5 t;
    public final kh7 u;

    public DrawablePainter(Drawable drawable) {
        long jFloatToRawIntBits;
        this.r = drawable;
        u14 u14Var = e62.a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L) | (Float.floatToRawIntBits(intrinsicWidth) << 32);
        }
        this.t = h57.p(new y07(jFloatToRawIntBits));
        this.u = new kh7(new zz0(this, (byte) 16));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // o.t96
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.t96
    public final void b() {
        Drawable drawable = this.r;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.t96
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.u.getValue();
        Drawable drawable = this.r;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // o.ud5
    public final boolean d(float f) {
        this.r.setAlpha(ct1.v(vn4.s0(f * 255.0f), 0, 255));
        return true;
    }

    @Override // o.ud5
    public final boolean e(tv0 tv0Var) {
        this.r.setColorFilter(tv0Var != null ? tv0Var.a : null);
        return true;
    }

    @Override // o.ud5
    public final void f(j04 j04Var) {
        int i;
        j04Var.getClass();
        int iOrdinal = j04Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
        } else {
            i = 0;
        }
        this.r.setLayoutDirection(i);
    }

    @Override // o.ud5
    public final long i() {
        return ((y07) this.t.getValue()).a;
    }

    @Override // o.ud5
    public final void j(u52 u52Var) {
        u52Var.getClass();
        ll0 ll0VarX = u52Var.h0().x();
        ((Number) this.s.getValue()).intValue();
        try {
            ll0VarX.g();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.r;
            if (i < 28 || i >= 31 || !v3.z(drawable)) {
                drawable.setBounds(0, 0, vn4.s0(Float.intBitsToFloat((int) (u52Var.d() >> 32))), vn4.s0(Float.intBitsToFloat((int) (u52Var.d() & 4294967295L))));
            } else {
                ll0VarX.b(Float.intBitsToFloat((int) (u52Var.d() >> 32)) / Float.intBitsToFloat((int) (i() >> 32)), Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (i() & 4294967295L)));
            }
            Canvas canvas = dg.a;
            drawable.draw(((cg) ll0VarX).a);
        } finally {
            ll0VarX.p();
        }
    }
}
