package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v21 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2268o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public v21(Function0 function0, tx5 tx5Var, px4 px4Var, px4 px4Var2, yf5 yf5Var) {
        this.m = (byte) 2;
        this.p = function0;
        this.n = tx5Var;
        this.f2268o = px4Var;
        this.q = px4Var2;
        this.r = yf5Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.n;
        Object obj5 = this.f2268o;
        switch (b) {
            case 0:
                bz5 bz5Var = (bz5) obj;
                y21 y21Var = (y21) obj4;
                int iOrdinal = bz5Var.b.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return null;
                    }
                    au0 au0Var = (au0) obj3;
                    String strI = y21Var.I(R.string.no_browser_snackbar_text);
                    strI.getClass();
                    String strI2 = y21Var.I(R.string.no_browser_snackbar_button);
                    strI2.getClass();
                    ((Function1) obj5).invoke(new ul7(sl7.n, strI, g37.m, null, new nl7(strI2, new eb(obj2, (Object) y21Var, (Object) au0Var, this.p, (byte) 5)), null, 216));
                    return f88Var;
                }
                Intent intent = bz5Var.a;
                if (intent == null) {
                    return f88Var;
                }
                ye4 ye4Var = ye4.a;
                if (y21Var.C() == null) {
                    return f88Var;
                }
                try {
                    intent.addFlags(268435456);
                    y21Var.y0(intent);
                    return f88Var;
                } catch (ActivityNotFoundException unused) {
                    ye4Var.g("ConnectFragment", "Couldn't start activity (package not found to launch intent).");
                    return f88Var;
                } catch (SecurityException unused2) {
                    ye4Var.g("ConnectFragment", "Couldn't start activity (not allowed).");
                    return f88Var;
                }
            case 1:
                Context context = ((ComposeView) obj3).getContext();
                context.getClass();
                ((y21) obj4).A0((p93) obj, (Function1) obj5, this.p, context, (Function1) obj2);
                return f88Var;
            default:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue == 0) {
                    this.p.a();
                    ((Function1) ((px4) obj5).getValue()).invoke("QR_CODE_ASSIGNMENT_FAILED");
                } else if (((Boolean) ((tx5) obj4).p.getValue()).booleanValue()) {
                    ((px4) obj3).setValue("");
                    ((yf5) obj2).A(iIntValue);
                }
                return f88Var;
        }
    }

    public /* synthetic */ v21(y21 y21Var, Function1 function1, Function0 function0, Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = y21Var;
        this.f2268o = function1;
        this.p = function0;
        this.q = obj;
        this.r = obj2;
    }
}
