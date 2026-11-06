package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class p61 {
    public final Uri a;
    public final boolean b;

    public p61(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p61.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        p61 p61Var = (p61) obj;
        return this.a.equals(p61Var.a) && this.b == p61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
