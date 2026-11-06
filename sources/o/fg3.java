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
public final class fg3 implements q93 {
    public static final fg3 p;
    public static final fg3 q;
    public static final fg3 r;
    public static final fg3 s;
    public static final fg3 t;
    public static final fg3 u;
    public static final fg3 v;
    public static final fg3 w;
    public static final /* synthetic */ fg3[] x;
    public final String m;
    public final EventType n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f795o;

    static {
        EventType eventType = EventType.Event;
        fg3 fg3Var = new fg3("CartClicked", 0, "cart-clicked", eventType, true);
        p = fg3Var;
        fg3 fg3Var2 = new fg3("ManageSubscriptionClicked", 1, "manage-subscription-clicked", eventType, true);
        q = fg3Var2;
        EventType eventType2 = EventType.View;
        fg3 fg3Var3 = new fg3("UpgradePlanPage", 2, "upgrade-plan-page", eventType2, true);
        r = fg3Var3;
        fg3 fg3Var4 = new fg3("FreePlanPage", 3, "current-plan-page", eventType2, true);
        s = fg3Var4;
        fg3 fg3Var5 = new fg3("UpgradePlanClicked", 4, "upgrade-plan-clicked", eventType, true);
        t = fg3Var5;
        fg3 fg3Var6 = new fg3("PostPurchaseSuccess", 5, "post-purchase-success", eventType2, false);
        u = fg3Var6;
        fg3 fg3Var7 = new fg3("PostPurchaseFailure", 6, "post-purchase-failure", eventType2, false);
        v = fg3Var7;
        fg3 fg3Var8 = new fg3("ExistingLicense", 7, "existing-license", eventType2, true);
        w = fg3Var8;
        x = new fg3[]{fg3Var, fg3Var2, fg3Var3, fg3Var4, fg3Var5, fg3Var6, fg3Var7, fg3Var8};
    }

    public fg3(String str, int i, String str2, EventType eventType, boolean z) {
        super(str, i);
        this.m = str2;
        this.n = eventType;
        this.f795o = z;
    }

    public static fg3 valueOf(String str) {
        return (fg3) Enum.valueOf(fg3.class, str);
    }

    public static fg3[] values() {
        return (fg3[]) x.clone();
    }

    @Override // o.q93
    public final String a() {
        return "google-iap";
    }

    @Override // o.q93
    public final boolean c() {
        return this.f795o;
    }

    @Override // o.q93
    public final String e() {
        return this.m;
    }

    @Override // o.q93
    public final EventType getType() {
        return this.n;
    }

    @Override // o.q93
    public final String getValue() {
        return "";
    }
}
