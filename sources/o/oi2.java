package o;

/* JADX INFO: loaded from: classes.dex */
public final class oi2 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public oi2(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static oi2 a(oi2 oi2Var, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            i = oi2Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = oi2Var.b;
        }
        String str2 = str;
        String str3 = (i2 & 4) != 0 ? oi2Var.c : "";
        if ((i2 & 8) != 0) {
            z = oi2Var.d;
        }
        boolean z5 = z;
        if ((i2 & 16) != 0) {
            z2 = oi2Var.e;
        }
        boolean z6 = z2;
        boolean z7 = (i2 & 32) != 0 ? oi2Var.f : z3;
        boolean z8 = (i2 & 64) != 0 ? oi2Var.g : true;
        boolean z9 = (i2 & 128) != 0 ? oi2Var.h : z4;
        oi2Var.getClass();
        oi2Var.getClass();
        return new oi2(i3, str2, str3, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi2)) {
            return false;
        }
        oi2 oi2Var = (oi2) obj;
        return this.a == oi2Var.a && this.b.equals(oi2Var.b) && this.c.equals(oi2Var.c) && this.d == oi2Var.d && this.e == oi2Var.e && this.f == oi2Var.f && this.g == oi2Var.g && this.h == oi2Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + to7.f(to7.f(to7.f(to7.f(to7.f(to7.e(to7.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackState(feedbackRating=");
        sb.append(this.a);
        sb.append(", feedbackComment=");
        sb.append(this.b);
        sb.append(", email=");
        sb.append(this.c);
        sb.append(", isLogFileAttached=");
        sb.append(this.d);
        sb.append(", isButtonEnabled=");
        fx3.s(sb, this.e, ", isFeedbackCommentValid=", this.f, ", isEmailValid=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", connectionError=false)");
        return sb.toString();
    }
}
