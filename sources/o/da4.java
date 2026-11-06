package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class da4 implements Iterator, su3 {
    public String m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fx f603o;

    public da4(fx fxVar) {
        this.f603o = fxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.m;
        if (line == null && !this.n) {
            line = ((BufferedReader) this.f603o.b).readLine();
            this.m = line;
            if (line == null) {
                this.n = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        String str = this.m;
        this.m = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
