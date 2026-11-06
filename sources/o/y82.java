package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y82 implements Runnable {
    public final ArrayList m;
    public final byte n;

    /* JADX WARN: Multi-variable type inference failed */
    public y82(List list, int i, Throwable th) {
        io1.A(list, "initCallbacks cannot be null");
        this.m = new ArrayList(list);
        this.n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        if (this.n != 1) {
            while (i < size) {
                ((x82) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((x82) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
