package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ro0 implements TextWatcher {
    public final /* synthetic */ byte m;
    public final /* synthetic */ View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1936o;

    public /* synthetic */ ro0(byte b, View view, Object obj) {
        this.m = b;
        this.n = view;
        this.f1936o = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        IChatEndpointListUIModel iChatEndpointListUIModel;
        byte b = this.m;
        editable.getClass();
        switch (b) {
            case 0:
                so0 so0Var = (so0) this.f1936o;
                if (ub7.x0(editable.toString()).toString().length() > 0 && (iChatEndpointListUIModel = so0Var.n) != null) {
                    z = iChatEndpointListUIModel.CanRequestConversation();
                }
                this.n.setEnabled(z);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.m;
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.m) {
            case 0:
                charSequence.getClass();
                break;
            default:
                ii2 ii2Var = (ii2) this.f1936o;
                charSequence.getClass();
                TextInputLayout textInputLayout = (TextInputLayout) this.n;
                EditText editText = textInputLayout.getEditText();
                editText.getClass();
                String string = ub7.x0(editText.getText().toString()).toString();
                if (Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                    textInputLayout.setError(null);
                } else {
                    textInputLayout.setError(ii2Var.p0().getString(R.string.tv_feedback_InvalidEmail));
                }
                if (string.length() == 0) {
                    textInputLayout.setError(null);
                }
                ii2Var.C0(ii2Var.q0);
                break;
        }
    }
}
