package o;

/* JADX INFO: loaded from: classes.dex */
public final class al3 {
    public int a = 0;

    public final String toString() {
        int i = this.a;
        int iHashCode = hashCode();
        qf0.s(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }
}
