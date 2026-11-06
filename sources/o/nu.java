package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nu {
    public static final /* synthetic */ nu[] m = {new nu("RemoteControl", 0), new nu("QuickSupport", 1), new nu("Host", 2), new nu("Pilot", 3), new nu("PilotLite", 4), new nu("OemAddon", 5), new nu("UniversalAddon", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    nu EF5;

    public static nu valueOf(String str) {
        return (nu) Enum.valueOf(nu.class, str);
    }

    public static nu[] values() {
        return (nu[]) m.clone();
    }
}
