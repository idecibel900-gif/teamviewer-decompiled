package o;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg5 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((tg5) obj).G0(p02.Positive);
                return true;
            default:
                PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) obj;
                if (i != 6) {
                    int i2 = PilotMarkerTextInputFieldView.H;
                    return false;
                }
                Function1 function1 = pilotMarkerTextInputFieldView.D;
                a65 a65Var = pilotMarkerTextInputFieldView.G;
                if (function1 != null) {
                    function1.invoke(String.valueOf(a65Var != null ? ((EditText) a65Var.n).getText() : null));
                }
                if (a65Var == null) {
                    return false;
                }
                ((EditText) a65Var.n).clearFocus();
                return false;
        }
    }
}
