package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/fs7;", "Lo/gk7;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fs7 extends gk7 {
    public String e1 = "";
    public wk0 f1;

    @Override // o.gk7
    public final void J0(od odVar) {
        super.J0(odVar);
        Window window = odVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
    }

    public final String P0() {
        wk0 wk0Var = this.f1;
        if (wk0Var != null) {
            return ((EditText) wk0Var.f2420o).getText().toString();
        }
        ye4.c("TextInputDialogFragment", "textfield is null!");
        return "";
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            Bundle bundle2 = this.r;
            this.e1 = bundle2 != null ? bundle2.getString("DefaultText") : null;
        }
        View viewInflate = LayoutInflater.from(E()).inflate(R.layout.dialog_fragment_lineinput, (ViewGroup) null, false);
        if (viewInflate == null) {
            yq4.l("rootView");
            return;
        }
        EditText editText = (EditText) viewInflate;
        this.f1 = new wk0((Object) editText, (Object) editText, (byte) 18);
        editText.setText(this.e1);
        wk0 wk0Var = this.f1;
        wk0Var.getClass();
        ((EditText) wk0Var.f2420o).selectAll();
        wk0 wk0Var2 = this.f1;
        wk0Var2.getClass();
        K0((EditText) wk0Var2.n);
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void b0() {
        super.b0();
        this.f1 = null;
    }
}
