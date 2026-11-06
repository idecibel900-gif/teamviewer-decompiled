package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class vc2 extends DialogFragment {
    public Dialog m;
    public DialogInterface.OnCancelListener n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f2298o;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.n;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.m;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.f2298o;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        nv1.s(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
        this.f2298o = alertDialogCreate;
        return alertDialogCreate;
    }
}
