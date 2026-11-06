package o;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class gg implements au0 {
    public final cj3 a;

    public gg(cj3 cj3Var) {
        this.a = cj3Var;
    }

    public final void a(zt0 zt0Var) {
        cj3 cj3Var = this.a;
        if (zt0Var != null) {
            cj3Var.F().setPrimaryClip(zt0Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            cj3Var.F().clearPrimaryClip();
        } else {
            cj3Var.F().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
