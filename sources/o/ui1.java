package o;

/* JADX INFO: loaded from: classes.dex */
public final class ui1 extends vi1 {
    public final int b;
    public final int c;

    public ui1(int i, int i2, int i3) throws at2 {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw at2.a();
        }
        this.b = i2;
        this.c = i3;
    }
}
