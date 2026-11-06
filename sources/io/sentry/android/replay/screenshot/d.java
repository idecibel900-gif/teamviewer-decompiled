package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import io.sentry.android.replay.ReplayIntegration;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ k n;

    public /* synthetic */ d(k kVar, byte b) {
        this.m = b;
        this.n = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        k kVar = this.n;
        switch (b) {
            case 0:
                if (!((Bitmap) kVar.g).isRecycled()) {
                    synchronized (((Bitmap) kVar.g)) {
                        if (!((Bitmap) kVar.g).isRecycled()) {
                            ((Bitmap) kVar.g).recycle();
                        }
                        break;
                    }
                }
                ((io.sentry.android.replay.util.e) kVar.f168o).close();
                return;
            default:
                try {
                    ((ReplayIntegration) kVar.a).x0((Bitmap) kVar.g);
                    return;
                } finally {
                    kVar.h();
                }
        }
    }
}
