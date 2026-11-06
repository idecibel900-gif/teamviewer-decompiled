package o;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((n87) obj).j(null);
                break;
            default:
                pr7 pr7Var = (pr7) obj;
                if (pr7Var != null) {
                    j64 j64Var = pr7Var.d;
                    if (j64Var != null) {
                        j64Var.e(gt7.b);
                    }
                    j64 j64Var2 = pr7Var.d;
                    if (j64Var2 != null) {
                        j64Var2.f(gt7.b);
                    }
                }
                break;
        }
    }
}
