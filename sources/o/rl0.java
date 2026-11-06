package o;

import android.content.DialogInterface;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ rl0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((tl0) obj).a.finish();
                break;
            case 1:
                ((qf4) obj).n.f(ze4.AuthCancelledOrError);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                int i = MainActivity.w0;
                dialogInterface.getClass();
                pb3 pb3Var = mainActivity.Y;
                if (pb3Var != null) {
                    ((nk4) pb3Var).J = true;
                }
                if (pb3Var != null) {
                    ((nk4) pb3Var).I = false;
                }
                dialogInterface.dismiss();
                mainActivity.Z = false;
                break;
        }
    }
}
