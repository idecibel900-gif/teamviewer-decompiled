package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ie2 implements ex5 {
    public final /* synthetic */ byte m;
    public final ex5 n;

    public /* synthetic */ ie2(ex5 ex5Var, byte b) {
        this.m = b;
        this.n = ex5Var;
    }

    @Override // o.ex5
    public final Object get() {
        byte b = this.m;
        ex5 ex5Var = this.n;
        switch (b) {
            case 0:
                String packageName = ((Context) ex5Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                yq4.l("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new fj6(Integer.valueOf(fj6.p).intValue(), (Context) ex5Var.get(), "com.google.android.datatransport.events");
        }
    }
}
