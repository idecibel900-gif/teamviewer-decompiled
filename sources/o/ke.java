package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke extends cx2 implements hw2 {
    public static final ke n = new ke(2, vn4.class, "max", "max(II)I", 1);

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
