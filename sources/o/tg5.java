package o;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/tg5;", "Lo/gk7;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tg5 extends gk7 {
    public zh7 e1;
    public String f1;
    public iu g1;

    @Override // o.gk7, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        byte b = 0;
        View viewInflate = LayoutInflater.from(E()).inflate(R.layout.dialog_fragment_password_entry, (ViewGroup) null, false);
        int i = R.id.passInputTextView;
        TextView textView = (TextView) r47.s(viewInflate, R.id.passInputTextView);
        if (textView != null) {
            i = R.id.password_entry_text;
            EditText editText = (EditText) r47.s(viewInflate, R.id.password_entry_text);
            if (editText != null) {
                this.g1 = new iu(viewInflate, (Object) textView, (Object) editText, (byte) 21);
                if (bundle == null) {
                    M0(p0().getString(R.string.tv_passwordHeader));
                }
                Bundle bundle2 = this.r;
                if (bundle2 != null) {
                    if (bundle2.getInt("challengeTupleLength") > 0) {
                        this.e1 = new zh7((byte[]) pm8.w(bundle2, "challengeTupleData", byte[].class));
                    } else {
                        String string = bundle2.getString("srpPartnerIdentifier");
                        if (string != null) {
                            this.f1 = string;
                        }
                    }
                }
                iu iuVar = this.g1;
                iuVar.getClass();
                final EditText editText2 = (EditText) iuVar.n;
                editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rg5
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        tg5 tg5Var = this;
                        EditText editText3 = editText2;
                        editText3.post(new be3(tg5Var, editText3, (byte) 5));
                    }
                });
                editText2.setOnEditorActionListener(new sg5(this, b));
                editText2.requestFocus();
                iu iuVar2 = this.g1;
                iuVar2.getClass();
                ((TextView) iuVar2.p).setImportantForAccessibility(2);
                iu iuVar3 = this.g1;
                iuVar3.getClass();
                K0((RelativeLayout) iuVar3.f1103o);
                return;
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void b0() {
        super.b0();
        this.g1 = null;
    }

    @Override // o.gk7, o.v02, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        G0(p02.Dismiss);
    }
}
