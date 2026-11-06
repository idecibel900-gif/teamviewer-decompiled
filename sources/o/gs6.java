package o;

/* JADX INFO: loaded from: classes.dex */
public enum gs6 implements i10 {
    BytesSent((byte) 1),
    BytesReceived((byte) 2),
    ConnectionProtocol((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteLicense((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    LocalLicense((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    IsDirectLANConnection((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    TimeOutSecs((byte) 7),
    LocalGUID((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteGUID((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    UsedLicense((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectedToLANIp((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    CusSatisfactionGUID((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    Duration((byte) 13);

    public final byte m;

    gs6(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
