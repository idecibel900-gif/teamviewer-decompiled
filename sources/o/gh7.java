package o;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class gh7 extends x82 {
    public final WeakReference m;

    public gh7(SwitchCompat switchCompat) {
        this.m = new WeakReference(switchCompat);
    }

    @Override // o.x82
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.m.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // o.x82
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.m.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
