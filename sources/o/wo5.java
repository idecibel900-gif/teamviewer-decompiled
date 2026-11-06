package o;

/* JADX INFO: loaded from: classes.dex */
public final class wo5 extends vo5 {
    public final Object c;

    public wo5(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // o.vo5
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // o.vo5
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
