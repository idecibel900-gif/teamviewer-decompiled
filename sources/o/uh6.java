package o;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uh6 implements xh6 {
    public final a65 a;
    public boolean b;
    public Bundle c;
    public final kh7 d;

    public uh6(a65 a65Var, we8 we8Var) {
        a65Var.getClass();
        this.a = a65Var;
        this.d = new kh7(new y26(we8Var, (byte) 6));
    }

    @Override // o.xh6
    public final Bundle a() {
        Bundle bundleG = mo8.g((vd5[]) Arrays.copyOf(new vd5[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        for (Map.Entry entry : ((vh6) this.d.getValue()).n.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((fy0) ((rh6) entry.getValue()).a.q).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleG.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleG;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleX0 = this.a.x0("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleG = mo8.g((vd5[]) Arrays.copyOf(new vd5[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        if (bundleX0 != null) {
            bundleG.putAll(bundleX0);
        }
        this.c = bundleG;
        this.b = true;
    }
}
