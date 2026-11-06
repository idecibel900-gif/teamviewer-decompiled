package o;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class ev0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ ev0(fv0 fv0Var, byte b) {
        this.a = b;
        this.b = fv0Var;
    }

    public final void a(Typeface typeface) {
        byte b = this.a;
        fv0 fv0Var = this.b;
        switch (b) {
            case 0:
                el0 el0Var = fv0Var.A;
                if (el0Var != null) {
                    el0Var.c = true;
                }
                if (fv0Var.w != typeface) {
                    fv0Var.w = typeface;
                    fv0Var.i(false);
                }
                break;
            default:
                el0 el0Var2 = fv0Var.z;
                if (el0Var2 != null) {
                    el0Var2.c = true;
                }
                if (fv0Var.x != typeface) {
                    fv0Var.x = typeface;
                    fv0Var.i(false);
                }
                break;
        }
    }
}
