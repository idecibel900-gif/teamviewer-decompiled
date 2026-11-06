package o;

/* JADX INFO: loaded from: classes.dex */
public enum lj7 implements i10 {
    TVCmdMMChangeCodecType((byte) 1),
    TVCmdMMChangeCodecWavBps((byte) 10),
    TVCmdMMChangeCodecWavChan((byte) 11),
    TVCmdMMChangeCodecWavSps((byte) 12),
    TVCmdMMChangeCodecSpxVbr((byte) 20),
    TVCmdMMChangeCodecSpxBitrate((byte) 21),
    TVCmdMMChangeCodecSpxCmplx((byte) 22),
    TVCmdMMChangeCodecSpxQual((byte) 23),
    TVCmdMMChangeCodecSpxVad((byte) 24),
    TVCmdMMChangeCodecSpxDtx((byte) 25),
    TVCmdMMChangeCodecSpxFpp((byte) 26),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMChangeCodecImgWidth((byte) 30),
    /* JADX INFO: Fake field, exist only in values array */
    TVCmdMMChangeCodecImgHeight((byte) 31);

    public final byte m;

    lj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
