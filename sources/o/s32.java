package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s32 {
    public static final s32 m;
    public static final s32 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s32 f1979o;
    public static final s32 p;
    public static final /* synthetic */ s32[] q;

    static {
        s32 s32Var = new s32("Up", 0);
        m = s32Var;
        s32 s32Var2 = new s32("Drag", 1);
        n = s32Var2;
        s32 s32Var3 = new s32("Timeout", 2);
        f1979o = s32Var3;
        s32 s32Var4 = new s32("Cancel", 3);
        p = s32Var4;
        q = new s32[]{s32Var, s32Var2, s32Var3, s32Var4};
    }

    public static s32 valueOf(String str) {
        return (s32) Enum.valueOf(s32.class, str);
    }

    public static s32[] values() {
        return (s32[]) q.clone();
    }
}
