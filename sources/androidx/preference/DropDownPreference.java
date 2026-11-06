package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import o.dr5;
import o.gc0;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter j0;
    public Spinner k0;
    public final gc0 l0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.l0 = new gc0(this, (byte) 1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.j0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.e0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void g() {
        super.g();
        ArrayAdapter arrayAdapter = this.j0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) dr5Var.m.findViewById(R.id.spinner);
        this.k0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.j0);
        this.k0.setOnItemSelectedListener(this.l0);
        Spinner spinner2 = this.k0;
        String str = this.g0;
        if (str == null || (charSequenceArr = this.f0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.k(dr5Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void l() {
        this.k0.performClick();
    }
}
