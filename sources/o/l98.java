package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class l98 extends IOException {
    public final String m;
    public final String n;

    public l98(String str, String str2) {
        super("Unhandled content type. Must be a text or XML media type");
        this.m = str;
        this.n = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Mimetype=" + this.m + ", URL=" + this.n;
    }
}
