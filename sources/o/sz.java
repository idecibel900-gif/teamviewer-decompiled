package o;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sz {
    public static final ArrayList g;
    public boolean a;
    public boolean b;
    public final boolean c;
    public final Camera d;
    public final Handler e;
    public final rz f;

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public sz(Camera camera, vk0 vk0Var) {
        qz qzVar = new qz(this, (byte) 0);
        this.f = new rz(this);
        this.e = new Handler(qzVar);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        vk0Var.getClass();
        boolean zContains = g.contains(focusMode);
        this.c = zContains;
        Log.i("sz", "Current focus mode '" + focusMode + "'; use auto focus? " + zContains);
        this.a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.c || this.a || this.b) {
            return;
        }
        try {
            this.d.autoFocus(this.f);
            this.b = true;
        } catch (RuntimeException e) {
            io.sentry.android.core.v0.l("sz", "Unexpected exception while focusing", e);
            a();
        }
    }

    public final void c() {
        this.a = true;
        this.b = false;
        this.e.removeMessages(1);
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                io.sentry.android.core.v0.l("sz", "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
