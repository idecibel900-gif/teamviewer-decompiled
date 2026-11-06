package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c30 {
    public static final /* synthetic */ c30[] m = {new c30("PRESENT", 0), new c30("ABSENT", 1), new c30("PRESENT_OPTIONAL", 2), new c30("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    c30 EF5;

    public static c30 valueOf(String str) {
        return (c30) Enum.valueOf(c30.class, str);
    }

    public static c30[] values() {
        return (c30[]) m.clone();
    }
}
