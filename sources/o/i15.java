package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'p' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class i15 implements q93 {
    public static final i15 p;
    public static final i15 q;
    public static final i15 r;
    public static final i15 s;
    public static final i15 t;
    public static final /* synthetic */ i15[] u;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1024o;

    static {
        EventType eventType = EventType.View;
        i15 i15Var = new i15("ConnectTabOpened", 0, eventType, "connect-tab-opened", 20);
        p = i15Var;
        i15 i15Var2 = new i15("DevicesTabOpened", 1, eventType, "devices-tab-opened", 20);
        q = i15Var2;
        i15 i15Var3 = new i15("ChatTabOpened", 2, eventType, "chat-tab-opened", 20);
        r = i15Var3;
        i15 i15Var4 = new i15("AppsTabOpened", 3, eventType, "apps-tab-opened", 20);
        s = i15Var4;
        i15 i15Var5 = new i15("SettingsClicked", 4, null, "settings-clicked", 23);
        t = i15Var5;
        u = new i15[]{i15Var, i15Var2, i15Var3, i15Var4, i15Var5};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i15(String str, int i, EventType eventType, String str2, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.Event : eventType;
        boolean z = (i2 & 2) != 0;
        this.m = eventType;
        this.n = z;
        this.f1024o = str2;
    }

    public static i15 valueOf(String str) {
        return (i15) Enum.valueOf(i15.class, str);
    }

    public static i15[] values() {
        return (i15[]) u.clone();
    }

    @Override // o.q93
    public final String a() {
        return "navigation";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f1024o;
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return "";
    }
}
