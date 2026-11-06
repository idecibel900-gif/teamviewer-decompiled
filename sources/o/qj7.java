package o;

/* JADX INFO: loaded from: classes.dex */
public enum qj7 implements i10 {
    AccessControlType((byte) 0),
    FileTransferAccess((byte) 1),
    RemoteControlAccess((byte) 2),
    DisableRemoteInput((byte) 3),
    ChangeDirAllowed((byte) 4),
    ControlRemoteTV((byte) 5),
    AllowVPN((byte) 6),
    AllowPartnerViewDesktop((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    ShareMyFiles((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    ShareFilesWithMe((byte) 9);

    public final byte m;

    qj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
