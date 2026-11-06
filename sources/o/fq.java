package o;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class fq {
    public static final fq a = new fq();

    public final int a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }
}
