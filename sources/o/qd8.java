package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class qd8 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = he8.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
