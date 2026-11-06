package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n82 extends ArrayList {
    public boolean m;

    public n82(int i) {
        super(i);
        this.m = true;
    }

    public final void a() {
        ((ArrayList) this).modCount++;
    }

    public final int b() {
        return ((ArrayList) this).modCount;
    }
}
