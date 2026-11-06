package o;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class k75 extends zu1 {
    public final j75 d;
    public final LifecycleOwner e;

    public k75(LifecycleOwner lifecycleOwner, j75 j75Var) {
        j75Var.getClass();
        this.d = j75Var;
        this.e = lifecycleOwner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k75)) {
            return false;
        }
        k75 k75Var = (k75) obj;
        return im3.n(this.d, k75Var.d) && im3.n(this.e, k75Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        LifecycleOwner lifecycleOwner = this.e;
        return iHashCode + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.d + ", owner=" + this.e + ')';
    }
}
