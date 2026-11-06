package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ve4 {
    public static final /* synthetic */ ve4[] m = {new ve4("Verbose", 0), new ve4("Debug", 1), new ve4("Info", 2), new ve4("Warn", 3), new ve4("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    ve4 EF5;

    public static ve4 valueOf(String str) {
        return (ve4) Enum.valueOf(ve4.class, str);
    }

    public static ve4[] values() {
        return (ve4[]) m.clone();
    }
}
