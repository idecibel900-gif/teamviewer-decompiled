package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class bz5 {
    public final Intent a;
    public final cz5 b;

    public bz5(Intent intent, cz5 cz5Var) {
        this.a = intent;
        this.b = cz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz5)) {
            return false;
        }
        bz5 bz5Var = (bz5) obj;
        return im3.n(this.a, bz5Var.a) && this.b == bz5Var.b;
    }

    public final int hashCode() {
        Intent intent = this.a;
        return this.b.hashCode() + ((intent == null ? 0 : intent.hashCode()) * 31);
    }

    public final String toString() {
        return "QuickSupportEvent(intent=" + this.a + ", type=" + this.b + ")";
    }
}
