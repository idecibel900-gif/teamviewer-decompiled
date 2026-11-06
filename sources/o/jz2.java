package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class jz2 implements q93 {
    public static final jz2 A;
    public static final /* synthetic */ jz2[] B;
    public static final jz2 q;
    public static final jz2 r;
    public static final jz2 s;
    public static final jz2 t;
    public static final jz2 u;
    public static final jz2 v;
    public static final jz2 w;
    public static final jz2 x;
    public static final jz2 y;
    public static final jz2 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1215o;
    public final String p;

    static {
        EventType eventType = EventType.View;
        jz2 jz2Var = new jz2("SearchScreenOpened", 0, eventType, "global-search-screen-opened", null, 20);
        q = jz2Var;
        jz2 jz2Var2 = new jz2("OnSearchDismissed", 1, eventType, "search-dismissed", null, 20);
        r = jz2Var2;
        jz2 jz2Var3 = new jz2("OnRecentResultSelected", 2, null, "result-selected", "recent", 7);
        s = jz2Var3;
        jz2 jz2Var4 = new jz2("OnDeviceResultSelected", 3, null, "result-selected", "device", 7);
        t = jz2Var4;
        jz2 jz2Var5 = new jz2("OnContactResultSelected", 4, null, "result-selected", "contact", 7);
        u = jz2Var5;
        jz2 jz2Var6 = new jz2("OnGroupResultSelected", 5, null, "result-selected", "group", 7);
        v = jz2Var6;
        jz2 jz2Var7 = new jz2("OnSearchAllTabSelected", 6, null, "tab-selected", "all", 7);
        w = jz2Var7;
        jz2 jz2Var8 = new jz2("OnSearchDevicesTabSelected", 7, null, "tab-selected", "devices", 7);
        x = jz2Var8;
        jz2 jz2Var9 = new jz2("OnSearchContactsTabSelected", 8, null, "tab-selected", "contacts", 7);
        y = jz2Var9;
        jz2 jz2Var10 = new jz2("OnSearchGroupsTabSelected", 9, null, "tab-selected", "groups", 7);
        z = jz2Var10;
        jz2 jz2Var11 = new jz2("OnSearchCleared", 10, null, "search-cleared", null, 23);
        A = jz2Var11;
        B = new jz2[]{jz2Var, jz2Var2, jz2Var3, jz2Var4, jz2Var5, jz2Var6, jz2Var7, jz2Var8, jz2Var9, jz2Var10, jz2Var11};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz2(String str, int i, EventType eventType, String str2, String str3, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.Event : eventType;
        boolean z2 = (i2 & 2) != 0;
        str3 = (i2 & 16) != 0 ? "" : str3;
        this.m = eventType;
        this.n = z2;
        this.f1215o = str2;
        this.p = str3;
    }

    public static jz2 valueOf(String str) {
        return (jz2) Enum.valueOf(jz2.class, str);
    }

    public static jz2[] values() {
        return (jz2[]) B.clone();
    }

    @Override // o.q93
    public final String a() {
        return "global-search-screen";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f1215o;
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
