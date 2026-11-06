package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class f66 {
    public static void a(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
