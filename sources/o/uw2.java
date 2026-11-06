package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uw2 {

    /* JADX INFO: Fake field, exist only in values array */
    uw2 EF5;
    public static final /* synthetic */ uw2[] n = {new uw2("Function", 0), new uw2("SuspendFunction", 1), new uw2("KFunction", 2), new uw2("KSuspendFunction", 3), new uw2("UNKNOWN", 4)};
    public static final ju m = new ju((byte) 19);

    public static uw2 valueOf(String str) {
        return (uw2) Enum.valueOf(uw2.class, str);
    }

    public static uw2[] values() {
        return (uw2[]) n.clone();
    }
}
