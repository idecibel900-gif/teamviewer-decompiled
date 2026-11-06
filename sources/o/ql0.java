package o;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tl0 n;

    public /* synthetic */ ql0(tl0 tl0Var, byte b) {
        this.m = b;
        this.n = tl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        tl0 tl0Var = this.n;
        switch (b) {
            case 0:
                Log.d("tl0", "Finishing due to inactivity");
                tl0Var.a.finish();
                break;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                tl0Var.a.setResult(0, intent);
                tl0Var.a();
                break;
        }
    }
}
