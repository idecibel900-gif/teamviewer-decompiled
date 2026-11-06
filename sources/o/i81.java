package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i81 {
    public final h71 a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ i81(String str, String str2, boolean z, boolean z2, int i) {
        this(null, false, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2, ea2.m, false, false, false, false);
    }

    public static i81 a(i81 i81Var, h71 h71Var, boolean z, String str, String str2, boolean z2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        if ((i & 1) != 0) {
            h71Var = i81Var.a;
        }
        h71 h71Var2 = h71Var;
        if ((i & 2) != 0) {
            z = i81Var.b;
        }
        boolean z8 = z;
        if ((i & 4) != 0) {
            str = i81Var.c;
        }
        String str3 = str;
        String str4 = (i & 8) != 0 ? i81Var.d : str2;
        boolean z9 = (i & 16) != 0 ? i81Var.e : z2;
        boolean z10 = (i & 32) != 0 ? i81Var.f : z3;
        List list2 = (i & 64) != 0 ? i81Var.g : list;
        boolean z11 = (i & 128) != 0 ? i81Var.h : z4;
        boolean z12 = (i & 256) != 0 ? i81Var.i : z5;
        boolean z13 = (i & 512) != 0 ? i81Var.j : z6;
        boolean z14 = (i & 1024) != 0 ? i81Var.k : z7;
        i81Var.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        return new i81(h71Var2, z8, str3, str4, z9, z10, list2, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i81)) {
            return false;
        }
        i81 i81Var = (i81) obj;
        return im3.n(this.a, i81Var.a) && this.b == i81Var.b && im3.n(this.c, i81Var.c) && im3.n(this.d, i81Var.d) && this.e == i81Var.e && this.f == i81Var.f && im3.n(this.g, i81Var.g) && this.h == i81Var.h && this.i == i81Var.i && this.j == i81Var.j && this.k == i81Var.k;
    }

    public final int hashCode() {
        h71 h71Var = this.a;
        return Boolean.hashCode(this.k) + to7.f(to7.f(to7.f(to7.g(this.g, to7.f(to7.f(to7.e(to7.e(to7.f((h71Var == null ? 0 : h71Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInfoScreenUiState(originalContact=");
        sb.append(this.a);
        sb.append(", isSaving=");
        sb.append(this.b);
        sb.append(", editedName=");
        e41.t(sb, this.c, ", editedNote=", this.d, ", isContactNameValid=");
        fx3.s(sb, this.e, ", isContactNoteValid=", this.f, ", contactDevicesForSelection=");
        sb.append(this.g);
        sb.append(", isFileTransferAction=");
        sb.append(this.h);
        sb.append(", showChooseComputerOfContact=");
        fx3.s(sb, this.i, ", showContactUnavailableDialog=", this.j, ", showRemoveContactConfirmationDialog=");
        return ua5.n(")", sb, this.k);
    }

    public i81(h71 h71Var, boolean z, String str, String str2, boolean z2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        str2.getClass();
        this.a = h71Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = z3;
        this.g = list;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
    }
}
