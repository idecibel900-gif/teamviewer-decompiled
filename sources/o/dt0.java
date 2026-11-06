package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class dt0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dt0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                it0 it0Var = (it0) obj;
                if (!TextUtils.isEmpty(((EditText) view).getText()) && z) {
                    z2 = true;
                }
                it0Var.d(z2);
                break;
            case 1:
                z62 z62Var = (z62) obj;
                z62Var.a.setEndIconActivated(z);
                if (!z) {
                    z62Var.e(false);
                    z62Var.i = false;
                }
                break;
            default:
                SearchView searchView = (SearchView) obj;
                View.OnFocusChangeListener onFocusChangeListener = searchView.a0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                }
                break;
        }
    }
}
