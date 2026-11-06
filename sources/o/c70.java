package o;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c70 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte m;
    public final Object n;

    public c70(d70 d70Var) {
        this.m = (byte) 0;
        this.n = new WeakReference(d70Var);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((d70) weakReference.get()).X0(true);
                }
                break;
            case 1:
                ((pl2) obj).H0.X0(true);
                break;
            default:
                cc4 cc4Var = (cc4) obj;
                cc4Var.N0 = i;
                cc4Var.M0 = -1;
                dialogInterface.dismiss();
                break;
        }
    }

    public /* synthetic */ c70(v02 v02Var, byte b) {
        this.m = b;
        this.n = v02Var;
    }
}
