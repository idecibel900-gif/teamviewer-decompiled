package o;

import com.teamviewer.outgoingsessionlib.swig.StreamType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vy {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[uv4.values().length];
        try {
            ju juVar = uv4.m;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[StreamType.values().length];
        try {
            iArr2[StreamType.StreamType_RemoteAudioControl.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[StreamType.StreamType_RemoteAudio.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[StreamType.StreamType_Audio.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
