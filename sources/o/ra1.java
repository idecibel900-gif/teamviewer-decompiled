package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 's' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements q93 {
    public static final ra1 A;
    public static final ra1 B;
    public static final ra1 C;
    public static final ra1 D;
    public static final ra1 E;
    public static final ra1 F;
    public static final ra1 G;
    public static final ra1 H;
    public static final ra1 I;
    public static final ra1 J;
    public static final ra1 K;
    public static final ra1 L;
    public static final ra1 M;
    public static final ra1 N;
    public static final ra1 O;
    public static final ra1 P;
    public static final ra1 Q;
    public static final ra1 R;
    public static final ra1 S;
    public static final ra1 T;
    public static final ra1 U;
    public static final ra1 V;
    public static final ra1 W;
    public static final ra1 X;
    public static final ra1 Y;
    public static final ra1 Z;
    public static final ra1 a0;
    public static final ra1 b0;
    public static final /* synthetic */ ra1[] c0;
    public static final ra1 r;
    public static final ra1 s;
    public static final ra1 t;
    public static final ra1 u;
    public static final ra1 v;
    public static final ra1 w;
    public static final ra1 x;
    public static final ra1 y;
    public static final ra1 z;
    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1906o;
    public final String p;
    public final String q;

    static {
        ra1 ra1Var = new ra1("OnContactsListScreenOpen", 0, null, "devices-screen-contactslist", "contactslist-screen-opened", 19);
        r = ra1Var;
        EventType eventType = EventType.Event;
        ra1 ra1Var2 = new ra1("OnContactClicked", 1, eventType, "devices-screen-contactslist", "contact-clicked", 16);
        s = ra1Var2;
        int i = 16;
        ra1 ra1Var3 = new ra1("OnContactChipClicked", 2, eventType, "devices-screen-contactslist", "contact-chip-clicked", i);
        t = ra1Var3;
        ra1 ra1Var4 = new ra1("OnContactFabClicked", 3, eventType, "devices-screen-contactslist", "contact-fab-clicked", i);
        u = ra1Var4;
        ra1 ra1Var5 = new ra1("OnInviteContact", 4, eventType, "devices-screen-contactslist", "invite-contact-clicked", i);
        v = ra1Var5;
        ra1 ra1Var6 = new ra1("OnCancelContactInvitation", 5, eventType, "devices-screen-contactslist", "cancel-invite-contact-clicked", i);
        w = ra1Var6;
        ra1 ra1Var7 = new ra1("OnContactDetailScreenOpen", 6, null, "devices-screen-contactdetails", "contact-detail-opened", 19);
        x = ra1Var7;
        ra1 ra1Var8 = new ra1("OnContactConnectClicked", 7, eventType, "devices-screen-contactdetails", "connect-clicked", i);
        y = ra1Var8;
        ra1 ra1Var9 = new ra1("OnContactSendMessageClicked", 8, eventType, "devices-screen-contactdetails", "send-message-clicked", i);
        z = ra1Var9;
        ra1 ra1Var10 = new ra1("OnContactRemoveClicked", 9, eventType, "devices-screen-contactdetails", "remove-clicked", i);
        A = ra1Var10;
        ra1 ra1Var11 = new ra1("OnCancelInvitationClicked", 10, eventType, "devices-screen-contactdetails", "cancel-invitation-clicked", i);
        ra1 ra1Var12 = new ra1("OnContactTransferFilesClicked", 11, eventType, "devices-screen-contactdetails", "transfer-files-clicked", i);
        B = ra1Var12;
        ra1 ra1Var13 = new ra1("OnContactEditContactClicked", 12, eventType, "devices-screen-contactdetails", "edit-contact-clicked", i);
        C = ra1Var13;
        ra1 ra1Var14 = new ra1("OnContactEditScreenOpen", 13, null, "devices-screen-contactedit", "contact-edit-opened", 19);
        D = ra1Var14;
        ra1 ra1Var15 = new ra1("OnContactEditNameClicked", 14, eventType, "devices-screen-contactedit", "name-clicked", i);
        E = ra1Var15;
        ra1 ra1Var16 = new ra1("OnContactEditDescriptionClicked", 15, eventType, "devices-screen-contactedit", "description-clicked", i);
        F = ra1Var16;
        ra1 ra1Var17 = new ra1("OnContactEditSaveClicked", 16, eventType, "devices-screen-contactedit", "save-clicked", i);
        ra1 ra1Var18 = new ra1("OnContactEditBackClicked", 17, eventType, "devices-screen-contactedit", "back-clicked", i);
        ra1 ra1Var19 = new ra1("OnContactEditDiscardDialogOpen", 18, null, "devices-screen-contactedit", "discard-dialog-opened", 19);
        G = ra1Var19;
        ra1 ra1Var20 = new ra1("OnContactEditDiscardClicked", 19, eventType, "devices-screen-contactedit", "discard-clicked", i);
        H = ra1Var20;
        ra1 ra1Var21 = new ra1("OnContactEditCancelDiscardClicked", 20, eventType, "devices-screen-contactedit", "cancel-clicked", i);
        I = ra1Var21;
        ra1 ra1Var22 = new ra1("OnContactSortByClicked", 21, eventType, "devices-screen-contactslist", "contact-sort-by-clicked", i);
        J = ra1Var22;
        ra1 ra1Var23 = new ra1("OnContactSortByOptionAscendingClicked", 22, eventType, true, "devices-screen-contactslist", "contact-sort-by-option-clicked", "ascending");
        K = ra1Var23;
        ra1 ra1Var24 = new ra1("OnContactSortByOptionDescendingClicked", 23, eventType, true, "devices-screen-contactslist", "contact-sort-by-option-clicked", "descending");
        L = ra1Var24;
        ra1 ra1Var25 = new ra1("OnContactSortByOptionOnlineClicked", 24, eventType, true, "devices-screen-contactslist", "contact-sort-by-option-clicked", "online");
        M = ra1Var25;
        ra1 ra1Var26 = new ra1("OnContactSortByOptionOfflineClicked", 25, eventType, true, "devices-screen-contactslist", "contact-sort-by-option-clicked", "offline");
        N = ra1Var26;
        ra1 ra1Var27 = new ra1("OnContactSortByOptionPendingClicked", 26, eventType, true, "devices-screen-contactslist", "contact-sort-by-option-clicked", "pending");
        O = ra1Var27;
        int i2 = 16;
        ra1 ra1Var28 = new ra1("OnContactUnavailableDialogGotItClicked", 27, eventType, "devices-screen-contactdetails", "contact-unavailable-got-it-clicked", i2);
        P = ra1Var28;
        ra1 ra1Var29 = new ra1("OnContactFiltersClicked", 28, eventType, "devices-screen-contactslist", "contact-filters-clicked", i2);
        Q = ra1Var29;
        ra1 ra1Var30 = new ra1("OnContactFilterAllClicked", 29, eventType, true, "devices-screen-contactslist", "contact-filter-clicked", "all");
        R = ra1Var30;
        ra1 ra1Var31 = new ra1("OnContactFilterCompanyClicked", 30, eventType, true, "devices-screen-contactslist", "contact-filter-clicked", "company");
        S = ra1Var31;
        ra1 ra1Var32 = new ra1("OnContactFilterPersonalClicked", 31, eventType, true, "devices-screen-contactslist", "contact-filter-clicked", "personal");
        T = ra1Var32;
        ra1 ra1Var33 = new ra1("OnContactFilterInvitationClicked", 32, eventType, true, "devices-screen-contactslist", "contact-filter-clicked", "invitation");
        U = ra1Var33;
        int i3 = 16;
        ra1 ra1Var34 = new ra1("OnContactListMoreActionsClicked", 33, eventType, "devices-screen-contactslist", "contact-more-actions-clicked", i3);
        V = ra1Var34;
        ra1 ra1Var35 = new ra1("OnContactListConnectClicked", 34, eventType, "devices-screen-contactslist", "contact-more-connect-clicked", i3);
        W = ra1Var35;
        ra1 ra1Var36 = new ra1("OnContactListTransferFilesClicked", 35, eventType, "devices-screen-contactslist", "contact-more-transfer-files-clicked", i3);
        X = ra1Var36;
        ra1 ra1Var37 = new ra1("OnContactListShowDetailsClicked", 36, eventType, "devices-screen-contactslist", "contact-more-show-details-clicked", i3);
        Y = ra1Var37;
        ra1 ra1Var38 = new ra1("OnContactListSendMessageClicked", 37, eventType, "devices-screen-contactslist", "contact-more-send-message-clicked", i3);
        Z = ra1Var38;
        ra1 ra1Var39 = new ra1("OnContactListEditContactClicked", 38, eventType, "devices-screen-contactslist", "contact-more-edit-contact-clicked", i3);
        a0 = ra1Var39;
        ra1 ra1Var40 = new ra1("OnContactListRemoveContactClicked", 39, eventType, "devices-screen-contactslist", "contact-more-remove-contact-clicked", i3);
        b0 = ra1Var40;
        c0 = new ra1[]{ra1Var, ra1Var2, ra1Var3, ra1Var4, ra1Var5, ra1Var6, ra1Var7, ra1Var8, ra1Var9, ra1Var10, ra1Var11, ra1Var12, ra1Var13, ra1Var14, ra1Var15, ra1Var16, ra1Var17, ra1Var18, ra1Var19, ra1Var20, ra1Var21, ra1Var22, ra1Var23, ra1Var24, ra1Var25, ra1Var26, ra1Var27, ra1Var28, ra1Var29, ra1Var30, ra1Var31, ra1Var32, ra1Var33, ra1Var34, ra1Var35, ra1Var36, ra1Var37, ra1Var38, ra1Var39, ra1Var40};
    }

    public /* synthetic */ ra1(String str, int i, EventType eventType, String str2, String str3, int i2) {
        this(str, i, (i2 & 1) != 0 ? EventType.View : eventType, (i2 & 2) == 0, str2, str3, "");
    }

    public static ra1 valueOf(String str) {
        return (ra1) Enum.valueOf(ra1.class, str);
    }

    public static ra1[] values() {
        return (ra1[]) c0.clone();
    }

    @Override // o.q93
    public final String a() {
        return this.f1906o;
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

    public ra1(String str, int i, EventType eventType, boolean z2, String str2, String str3, String str4) {
        super(str, i);
        this.m = eventType;
        this.n = z2;
        this.f1906o = str2;
        this.p = str3;
        this.q = str4;
    }
}
