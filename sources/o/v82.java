package o;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v82 extends zu1 {
    public final /* synthetic */ w82 d;

    public v82(w82 w82Var) {
        this.d = w82Var;
    }

    @Override // o.zu1
    public final void F(Throwable th) {
        this.d.a.f(th);
    }

    @Override // o.zu1
    public final void G(j93 j93Var) {
        w82 w82Var = this.d;
        w82Var.c = j93Var;
        j93 j93Var2 = w82Var.c;
        a92 a92Var = w82Var.a;
        w82Var.b = new iu(j93Var2, a92Var.g, a92Var.i, Build.VERSION.SDK_INT >= 34 ? g92.a() : lv1.M());
        a92 a92Var2 = w82Var.a;
        ArrayList arrayList = new ArrayList();
        a92Var2.a.writeLock().lock();
        try {
            a92Var2.c = (byte) 1;
            arrayList.addAll(a92Var2.b);
            a92Var2.b.clear();
            a92Var2.a.writeLock().unlock();
            a92Var2.d.post(new y82(arrayList, a92Var2.c, null));
        } catch (Throwable th) {
            a92Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
