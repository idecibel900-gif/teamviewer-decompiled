package o;

import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.Resolution;

/* JADX INFO: loaded from: classes.dex */
public final class yz4 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final o72 e;

    public yz4(Resolution resolution) {
        this(IChangeResolutionViewModelSWIGJNI.Resolution_id_get(resolution.a, resolution), IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolution.a, resolution), IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolution.a, resolution), null, o72.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yz4) {
            return this.a == ((yz4) obj).a;
        }
        return this == obj;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String str = this.d;
        boolean z = str == null || str.length() == 0;
        int i = this.c;
        int i2 = this.b;
        if (z) {
            return i2 + "x" + i;
        }
        return str + " (" + i2 + "x" + i + ")";
    }

    public yz4(int i, int i2, int i3, String str, o72 o72Var) {
        o72Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = o72Var;
    }

    public yz4(yz4 yz4Var, String str, o72 o72Var) {
        this(yz4Var.a, yz4Var.b, yz4Var.c, str, o72Var);
    }
}
