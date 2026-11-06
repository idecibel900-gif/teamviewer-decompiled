package o;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class pl implements ee8 {
    public final ViewConfiguration a;

    public pl(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // o.ee8
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // o.ee8
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // o.ee8
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // o.ee8
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // o.ee8
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // o.ee8
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
