package o;

import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class xf implements v00 {
    public final AndroidComposeView a;
    public final a10 b;
    public final AutofillId c;

    public xf(AndroidComposeView androidComposeView, a10 a10Var) {
        this.a = androidComposeView;
        this.b = a10Var;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw ua5.r("Required value was null.");
        }
        this.c = autofillId;
    }
}
