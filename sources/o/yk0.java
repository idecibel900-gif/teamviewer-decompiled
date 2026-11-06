package o;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements xn7 {
    public static final h00 c = new h00(jk0.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final h00 d = new h00(gk0.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final h00 e = new h00(hk0.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final h00 f;

    static {
        if (Integer.TYPE == null) {
            yq4.l("Null valueClass");
        } else if (Long.TYPE != null) {
            f = new h00(Boolean.TYPE, "camerax.core.appConfig.repeatingStreamForced");
        } else {
            yq4.l("Null valueClass");
        }
    }
}
