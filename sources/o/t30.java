package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t30 implements k30, sa1, i62 {
    public final ei4 e;
    public final p30 f;
    public final float[] h;
    public final wz3 i;
    public final uv0 j;
    public final uv0 k;
    public final ArrayList l;
    public final uv0 m;
    public final uv0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2074o;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public t30(ei4 ei4Var, p30 p30Var, Paint.Cap cap, Paint.Join join, float f, lm lmVar, mm mmVar, ArrayList arrayList, mm mmVar2) {
        wz3 wz3Var = new wz3(1, (byte) 0);
        this.i = wz3Var;
        this.f2074o = 0.0f;
        this.e = ei4Var;
        this.f = p30Var;
        wz3Var.setStyle(Paint.Style.STROKE);
        wz3Var.setStrokeCap(cap);
        wz3Var.setStrokeJoin(join);
        wz3Var.setStrokeMiter(f);
        this.k = (uv0) lmVar.d();
        this.j = mmVar.d();
        if (mmVar2 == null) {
            this.m = null;
        } else {
            this.m = mmVar2.d();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((mm) arrayList.get(i)).d());
        }
        p30Var.d(this.k);
        p30Var.d(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            p30Var.d((o30) this.l.get(i2));
        }
        o30 o30Var = this.m;
        if (o30Var != null) {
            p30Var.d(o30Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((o30) this.l.get(i3)).a(this);
        }
        uv0 uv0Var = this.m;
        if (uv0Var != null) {
            uv0Var.a(this);
        }
        if (p30Var.j() != null) {
            uv0 uv0VarD = ((mm) p30Var.j().n).d();
            this.n = uv0VarD;
            uv0VarD.a(this);
            p30Var.d(uv0VarD);
        }
    }

    @Override // o.k30
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // o.sa1
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        s30 s30Var = null;
        f38 f38Var = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            sa1 sa1Var = (sa1) arrayList2.get(size);
            if (sa1Var instanceof f38) {
                f38 f38Var2 = (f38) sa1Var;
                if (f38Var2.c == 2) {
                    f38Var = f38Var2;
                }
            }
        }
        if (f38Var != null) {
            f38Var.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            sa1 sa1Var2 = (sa1) list2.get(size2);
            if (sa1Var2 instanceof f38) {
                f38 f38Var3 = (f38) sa1Var2;
                if (f38Var3.c == 2) {
                    if (s30Var != null) {
                        arrayList.add(s30Var);
                    }
                    s30 s30Var2 = new s30(f38Var3);
                    f38Var3.d(this);
                    s30Var = s30Var2;
                } else if (!(sa1Var2 instanceof zg5)) {
                    if (s30Var == null) {
                        s30Var = new s30(f38Var);
                    }
                    s30Var.a.add((zg5) sa1Var2);
                }
            } else if (!(sa1Var2 instanceof zg5)) {
                if (s30Var == null) {
                    s30Var = new s30(f38Var);
                }
                s30Var.a.add((zg5) sa1Var2);
            }
        }
        if (s30Var != null) {
            arrayList.add(s30Var);
        }
    }

    @Override // o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fI = this.j.i() / 2.0f;
                rectF2.set(rectF2.left - fI, rectF2.top - fI, rectF2.right + fI, rectF2.bottom + fI);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            s30 s30Var = (s30) arrayList.get(i);
            for (int i2 = 0; i2 < s30Var.a.size(); i2++) {
                path.addPath(((zg5) s30Var.a.get(i2)).e(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        t30 t30Var = this;
        float[] fArr2 = (float[]) ta8.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) t30Var.k.d()).intValue() / 100.0f;
        int iC = lr4.c((int) (i * fIntValue));
        wz3 wz3Var = t30Var.i;
        wz3Var.setAlpha(iC);
        wz3Var.setStrokeWidth(t30Var.j.i());
        if (wz3Var.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = t30Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = t30Var.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((o30) arrayList.get(i4)).d()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            uv0 uv0Var = t30Var.m;
            wz3Var.setPathEffect(new DashPathEffect(fArr, uv0Var == null ? 0.0f : ((Float) uv0Var.d()).floatValue()));
        }
        uv0 uv0Var2 = t30Var.n;
        if (uv0Var2 != null) {
            float fFloatValue2 = ((Float) uv0Var2.d()).floatValue();
            if (fFloatValue2 == 0.0f) {
                wz3Var.setMaskFilter(null);
            } else if (fFloatValue2 != t30Var.f2074o) {
                p30 p30Var = t30Var.f;
                if (p30Var.y == fFloatValue2) {
                    maskFilter = p30Var.z;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    p30Var.z = blurMaskFilter;
                    p30Var.y = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                wz3Var.setMaskFilter(maskFilter);
            }
            t30Var.f2074o = fFloatValue2;
        }
        if (r62Var != null) {
            r62Var.a((int) (fIntValue * 255.0f), wz3Var);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = t30Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            s30 s30Var = (s30) arrayList2.get(i5);
            f38 f38Var = s30Var.b;
            ArrayList arrayList3 = s30Var.a;
            Path path = t30Var.b;
            if (f38Var != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((zg5) arrayList3.get(size2)).e());
                }
                float fFloatValue3 = ((Float) f38Var.d.d()).floatValue() / f2;
                float fFloatValue4 = ((Float) f38Var.e.d()).floatValue() / f2;
                float fFloatValue5 = ((Float) f38Var.f.d()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = t30Var.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path pathE = ((zg5) arrayList3.get(size3)).e();
                        Path path2 = t30Var.c;
                        path2.set(pathE);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        ta8.a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, wz3Var);
                                    } else {
                                        canvas.drawPath(path2, wz3Var);
                                    }
                                }
                            } else {
                                ta8.a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, wz3Var);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        t30Var = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, wz3Var);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((zg5) arrayList3.get(size4)).e());
                }
                canvas.drawPath(path, wz3Var);
            }
            i5++;
            t30Var = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}
