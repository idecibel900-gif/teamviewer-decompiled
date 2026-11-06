package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lr0 {
    public final List a;
    public final ov1 b;

    public lr0(List list, ov1 ov1Var) {
        ov1Var.getClass();
        this.a = list;
        this.b = ov1Var;
    }

    public static lr0 a(lr0 lr0Var, ov1 ov1Var) {
        List list = lr0Var.a;
        lr0Var.getClass();
        return new lr0(list, ov1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr0)) {
            return false;
        }
        lr0 lr0Var = (lr0) obj;
        return this.a.equals(lr0Var.a) && this.b == lr0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChipState(deviceTabChips=" + this.a + ", selectedChip=" + this.b + ")";
    }
}
