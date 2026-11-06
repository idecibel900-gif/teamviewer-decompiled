package o;

/* JADX INFO: loaded from: classes.dex */
public enum fs6 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    PartnerID((byte) 1),
    ConnectionMode((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    SingleWindow((byte) 4),
    RemoteLicense((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLicenseFeaturesLegacy((byte) 7),
    IsDirectLANConnection((byte) 8),
    TimeOutSecs((byte) 9),
    AllowToInteract((byte) 10),
    LocalGUID((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteGUID((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    DynamicPasswordUsed((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    CanMeetingCommands((byte) 14),
    OwnParticipantName((byte) 15),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingID((byte) 16),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLicenseFeaturesLegacy((byte) 17),
    UsedLicense((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLicenseFeaturesLegacy((byte) 19),
    RemoteOSType((byte) 20),
    /* JADX INFO: Fake field, exist only in values array */
    IsSendFileRecipient((byte) 21),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingFlags((byte) 22),
    /* JADX INFO: Fake field, exist only in values array */
    CusSatisfactionGUID((byte) 23),
    /* JADX INFO: Fake field, exist only in values array */
    InputBlockerStatePermissions((byte) 24),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingType((byte) 25),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLicenseFeatureSet((byte) 26);

    public final byte m;

    fs6(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
