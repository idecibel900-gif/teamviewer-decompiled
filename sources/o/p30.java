package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p30 implements i62, k30 {
    public wz3 A;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final wz3 d = new wz3(1, (byte) 0);
    public final wz3 e;
    public final wz3 f;
    public final wz3 g;
    public final wz3 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ei4 f1698o;
    public final c04 p;
    public final ep3 q;
    public final uv0 r;
    public p30 s;
    public p30 t;
    public List u;
    public final ArrayList v;
    public final c18 w;
    public boolean x;
    public float y;
    public BlurMaskFilter z;

    public p30(ei4 ei4Var, c04 c04Var) {
        char c = 1;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new wz3(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new wz3(mode2);
        wz3 wz3Var = new wz3(1, (byte) 0);
        this.g = wz3Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        wz3 wz3Var2 = new wz3();
        wz3Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = wz3Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.y = 0.0f;
        this.f1698o = ei4Var;
        this.p = c04Var;
        List list = c04Var.h;
        byte b = 3;
        if (c04Var.u == 3) {
            wz3Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            wz3Var.setXfermode(new PorterDuffXfermode(mode));
        }
        rm rmVar = c04Var.i;
        rmVar.getClass();
        c18 c18Var = new c18(rmVar);
        this.w = c18Var;
        c18Var.b(this);
        if (list != null && !list.isEmpty()) {
            ep3 ep3Var = new ep3(list);
            this.q = ep3Var;
            Iterator it = ((ArrayList) ep3Var.n).iterator();
            while (it.hasNext()) {
                ((o30) it.next()).a(this);
            }
            for (o30 o30Var : (ArrayList) this.q.f733o) {
                d(o30Var);
                o30Var.a(this);
            }
        }
        c04 c04Var2 = this.p;
        if (c04Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.f1698o.invalidateSelf();
                return;
            }
            return;
        }
        uv0 uv0Var = new uv0(c04Var2.t, c == true ? 1 : 0);
        this.r = uv0Var;
        uv0Var.b = true;
        uv0Var.a(new b18(this, b));
        boolean z = ((Float) this.r.d()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.f1698o.invalidateSelf();
        }
        d(this.r);
    }

    @Override // o.k30
    public final void a() {
        this.f1698o.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
    }

    @Override // o.i62
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((p30) this.u.get(size)).w.d());
                }
            } else {
                p30 p30Var = this.t;
                if (p30Var != null) {
                    matrix2.preConcat(p30Var.w.d());
                }
            }
        }
        matrix2.preConcat(this.w.d());
    }

    public final void d(o30 o30Var) {
        if (o30Var == null) {
            return;
        }
        this.v.add(o30Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:105:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    /* JADX WARN: Code duplicated, block: B:111:0x025a  */
    /* JADX WARN: Code duplicated, block: B:113:0x025f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x026c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0272  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:124:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c A[LOOP:2: B:122:0x0275->B:128:0x028c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0299  */
    /* JADX WARN: Code duplicated, block: B:132:0x029d  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:138:0x030b  */
    /* JADX WARN: Code duplicated, block: B:140:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x033b  */
    /* JADX WARN: Code duplicated, block: B:142:0x034b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0352  */
    /* JADX WARN: Code duplicated, block: B:145:0x037e  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a4 A[EDGE_INSN: B:155:0x03a4->B:147:0x03a4 BREAK  A[LOOP:1: B:107:0x0225->B:146:0x039e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0286 A[EDGE_INSN: B:163:0x0286->B:126:0x0286 BREAK  A[LOOP:2: B:122:0x0275->B:128:0x028c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    @Override // o.i62
    public final void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        ep3 ep3Var;
        Path path;
        float f;
        int i2;
        RectF rectF;
        float f2;
        int i3;
        Paint paint;
        int i4;
        List list;
        ArrayList arrayList;
        o30 o30Var;
        o30 o30Var2;
        boolean z;
        int iB;
        int i5;
        Paint paint2;
        Path path2;
        Path path3;
        int i6;
        Integer num;
        if (this.x) {
            c04 c04Var = this.p;
            boolean z2 = c04Var.v;
            int i7 = c04Var.y;
            if (z2) {
                return;
            }
            g();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((p30) this.u.get(size)).w.d());
            }
            c18 c18Var = this.w;
            uv0 uv0Var = c18Var.p;
            int iIntValue = (int) ((((i / 255.0f) * ((uv0Var == null || (num = (Integer) uv0Var.d()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !k() && i7 == 1) {
                matrix2.preConcat(c18Var.d());
                i(canvas, matrix2, iIntValue, r62Var);
                l();
                return;
            }
            RectF rectF2 = this.i;
            c(rectF2, matrix2, false);
            if (this.s != null && c04Var.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(c18Var.d());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zK = k();
            ep3 ep3Var2 = this.q;
            Path path4 = this.a;
            if (zK) {
                int size2 = ((List) ep3Var2.p).size();
                int i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        zm4 zm4Var = (zm4) ((List) ep3Var2.p).get(i8);
                        Path path5 = (Path) ((o30) ((ArrayList) ep3Var2.n).get(i8)).d();
                        if (path5 == null) {
                            i2 = size2;
                        } else {
                            path4.set(path5);
                            path4.transform(matrix2);
                            int iB2 = ua5.B(zm4Var.a);
                            i2 = size2;
                            if (iB2 != 0) {
                                if (iB2 != 1) {
                                    if (iB2 != 2) {
                                        if (iB2 == 3) {
                                        }
                                        rectF = this.m;
                                        path4.computeBounds(rectF, false);
                                        if (i8 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                        i8++;
                                        size2 = i2;
                                        ep3Var2 = ep3Var2;
                                        path4 = path4;
                                    }
                                }
                                ep3Var = ep3Var2;
                                path = path4;
                                f = 0.0f;
                            }
                            if (zm4Var.d) {
                                ep3Var = ep3Var2;
                                path = path4;
                                f = 0.0f;
                            }
                            rectF = this.m;
                            path4.computeBounds(rectF, false);
                            if (i8 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                            i8++;
                            size2 = i2;
                            ep3Var2 = ep3Var2;
                            path4 = path4;
                        }
                        i8++;
                        size2 = i2;
                        ep3Var2 = ep3Var2;
                        path4 = path4;
                    } else {
                        ep3Var = ep3Var2;
                        path = path4;
                        if (rectF2.intersect(rectF4)) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                ep3Var = ep3Var2;
                path = path4;
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                wz3 wz3Var = this.d;
                wz3Var.setAlpha(255);
                int iB3 = ua5.B(i7);
                if (iB3 == 1) {
                    f2 = 1.0f;
                    i3 = Build.VERSION.SDK_INT >= 29 ? 25 : 14;
                } else if (iB3 != 2) {
                    i3 = 16;
                    f2 = 1.0f;
                    if (iB3 != 3) {
                        if (iB3 == 4) {
                            i3 = 17;
                        } else if (iB3 != 5) {
                            i3 = iB3 != 16 ? 0 : 13;
                        } else {
                            i3 = 18;
                        }
                    }
                } else {
                    f2 = 1.0f;
                    i3 = 15;
                }
                vt1.K(i3, wz3Var);
                Matrix matrix4 = ta8.a;
                canvas.saveLayer(rectF2, wz3Var);
                if (i7 != 2) {
                    h(canvas);
                } else {
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.A == null) {
                            wz3 wz3Var2 = new wz3();
                            this.A = wz3Var2;
                            wz3Var2.setColor(-1);
                        }
                        canvas.drawRect(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2, this.A);
                    }
                    i(canvas, matrix2, iIntValue, r62Var);
                    if (k()) {
                        paint = this.e;
                        canvas.saveLayer(rectF2, paint);
                        if (Build.VERSION.SDK_INT < 28) {
                            h(canvas);
                        }
                        i4 = 0;
                        while (true) {
                            list = (List) ep3Var.p;
                            arrayList = (ArrayList) ep3Var.n;
                            if (i4 < list.size()) {
                                break;
                            }
                            zm4 zm4Var2 = (zm4) list.get(i4);
                            o30Var = (o30) arrayList.get(i4);
                            o30Var2 = (o30) ((ArrayList) ep3Var.f733o).get(i4);
                            int i9 = zm4Var2.a;
                            z = zm4Var2.d;
                            iB = ua5.B(i9);
                            i5 = i4;
                            paint2 = this.f;
                            if (iB != 0) {
                                path2 = path;
                                if (z) {
                                    Matrix matrix5 = ta8.a;
                                    canvas.saveLayer(rectF2, wz3Var);
                                    canvas.drawRect(rectF2, wz3Var);
                                    path2.set((Path) o30Var.d());
                                    path2.transform(matrix2);
                                    wz3Var.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) o30Var.d());
                                    path2.transform(matrix2);
                                    wz3Var.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                    canvas.drawPath(path2, wz3Var);
                                }
                            } else if (iB != 1) {
                                path2 = path;
                                if (i5 == 0) {
                                    wz3Var.setColor(-16777216);
                                    wz3Var.setAlpha(255);
                                    canvas.drawRect(rectF2, wz3Var);
                                }
                                if (z) {
                                    Matrix matrix6 = ta8.a;
                                    canvas.saveLayer(rectF2, paint2);
                                    canvas.drawRect(rectF2, wz3Var);
                                    paint2.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                    path2.set((Path) o30Var.d());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) o30Var.d());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                }
                            } else if (iB != 2) {
                                if (z) {
                                    Matrix matrix7 = ta8.a;
                                    canvas.saveLayer(rectF2, paint);
                                    canvas.drawRect(rectF2, wz3Var);
                                    paint2.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                    path3 = path;
                                    path3.set((Path) o30Var.d());
                                    path3.transform(matrix2);
                                    canvas.drawPath(path3, paint2);
                                    canvas.restore();
                                } else {
                                    path3 = path;
                                    Matrix matrix8 = ta8.a;
                                    canvas.saveLayer(rectF2, paint);
                                    path3.set((Path) o30Var.d());
                                    path3.transform(matrix2);
                                    wz3Var.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                    canvas.drawPath(path3, wz3Var);
                                    canvas.restore();
                                }
                                path2 = path3;
                            } else if (iB != 3) {
                                path2 = path;
                            } else {
                                if (arrayList.isEmpty()) {
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < list.size()) {
                                            wz3Var.setAlpha(255);
                                            canvas.drawRect(rectF2, wz3Var);
                                            break;
                                        } else if (((zm4) list.get(i6)).a != 4) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                path2 = path;
                            }
                            i4 = i5 + 1;
                            path = path2;
                        }
                        canvas.restore();
                    }
                    if (this.s != null) {
                        canvas.saveLayer(rectF2, this.g);
                        h(canvas);
                        this.s.f(canvas, matrix, i, null);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                i(canvas, matrix2, iIntValue, r62Var);
                if (k()) {
                    paint = this.e;
                    canvas.saveLayer(rectF2, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        h(canvas);
                    }
                    i4 = 0;
                    while (true) {
                        list = (List) ep3Var.p;
                        arrayList = (ArrayList) ep3Var.n;
                        if (i4 < list.size()) {
                            break;
                            break;
                        }
                        zm4 zm4Var3 = (zm4) list.get(i4);
                        o30Var = (o30) arrayList.get(i4);
                        o30Var2 = (o30) ((ArrayList) ep3Var.f733o).get(i4);
                        int i10 = zm4Var3.a;
                        z = zm4Var3.d;
                        iB = ua5.B(i10);
                        i5 = i4;
                        paint2 = this.f;
                        if (iB != 0) {
                            path2 = path;
                            if (z) {
                                Matrix matrix9 = ta8.a;
                                canvas.saveLayer(rectF2, wz3Var);
                                canvas.drawRect(rectF2, wz3Var);
                                path2.set((Path) o30Var.d());
                                path2.transform(matrix2);
                                wz3Var.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) o30Var.d());
                                path2.transform(matrix2);
                                wz3Var.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                canvas.drawPath(path2, wz3Var);
                            }
                        } else if (iB != 1) {
                            path2 = path;
                            if (i5 == 0) {
                                wz3Var.setColor(-16777216);
                                wz3Var.setAlpha(255);
                                canvas.drawRect(rectF2, wz3Var);
                            }
                            if (z) {
                                Matrix matrix10 = ta8.a;
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, wz3Var);
                                paint2.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                path2.set((Path) o30Var.d());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) o30Var.d());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                            }
                        } else if (iB != 2) {
                            if (z) {
                                Matrix matrix11 = ta8.a;
                                canvas.saveLayer(rectF2, paint);
                                canvas.drawRect(rectF2, wz3Var);
                                paint2.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                path3 = path;
                                path3.set((Path) o30Var.d());
                                path3.transform(matrix2);
                                canvas.drawPath(path3, paint2);
                                canvas.restore();
                            } else {
                                path3 = path;
                                Matrix matrix12 = ta8.a;
                                canvas.saveLayer(rectF2, paint);
                                path3.set((Path) o30Var.d());
                                path3.transform(matrix2);
                                wz3Var.setAlpha((int) (((Integer) o30Var2.d()).intValue() * 2.55f));
                                canvas.drawPath(path3, wz3Var);
                                canvas.restore();
                            }
                            path2 = path3;
                        } else if (iB != 3) {
                            path2 = path;
                        } else {
                            if (arrayList.isEmpty()) {
                                i6 = 0;
                                while (true) {
                                    if (i6 < list.size()) {
                                        wz3Var.setAlpha(255);
                                        canvas.drawRect(rectF2, wz3Var);
                                        break;
                                    } else {
                                        if (((zm4) list.get(i6)).a != 4) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                            path2 = path;
                        }
                        i4 = i5 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF2, this.g);
                    h(canvas);
                    this.s.f(canvas, matrix, i, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            l();
        }
    }

    public final void g() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (p30 p30Var = this.t; p30Var != null; p30Var = p30Var.t) {
            this.u.add(p30Var);
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public void i(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
    }

    public df6 j() {
        return this.p.w;
    }

    public final boolean k() {
        ep3 ep3Var = this.q;
        return (ep3Var == null || ((ArrayList) ep3Var.n).isEmpty()) ? false : true;
    }

    public final void l() {
        yi5 yi5Var = this.f1698o.m.a;
        String str = this.p.c;
    }

    public void m(float f) {
        c18 c18Var = this.w;
        uv0 uv0Var = c18Var.p;
        if (uv0Var != null) {
            uv0Var.g(f);
        }
        uv0 uv0Var2 = c18Var.v;
        if (uv0Var2 != null) {
            uv0Var2.g(f);
        }
        uv0 uv0Var3 = c18Var.w;
        if (uv0Var3 != null) {
            uv0Var3.g(f);
        }
        ey3 ey3Var = c18Var.l;
        if (ey3Var != null) {
            ey3Var.g(f);
        }
        o30 o30Var = c18Var.m;
        if (o30Var != null) {
            o30Var.g(f);
        }
        zz2 zz2Var = c18Var.n;
        if (zz2Var != null) {
            zz2Var.g(f);
        }
        uv0 uv0Var4 = c18Var.f477o;
        if (uv0Var4 != null) {
            uv0Var4.g(f);
        }
        uv0 uv0Var5 = c18Var.q;
        if (uv0Var5 != null) {
            uv0Var5.g(f);
        }
        uv0 uv0Var6 = c18Var.r;
        if (uv0Var6 != null) {
            uv0Var6.g(f);
        }
        uv0 uv0Var7 = c18Var.s;
        if (uv0Var7 != null) {
            uv0Var7.g(f);
        }
        uv0 uv0Var8 = c18Var.t;
        if (uv0Var8 != null) {
            uv0Var8.g(f);
        }
        uv0 uv0Var9 = c18Var.u;
        if (uv0Var9 != null) {
            uv0Var9.g(f);
        }
        int i = 0;
        ep3 ep3Var = this.q;
        if (ep3Var != null) {
            ArrayList arrayList = (ArrayList) ep3Var.n;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((o30) arrayList.get(i2)).g(f);
            }
        }
        uv0 uv0Var10 = this.r;
        if (uv0Var10 != null) {
            uv0Var10.g(f);
        }
        p30 p30Var = this.s;
        if (p30Var != null) {
            p30Var.m(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((o30) arrayList2.get(i)).g(f);
            i++;
        }
    }
}
