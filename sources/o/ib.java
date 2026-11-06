package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ib {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;

    public ib(boolean z, boolean z2, String str, String str2, List list, List list2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = z3;
        this.h = z4;
    }

    public static ib a(ib ibVar, boolean z, boolean z2, String str, String str2, List list, List list2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = ibVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = ibVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = ibVar.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = ibVar.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = ibVar.e;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = ibVar.f;
        }
        List list4 = list2;
        boolean z6 = (i & 64) != 0 ? ibVar.g : z3;
        boolean z7 = (i & 128) != 0 ? ibVar.h : true;
        ibVar.getClass();
        str3.getClass();
        str4.getClass();
        list3.getClass();
        list4.getClass();
        return new ib(z4, z5, str3, str4, list3, list4, z6, z7);
    }

    public final boolean b() {
        String str = this.c;
        int length = str.length();
        return ((3 <= length && length < 51) || str.length() == 0) && this.f.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return this.a == ibVar.a && this.b == ibVar.b && im3.n(this.c, ibVar.c) && im3.n(this.d, ibVar.d) && im3.n(this.e, ibVar.e) && im3.n(this.f, ibVar.f) && this.g == ibVar.g && this.h == ibVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + to7.f(to7.g(this.f, to7.g(this.e, to7.e(to7.e(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddRemoteDeviceToYourAccountUiState(hasAccessToAddRemoteDevice=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", deviceName=");
        e41.t(sb, this.c, ", customModuleAssignmentLink=", this.d, ", groups=");
        sb.append(this.e);
        sb.append(", groupsWithoutPermission=");
        sb.append(this.f);
        sb.append(", isDeviceNameError=");
        sb.append(this.g);
        sb.append(", hasOpenWithSelectedGroup=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ib() {
        ea2 ea2Var = ea2.m;
        this(false, false, "", "", ea2Var, ea2Var, false, false);
    }
}
