package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'B' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class q31 implements q93 {
    public static final q31 A;
    public static final q31 B;
    public static final q31 C;
    public static final q31 D;
    public static final q31 E;
    public static final q31 F;
    public static final q31 G;
    public static final /* synthetic */ q31[] H;
    public static final q31 q;
    public static final q31 r;
    public static final q31 s;
    public static final q31 t;
    public static final q31 u;
    public static final q31 v;
    public static final q31 w;
    public static final q31 x;
    public static final q31 y;
    public static final q31 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1799o;
    public final String p;

    static {
        q31 q31Var = new q31("OnExpandRecentConnections", 0, null, "recents-pressed", "expanded", 7);
        q = q31Var;
        q31 q31Var2 = new q31("OnCollapseRecentConnections", 1, null, "recents-pressed", "collapsed", 7);
        r = q31Var2;
        q31 q31Var3 = new q31("OnExpandSessions", 2, null, "sessions-pressed", "expanded", 7);
        s = q31Var3;
        q31 q31Var4 = new q31("OnCollapseSessions", 3, null, "sessions-pressed", "collapsed", 7);
        t = q31Var4;
        q31 q31Var5 = new q31("OnPartnerIDPressed", 4, null, "partner-id-pressed", null, 23);
        u = q31Var5;
        q31 q31Var6 = new q31("OnSessionDetailsPressed", 5, null, "session-details-pressed", null, 23);
        v = q31Var6;
        q31 q31Var7 = new q31("OnShareSessionLinkPressed", 6, null, "share-session-link-pressed", null, 23);
        w = q31Var7;
        q31 q31Var8 = new q31("OnCopySessionLinkPressed", 7, null, "copy-session-link-pressed", null, 23);
        x = q31Var8;
        q31 q31Var9 = new q31("OnShareSessionCodePressed", 8, null, "share-session-code-pressed", null, 23);
        y = q31Var9;
        q31 q31Var10 = new q31("OnCopySessionCodePressed", 9, null, "copy-session-code-pressed", null, 23);
        z = q31Var10;
        q31 q31Var11 = new q31("OnJoinWaitingRoom", 10, null, "join-waiting-room", null, 23);
        A = q31Var11;
        EventType eventType = EventType.View;
        q31 q31Var12 = new q31("AccountRequiredBottomSheet", 11, eventType, "account-required-screen", null, 20);
        B = q31Var12;
        q31 q31Var13 = new q31("OnWaitingRoomLeaveSessionPressed", 12, null, "leave-sessions-pressed", "leave", 7);
        C = q31Var13;
        q31 q31Var14 = new q31("SessionUnavailableDialog", 13, eventType, "session-close-dialogue", null, 20);
        D = q31Var14;
        q31 q31Var15 = new q31("QuickSupportBannerAppeared", 14, eventType, "qs-banner", null, 20);
        E = q31Var15;
        q31 q31Var16 = new q31("OnQuickSupportBannerDismissed", 15, null, "qs-banner-dismissed", null, 23);
        F = q31Var16;
        q31 q31Var17 = new q31("OnQuickSupportBannerClicked", 16, null, "qs-banner-clicked", null, 23);
        G = q31Var17;
        H = new q31[]{q31Var, q31Var2, q31Var3, q31Var4, q31Var5, q31Var6, q31Var7, q31Var8, q31Var9, q31Var10, q31Var11, q31Var12, q31Var13, q31Var14, q31Var15, q31Var16, q31Var17};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q31(String str, int i, EventType eventType, String str2, String str3, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.Event : eventType;
        boolean z2 = (i2 & 2) != 0;
        str3 = (i2 & 16) != 0 ? "" : str3;
        this.m = eventType;
        this.n = z2;
        this.f1799o = str2;
        this.p = str3;
    }

    public static q31 valueOf(String str) {
        return (q31) Enum.valueOf(q31.class, str);
    }

    public static q31[] values() {
        return (q31[]) H.clone();
    }

    @Override // o.q93
    public final String a() {
        return "remote-control-tab";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f1799o;
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
