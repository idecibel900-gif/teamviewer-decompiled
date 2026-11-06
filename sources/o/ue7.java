package o;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class ue7 extends v02 {
    public Dialog F0;
    public DialogInterface.OnCancelListener G0;
    public AlertDialog H0;

    @Override // o.v02
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = this.F0;
        if (dialog != null) {
            return dialog;
        }
        this.w0 = false;
        AlertDialog alertDialog = this.H0;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context contextE = E();
        nv1.s(contextE);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(contextE).create();
        this.H0 = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // o.v02, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.G0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
