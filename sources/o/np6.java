package o;

/* JADX INFO: loaded from: classes.dex */
public final class np6 {
    public final String a;
    public final hw2 b;
    public final boolean c;

    public /* synthetic */ np6(String str) {
        this(str, new jp6((byte) 13));
    }

    public final String toString() {
        return ua5.m("AccessibilityKey: ", this.a);
    }

    public np6(String str, hw2 hw2Var) {
        this.a = str;
        this.b = hw2Var;
    }

    public np6(String str, int i) {
        this(str);
        this.c = true;
    }

    public np6(String str, boolean z, hw2 hw2Var) {
        this(str, hw2Var);
        this.c = z;
    }
}
