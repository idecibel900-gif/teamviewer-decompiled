package o;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((u6) ((io.sentry.android.core.d) obj).f100o).f2174o = z;
                break;
            case 1:
                wb0 wb0Var = (wb0) obj;
                int i = wb0.B0;
                if (z) {
                    Object systemService = wb0Var.r0().getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                break;
            case 2:
                yb0 yb0Var = (yb0) obj;
                int i2 = yb0.z0;
                if (z) {
                    Object systemService2 = yb0Var.r0().getSystemService("input_method");
                    systemService2.getClass();
                    ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                break;
            case 3:
                lc0 lc0Var = (lc0) obj;
                if (!z) {
                    int i3 = lc0.P0;
                } else {
                    lc0Var.D0 = true;
                    view.getClass();
                    ((EditText) view).setText("");
                }
                break;
            case 4:
                ((po0) obj).k(view instanceof TextView ? (TextView) view : null);
                break;
            case 5:
                h11 h11Var = (h11) obj;
                if (z) {
                    h11Var.q.setValue("");
                }
                break;
            default:
                PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) obj;
                if (!z) {
                    int i4 = PilotMarkerTextInputFieldView.H;
                } else {
                    Function0 function0 = pilotMarkerTextInputFieldView.E;
                    if (function0 != null) {
                        function0.a();
                    }
                }
                break;
        }
    }
}
