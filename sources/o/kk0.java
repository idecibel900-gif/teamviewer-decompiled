package o;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ mk0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xc0 f1273o;

    public /* synthetic */ kk0(mk0 mk0Var, xc0 xc0Var, byte b) {
        this.m = b;
        this.n = mk0Var;
        this.f1273o = xc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        xc0 xc0Var = this.f1273o;
        mk0 mk0Var = this.n;
        switch (b) {
            case 0:
                if (!mk0Var.f) {
                    Log.d("mk0", "Camera is closed, not requesting preview");
                } else {
                    mk0Var.a.d(new kk0(mk0Var, xc0Var, (byte) 1));
                }
                break;
            default:
                pk0 pk0Var = mk0Var.c;
                Camera camera = pk0Var.a;
                if (camera != null && pk0Var.e) {
                    ok0 ok0Var = pk0Var.l;
                    ok0Var.a = xc0Var;
                    camera.setOneShotPreviewCallback(ok0Var);
                    break;
                }
                break;
        }
    }
}
