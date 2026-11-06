package o;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class xj6 implements yj6 {
    public final ScrollFeedbackProvider m;

    public xj6(NestedScrollView nestedScrollView) {
        this.m = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // o.yj6
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.m.onScrollLimit(i, i2, i3, z);
    }

    @Override // o.yj6
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.m.onScrollProgress(i, i2, i3, i4);
    }
}
