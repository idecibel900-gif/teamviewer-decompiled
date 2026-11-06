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
public final class g02 implements q93 {
    public static final g02 A;
    public static final g02 B;
    public static final g02 C;
    public static final g02 D;
    public static final g02 E;
    public static final g02 F;
    public static final g02 G;
    public static final g02 H;
    public static final g02 I;
    public static final g02 J;
    public static final g02 K;
    public static final g02 L;
    public static final g02 M;
    public static final g02 N;
    public static final g02 O;
    public static final g02 P;
    public static final g02 Q;
    public static final g02 R;
    public static final g02 S;
    public static final g02 T;
    public static final /* synthetic */ g02[] U;
    public static final g02 r;
    public static final g02 s;
    public static final g02 t;
    public static final g02 u;
    public static final g02 v;
    public static final g02 w;
    public static final g02 x;
    public static final g02 y;
    public static final g02 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f841o;
    public final String p;
    public final String q;

    static {
        EventType eventType = EventType.View;
        g02 g02Var = new g02("OnDevicesScreenOpen", 0, eventType, false, "devices-screen-deviceslist", "deviceslist-screen-opened", null, 16);
        r = g02Var;
        g02 g02Var2 = new g02("OnDeviceListConnectClicked", 1, EventType.Event, true, "devices-screen-deviceslist", "deviceslist-connect-clicked", null, 16);
        s = g02Var2;
        g02 g02Var3 = new g02("OnDeviceDetailScreenOpen", 2, eventType, false, "devices-screen-devicedetails", "device-detail-opened", null, 16);
        t = g02Var3;
        g02 g02Var4 = new g02("OnDeviceDetailConnectClicked", 3, null, false, "devices-screen-devicedetails", "connect-clicked", null, 19);
        u = g02Var4;
        g02 g02Var5 = new g02("OnDeviceDetailSendMessageClicked", 4, null, false, "devices-screen-devicedetails", "send-message-clicked", null, 19);
        v = g02Var5;
        g02 g02Var6 = new g02("OnDeviceDetailCreateShortcutClicked", 5, null, false, "devices-screen-devicedetails", "create-device-shortcut-clicked", null, 19);
        w = g02Var6;
        g02 g02Var7 = new g02("OnDeviceDetailDeleteClicked", 6, null, false, "devices-screen-devicedetails", "delete-clicked", null, 19);
        x = g02Var7;
        g02 g02Var8 = new g02("OnDeviceDetailMobileWakeClicked", 7, null, false, "devices-screen-devicedetails", "mobile-wake-clicked", null, 19);
        y = g02Var8;
        g02 g02Var9 = new g02("OnDeviceDetailPromptForConfirmationClicked", 8, null, false, "devices-screen-devicedetails", "prompt-for-confirmation-clicked", null, 19);
        z = g02Var9;
        g02 g02Var10 = new g02("OnDeviceDetailTransferFilesClicked", 9, null, false, "devices-screen-devicedetails", "transfer-files-clicked", null, 19);
        A = g02Var10;
        g02 g02Var11 = new g02("OnDeviceEditScreenOpen", 10, eventType, false, "devices-screen-deviceedit", "device-edit-opened", null, 16);
        B = g02Var11;
        g02 g02Var12 = new g02("OnDeviceEditNameClicked", 11, null, false, "devices-screen-deviceedit", "name-clicked", null, 19);
        C = g02Var12;
        g02 g02Var13 = new g02("OnDeviceEditPasswordClicked", 12, null, false, "devices-screen-deviceedit", "password-clicked", null, 19);
        D = g02Var13;
        g02 g02Var14 = new g02("OnDeviceEditDescriptionClicked", 13, null, false, "devices-screen-deviceedit", "description-clicked", null, 19);
        E = g02Var14;
        g02 g02Var15 = new g02("OnDeviceUnavailableDialogShown", 14, eventType, false, "devices-screen-devicedetails", "device-unavailable-dialog-shown", null, 16);
        F = g02Var15;
        g02 g02Var16 = new g02("OnDeviceUnavailableDialogGotItClicked", 15, null, false, "devices-screen-devicedetails", "device-unavailable-dialog-got-it-clicked", null, 19);
        G = g02Var16;
        g02 g02Var17 = new g02("OnDeviceListSearchClicked", 16, null, false, "devices-screen-deviceslist", "deviceslist-search-clicked", null, 19);
        H = g02Var17;
        g02 g02Var18 = new g02("OnDeviceListSortByClicked", 17, null, false, "devices-screen-deviceslist", "deviceslist-sort-by-clicked", null, 19);
        I = g02Var18;
        g02 g02Var19 = new g02("OnDeviceListSortByOptionAscendingClicked", 18, null, false, "devices-screen-deviceslist", "deviceslist-sort-by-option-clicked", "ascending", 3);
        J = g02Var19;
        g02 g02Var20 = new g02("OnDeviceListSortByOptionDescendingClicked", 19, null, false, "devices-screen-deviceslist", "deviceslist-sort-by-option-clicked", "descending", 3);
        K = g02Var20;
        g02 g02Var21 = new g02("OnDeviceListSortByOptionOnlineClicked", 20, null, false, "devices-screen-deviceslist", "deviceslist-sort-by-option-clicked", "online", 3);
        L = g02Var21;
        g02 g02Var22 = new g02("OnDeviceListSortByOptionOfflineClicked", 21, null, false, "devices-screen-deviceslist", "deviceslist-sort-by-option-clicked", "offline", 3);
        M = g02Var22;
        g02 g02Var23 = new g02("OnAddRemoteDeviceViaIdClicked", 22, null, false, "add-remote-device-bottom-sheet", "add-remote-device-via-id-clicked", null, 19);
        N = g02Var23;
        g02 g02Var24 = new g02("OnCancelRemoteDeviceViaIdClicked", 23, null, false, "add-remote-device-bottom-sheet", "cancel-remote-device-via-id-clicked", null, 19);
        O = g02Var24;
        g02 g02Var25 = new g02("OnAddRemoteDeviceToYourAccountGotItClicked", 24, null, false, "add-remote-device-bottom-sheet", "add-remote-device-to-your-account-no-permission-got-it-button-clicked", null, 19);
        P = g02Var25;
        g02 g02Var26 = new g02("OnScanQrCodeClicked", 25, null, false, "add-remote-device-bottom-sheet", "scan-qr-code-remote-device-to-your-account-clicked", null, 19);
        Q = g02Var26;
        g02 g02Var27 = new g02("OnCancelRemoteDeviceToYourAccountClicked", 26, null, false, "add-remote-device-bottom-sheet", "cancel-remote-device-to-your-account-clicked", null, 19);
        R = g02Var27;
        g02 g02Var28 = new g02("OnCopyAssignmentLinkClicked", 27, null, false, "add-remote-device-bottom-sheet", "remote-device-to-your-account-copy-assignment-link-clicked", null, 19);
        S = g02Var28;
        g02 g02Var29 = new g02("OnShareAssignmentLinkClicked", 28, null, false, "add-remote-device-bottom-sheet", "remote-device-to-your-account-share-assignment-link-clicked", null, 19);
        T = g02Var29;
        U = new g02[]{g02Var, g02Var2, g02Var3, g02Var4, g02Var5, g02Var6, g02Var7, g02Var8, g02Var9, g02Var10, g02Var11, g02Var12, g02Var13, g02Var14, g02Var15, g02Var16, g02Var17, g02Var18, g02Var19, g02Var20, g02Var21, g02Var22, g02Var23, g02Var24, g02Var25, g02Var26, g02Var27, g02Var28, g02Var29};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g02(String str, int i, EventType eventType, boolean z2, String str2, String str3, String str4, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.Event : eventType;
        z2 = (i2 & 2) != 0 ? true : z2;
        str4 = (i2 & 16) != 0 ? "" : str4;
        this.m = eventType;
        this.n = z2;
        this.f841o = str2;
        this.p = str3;
        this.q = str4;
    }

    public static g02 valueOf(String str) {
        return (g02) Enum.valueOf(g02.class, str);
    }

    public static g02[] values() {
        return (g02[]) U.clone();
    }

    @Override // o.q93
    public final String a() {
        return this.f841o;
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
        return this.q;
    }
}
