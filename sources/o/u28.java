package o;

/* JADX INFO: loaded from: classes.dex */
public final class u28 extends t28 {
    public final /* synthetic */ byte p;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.p) {
            case 0:
                int i = this.f2073o;
                this.f2073o = i + 2;
                Object[] objArr = this.m;
                return new lm4(objArr[i], objArr[i + 1], (byte) 0);
            case 1:
                int i2 = this.f2073o;
                this.f2073o = i2 + 2;
                return this.m[i2];
            default:
                int i3 = this.f2073o;
                this.f2073o = i3 + 2;
                return this.m[i3 + 1];
        }
    }
}
