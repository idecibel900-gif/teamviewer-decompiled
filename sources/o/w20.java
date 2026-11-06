package o;

/* JADX INFO: loaded from: classes.dex */
public final class w20 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public w20(int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.f = -1;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = i4;
                break;
            default:
                this.b = i;
                this.c = i4;
                this.d = i2;
                this.e = i3;
                this.f = i2 + i3;
                break;
        }
    }

    public boolean a() {
        int i;
        int i2;
        int i3;
        int i4 = this.b;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.e;
            int i7 = this.c;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.e;
            int i9 = this.d;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f;
            int i11 = this.c;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f;
            int i13 = this.d;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean b(int i) {
        return i != -1 && this.d == (i % 3) * 3;
    }

    public void c() {
        this.f = (this.d / 3) + ((this.e / 30) * 3);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.f + "|" + this.e;
            default:
                return super.toString();
        }
    }
}
