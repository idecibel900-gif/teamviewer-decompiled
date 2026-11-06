package o;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gc6 {
    public final Resources a;
    public final Resources.Theme b;

    public gc6(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gc6.class == obj.getClass()) {
            gc6 gc6Var = (gc6) obj;
            if (this.a.equals(gc6Var.a) && Objects.equals(this.b, gc6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
