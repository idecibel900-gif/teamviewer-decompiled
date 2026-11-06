package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sw6 implements zg5, k30, sa1 {
    public final boolean b;
    public final ei4 c;
    public final bx6 d;
    public boolean e;
    public final Path a = new Path();
    public final nm f = new nm((byte) 2);

    public sw6(ei4 ei4Var, p30 p30Var, lx6 lx6Var) {
        this.b = lx6Var.d;
        this.c = ei4Var;
        bx6 bx6Var = new bx6(lx6Var.c.b);
        this.d = bx6Var;
        p30Var.d(bx6Var);
        bx6Var.a(this);
    }

    @Override // o.k30
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[SYNTHETIC] */
    @Override // o.sa1
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.d.j = arrayList;
                return;
            }
            sa1 sa1Var = (sa1) arrayList2.get(i);
            if (sa1Var instanceof f38) {
                f38 f38Var = (f38) sa1Var;
                if (f38Var.c == 1) {
                    this.f.a.add(f38Var);
                    f38Var.d(this);
                } else if (!(sa1Var instanceof vf6)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    vf6 vf6Var = (vf6) sa1Var;
                    vf6Var.b.a(this);
                    arrayList.add(vf6Var);
                }
            } else if (!(sa1Var instanceof vf6)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                vf6 vf6Var2 = (vf6) sa1Var;
                vf6Var2.b.a(this);
                arrayList.add(vf6Var2);
            }
            i++;
        }
    }

    @Override // o.zg5
    public final Path e() {
        boolean z = this.e;
        bx6 bx6Var = this.d;
        Path path = this.a;
        if (z) {
            bx6Var.getClass();
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) bx6Var.d();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.j(path);
        this.e = true;
        return path;
    }
}
