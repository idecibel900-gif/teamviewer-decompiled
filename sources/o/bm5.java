package o;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class bm5 implements xl5 {
    public static final bm5 a = new bm5();

    @Override // o.xl5
    public final boolean a() {
        return true;
    }

    @Override // o.xl5
    public final wl5 b(View view, boolean z, long j, float f, float f2, boolean z2, in1 in1Var, float f3) {
        if (z) {
            return new am5(new Magnifier(view));
        }
        long jW0 = in1Var.w0(j);
        float fD0 = in1Var.d0(f);
        float fD1 = in1Var.d0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jW0 != 9205357640488583168L) {
            builder.setSize(vn4.s0(Float.intBitsToFloat((int) (jW0 >> 32))), vn4.s0(Float.intBitsToFloat((int) (jW0 & 4294967295L))));
        }
        if (!Float.isNaN(fD0)) {
            builder.setCornerRadius(fD0);
        }
        if (!Float.isNaN(fD1)) {
            builder.setElevation(fD1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new am5(builder.build());
    }
}
