package o;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public final class md8 {
    public final MediaCodecInfo a;
    public final MediaCodecInfo.CodecCapabilities b;
    public final MediaCodecInfo.CodecProfileLevel c;
    public final MediaCodecInfo.VideoCapabilities d;

    public md8(MediaCodecInfo mediaCodecInfo, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaCodecInfo.CodecProfileLevel codecProfileLevel, MediaCodecInfo.VideoCapabilities videoCapabilities) {
        this.a = mediaCodecInfo;
        this.b = codecCapabilities;
        this.c = codecProfileLevel;
        this.d = videoCapabilities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md8)) {
            return false;
        }
        md8 md8Var = (md8) obj;
        return this.a.equals(md8Var.a) && this.b.equals(md8Var.b) && this.c.equals(md8Var.c) && this.d.equals(md8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CodecInfo(mediaCodecInfo=" + this.a + ", capabilities=" + this.b + ", profileLevel=" + this.c + ", videoCapabilities=" + this.d + ")";
    }
}
