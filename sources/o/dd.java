package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dd {
    public static final dd m;
    public static final dd n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final dd f610o;
    public static final /* synthetic */ dd[] p;

    static {
        dd ddVar = new dd("ALL", 0);
        m = ddVar;
        dd ddVar2 = new dd("FAILED", 1);
        n = ddVar2;
        dd ddVar3 = new dd("ACKNOWLEDGED", 2);
        f610o = ddVar3;
        p = new dd[]{ddVar, ddVar2, ddVar3};
    }

    public static dd valueOf(String str) {
        return (dd) Enum.valueOf(dd.class, str);
    }

    public static dd[] values() {
        return (dd[]) p.clone();
    }
}
