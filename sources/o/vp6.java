package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vp6 extends tn6 {
    public final /* synthetic */ AtomicReferenceArray s;

    public vp6(long j, vp6 vp6Var, int i) {
        super(j, vp6Var, i);
        this.s = new AtomicReferenceArray(up6.f);
    }

    @Override // o.tn6
    public final int g() {
        return up6.f;
    }

    @Override // o.tn6
    public final void h(int i, de1 de1Var) {
        this.s.set(i, up6.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.p + ", hashCode=" + hashCode() + ']';
    }
}
