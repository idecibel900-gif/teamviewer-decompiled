package o;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements Camera.AutoFocusCallback {
    public final /* synthetic */ sz a;

    public rz(sz szVar) {
        this.a = szVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        this.a.e.post(new io.sentry.b5((Object) this, (byte) 28));
    }
}
