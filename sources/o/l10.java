package o;

/* JADX INFO: loaded from: classes.dex */
public enum l10 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    CommandEmpty(0),
    /* JADX INFO: Fake field, exist only in values array */
    CommandNumber(255),
    CommandClass(254),
    /* JADX INFO: Fake field, exist only in values array */
    InterProcessDestination(253),
    TeamViewerSessionID(252),
    /* JADX INFO: Fake field, exist only in values array */
    Priority(251),
    /* JADX INFO: Fake field, exist only in values array */
    ResponseToCommandNr(250),
    /* JADX INFO: Fake field, exist only in values array */
    EncryptionLevel(249),
    /* JADX INFO: Fake field, exist only in values array */
    SenderParticipantID(248),
    /* JADX INFO: Fake field, exist only in values array */
    IPCParams(247),
    /* JADX INFO: Fake field, exist only in values array */
    StreamID(246),
    /* JADX INFO: Fake field, exist only in values array */
    InterProcessSource(243),
    /* JADX INFO: Fake field, exist only in values array */
    WindowsSessionID(242),
    /* JADX INFO: Fake field, exist only in values array */
    AcknowledgeDesired(241),
    /* JADX INFO: Fake field, exist only in values array */
    ForceDefaultBehaviour(240),
    /* JADX INFO: Fake field, exist only in values array */
    Header(238);

    public final byte m;

    l10(int i) {
        this.m = (byte) i;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
