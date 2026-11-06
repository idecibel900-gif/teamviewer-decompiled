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
public final class px5 implements q93 {
    public static final px5 A;
    public static final px5 B;
    public static final /* synthetic */ px5[] C;
    public static final px5 p;
    public static final px5 q;
    public static final px5 r;
    public static final px5 s;
    public static final px5 t;
    public static final px5 u;
    public static final px5 v;
    public static final px5 w;
    public static final px5 x;
    public static final px5 y;
    public static final px5 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1785o;

    static {
        EventType eventType = EventType.Event;
        px5 px5Var = new px5("OnScanQRCodeClicked", 0, eventType, "scan-qr-code-clicked", 20);
        p = px5Var;
        px5 px5Var2 = new px5("OnPinCancelClicked", 1, eventType, "pin-screen-cancel", 20);
        q = px5Var2;
        px5 px5Var3 = new px5("OnPinVerifyClicked", 2, eventType, "pin-screen-verify", 20);
        r = px5Var3;
        px5 px5Var4 = new px5("QRCodeScannerScreenOpen", 3, null, "qr-scanner-screen", 23);
        s = px5Var4;
        px5 px5Var5 = new px5("QRCodeInvalidMessage", 4, null, "qr-code-invalid", 23);
        t = px5Var5;
        px5 px5Var6 = new px5("QRCodeExpiredMessage", 5, null, "qr-code-expired", 23);
        u = px5Var6;
        px5 px5Var7 = new px5("QRCodeCanceledByTimeoutMessage", 6, null, "qr-code-canceled-timeout", 23);
        v = px5Var7;
        px5 px5Var8 = new px5("QRCodeCanceledByUserMessage", 7, null, "qr-code-canceled-user", 23);
        w = px5Var8;
        px5 px5Var9 = new px5("QRCodeErrorMessage", 8, null, "scanning-error", 23);
        x = px5Var9;
        px5 px5Var10 = new px5("EnterPinOpened", 9, null, "enter-pin-screen", 23);
        y = px5Var10;
        px5 px5Var11 = new px5("PinErrorView", 10, null, "pin-error", 23);
        z = px5Var11;
        px5 px5Var12 = new px5("PinMaximumNumberOfAttemptsMessage", 11, null, "maximum-number-of-attempts", 23);
        A = px5Var12;
        px5 px5Var13 = new px5("PinVerifiedMessage", 12, null, "pin-verified", 23);
        B = px5Var13;
        C = new px5[]{px5Var, px5Var2, px5Var3, px5Var4, px5Var5, px5Var6, px5Var7, px5Var8, px5Var9, px5Var10, px5Var11, px5Var12, px5Var13};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px5(String str, int i, EventType eventType, String str2, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.View : eventType;
        boolean z2 = (i2 & 2) == 0;
        this.m = eventType;
        this.n = z2;
        this.f1785o = str2;
    }

    public static px5 valueOf(String str) {
        return (px5) Enum.valueOf(px5.class, str);
    }

    public static px5[] values() {
        return (px5[]) C.clone();
    }

    @Override // o.q93
    public final String a() {
        return "qr-assignment";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f1785o;
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
