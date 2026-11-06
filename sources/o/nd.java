package o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.teamviewer.commonuilib.view.OpenGLView;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class nd implements p4 {
    public final /* synthetic */ byte m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1562o;

    public nd(byte b) {
        this.m = b;
        switch (b) {
            case 14:
                this.f1562o = new LinkedHashMap();
                break;
            default:
                this.n = 255;
                this.f1562o = null;
                break;
        }
    }

    public static nd f(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        int i2;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        byte b = 4;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new nd(b, fw0.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = tz5.e;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayObtainAttributes.getColor(1, 0) : 0;
        int i4 = 1;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i4) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = tz5.f;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i2 = 0;
                } else {
                    i2 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i4 = 1;
        }
        yt2 yt2Var = arrayList2.size() > 0 ? new yt2(arrayList2, arrayList) : null;
        if (yt2Var == null) {
            yt2Var = z ? new yt2(color, color2, color3) : new yt2(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                int[] iArr3 = (int[]) yt2Var.n;
                float[] fArr = (float[]) yt2Var.f2642o;
                if (i5 != 1) {
                    tileMode2 = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f, f2, f5, f6, iArr3, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) yt2Var.n, (float[]) yt2Var.f2642o);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr4 = (int[]) yt2Var.n;
            float[] fArr2 = (float[]) yt2Var.f2642o;
            if (i5 != 1) {
                tileMode = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr4, fArr2, tileMode);
        }
        return new nd((byte) 4, 0, radialGradient);
    }

    public static void g(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = im3.t(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        io.sentry.android.core.v0.j("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            io.sentry.android.core.v0.l("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a(long j) {
        if (d(j)) {
            return;
        }
        int i = this.n;
        long[] jArrCopyOf = (long[]) this.f1562o;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f1562o = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.n) {
            this.n = i + 1;
        }
    }

    public void b() {
        int i = this.n;
        this.n = i + 1;
        if (i >= 10) {
            this.n = 0;
            Iterator it = ((LinkedHashMap) this.f1562o).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    t46 t46Var = (t46) lv0.o0(arrayList);
                    if ((t46Var != null ? (xd3) t46Var.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((t46) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // o.p4
    public boolean c(View view) {
        ((BottomSheetBehavior) this.f1562o).B(this.n);
        return true;
    }

    public boolean d(long j) {
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f1562o)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public od e() {
        ListAdapter ldVar;
        jd jdVar = (jd) this.f1562o;
        ContextThemeWrapper contextThemeWrapper = jdVar.a;
        od odVar = new od(contextThemeWrapper, this.n);
        View view = jdVar.e;
        md mdVar = odVar.s;
        if (view != null) {
            mdVar.w = view;
        } else {
            CharSequence charSequence = jdVar.d;
            if (charSequence != null) {
                mdVar.d = charSequence;
                TextView textView = mdVar.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                mdVar.c.setTitle(charSequence);
            }
            Drawable drawable = jdVar.c;
            if (drawable != null) {
                mdVar.s = drawable;
                ImageView imageView = mdVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    mdVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = jdVar.f;
        if (charSequence2 != null) {
            mdVar.e = charSequence2;
            TextView textView2 = mdVar.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = jdVar.g;
        if (charSequence3 != null) {
            mdVar.c(-1, charSequence3, jdVar.h);
        }
        CharSequence charSequence4 = jdVar.i;
        if (charSequence4 != null) {
            mdVar.c(-2, charSequence4, jdVar.j);
        }
        CharSequence charSequence5 = jdVar.k;
        if (charSequence5 != null) {
            mdVar.c(-3, charSequence5, jdVar.l);
        }
        if (jdVar.f1150o != null || jdVar.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) jdVar.b.inflate(mdVar.A, (ViewGroup) null);
            if (jdVar.t) {
                ldVar = new gd(jdVar, contextThemeWrapper, mdVar.B, jdVar.f1150o, alertController$RecycleListView);
            } else {
                int i = jdVar.u ? mdVar.C : mdVar.D;
                ldVar = jdVar.p;
                if (ldVar == null) {
                    ldVar = new ld(contextThemeWrapper, i, R.id.text1, jdVar.f1150o);
                }
            }
            mdVar.x = ldVar;
            mdVar.y = jdVar.v;
            if (jdVar.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new hd(jdVar, mdVar));
            } else if (jdVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new id(jdVar, alertController$RecycleListView, mdVar));
            }
            if (jdVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (jdVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            mdVar.f = alertController$RecycleListView;
        }
        View view2 = jdVar.r;
        if (view2 != null) {
            mdVar.g = view2;
            mdVar.h = false;
        }
        odVar.setCancelable(jdVar.m);
        if (jdVar.m) {
            odVar.setCanceledOnTouchOutside(true);
        }
        odVar.setOnCancelListener(null);
        odVar.setOnDismissListener(null);
        lp4 lp4Var = jdVar.n;
        if (lp4Var != null) {
            odVar.setOnKeyListener(lp4Var);
        }
        return odVar;
    }

    public void h(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f1562o;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f1562o = Arrays.copyOf(cArr, i3);
        }
    }

    public boolean i() {
        return ((r62) this.f1562o) != null;
    }

    public void j(int i, xx xxVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            xx xxVar2 = ((xx[]) this.f1562o)[i2];
            xxVar2.getClass();
            if (im3.u(0L, xxVar.g - xxVar2.g) <= 0) {
                break;
            }
            xxVar2.f = i;
            ((xx[]) this.f1562o)[i] = xxVar2;
            i = i2;
        }
        ((xx[]) this.f1562o)[i] = xxVar;
        xxVar.f = i;
    }

    public void k(jv2 jv2Var, int i, int i2) {
        ((ve6) this.f1562o).e(new ze7(jv2Var), i, i2);
    }

    public lq3 l() {
        lq3 cr3Var;
        Object obj;
        r8 r8Var = (r8) this.f1562o;
        byte bC = r8Var.C();
        if (bC == 1) {
            return o(true);
        }
        if (bC == 0) {
            return o(false);
        }
        if (bC != 6) {
            if (bC == 8) {
                return m();
            }
            r8.r(r8Var, "Cannot read Json element because of unexpected ".concat(e8.A(bC)), 0, null, 6);
            throw null;
        }
        int i = this.n + 1;
        this.n = i;
        if (i == 200) {
            lr3 lr3Var = new lr3(this, null);
            ij1 ij1Var = new ij1();
            ij1Var.m = lr3Var;
            ij1Var.n = ij1Var;
            ne1 ne1Var = e8.m;
            ij1Var.f1067o = ne1Var;
            while (true) {
                obj = ij1Var.f1067o;
                hc1 hc1Var = ij1Var.n;
                if (hc1Var == null) {
                    break;
                }
                if (im3.n(ne1Var, obj)) {
                    try {
                        lr3 lr3Var2 = ij1Var.m;
                        e8.i(3, lr3Var2);
                        lr3 lr3Var3 = new lr3(lr3Var2.p, hc1Var);
                        lr3Var3.f1397o = ij1Var;
                        Object objInvokeSuspend = lr3Var3.invokeSuspend(f88.a);
                        if (objInvokeSuspend != ne1.m) {
                            hc1Var.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        hc1Var.resumeWith(new sc6(th));
                    }
                } else {
                    ij1Var.f1067o = ne1Var;
                    hc1Var.resumeWith(obj);
                }
            }
            ct1.a0(obj);
            cr3Var = (lq3) obj;
        } else {
            byte bH = r8Var.h((byte) 6);
            if (r8Var.C() == 4) {
                r8.r(r8Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (r8Var.c()) {
                String strL = r8Var.l();
                r8Var.h((byte) 5);
                linkedHashMap.put(strL, l());
                bH = r8Var.g();
                if (bH != 4) {
                    if (bH == 7) {
                        break;
                    }
                    r8.r(r8Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bH == 6) {
                r8Var.h((byte) 7);
            } else if (bH == 4) {
                vs1.D(r8Var, "object");
                throw null;
            }
            cr3Var = new cr3(linkedHashMap);
        }
        this.n--;
        return cr3Var;
    }

    public xp3 m() {
        r8 r8Var = (r8) this.f1562o;
        byte bG = r8Var.g();
        if (r8Var.C() == 4) {
            r8.r(r8Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (r8Var.c()) {
            arrayList.add(l());
            bG = r8Var.g();
            if (bG != 4) {
                boolean z = bG == 9;
                int i = r8Var.b;
                if (!z) {
                    r8.r(r8Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            r8Var.h((byte) 9);
        } else if (bG == 4) {
            vs1.D(r8Var, "array");
            throw null;
        }
        return new xp3(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object n(ij1 ij1Var, i30 i30Var) {
        mr3 mr3Var;
        LinkedHashMap linkedHashMap;
        ij1 ij1Var2;
        byte bG;
        nd ndVar;
        r8 r8Var;
        r8 r8Var2 = (r8) this.f1562o;
        if (i30Var instanceof mr3) {
            mr3Var = (mr3) i30Var;
            int i = mr3Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                mr3Var.t = i - Integer.MIN_VALUE;
            } else {
                mr3Var = new mr3(this, i30Var);
            }
        } else {
            mr3Var = new mr3(this, i30Var);
        }
        Object obj = mr3Var.r;
        int i2 = mr3Var.t;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = mr3Var.q;
            String str = mr3Var.p;
            linkedHashMap = mr3Var.f1500o;
            ndVar = mr3Var.n;
            ij1Var2 = mr3Var.m;
            ct1.a0(obj);
            linkedHashMap.put(str, (lq3) obj);
            bG = ((r8) ndVar.f1562o).g();
            if (bG == 4) {
                i3 = i4;
                this = ndVar;
            } else if (bG != 7) {
                r8.r((r8) ndVar.f1562o, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            r8Var = (r8) ndVar.f1562o;
            if (bG == 6) {
                r8Var.h((byte) 7);
            } else if (bG == 4) {
                vs1.D(r8Var, "object");
                throw null;
            }
            return new cr3(linkedHashMap);
        }
        ct1.a0(obj);
        byte bH = r8Var2.h((byte) 6);
        if (r8Var2.C() == 4) {
            r8.r(r8Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        ij1Var2 = ij1Var;
        bG = bH;
        r8 r8Var3 = (r8) this.f1562o;
        if (!r8Var3.c()) {
            ndVar = this;
            r8Var = (r8) ndVar.f1562o;
            if (bG == 6) {
                r8Var.h((byte) 7);
            } else if (bG == 4) {
                vs1.D(r8Var, "object");
                throw null;
            }
            return new cr3(linkedHashMap);
        }
        String strL = r8Var3.l();
        r8Var3.h((byte) 5);
        mr3Var.m = ij1Var2;
        mr3Var.n = this;
        mr3Var.f1500o = linkedHashMap;
        mr3Var.p = strL;
        mr3Var.q = i3;
        mr3Var.t = 1;
        ij1Var2.getClass();
        ij1Var2.n = mr3Var;
        return ne1.m;
    }

    public gr3 o(boolean z) {
        r8 r8Var = (r8) this.f1562o;
        String strM = !z ? r8Var.m() : r8Var.l();
        return (z || !im3.n(strM, "null")) ? new wq3(strM, z) : zq3.INSTANCE;
    }

    public void p() {
        mn0 mn0Var = mn0.c;
        char[] cArr = (char[]) this.f1562o;
        mn0Var.getClass();
        cArr.getClass();
        synchronized (mn0Var) {
            int i = mn0Var.b;
            if (cArr.length + i < yw.a) {
                mn0Var.b = i + cArr.length;
                mn0Var.a.addLast(cArr);
            }
        }
    }

    public void q(long j) {
        int i = this.n;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f1562o)[i2]) {
                int i3 = this.n - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f1562o;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.n--;
                return;
            }
            i2++;
        }
    }

    public void r(xx xxVar) {
        xx xxVar2;
        int i = xxVar.f;
        if (i == -1) {
            hk0.g("Failed requirement.");
            return;
        }
        int i2 = this.n;
        xx xxVar3 = ((xx[]) this.f1562o)[i2];
        xxVar3.getClass();
        xxVar.f = -1;
        ((xx[]) this.f1562o)[i2] = null;
        this.n = i2 - 1;
        if (xxVar == xxVar3) {
            return;
        }
        int iU = im3.u(0L, xxVar3.g - xxVar.g);
        if (iU == 0) {
            ((xx[]) this.f1562o)[i] = xxVar3;
            xxVar3.f = i;
            return;
        }
        if (iU >= 0) {
            j(i, xxVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.n;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                xxVar2 = ((xx[]) this.f1562o)[i3];
                xxVar2.getClass();
            } else {
                xxVar2 = ((xx[]) this.f1562o)[i3];
                xxVar2.getClass();
                xx xxVar4 = ((xx[]) this.f1562o)[i4];
                xxVar4.getClass();
                if (im3.u(0L, xxVar4.g - xxVar2.g) >= 0) {
                    xxVar2 = xxVar4;
                }
            }
            if (im3.u(0L, xxVar2.g - xxVar3.g) <= 0) {
                break;
            }
            int i6 = xxVar2.f;
            xxVar2.f = i;
            ((xx[]) this.f1562o)[i] = xxVar2;
            i = i6;
        }
        ((xx[]) this.f1562o)[i] = xxVar3;
        xxVar3.f = i;
    }

    public void s(cp4 cp4Var, xd3 xd3Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1562o;
        Object arrayList = linkedHashMap.get(cp4Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(cp4Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        t46 t46Var = new t46(new WeakReference(xd3Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(t46Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                t46 t46Var2 = (t46) arrayList2.get(i);
                if (j >= t46Var2.c) {
                    if (t46Var2.a.get() == xd3Var) {
                        arrayList2.set(i, t46Var);
                        break;
                    } else {
                        arrayList2.add(i, t46Var);
                        break;
                    }
                }
            }
        }
        b();
    }

    public void t(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        h(this.n, length);
        str.getChars(0, str.length(), (char[]) this.f1562o, this.n);
        this.n += length;
    }

    public String toString() {
        switch (this.m) {
            case 8:
                return new String((char[]) this.f1562o, 0, this.n);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nd(byte b, boolean z) {
        this.m = b;
    }

    public /* synthetic */ nd(Object obj, byte b) {
        this.m = b;
        this.f1562o = obj;
    }

    public nd(w41 w41Var, int i) {
        this.m = (byte) 17;
        nv1.s(w41Var);
        this.f1562o = w41Var;
        this.n = i;
    }

    public nd(OpenGLView openGLView) {
        this.m = (byte) 2;
        this.f1562o = openGLView;
        this.n = openGLView.getVisibility();
        openGLView.addOnAttachStateChangeListener(new a0(this, (byte) 2));
    }

    public nd(dq3 dq3Var, r8 r8Var) {
        this.m = (byte) 9;
        this.f1562o = r8Var;
    }

    public /* synthetic */ nd(byte b, int i, Object obj) {
        this.m = b;
        this.f1562o = obj;
        this.n = i;
    }

    public nd(ve6 ve6Var, int i) {
        this.m = (byte) 15;
        this.f1562o = ve6Var;
        this.m = (byte) 15;
        this.n = i;
    }

    public nd(Context context) {
        this.m = (byte) 0;
        int iL = od.l(context, 0);
        this.f1562o = new jd(new ContextThemeWrapper(context, od.l(context, iL)));
        this.n = iL;
    }
}
