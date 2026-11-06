package o;

/* JADX INFO: loaded from: classes.dex */
public enum jj7 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustVideoAllowed((byte) 1),
    TVCmdMMAdjustVideoActive((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustLimitResolutionX((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustLimitResolutionY((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustDisplayedResolutionX((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustDisplayedResolutionY((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustLimitFramerate((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMAdjustForceKeyframe((byte) 8),
    TVCmdMMAdjustAudioActive((byte) 9);

    public final byte m;

    jj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
