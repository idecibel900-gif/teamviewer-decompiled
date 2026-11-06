package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m74 {
    public static final /* synthetic */ m74[] m = {new m74("Chips", 0), new m74("Icons", 1), new m74("Links", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    m74 EF5;

    public static m74 valueOf(String str) {
        return (m74) Enum.valueOf(m74.class, str);
    }

    public static m74[] values() {
        return (m74[]) m.clone();
    }
}
