package io.sentry.android.replay.video;

import java.io.File;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final File a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f = "video/avc";

    public a(File file, int i, int i2, int i3, int i4) {
        this.a = file;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f.equals(aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fx3.a(this.e, fx3.a(this.d, fx3.a(this.c, fx3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "MuxerConfig(file=" + this.a + ", recordingWidth=" + this.b + ", recordingHeight=" + this.c + ", frameRate=" + this.d + ", bitRate=" + this.e + ", mimeType=" + this.f + ')';
    }
}
