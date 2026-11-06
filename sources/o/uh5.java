package o;

/* JADX INFO: loaded from: classes.dex */
public final class uh5 extends vh5 {
    public final float c;

    public uh5(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh5) && Float.compare(this.c, ((uh5) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.c + ")";
    }
}
