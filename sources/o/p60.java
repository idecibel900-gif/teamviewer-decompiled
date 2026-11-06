package o;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class p60 implements Runnable {
    public final /* synthetic */ byte m;
    public final WeakReference n;

    public p60(d70 d70Var, byte b) {
        this.m = b;
        switch (b) {
            case 2:
                this.n = new WeakReference(d70Var);
                break;
            default:
                this.n = new WeakReference(d70Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        WeakReference weakReference = this.n;
        switch (b) {
            case 0:
                if (weakReference.get() != null) {
                    ((q60) weakReference.get()).K0();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((d70) weakReference.get()).y = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((d70) weakReference.get()).z = false;
                }
                break;
        }
    }

    public p60(q60 q60Var) {
        this.m = (byte) 0;
        this.n = new WeakReference(q60Var);
    }
}
