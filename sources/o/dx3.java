package o;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class dx3 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof dx3) {
            return im3.n(this.a, ((dx3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ")";
    }
}
