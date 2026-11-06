package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class jv0 extends vp3 {
    public static final lw c = new lw(2);
    public final vp3 a;
    public final /* synthetic */ byte b;

    public jv0(vp3 vp3Var, byte b) {
        this.b = b;
        this.a = vp3Var;
    }

    @Override // o.vp3
    public /* bridge */ /* synthetic */ Object a(nr3 nr3Var) {
        switch (this.b) {
            case 0:
                break;
        }
        return d(nr3Var);
    }

    @Override // o.vp3
    public void c(pr3 pr3Var, Object obj) {
        pr3Var.j();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.a.c(pr3Var, it.next());
        }
        pr3Var.u(']', 1, 2);
    }

    public final Collection d(nr3 nr3Var) throws qq3, EOFException {
        Collection arrayList;
        switch (this.b) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        nr3Var.D0();
        while (nr3Var.hasNext()) {
            arrayList.add(this.a.a(nr3Var));
        }
        nr3Var.A0();
        return arrayList;
    }

    public final String toString() {
        return this.a + ".collection()";
    }
}
