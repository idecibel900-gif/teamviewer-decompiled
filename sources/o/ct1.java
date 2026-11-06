package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Xml;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.chatviewmodel.swig.SizeTVector;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ct1 {
    public static xk1 a;

    public static final sc6 A(Throwable th) {
        th.getClass();
        return new sc6(th);
    }

    public static Parcelable B(Parcel parcel, int i, Parcelable.Creator creator) {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iS);
        return parcelable;
    }

    public static String C(Parcel parcel, int i) {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iS);
        return string;
    }

    public static Object[] D(Parcel parcel, int i, Parcelable.Creator creator) {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return objArrCreateTypedArray;
    }

    public static void E(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new fh6(sb.toString(), parcel);
    }

    public static final int F(int i, List list) {
        int i2;
        byte b;
        int i3 = ((cf5) lv0.v0(list)).c;
        if (i > ((cf5) lv0.v0(list)).c) {
            li3.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            cf5 cf5Var = (cf5) list.get(i2);
            if (cf5Var.b > i) {
                b = 1;
            } else {
                b = cf5Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strA = gc4.a(list, null, new at4((byte) 3), 31);
        StringBuilder sbJ = fx3.j(i2, size2, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
        sbJ.append(i);
        sbJ.append(", paragraphs=[");
        sbJ.append(strA);
        sbJ.append("]");
        li3.a(sbJ.toString());
        return i2;
    }

    public static final int G(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            cf5 cf5Var = (cf5) list.get(i3);
            if (cf5Var.d > i) {
                b = 1;
            } else {
                b = cf5Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int H(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((cf5) lv0.v0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            cf5 cf5Var = (cf5) arrayList.get(i2);
            if (cf5Var.f > f) {
                b = 1;
            } else {
                b = cf5Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void I(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int iF = F(gt7.f(j), arrayList); iF < size; iF++) {
            cf5 cf5Var = (cf5) arrayList.get(iF);
            if (cf5Var.b >= gt7.e(j)) {
                return;
            }
            if (cf5Var.b != cf5Var.c) {
                function1.invoke(cf5Var);
            }
        }
    }

    public static Intent J(Activity activity) {
        if (activity != null) {
            return new Intent(activity, (Class<?>) InAppPurchaseActivity.class);
        }
        return null;
    }

    public static final boolean K(oz3 oz3Var) {
        oz3Var.getClass();
        m98 m98VarR0 = oz3Var.r0();
        if (m98VarR0 instanceof ed2) {
            return true;
        }
        return (m98VarR0 instanceof um2) && (((um2) m98VarR0).v0() instanceof ed2);
    }

    public static final boolean L(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static aq6 M(hw2 hw2Var) {
        aq6 aq6Var = new aq6();
        aq6Var.p = vt1.p(aq6Var, aq6Var, hw2Var);
        return aq6Var;
    }

    public static final long N(long j, long j2, float f) {
        float fG = vs1.G(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fG2 = vs1.G(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fG2)) & 4294967295L);
    }

    public static ds2 O(Resources resources, XmlResourceParser xmlResourceParser) throws Throwable {
        int next;
        int i;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            V(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), tz5.b);
        int i2 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i3 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), tz5.c);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            V(xmlResourceParser);
                        }
                        arrayList.add(new fs2(i4, i6, resourceId2, string7, string6, z));
                    } else {
                        V(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new es2((fs2[]) arrayList.toArray(new fs2[0]));
        }
        List listQ = Q(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), tz5.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i2);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i3) {
                            V(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            try {
                                wr2 wr2Var = new wr2(string, string2, string8, listQ, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(wr2Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                V(xmlResourceParser);
                i3 = i3;
                integer = integer;
                i = 2;
                i2 = 0;
            }
        }
        int i8 = integer;
        if (!arrayList2.isEmpty()) {
            return new gs2(arrayList2, i8, integer2, string5);
        }
        if (string3 == null) {
            hk0.g("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new wr2(string, string2, string3, listQ, null, null));
        if (string4 != null) {
            arrayList2.add(new wr2(string, string2, string4, listQ, null, null));
        }
        return new gs2(arrayList2, i8, integer2, string5);
    }

    public static boolean P(Parcel parcel, int i) {
        e0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static List Q(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static int R(Parcel parcel, int i) {
        e0(parcel, i, 4);
        return parcel.readInt();
    }

    public static int S(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final Collection T(Collection collection, Function1 function1) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        v17 v17Var = new v17();
        while (!linkedList.isEmpty()) {
            Object objM0 = lv0.m0(linkedList);
            v17 v17Var2 = new v17();
            ArrayList arrayListG = hc5.g(objM0, linkedList, function1, new t(v17Var2, (byte) 25));
            if (arrayListG.size() == 1 && v17Var2.isEmpty()) {
                Object objE0 = lv0.E0(arrayListG);
                objE0.getClass();
                v17Var.add(objE0);
            } else {
                Object objS = hc5.s(arrayListG, function1);
                xi0 xi0Var = (xi0) function1.invoke(objS);
                for (Object obj : arrayListG) {
                    obj.getClass();
                    if (!hc5.k(xi0Var, (xi0) function1.invoke(obj))) {
                        v17Var2.add(obj);
                    }
                }
                if (!v17Var2.isEmpty()) {
                    v17Var.addAll(v17Var2);
                }
                v17Var.add(objS);
            }
        }
        return v17Var;
    }

    public static final String U(Object obj) {
        return fx3.g(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static void V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void W(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + S(parcel, i));
    }

    public static LinkedList X(SizeTVector sizeTVector) {
        LinkedList linkedList = new LinkedList();
        int size = sizeTVector.size();
        if (size > 0) {
            int i = 0;
            int iLongValue = (int) sizeTVector.get(0).longValue();
            for (int i2 = 1; i2 < size; i2++) {
                long jLongValue = sizeTVector.get(i2 - 1).longValue();
                long jLongValue2 = sizeTVector.get(i2).longValue();
                if (jLongValue + 1 != jLongValue2) {
                    linkedList.add(new ta4(iLongValue, i2 - i));
                    iLongValue = (int) jLongValue2;
                    i = i2;
                }
            }
            linkedList.add(new ta4(iLongValue, size - i));
        }
        return linkedList;
    }

    public static String Y(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static wk3 Z(yk3 yk3Var, int i) {
        yk3Var.getClass();
        r(i > 0, Integer.valueOf(i));
        int i2 = yk3Var.m;
        int i3 = yk3Var.n;
        if (yk3Var.f2422o <= 0) {
            i = -i;
        }
        return new wk3(i2, i3, i);
    }

    public static final void a(wt1 wt1Var, ns1 ns1Var, List list, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        fs4 fs4Var2;
        boolean z;
        ns1Var.getClass();
        List list2 = ns1Var.n;
        list.getClass();
        ux2Var.Y(-1702119814);
        int i2 = (i & 6) == 0 ? (ux2Var.h(wt1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(ns1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                l33 l33Var = (l33) obj;
                List list3 = list2 == null ? ea2.m : list2;
                k33 k33Var = l33Var.a;
                j33 j33Var = k33Var instanceof j33 ? (j33) k33Var : null;
                if (lv0.h0(list3, j33Var != null ? j33Var.m : null)) {
                    arrayList.add(obj);
                }
            }
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z2 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            lv1.A(0, m77.z(R.string.device_tab_device_details_groups_title, ux2Var), ux2Var, null);
            fs4 fs4VarF = ka0.F(iq8.j(cs4Var, sf6.a(8.0f)), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarF);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            if (wt1Var.e && list2 == null) {
                ux2Var.W(-555462630);
                e(null, ux2Var, 0);
                ux2Var.p(false);
                ux2Var2 = ux2Var;
                fs4Var2 = cs4Var;
                z = true;
            } else if (arrayList.isEmpty()) {
                ux2Var.W(-555330880);
                String strZ = m77.z(R.string.device_tab_device_details_groups_empty, ux2Var);
                h72 h72Var = un4.a;
                fs4Var2 = cs4Var;
                z = true;
                qs7.b(strZ, ka0.D(cs4Var, 16.0f, 0.0f, 2), ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.j, ux2Var, 48, 0, 131064);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                ux2Var2 = ux2Var;
                fs4Var2 = cs4Var;
                z = true;
                ux2Var2.W(-554951874);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((l33) it.next()).b;
                    if (str == null) {
                        ux2Var2.W(-46805194);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-46805193);
                        d(0, str, ux2Var2, null);
                        ux2Var2.p(false);
                    }
                }
                ux2Var2.p(false);
            }
            ux2Var2.p(z);
            ux2Var2.p(z);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) wt1Var, (Object) ns1Var, (Object) list, fs4Var2, i, (byte) 9);
        }
    }

    public static final void a0(Object obj) {
        if (obj instanceof sc6) {
            throw ((sc6) obj).m;
        }
    }

    public static final void b(final Function0 function0, final fs4 fs4Var, pw6 pw6Var, final long j, long j2, pn2 pn2Var, final yy0 yy0Var, ux2 ux2Var, final int i, final int i2) {
        Function0 function1;
        int i3;
        final pw6 pw6VarB;
        final long jA;
        final pn2 pn2Var2;
        ux2Var.Y(748201188);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (ux2Var.h(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                pw6VarB = pw6Var;
                int i4 = ux2Var.f(pw6VarB) ? 256 : 128;
                i3 |= i4;
            } else {
                pw6VarB = pw6Var;
            }
            i3 |= i4;
        } else {
            pw6VarB = pw6Var;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jA = j2;
                int i5 = ux2Var.e(jA) ? 16384 : 8192;
                i3 |= i5;
            } else {
                jA = j2;
            }
            i3 |= i5;
        } else {
            jA = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                pn2Var2 = pn2Var;
                int i6 = ux2Var.f(pn2Var2) ? 131072 : 65536;
                i3 |= i6;
            } else {
                pn2Var2 = pn2Var;
            }
            i3 |= i6;
        } else {
            pn2Var2 = pn2Var;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= ux2Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 8388608 : 4194304;
        }
        if (ux2Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                if ((i2 & 4) != 0) {
                    pw6VarB = ux6.b(db8.u, ux2Var);
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    jA = bw0.a(j, ux2Var);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    pn2Var2 = new pn2(pm8.k, pm8.n, pm8.l, pm8.m);
                }
            } else {
                ux2Var.Q();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            pn2 pn2Var3 = pn2Var2;
            long j3 = jA;
            ux2Var.q();
            int i7 = i3 << 9;
            pw6 pw6Var2 = pw6VarB;
            c(function1, k68.a(g68.p, ux2Var), db8.v, fs4Var, pw6Var2, j, j3, pn2Var3, yy0Var, ux2Var, (i7 & 1879048192) | (i3 & 14) | 3456 | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7), (i3 >> 21) & 14);
            pw6VarB = pw6Var2;
            jA = j3;
            pn2Var2 = pn2Var3;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.co2
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ct1.b(function0, fs4Var, pw6VarB, j, jA, pn2Var2, yy0Var, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static yk3 b0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new yk3(i, i2 - 1, 1);
        }
        yk3 yk3Var = yk3.p;
        return yk3.p;
    }

    public static final void c(final Function0 function0, final ot7 ot7Var, final float f, final fs4 fs4Var, final pw6 pw6Var, final long j, final long j2, final pn2 pn2Var, final yy0 yy0Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        yy0 yy0Var2;
        int i4;
        ux2Var.Y(121669932);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(ot7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.c(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ux2Var.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ux2Var.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ux2Var.f(pn2Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ux2Var.f(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            yy0Var2 = yy0Var;
            i4 = i2 | (ux2Var.h(yy0Var2) ? 4 : 2);
        } else {
            yy0Var2 = yy0Var;
            i4 = i2;
        }
        byte b = 3;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            ux2Var.W(-282853233);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = ua5.s(ux2Var);
            }
            mw4 mw4Var = (mw4) objK;
            ux2Var.p(false);
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = new ji2(b);
                ux2Var.g0(objK2);
            }
            fs4 fs4VarA = cp6.a(fs4Var, false, (Function1) objK2);
            float f2 = pn2Var.a;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zF = ux2Var.f(mw4Var);
            Object objK3 = ux2Var.K();
            if (zF || objK3 == obj) {
                objK3 = new sn2(pn2Var.a, pn2Var.b, pn2Var.d, pn2Var.c);
                ux2Var.g0(objK3);
            }
            sn2 sn2Var = (sn2) objK3;
            boolean zH = ux2Var.h(sn2Var) | (((i6 ^ 48) > 32 && ux2Var.f(pn2Var)) || (i5 & 48) == 32);
            Object objK4 = ux2Var.K();
            if (zH || objK4 == obj) {
                objK4 = new oa1((Object) sn2Var, (Object) pn2Var, (hc1) null, (byte) 18);
                ux2Var.g0(objK4);
            }
            ck3.i(pn2Var, (hw2) objK4, ux2Var);
            boolean zF2 = ux2Var.f(mw4Var) | ux2Var.h(sn2Var);
            Object objK5 = ux2Var.K();
            if (zF2 || objK5 == obj) {
                objK5 = new j0(mw4Var, sn2Var, null);
                ux2Var.g0(objK5);
            }
            ck3.i(mw4Var, (hw2) objK5, ux2Var);
            final yy0 yy0Var3 = yy0Var2;
            int i7 = i3 >> 6;
            ig7.b(function0, fs4VarA, false, pw6Var, j, j2, f2, ((w32) sn2Var.e.c.n.getValue()).m, null, mw4Var, au8.O(-1779603465, new hw2() { // from class: o.do2
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ux2 ux2Var2 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lv1.x(j2, ot7Var, au8.O(-1767363041, new rd(f, yy0Var3), ux2Var2), ux2Var2, 384);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, (i3 & 14) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 260);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.eo2
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    ct1.c(function0, ot7Var, f, fs4Var, pw6Var, j, j2, pn2Var, yy0Var, (ux2) obj2, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    public static int c0(Parcel parcel) {
        int i = parcel.readInt();
        int iS = S(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new fh6("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iS + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new fh6(sb.toString(), parcel);
    }

    public static final void d(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1479270973);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | 48;
        if (ux2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.B(iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(8.0f)), 16.0f), "TVTA-devicesScreen-deviceInfoScreen-groupItem");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
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
            td3.a(b77.p(R.drawable.ic_group_managed, ux2Var2), m77.z(R.string.device_tab_group_item_content_description, ux2Var2), ka0.F(cs4Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), rv0.h, ux2Var2, 3456, 0);
            fs4 fs4VarF = ka0.F(cs4Var, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            qs7.b(str, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceInfoScreen-groupItem-title"), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var, (i2 & 14) | 48, 24960, 110588);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var2, i, (byte) 2);
        }
    }

    public static final int d0(o44 o44Var) {
        List list = o44Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((p44) list.get(i2)).n;
        }
        return (i / list.size()) + o44Var.r;
    }

    public static final void e(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(678597627);
        int i2 = i | 6;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            h72 h72Var = un4.a;
            List listL = qf0.L(new rv0(((rn4) ux2Var.j(h72Var)).a.B), new rv0(((rn4) ux2Var.j(h72Var)).a.r), new rv0(((rn4) ux2Var.j(h72Var)).a.B));
            rh3 rh3VarK = nv1.k(nv1.G("shimmer", ux2Var, 0), 0.0f, 1000.0f, db8.J(db8.I0(1200, 2, q72.c), 4), "deviceGroupsShimmer", ux2Var, 29112, 0);
            float fFloatValue = ((Number) rh3VarK.f1923o.getValue()).floatValue();
            bg5 bg5Var = rh3VarK.f1923o;
            t94 t94Var = new t94(listL, null, (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32), (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) << 32) | (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) & 4294967295L), 0);
            fs4Var2 = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.B(iq8.j(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), sf6.a(8.0f)), 16.0f), "TVTA-devicesScreen-deviceInfoScreen-groupItem-shimmer");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
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
            ua0.a(au8.r(iq8.j(androidx.compose.foundation.layout.b.l(fs4Var2, 20.0f), sf6.a(4.0f)), t94Var, null, 6), ux2Var, 0);
            ua0.a(au8.r(iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(ka0.F(fs4Var2, 24.0f, 0.0f, 8.0f, 0.0f, 10), 160.0f), 20.0f), sf6.a(8.0f)), t94Var, null, 6), ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 3);
        }
    }

    public static void e0(Parcel parcel, int i, int i2) {
        int iS = S(parcel, i);
        if (iS == i2) {
            return;
        }
        String hexString = Integer.toHexString(iS);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iS).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iS);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new fh6(sb.toString(), parcel);
    }

    public static final void f(qh4 qh4Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        function0.getClass();
        ux2Var.Y(382909894);
        ux2Var.X(185152185);
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = new ei4();
            ux2Var.g0(objK);
        }
        ei4 ei4Var = (ei4) objK;
        ux2Var.p(false);
        ux2Var.X(185152232);
        Object objK2 = ux2Var.K();
        if (objK2 == awVar) {
            objK2 = new Matrix();
            ux2Var.g0(objK2);
        }
        Matrix matrix = (Matrix) objK2;
        ux2Var.p(false);
        ux2Var.X(185152312);
        boolean zF = ux2Var.f(qh4Var);
        Object objK3 = ux2Var.K();
        if (zF || objK3 == awVar) {
            objK3 = h57.p(null);
            ux2Var.g0(objK3);
        }
        px4 px4Var = (px4) objK3;
        ux2Var.p(false);
        ux2Var.X(185152364);
        if (qh4Var == null || qh4Var.b() == 0.0f) {
            ua0.a(fs4Var, ux2Var, (i >> 6) & 14);
            ux2Var.p(false);
            j56 j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new lh4(qh4Var, function0, fs4Var, i, (byte) 0);
                return;
            }
            return;
        }
        ux2Var.p(false);
        Rect rect = qh4Var.k;
        Context context = (Context) ux2Var.j(lh.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        fs4Var.getClass();
        vn4.K(0, new mh4(rect, matrix, ei4Var, qh4Var, context, function0, px4Var), ux2Var, fs4Var.f(new nh4(iWidth, iHeight)));
        j56 j56VarR2 = ux2Var.r();
        if (j56VarR2 != null) {
            j56VarR2.d = new lh4(qh4Var, function0, fs4Var, i, (byte) 1);
        }
    }

    public static final void g(final mx0 mx0Var, hj5 hj5Var, fs4 fs4Var, ux2 ux2Var, int i) {
        mx0Var.getClass();
        ux2Var.Y(-1997629482);
        final byte b = 2;
        final byte b2 = 4;
        int i2 = (i & 6) == 0 ? (ux2Var.f(mx0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(hj5Var) : ux2Var.h(hj5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(null) ? 16384 : 8192;
        }
        final byte b3 = 0;
        final byte b4 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            cj5 cj5Var = hj5Var.b;
            if (cj5Var.a) {
                yy0 yy0Var = new yy0(-50742369, true, new hw2() { // from class: o.ij5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b3;
                        f88 f88Var = f88.a;
                        mx0 mx0Var2 = mx0Var;
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b5) {
                            case 0:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new qj5(mx0Var2.a), null, ux2Var2, 0);
                                }
                                break;
                            case 1:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new pj5(mx0Var2.b), null, ux2Var2, 0);
                                }
                                break;
                            case 2:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new mj5(mx0Var2.f), null, ux2Var2, 0);
                                }
                                break;
                            case 3:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new nj5(mx0Var2.c), null, ux2Var2, 0);
                                }
                                break;
                            case 4:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new oj5(mx0Var2.e), null, ux2Var2, 0);
                                }
                                break;
                            default:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new rj5(mx0Var2.d), null, ux2Var2, 0);
                                }
                                break;
                        }
                        return f88Var;
                    }
                });
                int iOrdinal = cj5Var.b.ordinal();
                if (iOrdinal == 0) {
                    arrayList.add(yy0Var);
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return;
                    }
                    arrayList2.add(yy0Var);
                }
            }
            cj5 cj5Var2 = hj5Var.c;
            if (cj5Var2.a) {
                yy0 yy0Var2 = new yy0(185427454, true, new hw2() { // from class: o.ij5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b4;
                        f88 f88Var = f88.a;
                        mx0 mx0Var2 = mx0Var;
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b5) {
                            case 0:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new qj5(mx0Var2.a), null, ux2Var2, 0);
                                }
                                break;
                            case 1:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new pj5(mx0Var2.b), null, ux2Var2, 0);
                                }
                                break;
                            case 2:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new mj5(mx0Var2.f), null, ux2Var2, 0);
                                }
                                break;
                            case 3:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new nj5(mx0Var2.c), null, ux2Var2, 0);
                                }
                                break;
                            case 4:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new oj5(mx0Var2.e), null, ux2Var2, 0);
                                }
                                break;
                            default:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new rj5(mx0Var2.d), null, ux2Var2, 0);
                                }
                                break;
                        }
                        return f88Var;
                    }
                });
                int iOrdinal2 = cj5Var2.b.ordinal();
                if (iOrdinal2 == 0) {
                    arrayList.add(yy0Var2);
                } else {
                    if (iOrdinal2 != 1) {
                        gk0.s();
                        return;
                    }
                    arrayList2.add(yy0Var2);
                }
            }
            cj5 cj5Var3 = hj5Var.g;
            if (cj5Var3.a) {
                yy0 yy0Var3 = new yy0(421597277, true, new hw2() { // from class: o.ij5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b;
                        f88 f88Var = f88.a;
                        mx0 mx0Var2 = mx0Var;
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b5) {
                            case 0:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new qj5(mx0Var2.a), null, ux2Var2, 0);
                                }
                                break;
                            case 1:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new pj5(mx0Var2.b), null, ux2Var2, 0);
                                }
                                break;
                            case 2:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new mj5(mx0Var2.f), null, ux2Var2, 0);
                                }
                                break;
                            case 3:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new nj5(mx0Var2.c), null, ux2Var2, 0);
                                }
                                break;
                            case 4:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new oj5(mx0Var2.e), null, ux2Var2, 0);
                                }
                                break;
                            default:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new rj5(mx0Var2.d), null, ux2Var2, 0);
                                }
                                break;
                        }
                        return f88Var;
                    }
                });
                int iOrdinal3 = cj5Var3.b.ordinal();
                if (iOrdinal3 == 0) {
                    arrayList.add(yy0Var3);
                } else {
                    if (iOrdinal3 != 1) {
                        gk0.s();
                        return;
                    }
                    arrayList2.add(yy0Var3);
                }
            }
            cj5 cj5Var4 = hj5Var.d;
            if (cj5Var4.a) {
                final byte b5 = 3;
                yy0 yy0Var4 = new yy0(657767100, true, new hw2() { // from class: o.ij5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b6 = b5;
                        f88 f88Var = f88.a;
                        mx0 mx0Var2 = mx0Var;
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b6) {
                            case 0:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new qj5(mx0Var2.a), null, ux2Var2, 0);
                                }
                                break;
                            case 1:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new pj5(mx0Var2.b), null, ux2Var2, 0);
                                }
                                break;
                            case 2:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new mj5(mx0Var2.f), null, ux2Var2, 0);
                                }
                                break;
                            case 3:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new nj5(mx0Var2.c), null, ux2Var2, 0);
                                }
                                break;
                            case 4:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new oj5(mx0Var2.e), null, ux2Var2, 0);
                                }
                                break;
                            default:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new rj5(mx0Var2.d), null, ux2Var2, 0);
                                }
                                break;
                        }
                        return f88Var;
                    }
                });
                int iOrdinal4 = cj5Var4.b.ordinal();
                if (iOrdinal4 == 0) {
                    arrayList.add(yy0Var4);
                } else {
                    if (iOrdinal4 != 1) {
                        gk0.s();
                        return;
                    }
                    arrayList2.add(yy0Var4);
                }
            }
            cj5 cj5Var5 = hj5Var.f;
            if (cj5Var5.a) {
                yy0 yy0Var5 = new yy0(893936923, true, new hw2() { // from class: o.ij5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b6 = b2;
                        f88 f88Var = f88.a;
                        mx0 mx0Var2 = mx0Var;
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b6) {
                            case 0:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new qj5(mx0Var2.a), null, ux2Var2, 0);
                                }
                                break;
                            case 1:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new pj5(mx0Var2.b), null, ux2Var2, 0);
                                }
                                break;
                            case 2:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new mj5(mx0Var2.f), null, ux2Var2, 0);
                                }
                                break;
                            case 3:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new nj5(mx0Var2.c), null, ux2Var2, 0);
                                }
                                break;
                            case 4:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new oj5(mx0Var2.e), null, ux2Var2, 0);
                                }
                                break;
                            default:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new rj5(mx0Var2.d), null, ux2Var2, 0);
                                }
                                break;
                        }
                        return f88Var;
                    }
                });
                int iOrdinal5 = cj5Var5.b.ordinal();
                if (iOrdinal5 == 0) {
                    arrayList.add(yy0Var5);
                } else {
                    if (iOrdinal5 != 1) {
                        gk0.s();
                        return;
                    }
                    arrayList2.add(yy0Var5);
                }
            }
            cj5 cj5Var6 = hj5Var.e;
            final byte b6 = 5;
            if (cj5Var6.a) {
                yy0 yy0Var6 = new yy0(1130106746, true, new hw2() { // from class: o.ij5
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b7 = b6;
                        f88 f88Var = f88.a;
                        mx0 mx0Var2 = mx0Var;
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b7) {
                            case 0:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new qj5(mx0Var2.a), null, ux2Var2, 0);
                                }
                                break;
                            case 1:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new pj5(mx0Var2.b), null, ux2Var2, 0);
                                }
                                break;
                            case 2:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new mj5(mx0Var2.f), null, ux2Var2, 0);
                                }
                                break;
                            case 3:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new nj5(mx0Var2.c), null, ux2Var2, 0);
                                }
                                break;
                            case 4:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new oj5(mx0Var2.e), null, ux2Var2, 0);
                                }
                                break;
                            default:
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    it1.e(new rj5(mx0Var2.d), null, ux2Var2, 0);
                                }
                                break;
                        }
                        return f88Var;
                    }
                });
                int iOrdinal6 = cj5Var6.b.ordinal();
                if (iOrdinal6 == 0) {
                    arrayList.add(yy0Var6);
                } else {
                    if (iOrdinal6 != 1) {
                        gk0.s();
                        return;
                    }
                    arrayList2.add(yy0Var6);
                }
            }
            arrayList2.add(new yy0(-1290127736, true, new gg4(hj5Var, b6)));
            List<cw6> listL = qf0.L(new cw6(R.string.permissions_recommended, arrayList), new cw6(R.string.permissions_optional, arrayList2));
            fs4 fs4VarZ = im3.Z(fs4Var.f(androidx.compose.foundation.layout.b.c), im3.W(ux2Var), true);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarZ);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-1349120354);
            for (cw6 cw6Var : listL) {
                i67.b(m77.z(cw6Var.a, ux2Var), cw6Var.b, null, null, null, ux2Var, 0);
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) mx0Var, (Object) hj5Var, (Object) fs4Var, i, (byte) 15);
        }
    }

    public static final void h(List list, UUID uuid, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        Object obj = function1;
        ux2 ux2Var2 = ux2Var;
        list.getClass();
        obj.getClass();
        ux2Var2.Y(-759981890);
        int i2 = i | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.h(uuid) ? 32 : 16) | (ux2Var2.h(obj) ? 256 : 128);
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 16.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
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
            String strZ = m77.z(R.string.device_tab_device_edit_select_policy, ux2Var2);
            ot7 ot7Var = ((rn4) ux2Var2.j(un4.a)).b.g;
            cs4 cs4Var = cs4.b;
            qs7.b(strZ, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 40.0f), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 48, 0, 130044);
            lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
            ux2Var2 = ux2Var;
            fs4 fs4VarF = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 448.0f, 1);
            pd5 pd5VarJ = ka0.j(0.0f, 24.0f, 0.0f, 0.0f, 13);
            boolean zH = ux2Var2.h(uuid) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objK = ux2Var2.K();
            if (zH || objK == e01.a) {
                obj = function1;
                objK = new xn5(list, uuid, obj, (byte) 0);
                ux2Var2.g0(objK);
            } else {
                obj = function1;
            }
            yo1.i(390, 506, (Function1) objK, null, null, null, null, ux2Var2, null, fs4VarF, pd5VarJ, false);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) list, (Object) uuid, obj, (Object) fs4Var, i, (byte) 12);
        }
    }

    public static final void i(final String str, final int i, final boolean z, final Function0 function0, final fs4 fs4Var, ux2 ux2Var, final int i2) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-742382531);
        byte b = 2;
        int i3 = (ux2Var2.f(str) ? 4 : 2) | i2 | (ux2Var2.d(i) ? 32 : 16) | (ux2Var2.g(z) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 16384 : 8192;
        }
        int i4 = i3;
        if (ux2Var2.N(i4 & 1, (i4 & 9363) != 9362)) {
            fs4 fs4VarE = ka0.E(g68.A(androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 56.0f, 0.0f, 2), z, new pe6(3), function0), 16.0f, 8.0f, 8.0f, 8.0f);
            dg6 dg6VarA = cg6.a(new ew(16.0f, new hk0(b)), xz2.y, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarE);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            td3.b(lv1.T(i, ux2Var2, (i4 >> 3) & 14), null, androidx.compose.foundation.layout.b.l(cs4.b, 24.0f), rv0.h, ux2Var2, 3512, 0);
            qs7.b(str, new s14(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var, i4 & 14, 24960, 110588);
            bt1.j(z, null, false, null, ux2Var, ((i4 >> 6) & 14) | 48, 60);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.yn5
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ct1.i(str, i, z, function0, fs4Var, (ux2) obj, yo1.Y(i2 | 1));
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0307  */
    /* JADX WARN: Code duplicated, block: B:105:0x0313  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x0168  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0223  */
    /* JADX WARN: Code duplicated, block: B:91:0x0273  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:95:0x0298  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02de  */
    public static final void j(yy0 yy0Var, vt5 vt5Var, ut5 ut5Var, tt5 tt5Var, fs4 fs4Var, Function0 function0, Function0 function1, ux2 ux2Var, int i, int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        int i5;
        int i6;
        Function0 function2;
        int i7;
        int i8;
        boolean z;
        ux2 ux2Var2;
        fs4 fs4Var3;
        Function0 function3;
        j56 j56VarR;
        cs4 cs4Var;
        fs4 fs4Var4;
        Object objK;
        aw awVar;
        px4 px4Var;
        Object objK2;
        px4 px4VarT;
        boolean zF;
        Object objK3;
        l64 l64Var;
        x50 x50Var;
        h72 h72Var;
        l64 l64Var2;
        h72 h72Var2;
        cs4 cs4Var2;
        x50 x50Var2;
        fs4 fs4VarB;
        boolean z2;
        tg3 tg3Var;
        fs4 fs4VarB2;
        Integer num;
        Function0 function4;
        tt5 tt5Var2 = tt5Var;
        w50 w50Var = xz2.A;
        bw bwVar = iq8.c;
        ux2Var.Y(1742778323);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(yy0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i3 | (ux2Var.f(vt5Var) ? 32 : 16) | (ux2Var.f(ut5Var) ? 256 : 128) | (ux2Var.f(tt5Var2) ? 2048 : 1024);
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                fs4Var2 = fs4Var;
                i9 |= ux2Var.f(fs4Var2) ? 16384 : 8192;
            }
            if (ux2Var.h(function0)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i5 = i9 | i4;
            i6 = i2 & 64;
            if (i6 != 0) {
                i5 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i & 1572864) == 0) {
                    if (ux2Var.h(function2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
            }
            i8 = i5;
            if ((i8 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i8 & 1, z)) {
                cs4Var = cs4.b;
                if (i10 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i6 != 0) {
                    function2 = null;
                }
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = h57.p(Boolean.FALSE);
                    ux2Var.g0(objK);
                }
                px4Var = (px4) objK;
                objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = h57.p(Boolean.FALSE);
                    ux2Var.g0(objK2);
                }
                px4 px4Var2 = (px4) objK2;
                px4VarT = h57.t(function2, ux2Var);
                zF = ux2Var.f(px4VarT);
                objK3 = ux2Var.K();
                if (zF || objK3 == awVar) {
                    objK3 = new r11(px4VarT, null, (byte) 2);
                    ux2Var.g0(objK3);
                }
                ck3.i(f88.a, (hw2) objK3, ux2Var);
                l64 l64Var3 = new l64(vt5Var, px4Var, (byte) 12);
                l64Var = new l64(ut5Var, px4Var2, (byte) 13);
                if (!((Boolean) px4Var.getValue()).booleanValue() || ((Boolean) px4Var2.getValue()).booleanValue()) {
                    x50Var = xz2.x;
                } else {
                    x50Var = xz2.y;
                }
                fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var4, 1.0f);
                h72Var = un4.a;
                fs4 fs4Var5 = fs4Var4;
                fs4 fs4VarJ = iq8.j(au8.s(uf0.i(fs4VarC, 1.0f, ((rn4) ux2Var.j(h72Var)).a.B, sf6.a(12.0f)), ((rn4) ux2Var.j(h72Var)).a.r, sf6.a(12.0f)), sf6.a(12.0f));
                if (function0 != null) {
                    h72Var2 = h72Var;
                    l64Var2 = l64Var;
                    cs4Var2 = cs4Var;
                    x50Var2 = x50Var;
                    fs4VarB = androidx.compose.foundation.b.b(cs4Var2, false, null, null, function0, 15);
                } else {
                    l64Var2 = l64Var;
                    h72Var2 = h72Var;
                    cs4Var2 = cs4Var;
                    x50Var2 = x50Var;
                    fs4VarB = cs4Var2;
                }
                fs4 fs4VarF = ka0.F(fs4VarJ.f(fs4VarB), 16.0f, 16.0f, 0.0f, 16.0f, 4);
                dg6 dg6VarA = cg6.a(iq8.a, x50Var2, ux2Var, 0);
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
                yz0.c.getClass();
                ux2Var.a0();
                z2 = ux2Var.S;
                tg3Var = LayoutNode.e0;
                if (z2) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                iz0 iz0Var = d82.v;
                o67.n(dg6VarA, iz0Var, ux2Var);
                iz0 iz0Var2 = d82.u;
                o67.n(yj5VarL, iz0Var2, ux2Var);
                Integer numValueOf = Integer.valueOf(iHashCode);
                iz0 iz0Var3 = d82.w;
                o67.n(numValueOf, iz0Var3, ux2Var);
                o67.l(ux2Var);
                iz0 iz0Var4 = d82.t;
                o67.n(fs4VarS, iz0Var4, ux2Var);
                ux2Var.W(-444746808);
                fs4VarB2 = cs4Var2;
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(ka0.F(fs4VarB2, 0.0f, 0.0f, 16.0f, 0.0f, 11), 56.0f);
                kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 0);
                int iHashCode2 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL2 = ux2Var.l();
                fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarL);
                ux2Var.a0();
                l64 l64Var4 = l64Var2;
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(kw0VarA, iz0Var, ux2Var);
                o67.n(yj5VarL2, iz0Var2, ux2Var);
                e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS2, iz0Var4, ux2Var);
                yy0Var.invoke(ux2Var, Integer.valueOf(i8 & 14));
                ux2Var.p(true);
                ux2Var.p(false);
                fs4 fs4VarF2 = ka0.F(new s14(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var, 0);
                int iHashCode3 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL3 = ux2Var.l();
                fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarF2);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(kw0VarA2, iz0Var, ux2Var);
                o67.n(yj5VarL3, iz0Var2, ux2Var);
                e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS3, iz0Var4, ux2Var);
                l64Var3.invoke(ux2Var, 0);
                l64Var4.invoke(ux2Var, 0);
                ux2Var.p(true);
                tt5Var2 = tt5Var;
                num = tt5Var2.a;
                if (num == null) {
                    ux2Var.W(-444333052);
                    ux2Var.p(false);
                    ux2Var2 = ux2Var;
                } else {
                    ux2Var.W(-444333051);
                    ud5 ud5VarT = lv1.T(num.intValue(), ux2Var, 0);
                    String str = tt5Var2.b;
                    long j = ((rn4) ux2Var.j(h72Var2)).a.q;
                    fs4 fs4VarL2 = androidx.compose.foundation.layout.b.l(iq8.j(ka0.F(fs4VarB2, 0.0f, 0.0f, 16.0f, 0.0f, 11), sf6.a), 24.0f);
                    function4 = tt5Var2.c;
                    if (function4 != null) {
                        fs4VarB2 = androidx.compose.foundation.b.b(fs4VarB2, false, null, null, function4, 15);
                    }
                    ux2Var2 = ux2Var;
                    td3.b(ud5VarT, str, fs4VarL2.f(fs4VarB2), j, ux2Var2, 8, 0);
                    ux2Var2.p(false);
                }
                ux2Var2.p(true);
                function3 = function2;
                fs4Var3 = fs4Var5;
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.Q();
                fs4Var3 = fs4Var2;
                function3 = function2;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new ex0(yy0Var, vt5Var, ut5Var, tt5Var2, fs4Var3, function0, function3, i, i2);
            }
        }
        i9 |= 24576;
        fs4Var2 = fs4Var;
        if (ux2Var.h(function0)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        i5 = i9 | i4;
        i6 = i2 & 64;
        if (i6 != 0) {
            i5 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i & 1572864) == 0) {
                if (ux2Var.h(function2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
        }
        i8 = i5;
        if ((i8 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i8 & 1, z)) {
            cs4Var = cs4.b;
            if (i10 != 0) {
                fs4Var4 = cs4Var;
            } else {
                fs4Var4 = fs4Var2;
            }
            if (i6 != 0) {
                function2 = null;
            }
            objK = ux2Var.K();
            awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4Var = (px4) objK;
            objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK2);
            }
            px4 px4Var3 = (px4) objK2;
            px4VarT = h57.t(function2, ux2Var);
            zF = ux2Var.f(px4VarT);
            objK3 = ux2Var.K();
            if (zF) {
                objK3 = new r11(px4VarT, null, (byte) 2);
                ux2Var.g0(objK3);
            } else {
                objK3 = new r11(px4VarT, null, (byte) 2);
                ux2Var.g0(objK3);
            }
            ck3.i(f88.a, (hw2) objK3, ux2Var);
            l64 l64Var5 = new l64(vt5Var, px4Var, (byte) 12);
            l64Var = new l64(ut5Var, px4Var3, (byte) 13);
            if (((Boolean) px4Var.getValue()).booleanValue()) {
                x50Var = xz2.x;
            } else {
                x50Var = xz2.x;
            }
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(fs4Var4, 1.0f);
            h72Var = un4.a;
            fs4 fs4Var6 = fs4Var4;
            fs4 fs4VarJ2 = iq8.j(au8.s(uf0.i(fs4VarC2, 1.0f, ((rn4) ux2Var.j(h72Var)).a.B, sf6.a(12.0f)), ((rn4) ux2Var.j(h72Var)).a.r, sf6.a(12.0f)), sf6.a(12.0f));
            if (function0 != null) {
                h72Var2 = h72Var;
                l64Var2 = l64Var;
                cs4Var2 = cs4Var;
                x50Var2 = x50Var;
                fs4VarB = androidx.compose.foundation.b.b(cs4Var2, false, null, null, function0, 15);
            } else {
                l64Var2 = l64Var;
                h72Var2 = h72Var;
                cs4Var2 = cs4Var;
                x50Var2 = x50Var;
                fs4VarB = cs4Var2;
            }
            fs4 fs4VarF3 = ka0.F(fs4VarJ2.f(fs4VarB), 16.0f, 16.0f, 0.0f, 16.0f, 4);
            dg6 dg6VarA2 = cg6.a(iq8.a, x50Var2, ux2Var, 0);
            int iHashCode4 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL4 = ux2Var.l();
            fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarF3);
            yz0.c.getClass();
            ux2Var.a0();
            z2 = ux2Var.S;
            tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var5 = d82.v;
            o67.n(dg6VarA2, iz0Var5, ux2Var);
            iz0 iz0Var6 = d82.u;
            o67.n(yj5VarL4, iz0Var6, ux2Var);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            iz0 iz0Var7 = d82.w;
            o67.n(numValueOf2, iz0Var7, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var8 = d82.t;
            o67.n(fs4VarS4, iz0Var8, ux2Var);
            ux2Var.W(-444746808);
            fs4VarB2 = cs4Var2;
            fs4 fs4VarL3 = androidx.compose.foundation.layout.b.l(ka0.F(fs4VarB2, 0.0f, 0.0f, 16.0f, 0.0f, 11), 56.0f);
            kw0 kw0VarA3 = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode5 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL5 = ux2Var.l();
            fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarL3);
            ux2Var.a0();
            l64 l64Var6 = l64Var2;
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA3, iz0Var5, ux2Var);
            o67.n(yj5VarL5, iz0Var6, ux2Var);
            e41.r(iHashCode5, ux2Var, iz0Var7, ux2Var);
            o67.n(fs4VarS5, iz0Var8, ux2Var);
            yy0Var.invoke(ux2Var, Integer.valueOf(i8 & 14));
            ux2Var.p(true);
            ux2Var.p(false);
            fs4 fs4VarF4 = ka0.F(new s14(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            kw0 kw0VarA4 = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode6 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL6 = ux2Var.l();
            fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarF4);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA4, iz0Var5, ux2Var);
            o67.n(yj5VarL6, iz0Var6, ux2Var);
            e41.r(iHashCode6, ux2Var, iz0Var7, ux2Var);
            o67.n(fs4VarS6, iz0Var8, ux2Var);
            l64Var5.invoke(ux2Var, 0);
            l64Var6.invoke(ux2Var, 0);
            ux2Var.p(true);
            tt5Var2 = tt5Var;
            num = tt5Var2.a;
            if (num == null) {
                ux2Var.W(-444333052);
                ux2Var.p(false);
                ux2Var2 = ux2Var;
            } else {
                ux2Var.W(-444333051);
                ud5 ud5VarT2 = lv1.T(num.intValue(), ux2Var, 0);
                String str2 = tt5Var2.b;
                long j2 = ((rn4) ux2Var.j(h72Var2)).a.q;
                fs4 fs4VarL4 = androidx.compose.foundation.layout.b.l(iq8.j(ka0.F(fs4VarB2, 0.0f, 0.0f, 16.0f, 0.0f, 11), sf6.a), 24.0f);
                function4 = tt5Var2.c;
                if (function4 != null) {
                    fs4VarB2 = androidx.compose.foundation.b.b(fs4VarB2, false, null, null, function4, 15);
                }
                ux2Var2 = ux2Var;
                td3.b(ud5VarT2, str2, fs4VarL4.f(fs4VarB2), j2, ux2Var2, 8, 0);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            function3 = function2;
            fs4Var3 = fs4Var6;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var3 = fs4Var2;
            function3 = function2;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ex0(yy0Var, vt5Var, ut5Var, tt5Var2, fs4Var3, function0, function3, i, i2);
        }
    }

    public static final void k(final yl6 yl6Var, final nl6 nl6Var, final ql6 ql6Var, final float f, ux2 ux2Var, final int i) {
        int i2;
        nl6 nl6Var2;
        float f2;
        ux2Var.Y(-1078689835);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(yl6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(nl6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(ql6Var) : ux2Var.h(ql6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.c(f) ? 2048 : 1024;
        }
        byte b = 0;
        byte b2 = 1;
        if (!ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            nl6Var2 = nl6Var;
            f2 = f;
            ux2Var.Q();
        } else {
            if (!ql6Var.equals(ol6.a)) {
                j56 j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    final byte b3 = 0;
                    j56VarR.d = new hw2() { // from class: o.im6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            int i3 = i;
                            switch (b4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i3 | 1);
                                    ct1.k(yl6Var, nl6Var, ql6Var, f, (ux2) obj, iY);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(i3 | 1);
                                    ct1.k(yl6Var, nl6Var, ql6Var, f, (ux2) obj, iY2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    return;
                }
                return;
            }
            nl6Var2 = nl6Var;
            f2 = f;
            fs4 fs4VarE = ka0.E(cs4.b, 24.0f, 24.0f, 24.0f, f2);
            boolean z = yl6Var.d;
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 4) | (i4 == 32);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                objK = new jm6(yl6Var, nl6Var2, b);
                ux2Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            int i5 = (i3 == 4 ? (byte) 1 : (byte) 0) | (i4 == 32 ? (byte) 1 : (byte) 0);
            Object objK2 = ux2Var.K();
            if (i5 != 0 || objK2 == awVar) {
                objK2 = new jm6(yl6Var, nl6Var2, b2);
                ux2Var.g0(objK2);
            }
            et1.i(0, 0, function0, (Function0) objK2, ux2Var, fs4VarE, z);
        }
        j56 j56VarR2 = ux2Var.r();
        if (j56VarR2 != null) {
            final byte b4 = 1;
            final nl6 nl6Var3 = nl6Var2;
            final float f3 = f2;
            j56VarR2.d = new hw2() { // from class: o.im6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b5 = b4;
                    f88 f88Var = f88.a;
                    int i6 = i;
                    switch (b5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i6 | 1);
                            ct1.k(yl6Var, nl6Var3, ql6Var, f3, (ux2) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = yo1.Y(i6 | 1);
                            ct1.k(yl6Var, nl6Var3, ql6Var, f3, (ux2) obj, iY2);
                            break;
                    }
                    return f88Var;
                }
            };
        }
    }

    public static final void l(yl6 yl6Var, zl6 zl6Var, el6 el6Var, w44 w44Var, Function1 function1, Function1 function2, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        ux2Var.Y(-1274046292);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(yl6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.d(zl6Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(el6Var) : ux2Var.h(el6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(w44Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function1;
            i2 |= ux2Var.h(obj) ? 16384 : 8192;
        } else {
            obj = function1;
        }
        if ((196608 & i) == 0) {
            obj2 = function2;
            i2 |= ux2Var.h(obj2) ? 131072 : 65536;
        } else {
            obj2 = function2;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, "TVTA-searchScreen-resultsList");
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && ux2Var.h(el6Var))) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                l8 l8Var = new l8(yl6Var, zl6Var, el6Var, obj, obj2, (byte) 7);
                ux2Var.g0(l8Var);
                objK = l8Var;
            }
            yo1.i((i3 >> 6) & 112, 508, (Function1) objK, null, null, null, null, ux2Var, w44Var, fs4VarA, null, false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta(yl6Var, zl6Var, el6Var, w44Var, function1, function2, fs4Var, i);
        }
    }

    public static final void m(String str, zl6 zl6Var, Function1 function1, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        ux2Var.Y(1545044638);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.d(zl6Var.ordinal()) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128);
        if (!ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        } else if (str.length() > 0) {
            ux2Var.W(-739543774);
            int i3 = i2 >> 3;
            et1.l(zl6Var, function1, androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), ux2Var, (i3 & 112) | (i3 & 14) | 384);
            ux2Var.p(false);
            ux2Var2 = ux2Var;
        } else {
            ux2Var.W(-739381055);
            ux2Var2 = ux2Var;
            lv1.k(null, 0.0f, 0L, ux2Var2, 0, 7);
            ux2Var2.p(false);
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) str, (Object) zl6Var, (Object) function1, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    public static final void n(yl6 yl6Var, nl6 nl6Var, ql6 ql6Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        zl6 zl6Var;
        el6 dl6Var;
        el6 el6Var;
        int i3;
        boolean z;
        int i4;
        ux2 ux2Var2 = ux2Var;
        yl6Var.getClass();
        String str = yl6Var.a;
        boolean z2 = yl6Var.f2618o;
        ux2Var2.Y(-370186170);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(yl6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= ux2Var2.f(nl6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var2.f(ql6Var) : ux2Var2.h(ql6Var) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if (ux2Var2.N(i5 & 1, (i5 & 1171) != 1170)) {
            Context context = (Context) ux2Var2.j(lh.b);
            Object[] objArr = new Object[0];
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new w26(b);
                ux2Var2.g0(objK);
            }
            yf5 yf5Var = (yf5) zu1.L(objArr, (Function0) objK, ux2Var2, 48);
            float f = yf5Var.z() == 0 ? 24.0f : 12.0f;
            ll6 ll6Var = yl6Var.b;
            Set set = nm6.a;
            ll6Var.getClass();
            int iOrdinal = ll6Var.ordinal();
            if (iOrdinal == 0) {
                zl6Var = zl6.All;
            } else if (iOrdinal == 1) {
                zl6Var = zl6.Devices;
            } else if (iOrdinal == 2) {
                zl6Var = zl6.Contacts;
            } else {
                if (iOrdinal != 3) {
                    gk0.s();
                    return;
                }
                zl6Var = zl6.Groups;
            }
            w44 w44VarA = z44.a(0, 0, ux2Var2, 3);
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = ck3.w(ux2Var2);
                ux2Var2.g0(objK2);
            }
            me1 me1Var = (me1) objK2;
            if (ql6Var.equals(ol6.a)) {
                z31 z31Var = yl6Var.c;
                if (z31Var != null) {
                    dl6Var = new cl6(z31Var);
                    el6Var = dl6Var;
                } else {
                    el6Var = null;
                }
            } else {
                if (!(ql6Var instanceof pl6)) {
                    gk0.s();
                    return;
                }
                tx1 tx1Var = ((pl6) ql6Var).b;
                if (tx1Var != null) {
                    dl6Var = new dl6(tx1Var);
                    el6Var = dl6Var;
                } else {
                    el6Var = null;
                }
            }
            boolean zH = ux2Var2.h(context) | ux2Var2.f(yf5Var);
            Object objK3 = ux2Var2.K();
            if (zH || objK3 == awVar) {
                objK3 = new py5(context, yf5Var);
                ux2Var2.g0(objK3);
            }
            ck3.e(f88.a, (Function1) objK3, ux2Var2);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(mo8.A(mo8.A(fillElement, mo8.Y), mo8.Z), "TVTA-searchScreen-content");
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            el6 el6Var2 = el6Var;
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            boolean z4 = yl6Var.d;
            int i6 = i5 & 112;
            boolean z5 = i6 == 32;
            Object objK4 = ux2Var2.K();
            if (z5 || objK4 == awVar) {
                objK4 = new zi(nl6Var);
                ux2Var2.g0(objK4);
            }
            Function1 function1 = (Function1) ((pu3) objK4);
            int i7 = i5 & 14;
            boolean z6 = (i7 == 4) | (i6 == 32);
            Object objK5 = ux2Var2.K();
            if (z6 || objK5 == awVar) {
                objK5 = new jm6(yl6Var, nl6Var, (byte) 2);
                ux2Var2.g0(objK5);
            }
            Function0 function0 = (Function0) objK5;
            boolean z7 = i6 == 32;
            Object objK6 = ux2Var2.K();
            byte b2 = 9;
            if (z7 || objK6 == awVar) {
                objK6 = new y26(nl6Var, b2);
                ux2Var2.g0(objK6);
            }
            et1.k(ql6Var, str, z4, null, function1, function0, (Function0) objK6, nl6Var.d, ux2Var2, (i5 >> 6) & 14, 8);
            boolean zH2 = ux2Var2.h(me1Var) | (i6 == 32) | ux2Var2.f(w44VarA);
            Object objK7 = ux2Var2.K();
            if (zH2 || objK7 == awVar) {
                i3 = 0;
                objK7 = new lm6(nl6Var, me1Var, w44VarA, (byte) 0);
                ux2Var2.g0(objK7);
            } else {
                i3 = 0;
            }
            m(str, zl6Var, (Function1) ((pu3) objK7), ux2Var2, i3);
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var2, i3);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fillElement);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            s14 s14Var = new s14(1.0f, true);
            Function1 function2 = nl6Var.c;
            int i8 = (ux2Var2.h(me1Var) ? 1 : 0) | (i6 == 32 ? 1 : i3) | (ux2Var2.f(w44VarA) ? 1 : 0);
            Object objK8 = ux2Var2.K();
            if (i8 != 0 || objK8 == awVar) {
                z = true;
                objK8 = new lm6(nl6Var, me1Var, w44VarA, (byte) 1);
                ux2Var2.g0(objK8);
            } else {
                z = true;
            }
            boolean z8 = z;
            l(yl6Var, zl6Var, el6Var2, w44VarA, function2, (Function1) ((pu3) objK8), s14Var, ux2Var2, i7);
            ux2Var2 = ux2Var;
            k(yl6Var, nl6Var, ql6Var, f, ux2Var2, i5 & 1022);
            ux2Var2.p(z8);
            if (yl6Var.l) {
                ux2Var2.W(-1593697795);
                List list = yl6Var.m;
                boolean z9 = yl6Var.n;
                if (z9 && z2) {
                    i4 = R.string.select_group_device_description_file_transfer;
                } else if (z9) {
                    i4 = R.string.select_contact_device_description_file_transfer;
                } else {
                    i4 = z2 ? R.string.select_group_device_description_connect : R.string.select_contact_device_description_connect;
                }
                String strZ = m77.z(i4, ux2Var2);
                boolean z10 = !z2;
                Function0 function3 = nl6Var.h;
                boolean z11 = (i7 == 4 ? z8 : false) | (i6 == 32 ? z8 : false);
                Object objK9 = ux2Var2.K();
                if (z11 || objK9 == awVar) {
                    objK9 = new py5((Object) yl6Var, (Object) nl6Var, (byte) 9);
                    ux2Var2.g0(objK9);
                }
                io1.r(list, strZ, (Function1) objK9, function3, null, z10, "TVTA-searchScreen-selectDeviceBottomSheet", null, ux2Var, 1572864, 144);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1593002682);
                ux2Var2.p(false);
            }
            ux2Var2.p(z8);
            fs4Var2 = cs4.b;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) yl6Var, (Object) nl6Var, (Object) ql6Var, fs4Var2, i, (byte) 11);
        }
    }

    public static final void o(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(-1169572872);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new l5(b, null, (byte) 17);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new vs6(b);
                ux2Var.g0(objK2);
            }
            cs4 cs4Var = cs4.b;
            uf0.b(function0, au8.O(1470057024, new cu6(function0, b2), ux2Var), cp6.a(cs4Var, false, (Function1) objK2), null, j51.k, j51.l, null, 0L, 0L, 0L, 0L, null, ux2Var, (i3 & 14) | 1769520, 0, 16280);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a20(function0, fs4Var2, i, (byte) 5);
        }
    }

    public static float p(EdgeEffect edgeEffect, float f, float f2, in1 in1Var) {
        float f3 = u72.a;
        double density = in1Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) u72.a) * density;
        float fExp = (float) (Math.exp((u72.b / u72.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? nh.d(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iS0 = vn4.s0(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iS0);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iS0);
        }
        return f;
    }

    public static void q(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = mn3.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = ul5.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void r(boolean z, Number number) {
        if (z) {
            return;
        }
        yq4.g(46, number, "Step must be positive, was: ");
    }

    public static final vd5 s(jo4 jo4Var) {
        Charset charset = vn0.a;
        if (jo4Var != null) {
            e96 e96Var = jo4.e;
            Charset charsetA = jo4Var.a(null);
            if (charsetA == null) {
                try {
                    jo4Var = vt1.t(jo4Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    jo4Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new vd5(charset, jo4Var);
    }

    public static double t(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float u(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int v(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long w(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static byte[] x(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws GeneralSecurityException {
        Mac mac = (Mac) ab2.f.a(str);
        if (i > mac.getMacLength() * 255) {
            hk0.u("size too large");
            return null;
        }
        if (bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static r86 y(Class cls) throws InvocationTargetException {
        yy3 yy3Var;
        j36 j36Var;
        xy3 xy3Var;
        l36 l36Var = new l36();
        l36Var.m = null;
        l36Var.n = null;
        Object[] objArr = 0;
        l36Var.f1325o = 0;
        l36Var.p = null;
        l36Var.q = null;
        l36Var.r = null;
        l36Var.s = null;
        l36Var.t = null;
        j1 j1VarV = hm3.v(cls.getDeclaredAnnotations());
        while (true) {
            byte b = 1;
            if (!j1VarV.hasNext()) {
                break;
            }
            Annotation annotation = (Annotation) j1VarV.next();
            annotation.getClass();
            Class clsZ = et1.z(et1.x(annotation));
            js0 js0VarA = p76.a(clsZ);
            ht2 ht2VarA = js0VarA.a();
            if (ht2VarA.equals(tr3.a)) {
                j36Var = new j36(l36Var, objArr == true ? 1 : 0);
            } else if (ht2VarA.equals(tr3.f2136o)) {
                j36Var = new j36(l36Var, b);
            } else if (l36.u || l36Var.s != null || (xy3Var = (xy3) l36.v.get(js0VarA)) == null) {
                j36Var = null;
            } else {
                l36Var.s = xy3Var;
                j36Var = new j36(l36Var, (byte) 2);
            }
            if (j36Var != null) {
                vs1.Q(j36Var, annotation, clsZ);
            }
        }
        ps3 ps3Var = ps3.g;
        if (l36Var.s == null || l36Var.m == null) {
            yy3Var = null;
        } else {
            ps3 ps3Var2 = new ps3(l36Var.m, (l36Var.f1325o & 8) != 0);
            if (ps3Var2.b(ps3Var)) {
                xy3 xy3Var2 = l36Var.s;
                if ((xy3Var2 == xy3.CLASS || xy3Var2 == xy3.FILE_FACADE || xy3Var2 == xy3.MULTIFILE_CLASS_PART) && l36Var.p == null) {
                    yy3Var = null;
                }
            } else {
                l36Var.r = l36Var.p;
                l36Var.p = null;
            }
            String[] strArr = l36Var.t;
            if (strArr != null) {
                j70.a(strArr);
            }
            yy3Var = new yy3(l36Var.s, ps3Var2, l36Var.p, l36Var.r, l36Var.q, l36Var.n, l36Var.f1325o);
        }
        if (yy3Var == null) {
            return null;
        }
        return new r86(cls, yy3Var);
    }

    public static Bundle z(Parcel parcel, int i) {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iS);
        return bundle;
    }
}
