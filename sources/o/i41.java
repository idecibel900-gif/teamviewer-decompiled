package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i41 {
    public static final i41 A;
    public static final i41 B;
    public static final i41 C;
    public static final /* synthetic */ i41[] D;
    public static final i41 m;
    public static final i41 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i41 f1033o;
    public static final i41 p;
    public static final i41 q;
    public static final i41 r;
    public static final i41 s;
    public static final i41 t;
    public static final i41 u;
    public static final i41 v;
    public static final i41 w;
    public static final i41 x;
    public static final i41 y;
    public static final i41 z;

    /* JADX INFO: Fake field, exist only in values array */
    i41 EF1;

    static {
        i41 i41Var = new i41("UNDEFINED", 0);
        i41 i41Var2 = new i41("ERROR_CONNECT_PENDING", 1);
        m = i41Var2;
        i41 i41Var3 = new i41("ERROR_INVALID_INPUT", 2);
        n = i41Var3;
        i41 i41Var4 = new i41("ACTION_CONNECT_ABORT", 3);
        f1033o = i41Var4;
        i41 i41Var5 = new i41("ACTION_CONNECT_MASTER", 4);
        p = i41Var5;
        i41 i41Var6 = new i41("ERROR_MASTER_RESPONSE", 5);
        q = i41Var6;
        i41 i41Var7 = new i41("ACTION_START_SESSION_CONTROLLER", 6);
        r = i41Var7;
        i41 i41Var8 = new i41("ERROR_ROUTER_RESULT", 7);
        i41 i41Var9 = new i41("ERROR_UNSUPPORTED_CONNECTION_TYPE", 8);
        i41 i41Var10 = new i41("ERROR_LICENSE_MISSING", 9);
        i41 i41Var11 = new i41("SUCCESS_INFO_BEFORE_AUTH", 10);
        s = i41Var11;
        i41 i41Var12 = new i41("SUCCESS_AUTHENTICATION", 11);
        t = i41Var12;
        i41 i41Var13 = new i41("ERROR_AUTHENTICATION", 12);
        u = i41Var13;
        i41 i41Var14 = new i41("ERROR_AUTHENTICATION_DENIED", 13);
        v = i41Var14;
        i41 i41Var15 = new i41("SUCCESS_RECEIVED_DISPLAY_DATA", 14);
        w = i41Var15;
        i41 i41Var16 = new i41("ACTION_START_MEETING", 15);
        x = i41Var16;
        i41 i41Var17 = new i41("ACTION_SESSION_ACTIVITY_CLOSED", 16);
        y = i41Var17;
        i41 i41Var18 = new i41("ACTION_FILETRANSFER_SESSION_STARTED", 17);
        z = i41Var18;
        i41 i41Var19 = new i41("ACTION_FILETRANSFER_CONNECTION_ESTABLISHED", 18);
        A = i41Var19;
        i41 i41Var20 = new i41("ACTION_SESSION_ENDED", 19);
        B = i41Var20;
        i41 i41Var21 = new i41("ACTION_CLOSE_SESSION_CONTROLLER", 20);
        C = i41Var21;
        D = new i41[]{i41Var, i41Var2, i41Var3, i41Var4, i41Var5, i41Var6, i41Var7, i41Var8, i41Var9, i41Var10, i41Var11, i41Var12, i41Var13, i41Var14, i41Var15, i41Var16, i41Var17, i41Var18, i41Var19, i41Var20, i41Var21, new i41("ERROR_CONNECT_TIMEOUT", 21)};
    }

    public static i41 valueOf(String str) {
        return (i41) Enum.valueOf(i41.class, str);
    }

    public static i41[] values() {
        return (i41[]) D.clone();
    }
}
