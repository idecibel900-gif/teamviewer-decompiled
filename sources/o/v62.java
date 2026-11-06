package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class v62 implements TextWatcher {
    public final /* synthetic */ byte m;
    public final /* synthetic */ za2 n;

    public /* synthetic */ v62(za2 za2Var, byte b) {
        this.m = b;
        this.n = za2Var;
    }

    public final void a(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.m) {
            case 0:
                z62 z62Var = (z62) this.n;
                EditText editText = z62Var.a.getEditText();
                if (!(editText instanceof AutoCompleteTextView)) {
                    hk0.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                } else {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                    if (z62Var.n.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !z62Var.c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                    autoCompleteTextView.post(new it8((byte) 11, this, autoCompleteTextView, false));
                }
                break;
        }
    }

    public final void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.m) {
            case 1:
                ug5 ug5Var = (ug5) this.n;
                ug5Var.c.setChecked(!ug5Var.d());
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
