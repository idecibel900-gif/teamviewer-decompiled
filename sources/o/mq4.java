package o;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mq4 implements zg5, v03 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final lq4 e;

    public mq4(lq4 lq4Var) {
        this.e = lq4Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            zg5 zg5Var = (zg5) arrayList.get(size);
            if (zg5Var instanceof ya1) {
                ya1 ya1Var = (ya1) zg5Var;
                ArrayList arrayList2 = (ArrayList) ya1Var.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathE = ((zg5) arrayList2.get(size2)).e();
                    Matrix matrixD = ya1Var.d;
                    c18 c18Var = ya1Var.k;
                    if (c18Var != null) {
                        matrixD = c18Var.d();
                    } else {
                        matrixD.reset();
                    }
                    pathE.transform(matrixD);
                    path.addPath(pathE);
                }
            } else {
                path.addPath(zg5Var.e());
            }
        }
        int i = 0;
        zg5 zg5Var2 = (zg5) arrayList.get(0);
        if (zg5Var2 instanceof ya1) {
            ya1 ya1Var2 = (ya1) zg5Var2;
            List listD = ya1Var2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathE2 = ((zg5) arrayList3.get(i)).e();
                Matrix matrixD2 = ya1Var2.d;
                c18 c18Var2 = ya1Var2.k;
                if (c18Var2 != null) {
                    matrixD2 = c18Var2.d();
                } else {
                    matrixD2.reset();
                }
                pathE2.transform(matrixD2);
                path2.addPath(pathE2);
                i++;
            }
        } else {
            path2.set(zg5Var2.e());
        }
        this.c.op(path2, path, op);
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((zg5) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // o.v03
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            sa1 sa1Var = (sa1) listIterator.previous();
            if (sa1Var instanceof zg5) {
                this.d.add((zg5) sa1Var);
                listIterator.remove();
            }
        }
    }

    @Override // o.zg5
    public final Path e() {
        Path path = this.c;
        path.reset();
        lq4 lq4Var = this.e;
        if (!lq4Var.b) {
            int iB = ua5.B(lq4Var.a);
            if (iB == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((zg5) arrayList.get(i)).e());
                    i++;
                }
            } else {
                if (iB == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iB == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iB == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iB == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
