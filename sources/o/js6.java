package o;

/* JADX INFO: loaded from: classes.dex */
public enum js6 implements i10 {
    AccountID((byte) 1),
    CompanyID((byte) 2),
    SessionType((byte) 3),
    ParticipantSessionGuid((byte) 4),
    CurrentUsername((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyID((byte) 6),
    PartnerBuddyName((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    PartnerAccountID((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    ParentGroupID((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    SessionDirection((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    VendorID((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    TenantID((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    ControlType((byte) 13);

    public final byte m;

    js6(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
