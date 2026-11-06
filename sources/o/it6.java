package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class it6 {
    public final SupportSession a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1101o;

    public it6(SupportSession supportSession, boolean z, String str, String str2, String str3, String str4, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = supportSession;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.f1101o = z9;
    }

    public static it6 a(it6 it6Var, SupportSession supportSession, boolean z, String str, String str2, String str3, String str4, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        SupportSession supportSession2 = (i & 1) != 0 ? it6Var.a : supportSession;
        boolean z10 = (i & 2) != 0 ? it6Var.b : z;
        String str5 = (i & 4) != 0 ? it6Var.c : str;
        String str6 = (i & 8) != 0 ? it6Var.d : str2;
        String str7 = (i & 16) != 0 ? it6Var.e : str3;
        String str8 = (i & 32) != 0 ? it6Var.f : str4;
        Integer num2 = (i & 64) != 0 ? it6Var.g : num;
        boolean z11 = (i & 128) != 0 ? it6Var.h : z2;
        boolean z12 = (i & 256) != 0 ? it6Var.i : z3;
        boolean z13 = (i & 512) != 0 ? it6Var.j : z4;
        boolean z14 = (i & 1024) != 0 ? it6Var.k : z5;
        boolean z15 = (i & 2048) != 0 ? it6Var.l : z6;
        boolean z16 = (i & 4096) != 0 ? it6Var.m : z7;
        boolean z17 = (i & 8192) != 0 ? it6Var.n : z8;
        boolean z18 = (i & 16384) != 0 ? it6Var.f1101o : z9;
        it6Var.getClass();
        return new it6(supportSession2, z10, str5, str6, str7, str8, num2, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6Var = (it6) obj;
        return im3.n(this.a, it6Var.a) && this.b == it6Var.b && im3.n(this.c, it6Var.c) && this.d.equals(it6Var.d) && this.e.equals(it6Var.e) && this.f.equals(it6Var.f) && im3.n(this.g, it6Var.g) && this.h == it6Var.h && this.i == it6Var.i && this.j == it6Var.j && this.k == it6Var.k && this.l == it6Var.l && this.m == it6Var.m && this.n == it6Var.n && this.f1101o == it6Var.f1101o;
    }

    public final int hashCode() {
        SupportSession supportSession = this.a;
        int iF = to7.f((supportSession == null ? 0 : supportSession.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iE = to7.e(to7.e(to7.e((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        return Boolean.hashCode(this.f1101o) + to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f((iE + (num != null ? num.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfoScreenUiState(session=");
        sb.append(this.a);
        sb.append(", isSaving=");
        sb.append(this.b);
        sb.append(", assignedContactName=");
        e41.t(sb, this.c, ", editedName=", this.d, ", editedEmail=");
        e41.t(sb, this.e, ", editedDescription=", this.f, ", editedGroupId=");
        sb.append(this.g);
        sb.append(", isSessionNameValid=");
        sb.append(this.h);
        sb.append(", isSessionEmailValid=");
        fx3.s(sb, this.i, ", isSessionDescriptionValid=", this.j, ", shouldShowWaitingRoom=");
        fx3.s(sb, this.k, ", shouldShowShareSessionBottomSheet=", this.l, ", shouldShowMoreOptionsBottomSheet=");
        fx3.s(sb, this.m, ", shouldShowRemoveSessionDialog=", this.n, ", shouldShowSessionUnavailableDialog=");
        return ua5.n(")", sb, this.f1101o);
    }
}
