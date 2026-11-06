package o;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class t82 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public t82(Context context) {
        this.a = io1.c0(context, R.attr.elevationOverlayEnabled, false);
        TypedValue typedValueB0 = io1.b0(context, R.attr.elevationOverlayColor);
        this.b = typedValueB0 != null ? typedValueB0.data : 0;
        TypedValue typedValueB1 = io1.b0(context, R.attr.colorSurface);
        this.c = typedValueB1 != null ? typedValueB1.data : 0;
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public final int a(int i, float f) {
        if (!this.a || hw0.d(i, 255) != this.c) {
            return i;
        }
        float f2 = this.d;
        float fMin = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            fMin = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return hw0.d(wo1.R(fMin, hw0.d(i, 255), this.b), Color.alpha(i));
    }
}
