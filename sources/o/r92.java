package o;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class r92 extends x82 implements Runnable {
    public final WeakReference m;

    public r92(EditText editText) {
        this.m = new WeakReference(editText);
    }

    @Override // o.x82
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.m.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        s92.a((EditText) this.m.get(), 1);
    }
}
