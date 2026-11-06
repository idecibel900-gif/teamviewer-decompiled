package o;

/* JADX INFO: loaded from: classes.dex */
public enum hj7 implements i10 {
    Codec((byte) 1),
    FrameSize((byte) 2),
    Channels((byte) 3),
    SampleRate((byte) 4),
    FramesPerPacket((byte) 5);

    public final byte m;

    hj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
