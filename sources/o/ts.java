package o;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class ts extends v02 {
    @Override // o.v02
    public Dialog C0(Bundle bundle) {
        return new ss(E(), this.u0);
    }

    @Override // o.v02
    public final void D0(Dialog dialog, int i) {
        if (!(dialog instanceof ss)) {
            super.D0(dialog, i);
            return;
        }
        ss ssVar = (ss) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        ssVar.i().i(1);
    }
}
