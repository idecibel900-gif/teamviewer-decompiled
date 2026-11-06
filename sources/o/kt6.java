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
public final class kt6 implements q93 {
    public static final kt6 A;
    public static final kt6 B;
    public static final kt6 C;
    public static final kt6 D;
    public static final kt6 E;
    public static final kt6 F;
    public static final kt6 G;
    public static final /* synthetic */ kt6[] H;
    public static final kt6 q;
    public static final kt6 r;
    public static final kt6 s;
    public static final kt6 t;
    public static final kt6 u;
    public static final kt6 v;
    public static final kt6 w;
    public static final kt6 x;
    public static final kt6 y;
    public static final kt6 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1303o;
    public final String p;

    static {
        EventType eventType = EventType.View;
        kt6 kt6Var = new kt6("OnSessionInfoScreenOpen", 0, eventType, "session-info-screen-opened", 20);
        q = kt6Var;
        kt6 kt6Var2 = new kt6("OnSessionInfoConnectClicked", 1, null, "session-info-connect-clicked", 23);
        r = kt6Var2;
        kt6 kt6Var3 = new kt6("OnSessionInfoMoreActionsClicked", 2, null, "session-info-more-actions-clicked", 23);
        s = kt6Var3;
        kt6 kt6Var4 = new kt6("OnSessionInfoEditSessionClicked", 3, null, "session-info-edit-session-clicked", 23);
        t = kt6Var4;
        kt6 kt6Var5 = new kt6("OnSessionInfoAssignToMeClicked", 4, null, "session-info-assign-to-me-clicked", 23);
        u = kt6Var5;
        kt6 kt6Var6 = new kt6("OnSessionInfoUnassignClicked", 5, null, "session-info-unassign-clicked", 23);
        v = kt6Var6;
        kt6 kt6Var7 = new kt6("OnSessionInfoRemoveSessionClicked", 6, null, "session-info-remove-session-clicked", 23);
        w = kt6Var7;
        kt6 kt6Var8 = new kt6("OnSessionInfoShareSessionClicked", 7, null, "session-info-share-session-clicked", 23);
        x = kt6Var8;
        kt6 kt6Var9 = new kt6("OnSessionInfoCopySessionLinkClicked", 8, null, "session-info-copy-session-link-clicked", 23);
        y = kt6Var9;
        kt6 kt6Var10 = new kt6("OnSessionInfoShareSessionLinkClicked", 9, null, "session-info-share-session-link-clicked", 23);
        z = kt6Var10;
        kt6 kt6Var11 = new kt6("OnSessionInfoCopySessionCodeClicked", 10, null, "session-info-copy-session-code-clicked", 23);
        A = kt6Var11;
        kt6 kt6Var12 = new kt6("OnSessionInfoShareSessionCodeClicked", 11, null, "session-info-share-session-code-clicked", 23);
        B = kt6Var12;
        kt6 kt6Var13 = new kt6("OnSessionEditScreenOpen", 12, eventType, "session-edit-opened", 16);
        C = kt6Var13;
        kt6 kt6Var14 = new kt6("OnSessionEditNameClicked", 13, null, "name-clicked", 19);
        D = kt6Var14;
        kt6 kt6Var15 = new kt6("OnSessionEditGroupClicked", 14, null, "group-clicked", 19);
        E = kt6Var15;
        kt6 kt6Var16 = new kt6("OnSessionEditEmailClicked", 15, null, "email-clicked", 19);
        F = kt6Var16;
        kt6 kt6Var17 = new kt6("OnSessionEditDescriptionClicked", 16, null, "description-clicked", 19);
        G = kt6Var17;
        H = new kt6[]{kt6Var, kt6Var2, kt6Var3, kt6Var4, kt6Var5, kt6Var6, kt6Var7, kt6Var8, kt6Var9, kt6Var10, kt6Var11, kt6Var12, kt6Var13, kt6Var14, kt6Var15, kt6Var16, kt6Var17};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt6(String str, int i, EventType eventType, String str2, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.Event : eventType;
        boolean z2 = (i2 & 2) != 0;
        String str3 = (i2 & 4) != 0 ? "devices-screen-sessioninfo" : "devices-screen-sessionedit";
        this.m = eventType;
        this.n = z2;
        this.f1303o = str3;
        this.p = str2;
    }

    public static kt6 valueOf(String str) {
        return (kt6) Enum.valueOf(kt6.class, str);
    }

    public static kt6[] values() {
        return (kt6[]) H.clone();
    }

    @Override // o.q93
    public final String a() {
        return this.f1303o;
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.p;
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
