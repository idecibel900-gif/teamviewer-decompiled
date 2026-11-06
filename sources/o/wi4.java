package o;

import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yi4 n;

    public /* synthetic */ wi4(yi4 yi4Var, byte b) {
        this.m = b;
        this.n = yi4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M2MClientActivity m2MClientActivity;
        M2MClientActivity m2MClientActivity2;
        byte b = this.m;
        boolean zK = false;
        yi4 yi4Var = this.n;
        switch (b) {
            case 0:
                Iterator it = yi4Var.x.iterator();
                if (it.hasNext() && (m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get()) != null) {
                    zK = m2MClientActivity.K();
                }
                if (!zK) {
                    ye4.c("M2MClientActivityViewModel", "reinitView(): initClientView failed!");
                }
                break;
            default:
                Iterator it2 = yi4Var.x.iterator();
                if (it2.hasNext() && (m2MClientActivity2 = (M2MClientActivity) ((WeakReference) it2.next()).get()) != null) {
                    zK = m2MClientActivity2.K();
                }
                if (!zK) {
                    ye4.c("M2MClientActivityViewModel", "onFirstStart: client not found/initClientView failed!");
                    yi4Var.V0();
                }
                break;
        }
    }
}
