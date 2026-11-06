package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class qs1 {
    public static int b;
    public static we3 c;

    public static void A(long j, bf0 bf0Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            hk0.g("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ai0) arrayList4.get(i8)).d() < i7) {
                hk0.g("Failed requirement.");
                return;
            }
        }
        ai0 ai0Var = (ai0) arrayList.get(i2);
        ai0 ai0Var2 = (ai0) arrayList4.get(i3 - 1);
        if (i7 == ai0Var.d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            ai0 ai0Var3 = (ai0) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            ai0Var = ai0Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (ai0Var.i(i7) == ai0Var2.i(i7)) {
            int iMin = Math.min(ai0Var.d(), ai0Var2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && ai0Var.i(i11) == ai0Var2.i(i11); i11++) {
                i10++;
            }
            long j3 = (bf0Var.n / 4) + j + 2 + ((long) i10) + 1;
            bf0Var.X0(-i10);
            bf0Var.X0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                bf0Var.X0(ai0Var.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ai0) arrayList4.get(i4)).d()) {
                    bf0Var.X0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    hk0.l("Check failed.");
                    return;
                }
            }
            bf0 bf0Var2 = new bf0();
            bf0Var.X0(((int) ((bf0Var2.n / 4) + j3)) * (-1));
            A(j3, bf0Var2, i12, arrayList4, i4, i3, arrayList5);
            bf0Var.T0(bf0Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ai0) arrayList4.get(i14 - 1)).i(i7) != ((ai0) arrayList4.get(i14)).i(i7)) {
                i13++;
            }
        }
        long j4 = (bf0Var.n / 4) + j + 2 + ((long) (i13 * 2));
        bf0Var.X0(i13);
        bf0Var.X0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((ai0) arrayList4.get(i15)).i(i7);
            if (i15 == i4 || i16 != ((ai0) arrayList4.get(i15 - 1)).i(i7)) {
                bf0Var.X0(i16 & 255);
            }
        }
        bf0 bf0Var3 = new bf0();
        int i17 = i4;
        while (i17 < i3) {
            byte bI = ((ai0) arrayList4.get(i17)).i(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (bI != ((ai0) arrayList4.get(i19)).i(i7)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i7 + 1 == ((ai0) arrayList4.get(i17)).d()) {
                bf0Var.X0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
            } else {
                bf0Var.X0(((int) ((bf0Var3.n / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
                A(j2, bf0Var3, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        bf0Var.T0(bf0Var3);
    }

    public static final int B(String str) {
        Character chV = ub7.V(ub7.y0(str).toString());
        if (chV == null) {
            return 3;
        }
        char cCharValue = chV.charValue();
        if (Character.isLetterOrDigit(cCharValue)) {
            return Character.isDigit(cCharValue) ? 1 : 2;
        }
        return 0;
    }

    public static final boolean C(in5 in5Var) {
        return (in5Var.c() || in5Var.h || !in5Var.d) ? false : true;
    }

    public static final boolean D(in5 in5Var) {
        return !in5Var.h && in5Var.d;
    }

    public static final boolean E(in5 in5Var) {
        return (in5Var.c() || !in5Var.h || in5Var.d) ? false : true;
    }

    public static final boolean F(in5 in5Var) {
        return in5Var.h && !in5Var.d;
    }

    public static final vv G(long j, ux2 ux2Var, int i) {
        if ((i & 1) != 0) {
            j = ((rn4) ux2Var.j(un4.a)).a.a;
        }
        if ((i & 2) != 0) {
            bw0.a(j, ux2Var);
        }
        return new vv((byte) 10);
    }

    public static final px4 H(mw4 mw4Var, ux2 ux2Var, int i) {
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = h57.p(Boolean.FALSE);
            ux2Var.g0(objK);
        }
        px4 px4Var = (px4) objK;
        boolean z = (((i & 14) ^ 6) > 4 && ux2Var.f(mw4Var)) || (i & 6) == 4;
        Object objK2 = ux2Var.K();
        if (z || objK2 == awVar) {
            objK2 = new oa1((Object) mw4Var, (Object) px4Var, (hc1) null, (byte) 21);
            ux2Var.g0(objK2);
        }
        ck3.i(mw4Var, (hw2) objK2, ux2Var);
        return px4Var;
    }

    public static final void J(u52 u52Var, l03 l03Var) {
        boolean z;
        Canvas canvas;
        float f;
        ll0 ll0VarX = u52Var.h0().x();
        l03 l03Var2 = (l03) u52Var.h0().p;
        n03 n03Var = l03Var.a;
        if (l03Var.s) {
            return;
        }
        long j = l03Var.h;
        Canvas canvasB = dg.b(ll0VarX);
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = l03Var.t;
            float f2 = (int) (j2 >> 32);
            float f3 = f2 - l03Var.v;
            float f4 = (int) (j2 & 4294967295L);
            float f5 = f4 - l03Var.w;
            long j3 = l03Var.u;
            float f6 = f2 + ((int) (j3 >> 32)) + l03Var.x;
            float f7 = f4 + ((int) (j3 & 4294967295L)) + l03Var.y;
            float fA = n03Var.a();
            tv0 tv0VarK = n03Var.k();
            int iN = n03Var.N();
            if (fA >= 1.0f && iN == 3 && tv0VarK == null) {
                canvas = canvasB;
                if (n03Var.j() != 1) {
                    canvas.save();
                    f = f3;
                    canvasB = canvas;
                }
                canvasB.translate(f, f5);
                Matrix matrixI = n03Var.I();
                matrixI.preTranslate(l03Var.v, l03Var.w);
                canvasB.concat(matrixI);
                l03Var.h = t65.d(l03Var.h, (((long) Float.floatToRawIntBits(l03Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(l03Var.v)) << 32));
            } else {
                canvas = canvasB;
            }
            gy8 gy8VarK = l03Var.p;
            if (gy8VarK == null) {
                gy8VarK = ka0.k();
                l03Var.p = gy8VarK;
            }
            gy8VarK.j(fA);
            gy8VarK.k(iN);
            gy8VarK.m(tv0VarK);
            Paint paint = (Paint) gy8VarK.c;
            f = f3;
            canvasB = canvas;
            canvasB.saveLayer(f, f5, f6, f7, paint);
            canvasB.translate(f, f5);
            Matrix matrixI2 = n03Var.I();
            matrixI2.preTranslate(l03Var.v, l03Var.w);
            canvasB.concat(matrixI2);
            l03Var.h = t65.d(l03Var.h, (((long) Float.floatToRawIntBits(l03Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(l03Var.v)) << 32));
        }
        l03Var.a();
        if (!n03Var.o()) {
            try {
                l03Var.a.B(l03Var.b, l03Var.c, l03Var, l03Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = n03Var.K() > 0.0f;
        if (z2) {
            ll0VarX.t();
        }
        boolean z3 = !zIsHardwareAccelerated && l03Var.A;
        if (z3) {
            ll0VarX.g();
            vs1 vs1VarD = l03Var.d();
            if (vs1VarD instanceof ob5) {
                ll0.e(ll0VarX, ((ob5) vs1VarD).e);
            } else if (vs1VarD instanceof pb5) {
                rj rjVarA = l03Var.m;
                if (rjVarA != null) {
                    rjVarA.a.rewind();
                } else {
                    rjVarA = tj.a();
                    l03Var.m = rjVarA;
                }
                rj.c(rjVarA, ((pb5) vs1VarD).e);
                ll0VarX.d(rjVarA, 1);
            } else {
                if (!(vs1VarD instanceof nb5)) {
                    gk0.s();
                    return;
                }
                ll0VarX.d(((nb5) vs1VarD).e, 1);
            }
        }
        if (l03Var2 != null) {
            ll2 ll2Var = l03Var2.r;
            if (!ll2Var.m) {
                ji3.a("Only add dependencies during a tracking");
            }
            kx4 kx4Var = (kx4) ll2Var.p;
            if (kx4Var != null) {
                kx4Var.a(l03Var);
            } else if (((l03) ll2Var.n) != null) {
                kx4 kx4Var2 = ui6.a;
                kx4 kx4Var3 = new kx4();
                l03 l03Var3 = (l03) ll2Var.n;
                l03Var3.getClass();
                kx4Var3.a(l03Var3);
                kx4Var3.a(l03Var);
                ll2Var.p = kx4Var3;
                ll2Var.n = null;
            } else {
                ll2Var.n = l03Var;
            }
            kx4 kx4Var4 = (kx4) ll2Var.q;
            if (kx4Var4 != null) {
                z = !kx4Var4.l(l03Var);
            } else if (((l03) ll2Var.f1375o) != l03Var) {
                z = true;
            } else {
                ll2Var.f1375o = null;
                z = false;
            }
            if (z) {
                l03Var.q++;
            }
        }
        if (((cg) ll0VarX).a.isHardwareAccelerated()) {
            n03Var.H(ll0VarX);
        } else {
            nl0 nl0Var = l03Var.f1316o;
            if (nl0Var == null) {
                nl0Var = new nl0();
                l03Var.f1316o = nl0Var;
            }
            iu iuVar = nl0Var.n;
            in1 in1Var = l03Var.b;
            j04 j04Var = l03Var.c;
            long jA0 = xs1.a0(l03Var.u);
            in1 in1VarZ = iuVar.z();
            j04 j04VarB = iuVar.B();
            ll0 ll0VarX2 = iuVar.x();
            long jD = iuVar.D();
            l03 l03Var4 = (l03) iuVar.p;
            iuVar.Q(in1Var);
            iuVar.R(j04Var);
            iuVar.P(ll0VarX);
            iuVar.S(jA0);
            iuVar.p = l03Var;
            ll0VarX.g();
            try {
                l03Var.c(nl0Var);
                ll0VarX.p();
                iuVar.Q(in1VarZ);
                iuVar.R(j04VarB);
                iuVar.P(ll0VarX2);
                iuVar.S(jD);
                iuVar.p = l03Var4;
            } catch (Throwable th) {
                ll0VarX.p();
                iuVar.Q(in1VarZ);
                iuVar.R(j04VarB);
                iuVar.P(ll0VarX2);
                iuVar.S(jD);
                iuVar.p = l03Var4;
                throw th;
            }
        }
        if (z3) {
            ll0VarX.p();
        }
        if (z2) {
            ll0VarX.h();
        }
        if (!zIsHardwareAccelerated) {
            canvasB.restore();
        }
        l03Var.h = j;
    }

    public static final jc2 K(Enum[] enumArr) {
        enumArr.getClass();
        return new jc2(enumArr);
    }

    public static zj1 L(ux2 ux2Var) {
        float f = b87.a;
        in1 in1Var = (in1) ux2Var.j(b11.h);
        boolean zC = ux2Var.c(in1Var.getDensity());
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (zC || objK == obj) {
            objK = new ei1(new l07(in1Var));
            ux2Var.g0(objK);
        }
        ei1 ei1Var = (ei1) objK;
        boolean zF = ux2Var.f(ei1Var);
        Object objK2 = ux2Var.K();
        if (zF || objK2 == obj) {
            objK2 = new zj1(ei1Var);
            ux2Var.g0(objK2);
        }
        return (zj1) objK2;
    }

    public static String M(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        while (true) {
            length -= 3;
            if (length < 1) {
                break;
            }
            sb.insert(length, ' ');
        }
        String string = sb.toString();
        io.sentry.android.core.u0 u0Var = yp7.a;
        int length2 = string.length();
        if (length2 < 0 || string.length() - length2 < 0) {
            yq4.f();
            return null;
        }
        boolean z = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        String str2 = a60.d;
        a60 a60Var = z ? a60.g : a60.f;
        String string2 = a60Var.c(string, a60Var.c).toString();
        string2.getClass();
        return string2;
    }

    public static Collection N(zo4 zo4Var, no1 no1Var, int i) {
        if ((i & 1) != 0) {
            no1Var = no1.m;
        }
        zo4.a.getClass();
        return zo4Var.e(no1Var, e24.s);
    }

    public static final ml O(de1 de1Var) {
        ml mlVar = (ml) de1Var.l0(yl7.E);
        if (mlVar != null) {
            return mlVar;
        }
        hk0.l("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final Object P(ap6 ap6Var, np6 np6Var) {
        Object objG = ap6Var.m.g(np6Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final String Q(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(cx.Z0(parameterTypes, "", "(", ")", e24.H, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(p76.b(returnType));
        return sb.toString();
    }

    public static final boolean R(in5 in5Var, long j, long j2) {
        int i = in5Var.i == 1 ? 1 : 0;
        long j3 = in5Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static ya5 S(ai0... ai0VarArr) {
        if (ai0VarArr.length == 0) {
            return new ya5(new ai0[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new hw(ai0VarArr, false));
        pv0.a0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = ai0VarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(qf0.q(arrayList, ai0VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((ai0) arrayList.get(0)).d() <= 0) {
            hk0.g("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            ai0 ai0Var = (ai0) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                ai0 ai0Var2 = (ai0) arrayList.get(i6);
                ai0Var2.getClass();
                ai0Var.getClass();
                if (!ai0Var2.m(0, ai0Var, ai0Var.d())) {
                    break;
                }
                if (ai0Var2.d() == ai0Var.d()) {
                    yq4.q(ai0Var2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        bf0 bf0Var = new bf0();
        A(0L, bf0Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (bf0Var.n / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = bf0Var.H0();
        }
        return new ya5((ai0[]) Arrays.copyOf(ai0VarArr, ai0VarArr.length), iArr);
    }

    public static final long T(in5 in5Var, boolean z) {
        long jD = t65.d(in5Var.c, in5Var.g);
        if (z || !in5Var.c()) {
            return jD;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LifecycleOwner V(Context context) {
        context.getClass();
        if (context instanceof LifecycleOwner) {
            return (LifecycleOwner) context;
        }
        if (context instanceof ContextWrapper) {
            Object baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof LifecycleOwner) {
                return (LifecycleOwner) baseContext;
            }
        }
        return null;
    }

    public static final void W(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        fileOutputStream.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                hk0.l("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void e(final int i, final String str, final fs4 fs4Var, boolean z, final Function0 function0, ux2 ux2Var, final int i2, final int i3) {
        int i4;
        boolean z2;
        boolean z3;
        final boolean z4;
        j56 j56VarR;
        long jB;
        int i5;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(753846986);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var2.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var2.f(fs4Var) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= ux2Var2.g(z2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if (ux2Var2.h(function0)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var2.N(i4 & 1, z3)) {
                if (i6 != 0) {
                    z2 = true;
                }
                if (z2) {
                    ux2Var2.W(-528211035);
                    jB = ep1.r(ux2Var2).q;
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-528153375);
                    jB = rv0.b(0.38f, ep1.r(ux2Var2).q);
                    ux2Var2.p(false);
                }
                final long j = jB;
                kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(LayoutNode.e0);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA, d82.v, ux2Var2);
                o67.n(yj5VarL, d82.u, ux2Var2);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS, d82.t, ux2Var2);
                boolean z5 = z2;
                int i7 = ((i4 >> 12) & 14) | 1572912;
                int i8 = i4 >> 3;
                xo1.k(function0, androidx.compose.foundation.layout.b.l(ka0.F(cs4.b, 0.0f, 0.0f, 0.0f, 3.0f, 7), 40.0f), z5, d82.o(ux2Var2).a(ep1.r(ux2Var2).L, ep1.r(ux2Var2).q, rv0.b(0.38f, ep1.r(ux2Var2).L), j), sf6.a, au8.O(-1743691682, new hw2() { // from class: o.os1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ux2 ux2Var3 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (ux2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            td3.b(lv1.T(i, ux2Var3, 0), str, null, j, ux2Var3, 8, 4);
                        } else {
                            ux2Var3.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var2), ux2Var2, (i8 & 896) | i7, 16);
                qs7.b(str, null, j, 0L, null, 0L, new qo7(3), 0L, 2, false, 1, 0, null, ep1.s(ux2Var).f952o, ux2Var, i8 & 14, 24960, 109562);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                z4 = z5;
            } else {
                ux2Var2.Q();
                z4 = z2;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.ps1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qs1.e(i, str, fs4Var, z4, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i2 & 24576) != 0) {
            if (ux2Var2.h(function0)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var2.N(i4 & 1, z3)) {
            if (i6 != 0) {
                z2 = true;
            }
            if (z2) {
                ux2Var2.W(-528211035);
                jB = ep1.r(ux2Var2).q;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-528153375);
                jB = rv0.b(0.38f, ep1.r(ux2Var2).q);
                ux2Var2.p(false);
            }
            final long j2 = jB;
            kw0 kw0VarA2 = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, d82.v, ux2Var2);
            o67.n(yj5VarL2, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS2, d82.t, ux2Var2);
            boolean z6 = z2;
            int i9 = ((i4 >> 12) & 14) | 1572912;
            int i10 = i4 >> 3;
            xo1.k(function0, androidx.compose.foundation.layout.b.l(ka0.F(cs4.b, 0.0f, 0.0f, 0.0f, 3.0f, 7), 40.0f), z6, d82.o(ux2Var2).a(ep1.r(ux2Var2).L, ep1.r(ux2Var2).q, rv0.b(0.38f, ep1.r(ux2Var2).L), j2), sf6.a, au8.O(-1743691682, new hw2() { // from class: o.os1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var3 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        td3.b(lv1.T(i, ux2Var3, 0), str, null, j2, ux2Var3, 8, 4);
                    } else {
                        ux2Var3.Q();
                    }
                    return f88.a;
                }
            }, ux2Var2), ux2Var2, (i10 & 896) | i9, 16);
            qs7.b(str, null, j2, 0L, null, 0L, new qo7(3), 0L, 2, false, 1, 0, null, ep1.s(ux2Var).f952o, ux2Var, i10 & 14, 24960, 109562);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            z4 = z6;
        } else {
            ux2Var2.Q();
            z4 = z2;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.ps1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qs1.e(i, str, fs4Var, z4, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void h(ArrayList arrayList, fs4 fs4Var, Function0 function0, ux2 ux2Var, int i) {
        fs4 fs4VarA;
        ux2Var.Y(1363734099);
        byte b2 = 2;
        int i2 = i | (ux2Var.f(arrayList) ? 4 : 2) | (ux2Var.h(function0) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((tq1) obj).e) {
                    arrayList2.add(obj);
                }
            }
            List listK0 = arrayList2.size() > 3 ? lv0.K0(arrayList2, 2) : lv0.K0(arrayList2, 3);
            int i3 = arrayList2.size() > 3 ? 1 : 0;
            boolean z = listK0.size() + i3 == 3;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(z ? new ew(8.0f, new hk0(b2)) : iq8.f, xz2.y, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-1299964532);
            Iterator it = listK0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fs4VarA = cs4.b;
                if (!zHasNext) {
                    break;
                }
                tq1 tq1Var = (tq1) it.next();
                if (z) {
                    fs4VarA = eg6.a(fs4VarA, 1.0f);
                }
                e(tq1Var.a, m77.z(tq1Var.b, ux2Var), androidx.compose.ui.platform.a.a(fs4VarA, tq1Var.c), tq1Var.d, tq1Var.f, ux2Var, 0, 0);
            }
            ux2Var.p(false);
            if (i3 != 0) {
                ux2Var.W(-1643750069);
                if (z) {
                    fs4VarA = eg6.a(fs4VarA, 1.0f);
                }
                e(R.drawable.ic_more, m77.z(R.string.device_tab_device_details_option_more_actions, ux2Var), androidx.compose.ui.platform.a.a(fs4VarA, "TVTA-devicesScreen-deviceInfoScreen-MoreAction"), false, function0, ux2Var, (i2 << 6) & 57344, 8);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1643371125);
                ux2Var.p(false);
            }
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((byte) 8, i, arrayList, fs4Var, function0, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void i(int i, int i2, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        fs4 fs4Var2;
        boolean z4;
        j56 j56VarR;
        sa4 sa4VarT;
        Object objK;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1889925038);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= ux2Var.g(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                if (i5 != 0) {
                    z2 = true;
                }
                String strZ = m77.z(R.string.device_tab_title, ux2Var);
                sa4VarT = qf0.t();
                if (z2) {
                    sa4VarT.add(new l08(new yk7(R.drawable.ic_search_app_bar), true, y57.g(R.string.search_placeholder_title), function1));
                }
                sa4VarT.add(new l08(new yk7(R.drawable.settings_icon), true, y57.g(R.string.tv_session_toolbar_info_button_options), function0));
                sa4 sa4VarR = qf0.r(sa4VarT);
                bm2 bm2Var = db8.E;
                objK = ux2Var.K();
                if (objK == e01.a) {
                    objK = new vr1((byte) 18);
                    ux2Var.g0(objK);
                }
                cs4 cs4Var = cs4.b;
                x67.c(strZ, (Function0) objK, cs4Var, null, sa4VarR, "TVTA-devicesScreen-settingsIcon-TopAppBarActionItemView", bm2Var, ux2Var, (i4 & 896) | 1572912, 280);
                fs4Var2 = cs4Var;
            } else {
                ux2Var.Q();
                fs4Var2 = fs4Var;
            }
            z4 = z2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new za0(i, i2, function0, function1, fs4Var2, z4);
            }
        }
        i4 = i3 | 3456;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i4 & 1, z3)) {
            if (i5 != 0) {
                z2 = true;
            }
            String strZ2 = m77.z(R.string.device_tab_title, ux2Var);
            sa4VarT = qf0.t();
            if (z2) {
                sa4VarT.add(new l08(new yk7(R.drawable.ic_search_app_bar), true, y57.g(R.string.search_placeholder_title), function1));
            }
            sa4VarT.add(new l08(new yk7(R.drawable.settings_icon), true, y57.g(R.string.tv_session_toolbar_info_button_options), function0));
            sa4 sa4VarR2 = qf0.r(sa4VarT);
            bm2 bm2Var2 = db8.E;
            objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new vr1((byte) 18);
                ux2Var.g0(objK);
            }
            cs4 cs4Var2 = cs4.b;
            x67.c(strZ2, (Function0) objK, cs4Var2, null, sa4VarR2, "TVTA-devicesScreen-settingsIcon-TopAppBarActionItemView", bm2Var2, ux2Var, (i4 & 896) | 1572912, 280);
            fs4Var2 = cs4Var2;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        z4 = z2;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new za0(i, i2, function0, function1, fs4Var2, z4);
        }
    }

    public static final void j(List list, l33 l33Var, Function1 function1, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        fs4 fs4Var2;
        ux2Var.Y(1570232653);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = l33Var;
            i2 |= ux2Var.h(obj) ? 32 : 16;
        } else {
            obj = l33Var;
        }
        if ((i & 384) == 0) {
            obj2 = function1;
            i2 |= ux2Var.h(obj2) ? 256 : 128;
        } else {
            obj2 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (ux2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
            cs4 cs4Var = cs4.b;
            yo1.k(function0, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionEditScreen-groupSelector-bottomSheet"), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-766348113, new q34(list, obj, obj2, function0, (byte) 7), ux2Var), ux2Var, (i3 >> 9) & 14, 3072, 8184);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a50((Object) list, (Object) l33Var, (Object) function1, (Object) function0, (Object) fs4Var2, i, (byte) 3);
        }
    }

    public static final void k(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        Function0 function1;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        ux2Var2.Y(-834092629);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = i | (ux2Var2.h(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (ux2Var2.N(i3 & 1, (i3 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 28.0f, 7);
            x50 x50Var = xz2.y;
            dg6 dg6VarA = cg6.a(iq8.a, x50Var, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            s14 s14Var = new s14(1.0f, true);
            dg6 dg6VarA2 = cg6.a(new ew(8.0f, new hk0(b2)), x50Var, ux2Var2, 54);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, s14Var);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            l(lv1.T(R.drawable.ic_teamviewer_logo, ux2Var2, 0), null, androidx.compose.foundation.layout.b.l(cs4Var, 25.0f), null, null, 0.0f, null, ux2Var2, 440, 120);
            String strZ = m77.z(R.string.sign_in_welcome_text, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, null, vv0.W, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.h, ux2Var, 0, 24960, 110586);
            ux2Var.p(true);
            String strZ2 = m77.z(R.string.sign_in_skip, ux2Var);
            ot7 ot7Var = ((rn4) ux2Var.j(h72Var)).b.m;
            long j = ((rn4) ux2Var.j(h72Var)).a.q;
            fs4 fs4VarF2 = ka0.F(cs4Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ua5.s(ux2Var);
            }
            mw4 mw4Var = (mw4) objK;
            boolean z2 = (i3 & 14) == 4;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                objK2 = new yv1(function0, (byte) 11);
                ux2Var.g0(objK2);
            }
            function1 = function0;
            qs7.b(strZ2, androidx.compose.foundation.b.a(fs4VarF2, mw4Var, null, false, null, (Function0) objK2, 28), j, 0L, null, 0L, new qo7(6), 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 0, 0, 130040);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            function1 = function0;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new g53(function1, fs4Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0183  */
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x0156  */
    public static final void l(final ud5 ud5Var, final String str, fs4 fs4Var, he heVar, sb1 sb1Var, float f, tv0 tv0Var, ux2 ux2Var, final int i, final int i2) {
        fs4 fs4Var2;
        int i3;
        he heVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        final fs4 fs4Var3;
        final he heVar3;
        final sb1 sb1Var2;
        final tv0 tv0Var2;
        final float f3;
        j56 j56VarR;
        fs4 fs4VarA;
        he heVar4;
        int i14;
        sb1 sb1Var3;
        tv0 tv0Var3;
        aw awVar;
        Object objK;
        boolean z2;
        Object objK2;
        ux2Var.Y(1142754848);
        int i15 = (ux2Var.h(ud5Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i15 |= ux2Var.f(str) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i15 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i15 | 3072;
                heVar2 = heVar;
            } else {
                heVar2 = heVar;
                if (ux2Var.f(heVar2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 = i15 | i4;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (ux2Var.f(sb1Var)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i10 = i5 | 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if (ux2Var.c(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i10 = i5 | i9;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        if (ux2Var.f(tv0Var)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i10 |= i12;
                    }
                    i13 = i10;
                    if ((i10 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ux2Var.N(i13 & 1, z)) {
                        fs4VarA = cs4.b;
                        if (i16 != 0) {
                            fs4Var2 = fs4VarA;
                        }
                        if (i3 != 0) {
                            heVar4 = xz2.s;
                        } else {
                            heVar4 = heVar2;
                        }
                        if (i6 != 0) {
                            sb1Var3 = rb1.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            sb1Var3 = sb1Var;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i11 != 0) {
                            tv0Var3 = null;
                        } else {
                            tv0Var3 = tv0Var;
                        }
                        awVar = e01.a;
                        if (str != null) {
                            ux2Var.W(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objK2 = ux2Var.K();
                            if (z2 || objK2 == awVar) {
                                objK2 = new fy(str, (byte) 12);
                                ux2Var.g0(objK2);
                            }
                            fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                            ux2Var.p(false);
                        } else {
                            ux2Var.W(1899381698);
                            ux2Var.p(false);
                        }
                        fs4 fs4VarA2 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                        objK = ux2Var.K();
                        if (objK == awVar) {
                            objK = ei.h;
                            ux2Var.g0(objK);
                        }
                        do4 do4Var = (do4) objK;
                        int iHashCode = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS = uf0.s(ux2Var, fs4VarA2);
                        yj5 yj5VarL = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4Var, d82.v, ux2Var);
                        o67.n(yj5VarL, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                        ux2Var.p(true);
                        fs4Var3 = fs4Var2;
                        heVar3 = heVar4;
                        sb1Var2 = sb1Var3;
                        tv0Var2 = tv0Var3;
                    } else {
                        ux2Var.Q();
                        fs4Var3 = fs4Var2;
                        heVar3 = heVar2;
                        sb1Var2 = sb1Var;
                        tv0Var2 = tv0Var;
                    }
                    f3 = f2;
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.de3
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                                return f88.a;
                            }
                        };
                    }
                }
                i10 |= 1572864;
                i13 = i10;
                if ((i10 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i13 & 1, z)) {
                    fs4VarA = cs4.b;
                    if (i16 != 0) {
                        fs4Var2 = fs4VarA;
                    }
                    if (i3 != 0) {
                        heVar4 = xz2.s;
                    } else {
                        heVar4 = heVar2;
                    }
                    if (i6 != 0) {
                        sb1Var3 = rb1.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        sb1Var3 = sb1Var;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i11 != 0) {
                        tv0Var3 = null;
                    } else {
                        tv0Var3 = tv0Var;
                    }
                    awVar = e01.a;
                    if (str != null) {
                        ux2Var.W(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objK2 = ux2Var.K();
                        if (z2) {
                            objK2 = new fy(str, (byte) 12);
                            ux2Var.g0(objK2);
                        } else {
                            objK2 = new fy(str, (byte) 12);
                            ux2Var.g0(objK2);
                        }
                        fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(1899381698);
                        ux2Var.p(false);
                    }
                    fs4 fs4VarA3 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                    objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = ei.h;
                        ux2Var.g0(objK);
                    }
                    do4 do4Var2 = (do4) objK;
                    int iHashCode2 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA3);
                    yj5 yj5VarL2 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4Var2, d82.v, ux2Var);
                    o67.n(yj5VarL2, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS2, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
                    ux2Var.p(true);
                    fs4Var3 = fs4Var2;
                    heVar3 = heVar4;
                    sb1Var2 = sb1Var3;
                    tv0Var2 = tv0Var3;
                } else {
                    ux2Var.Q();
                    fs4Var3 = fs4Var2;
                    heVar3 = heVar2;
                    sb1Var2 = sb1Var;
                    tv0Var2 = tv0Var;
                }
                f3 = f2;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.de3
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i10 = i5 | 196608;
                f2 = f;
            } else {
                f2 = f;
                if (ux2Var.c(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i5 | i9;
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    if (ux2Var.f(tv0Var)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i10 |= i12;
                }
                i13 = i10;
                if ((i10 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i13 & 1, z)) {
                    fs4VarA = cs4.b;
                    if (i16 != 0) {
                        fs4Var2 = fs4VarA;
                    }
                    if (i3 != 0) {
                        heVar4 = xz2.s;
                    } else {
                        heVar4 = heVar2;
                    }
                    if (i6 != 0) {
                        sb1Var3 = rb1.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        sb1Var3 = sb1Var;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i11 != 0) {
                        tv0Var3 = null;
                    } else {
                        tv0Var3 = tv0Var;
                    }
                    awVar = e01.a;
                    if (str != null) {
                        ux2Var.W(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objK2 = ux2Var.K();
                        if (z2) {
                            objK2 = new fy(str, (byte) 12);
                            ux2Var.g0(objK2);
                        } else {
                            objK2 = new fy(str, (byte) 12);
                            ux2Var.g0(objK2);
                        }
                        fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(1899381698);
                        ux2Var.p(false);
                    }
                    fs4 fs4VarA4 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                    objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = ei.h;
                        ux2Var.g0(objK);
                    }
                    do4 do4Var3 = (do4) objK;
                    int iHashCode3 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarA4);
                    yj5 yj5VarL3 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4Var3, d82.v, ux2Var);
                    o67.n(yj5VarL3, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS3, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var);
                    ux2Var.p(true);
                    fs4Var3 = fs4Var2;
                    heVar3 = heVar4;
                    sb1Var2 = sb1Var3;
                    tv0Var2 = tv0Var3;
                } else {
                    ux2Var.Q();
                    fs4Var3 = fs4Var2;
                    heVar3 = heVar2;
                    sb1Var2 = sb1Var;
                    tv0Var2 = tv0Var;
                }
                f3 = f2;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.de3
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i10 |= 1572864;
            i13 = i10;
            if ((i10 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i13 & 1, z)) {
                fs4VarA = cs4.b;
                if (i16 != 0) {
                    fs4Var2 = fs4VarA;
                }
                if (i3 != 0) {
                    heVar4 = xz2.s;
                } else {
                    heVar4 = heVar2;
                }
                if (i6 != 0) {
                    sb1Var3 = rb1.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    sb1Var3 = sb1Var;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i11 != 0) {
                    tv0Var3 = null;
                } else {
                    tv0Var3 = tv0Var;
                }
                awVar = e01.a;
                if (str != null) {
                    ux2Var.W(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objK2 = ux2Var.K();
                    if (z2) {
                        objK2 = new fy(str, (byte) 12);
                        ux2Var.g0(objK2);
                    } else {
                        objK2 = new fy(str, (byte) 12);
                        ux2Var.g0(objK2);
                    }
                    fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(1899381698);
                    ux2Var.p(false);
                }
                fs4 fs4VarA5 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                objK = ux2Var.K();
                if (objK == awVar) {
                    objK = ei.h;
                    ux2Var.g0(objK);
                }
                do4 do4Var4 = (do4) objK;
                int iHashCode4 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarA5);
                yj5 yj5VarL4 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4Var4, d82.v, ux2Var);
                o67.n(yj5VarL4, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS4, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var);
                ux2Var.p(true);
                fs4Var3 = fs4Var2;
                heVar3 = heVar4;
                sb1Var2 = sb1Var3;
                tv0Var2 = tv0Var3;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                heVar3 = heVar2;
                sb1Var2 = sb1Var;
                tv0Var2 = tv0Var;
            }
            f3 = f2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.de3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i15 |= 384;
        fs4Var2 = fs4Var;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i15 | 3072;
            heVar2 = heVar;
        } else {
            heVar2 = heVar;
            if (ux2Var.f(heVar2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i15 | i4;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (ux2Var.f(sb1Var)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i10 = i5 | 196608;
                f2 = f;
            } else {
                f2 = f;
                if (ux2Var.c(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i5 | i9;
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    if (ux2Var.f(tv0Var)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i10 |= i12;
                }
                i13 = i10;
                if ((i10 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i13 & 1, z)) {
                    fs4VarA = cs4.b;
                    if (i16 != 0) {
                        fs4Var2 = fs4VarA;
                    }
                    if (i3 != 0) {
                        heVar4 = xz2.s;
                    } else {
                        heVar4 = heVar2;
                    }
                    if (i6 != 0) {
                        sb1Var3 = rb1.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        sb1Var3 = sb1Var;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i11 != 0) {
                        tv0Var3 = null;
                    } else {
                        tv0Var3 = tv0Var;
                    }
                    awVar = e01.a;
                    if (str != null) {
                        ux2Var.W(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objK2 = ux2Var.K();
                        if (z2) {
                            objK2 = new fy(str, (byte) 12);
                            ux2Var.g0(objK2);
                        } else {
                            objK2 = new fy(str, (byte) 12);
                            ux2Var.g0(objK2);
                        }
                        fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(1899381698);
                        ux2Var.p(false);
                    }
                    fs4 fs4VarA6 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                    objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = ei.h;
                        ux2Var.g0(objK);
                    }
                    do4 do4Var5 = (do4) objK;
                    int iHashCode5 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarA6);
                    yj5 yj5VarL5 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4Var5, d82.v, ux2Var);
                    o67.n(yj5VarL5, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS5, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode5), d82.w, ux2Var);
                    ux2Var.p(true);
                    fs4Var3 = fs4Var2;
                    heVar3 = heVar4;
                    sb1Var2 = sb1Var3;
                    tv0Var2 = tv0Var3;
                } else {
                    ux2Var.Q();
                    fs4Var3 = fs4Var2;
                    heVar3 = heVar2;
                    sb1Var2 = sb1Var;
                    tv0Var2 = tv0Var;
                }
                f3 = f2;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.de3
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i10 |= 1572864;
            i13 = i10;
            if ((i10 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i13 & 1, z)) {
                fs4VarA = cs4.b;
                if (i16 != 0) {
                    fs4Var2 = fs4VarA;
                }
                if (i3 != 0) {
                    heVar4 = xz2.s;
                } else {
                    heVar4 = heVar2;
                }
                if (i6 != 0) {
                    sb1Var3 = rb1.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    sb1Var3 = sb1Var;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i11 != 0) {
                    tv0Var3 = null;
                } else {
                    tv0Var3 = tv0Var;
                }
                awVar = e01.a;
                if (str != null) {
                    ux2Var.W(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objK2 = ux2Var.K();
                    if (z2) {
                        objK2 = new fy(str, (byte) 12);
                        ux2Var.g0(objK2);
                    } else {
                        objK2 = new fy(str, (byte) 12);
                        ux2Var.g0(objK2);
                    }
                    fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(1899381698);
                    ux2Var.p(false);
                }
                fs4 fs4VarA7 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                objK = ux2Var.K();
                if (objK == awVar) {
                    objK = ei.h;
                    ux2Var.g0(objK);
                }
                do4 do4Var6 = (do4) objK;
                int iHashCode6 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarA7);
                yj5 yj5VarL6 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4Var6, d82.v, ux2Var);
                o67.n(yj5VarL6, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS6, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode6), d82.w, ux2Var);
                ux2Var.p(true);
                fs4Var3 = fs4Var2;
                heVar3 = heVar4;
                sb1Var2 = sb1Var3;
                tv0Var2 = tv0Var3;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                heVar3 = heVar2;
                sb1Var2 = sb1Var;
                tv0Var2 = tv0Var;
            }
            f3 = f2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.de3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i5 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            i10 = i5 | 196608;
            f2 = f;
        } else {
            f2 = f;
            if (ux2Var.c(f2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i10 = i5 | i9;
        }
        i11 = i2 & 64;
        if (i11 != 0) {
            if ((1572864 & i) == 0) {
                if (ux2Var.f(tv0Var)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i10 |= i12;
            }
            i13 = i10;
            if ((i10 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i13 & 1, z)) {
                fs4VarA = cs4.b;
                if (i16 != 0) {
                    fs4Var2 = fs4VarA;
                }
                if (i3 != 0) {
                    heVar4 = xz2.s;
                } else {
                    heVar4 = heVar2;
                }
                if (i6 != 0) {
                    sb1Var3 = rb1.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    sb1Var3 = sb1Var;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i11 != 0) {
                    tv0Var3 = null;
                } else {
                    tv0Var3 = tv0Var;
                }
                awVar = e01.a;
                if (str != null) {
                    ux2Var.W(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objK2 = ux2Var.K();
                    if (z2) {
                        objK2 = new fy(str, (byte) 12);
                        ux2Var.g0(objK2);
                    } else {
                        objK2 = new fy(str, (byte) 12);
                        ux2Var.g0(objK2);
                    }
                    fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(1899381698);
                    ux2Var.p(false);
                }
                fs4 fs4VarA8 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
                objK = ux2Var.K();
                if (objK == awVar) {
                    objK = ei.h;
                    ux2Var.g0(objK);
                }
                do4 do4Var7 = (do4) objK;
                int iHashCode7 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS7 = uf0.s(ux2Var, fs4VarA8);
                yj5 yj5VarL7 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4Var7, d82.v, ux2Var);
                o67.n(yj5VarL7, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS7, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode7), d82.w, ux2Var);
                ux2Var.p(true);
                fs4Var3 = fs4Var2;
                heVar3 = heVar4;
                sb1Var2 = sb1Var3;
                tv0Var2 = tv0Var3;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                heVar3 = heVar2;
                sb1Var2 = sb1Var;
                tv0Var2 = tv0Var;
            }
            f3 = f2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.de3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i10 |= 1572864;
        i13 = i10;
        if ((i10 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i13 & 1, z)) {
            fs4VarA = cs4.b;
            if (i16 != 0) {
                fs4Var2 = fs4VarA;
            }
            if (i3 != 0) {
                heVar4 = xz2.s;
            } else {
                heVar4 = heVar2;
            }
            if (i6 != 0) {
                sb1Var3 = rb1.b;
                i14 = i8;
            } else {
                i14 = i8;
                sb1Var3 = sb1Var;
            }
            if (i14 != 0) {
                f2 = 1.0f;
            }
            if (i11 != 0) {
                tv0Var3 = null;
            } else {
                tv0Var3 = tv0Var;
            }
            awVar = e01.a;
            if (str != null) {
                ux2Var.W(1899222916);
                if ((i13 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK2 = ux2Var.K();
                if (z2) {
                    objK2 = new fy(str, (byte) 12);
                    ux2Var.g0(objK2);
                } else {
                    objK2 = new fy(str, (byte) 12);
                    ux2Var.g0(objK2);
                }
                fs4VarA = cp6.a(fs4VarA, false, (Function1) objK2);
                ux2Var.p(false);
            } else {
                ux2Var.W(1899381698);
                ux2Var.p(false);
            }
            fs4 fs4VarA9 = androidx.compose.ui.draw.a.a(iq8.k(fs4Var2.f(fs4VarA)), ud5Var, heVar4, sb1Var3, f2, tv0Var3, 2);
            objK = ux2Var.K();
            if (objK == awVar) {
                objK = ei.h;
                ux2Var.g0(objK);
            }
            do4 do4Var8 = (do4) objK;
            int iHashCode8 = Long.hashCode(ux2Var.T);
            fs4 fs4VarS8 = uf0.s(ux2Var, fs4VarA9);
            yj5 yj5VarL8 = ux2Var.l();
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4Var8, d82.v, ux2Var);
            o67.n(yj5VarL8, d82.u, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS8, d82.t, ux2Var);
            o67.n(Integer.valueOf(iHashCode8), d82.w, ux2Var);
            ux2Var.p(true);
            fs4Var3 = fs4Var2;
            heVar3 = heVar4;
            sb1Var2 = sb1Var3;
            tv0Var2 = tv0Var3;
        } else {
            ux2Var.Q();
            fs4Var3 = fs4Var2;
            heVar3 = heVar2;
            sb1Var2 = sb1Var;
            tv0Var2 = tv0Var;
        }
        f3 = f2;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.de3
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qs1.l(ud5Var, str, fs4Var3, heVar3, sb1Var2, f3, tv0Var2, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final long m(int i) {
        long j = ((long) i) << 32;
        int i2 = xw3.O;
        return j;
    }

    public static final void n(final b84 b84Var, final j74 j74Var, final j74 j74Var2, final Function1 function1, final Function1 function2, final fs4 fs4Var, final w44 w44Var, final nd5 nd5Var, final p74 p74Var, final k74 k74Var, final qk1 qk1Var, final c74 c74Var, final r74 r74Var, final xl1 xl1Var, final bm1 bm1Var, final jw2 jw2Var, final String str, final li liVar, ux2 ux2Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        ux2 ux2Var2;
        f74 f74Var;
        int i8;
        Function1 function3;
        boolean z;
        boolean z2;
        ux2 ux2Var3 = ux2Var;
        function1.getClass();
        function2.getClass();
        ux2Var3.Y(-1919376111);
        if ((i & 6) == 0) {
            i4 = i | (ux2Var3.f(b84Var) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ux2Var3.f(j74Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ux2Var3.f(j74Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ux2Var3.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ux2Var3.h(function2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= ux2Var3.f(fs4Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= ux2Var3.f(w44Var) ? 1048576 : 524288;
        }
        int i9 = i4 | 12582912;
        if ((i & 100663296) == 0) {
            i9 |= ux2Var3.f(nd5Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= ux2Var3.f(p74Var) ? 536870912 : 268435456;
        }
        int i10 = i9;
        if ((i2 & 6) == 0) {
            i5 = i2 | (ux2Var3.f(k74Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= ux2Var3.f(qk1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ux2Var3.d(0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= ux2Var3.d(c74Var == null ? -1 : c74Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= ux2Var3.d(r74Var.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= ux2Var3.d(0) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= ux2Var3.f(xl1Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= ux2Var3.f(bm1Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= ux2Var3.h(null) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= ux2Var3.h(null) ? 536870912 : 268435456;
        }
        int i11 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (ux2Var3.h(null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= ux2Var3.h(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= ux2Var3.h(null) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= ux2Var3.h(null) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= ux2Var3.h(jw2Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= ux2Var3.f(str) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= ux2Var3.f(liVar) ? 1048576 : 524288;
        }
        int i12 = i6;
        if (ux2Var3.N(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i12 & 599187) == 599186) ? false : true)) {
            ux2Var3.S();
            if ((i & 1) != 0 && !ux2Var3.x()) {
                ux2Var3.Q();
            }
            ux2Var3.q();
            List list = b84Var != null ? b84Var.a : null;
            if (list == null) {
                list = ea2.m;
            }
            int i13 = i11 & 896;
            boolean z3 = i13 == 256;
            Object objK = ux2Var3.K();
            List list2 = list;
            g74 g74Var = g74.m;
            aw awVar = e01.a;
            if (z3 || objK == awVar) {
                int iOrdinal = g74Var.ordinal();
                if (iOrdinal == 0) {
                    objK = vb8.a(null, null, 2047);
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return;
                    }
                    objK = vb8.a(new pd5(16.0f, 10.0f, 16.0f, 10.0f), new pd5(16.0f, 8.0f, 16.0f, 8.0f), 2040);
                }
                ux2Var3.g0(objK);
            }
            zl1 zl1Var = (zl1) objK;
            boolean z4 = i13 == 256;
            Object objK2 = ux2Var3.K();
            if (z4 || objK2 == awVar) {
                k74 k74Var2 = vb8.a;
                objK2 = new yl1();
                ux2Var3.g0(objK2);
            }
            yl1 yl1Var = (yl1) objK2;
            boolean z5 = i13 == 256;
            Object objK3 = ux2Var3.K();
            if (z5 || objK3 == awVar) {
                int iOrdinal2 = g74Var.ordinal();
                if (iOrdinal2 == 0) {
                    objK3 = vb8.b(null, 255);
                } else {
                    if (iOrdinal2 != 1) {
                        gk0.s();
                        return;
                    }
                    objK3 = vb8.b(sf6.a(8.0f), 253);
                }
                ux2Var3.g0(objK3);
            }
            am1 am1Var = (am1) objK3;
            int i14 = ((i11 >> 15) & 112) | 6 | ((i11 >> 9) & 57344);
            k74 k74Var3 = vb8.a;
            xl1Var.getClass();
            boolean zF = ux2Var3.f(zl1Var) | ((((i14 & 112) ^ 48) > 32 && ux2Var3.f(xl1Var)) || (i14 & 48) == 32) | ux2Var3.f(yl1Var) | ((((i14 & 57344) ^ 24576) > 16384 && ux2Var3.f(bm1Var)) || (i14 & 24576) == 16384) | ux2Var3.f(am1Var);
            Object objK4 = ux2Var3.K();
            if (zF || objK4 == awVar) {
                i7 = 2048;
                f74 f74Var2 = new f74(xl1Var, zl1Var, yl1Var, bm1Var, am1Var);
                ux2Var3.g0(f74Var2);
                objK4 = f74Var2;
            } else {
                i7 = 2048;
            }
            f74 f74Var3 = (f74) objK4;
            boolean z6 = (r17 & 234881024) == 67108864;
            Object objK5 = ux2Var3.K();
            if (z6 || objK5 == awVar) {
                ux2Var3.g0(null);
                objK5 = null;
            }
            Function1 function4 = (Function1) objK5;
            int i15 = i10 & 57344;
            boolean z7 = i15 == 16384;
            Object objK6 = ux2Var3.K();
            if (z7 || objK6 == awVar) {
                objK6 = new jb(function2, (byte) 13);
                ux2Var3.g0(objK6);
            }
            Function1 function5 = (Function1) objK6;
            int i16 = i10 & 7168;
            boolean z8 = i16 == i7;
            Object objK7 = ux2Var3.K();
            byte b2 = 14;
            if (z8 || objK7 == awVar) {
                objK7 = new jb(function1, b2);
                ux2Var3.g0(objK7);
            }
            int i17 = r17 << 3;
            int i18 = i10 >> 6;
            int i19 = i12 << 6;
            int i20 = r17 >> 3;
            io1.k(list2, f74Var3, au8.s(fs4Var, qk1Var.a, kh.V), c74Var, r74Var, p74Var, k74Var, nd5Var, w44Var, function4, function5, (Function1) objK7, liVar, ux2Var3, (4193280 & i17) | (i18 & 29360128) | ((r17 << 24) & 234881024) | ((i10 << 3) & 1879048192), ((i10 >> 18) & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i20 & 234881024), (i12 >> 18) & 14);
            if (j74Var == null || jw2Var == null) {
                ux2Var2 = ux2Var3;
                f74Var = f74Var3;
                i8 = 6;
                function3 = null;
                z = false;
                z2 = true;
                ux2Var2.W(-1229710639);
                ux2Var2.p(false);
            } else {
                ux2Var3.W(-1229979719);
                boolean z9 = i16 == 2048;
                Object objK8 = ux2Var3.K();
                if (z9 || objK8 == awVar) {
                    objK8 = new qv1(function1, b2);
                    ux2Var3.g0(objK8);
                }
                ux2Var2 = ux2Var3;
                f74Var = f74Var3;
                i8 = 6;
                z = false;
                z2 = true;
                function3 = null;
                p(j74Var, f74Var, qk1Var, str, jw2Var, (Function0) objK8, ux2Var2, ((i10 >> 3) & 14) | (i17 & 896) | ((i12 >> 6) & 7168) | (i12 & 57344));
                ux2Var2.p(false);
            }
            if (j74Var2 != null) {
                ux2Var2.W(-1229666960);
                boolean z10 = i15 == 16384 ? z2 : z;
                Object objK9 = ux2Var2.K();
                if (z10 || objK9 == awVar) {
                    objK9 = new qv1(function2, (byte) 15);
                    ux2Var2.g0(objK9);
                }
                ux2Var2.W(-1979321140);
                xy6 xy6VarR = yo1.R(function3, ux2Var2, i8, 2);
                ux2Var2.p(z);
                ux2Var3 = ux2Var;
                yo1.j(j74Var2, (Function0) objK9, f74Var, null, k74Var, xy6VarR, null, null, ux2Var3, (i18 & 14) | (i20 & 57344) | ((i11 << 15) & 458752) | (i11 & 1879048192));
                ux2Var3.p(z);
            } else {
                ux2Var3 = ux2Var2;
                ux2Var3.W(-1229296975);
                ux2Var3.p(z);
            }
        } else {
            ux2Var3.Q();
        }
        j56 j56VarR = ux2Var3.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.cy6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    int iY3 = yo1.Y(i3);
                    qs1.n(b84Var, j74Var, j74Var2, function1, function2, fs4Var, w44Var, nd5Var, p74Var, k74Var, qk1Var, c74Var, r74Var, xl1Var, bm1Var, jw2Var, str, liVar, (ux2) obj, iY, iY2, iY3);
                    return f88.a;
                }
            };
        }
    }

    public static final void o(final b84 b84Var, final fs4 fs4Var, w44 w44Var, final nd5 nd5Var, final p74 p74Var, k74 k74Var, final qk1 qk1Var, c74 c74Var, final r74 r74Var, final xl1 xl1Var, bm1 bm1Var, jw2 jw2Var, String str, li liVar, ux2 ux2Var, final int i) {
        int i2;
        fs4 fs4Var2;
        p74 p74Var2;
        final w44 w44Var2;
        final k74 k74Var2;
        final c74 c74Var2;
        final bm1 bm1Var2;
        final jw2 jw2Var2;
        final String str2;
        final li liVar2;
        int i3;
        bm1 bm1VarB;
        li liVarB;
        c74 c74Var3;
        k74 k74Var3;
        jw2 jw2Var3;
        int i4;
        w44 w44Var3;
        int i5;
        String str3;
        ux2Var.Y(902590939);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(b84Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 32 : 16;
        } else {
            fs4Var2 = fs4Var;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(nd5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            p74Var2 = p74Var;
            i2 |= ux2Var.f(p74Var2) ? 16384 : 8192;
        } else {
            p74Var2 = p74Var;
        }
        if ((i & 196608) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(qk1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ux2Var.d(0) ? 8388608 : 4194304;
        }
        int i6 = i2 | 100663296;
        if ((805306368 & i) == 0) {
            i6 |= ux2Var.d(r74Var.ordinal()) ? 536870912 : 268435456;
        }
        int i7 = (ux2Var.f(xl1Var) ? 32 : 16) | 920349830;
        if (ux2Var.N(i6 & 1, ((i6 & 306783379) == 306783378 && (306783379 & i7) == 306783378) ? false : true)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                w44 w44VarA = z44.a(0, 0, ux2Var, 3);
                k74 k74Var4 = vb8.a;
                i3 = i6 & (-459649);
                bm1VarB = mj4.b(ux2Var);
                yy0 yy0VarO = au8.O(2010472210, new pj(qk1Var, (byte) 3), ux2Var);
                liVarB = kc5.b(ux2Var);
                c74Var3 = c74.m;
                k74Var3 = k74Var4;
                jw2Var3 = yy0VarO;
                i4 = i7 & (-897);
                w44Var3 = w44VarA;
                i5 = 196608;
                str3 = "OK";
            } else {
                ux2Var.Q();
                i3 = i6 & (-459649);
                k74Var3 = k74Var;
                bm1VarB = bm1Var;
                jw2Var3 = jw2Var;
                str3 = str;
                liVarB = liVar;
                i4 = i7 & (-897);
                i5 = 196608;
                w44Var3 = w44Var;
                c74Var3 = c74Var;
            }
            ux2Var.q();
            int i8 = i5;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(null);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(null);
                ux2Var.g0(objK2);
            }
            px4 px4Var2 = (px4) objK2;
            j74 j74Var = (j74) px4Var.getValue();
            j74 j74Var2 = (j74) px4Var2.getValue();
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = new ts6(px4Var, (byte) 4);
                ux2Var.g0(objK3);
            }
            Function1 function1 = (Function1) objK3;
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = new ts6(px4Var2, (byte) 5);
                ux2Var.g0(objK4);
            }
            int i9 = i3 << 15;
            n(b84Var, j74Var, j74Var2, function1, (Function1) objK4, fs4Var2, w44Var3, nd5Var, p74Var2, k74Var3, qk1Var, c74Var3, r74Var, xl1Var, bm1VarB, jw2Var3, str3, liVarB, ux2Var, (i3 & 14) | 27648 | ((i3 << 12) & 458752) | (234881024 & i9) | (i9 & 1879048192), ((i3 >> 15) & 65534) | i8 | ((i4 << 15) & 3670016) | 905969664, 224694);
            w44Var2 = w44Var3;
            k74Var2 = k74Var3;
            c74Var2 = c74Var3;
            bm1Var2 = bm1VarB;
            jw2Var2 = jw2Var3;
            str2 = str3;
            liVar2 = liVarB;
        } else {
            ux2Var.Q();
            w44Var2 = w44Var;
            k74Var2 = k74Var;
            c74Var2 = c74Var;
            bm1Var2 = bm1Var;
            jw2Var2 = jw2Var;
            str2 = str;
            liVar2 = liVar;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.by6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    qs1.o(b84Var, fs4Var, w44Var2, nd5Var, p74Var, k74Var2, qk1Var, c74Var2, r74Var, xl1Var, bm1Var2, jw2Var2, str2, liVar2, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void p(j74 j74Var, f74 f74Var, qk1 qk1Var, String str, jw2 jw2Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        j74Var.getClass();
        function0.getClass();
        ux2Var.Y(-537064783);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(j74Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(f74Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(qk1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(jw2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.h(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            g68.c(function0, new a12(3), au8.O(1975290362, new ay6(qk1Var, f74Var, im3.W(ux2Var), function0, jw2Var, j74Var, str), ux2Var), ux2Var, ((i3 >> 15) & 14) | 432);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new nx(j74Var, f74Var, qk1Var, str, jw2Var, function0, i);
        }
    }

    public static final void q(Function0 function0, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        fs4 fs4Var3;
        int i2;
        xy6 xy6Var3;
        function0.getClass();
        ux2Var.Y(-1131973348);
        byte b2 = 2;
        int i3 = i | (ux2Var.h(function0) ? 4 : 2) | 176;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
                i2 = i3 & (-897);
                xy6Var3 = xy6VarR;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                i2 = i3 & (-897);
                xy6Var3 = xy6Var;
            }
            ux2Var.q();
            fs4 fs4Var4 = fs4Var3;
            yo1.k(function0, fs4Var4, xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-2032757890, new k80(function0, b2), ux2Var), ux2Var, i2 & 1022, 3072, 8184);
            xy6Var2 = xy6Var3;
            fs4Var2 = fs4Var4;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l80(function0, fs4Var2, xy6Var2, i, (byte) 1);
        }
    }

    public static final void r(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        fs4 fs4Var2;
        ux2Var.Y(586938923);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            fs4Var2 = cs4.b;
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), 16.0f, 16.0f);
            boolean z = (i3 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new or(function0, (byte) 3);
                ux2Var.g0(objK);
            }
            yo1.i(0, 510, (Function1) objK, null, null, null, null, ux2Var, null, fs4VarC, null, false);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a20(function0, fs4Var2, i, b2);
        }
    }

    public static final void s(boolean z, fs4 fs4Var, ux2 ux2Var, int i) {
        boolean z2;
        ux2 ux2Var2;
        ux2Var.Y(1470664993);
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            z2 = z;
            ux2Var2 = ux2Var;
            fm7.a(m77.z(R.string.tv_options_PrivacyPolicy_link, ux2Var), m77.z(R.string.web_view_error, ux2Var), cs4Var, new dm7(62), z2, null, "TVTA-settings-privacyPolicy", ux2Var2, 1576320 | ((i2 << 12) & 57344), 32);
            fs4Var = cs4Var;
        } else {
            z2 = z;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z2, fs4Var, i, (byte) 5);
        }
    }

    public static final void t(q37 q37Var, fs4 fs4Var, ux2 ux2Var, int i) {
        q37Var.getClass();
        ux2Var.Y(-1318052635);
        int i2 = i | 48;
        byte b2 = 0;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            n37.b(q37Var, e8.j, ux2Var, 438);
            fs4Var = cs4.b;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f06(q37Var, fs4Var, i, b2);
        }
    }

    public static final v56 u(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new v56(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final v56 v(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new v56(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0413  */
    /* JADX WARN: Code duplicated, block: B:160:0x042d  */
    /* JADX WARN: Code duplicated, block: B:166:0x044a  */
    /* JADX WARN: Code duplicated, block: B:169:0x045d  */
    /* JADX WARN: Code duplicated, block: B:170:0x046a  */
    /* JADX WARN: Code duplicated, block: B:173:0x048e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0492  */
    /* JADX WARN: Code duplicated, block: B:177:0x049c  */
    /* JADX WARN: Code duplicated, block: B:183:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:187:0x0506  */
    /* JADX WARN: Code duplicated, block: B:191:0x0520  */
    /* JADX WARN: Code duplicated, block: B:194:0x0533  */
    /* JADX WARN: Code duplicated, block: B:197:0x056b  */
    /* JADX WARN: Code duplicated, block: B:200:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:203:0x05be  */
    /* JADX WARN: Code duplicated, block: B:205:0x05e0  */
    public static final void w(SupportSession supportSession, it6 it6Var, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Object next;
        boolean z;
        aw awVar;
        aw awVar2;
        boolean z2;
        boolean zF;
        Object objK;
        boolean zF2;
        Object objK2;
        Object objK3;
        px4 px4Var;
        yy0 yy0Var;
        Object objK4;
        px4 px4Var2;
        boolean z3;
        boolean zF3;
        Object objK5;
        boolean zF4;
        Object objK6;
        Object objK7;
        Object objK8;
        int i3;
        boolean zF5;
        Object objK9;
        ux2 ux2Var2 = ux2Var;
        supportSession.getClass();
        it6Var.getClass();
        String str = it6Var.d;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        ux2Var2.Y(-1326864996);
        int i4 = 2;
        byte b2 = 16;
        int i5 = i | (ux2Var2.h(supportSession) ? 4 : 2) | (ux2Var2.h(it6Var) ? 32 : 16) | (ux2Var2.f(list) ? 256 : 128) | (ux2Var2.h(function1) ? 2048 : 1024) | (ux2Var2.h(function2) ? 16384 : 8192) | (ux2Var2.h(function3) ? 131072 : 65536) | (ux2Var2.h(function4) ? 1048576 : 524288);
        if (ux2Var2.N(i5 & 1, (4793491 & i5) != 4793490)) {
            Object objK10 = ux2Var2.K();
            aw awVar3 = e01.a;
            hc1 hc1Var = null;
            if (objK10 == awVar3) {
                objK10 = new l5(i4, hc1Var, b2);
                ux2Var2.g0(objK10);
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK10, ux2Var2);
            Object objK11 = ux2Var2.K();
            if (objK11 == awVar3) {
                objK11 = new sq2();
                ux2Var2.g0(objK11);
            }
            sq2 sq2Var = (sq2) objK11;
            Object objK12 = ux2Var2.K();
            if (objK12 == awVar3) {
                objK12 = new sq2();
                ux2Var2.g0(objK12);
            }
            sq2 sq2Var2 = (sq2) objK12;
            Object objK13 = ux2Var2.K();
            if (objK13 == awVar3) {
                objK13 = new sq2();
                ux2Var2.g0(objK13);
            }
            sq2 sq2Var3 = (sq2) objK13;
            Object[] objArr = new Object[0];
            Object objK14 = ux2Var2.K();
            if (objK14 == awVar3) {
                objK14 = new oq6((byte) 21);
                ux2Var2.g0(objK14);
            }
            px4 px4Var3 = (px4) zu1.L(objArr, (Function0) objK14, ux2Var2, 48);
            Object objK15 = ux2Var2.K();
            if (objK15 == awVar3) {
                objK15 = (xs6) px4Var3.getValue();
                ux2Var2.g0(objK15);
            }
            xs6 xs6Var = (xs6) objK15;
            Object objK16 = ux2Var2.K();
            if (objK16 == awVar3) {
                objK16 = h57.p(Boolean.TRUE);
                ux2Var2.g0(objK16);
            }
            px4 px4Var4 = (px4) objK16;
            Object objK17 = ux2Var2.K();
            if (objK17 == awVar3) {
                objK17 = h57.p(null);
                ux2Var2.g0(objK17);
            }
            px4 px4Var5 = (px4) objK17;
            Object[] objArr2 = new Object[0];
            Object objK18 = ux2Var2.K();
            if (objK18 == awVar3) {
                objK18 = new oq6((byte) 25);
                ux2Var2.g0(objK18);
            }
            px4 px4Var6 = (px4) zu1.L(objArr2, (Function0) objK18, ux2Var2, 48);
            Integer num = it6Var.g;
            int iIntValue = num != null ? num.intValue() : supportSession.getGroupId();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = i5;
                    next = null;
                    break;
                }
                next = it.next();
                Integer numA = bt1.A((l33) next);
                i2 = i5;
                if (numA != null && numA.intValue() == iIntValue) {
                    break;
                } else {
                    i5 = i2;
                }
            }
            l33 l33Var = (l33) next;
            Object objK19 = ux2Var2.K();
            if (objK19 == awVar3) {
                objK19 = new aj(xs6Var, sq2Var, sq2Var2, sq2Var3, px4Var4, null, (byte) 13);
                ux2Var2.g0(objK19);
            }
            ck3.i(f88Var, (hw2) objK19, ux2Var2);
            xs6 xs6Var2 = (xs6) px4Var5.getValue();
            boolean zF6 = ux2Var2.f(px4Var3);
            Object objK20 = ux2Var2.K();
            byte b3 = 23;
            if (zF6 || objK20 == awVar3) {
                objK20 = new ko2(px4Var5, px4Var3, null, b3);
                ux2Var2.g0(objK20);
            }
            ck3.i(xs6Var2, (hw2) objK20, ux2Var2);
            fs4 fs4VarA = mo8.A(fs4Var, mo8.Y);
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK21 = ux2Var2.K();
            if (objK21 == awVar3) {
                objK21 = ck3.w(ux2Var2);
                ux2Var2.g0(objK21);
            }
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(ka0.B(o77.t(fs4VarA, hk6VarW, (me1) objK21), 16.0f), "TVTA-devicesScreen-sessionInfoScreen-editContent");
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA2);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String name = supportSession.getName();
            if (name == null || ub7.b0(name)) {
                name = null;
            }
            if (name == null) {
                z = false;
                name = to7.m(ux2Var2, 1672553619, R.string.session_default_name, ux2Var2, false);
            } else {
                z = false;
                ux2Var2.W(1672552255);
                ux2Var2.p(false);
            }
            cs4 cs4Var = cs4.b;
            x((i2 & 14) | 384, supportSession, name, ux2Var2, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7));
            String strZ = m77.z(R.string.session_default_name, ux2Var2);
            boolean z4 = z;
            boolean z5 = it6Var.h;
            boolean z6 = (((Boolean) px4Var4.getValue()).booleanValue() && xs6Var == null) ? z4 : true;
            yy0 yy0Var2 = (it6Var.h || !ub7.b0(str)) ? null : xk0.k;
            boolean zBooleanValue = ((Boolean) px4Var4.getValue()).booleanValue();
            boolean zF7 = ux2Var2.f(px4Var3);
            Object objK22 = ux2Var2.K();
            yy0 yy0Var3 = yy0Var2;
            byte b4 = 12;
            if (zF7 || objK22 == awVar3) {
                objK22 = new j44(px4Var3, b4);
                ux2Var2.g0(objK22);
            }
            Function0 function0 = (Function0) objK22;
            boolean zF8 = ux2Var2.f(px4Var3);
            Object objK23 = ux2Var2.K();
            if (zF8 || objK23 == awVar3) {
                objK23 = new va(px4Var3, (byte) 28);
                ux2Var2.g0(objK23);
            }
            Function1 function5 = (Function1) objK23;
            Object objK24 = ux2Var2.K();
            if (objK24 == awVar3) {
                objK24 = new va(px4Var5, (byte) 29);
                ux2Var2.g0(objK24);
            }
            up4 up4Var = new up4(zBooleanValue, function5, xs6.m, (Function1) objK24, function0);
            fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionEditScreen-name");
            boolean z7 = it6Var.b;
            Integer numValueOf = Integer.valueOf(R.string.session_info_edit_name_support_text_count);
            Object objK25 = ux2Var2.K();
            if (objK25 == awVar3) {
                objK25 = new oq6((byte) 22);
                ux2Var2.g0(objK25);
            }
            int i6 = i2 >> 6;
            byte b5 = 1;
            lq1.b(str, function1, false, z5, z6, sq2Var, up4Var, fs4VarA3, false, z7, numValueOf, strZ, yy0Var3, (Function0) objK25, null, null, null, null, ux2Var, (i6 & 112) | 12779904, 3072, 246016);
            String str2 = l33Var != null ? l33Var.b : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String strZ2 = m77.z(R.string.select_a_group, ux2Var);
            boolean z8 = !list.isEmpty();
            boolean z9 = (it6Var.b || list.isEmpty()) ? false : true;
            fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            boolean zF9 = ux2Var.f(px4Var6);
            Object objK26 = ux2Var.K();
            if (zF9) {
                awVar = awVar3;
            } else {
                awVar = awVar3;
                if (objK26 == awVar) {
                }
                awVar2 = awVar;
                ds1.w(str3, strZ2, z8, false, (Function0) objK26, fs4VarF, z9, "TVTA-devicesScreen-sessionEditScreen-group-input", null, null, ux2Var, 12782592, 768);
                String strZ3 = m77.z(R.string.session_info_end_user_email, ux2Var);
                String str4 = it6Var.e;
                boolean z10 = it6Var.i;
                if (((Boolean) px4Var4.getValue()).booleanValue() || xs6Var != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zBooleanValue2 = ((Boolean) px4Var4.getValue()).booleanValue();
                zF = ux2Var.f(px4Var3);
                objK = ux2Var.K();
                if (zF || objK == awVar2) {
                    objK = new j44(px4Var3, (byte) 9);
                    ux2Var.g0(objK);
                }
                Function0 function6 = (Function0) objK;
                zF2 = ux2Var.f(px4Var3);
                objK2 = ux2Var.K();
                if (zF2 || objK2 == awVar2) {
                    objK2 = new ts6(px4Var3, (byte) 0);
                    ux2Var.g0(objK2);
                }
                Function1 function7 = (Function1) objK2;
                objK3 = ux2Var.K();
                if (objK3 == awVar2) {
                    px4Var = px4Var5;
                    objK3 = new ts6(px4Var, b5);
                    ux2Var.g0(objK3);
                } else {
                    px4Var = px4Var5;
                }
                up4 up4Var2 = new up4(zBooleanValue2, function7, xs6.n, (Function1) objK3, function6);
                fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionEditScreen-email");
                if (it6Var.i) {
                    yy0Var = null;
                } else {
                    yy0Var = xk0.l;
                }
                boolean z11 = it6Var.b;
                objK4 = ux2Var.K();
                if (objK4 == awVar2) {
                    objK4 = new oq6((byte) 23);
                    ux2Var.g0(objK4);
                }
                px4Var2 = px4Var;
                lq1.b(str4, function2, false, z10, z2, sq2Var2, up4Var2, fs4VarA4, false, z11, null, strZ3, yy0Var, (Function0) objK4, null, null, null, null, ux2Var, ((i2 >> 9) & 112) | 12779904, 3072, 247040);
                String strZ4 = m77.z(R.string.description_edit_title, ux2Var);
                String str5 = it6Var.f;
                boolean z12 = it6Var.j;
                if (((Boolean) px4Var4.getValue()).booleanValue() || xs6Var != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean zBooleanValue3 = ((Boolean) px4Var4.getValue()).booleanValue();
                zF3 = ux2Var.f(px4Var3);
                objK5 = ux2Var.K();
                if (zF3 || objK5 == awVar2) {
                    objK5 = new j44(px4Var3, (byte) 10);
                    ux2Var.g0(objK5);
                }
                Function0 function8 = (Function0) objK5;
                zF4 = ux2Var.f(px4Var3);
                objK6 = ux2Var.K();
                if (zF4 || objK6 == awVar2) {
                    objK6 = new ts6(px4Var3, (byte) 2);
                    ux2Var.g0(objK6);
                }
                Function1 function9 = (Function1) objK6;
                objK7 = ux2Var.K();
                if (objK7 == awVar2) {
                    objK7 = new ts6(px4Var2, (byte) 3);
                    ux2Var.g0(objK7);
                }
                up4 up4Var3 = new up4(zBooleanValue3, function9, xs6.f2547o, (Function1) objK7, function8);
                fs4 fs4VarA5 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionEditScreen-description");
                boolean z13 = it6Var.b;
                Integer numValueOf2 = Integer.valueOf(R.string.session_info_edit_description_support_text_count);
                objK8 = ux2Var.K();
                if (objK8 == awVar2) {
                    objK8 = new oq6((byte) 24);
                    ux2Var.g0(objK8);
                }
                Function0 function10 = (Function0) objK8;
                i3 = i2 >> 12;
                lq1.b(str5, function3, true, z12, z3, sq2Var3, up4Var3, fs4VarA5, false, z13, numValueOf2, strZ4, null, function10, null, null, null, null, ux2Var, (i3 & 112) | 12779904, 3072, 250112);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                if (((Boolean) px4Var6.getValue()).booleanValue()) {
                    ux2Var2.W(-2043981449);
                    zF5 = ux2Var2.f(px4Var6);
                    objK9 = ux2Var2.K();
                    if (zF5 || objK9 == awVar2) {
                        objK9 = new j44(px4Var6, (byte) 11);
                        ux2Var2.g0(objK9);
                    }
                    j(list, l33Var, function4, (Function0) objK9, null, ux2Var2, (i6 & 14) | (i3 & 896));
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-2043751770);
                    ux2Var2.p(false);
                }
            }
            objK26 = new j44(px4Var6, (byte) 8);
            ux2Var.g0(objK26);
            awVar2 = awVar;
            ds1.w(str3, strZ2, z8, false, (Function0) objK26, fs4VarF, z9, "TVTA-devicesScreen-sessionEditScreen-group-input", null, null, ux2Var, 12782592, 768);
            String strZ5 = m77.z(R.string.session_info_end_user_email, ux2Var);
            String str6 = it6Var.e;
            boolean z14 = it6Var.i;
            if (((Boolean) px4Var4.getValue()).booleanValue()) {
                z2 = true;
            } else {
                z2 = true;
            }
            boolean zBooleanValue4 = ((Boolean) px4Var4.getValue()).booleanValue();
            zF = ux2Var.f(px4Var3);
            objK = ux2Var.K();
            if (zF) {
                objK = new j44(px4Var3, (byte) 9);
                ux2Var.g0(objK);
            } else {
                objK = new j44(px4Var3, (byte) 9);
                ux2Var.g0(objK);
            }
            Function0 function11 = (Function0) objK;
            zF2 = ux2Var.f(px4Var3);
            objK2 = ux2Var.K();
            if (zF2) {
                objK2 = new ts6(px4Var3, (byte) 0);
                ux2Var.g0(objK2);
            } else {
                objK2 = new ts6(px4Var3, (byte) 0);
                ux2Var.g0(objK2);
            }
            Function1 function12 = (Function1) objK2;
            objK3 = ux2Var.K();
            if (objK3 == awVar2) {
                px4Var = px4Var5;
                objK3 = new ts6(px4Var, b5);
                ux2Var.g0(objK3);
            } else {
                px4Var = px4Var5;
            }
            up4 up4Var4 = new up4(zBooleanValue4, function12, xs6.n, (Function1) objK3, function11);
            fs4 fs4VarA6 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionEditScreen-email");
            if (it6Var.i) {
                yy0Var = xk0.l;
            } else {
                yy0Var = null;
            }
            boolean z15 = it6Var.b;
            objK4 = ux2Var.K();
            if (objK4 == awVar2) {
                objK4 = new oq6((byte) 23);
                ux2Var.g0(objK4);
            }
            px4Var2 = px4Var;
            lq1.b(str6, function2, false, z14, z2, sq2Var2, up4Var4, fs4VarA6, false, z15, null, strZ5, yy0Var, (Function0) objK4, null, null, null, null, ux2Var, ((i2 >> 9) & 112) | 12779904, 3072, 247040);
            String strZ6 = m77.z(R.string.description_edit_title, ux2Var);
            String str7 = it6Var.f;
            boolean z16 = it6Var.j;
            if (((Boolean) px4Var4.getValue()).booleanValue()) {
                z3 = true;
            } else {
                z3 = true;
            }
            boolean zBooleanValue5 = ((Boolean) px4Var4.getValue()).booleanValue();
            zF3 = ux2Var.f(px4Var3);
            objK5 = ux2Var.K();
            if (zF3) {
                objK5 = new j44(px4Var3, (byte) 10);
                ux2Var.g0(objK5);
            } else {
                objK5 = new j44(px4Var3, (byte) 10);
                ux2Var.g0(objK5);
            }
            Function0 function13 = (Function0) objK5;
            zF4 = ux2Var.f(px4Var3);
            objK6 = ux2Var.K();
            if (zF4) {
                objK6 = new ts6(px4Var3, (byte) 2);
                ux2Var.g0(objK6);
            } else {
                objK6 = new ts6(px4Var3, (byte) 2);
                ux2Var.g0(objK6);
            }
            Function1 function14 = (Function1) objK6;
            objK7 = ux2Var.K();
            if (objK7 == awVar2) {
                objK7 = new ts6(px4Var2, (byte) 3);
                ux2Var.g0(objK7);
            }
            up4 up4Var5 = new up4(zBooleanValue5, function14, xs6.f2547o, (Function1) objK7, function13);
            fs4 fs4VarA7 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionEditScreen-description");
            boolean z17 = it6Var.b;
            Integer numValueOf3 = Integer.valueOf(R.string.session_info_edit_description_support_text_count);
            objK8 = ux2Var.K();
            if (objK8 == awVar2) {
                objK8 = new oq6((byte) 24);
                ux2Var.g0(objK8);
            }
            Function0 function15 = (Function0) objK8;
            i3 = i2 >> 12;
            lq1.b(str7, function3, true, z16, z3, sq2Var3, up4Var5, fs4VarA7, false, z17, numValueOf3, strZ6, null, function15, null, null, null, null, ux2Var, (i3 & 112) | 12779904, 3072, 250112);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            if (((Boolean) px4Var6.getValue()).booleanValue()) {
                ux2Var2.W(-2043981449);
                zF5 = ux2Var2.f(px4Var6);
                objK9 = ux2Var2.K();
                if (zF5) {
                    objK9 = new j44(px4Var6, (byte) 11);
                    ux2Var2.g0(objK9);
                } else {
                    objK9 = new j44(px4Var6, (byte) 11);
                    ux2Var2.g0(objK9);
                }
                j(list, l33Var, function4, (Function0) objK9, null, ux2Var2, (i6 & 14) | (i3 & 896));
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-2043751770);
                ux2Var2.p(false);
            }
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ue5(supportSession, it6Var, list, function1, function2, function3, function4, fs4Var, i, (byte) 3);
        }
    }

    public static final void x(int i, SupportSession supportSession, String str, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-145734546);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.h(supportSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            hi7 hi7Var = hi7.Size72dp;
            cs4 cs4Var = cs4.b;
            nv1.i(supportSession, hi7Var, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), ux2Var2, (i2 & 14) | 432);
            h72 h72Var = un4.a;
            qs7.b(str, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionEditScreen-title"), ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var)).b.f, ux2Var, ((i2 >> 3) & 14) | 48, 24960, 109560);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new us6(supportSession, str, fs4Var, i);
        }
    }

    public static final void y(i44 i44Var, Object obj, int i, Object obj2, ux2 ux2Var, int i2) {
        ux2Var.Y(1439843069);
        int i3 = (ux2Var.f(i44Var) ? 4 : 2) | i2 | (ux2Var.f(obj) ? 32 : 16) | (ux2Var.d(i) ? 256 : 128) | (ux2Var.f(obj2) ? 2048 : 1024);
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ((kh6) obj).c(obj2, au8.O(980966366, new p34(i, obj2, i44Var), ux2Var), ux2Var, 48);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci(i44Var, obj, i, obj2, i2);
        }
    }

    public void I(zi0 zi0Var, zi0 zi0Var2) {
    }

    public void U(zi0 zi0Var, Collection collection) {
        zi0Var.getClass();
        zi0Var.d0(collection);
    }

    public abstract void z(zi0 zi0Var);
}
