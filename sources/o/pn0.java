package o;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class pn0 implements CharacterIterator {
    public final CharSequence m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1750o = 0;

    public pn0(int i, CharSequence charSequence) {
        this.m = charSequence;
        this.n = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f1750o;
        if (i == this.n) {
            return (char) 65535;
        }
        return this.m.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f1750o = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.n;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f1750o;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.n;
        if (i == 0) {
            this.f1750o = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f1750o = i2;
        return this.m.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f1750o + 1;
        this.f1750o = i;
        int i2 = this.n;
        if (i < i2) {
            return this.m.charAt(i);
        }
        this.f1750o = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f1750o;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f1750o = i2;
        return this.m.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.n || i < 0) {
            hk0.g("invalid position");
            return (char) 0;
        }
        this.f1750o = i;
        return current();
    }
}
