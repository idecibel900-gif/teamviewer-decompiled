package o;

/* JADX INFO: loaded from: classes.dex */
public final class ob {
    public final String a;
    public final String b;
    public final l33 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public ob(String str, String str2, l33 l33Var, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = l33Var;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
    }

    public static ob a(ob obVar, String str, String str2, l33 l33Var, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            str = obVar.a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = obVar.b;
        }
        String str6 = str2;
        l33 l33Var2 = (i & 4) != 0 ? obVar.c : l33Var;
        String str7 = (i & 8) != 0 ? obVar.d : str3;
        String str8 = (i & 16) != 0 ? obVar.e : str4;
        boolean z7 = (i & 32) != 0 ? obVar.f : z;
        boolean z8 = (i & 64) != 0 ? obVar.g : z2;
        boolean z9 = (i & 128) != 0 ? obVar.h : z3;
        boolean z10 = (i & 256) != 0 ? obVar.i : z4;
        boolean z11 = (i & 512) != 0 ? obVar.j : z5;
        boolean z12 = (i & 1024) != 0 ? obVar.k : z6;
        boolean z13 = (i & 2048) != 0 ? obVar.l : true;
        obVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new ob(str5, str6, l33Var2, str7, str8, z7, z8, z9, z10, z11, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return im3.n(this.a, obVar.a) && im3.n(this.b, obVar.b) && im3.n(this.c, obVar.c) && im3.n(this.d, obVar.d) && im3.n(this.e, obVar.e) && this.f == obVar.f && this.g == obVar.g && this.h == obVar.h && this.i == obVar.i && this.j == obVar.j && this.k == obVar.k && this.l == obVar.l;
    }

    public final int hashCode() {
        int iE = to7.e(this.a.hashCode() * 31, 31, this.b);
        l33 l33Var = this.c;
        return Boolean.hashCode(this.l) + to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(to7.e(to7.e((iE + (l33Var == null ? 0 : l33Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("AddRemoteDeviceViaIdUiState(deviceName=", this.a, ", teamviewerId=", this.b, ", group=");
        sbO.append(this.c);
        sbO.append(", password=");
        sbO.append(this.d);
        sbO.append(", description=");
        sbO.append(this.e);
        sbO.append(", isDeviceNameError=");
        sbO.append(this.f);
        sbO.append(", isTeamviewerIdInvalid=");
        fx3.s(sbO, this.g, ", isTeamviewerIdAlreadyExists=", this.h, ", canAddRemoteDeviceToSelectedGroup=");
        fx3.s(sbO, this.i, ", isDescriptionError=", this.j, ", isLoading=");
        sbO.append(this.k);
        sbO.append(", hasOpenWithSelectedGroup=");
        sbO.append(this.l);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ ob(l33 l33Var, int i) {
        this("", "", (i & 4) != 0 ? null : l33Var, "", "", false, false, false, true, false, false, false);
    }
}
