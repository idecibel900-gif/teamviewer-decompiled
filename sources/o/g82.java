package o;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: loaded from: classes.dex */
public class g82 extends pq5 {
    public EditText N0;
    public CharSequence O0;
    public final mt8 P0 = new mt8((Object) this, (byte) 8);
    public long Q0 = -1;

    @Override // o.pq5
    public final void G0(View view) {
        super.G0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.N0 = editText;
        if (editText == null) {
            hk0.l("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText.requestFocus();
        this.N0.setText(this.O0);
        EditText editText2 = this.N0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) F0()).getClass();
    }

    @Override // o.pq5
    public final void H0(boolean z) {
        if (z) {
            String string = this.N0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) F0();
            editTextPreference.getClass();
            editTextPreference.y(string);
        }
    }

    public final void J0() {
        long j = this.Q0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.N0;
        if (editText == null || !editText.isFocused()) {
            this.Q0 = -1L;
            return;
        }
        if (((InputMethodManager) this.N0.getContext().getSystemService("input_method")).showSoftInput(this.N0, 0)) {
            this.Q0 = -1L;
            return;
        }
        EditText editText2 = this.N0;
        mt8 mt8Var = this.P0;
        editText2.removeCallbacks(mt8Var);
        this.N0.postDelayed(mt8Var, 50L);
    }

    @Override // o.pq5, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            this.O0 = ((EditTextPreference) F0()).e0;
        } else {
            this.O0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // o.pq5, o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.O0);
    }
}
