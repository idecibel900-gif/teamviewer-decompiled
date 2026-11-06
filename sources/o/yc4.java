package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yc4 implements ez3, r93, ex5, ef5 {
    public static final Object r = new Object();
    public static yc4 s;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2598o;
    public Object p;
    public Object q;

    public yc4(List list, xo xoVar, in1 in1Var, mr2 mr2Var, ot7 ot7Var, boolean z) {
        int i;
        xo xoVar2 = xoVar;
        ot7 ot7Var2 = ot7Var;
        this.m = xoVar2;
        this.n = list;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: o.yu4
            public final /* synthetic */ yc4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                Object obj = null;
                int i2 = 1;
                yc4 yc4Var = this.n;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) yc4Var.p;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fC = ((df5) obj2).a.c();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fC2 = ((df5) obj3).a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj2 = obj3;
                                        fC = fC2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        df5 df5Var = (df5) obj;
                        return Float.valueOf(df5Var != null ? df5Var.a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) yc4Var.p;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC3 = ((df5) obj4).a.u.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC4 = ((df5) obj5).a.u.c();
                                    if (Float.compare(fC3, fC4) < 0) {
                                        obj4 = obj5;
                                        fC3 = fC4;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        df5 df5Var2 = (df5) obj;
                        return Float.valueOf(df5Var2 != null ? df5Var2.a.u.c() : 0.0f);
                }
            }
        };
        l54 l54Var = l54.n;
        this.f2598o = ds1.X(l54Var, function0);
        final byte b2 = 1;
        this.q = ds1.X(l54Var, new Function0(this) { // from class: o.yu4
            public final /* synthetic */ yc4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                Object obj = null;
                int i2 = 1;
                yc4 yc4Var = this.n;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) yc4Var.p;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fC = ((df5) obj2).a.c();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fC2 = ((df5) obj3).a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj2 = obj3;
                                        fC = fC2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        df5 df5Var = (df5) obj;
                        return Float.valueOf(df5Var != null ? df5Var.a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) yc4Var.p;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC3 = ((df5) obj4).a.u.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC4 = ((df5) obj5).a.u.c();
                                    if (Float.compare(fC3, fC4) < 0) {
                                        obj4 = obj5;
                                        fC3 = fC4;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        df5 df5Var2 = (df5) obj;
                        return Float.valueOf(df5Var2 != null ? df5Var2.a.u.c() : 0.0f);
                }
            }
        });
        gf5 gf5Var = ot7Var2.b;
        xo xoVar3 = yo.a;
        ArrayList arrayList = xoVar2.p;
        String str = xoVar2.n;
        ea2 ea2Var = ea2.m;
        List listJ0 = arrayList != null ? lv0.J0(arrayList, new gj2((byte) 8)) : ea2Var;
        ArrayList arrayList2 = new ArrayList();
        kw kwVar = new kw();
        int size = listJ0.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            wo woVar = (wo) listJ0.get(i2);
            wo woVarA = wo.a(woVar, gf5Var.a((gf5) woVar.a), b, 14);
            Object obj = woVarA.a;
            int i4 = woVarA.c;
            int i5 = woVarA.b;
            while (i3 < i5 && !kwVar.isEmpty()) {
                wo woVar2 = (wo) kwVar.last();
                listJ0 = listJ0;
                int i6 = woVar2.c;
                ea2Var = ea2Var;
                Object obj2 = woVar2.a;
                if (i5 < i6) {
                    arrayList2.add(new wo(i3, i5, obj2));
                    i3 = i5;
                } else {
                    int i7 = size;
                    arrayList2.add(new wo(i3, i6, obj2));
                    i3 = woVar2.c;
                    while (!kwVar.isEmpty() && i3 == ((wo) kwVar.last()).c) {
                        kwVar.removeLast();
                    }
                    size = i7;
                }
            }
            List list2 = listJ0;
            ea2 ea2Var2 = ea2Var;
            int i8 = size;
            if (i3 < i5) {
                arrayList2.add(new wo(i3, i5, gf5Var));
                i3 = i5;
            }
            wo woVar3 = (wo) kwVar.g();
            if (woVar3 != null) {
                int i9 = woVar3.c;
                Object obj3 = woVar3.a;
                int i10 = woVar3.b;
                if (i10 == i5 && i9 == i4) {
                    kwVar.removeLast();
                    kwVar.addLast(new wo(i5, i4, ((gf5) obj3).a((gf5) obj)));
                } else if (i10 == i9) {
                    arrayList2.add(new wo(i10, i9, obj3));
                    kwVar.removeLast();
                    kwVar.addLast(new wo(i5, i4, obj));
                } else {
                    if (i9 < i4) {
                        yq4.f();
                        throw null;
                    }
                    kwVar.addLast(new wo(i5, i4, ((gf5) obj3).a((gf5) obj)));
                }
            } else {
                kwVar.addLast(new wo(i5, i4, obj));
            }
            i2++;
            listJ0 = list2;
            ea2Var = ea2Var2;
            size = i8;
            b = 0;
        }
        ea2 ea2Var3 = ea2Var;
        while (i3 <= str.length() && !kwVar.isEmpty()) {
            wo woVar4 = (wo) kwVar.last();
            Object obj4 = woVar4.a;
            int i11 = woVar4.c;
            arrayList2.add(new wo(i3, i11, obj4));
            while (!kwVar.isEmpty() && i11 == ((wo) kwVar.last()).c) {
                kwVar.removeLast();
            }
            i3 = i11;
        }
        if (i3 < str.length()) {
            arrayList2.add(new wo(i3, str.length(), gf5Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new wo(0, 0, gf5Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i12 = i;
        for (int size2 = arrayList2.size(); i12 < size2; size2 = size2) {
            wo woVar5 = (wo) arrayList2.get(i12);
            int i13 = woVar5.b;
            int i14 = woVar5.c;
            String strSubstring = i13 != i14 ? str.substring(i13, i14) : "";
            List listA = yo.a(xoVar2, i13, i14, new t2((byte) 28));
            xo xoVar4 = new xo(strSubstring, listA == null ? ea2Var3 : listA);
            gf5 gf5Var2 = (gf5) woVar5.a;
            if (gf5Var2.b == 0) {
                gf5Var2 = new gf5(gf5Var2.a, gf5Var.b, gf5Var2.c, gf5Var2.d, gf5Var2.e, gf5Var2.f, gf5Var2.g, gf5Var2.h, gf5Var2.i);
            }
            ot7 ot7Var3 = new ot7(ot7Var2.a, gf5Var.a(gf5Var2));
            List list3 = xoVar4.m;
            List list4 = list3 == null ? ea2Var3 : list3;
            List list5 = (List) this.n;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i15 = 0;
            while (i15 < size3) {
                wo woVar6 = (wo) list5.get(i15);
                int i16 = woVar6.b;
                gf5 gf5Var3 = gf5Var;
                int i17 = woVar6.c;
                if (yo.b(i13, i14, i16, i17)) {
                    if (i13 > i16 || i17 > i14) {
                        li3.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new wo(i16 - i13, i17 - i13, woVar6.a));
                }
                i15++;
                list5 = list5;
                gf5Var = gf5Var3;
            }
            arrayList3.add(new df5(new qj(strSubstring, ot7Var3, list4, arrayList4, mr2Var, in1Var, z), i13, i14));
            i12++;
            xoVar2 = xoVar;
            ot7Var2 = ot7Var;
            str = str;
        }
        this.p = arrayList3;
    }

    public static yc4 I(ContextWrapper contextWrapper) {
        yc4 yc4Var;
        synchronized (r) {
            try {
                yc4Var = s;
                if (yc4Var == null) {
                    yc4Var = new yc4(contextWrapper.getApplicationContext());
                    s = yc4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yc4Var;
    }

    public static int[] W(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            om2 om2Var = (om2) it.next();
            int i3 = om2Var.m;
            iArr[i2] = i3;
            sparseIntArray.append(i3, om2Var.n);
            i2++;
        }
        return iArr;
    }

    public static ArrayList u(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        nm2 nm2Var = new nm2();
        nm2Var.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(nm2Var);
            }
            arrayList.add((nm2) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(nm2Var);
            }
        }
        return arrayList;
    }

    public void A(int i) {
        long[] jArr = (long[]) this.p;
        if (jArr == null) {
            this.p = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.p = Arrays.copyOf((long[]) this.p, Math.max(jArr.length * 2, i));
        }
    }

    public void B(int i) {
        long[] jArr = (long[]) this.q;
        if (jArr == null) {
            this.q = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.q = Arrays.copyOf((long[]) this.q, Math.max(jArr.length * 2, i));
        }
    }

    public void C(int i, int i2, nm2 nm2Var, int i3, int i4, boolean z) {
        int i5;
        float f;
        int iMax;
        double d;
        double d2;
        lm2 lm2Var = (lm2) this.m;
        float f2 = nm2Var.j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = nm2Var.e)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        nm2Var.e = i4 + nm2Var.f;
        if (!z) {
            nm2Var.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < nm2Var.h) {
            int i8 = nm2Var.f1578o + i6;
            View viewC = lm2Var.c(i8);
            if (viewC == null || viewC.getVisibility() == 8) {
                f = f3;
                f4 = f4;
                z2 = z2;
            } else {
                mm2 mm2Var = (mm2) viewC.getLayoutParams();
                int flexDirection = lm2Var.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    boolean z3 = z2;
                    int measuredWidth = viewC.getMeasuredWidth();
                    long[] jArr = (long[]) this.q;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewC.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.q;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.n)[i8] || mm2Var.p() <= f) {
                        z2 = z3;
                    } else {
                        float fP = (mm2Var.p() * f4) + measuredWidth;
                        if (i6 == nm2Var.h - 1) {
                            fP += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fP);
                        if (iRound > mm2Var.y()) {
                            iRound = mm2Var.y();
                            ((boolean[]) this.n)[i8] = true;
                            nm2Var.j -= mm2Var.p();
                            z2 = true;
                        } else {
                            float f6 = (fP - iRound) + f5;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f5 = f6;
                                z2 = z3;
                            }
                            f6 = (float) d;
                            f5 = f6;
                            z2 = z3;
                        }
                        int iE = E(i2, mm2Var, nm2Var.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewC.measure(iMakeMeasureSpec, iE);
                        int measuredWidth2 = viewC.getMeasuredWidth();
                        int measuredHeight2 = viewC.getMeasuredHeight();
                        c0(i8, iMakeMeasureSpec, iE, viewC);
                        lm2Var.i(viewC, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, lm2Var.k(viewC) + mm2Var.l() + mm2Var.n() + measuredHeight);
                    nm2Var.e = mm2Var.s() + mm2Var.m() + measuredWidth + nm2Var.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewC.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.q;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewC.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.q;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.n)[i8] || mm2Var.p() <= f) {
                        f4 = f4;
                        z2 = z2;
                    } else {
                        float fP2 = (mm2Var.p() * f4) + measuredHeight3;
                        if (i6 == nm2Var.h - 1) {
                            fP2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fP2);
                        if (iRound2 > mm2Var.w()) {
                            iRound2 = mm2Var.w();
                            ((boolean[]) this.n)[i8] = true;
                            nm2Var.j -= mm2Var.p();
                            z2 = true;
                        } else {
                            float f7 = (fP2 - iRound2) + f5;
                            boolean z4 = z2;
                            double d4 = f7;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                f5 = f7;
                                z2 = z4;
                            }
                            f7 = (float) d2;
                            f5 = f7;
                            z2 = z4;
                        }
                        int iF = F(i, mm2Var, nm2Var.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewC.measure(iF, iMakeMeasureSpec2);
                        int measuredWidth4 = viewC.getMeasuredWidth();
                        int measuredHeight4 = viewC.getMeasuredHeight();
                        c0(i8, iF, iMakeMeasureSpec2, viewC);
                        lm2Var.i(viewC, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, lm2Var.k(viewC) + mm2Var.s() + mm2Var.m() + measuredWidth3);
                    nm2Var.e = mm2Var.l() + mm2Var.n() + measuredHeight3 + nm2Var.e;
                }
                nm2Var.g = Math.max(nm2Var.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == nm2Var.e) {
            return;
        }
        C(i, i2, nm2Var, i3, i4, true);
    }

    public void D(Function1 function1) {
        int i;
        synchronized (this.m) {
            try {
                zw4 zw4Var = (zw4) this.p;
                this.p = (zw4) this.q;
                this.q = zw4Var;
                yx yxVar = (yx) this.f2598o;
                do {
                    i = yxVar.get();
                } while (!yxVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = zw4Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    function1.invoke(zw4Var.f(i3));
                }
                zw4Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int E(int i, mm2 mm2Var, int i2) {
        lm2 lm2Var = (lm2) this.m;
        int iG = lm2Var.g(i, mm2Var.l() + mm2Var.n() + lm2Var.getPaddingBottom() + lm2Var.getPaddingTop() + i2, mm2Var.a());
        int size = View.MeasureSpec.getSize(iG);
        if (size > mm2Var.w()) {
            return View.MeasureSpec.makeMeasureSpec(mm2Var.w(), View.MeasureSpec.getMode(iG));
        }
        return size < mm2Var.t() ? View.MeasureSpec.makeMeasureSpec(mm2Var.t(), View.MeasureSpec.getMode(iG)) : iG;
    }

    public int F(int i, mm2 mm2Var, int i2) {
        lm2 lm2Var = (lm2) this.m;
        int iD = lm2Var.d(i, mm2Var.s() + mm2Var.m() + lm2Var.getPaddingRight() + lm2Var.getPaddingLeft() + i2, mm2Var.b());
        int size = View.MeasureSpec.getSize(iD);
        if (size > mm2Var.y()) {
            return View.MeasureSpec.makeMeasureSpec(mm2Var.y(), View.MeasureSpec.getMode(iD));
        }
        return size < mm2Var.i() ? View.MeasureSpec.makeMeasureSpec(mm2Var.i(), View.MeasureSpec.getMode(iD)) : iD;
    }

    public float G(int i, boolean z) {
        Layout layout = (Layout) this.m;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float H(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.m;
        if (!z2) {
            return G(i, z);
        }
        int iE = it1.E(layout, i, z2);
        int lineStart = layout.getLineStart(iE);
        int lineEnd = layout.getLineEnd(iE);
        if (i != lineStart && i != lineEnd) {
            return G(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return G(i, z);
        }
        int iJ = J(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(K(iJ))) == -1;
        int iO = O(lineEnd, lineStart);
        int iK = K(iJ);
        int i4 = lineStart - iK;
        int i5 = iO - iK;
        Bidi bidiO = o(iJ);
        Bidi bidiCreateLineBidi = bidiO != null ? bidiO.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iE) : layout.getLineRight(iE);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        l04[] l04VarArr = new l04[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            l04VarArr[i6] = new l04(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, l04VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (l04VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == l04VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iE);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(l04VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(l04VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iE);
        }
        int iO2 = i > iO ? O(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (l04VarArr[i9].b == iO2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == l04VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iE);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(l04VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(l04VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iE);
    }

    public int J(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.p;
        int iQ = qf0.q(arrayList, Integer.valueOf(i));
        int i2 = iQ < 0 ? -(iQ + 1) : iQ + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int K(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.p).get(i - 1)).intValue();
    }

    public void L(String str, String str2) {
        str2.getClass();
        nm nmVar = (nm) this.f2598o;
        nmVar.getClass();
        i67.t(str);
        i67.u(str2, str);
        nmVar.u(str);
        i67.h(nmVar, str, str2);
    }

    public void M(View view, nm2 nm2Var, int i, int i2, int i3, int i4) {
        mm2 mm2Var = (mm2) view.getLayoutParams();
        lm2 lm2Var = (lm2) this.m;
        int alignItems = lm2Var.getAlignItems();
        if (mm2Var.g() != -1) {
            alignItems = mm2Var.g();
        }
        int i5 = nm2Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (lm2Var.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - mm2Var.l(), i3, i6 - mm2Var.l());
                    return;
                }
                int measuredHeight = view.getMeasuredHeight();
                int iN = mm2Var.n() + measuredHeight + (i2 - i5);
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, iN, i3, mm2Var.n() + measuredHeight2 + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int iN2 = ((mm2Var.n() + (i5 - view.getMeasuredHeight())) - mm2Var.l()) / 2;
                if (lm2Var.getFlexWrap() != 2) {
                    int i7 = i2 + iN2;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iN2;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = lm2Var.getFlexWrap();
                int i9 = nm2Var.l;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), mm2Var.n());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), mm2Var.l());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (lm2Var.getFlexWrap() != 2) {
            view.layout(i, mm2Var.n() + i2, i3, mm2Var.n() + i4);
        } else {
            view.layout(i, i2 - mm2Var.l(), i3, i4 - mm2Var.l());
        }
    }

    public void N(View view, nm2 nm2Var, boolean z, int i, int i2, int i3, int i4) {
        mm2 mm2Var = (mm2) view.getLayoutParams();
        int alignItems = ((lm2) this.m).getAlignItems();
        if (mm2Var.g() != -1) {
            alignItems = mm2Var.g();
        }
        int i5 = nm2Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - mm2Var.s(), i2, ((i3 + i5) - view.getMeasuredWidth()) - mm2Var.s(), i4);
                    return;
                }
                int measuredWidth = view.getMeasuredWidth();
                view.layout(mm2Var.m() + measuredWidth + (i - i5), i2, mm2Var.m() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - mm2Var.s(), i2, i3 - mm2Var.s(), i4);
        } else {
            view.layout(mm2Var.m() + i, i2, mm2Var.m() + i3, i4);
        }
    }

    public int O(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.m).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((im3.t(cCharAt, 8192) < 0 || im3.t(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void P(String str, db6 db6Var) {
        str.getClass();
        if (str.length() <= 0) {
            hk0.g("method.isEmpty() == true");
            return;
        }
        if (db6Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                gk0.h(fx3.g("method ", str, " must have a request body."));
                return;
            }
        } else if (!it1.J(str)) {
            gk0.h(fx3.g("method ", str, " must not have a request body."));
            return;
        }
        this.n = str;
        this.p = db6Var;
    }

    public void Q(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (((HashMap) this.n)) {
            try {
                xc4 xc4Var = new xc4(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) ((HashMap) this.n).get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ((HashMap) this.n).put(broadcastReceiver, arrayList);
                }
                arrayList.add(xc4Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) ((HashMap) this.f2598o).get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        ((HashMap) this.f2598o).put(action, arrayList2);
                    }
                    arrayList2.add(xc4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void R() {
        AudioManager audioManager = (AudioManager) this.n;
        if (audioManager != null) {
            ye4.a("BTAudioHelperInternal", "resetBluetooth::stop Bluetooth sco");
            audioManager.clearCommunicationDevice();
            ((vk5) this.m).a();
            my.a.setValue(Boolean.FALSE);
        }
        this.q = null;
    }

    public void S(j00 j00Var) {
        yq4 yq4Var = new yq4((byte) 21);
        j28 j28Var = (j28) this.q;
        u00 u00Var = (u00) this.m;
        String str = (String) this.n;
        f18 f18Var = (f18) this.p;
        ta2 ta2Var = (ta2) this.f2598o;
        uk1 uk1Var = j28Var.c;
        iu iuVarA = u00.a();
        iuVarA.O(u00Var.a);
        iuVarA.n = ss5.m;
        iuVarA.p = u00Var.b;
        u00 u00VarF = iuVarA.f();
        d11 d11Var = new d11();
        d11Var.r = new HashMap();
        d11Var.p = Long.valueOf(j28Var.a.a());
        d11Var.q = Long.valueOf(j28Var.b.a());
        d11Var.m = str;
        d11Var.f578o = new sa2(ta2Var, (byte[]) f18Var.apply(j00Var.a));
        d11Var.n = null;
        uk1Var.b.execute(new io.sentry.android.core.internal.util.j(uk1Var, u00VarF, yq4Var, d11Var.k()));
    }

    public void T(Intent intent) {
        String str;
        synchronized (((HashMap) this.n)) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.m).getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.f2598o).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i = 0;
                    while (i < arrayList.size()) {
                        xc4 xc4Var = (xc4) arrayList.get(i);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + xc4Var.a);
                        }
                        if (xc4Var.c) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = xc4Var.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(xc4Var);
                                xc4Var.c = true;
                            } else {
                                arrayList = arrayList;
                                if (z) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((xc4) arrayList2.get(i2)).c = false;
                        }
                        ((ArrayList) this.p).add(new yt2((Object) intent, (Object) arrayList2, (byte) 20));
                        if (!((kd) this.q).hasMessages(1)) {
                            ((kd) this.q).sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void U(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.m).put(str, obj);
        sx4 sx4Var = (sx4) ((LinkedHashMap) this.f2598o).get(str);
        if (sx4Var != null) {
            ((l97) sx4Var).k(obj);
        }
        sx4 sx4Var2 = (sx4) ((LinkedHashMap) this.p).get(str);
        if (sx4Var2 != null) {
            ((l97) sx4Var2).k(obj);
        }
    }

    public void V(int i, int i2, nm2 nm2Var, int i3, int i4, boolean z) {
        float f;
        boolean z2;
        int iMax;
        boolean z3;
        int iT;
        float f2;
        lm2 lm2Var = (lm2) this.m;
        int i5 = nm2Var.e;
        float f3 = nm2Var.k;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        nm2Var.e = i4 + nm2Var.f;
        if (!z) {
            nm2Var.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < nm2Var.h) {
            int i8 = nm2Var.f1578o + i6;
            View viewC = lm2Var.c(i8);
            if (viewC == null || viewC.getVisibility() == 8) {
                f = f4;
                f5 = f5;
                z2 = z4;
                i6 = i6;
            } else {
                mm2 mm2Var = (mm2) viewC.getLayoutParams();
                int flexDirection = lm2Var.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f5 = f5;
                    z2 = z4;
                    int measuredWidth = viewC.getMeasuredWidth();
                    long[] jArr = (long[]) this.q;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewC.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.q;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.n)[i8] || mm2Var.h() <= f) {
                        i6 = i6;
                    } else {
                        float fH = measuredWidth - (mm2Var.h() * f5);
                        if (i6 == nm2Var.h - 1) {
                            fH += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fH);
                        if (iRound < mm2Var.i()) {
                            iRound = mm2Var.i();
                            ((boolean[]) this.n)[i8] = true;
                            nm2Var.k -= mm2Var.h();
                            z2 = true;
                        } else {
                            float f7 = (fH - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iRound++;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f7 += 1.0f;
                            }
                            f6 = f7;
                        }
                        int iE = E(i2, mm2Var, nm2Var.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewC.measure(iMakeMeasureSpec, iE);
                        int measuredWidth2 = viewC.getMeasuredWidth();
                        int measuredHeight2 = viewC.getMeasuredHeight();
                        c0(i8, iMakeMeasureSpec, iE, viewC);
                        lm2Var.i(viewC, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, lm2Var.k(viewC) + mm2Var.l() + mm2Var.n() + measuredHeight);
                    nm2Var.e = mm2Var.s() + mm2Var.m() + measuredWidth + nm2Var.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewC.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.q;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewC.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.q;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.n)[i8] || mm2Var.h() <= f) {
                        z3 = z4;
                    } else {
                        float fH2 = measuredHeight3 - (mm2Var.h() * f5);
                        if (i6 == nm2Var.h - 1) {
                            fH2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fH2);
                        if (iRound2 < mm2Var.t()) {
                            iT = mm2Var.t();
                            ((boolean[]) this.n)[i8] = true;
                            nm2Var.k -= mm2Var.h();
                            z3 = true;
                        } else {
                            float f8 = (fH2 - iRound2) + f6;
                            boolean z5 = z4;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iT = iRound2 + 1;
                                f2 = f8 - 1.0f;
                            } else if (d2 < -1.0d) {
                                iT = iRound2 - 1;
                                f2 = f8 + 1.0f;
                            } else {
                                iT = iRound2;
                                z3 = z5;
                                f6 = f8;
                            }
                            f6 = f2;
                            z3 = z5;
                        }
                        int iF = F(i, mm2Var, nm2Var.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iT, 1073741824);
                        viewC.measure(iF, iMakeMeasureSpec2);
                        int measuredWidth4 = viewC.getMeasuredWidth();
                        int measuredHeight4 = viewC.getMeasuredHeight();
                        c0(i8, iF, iMakeMeasureSpec2, viewC);
                        lm2Var.i(viewC, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, lm2Var.k(viewC) + mm2Var.s() + mm2Var.m() + measuredWidth3);
                    nm2Var.e = mm2Var.l() + mm2Var.n() + measuredHeight3 + nm2Var.e;
                    z2 = z3;
                    i6 = i6;
                }
                nm2Var.g = Math.max(nm2Var.g, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            z4 = z2;
            f5 = f5;
        }
        if (!z4 || i5 == nm2Var.e) {
            return;
        }
        V(i, i2, nm2Var, i3, i4, true);
    }

    public void X() {
        if (!((BluetoothManager) this.f2598o).getAdapter().isEnabled() || ((AudioDeviceInfo) this.q) != null) {
            ye4.c("BTAudioHelperInternal", "No Bluetooth device connected or Bluetooth is not enabled");
            return;
        }
        R();
        AudioManager audioManager = (AudioManager) this.n;
        if (audioManager != null) {
            ye4.a("BTAudioHelperInternal", "setupAudioManager::Try to start Bluetooth sco");
            AudioDeviceInfo audioDeviceInfoA = my.a(audioManager);
            if (audioDeviceInfoA != null) {
                this.q = audioDeviceInfoA;
                try {
                    if (!audioManager.setCommunicationDevice(audioDeviceInfoA)) {
                        ye4.c("BTAudioHelperInternal", "Failed ot set communication device.");
                    }
                } catch (IllegalArgumentException e) {
                    ua5.v("exception: ", e.getMessage(), "BTAudioHelperInternal");
                }
            }
        }
        my.a.setValue(Boolean.TRUE);
    }

    public void Y(View view, int i, int i2) {
        mm2 mm2Var = (mm2) view.getLayoutParams();
        int iM = (i - mm2Var.m()) - mm2Var.s();
        lm2 lm2Var = (lm2) this.m;
        int iMin = Math.min(Math.max(iM - lm2Var.k(view), mm2Var.i()), mm2Var.y());
        long[] jArr = (long[]) this.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        c0(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        lm2Var.i(view, i2);
    }

    public void Z(View view, int i, int i2) {
        mm2 mm2Var = (mm2) view.getLayoutParams();
        int iN = (i - mm2Var.n()) - mm2Var.l();
        lm2 lm2Var = (lm2) this.m;
        int iMin = Math.min(Math.max(iN - lm2Var.k(view), mm2Var.t()), mm2Var.w());
        long[] jArr = (long[]) this.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        c0(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        lm2Var.i(view, i2);
    }

    @Override // o.ez3
    public void a() {
        ((io.sentry.android.core.d) this.n).a();
        io.sentry.android.core.d dVar = (io.sentry.android.core.d) this.f2598o;
        ((HashMap) dVar.n).put((sy4) this.q, new sp((hp) lv0.F0((ArrayList) this.p)));
    }

    public void a0(int i) {
        View viewC;
        lm2 lm2Var = (lm2) this.m;
        if (i >= lm2Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = lm2Var.getFlexDirection();
        if (lm2Var.getAlignItems() != 4) {
            for (nm2 nm2Var : lm2Var.getFlexLinesInternal()) {
                for (Integer num : nm2Var.n) {
                    View viewC2 = lm2Var.c(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        Z(viewC2, nm2Var.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            hk0.g(fx3.e(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        Y(viewC2, nm2Var.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.f2598o;
        List flexLinesInternal = lm2Var.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            nm2 nm2Var2 = (nm2) flexLinesInternal.get(i2);
            int i3 = nm2Var2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = nm2Var2.f1578o + i4;
                if (i4 < lm2Var.getFlexItemCount() && (viewC = lm2Var.c(i5)) != null && viewC.getVisibility() != 8) {
                    mm2 mm2Var = (mm2) viewC.getLayoutParams();
                    if (mm2Var.g() == -1 || mm2Var.g() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            Z(viewC, nm2Var2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                hk0.g(fx3.e(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            Y(viewC, nm2Var2.g, i5);
                        }
                    }
                }
            }
        }
    }

    @Override // o.ef5
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((df5) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public zk3 b0(float f) {
        zk3 zk3VarA;
        na0 na0Var = (na0) this.n;
        if (f == 0.0f) {
            zk3VarA = na0Var.a();
        } else {
            na0 na0Var2 = (na0) this.f2598o;
            if (f == 1.0f) {
                zk3VarA = na0Var2.a();
            } else {
                if (na0Var.b() && na0Var2.b()) {
                    wn7 wn7Var = (wn7) this.q;
                    if (wn7Var == null || !im3.n(wn7Var.p, na0Var.a())) {
                        this.q = new wn7((rl2) this.m, qf0.m, na0Var.a(), na0Var2.a(), null);
                    } else {
                        wn7 wn7Var2 = (wn7) this.q;
                        wn7Var2.getClass();
                        if (!im3.n(wn7Var2.f2432o, na0Var2.a())) {
                            this.q = new wn7((rl2) this.m, qf0.m, na0Var.a(), na0Var2.a(), null);
                        }
                    }
                }
                wn7 wn7Var3 = (wn7) this.q;
                if (wn7Var3 == null || (zk3VarA = (zk3) wn7Var3.g((long) (wn7Var3.b() * f))) == null) {
                    zk3VarA = hm3.a;
                }
            }
        }
        this.p = zk3VarA;
        return zk3VarA;
    }

    @Override // o.ef5
    public float c() {
        return ((Number) ((u14) this.f2598o).getValue()).floatValue();
    }

    public void c0(int i, int i2, int i3, View view) {
        long[] jArr = (long[]) this.p;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.q;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    @Override // o.r93
    public void d() {
        ((BluetoothManager) this.f2598o).getAdapter().closeProfileProxy(1, (BluetoothHeadset) this.p);
        R();
        this.p = null;
    }

    @Override // o.r93
    public void e(Intent intent) {
        String strValueOf;
        String action = intent.getAction();
        if (action != null && action.hashCode() == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            if (intExtra == 0) {
                strValueOf = "STATE_DISCONNECTED";
            } else if (intExtra != 1) {
                strValueOf = intExtra != 2 ? String.valueOf(intExtra) : "STATE_CONNECTED";
            } else {
                strValueOf = "STATE_CONNECTING";
            }
            ua5.v("onBluetoothIntentReceived BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED state:", strValueOf, "BTAudioHelperInternal");
            if (intExtra != 0) {
                if (intExtra == 2 && ((AudioDeviceInfo) this.q) == null) {
                    X();
                    return;
                }
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) bt1.C(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
            String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.q;
            if (im3.n(address, audioDeviceInfo != null ? audioDeviceInfo.getAddress() : null)) {
                R();
            }
        }
    }

    @Override // o.ez3
    public void f(sy4 sy4Var, ns0 ns0Var) {
        ((io.sentry.android.core.d) this.m).f(sy4Var, ns0Var);
    }

    @Override // o.ez3
    public void g(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
        ((io.sentry.android.core.d) this.m).g(sy4Var, js0Var, sy4Var2);
    }

    @Override // o.ex5
    public Object get() {
        return new uk1((Executor) ((ex5) this.m).get(), (zq4) ((ex5) this.n).get(), (ep3) ((ep3) this.f2598o).get(), (tg6) ((ex5) this.p).get(), (tg6) ((ex5) this.q).get());
    }

    @Override // o.ez3
    public void h(sy4 sy4Var, Object obj) {
        ((io.sentry.android.core.d) this.m).h(sy4Var, obj);
    }

    @Override // o.ef5
    public float i() {
        return ((Number) ((u14) this.q).getValue()).floatValue();
    }

    public void j(ol olVar, wt3 wt3Var) {
        ((ArrayList) this.m).add(new vd5(olVar, wt3Var));
    }

    public void k(ui2 ui2Var, wt3 wt3Var) {
        ((ArrayList) this.f2598o).add(new x8(ui2Var, wt3Var, (byte) 18));
    }

    public hl0 l(e10 e10Var, Function0 function0) {
        int i;
        int i2;
        int i3;
        i76 i76Var = new i76();
        i76Var.m = -1;
        synchronized (this.m) {
            Throwable th = (Throwable) this.n;
            if (th != null) {
                e10Var.b(th);
                return yl7.s;
            }
            yx yxVar = (yx) this.f2598o;
            do {
                i = yxVar.get();
                i2 = i + 1;
            } while (!yxVar.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            i76Var.m = (i2 >>> 27) & 15;
            ((zw4) this.p).a(e10Var);
            if (z) {
                try {
                    function0.a();
                } catch (Throwable th2) {
                    synchronized (this.m) {
                        try {
                            if (((Throwable) this.n) == null) {
                                this.n = th2;
                                zw4 zw4Var = (zw4) this.p;
                                Object[] objArr = zw4Var.a;
                                int i4 = zw4Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((e10) objArr[i5]).b(th2);
                                }
                                ((zw4) this.p).d();
                                yx yxVar2 = (yx) this.f2598o;
                                do {
                                    i3 = yxVar2.get();
                                } while (!yxVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new a65(new n5((Object) e10Var, (Object) this, (Object) i76Var, (byte) 4));
        }
    }

    public void m(List list, nm2 nm2Var, int i, int i2) {
        nm2Var.m = i2;
        ((lm2) this.m).b(nm2Var);
        nm2Var.p = i;
        list.add(nm2Var);
    }

    public synchronized ll2 n(String str) {
        ye4.a("AddToGroup", "Trying to add the new device to a group");
        return new pn5(oc6.POST, "", bt1.t(new String[]{"remotecontrol_id", "groupid", "description", "alias"}, new String[]{str, (String) this.m, (String) this.f2598o, (String) this.p}), "").x((String) this.n);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi o(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.m;
        ArrayList arrayList = (ArrayList) this.p;
        ArrayList arrayList2 = (ArrayList) this.n;
        boolean[] zArr = (boolean[]) this.f2598o;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.q;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(K(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.q;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.q = cArr2;
        return bidi;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    public void p(nd ndVar, int i, int i2, int i3, int i4, int i5, List list) {
        int iG;
        mm2 mm2Var;
        int i6;
        boolean z;
        int i7 = i;
        lm2 lm2Var = (lm2) this.m;
        boolean zJ = lm2Var.j();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List arrayList = list == null ? new ArrayList() : list;
        ndVar.f1562o = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zJ ? lm2Var.getPaddingStart() : lm2Var.getPaddingTop();
        int paddingEnd = zJ ? lm2Var.getPaddingEnd() : lm2Var.getPaddingBottom();
        int paddingTop = zJ ? lm2Var.getPaddingTop() : lm2Var.getPaddingStart();
        int paddingBottom = zJ ? lm2Var.getPaddingBottom() : lm2Var.getPaddingEnd();
        nm2 nm2Var = new nm2();
        int i8 = i4;
        int i9 = 1;
        nm2Var.f1578o = i8;
        int i10 = paddingStart + paddingEnd;
        nm2Var.e = i10;
        int flexItemCount = lm2Var.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewC = lm2Var.c(i8);
            if (viewC != null) {
                if (viewC.getVisibility() == 8) {
                    nm2Var.i++;
                    nm2Var.h++;
                    if (i8 == i14 - 1 && nm2Var.a() != 0) {
                        m(arrayList, nm2Var, i8, i12);
                    }
                } else {
                    if (viewC instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewC;
                        mm2 mm2Var2 = (mm2) compoundButton.getLayoutParams();
                        int i15 = mm2Var2.i();
                        int iT = mm2Var2.t();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (i15 == -1) {
                            i15 = minimumWidth;
                        }
                        mm2Var2.k(i15);
                        if (iT == -1) {
                            iT = minimumHeight;
                        }
                        mm2Var2.o(iT);
                    }
                    mm2 mm2Var3 = (mm2) viewC.getLayoutParams();
                    if (mm2Var3.g() == 4) {
                        nm2Var.n.add(Integer.valueOf(i8));
                    }
                    int iB = zJ ? mm2Var3.b() : mm2Var3.a();
                    if (mm2Var3.r() != -1.0f && mode == 1073741824) {
                        iB = Math.round(mm2Var3.r() * size);
                    }
                    if (zJ) {
                        iG = lm2Var.d(i7, mm2Var3.s() + mm2Var3.m() + i10, iB);
                        int iG2 = lm2Var.g(i2, mm2Var3.l() + mm2Var3.n() + paddingTop + paddingBottom + i12, mm2Var3.a());
                        viewC.measure(iG, iG2);
                        c0(i8, iG, iG2, viewC);
                    } else {
                        int iD = lm2Var.d(i2, mm2Var3.s() + mm2Var3.m() + paddingTop + paddingBottom + i12, mm2Var3.b());
                        iG = lm2Var.g(i7, mm2Var3.l() + mm2Var3.n() + i10, iB);
                        viewC.measure(iD, iG);
                        c0(i8, iD, iG, viewC);
                    }
                    lm2Var.i(viewC, i8);
                    r(viewC, i8);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewC.getMeasuredState());
                    int i16 = nm2Var.e;
                    int measuredWidth = (zJ ? viewC.getMeasuredWidth() : viewC.getMeasuredHeight()) + (zJ ? mm2Var3.m() : mm2Var3.n()) + (zJ ? mm2Var3.s() : mm2Var3.l());
                    int size2 = arrayList.size();
                    if (lm2Var.getFlexWrap() != 0) {
                        if (mm2Var3.v()) {
                            mm2Var = mm2Var3;
                        } else {
                            if (mode == 0) {
                                mm2Var = mm2Var3;
                            } else {
                                mm2Var = mm2Var3;
                                int maxLine = lm2Var.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iF = lm2Var.f(viewC, i8, i13);
                                    if (iF > 0) {
                                        measuredWidth += iF;
                                    }
                                    if (size < i16 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            nm2Var.h += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (nm2Var.a() > 0) {
                            arrayList = arrayList;
                            m(arrayList, nm2Var, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += nm2Var.g;
                        }
                        if (zJ) {
                            arrayList = arrayList;
                            if (mm2Var.a() == -1) {
                                viewC.measure(iG, lm2Var.g(i2, mm2Var.l() + mm2Var.n() + lm2Var.getPaddingBottom() + lm2Var.getPaddingTop() + i12, mm2Var.a()));
                                r(viewC, i8);
                            }
                        } else {
                            arrayList = arrayList;
                            if (mm2Var.b() == -1) {
                                viewC.measure(lm2Var.d(i2, mm2Var.s() + mm2Var.m() + lm2Var.getPaddingRight() + lm2Var.getPaddingLeft() + i12, mm2Var.b()), iG);
                                r(viewC, i8);
                            }
                        }
                        nm2Var = new nm2();
                        nm2Var.h = i9;
                        i10 = i10;
                        nm2Var.e = i10;
                        nm2Var.f1578o = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        mm2Var = mm2Var3;
                        i10 = i10;
                        arrayList = arrayList;
                        nm2Var.h += i9;
                        i13++;
                        i6 = i11;
                    }
                    nm2Var.q |= mm2Var.p() != 0.0f;
                    nm2Var.r |= mm2Var.h() != 0.0f;
                    int[] iArr = (int[]) this.f2598o;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    nm2Var.e = (zJ ? viewC.getMeasuredWidth() : viewC.getMeasuredHeight()) + (zJ ? mm2Var.m() : mm2Var.n()) + (zJ ? mm2Var.s() : mm2Var.l()) + nm2Var.e;
                    nm2Var.j = mm2Var.p() + nm2Var.j;
                    nm2Var.k = mm2Var.h() + nm2Var.k;
                    lm2Var.h(viewC, i8, i13, nm2Var);
                    int iMax = Math.max(i6, lm2Var.k(viewC) + (zJ ? viewC.getMeasuredHeight() : viewC.getMeasuredWidth()) + (zJ ? mm2Var.n() : mm2Var.m()) + (zJ ? mm2Var.l() : mm2Var.s()));
                    nm2Var.g = Math.max(nm2Var.g, iMax);
                    if (zJ) {
                        int flexWrap = lm2Var.getFlexWrap();
                        int i17 = nm2Var.l;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            nm2Var.l = Math.max(i17, mm2Var.n() + viewC.getBaseline());
                        } else {
                            nm2Var.l = Math.max(i17, mm2Var.l() + (viewC.getMeasuredHeight() - viewC.getBaseline()));
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && nm2Var.a() != 0) {
                        m(arrayList, nm2Var, i8, i12);
                        i12 += nm2Var.g;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        i9 = 1;
                        if (((nm2) arrayList.get(arrayList.size() - 1)).p >= i5 && i8 >= i5 && !z3) {
                            i12 = -nm2Var.g;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    } else {
                        i9 = 1;
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
            } else if (i8 == i14 - 1 && nm2Var.a() != 0) {
                m(arrayList, nm2Var, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
        }
        ndVar.n = iCombineMeasuredStates;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    public void q(String str) {
        int i;
        String string;
        ye4.a("AddToGroup", "Checking the device info if it exists!");
        synchronized (this) {
            try {
                ye4.a("AddToGroup", "Retrieving device info");
                ll2 ll2VarX = new pn5(oc6.GET, "", "", bt1.u(new String[]{"remotecontrol_id"}, new String[]{str})).x((String) this.n);
                try {
                    if (((pc6) ll2VarX.f1375o) == pc6.SUCCESS) {
                        JSONArray jSONArray = new JSONObject((String) ll2VarX.n).getJSONArray("devices");
                        if (jSONArray.length() > 0) {
                            JSONObject jSONObject = jSONArray.getJSONObject(0);
                            if (im3.n((String) this.p, jSONObject.getString("alias")) && ((String) this.m).equals(jSONObject.getString("groupid"))) {
                                string = "";
                            } else {
                                string = jSONObject.getString("device_id");
                                string.getClass();
                            }
                        } else {
                            string = "";
                        }
                    } else {
                        string = "";
                    }
                } catch (JSONException unused) {
                    ye4.c("AddToGroup", "Could not parse response array");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (string.length() > 0) {
            ye4.a("AddToGroup", "Update found for device");
            synchronized (this) {
                ye4.a("AddToGroup", "Updating device info");
                String[] strArr = (String[]) Arrays.copyOf(new String[]{string}, 1);
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArr) {
                    sb.append("/");
                    sb.append(str2);
                }
                new pn5(oc6.PUT, sb.toString(), bt1.t(new String[]{"groupid", "alias"}, new String[]{(String) this.m, (String) this.p}), "").x((String) this.n);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public void r(View view, int i) {
        boolean z;
        mm2 mm2Var = (mm2) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= mm2Var.i()) {
            if (measuredWidth > mm2Var.y()) {
                measuredWidth = mm2Var.y();
            } else {
                z = false;
            }
            if (measuredHeight < mm2Var.t()) {
                measuredHeight = mm2Var.t();
            } else if (measuredHeight > mm2Var.w()) {
                measuredHeight = mm2Var.w();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                c0(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                ((lm2) this.m).i(view, i);
            }
        }
        measuredWidth = mm2Var.i();
        z = true;
        if (measuredHeight < mm2Var.t()) {
            measuredHeight = mm2Var.t();
        } else if (measuredHeight > mm2Var.w()) {
            measuredHeight = mm2Var.w();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            c0(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            ((lm2) this.m).i(view, i);
        }
    }

    @Override // o.ez3
    public fz3 s(sy4 sy4Var) {
        return ((io.sentry.android.core.d) this.m).s(sy4Var);
    }

    public void t(int i, List list) {
        int i2 = ((int[]) this.f2598o)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.f2598o;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.p;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public ArrayList v(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            mm2 mm2Var = (mm2) ((lm2) this.m).e(i2).getLayoutParams();
            om2 om2Var = new om2();
            om2Var.n = mm2Var.getOrder();
            om2Var.m = i2;
            arrayList.add(om2Var);
        }
        return arrayList;
    }

    @Override // o.ez3
    public ez3 w(js0 js0Var, sy4 sy4Var) {
        return ((io.sentry.android.core.d) this.m).w(js0Var, sy4Var);
    }

    public void x(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        lm2 lm2Var = (lm2) this.m;
        int flexDirection = lm2Var.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            hk0.g(fx3.e(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<nm2> flexLinesInternal = lm2Var.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = lm2Var.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((nm2) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = lm2Var.getAlignContent();
                if (alignContent == 1) {
                    nm2 nm2Var = new nm2();
                    nm2Var.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, nm2Var);
                    return;
                }
                if (alignContent == 2) {
                    lm2Var.setFlexLines(u(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((nm2) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            nm2 nm2Var2 = new nm2();
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f + size3);
                                nm2Var2.g = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(size3);
                                nm2Var2.g = iRound;
                            }
                            float f2 = (size3 - iRound) + f;
                            if (f2 > 1.0f) {
                                nm2Var2.g = iRound + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                nm2Var2.g = iRound - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(nm2Var2);
                        }
                        i4++;
                    }
                    lm2Var.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        lm2Var.setFlexLines(u(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    nm2 nm2Var3 = new nm2();
                    nm2Var3.g = size5;
                    for (nm2 nm2Var4 : flexLinesInternal) {
                        arrayList2.add(nm2Var3);
                        arrayList2.add(nm2Var4);
                        arrayList2.add(nm2Var3);
                    }
                    lm2Var.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        nm2 nm2Var5 = (nm2) flexLinesInternal.get(i4);
                        float f4 = nm2Var5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        float f5 = (f4 - iRound3) + f3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        nm2Var5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public void y(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        yc4 yc4Var;
        int i4;
        int i5;
        lm2 lm2Var = (lm2) this.m;
        int flexItemCount = lm2Var.getFlexItemCount();
        boolean[] zArr = (boolean[]) this.n;
        if (zArr == null) {
            this.n = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.n = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= lm2Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = lm2Var.getFlexDirection();
        int flexDirection2 = lm2Var.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = lm2Var.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = lm2Var.getPaddingLeft();
            paddingRight = lm2Var.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                hk0.g(fx3.e(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = lm2Var.getLargestMainSize();
            }
            paddingLeft = lm2Var.getPaddingTop();
            paddingRight = lm2Var.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = (int[]) this.f2598o;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = lm2Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            nm2 nm2Var = (nm2) flexLinesInternal.get(i8);
            int i9 = nm2Var.e;
            if (i9 >= i7 || !nm2Var.q) {
                yc4Var = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && nm2Var.r) {
                    yc4Var.V(i4, i5, nm2Var, i7, i6, false);
                }
            } else {
                yc4Var = this;
                i4 = i;
                i5 = i2;
                yc4Var.C(i4, i5, nm2Var, i7, i6, false);
            }
            i8++;
            this = yc4Var;
            i = i4;
            i2 = i5;
        }
    }

    public void z(int i) {
        int[] iArr = (int[]) this.f2598o;
        if (iArr == null) {
            this.f2598o = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f2598o = Arrays.copyOf((int[]) this.f2598o, Math.max(iArr.length * 2, i));
        }
    }

    public yc4(Map map) {
        map.getClass();
        this.m = new LinkedHashMap(map);
        this.n = new LinkedHashMap();
        this.f2598o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new fy0(this, (byte) 4);
    }

    public yc4(byte b) {
        switch (b) {
            case 17:
                this.q = oa2.b;
                this.n = "GET";
                this.f2598o = new nm((byte) 5);
                break;
            default:
                this.m = new Object();
                this.f2598o = new yx(0);
                this.p = new zw4();
                this.q = new zw4();
                break;
        }
    }

    public /* synthetic */ yc4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.m = obj;
        this.n = obj2;
        this.f2598o = obj3;
        this.p = obj4;
        this.q = obj5;
    }

    public yc4(lm2 lm2Var) {
        this.m = lm2Var;
    }

    public yc4(Context context) {
        this.n = new HashMap();
        this.f2598o = new HashMap();
        this.p = new ArrayList();
        this.m = context;
        this.q = new kd(this, context.getMainLooper(), (byte) 2);
    }

    public yc4(io3 io3Var, f58 f58Var, u14 u14Var) {
        f58Var.getClass();
        this.m = io3Var;
        this.n = f58Var;
        this.f2598o = u14Var;
        this.p = u14Var;
        this.q = new iu(this, f58Var);
    }
}
