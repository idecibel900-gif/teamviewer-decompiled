package o;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class d92 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = r08.b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (a92.d()) {
                a92.a().e();
            }
        } finally {
            Method method2 = r08.b;
            Trace.endSection();
        }
    }
}
