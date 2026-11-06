package o;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class t02 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ v02 m;

    public t02(v02 v02Var) {
        this.m = v02Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        v02 v02Var = this.m;
        Dialog dialog = v02Var.A0;
        if (dialog != null) {
            v02Var.onDismiss(dialog);
        }
    }
}
