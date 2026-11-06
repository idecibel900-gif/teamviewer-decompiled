package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o.bl8;
import o.c71;
import o.qg2;
import o.zr;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lo/c71;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lo/f88;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MulticastConsumer implements c71 {
    public final Context a;
    public bl8 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(zr zrVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            bl8 bl8Var = this.c;
            if (bl8Var != null) {
                zrVar.accept(bl8Var);
            }
            this.d.add(zrVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.c71
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            bl8 bl8VarB = qg2.b(this.a, value);
            this.c = bl8VarB;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c71) it.next()).accept(bl8VarB);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
