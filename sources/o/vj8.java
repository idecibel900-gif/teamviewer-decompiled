package o;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class vj8 extends wj8 {
    public final WindowInsetsAnimation e;

    public vj8(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // o.wj8
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // o.wj8
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // o.wj8
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // o.wj8
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // o.wj8
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
