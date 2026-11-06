package o;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class tv4 implements c71, Consumer2 {
    public final Context a;
    public bl8 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public tv4(Context context) {
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
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            bl8 bl8VarB = qg2.b(this.a, windowLayoutInfo);
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
