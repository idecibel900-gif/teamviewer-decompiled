package o;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ss7 extends p30 {
    public final StringBuilder B;
    public final StringBuilder C;
    public final StringBuilder D;
    public final StringBuilder E;
    public final RectF F;
    public final Matrix G;
    public final wz3 H;
    public final wz3 I;
    public final HashMap J;
    public final mg4 K;
    public final ArrayList L;
    public final ArrayList M;
    public final uv0 N;
    public final ei4 O;
    public final qh4 P;
    public final int Q;
    public final uv0 R;
    public final uv0 S;
    public final uv0 T;
    public final uv0 U;
    public final uv0 V;
    public final uv0 W;
    public final uv0 X;
    public final uv0 Y;

    public ss7(ei4 ei4Var, c04 c04Var) {
        gy8 gy8Var;
        gy8 gy8Var2;
        lm lmVar;
        gy8 gy8Var3;
        lm lmVar2;
        gy8 gy8Var4;
        lm lmVar3;
        yc4 yc4Var;
        lm lmVar4;
        yc4 yc4Var2;
        mm mmVar;
        yc4 yc4Var3;
        mm mmVar2;
        yc4 yc4Var4;
        lm lmVar5;
        yc4 yc4Var5;
        lm lmVar6;
        super(ei4Var, c04Var);
        this.B = new StringBuilder(2);
        this.C = new StringBuilder(0);
        this.D = new StringBuilder(0);
        this.E = new StringBuilder(0);
        this.F = new RectF();
        this.G = new Matrix();
        wz3 wz3Var = new wz3(1, (byte) 1);
        wz3Var.setStyle(Paint.Style.FILL);
        this.H = wz3Var;
        wz3 wz3Var2 = new wz3(1, (byte) 2);
        wz3Var2.setStyle(Paint.Style.STROKE);
        this.I = wz3Var2;
        this.J = new HashMap();
        this.K = new mg4((Object) null);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.Q = 2;
        this.O = ei4Var;
        this.P = c04Var.b;
        uv0 uv0Var = new uv0(c04Var.q.b, (byte) 3);
        this.N = uv0Var;
        uv0Var.a(this);
        d(uv0Var);
        cj3 cj3Var = c04Var.r;
        if (cj3Var != null && (yc4Var5 = (yc4) cj3Var.n) != null && (lmVar6 = (lm) yc4Var5.m) != null) {
            o30 o30VarD = lmVar6.d();
            this.R = (uv0) o30VarD;
            o30VarD.a(this);
            d(o30VarD);
        }
        if (cj3Var != null && (yc4Var4 = (yc4) cj3Var.n) != null && (lmVar5 = (lm) yc4Var4.n) != null) {
            o30 o30VarD2 = lmVar5.d();
            this.S = (uv0) o30VarD2;
            o30VarD2.a(this);
            d(o30VarD2);
        }
        if (cj3Var != null && (yc4Var3 = (yc4) cj3Var.n) != null && (mmVar2 = (mm) yc4Var3.f2598o) != null) {
            uv0 uv0VarD = mmVar2.d();
            this.T = uv0VarD;
            uv0VarD.a(this);
            d(uv0VarD);
        }
        if (cj3Var != null && (yc4Var2 = (yc4) cj3Var.n) != null && (mmVar = (mm) yc4Var2.p) != null) {
            uv0 uv0VarD2 = mmVar.d();
            this.U = uv0VarD2;
            uv0VarD2.a(this);
            d(uv0VarD2);
        }
        if (cj3Var != null && (yc4Var = (yc4) cj3Var.n) != null && (lmVar4 = (lm) yc4Var.q) != null) {
            o30 o30VarD3 = lmVar4.d();
            this.V = (uv0) o30VarD3;
            o30VarD3.a(this);
            d(o30VarD3);
        }
        if (cj3Var != null && (gy8Var4 = (gy8) cj3Var.f531o) != null && (lmVar3 = (lm) gy8Var4.c) != null) {
            o30 o30VarD4 = lmVar3.d();
            this.W = (uv0) o30VarD4;
            o30VarD4.a(this);
            d(o30VarD4);
        }
        if (cj3Var != null && (gy8Var3 = (gy8) cj3Var.f531o) != null && (lmVar2 = (lm) gy8Var3.d) != null) {
            o30 o30VarD5 = lmVar2.d();
            this.X = (uv0) o30VarD5;
            o30VarD5.a(this);
            d(o30VarD5);
        }
        if (cj3Var != null && (gy8Var2 = (gy8) cj3Var.f531o) != null && (lmVar = (lm) gy8Var2.e) != null) {
            o30 o30VarD6 = lmVar.d();
            this.Y = (uv0) o30VarD6;
            o30VarD6.a(this);
            d(o30VarD6);
        }
        if (cj3Var == null || (gy8Var = (gy8) cj3Var.f531o) == null) {
            return;
        }
        this.Q = gy8Var.b;
    }

    public static void p(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // o.p30, o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qh4 qh4Var = this.P;
        rectF.set(0.0f, 0.0f, qh4Var.k.width(), qh4Var.k.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.p30
    public final void i(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        j93 j93Var;
        int i2;
        ArrayList arrayList;
        Canvas canvas2;
        Typeface typefaceCreateFromAsset;
        int i3;
        List list;
        wz3 wz3Var;
        wz3 wz3Var2;
        j32 j32Var = (j32) this.N.d();
        qh4 qh4Var = this.P;
        jr2 jr2Var = (jr2) qh4Var.f.get(j32Var.b);
        if (jr2Var == null) {
            return;
        }
        String str = jr2Var.b;
        String str2 = jr2Var.a;
        canvas.save();
        canvas.concat(matrix);
        o(j32Var, i, 0);
        ei4 ei4Var = this.O;
        ei4Var.getClass();
        int i4 = ei4Var.m.h.f1550o;
        wz3 wz3Var3 = this.H;
        int i5 = 0;
        wz3 wz3Var4 = this.I;
        uv0 uv0Var = this.U;
        wz3 wz3Var5 = wz3Var4;
        if (i4 > 0) {
            float f = j32Var.c / 100.0f;
            float f2 = 0.0f;
            float[] fArr = (float[]) ta8.e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f3 = ta8.f;
            fArr[2] = f3;
            fArr[3] = f3;
            float f4 = f;
            matrix.mapPoints(fArr);
            ei4 ei4Var2 = ei4Var;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList = Arrays.asList(j32Var.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size = listAsList.size();
            float fFloatValue = j32Var.e / 10.0f;
            if (uv0Var != null) {
                fFloatValue += ((Float) uv0Var.d()).floatValue();
            }
            float f5 = fFloatValue;
            int i6 = 0;
            int i7 = -1;
            while (i6 < size) {
                String str3 = (String) listAsList.get(i6);
                PointF pointF = j32Var.m;
                int i8 = i6;
                float f6 = f4;
                ss7 ss7Var = this;
                List listU = ss7Var.u(str3, pointF == null ? f2 : pointF.x, jr2Var, f6, f5, true);
                int i9 = i5;
                while (i9 < listU.size()) {
                    rs7 rs7Var = (rs7) listU.get(i9);
                    List list2 = listU;
                    int i10 = i7 + 1;
                    canvas.save();
                    int i11 = i9;
                    ss7Var.t(canvas, j32Var, i10, rs7Var.b);
                    String str4 = rs7Var.a;
                    int i12 = i5;
                    while (i12 < str4.length()) {
                        int iA = kr2.a(str4.charAt(i12), str2, str);
                        String str5 = str4;
                        n77 n77Var = qh4Var.h;
                        n77Var.getClass();
                        kr2 kr2Var = (kr2) ck3.u(n77Var, iA);
                        if (kr2Var == null) {
                            f5 = f5;
                            i12 = i12;
                            listAsList = listAsList;
                            size = size;
                            wz3Var = wz3Var5;
                            ei4Var2 = ei4Var2;
                        } else {
                            ss7Var.o(j32Var, i, i12);
                            HashMap map = ss7Var.J;
                            if (map.containsKey(kr2Var)) {
                                list = (List) map.get(kr2Var);
                            } else {
                                ArrayList arrayList2 = kr2Var.a;
                                int size2 = arrayList2.size();
                                ArrayList arrayList3 = new ArrayList(size2);
                                int i13 = i5;
                                while (i13 < size2) {
                                    arrayList3.add(new ya1(ei4Var2, ss7Var, (yw6) arrayList2.get(i13), qh4Var));
                                    size2 = size2;
                                    i13++;
                                    arrayList2 = arrayList2;
                                }
                                map.put(kr2Var, arrayList3);
                                list = arrayList3;
                            }
                            int i14 = i5;
                            while (i14 < list.size()) {
                                Path pathE = ((ya1) list.get(i14)).e();
                                List list3 = list;
                                pathE.computeBounds(ss7Var.F, i5);
                                Matrix matrix2 = ss7Var.G;
                                matrix2.reset();
                                matrix2.preTranslate(f2, (-j32Var.g) * ta8.c());
                                matrix2.preScale(f6, f6);
                                pathE.transform(matrix2);
                                if (j32Var.k) {
                                    q(pathE, wz3Var3, canvas);
                                    wz3Var2 = wz3Var5;
                                    q(pathE, wz3Var2, canvas);
                                } else {
                                    wz3Var2 = wz3Var5;
                                    q(pathE, wz3Var2, canvas);
                                    q(pathE, wz3Var3, canvas);
                                }
                                i14++;
                                ss7Var = this;
                                wz3Var5 = wz3Var2;
                                list = list3;
                                i5 = 0;
                                f2 = 0.0f;
                            }
                            wz3Var = wz3Var5;
                            canvas.translate((ta8.c() * ((float) kr2Var.c) * f6) + f5, 0.0f);
                        }
                        i12++;
                        ss7Var = this;
                        wz3Var5 = wz3Var;
                        ei4Var2 = ei4Var2;
                        str4 = str5;
                        f5 = f5;
                        listAsList = listAsList;
                        size = size;
                        i5 = 0;
                        f2 = 0.0f;
                    }
                    canvas.restore();
                    i9 = i11 + 1;
                    ss7Var = this;
                    listU = list2;
                    i7 = i10;
                    listAsList = listAsList;
                    size = size;
                    i5 = 0;
                    f2 = 0.0f;
                }
                i6 = i8 + 1;
                f4 = f6;
                listAsList = listAsList;
                size = size;
                i5 = 0;
                f2 = 0.0f;
            }
            canvas2 = canvas;
        } else {
            char c = 2;
            Typeface typeface = null;
            if (ei4Var.getCallback() == null) {
                j93Var = null;
            } else {
                j93Var = ei4Var.r;
                if (j93Var == null) {
                    j93Var = new j93(ei4Var.getCallback());
                    ei4Var.r = j93Var;
                }
            }
            if (j93Var != null) {
                fk3 fk3Var = (fk3) j93Var.n;
                fk3Var.b = str2;
                fk3Var.c = str;
                HashMap map2 = (HashMap) j93Var.f1141o;
                Typeface typeface2 = (Typeface) map2.get(fk3Var);
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    HashMap map3 = (HashMap) j93Var.p;
                    Typeface typeface3 = (Typeface) map3.get(str2);
                    if (typeface3 != null) {
                        typefaceCreateFromAsset = typeface3;
                    } else {
                        Typeface typeface4 = jr2Var.c;
                        if (typeface4 != null) {
                            typefaceCreateFromAsset = typeface4;
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) j93Var.q, fx3.g("fonts/", str2, ".ttf"));
                            map3.put(str2, typefaceCreateFromAsset);
                        }
                    }
                    boolean zContains = str.contains("Italic");
                    boolean zContains2 = str.contains("Bold");
                    if (zContains && zContains2) {
                        i3 = 3;
                    } else if (zContains) {
                        i3 = 2;
                    } else {
                        i3 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i3) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                    }
                    map2.put(fk3Var, typefaceCreateFromAsset);
                    typeface = typefaceCreateFromAsset;
                }
            }
            if (typeface == null) {
                typeface = jr2Var.c;
            }
            if (typeface != null) {
                String str6 = j32Var.a;
                wz3Var3.setTypeface(typeface);
                float f7 = j32Var.c;
                wz3Var3.setTextSize(ta8.c() * f7);
                wz3Var5.setTypeface(wz3Var3.getTypeface());
                wz3Var5.setTextSize(wz3Var3.getTextSize());
                float fFloatValue2 = j32Var.e / 10.0f;
                if (uv0Var != null) {
                    fFloatValue2 += ((Float) uv0Var.d()).floatValue();
                }
                float fC = ((ta8.c() * fFloatValue2) * f7) / 100.0f;
                List listAsList2 = Arrays.asList(str6.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = listAsList2.size();
                int i15 = 0;
                int i16 = -1;
                int length = 0;
                while (i15 < size3) {
                    String str7 = (String) listAsList2.get(i15);
                    PointF pointF2 = j32Var.m;
                    float f8 = fC;
                    char c2 = c;
                    List listU2 = u(str7, pointF2 == null ? 0.0f : pointF2.x, jr2Var, 0.0f, f8, false);
                    int i17 = 0;
                    while (i17 < listU2.size()) {
                        rs7 rs7Var2 = (rs7) listU2.get(i17);
                        i16++;
                        canvas.save();
                        t(canvas, j32Var, i16, wz3Var3.measureText(rs7Var2.a));
                        String string = rs7Var2.a;
                        List list4 = listU2;
                        int i18 = i17;
                        jr2 jr2Var2 = jr2Var;
                        if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                            Bidi bidi = new Bidi(string, -2);
                            int runCount = bidi.getRunCount();
                            byte[] bArr = new byte[runCount];
                            Integer[] numArr = new Integer[runCount];
                            int i19 = 0;
                            while (i19 < runCount) {
                                bArr[i19] = (byte) bidi.getRunLevel(i19);
                                numArr[i19] = Integer.valueOf(i19);
                                i19++;
                                size3 = size3;
                            }
                            i2 = size3;
                            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                            StringBuilder sb = this.D;
                            sb.setLength(0);
                            int i20 = 0;
                            while (i20 < runCount) {
                                int iIntValue = numArr[i20].intValue();
                                int i21 = runCount;
                                int runStart = bidi.getRunStart(iIntValue);
                                Integer[] numArr2 = numArr;
                                int runLimit = bidi.getRunLimit(iIntValue);
                                int runLevel = bidi.getRunLevel(iIntValue);
                                String strSubstring = string.substring(runStart, runLimit);
                                if ((runLevel & 1) == 0) {
                                    sb.append(strSubstring);
                                } else {
                                    StringBuilder sb2 = this.E;
                                    int length2 = 0;
                                    sb2.setLength(0);
                                    while (length2 < strSubstring.length()) {
                                        String strN = n(length2, strSubstring);
                                        sb2.insert(0, strN);
                                        length2 += strN.length();
                                        strSubstring = strSubstring;
                                    }
                                    sb.append((CharSequence) sb2);
                                }
                                i20++;
                                runCount = i21;
                                numArr = numArr2;
                                bidi = bidi;
                            }
                            string = sb.toString();
                        } else {
                            i2 = size3;
                        }
                        ArrayList arrayList4 = this.L;
                        arrayList4.clear();
                        int length3 = 0;
                        while (length3 < string.length()) {
                            String strN2 = n(length3, string);
                            arrayList4.add(strN2);
                            length3 += strN2.length();
                        }
                        int i22 = 0;
                        while (i22 < arrayList4.size()) {
                            StringBuilder sb3 = this.C;
                            sb3.setLength(0);
                            sb3.append((String) arrayList4.get(i22));
                            int i23 = i22 + 1;
                            while (i23 < arrayList4.size()) {
                                String str8 = (String) arrayList4.get(i23);
                                int i24 = 0;
                                while (true) {
                                    if (i24 >= str8.length()) {
                                        break;
                                    }
                                    arrayList = arrayList4;
                                    if (Character.getDirectionality(str8.codePointAt(i24)) == 2) {
                                        break;
                                    }
                                    i24++;
                                    arrayList4 = arrayList;
                                }
                                sb3.insert(0, str8);
                                i23++;
                                arrayList4 = arrayList;
                            }
                            ArrayList arrayList5 = arrayList4;
                            String string2 = sb3.toString();
                            o(j32Var, i, i22 + length);
                            if (j32Var.k) {
                                p(string2, wz3Var3, canvas);
                                p(string2, wz3Var5, canvas);
                            } else {
                                p(string2, wz3Var5, canvas);
                                p(string2, wz3Var3, canvas);
                            }
                            canvas.translate(wz3Var3.measureText(string2) + f8, 0.0f);
                            i22 = i23;
                            arrayList4 = arrayList5;
                        }
                        length += rs7Var2.a.length();
                        canvas.restore();
                        i17 = i18 + 1;
                        jr2Var = jr2Var2;
                        c2 = 2;
                        f8 = f8;
                        listAsList2 = listAsList2;
                        size3 = i2;
                        listU2 = list4;
                    }
                    i15++;
                    jr2Var = jr2Var;
                    c = c2;
                    fC = f8;
                    size3 = size3;
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

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
    public final String n(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        mg4 mg4Var = this.K;
        if (mg4Var.c(j) >= 0) {
            return (String) mg4Var.b(j);
        }
        StringBuilder sb = this.B;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        mg4Var.e(j, string);
        return string;
    }

    public final void o(j32 j32Var, int i, int i2) {
        wz3 wz3Var = this.H;
        uv0 uv0Var = this.R;
        if (uv0Var == null || !s(i2)) {
            wz3Var.setColor(j32Var.h);
        } else {
            wz3Var.setColor(((Integer) uv0Var.d()).intValue());
        }
        uv0 uv0Var2 = this.S;
        wz3 wz3Var2 = this.I;
        if (uv0Var2 == null || !s(i2)) {
            wz3Var2.setColor(j32Var.i);
        } else {
            wz3Var2.setColor(((Integer) uv0Var2.d()).intValue());
        }
        uv0 uv0Var3 = this.w.p;
        int iIntValue = 100;
        int iIntValue2 = uv0Var3 == null ? 100 : ((Integer) uv0Var3.d()).intValue();
        uv0 uv0Var4 = this.V;
        if (uv0Var4 != null && s(i2)) {
            iIntValue = ((Integer) uv0Var4.d()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        wz3Var.setAlpha(iRound);
        wz3Var2.setAlpha(iRound);
        uv0 uv0Var5 = this.T;
        if (uv0Var5 == null || !s(i2)) {
            wz3Var2.setStrokeWidth(ta8.c() * j32Var.j);
        } else {
            wz3Var2.setStrokeWidth(((Float) uv0Var5.d()).floatValue());
        }
    }

    public final rs7 r(int i) {
        ArrayList arrayList = this.M;
        for (int size = arrayList.size(); size < i; size++) {
            rs7 rs7Var = new rs7();
            rs7Var.a = "";
            rs7Var.b = 0.0f;
            arrayList.add(rs7Var);
        }
        return (rs7) arrayList.get(i - 1);
    }

    public final boolean s(int i) {
        uv0 uv0Var;
        int length = ((j32) this.N.d()).a.length();
        uv0 uv0Var2 = this.W;
        if (uv0Var2 == null || (uv0Var = this.X) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) uv0Var2.d()).intValue(), ((Integer) uv0Var.d()).intValue());
        int iMax = Math.max(((Integer) uv0Var2.d()).intValue(), ((Integer) uv0Var.d()).intValue());
        uv0 uv0Var3 = this.Y;
        if (uv0Var3 != null) {
            int iIntValue = ((Integer) uv0Var3.d()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.Q == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean t(Canvas canvas, j32 j32Var, int i, float f) {
        PointF pointF = j32Var.l;
        PointF pointF2 = j32Var.m;
        float fC = ta8.c();
        float f2 = (i * j32Var.f * fC) + (pointF == null ? 0.0f : (j32Var.f * fC) + pointF.y);
        this.O.getClass();
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iB = ua5.B(j32Var.d);
        if (iB == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iB == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iB != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List u(String str, float f, jr2 jr2Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = kr2.a(cCharAt, jr2Var.a, jr2Var.b);
                n77 n77Var = this.P.h;
                n77Var.getClass();
                kr2 kr2Var = (kr2) ck3.u(n77Var, iA);
                if (kr2Var != null) {
                    fMeasureText = (ta8.c() * ((float) kr2Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.H.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                rs7 rs7VarR = r(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    rs7VarR.a = strTrim;
                    rs7VarR.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    rs7VarR.a = strTrim2;
                    rs7VarR.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            rs7 rs7VarR2 = r(i);
            rs7VarR2.a = str.substring(i2);
            rs7VarR2.b = f4;
        }
        return this.M.subList(0, i);
    }
}
