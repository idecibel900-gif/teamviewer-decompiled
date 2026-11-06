package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final v m;
    public static final v n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v f2260o;
    public static final /* synthetic */ v[] p;

    static {
        v vVar = new v("PROPERTY", 0);
        m = vVar;
        v vVar2 = new v("BACKING_FIELD", 1);
        n = vVar2;
        v vVar3 = new v("DELEGATE_FIELD", 2);
        f2260o = vVar3;
        p = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) p.clone();
    }
}
