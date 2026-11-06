package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class u5 implements q93 {
    public static final u5 q;
    public static final u5 r;
    public static final u5 s;
    public static final u5 t;
    public static final u5 u;
    public static final /* synthetic */ u5[] v;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2171o;
    public final String p;

    static {
        u5 u5Var = new u5("AccountPage", 0, EventType.View, "account-page-loaded", "", 4);
        q = u5Var;
        EventType eventType = EventType.Event;
        u5 u5Var2 = new u5("ToggleTrustedDevicesOn", 1, eventType, "toggle-trusted-devices-clicked", "on", 6);
        r = u5Var2;
        u5 u5Var3 = new u5("ToggleTrustedDevicesOff", 2, eventType, "toggle-trusted-devices-clicked", "off", 6);
        s = u5Var3;
        u5 u5Var4 = new u5("SignOut", 3, eventType, "sign-out", "", 6);
        t = u5Var4;
        u5 u5Var5 = new u5("DeleteAccount", 4, eventType, "delete-account", "", 6);
        u = u5Var5;
        v = new u5[]{u5Var, u5Var2, u5Var3, u5Var4, u5Var5};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(String str, int i, EventType eventType, String str2, String str3, int i2) {
        super(str, i);
        boolean z = (i2 & 2) != 0;
        this.m = eventType;
        this.n = z;
        this.f2171o = str2;
        this.p = str3;
    }

    public static u5 valueOf(String str) {
        return (u5) Enum.valueOf(u5.class, str);
    }

    public static u5[] values() {
        return (u5[]) v.clone();
    }

    @Override // o.q93
    public final String a() {
        return "account-page";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f2171o;
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return this.p;
    }
}
