package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fi5 {
    public static final /* synthetic */ fi5[] m = {new fi5("Unattended", 0), new fi5("Attended", 1), new fi5("ViewOnly", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    fi5 EF5;

    public static fi5 valueOf(String str) {
        return (fi5) Enum.valueOf(fi5.class, str);
    }

    public static fi5[] values() {
        return (fi5[]) m.clone();
    }
}
