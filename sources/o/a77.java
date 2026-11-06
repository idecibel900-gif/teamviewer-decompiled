package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a77 implements AutoCloseable {
    public final of0 m;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a77) {
            return this.m.equals(((a77) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.m + ")";
    }
}
