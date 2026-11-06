package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ll3 extends cx2 implements hw2 {
    public static final ll3 n = new ll3(2, vn4.class, "min", "min(II)I", 1);

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
