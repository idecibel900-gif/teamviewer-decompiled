package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 {
    public static final ca2 m;
    public static final ca2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ca2 f506o;
    public static final ca2 p;
    public static final /* synthetic */ ca2[] q;

    static {
        ca2 ca2Var = new ca2("Connect", 0);
        m = ca2Var;
        ca2 ca2Var2 = new ca2("FileTransfer", 1);
        n = ca2Var2;
        ca2 ca2Var3 = new ca2("ConnectNoOnlineDevices", 2);
        f506o = ca2Var3;
        ca2 ca2Var4 = new ca2("FileTransferNoOnlineDevices", 3);
        p = ca2Var4;
        q = new ca2[]{ca2Var, ca2Var2, ca2Var3, ca2Var4};
    }

    public static ca2 valueOf(String str) {
        return (ca2) Enum.valueOf(ca2.class, str);
    }

    public static ca2[] values() {
        return (ca2[]) q.clone();
    }
}
