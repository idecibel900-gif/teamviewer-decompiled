package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qw implements Iterator, su3 {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1873o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qw(vw vwVar, byte b) {
        this(vwVar.f278o);
        this.p = b;
        switch (b) {
            case 1:
                this.q = vwVar;
                this(vwVar.f278o);
                break;
            default:
                this.q = vwVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        int i = this.n;
        byte b = this.p;
        Object obj = this.q;
        switch (b) {
            case 0:
                objF = ((vw) obj).f(i);
                break;
            case 1:
                objF = ((vw) obj).i(i);
                break;
            default:
                objF = ((ax) obj).n[i];
                break;
        }
        this.n++;
        this.f1873o = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1873o) {
            hk0.l("Call next() before removing an element.");
            return;
        }
        int i = this.n - 1;
        this.n = i;
        byte b = this.p;
        Object obj = this.q;
        switch (b) {
            case 0:
                ((vw) obj).g(i);
                break;
            case 1:
                ((vw) obj).g(i);
                break;
            default:
                ((ax) obj).a(i);
                break;
        }
        this.m--;
        this.f1873o = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qw(ax axVar) {
        this(axVar.f369o);
        this.p = (byte) 2;
        this.q = axVar;
    }

    public qw(int i) {
        this.m = i;
    }
}
