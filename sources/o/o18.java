package o;

/* JADX INFO: loaded from: classes.dex */
public interface o18 {
    Object b();

    default boolean c(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(d());
    }

    Object d();
}
