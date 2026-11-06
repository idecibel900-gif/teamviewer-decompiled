package o;

/* JADX INFO: loaded from: classes.dex */
public enum si7 implements i10 {
    Challenge((byte) 0),
    Response((byte) 1),
    Authenticated((byte) 2),
    Retries((byte) 3),
    IncomingDenied((byte) 4),
    BlockDuration((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    WinLogin((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    WinDomain((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    WinPassword((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    Restarting((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    WinLoginAllowed((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    VistaLimitedQS((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    LimitAccess((byte) 12),
    ControlPassword((byte) 13),
    RetryReason((byte) 14),
    /* JADX INFO: Fake field, exist only in values array */
    AuthPayload((byte) 15),
    /* JADX INFO: Fake field, exist only in values array */
    SRPClientSecret((byte) 16),
    /* JADX INFO: Fake field, exist only in values array */
    AuthPayload((byte) 17),
    /* JADX INFO: Fake field, exist only in values array */
    SRPClientSecret((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    AuthPayload((byte) 19),
    /* JADX INFO: Fake field, exist only in values array */
    SRPClientSecret((byte) 20),
    /* JADX INFO: Fake field, exist only in values array */
    AuthPayload((byte) 21),
    /* JADX INFO: Fake field, exist only in values array */
    SRPClientSecret((byte) 22),
    StartSRPAuth((byte) 23),
    StartSRPAuthIdentifier((byte) 24),
    SupportedAuthenticationMethods((byte) 25),
    SelectedAuthenticationMethod((byte) 26),
    /* JADX INFO: Fake field, exist only in values array */
    AuthPayload((byte) 27),
    Abort((byte) 28),
    /* JADX INFO: Fake field, exist only in values array */
    PrepareSwitchEncryptionKey((byte) 29);

    public final byte m;

    si7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
