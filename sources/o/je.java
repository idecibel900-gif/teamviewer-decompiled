package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class je extends cx2 implements hw2 {
    public static final je n = new je(2, vn4.class, "min", "min(II)I", 1);

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
