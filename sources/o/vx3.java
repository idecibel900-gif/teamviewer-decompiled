package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class vx3 {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int h;
    public int i;
    public final ArrayList j;
    public final int k;
    public final int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[][] f2356o;
    public int p;
    public final tx3[] f = {null, null};
    public final int[] g = {-1, -1};
    public final ArrayList q = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    public vx3(Context context, int i) {
        byte b;
        int i2;
        tx3 tx3VarA = null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        this.k = i3;
        this.l = displayMetrics.heightPixels;
        int i4 = 0;
        this.a = 0;
        int i5 = i3 / 10;
        this.b = i5;
        this.d = 0;
        this.c = i5;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        XmlResourceParser xml = context.getResources().getXml(i);
        Resources resources = context.getResources();
        ux3 ux3Var = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            try {
                int next = xml.next();
                int i10 = i4;
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    String name = xml.getName();
                    if ("Row".equals(name)) {
                        ux3 ux3Var2 = new ux3(resources, this, xml);
                        this.q.add(ux3Var2);
                        int i11 = ux3Var2.g;
                        if (i11 == 0 || i11 == 0) {
                            ux3Var = ux3Var2;
                            i9 = i10;
                            b = -1;
                            i8 = 1;
                        } else {
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || (next2 == 3 && xml.getName().equals("Row"))) {
                                    break;
                                }
                            }
                            ux3Var = ux3Var2;
                            i8 = i10;
                            i9 = i8;
                            b = -1;
                        }
                    } else if ("Key".equals(name)) {
                        tx3VarA = a(resources, ux3Var, i9, i6, xml);
                        arrayList.add(tx3VarA);
                        int i12 = tx3VarA.a[i10];
                        b = -1;
                        if (i12 == -1) {
                            int i13 = i10;
                            while (true) {
                                tx3[] tx3VarArr = this.f;
                                if (i13 >= tx3VarArr.length) {
                                    i2 = 1;
                                    break;
                                } else {
                                    if (tx3VarArr[i13] == null) {
                                        tx3VarArr[i13] = tx3VarA;
                                        i2 = 1;
                                        this.g[i13] = arrayList.size() - 1;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            arrayList2.add(tx3VarA);
                        } else {
                            i2 = 1;
                            if (i12 == -6) {
                                arrayList2.add(tx3VarA);
                            }
                        }
                        ux3Var.e.add(tx3VarA);
                        i7 = i2;
                    } else {
                        b = -1;
                        if ("Keyboard".equals(name)) {
                            c(resources, xml);
                        }
                    }
                    i4 = i10;
                } else if (next != 3) {
                    i4 = i10;
                } else if (i7 != 0) {
                    i9 += tx3VarA.g + tx3VarA.e;
                    if (i9 > this.i) {
                        this.i = i9;
                    }
                    i4 = i10;
                    i7 = i4;
                } else if (i8 != 0) {
                    i6 = i6 + ux3Var.d + ux3Var.b;
                    i4 = i10;
                    i8 = i4;
                } else {
                    i4 = i10;
                }
            } catch (Exception e) {
                io.sentry.android.core.v0.c("Keyboard", "Parse error:" + e);
                e.printStackTrace();
            }
        }
        this.h = i6 - this.d;
    }

    public static tx3 a(Resources resources, ux3 ux3Var, int i, int i2, XmlResourceParser xmlResourceParser) {
        int i3;
        tx3 tx3Var = new tx3(ux3Var);
        tx3Var.i = i;
        tx3Var.j = i2;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mz5.a);
        vx3 vx3Var = tx3Var.p;
        tx3Var.e = b(typedArrayObtainAttributes, 2, vx3Var.k, ux3Var.a);
        tx3Var.f = b(typedArrayObtainAttributes, 1, vx3Var.l, ux3Var.b);
        int iB = b(typedArrayObtainAttributes, 0, vx3Var.k, ux3Var.c);
        tx3Var.g = iB;
        typedArrayObtainAttributes.recycle();
        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mz5.c);
        tx3Var.i += iB;
        TypedValue typedValue = new TypedValue();
        typedArrayObtainAttributes2.getValue(0, typedValue);
        int i4 = typedValue.type;
        if (i4 == 16 || i4 == 17) {
            tx3Var.a = new int[]{typedValue.data};
        } else if (i4 == 3) {
            String string = typedValue.string.toString();
            if (string.length() > 0) {
                int iIndexOf = 0;
                i3 = 1;
                while (true) {
                    iIndexOf = string.indexOf(",", iIndexOf + 1);
                    if (iIndexOf <= 0) {
                        break;
                    }
                    i3++;
                }
            } else {
                i3 = 0;
            }
            int[] iArr = new int[i3];
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            int i5 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                int i6 = i5 + 1;
                try {
                    iArr[i5] = Integer.parseInt(stringTokenizer.nextToken());
                } catch (NumberFormatException unused) {
                    io.sentry.android.core.v0.c("Keyboard", "Error parsing keycodes ".concat(string));
                }
                i5 = i6;
            }
            tx3Var.a = iArr;
        }
        Drawable drawable = typedArrayObtainAttributes2.getDrawable(1);
        tx3Var.d = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        tx3Var.n = typedArrayObtainAttributes2.getText(10);
        tx3Var.q = typedArrayObtainAttributes2.getResourceId(11, 0);
        tx3Var.r = typedArrayObtainAttributes2.getBoolean(3, false);
        typedArrayObtainAttributes2.getBoolean(2, false);
        tx3Var.h = typedArrayObtainAttributes2.getBoolean(4, false);
        tx3Var.f2151o = ux3Var.f | typedArrayObtainAttributes2.getInt(5, 0);
        Drawable drawable2 = typedArrayObtainAttributes2.getDrawable(6);
        tx3Var.c = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
        tx3Var.b = typedArrayObtainAttributes2.getText(7);
        tx3Var.m = typedArrayObtainAttributes2.getText(8);
        if (tx3Var.a == null && !TextUtils.isEmpty(tx3Var.b)) {
            tx3Var.a = new int[]{tx3Var.b.charAt(0)};
        }
        typedArrayObtainAttributes2.recycle();
        return tx3Var;
    }

    public static int b(TypedArray typedArray, int i, int i2, int i3) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                return typedArray.getDimensionPixelOffset(i, i3);
            }
            if (i4 == 6) {
                return Math.round(typedArray.getFraction(i, i2, i2, i3));
            }
        }
        return i3;
    }

    public final void c(Resources resources, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mz5.a);
        int i = this.k;
        this.b = b(typedArrayObtainAttributes, 2, i, i / 10);
        int i2 = this.l;
        this.c = b(typedArrayObtainAttributes, 1, i2, 50);
        this.a = b(typedArrayObtainAttributes, 0, i, 0);
        this.d = b(typedArrayObtainAttributes, 3, i2, 0);
        int i3 = (int) (this.b * 1.8f);
        this.p = i3 * i3;
        typedArrayObtainAttributes.recycle();
    }
}
