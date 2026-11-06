package o;

/* JADX INFO: loaded from: classes.dex */
public enum cj7 implements i10 {
    Width((byte) 0),
    Height((byte) 1),
    Bpp((byte) 2),
    Monitors((byte) 3),
    IsSingleWindow((byte) 4),
    MaxBPP((byte) 5),
    Quality((byte) 6),
    CurrentMonitor((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    Palette((byte) 8),
    VDesktopOffsetX((byte) 9),
    VDesktopOffsetY((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    MonitorNames((byte) 11),
    TileSize((byte) 12),
    TileFeatures((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    VideoStreamID((byte) 14),
    DevModes((byte) 24),
    OriginalResolutionX((byte) 25),
    OriginalResolutionY((byte) 26),
    DPIFactor((byte) 27),
    ViMoDriverInstalled((byte) 30);

    public final byte m;

    cj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
