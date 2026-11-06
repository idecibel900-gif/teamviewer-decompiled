package o;

/* JADX INFO: loaded from: classes2.dex */
public class vd4 extends ud4 implements f55 {
    @Override // o.ud4, kotlin.jvm.functions.Function0
    public final Object a() throws Throwable {
        Object objA = super.a();
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
    }
}
