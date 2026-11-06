package o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yw0 extends td2 {
    public final ArrayList a;
    public final ArrayList b;
    public int c;
    public int d;
    public boolean e;

    public yw0() {
        this.c = 0;
        this.d = 0;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @Override // o.td2
    public final int a() {
        return this.d;
    }

    @Override // o.td2
    public final void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((td2) it.next()).e();
        }
    }

    @Override // o.td2
    public final boolean f() {
        return this.e;
    }

    public final void g() {
        ArrayList<td2> arrayList = this.a;
        this.c = arrayList.size();
        this.d = 0;
        for (td2 td2Var : arrayList) {
            this.d = td2Var.a() + this.d;
        }
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new vw0()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((td2) it.next()).f()) {
                this.e = true;
                return;
            }
        }
    }

    public yw0(List list) {
        this();
        this.a.addAll(list);
        g();
    }
}
