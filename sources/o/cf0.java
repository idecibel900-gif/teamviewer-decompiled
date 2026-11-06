package o;

/* JADX INFO: loaded from: classes.dex */
public final class cf0 extends n1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f521o = 1;
    public final Object p;

    public cf0(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.p = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.f521o;
        Object obj = this.p;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    yq4.p();
                    return null;
                }
                int i = this.m;
                this.m = i + 1;
                return ((Object[]) obj)[i];
            default:
                if (hasNext()) {
                    this.m++;
                    return obj;
                }
                yq4.p();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.f521o;
        Object obj = this.p;
        switch (b) {
            case 0:
                if (!hasPrevious()) {
                    yq4.p();
                    return null;
                }
                int i = this.m - 1;
                this.m = i;
                return ((Object[]) obj)[i];
            default:
                if (hasPrevious()) {
                    this.m--;
                    return obj;
                }
                yq4.p();
                return null;
        }
    }

    public cf0(int i, Object obj) {
        super(i, 1);
        this.p = obj;
    }
}
