package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class c05 implements Comparator {
    public static final c05 n = new c05(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c05 f474o = new c05(1);
    public final /* synthetic */ byte m;

    public /* synthetic */ c05(byte b) {
        this.m = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.m) {
            case 0:
                return f474o;
            default:
                return n;
        }
    }
}
