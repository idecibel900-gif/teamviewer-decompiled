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
public final class f43 implements q93 {
    public static final f43 A;
    public static final f43 B;
    public static final f43 C;
    public static final f43 D;
    public static final f43 E;
    public static final f43 F;
    public static final /* synthetic */ f43[] G;
    public static final f43 q;
    public static final f43 r;
    public static final f43 s;
    public static final f43 t;
    public static final f43 u;
    public static final f43 v;
    public static final f43 w;
    public static final f43 x;
    public static final f43 y;
    public static final f43 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f767o;
    public final String p;

    static {
        EventType eventType = EventType.Event;
        f43 f43Var = new f43("OnGroupClicked", 0, eventType, "group-clicked", 20);
        q = f43Var;
        f43 f43Var2 = new f43("OnGroupChipClicked", 1, eventType, "group-chip-clicked", 20);
        r = f43Var2;
        f43 f43Var3 = new f43("OnGroupScreenOpen", 2, null, "grouplist-screen-opened", 23);
        s = f43Var3;
        f43 f43Var4 = new f43("OnGroupBottomSheetGroupClicked", 3, eventType, "group-bottomSheet-group-clicked", 20);
        t = f43Var4;
        f43 f43Var5 = new f43("OnGroupAddGroupClicked", 4, eventType, "group-add-clicked", 20);
        u = f43Var5;
        f43 f43Var6 = new f43("OnGroupActionsMenuOpened", 5, eventType, "menu-opened", 16);
        v = f43Var6;
        f43 f43Var7 = new f43("OnGroupShowDetailsClicked", 6, eventType, "group-show-details-clicked", 20);
        f43 f43Var8 = new f43("OnGroupRenameMenuClicked", 7, eventType, "rename-clicked", 16);
        w = f43Var8;
        f43 f43Var9 = new f43("OnGroupDeleteMenuClicked", 8, eventType, "delete-clicked", 16);
        x = f43Var9;
        f43 f43Var10 = new f43("OnRenameGroupDialogShown", 9, null, "rename-group-dialog-shown", 23);
        y = f43Var10;
        f43 f43Var11 = new f43("OnRenameGroupDialogConfirmed", 10, eventType, "rename-group-dialog-confirmed", 20);
        z = f43Var11;
        f43 f43Var12 = new f43("OnRenameGroupDialogDismissed", 11, eventType, "rename-group-dialog-dismissed", 20);
        A = f43Var12;
        f43 f43Var13 = new f43("OnDeleteGroupDialogShown", 12, null, "delete-group-dialog-shown", 23);
        f43 f43Var14 = new f43("OnDeleteGroupDialogConfirmed", 13, eventType, "delete-group-dialog-confirmed", 20);
        f43 f43Var15 = new f43("OnDeleteGroupDialogDismissed", 14, eventType, "delete-group-dialog-dismissed", 20);
        f43 f43Var16 = new f43("OnGroupAddRemoteDeviceClicked", 15, eventType, "remote-device-add-clicked", 20);
        B = f43Var16;
        f43 f43Var17 = new f43("OnGroupAddContactClicked", 16, eventType, "contact-add-clicked", 20);
        C = f43Var17;
        f43 f43Var18 = new f43("OnGroupRemoteDeviceViaIdClicked", 17, eventType, "remote-device-via-id-clicked", 20);
        D = f43Var18;
        f43 f43Var19 = new f43("OnGroupRemoteDeviceToYourAccountClicked", 18, eventType, "remote-device-to-your-account-clicked", 20);
        E = f43Var19;
        f43 f43Var20 = new f43("OnGroupUnavailableDialogGotItClicked", 19, eventType, "group-unavailable-got-it-clicked", 20);
        F = f43Var20;
        G = new f43[]{f43Var, f43Var2, f43Var3, f43Var4, f43Var5, f43Var6, f43Var7, f43Var8, f43Var9, f43Var10, f43Var11, f43Var12, f43Var13, f43Var14, f43Var15, f43Var16, f43Var17, f43Var18, f43Var19, f43Var20};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f43(String str, int i, EventType eventType, String str2, int i2) {
        super(str, i);
        eventType = (i2 & 1) != 0 ? EventType.View : eventType;
        boolean z2 = (i2 & 2) == 0;
        String str3 = (i2 & 4) != 0 ? "devices-screen-groupslist" : "devices-screen-group-actions-menu";
        this.m = eventType;
        this.n = z2;
        this.f767o = str3;
        this.p = str2;
    }

    public static f43 valueOf(String str) {
        return (f43) Enum.valueOf(f43.class, str);
    }

    public static f43[] values() {
        return (f43[]) G.clone();
    }

    @Override // o.q93
    public final String a() {
        return this.f767o;
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
