package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wc2 {
    public static final /* synthetic */ wc2[] m = {new wc2("ERROR_CLASS", 0), new wc2("ERROR_FUNCTION", 1), new wc2("ERROR_SCOPE", 2), new wc2("ERROR_MODULE", 3), new wc2("ERROR_PROPERTY", 4), new wc2("ERROR_TYPE", 5), new wc2("PARENT_OF_ERROR_SCOPE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    wc2 EF5;

    public static wc2 valueOf(String str) {
        return (wc2) Enum.valueOf(wc2.class, str);
    }

    public static wc2[] values() {
        return (wc2[]) m.clone();
    }
}
