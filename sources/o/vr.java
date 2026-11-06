package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vr implements xh6 {
    public final /* synthetic */ byte a;
    public final Object b;

    public vr(a65 a65Var) {
        this.a = (byte) 1;
        this.b = new LinkedHashSet();
        a65Var.Q0("androidx.savedstate.Restarter", this);
    }

    @Override // o.xh6
    public final Bundle a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((xr) obj).G();
                return bundle;
            default:
                Bundle bundleG = mo8.g((vd5[]) Arrays.copyOf(new vd5[0], 0));
                List listP0 = lv0.P0((LinkedHashSet) obj);
                bundleG.putStringArrayList("classes_to_restore", listP0 instanceof ArrayList ? (ArrayList) listP0 : new ArrayList<>(listP0));
                return bundleG;
        }
    }

    public vr(xr xrVar) {
        this.a = (byte) 0;
        this.b = xrVar;
    }
}
