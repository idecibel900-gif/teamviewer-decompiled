package o;

import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sq0 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ op6 n;

    public /* synthetic */ sq0(op6 op6Var, byte b) {
        this.m = b;
        this.n = op6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        byte b = this.m;
        boolean z = false;
        xv7 xv7Var = xv7.n;
        xv7 xv7Var2 = xv7.m;
        op6 op6Var = this.n;
        switch (b) {
            case 0:
                l28 l28Var = (l28) obj;
                l28Var.getClass();
                fg5 fg5Var = (fg5) l28Var;
                fg5Var.B = true;
                fg5Var.A.invoke(op6Var);
                vn4.p0(fg5Var).U();
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((pi) obj).a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        xv7Var = xv7Var2;
                    }
                    lp6.k(op6Var, xv7Var);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((pi) obj).a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        xv7Var = xv7Var2;
                    }
                    lp6.k(op6Var, xv7Var);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
