package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ya1 implements i62, zg5, k30 {
    public final nd a;
    public final RectF b;
    public final s65 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final boolean g;
    public final ArrayList h;
    public final ei4 i;
    public ArrayList j;
    public final c18 k;

    public ya1(ei4 ei4Var, p30 p30Var, boolean z, ArrayList arrayList, rm rmVar) {
        this.a = new nd((byte) 10);
        this.b = new RectF();
        this.c = new s65();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.i = ei4Var;
        this.g = z;
        this.h = arrayList;
        if (rmVar != null) {
            c18 c18Var = new c18(rmVar);
            this.k = c18Var;
            c18Var.a(p30Var);
            c18Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sa1 sa1Var = (sa1) arrayList.get(size);
            if (sa1Var instanceof v03) {
                arrayList2.add((v03) sa1Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((v03) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // o.k30
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            sa1 sa1Var = (sa1) arrayList.get(size2);
            sa1Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(sa1Var);
        }
    }

    @Override // o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        c18 c18Var = this.k;
        if (c18Var != null) {
            matrix2.preConcat(c18Var.d());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sa1 sa1Var = (sa1) arrayList.get(size);
            if (sa1Var instanceof i62) {
                ((i62) sa1Var).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                sa1 sa1Var = (sa1) arrayList.get(i);
                if (sa1Var instanceof zg5) {
                    this.j.add((zg5) sa1Var);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // o.zg5
    public final Path e() {
        Matrix matrix = this.d;
        matrix.reset();
        c18 c18Var = this.k;
        if (c18Var != null) {
            matrix.set(c18Var.d());
        }
        Path path = this.e;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                sa1 sa1Var = (sa1) arrayList.get(size);
                if (sa1Var instanceof zg5) {
                    path.addPath(((zg5) sa1Var).e(), matrix);
                }
            }
        }
        return path;
    }

    @Override // o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        boolean z;
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        c18 c18Var = this.k;
        if (c18Var != null) {
            matrix2.preConcat(c18Var.d());
            uv0 uv0Var = c18Var.p;
            i = (int) (((((uv0Var == null ? 100 : ((Integer) uv0Var.d()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        ei4 ei4Var = this.i;
        ei4Var.getClass();
        boolean z2 = false;
        ArrayList arrayList = this.h;
        if (r62Var != null && ei4Var.w) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = false;
                    break;
                } else {
                    if ((arrayList.get(i2) instanceof i62) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        int i4 = z2 ? 255 : i;
        s65 s65Var = this.c;
        if (z2) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix, true);
            nd ndVar = this.a;
            ndVar.n = i;
            if (r62Var != null) {
                if (Color.alpha(r62Var.d) > 0) {
                    ndVar.f1562o = r62Var;
                } else {
                    ndVar.f1562o = null;
                }
                r62Var = null;
            } else {
                ndVar.f1562o = null;
            }
            canvas = s65Var.e(canvas, rectF, ndVar);
        } else if (r62Var != null) {
            r62 r62Var2 = new r62(r62Var);
            r62Var2.b(i4);
            r62Var = r62Var2;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof i62) {
                ((i62) obj).f(canvas, matrix2, i4, r62Var);
            }
        }
        if (z2) {
            s65Var.c();
        }
    }

    public ya1(ei4 ei4Var, p30 p30Var, yw6 yw6Var, qh4 qh4Var) {
        rm rmVar;
        String str = yw6Var.a;
        boolean z = yw6Var.c;
        List list = yw6Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            sa1 sa1VarA = ((nb1) list.get(i2)).a(ei4Var, qh4Var, p30Var);
            if (sa1VarA != null) {
                arrayList.add(sa1VarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                rmVar = null;
                break;
            }
            nb1 nb1Var = (nb1) list.get(i);
            if (nb1Var instanceof rm) {
                rmVar = (rm) nb1Var;
                break;
            }
            i++;
        }
        this(ei4Var, p30Var, z, arrayList, rmVar);
    }
}
