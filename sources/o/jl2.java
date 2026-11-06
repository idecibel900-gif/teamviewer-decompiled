package o;

/* JADX INFO: loaded from: classes.dex */
public final class jl2 {
    public final int a;
    public final int[] b;
    public final wc6[] c;

    public jl2(int i, int i2, int i3, int i4, int[] iArr) {
        this.a = i;
        this.b = iArr;
        float f = i4;
        this.c = new wc6[]{new wc6(i2, f), new wc6(i3, f)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jl2) && this.a == ((jl2) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
