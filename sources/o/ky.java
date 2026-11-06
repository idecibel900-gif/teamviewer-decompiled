package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ky implements Iterator {
    public final /* synthetic */ byte m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1313o;
    public final /* synthetic */ Iterable p;

    public ky(mu8 mu8Var) {
        this.m = (byte) 4;
        this.p = mu8Var;
        this.n = 0;
        this.f1313o = mu8Var.c();
    }

    public byte a() {
        try {
            byte[] bArr = ((pc4) this.p).n;
            int i = this.n;
            this.n = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            an4.j(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                ly lyVar = (ly) this.p;
                if (lyVar.m != this.n) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                while (true) {
                    int i = this.f1313o;
                    if (i < lyVar.m && ly.n(lyVar.n[i])) {
                        this.f1313o++;
                    }
                }
                return this.f1313o < lyVar.m;
            case 1:
                return this.n < this.f1313o;
            case 2:
                return this.n < this.f1313o;
            case 3:
                return this.n < this.f1313o;
            default:
                return this.n < this.f1313o;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Iterable iterable = this.p;
        switch (b) {
            case 0:
                ly lyVar = (ly) iterable;
                int i = lyVar.m;
                if (i != this.n) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                int i2 = this.f1313o;
                if (i2 >= i) {
                    yq4.p();
                    return null;
                }
                jy jyVar = new jy(lyVar.n[i2], (String) lyVar.f1417o[this.f1313o], lyVar);
                this.f1313o++;
                return jyVar;
            case 1:
                int i3 = this.n;
                if (i3 < this.f1313o) {
                    this.n = i3 + 1;
                    return Byte.valueOf(((yh0) iterable).f(i3));
                }
                yq4.p();
                return null;
            case 2:
                int i4 = this.n;
                if (i4 < this.f1313o) {
                    this.n = i4 + 1;
                    return Byte.valueOf(((wh0) iterable).g(i4));
                }
                yq4.p();
                return null;
            case 3:
                return Byte.valueOf(a());
            default:
                int i5 = this.n;
                if (i5 < this.f1313o) {
                    this.n = i5 + 1;
                    return Byte.valueOf(((mu8) iterable).a(i5));
                }
                yq4.p();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                ly lyVar = (ly) this.p;
                int i = this.f1313o - 1;
                this.f1313o = i;
                lyVar.p(i);
                this.n--;
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ky(wh0 wh0Var) {
        this.m = (byte) 2;
        this.p = wh0Var;
        this.n = 0;
        this.f1313o = wh0Var.size();
    }

    public ky(yh0 yh0Var) {
        this.m = (byte) 1;
        this.p = yh0Var;
        this.n = 0;
        this.f1313o = yh0Var.size();
    }

    public ky(pc4 pc4Var) {
        this.m = (byte) 3;
        this.p = pc4Var;
        this.n = 0;
        this.f1313o = pc4Var.n.length;
    }

    public ky(ly lyVar) {
        this.m = (byte) 0;
        this.p = lyVar;
        this.n = lyVar.m;
        this.f1313o = 0;
    }
}
