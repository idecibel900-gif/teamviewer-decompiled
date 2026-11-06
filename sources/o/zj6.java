package o;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class zj6 {
    public final yj6 a;

    public zj6(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new xj6(nestedScrollView);
        } else {
            this.a = new ol5((byte) 7);
        }
    }
}
