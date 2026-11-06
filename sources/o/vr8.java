package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class vr8 extends ResultReceiver {
    public final /* synthetic */ do7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr8(Handler handler, do7 do7Var) {
        super(handler);
        this.m = do7Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.m.c(null);
    }
}
