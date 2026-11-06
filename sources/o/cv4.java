package o;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class cv4 extends pq5 {
    public final HashSet N0 = new HashSet();
    public boolean O0;
    public CharSequence[] P0;
    public CharSequence[] Q0;

    @Override // o.pq5
    public final void H0(boolean z) {
        if (z && this.O0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) F0();
            multiSelectListPreference.getClass();
            multiSelectListPreference.y(this.N0);
        }
        this.O0 = false;
    }

    @Override // o.pq5
    public final void I0(nd ndVar) {
        int length = this.Q0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.N0.contains(this.Q0[i].toString());
        }
        CharSequence[] charSequenceArr = this.P0;
        bv4 bv4Var = new bv4(this);
        jd jdVar = (jd) ndVar.f1562o;
        jdVar.f1150o = charSequenceArr;
        jdVar.w = bv4Var;
        jdVar.s = zArr;
        jdVar.t = true;
    }

    @Override // o.pq5, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        HashSet hashSet = this.N0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.O0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.P0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.Q0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) F0();
        CharSequence[] charSequenceArr = multiSelectListPreference.e0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.f0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            hk0.l("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.g0);
        this.O0 = false;
        this.P0 = multiSelectListPreference.e0;
        this.Q0 = charSequenceArr2;
    }

    @Override // o.pq5, o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.N0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.O0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.P0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.Q0);
    }
}
