package o;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class s02 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ v02 m;

    public s02(v02 v02Var) {
        this.m = v02Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        v02 v02Var = this.m;
        Dialog dialog = v02Var.A0;
        if (dialog != null) {
            v02Var.onCancel(dialog);
        }
    }
}
