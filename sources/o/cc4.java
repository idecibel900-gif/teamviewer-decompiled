package o;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: loaded from: classes.dex */
public class cc4 extends pq5 {
    public int N0;
    public CharSequence[] O0;
    public CharSequence[] P0;

    @Override // o.pq5
    public final void H0(boolean z) {
        int i;
        if (!z || (i = this.N0) < 0) {
            return;
        }
        String string = this.P0[i].toString();
        ListPreference listPreference = (ListPreference) F0();
        listPreference.getClass();
        listPreference.z(string);
    }

    @Override // o.pq5
    public final void I0(nd ndVar) {
        CharSequence[] charSequenceArr = this.O0;
        int i = this.N0;
        c70 c70Var = new c70(this, (byte) 2);
        jd jdVar = (jd) ndVar.f1562o;
        jdVar.f1150o = charSequenceArr;
        jdVar.q = c70Var;
        jdVar.v = i;
        jdVar.u = true;
        jdVar.g = null;
        jdVar.h = null;
    }

    @Override // o.pq5, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            this.N0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.O0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.P0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) F0();
        CharSequence[] charSequenceArr = listPreference.e0;
        CharSequence[] charSequenceArr2 = listPreference.f0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            hk0.l("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.N0 = listPreference.y(listPreference.g0);
        this.O0 = listPreference.e0;
        this.P0 = charSequenceArr2;
    }

    @Override // o.pq5, o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.N0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.O0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.P0);
    }
}
