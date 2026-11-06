package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class or6 {
    public final List a;
    public final SupportSession b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final rr6 i;
    public final int j;
    public final int k;

    public or6(List list, SupportSession supportSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, rr6 rr6Var, int i, int i2) {
        list.getClass();
        rr6Var.getClass();
        this.a = list;
        this.b = supportSession;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = rr6Var;
        this.j = i;
        this.k = i2;
    }

    public static or6 a(or6 or6Var, List list, SupportSession supportSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, rr6 rr6Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            list = or6Var.a;
        }
        List list2 = list;
        if ((i3 & 2) != 0) {
            supportSession = or6Var.b;
        }
        SupportSession supportSession2 = supportSession;
        if ((i3 & 4) != 0) {
            z = or6Var.c;
        }
        boolean z7 = z;
        boolean z8 = (i3 & 8) != 0 ? or6Var.d : z2;
        boolean z9 = (i3 & 16) != 0 ? or6Var.e : z3;
        boolean z10 = (i3 & 32) != 0 ? or6Var.f : z4;
        boolean z11 = (i3 & 64) != 0 ? or6Var.g : z5;
        boolean z12 = (i3 & 128) != 0 ? or6Var.h : z6;
        rr6 rr6Var2 = (i3 & 256) != 0 ? or6Var.i : rr6Var;
        int i4 = (i3 & 512) != 0 ? or6Var.j : i;
        int i5 = (i3 & 1024) != 0 ? or6Var.k : i2;
        or6Var.getClass();
        list2.getClass();
        rr6Var2.getClass();
        return new or6(list2, supportSession2, z7, z8, z9, z10, z11, z12, rr6Var2, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or6)) {
            return false;
        }
        or6 or6Var = (or6) obj;
        return im3.n(this.a, or6Var.a) && im3.n(this.b, or6Var.b) && this.c == or6Var.c && this.d == or6Var.d && this.e == or6Var.e && this.f == or6Var.f && this.g == or6Var.g && this.h == or6Var.h && this.i == or6Var.i && this.j == or6Var.j && this.k == or6Var.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        SupportSession supportSession = this.b;
        return Integer.hashCode(this.k) + fx3.a(this.j, (this.i.hashCode() + to7.f(to7.f(to7.f(to7.f(to7.f(to7.f((iHashCode + (supportSession == null ? 0 : supportSession.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceQueueScreenUiState(sessions=");
        sb.append(this.a);
        sb.append(", currentSession=");
        sb.append(this.b);
        sb.append(", isLoading=");
        fx3.s(sb, this.c, ", shouldShowServiceQueueSortBottomSheet=", this.d, ", shouldShowShareBottomSheet=");
        fx3.s(sb, this.e, ", shouldShowWaitingRoom=", this.f, ", showRemoveSessionDialog=");
        fx3.s(sb, this.g, ", showSessionNotInListDialog=", this.h, ", sortOrder=");
        sb.append(this.i);
        sb.append(", scrollIndex=");
        sb.append(this.j);
        sb.append(", scrollOffset=");
        return to7.l(sb, this.k, ")");
    }
}
