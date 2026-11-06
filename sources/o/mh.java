package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mh {
    public static final mh m;
    public static final mh n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mh[] f1468o;

    static {
        mh mhVar = new mh("SHOW_ORIGINAL", 0);
        m = mhVar;
        mh mhVar2 = new mh("SHOW_TRANSLATED", 1);
        n = mhVar2;
        f1468o = new mh[]{mhVar, mhVar2};
    }

    public static mh valueOf(String str) {
        return (mh) Enum.valueOf(mh.class, str);
    }

    public static mh[] values() {
        return (mh[]) f1468o.clone();
    }
}
