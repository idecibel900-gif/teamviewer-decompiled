package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/nh4;", "Lo/ls4;", "Lo/oh4;", "lottie-compose_release"}, k = 1, mv = {1, ep1.b, 0}, xi = 48)
public final /* data */ class nh4 extends ls4 {
    public final int b;
    public final int c;

    public nh4(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // o.ls4
    public final es4 create() {
        oh4 oh4Var = new oh4();
        oh4Var.A = this.b;
        oh4Var.B = this.c;
        return oh4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh4)) {
            return false;
        }
        nh4 nh4Var = (nh4) obj;
        return this.b == nh4Var.b && this.c == nh4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return fx3.d(this.b, this.c, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        oh4 oh4Var = (oh4) es4Var;
        oh4Var.getClass();
        oh4Var.A = this.b;
        oh4Var.B = this.c;
    }
}
