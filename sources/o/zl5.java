package o;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class zl5 implements xl5 {
    public static final zl5 a = new zl5();

    @Override // o.xl5
    public final boolean a() {
        return false;
    }

    @Override // o.xl5
    public final wl5 b(View view, boolean z, long j, float f, float f2, boolean z2, in1 in1Var, float f3) {
        return new yl5(new Magnifier(view));
    }
}
