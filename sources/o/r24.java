package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r24 {
    public final oz3 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public r24(oz3 oz3Var, List list, ArrayList arrayList, List list2) {
        this.a = oz3Var;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r24)) {
            return false;
        }
        r24 r24Var = (r24) obj;
        return this.a.equals(r24Var.a) && this.b.equals(r24Var.b) && this.c.equals(r24Var.c) && this.d.equals(r24Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + to7.f((this.c.hashCode() + to7.g(this.b, this.a.hashCode() * 961, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
