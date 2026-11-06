package o;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class pt extends xs1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ ut e;

    public pt(ut utVar, int i, int i2, WeakReference weakReference) {
        this.e = utVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }

    @Override // o.xs1
    public final void U(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = dq.a(typeface, i, (this.c & 2) != 0);
        }
        ut utVar = this.e;
        if (utVar.n) {
            utVar.l = typeface;
            TextView textView = (TextView) this.d.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = utVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new qt(textView, typeface, i2));
                    return;
                }
                ni4 ni4Var = st.a;
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    st.a(textView, null);
                }
                textView.setTypeface(typeface, i2);
                if (TextUtils.isEmpty(fontVariationSettings)) {
                    return;
                }
                st.a(textView, fontVariationSettings);
            }
        }
    }
}
