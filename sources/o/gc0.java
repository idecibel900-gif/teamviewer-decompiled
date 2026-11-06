package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ gc0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        o62 o62Var;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ic0 ic0Var = (ic0) obj;
                if (ic0Var.u0 != i) {
                    ic0Var.w0 = true;
                    ic0Var.u0 = i;
                }
                break;
            case 1:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String string = dropDownPreference.f0[i].toString();
                    if (!string.equals(dropDownPreference.g0)) {
                        dropDownPreference.z(string);
                    }
                }
                break;
            case 2:
                if (i != -1 && (o62Var = ((ac4) obj).f313o) != null) {
                    o62Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.m;
    }
}
