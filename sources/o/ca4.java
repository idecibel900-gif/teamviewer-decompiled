package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ca4 implements Iterator, su3 {
    public final CharSequence m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f507o;
    public int p;
    public int q;

    public ca4(CharSequence charSequence) {
        this.m = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        byte b = this.n;
        if (b != 0) {
            return b == 1;
        }
        if (this.q < 0) {
            this.n = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.m;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.f507o; i3 < length2; i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.n = (byte) 1;
                this.q = i;
                this.p = length;
                return true;
            }
        }
        i = -1;
        this.n = (byte) 1;
        this.q = i;
        this.p = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        this.n = (byte) 0;
        int i = this.p;
        int i2 = this.f507o;
        this.f507o = this.q + i;
        return this.m.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
