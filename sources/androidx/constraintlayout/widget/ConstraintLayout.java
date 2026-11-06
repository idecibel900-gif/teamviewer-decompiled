package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.android.core.internal.threaddump.b;
import io.sentry.android.core.v0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.a30;
import o.a61;
import o.b61;
import o.ba4;
import o.c61;
import o.d61;
import o.ep1;
import o.f61;
import o.g43;
import o.g61;
import o.g63;
import o.h43;
import o.hk0;
import o.i61;
import o.iu;
import o.j61;
import o.k61;
import o.ld8;
import o.lm0;
import o.mo8;
import o.my6;
import o.n61;
import o.o61;
import o.rz5;
import o.s61;
import o.sn1;
import o.ua5;
import o.wk0;
import o.x51;
import o.z51;
import o.zi8;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static my6 B;
    public c61 A;
    public SparseArray m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o61 f15o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public int u;
    public k61 v;
    public wk0 w;
    public int x;
    public HashMap y;
    public SparseArray z;

    public ConstraintLayout(Context context) {
        super(context);
        this.m = new SparseArray();
        this.n = new ArrayList(4);
        this.f15o = new o61();
        this.p = 0;
        this.q = 0;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = true;
        this.u = 257;
        this.v = null;
        this.w = null;
        this.x = -1;
        this.y = new HashMap();
        this.z = new SparseArray();
        this.A = new c61(this, this);
        i(null);
    }

    public static b61 a() {
        b61 b61Var = new b61(-2, -2);
        b61Var.a = -1;
        b61Var.b = -1;
        b61Var.c = -1.0f;
        b61Var.d = true;
        b61Var.e = -1;
        b61Var.f = -1;
        b61Var.g = -1;
        b61Var.h = -1;
        b61Var.i = -1;
        b61Var.j = -1;
        b61Var.k = -1;
        b61Var.l = -1;
        b61Var.m = -1;
        b61Var.n = -1;
        b61Var.f399o = -1;
        b61Var.p = -1;
        b61Var.q = 0;
        b61Var.r = 0.0f;
        b61Var.s = -1;
        b61Var.t = -1;
        b61Var.u = -1;
        b61Var.v = -1;
        b61Var.w = Integer.MIN_VALUE;
        b61Var.x = Integer.MIN_VALUE;
        b61Var.y = Integer.MIN_VALUE;
        b61Var.z = Integer.MIN_VALUE;
        b61Var.A = Integer.MIN_VALUE;
        b61Var.B = Integer.MIN_VALUE;
        b61Var.C = Integer.MIN_VALUE;
        b61Var.D = 0;
        b61Var.E = 0.5f;
        b61Var.F = 0.5f;
        b61Var.G = null;
        b61Var.H = -1.0f;
        b61Var.I = -1.0f;
        b61Var.J = 0;
        b61Var.K = 0;
        b61Var.L = 0;
        b61Var.M = 0;
        b61Var.N = 0;
        b61Var.O = 0;
        b61Var.P = 0;
        b61Var.Q = 0;
        b61Var.R = 1.0f;
        b61Var.S = 1.0f;
        b61Var.T = -1;
        b61Var.U = -1;
        b61Var.V = -1;
        b61Var.W = false;
        b61Var.X = false;
        b61Var.Y = null;
        b61Var.Z = 0;
        b61Var.a0 = true;
        b61Var.b0 = true;
        b61Var.c0 = false;
        b61Var.d0 = false;
        b61Var.e0 = false;
        b61Var.f0 = -1;
        b61Var.g0 = -1;
        b61Var.h0 = -1;
        b61Var.i0 = -1;
        b61Var.j0 = Integer.MIN_VALUE;
        b61Var.k0 = Integer.MIN_VALUE;
        b61Var.l0 = 0.5f;
        b61Var.p0 = new n61();
        return b61Var;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static my6 getSharedValues() {
        my6 my6Var = B;
        if (my6Var != null) {
            return my6Var;
        }
        my6 my6Var2 = new my6();
        new SparseIntArray();
        new HashMap();
        B = my6Var2;
        return my6Var2;
    }

    public final n61 b(View view) {
        if (view == this) {
            return this.f15o;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b61) {
            return ((b61) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b61) {
            return ((b61) view.getLayoutParams()).p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b61;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.n;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((z51) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.t = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b61 b61Var = new b61(context, attributeSet);
        b61Var.a = -1;
        b61Var.b = -1;
        b61Var.c = -1.0f;
        b61Var.d = true;
        b61Var.e = -1;
        b61Var.f = -1;
        b61Var.g = -1;
        b61Var.h = -1;
        b61Var.i = -1;
        b61Var.j = -1;
        b61Var.k = -1;
        b61Var.l = -1;
        b61Var.m = -1;
        b61Var.n = -1;
        b61Var.f399o = -1;
        b61Var.p = -1;
        b61Var.q = 0;
        b61Var.r = 0.0f;
        b61Var.s = -1;
        b61Var.t = -1;
        b61Var.u = -1;
        b61Var.v = -1;
        b61Var.w = Integer.MIN_VALUE;
        b61Var.x = Integer.MIN_VALUE;
        b61Var.y = Integer.MIN_VALUE;
        b61Var.z = Integer.MIN_VALUE;
        b61Var.A = Integer.MIN_VALUE;
        b61Var.B = Integer.MIN_VALUE;
        b61Var.C = Integer.MIN_VALUE;
        b61Var.D = 0;
        b61Var.E = 0.5f;
        b61Var.F = 0.5f;
        b61Var.G = null;
        b61Var.H = -1.0f;
        b61Var.I = -1.0f;
        b61Var.J = 0;
        b61Var.K = 0;
        b61Var.L = 0;
        b61Var.M = 0;
        b61Var.N = 0;
        b61Var.O = 0;
        b61Var.P = 0;
        b61Var.Q = 0;
        b61Var.R = 1.0f;
        b61Var.S = 1.0f;
        b61Var.T = -1;
        b61Var.U = -1;
        b61Var.V = -1;
        b61Var.W = false;
        b61Var.X = false;
        b61Var.Y = null;
        b61Var.Z = 0;
        b61Var.a0 = true;
        b61Var.b0 = true;
        b61Var.c0 = false;
        b61Var.d0 = false;
        b61Var.e0 = false;
        b61Var.f0 = -1;
        b61Var.g0 = -1;
        b61Var.h0 = -1;
        b61Var.i0 = -1;
        b61Var.j0 = Integer.MIN_VALUE;
        b61Var.k0 = Integer.MIN_VALUE;
        b61Var.l0 = 0.5f;
        b61Var.p0 = new n61();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rz5.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = a61.a.get(index);
            switch (i2) {
                case 1:
                    b61Var.V = typedArrayObtainStyledAttributes.getInt(index, b61Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.p);
                    b61Var.p = resourceId;
                    if (resourceId == -1) {
                        b61Var.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    b61Var.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, b61Var.r) % 360.0f;
                    b61Var.r = f;
                    if (f < 0.0f) {
                        b61Var.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    b61Var.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b61Var.a);
                    break;
                case 6:
                    b61Var.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b61Var.b);
                    break;
                case 7:
                    b61Var.c = typedArrayObtainStyledAttributes.getFloat(index, b61Var.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.e);
                    b61Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        b61Var.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ep1.b /* 9 */:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.f);
                    b61Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        b61Var.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ep1.c /* 10 */:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.g);
                    b61Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        b61Var.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.h);
                    b61Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        b61Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ep1.d /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.i);
                    b61Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        b61Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.j);
                    b61Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        b61Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.k);
                    b61Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        b61Var.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.l);
                    b61Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        b61Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.m);
                    b61Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        b61Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.s);
                    b61Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        b61Var.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.t);
                    b61Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        b61Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.u);
                    b61Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        b61Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.v);
                    b61Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        b61Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    b61Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.w);
                    break;
                case 22:
                    b61Var.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.x);
                    break;
                case 23:
                    b61Var.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.y);
                    break;
                case 24:
                    b61Var.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.z);
                    break;
                case 25:
                    b61Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.A);
                    break;
                case 26:
                    b61Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.B);
                    break;
                case 27:
                    b61Var.W = typedArrayObtainStyledAttributes.getBoolean(index, b61Var.W);
                    break;
                case 28:
                    b61Var.X = typedArrayObtainStyledAttributes.getBoolean(index, b61Var.X);
                    break;
                case 29:
                    b61Var.E = typedArrayObtainStyledAttributes.getFloat(index, b61Var.E);
                    break;
                case 30:
                    b61Var.F = typedArrayObtainStyledAttributes.getFloat(index, b61Var.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    b61Var.L = i3;
                    if (i3 == 1) {
                        v0.c("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    b61Var.M = i4;
                    if (i4 == 1) {
                        v0.c("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        b61Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, b61Var.N) == -2) {
                            b61Var.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        b61Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, b61Var.P) == -2) {
                            b61Var.P = -2;
                        }
                    }
                    break;
                case 35:
                    b61Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, b61Var.R));
                    b61Var.L = 2;
                    break;
                case 36:
                    try {
                        b61Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, b61Var.O) == -2) {
                            b61Var.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        b61Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, b61Var.Q) == -2) {
                            b61Var.Q = -2;
                        }
                    }
                    break;
                case 38:
                    b61Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, b61Var.S));
                    b61Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            k61.g(b61Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            b61Var.H = typedArrayObtainStyledAttributes.getFloat(index, b61Var.H);
                            break;
                        case 46:
                            b61Var.I = typedArrayObtainStyledAttributes.getFloat(index, b61Var.I);
                            break;
                        case 47:
                            b61Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            b61Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            b61Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b61Var.T);
                            break;
                        case 50:
                            b61Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b61Var.U);
                            break;
                        case 51:
                            b61Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.n);
                            b61Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                b61Var.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, b61Var.f399o);
                            b61Var.f399o = resourceId16;
                            if (resourceId16 == -1) {
                                b61Var.f399o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            b61Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.D);
                            break;
                        case 55:
                            b61Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b61Var.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    k61.f(b61Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    k61.f(b61Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    b61Var.Z = typedArrayObtainStyledAttributes.getInt(index, b61Var.Z);
                                    break;
                                case 67:
                                    b61Var.d = typedArrayObtainStyledAttributes.getBoolean(index, b61Var.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        b61Var.a();
        return b61Var;
    }

    public int getMaxHeight() {
        return this.s;
    }

    public int getMaxWidth() {
        return this.r;
    }

    public int getMinHeight() {
        return this.q;
    }

    public int getMinWidth() {
        return this.p;
    }

    public int getOptimizationLevel() {
        return this.f15o.C0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        o61 o61Var = this.f15o;
        String resourceEntryName = o61Var.j;
        if (resourceEntryName == null) {
            int id2 = getId();
            if (id2 != -1) {
                resourceEntryName = getContext().getResources().getResourceEntryName(id2);
                o61Var.j = resourceEntryName;
            } else {
                resourceEntryName = "parent";
                o61Var.j = "parent";
            }
        }
        if (o61Var.g0 == null) {
            o61Var.g0 = resourceEntryName;
            Log.v("ConstraintLayout", " setDebugName " + o61Var.g0);
        }
        for (n61 n61Var : o61Var.p0) {
            View view = n61Var.e0;
            if (view != null) {
                if (n61Var.j == null && (id = view.getId()) != -1) {
                    n61Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (n61Var.g0 == null) {
                    n61Var.g0 = n61Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + n61Var.g0);
                }
            }
        }
        o61Var.l(sb);
        return sb.toString();
    }

    public final void i(AttributeSet attributeSet) {
        o61 o61Var = this.f15o;
        o61Var.e0 = this;
        c61 c61Var = this.A;
        o61Var.t0 = c61Var;
        o61Var.r0.h = c61Var;
        this.m.put(getId(), this);
        this.v = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rz5.b, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.p);
                } else if (index == 17) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == 14) {
                    this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r);
                } else if (index == 15) {
                    this.s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.s);
                } else if (index == 113) {
                    this.u = typedArrayObtainStyledAttributes.getInt(index, this.u);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.w = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        k61 k61Var = new k61();
                        this.v = k61Var;
                        k61Var.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.v = null;
                    }
                    this.x = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        o61Var.C0 = this.u;
        ba4.q = o61Var.S(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        wk0 wk0Var = new wk0((byte) 8, false);
        wk0Var.n = new SparseArray();
        wk0Var.f2420o = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                wk0Var.C(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b bVar2 = new b(context, xml);
                                ((SparseArray) wk0Var.n).put(bVar2.a, bVar2);
                                bVar = bVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                d61 d61Var = new d61(context, xml);
                                if (bVar != null) {
                                    bVar.b.add(d61Var);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            v0.d("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            v0.d("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.w = wk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0309  */
    /* JADX WARN: Code duplicated, block: B:161:0x0325  */
    /* JADX WARN: Code duplicated, block: B:163:0x0328  */
    /* JADX WARN: Code duplicated, block: B:168:0x034c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0369  */
    /* JADX WARN: Code duplicated, block: B:233:0x046e  */
    /* JADX WARN: Code duplicated, block: B:372:0x0398 A[SYNTHETIC] */
    public final void k(o61 o61Var, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        c61 c61Var;
        int i7;
        boolean zP;
        int i8;
        boolean z3;
        boolean z4;
        int i9;
        c61 c61Var2;
        int i10;
        int i11;
        g63 g63Var;
        ld8 ld8Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        Iterator it;
        zi8 zi8Var;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        c61 c61Var3 = this.A;
        c61Var3.b = iMax3;
        c61Var3.c = iMax4;
        c61Var3.d = paddingWidth;
        c61Var3.e = i18;
        c61Var3.f = i2;
        c61Var3.g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i19 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i20 = size - paddingWidth;
        int i21 = size2 - i18;
        int i22 = c61Var3.e;
        int i23 = c61Var3.d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.p);
                iMin = iMax;
            } else {
                iMin = i20;
            }
            i19 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.p);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i19 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.r - i23, i20);
            i19 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.q);
                iMin2 = iMax2;
            } else {
                iMin2 = i21;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.s - i22, i21);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.q);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iO = o61Var.o();
        sn1 sn1Var = o61Var.r0;
        int[] iArr = o61Var.C;
        int i24 = iMin;
        if (i24 == iO && iMin2 == o61Var.i()) {
            c = 1;
        } else {
            sn1Var.c = true;
            c = 1;
        }
        o61Var.X = 0;
        o61Var.Y = 0;
        iArr[0] = this.r - i23;
        iArr[c] = this.s - i22;
        o61Var.a0 = 0;
        o61Var.b0 = 0;
        o61Var.I(i19);
        o61Var.K(i24);
        o61Var.J(i4);
        o61Var.H(iMin2);
        int i25 = this.p - i23;
        if (i25 < 0) {
            o61Var.a0 = 0;
        } else {
            o61Var.a0 = i25;
        }
        int i26 = this.q - i22;
        if (i26 < 0) {
            o61Var.b0 = 0;
        } else {
            o61Var.b0 = i26;
        }
        o61Var.w0 = iMax5;
        o61Var.x0 = iMax3;
        iu iuVar = o61Var.q0;
        o61 o61Var2 = (o61) iuVar.n;
        ArrayList arrayList = (ArrayList) iuVar.f1103o;
        c61 c61Var4 = o61Var.t0;
        int size3 = o61Var.p0.size();
        int iO2 = o61Var.o();
        int i27 = o61Var.i();
        boolean zL = mo8.l(i, 128);
        boolean z6 = zL || mo8.l(i, 64);
        if (z6) {
            int i28 = 0;
            while (true) {
                if (i28 < size3) {
                    boolean z7 = z6;
                    n61 n61Var = (n61) o61Var.p0.get(i28);
                    i5 = size3;
                    int[] iArr2 = n61Var.o0;
                    int i29 = i28;
                    boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && n61Var.V > 0.0f;
                    if ((n61Var.v() && z8) || ((n61Var.w() && z8) || n61Var.v() || n61Var.w())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i28 = i29 + 1;
                        z6 = z7;
                        size3 = i5;
                    }
                } else {
                    z = z6;
                    i5 = size3;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z6;
            i5 = size3;
            i6 = 1073741824;
        }
        boolean z9 = z & ((mode == i6 && mode2 == i6) || zL);
        if (z9) {
            int iMin3 = Math.min(iArr[0], i20);
            int iMin4 = Math.min(iArr[1], i21);
            int i30 = 1073741824;
            if (mode == 1073741824) {
                if (o61Var.o() != iMin3) {
                    o61Var.K(iMin3);
                    sn1Var.b = true;
                }
                i30 = 1073741824;
            }
            if (mode2 == i30 && o61Var.i() != iMin4) {
                o61Var.H(iMin4);
                sn1Var.b = true;
            }
            if (mode == i30 && mode2 == i30) {
                ArrayList<zi8> arrayList2 = (ArrayList) sn1Var.f;
                o61 o61Var3 = (o61) sn1Var.d;
                if (sn1Var.b || sn1Var.c) {
                    for (n61 n61Var2 : o61Var3.p0) {
                        n61Var2.f();
                        n61Var2.a = false;
                        n61Var2.d.n();
                        n61Var2.e.m();
                        z9 = z9;
                    }
                    z2 = z9;
                    o61Var3.f();
                    i14 = 0;
                    o61Var3.a = false;
                    o61Var3.d.n();
                    o61Var3.e.m();
                    sn1Var.c = false;
                } else {
                    z2 = z9;
                    i14 = 0;
                }
                sn1Var.b((o61) sn1Var.e);
                o61Var3.X = i14;
                int[] iArr3 = o61Var3.o0;
                o61Var3.Y = i14;
                int iH = o61Var3.h(i14);
                int iH2 = o61Var3.h(1);
                if (sn1Var.b) {
                    sn1Var.c();
                }
                int iP = o61Var3.p();
                int iQ = o61Var3.q();
                c61Var = c61Var4;
                o61Var3.d.h.d(iP);
                o61Var3.e.h.d(iQ);
                sn1Var.t();
                if (iH == 2 || iH2 == 2) {
                    if (zL) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((zi8) it2.next()).k()) {
                                zL = false;
                                break;
                            }
                        }
                    }
                    if (zL && iH == 2) {
                        o61Var3.I(1);
                        o61Var3.K(sn1Var.d(o61Var3, 0));
                        o61Var3.d.e.d(o61Var3.o());
                    }
                    if (zL && iH2 == 2) {
                        i15 = 1;
                        o61Var3.J(1);
                        o61Var3.H(sn1Var.d(o61Var3, 1));
                        o61Var3.e.e.d(o61Var3.i());
                    }
                    i16 = iArr3[0];
                    if (i16 != i15 || i16 == 4) {
                        int iO3 = o61Var3.o() + iP;
                        o61Var3.d.i.d(iO3);
                        o61Var3.d.e.d(iO3 - iP);
                        sn1Var.t();
                        i17 = iArr3[1];
                        if (i17 != 1 || i17 == 4) {
                            int i31 = o61Var3.i() + iQ;
                            o61Var3.e.i.d(i31);
                            o61Var3.e.e.d(i31 - iQ);
                        }
                        sn1Var.t();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (zi8 zi8Var2 : arrayList2) {
                        if (zi8Var2.b == o61Var3 || zi8Var2.g) {
                            zi8Var2.e();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zP = true;
                            break;
                        }
                        zi8Var = (zi8) it.next();
                        if (!z5 || zi8Var.b != o61Var3) {
                            if (zi8Var.h.j || ((!zi8Var.i.j && !(zi8Var instanceof h43)) || (!zi8Var.e.j && !(zi8Var instanceof lm0) && !(zi8Var instanceof h43)))) {
                                zP = false;
                                break;
                            }
                        }
                    }
                    o61Var3.I(iH);
                    o61Var3.J(iH2);
                    i7 = 2;
                    i13 = 1073741824;
                } else {
                    iQ = iQ;
                }
                i15 = 1;
                i16 = iArr3[0];
                if (i16 != i15) {
                    int iO4 = o61Var3.o() + iP;
                    o61Var3.d.i.d(iO4);
                    o61Var3.d.e.d(iO4 - iP);
                    sn1Var.t();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int i32 = o61Var3.i() + iQ;
                        o61Var3.e.i.d(i32);
                        o61Var3.e.e.d(i32 - iQ);
                    } else {
                        int i33 = o61Var3.i() + iQ;
                        o61Var3.e.i.d(i33);
                        o61Var3.e.e.d(i33 - iQ);
                    }
                    sn1Var.t();
                    z5 = true;
                } else {
                    int iO5 = o61Var3.o() + iP;
                    o61Var3.d.i.d(iO5);
                    o61Var3.d.e.d(iO5 - iP);
                    sn1Var.t();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int i34 = o61Var3.i() + iQ;
                        o61Var3.e.i.d(i34);
                        o61Var3.e.e.d(i34 - iQ);
                    } else {
                        int i35 = o61Var3.i() + iQ;
                        o61Var3.e.i.d(i35);
                        o61Var3.e.e.d(i35 - iQ);
                    }
                    sn1Var.t();
                    z5 = true;
                }
                while (r8.hasNext()) {
                    if (zi8Var2.b == o61Var3) {
                    }
                    zi8Var2.e();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zP = true;
                        break;
                    }
                    zi8Var = (zi8) it.next();
                    if (!z5) {
                    }
                    if (zi8Var.h.j) {
                    }
                    zP = false;
                    break;
                }
                o61Var3.I(iH);
                o61Var3.J(iH2);
                i7 = 2;
                i13 = 1073741824;
            } else {
                z2 = z9;
                c61Var = c61Var4;
                o61 o61Var4 = (o61) sn1Var.d;
                if (sn1Var.b) {
                    for (n61 n61Var3 : o61Var4.p0) {
                        n61Var3.f();
                        n61Var3.a = false;
                        g63 g63Var2 = n61Var3.d;
                        g63Var2.e.j = false;
                        g63Var2.g = false;
                        g63Var2.n();
                        ld8 ld8Var2 = n61Var3.e;
                        ld8Var2.e.j = false;
                        ld8Var2.g = false;
                        ld8Var2.m();
                    }
                    i12 = 0;
                    o61Var4.f();
                    o61Var4.a = false;
                    g63 g63Var3 = o61Var4.d;
                    g63Var3.e.j = false;
                    g63Var3.g = false;
                    g63Var3.n();
                    ld8 ld8Var3 = o61Var4.e;
                    ld8Var3.e.j = false;
                    ld8Var3.g = false;
                    ld8Var3.m();
                    sn1Var.c();
                } else {
                    i12 = 0;
                }
                sn1Var.b((o61) sn1Var.e);
                o61Var4.X = i12;
                o61Var4.Y = i12;
                o61Var4.d.h.d(i12);
                o61Var4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zP = o61Var.P(i12, zL);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zP = true;
                }
                if (mode2 == 1073741824) {
                    zP &= o61Var.P(1, zL);
                    i7++;
                }
            }
            if (zP) {
                o61Var.L(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z9;
            c61Var = c61Var4;
            i7 = 0;
            zP = false;
        }
        if (zP && i7 == 2) {
            return;
        }
        int i36 = o61Var.C0;
        if (i5 > 0) {
            int size4 = o61Var.p0.size();
            boolean zS = o61Var.S(64);
            c61 c61Var5 = o61Var.t0;
            int i37 = 0;
            while (i37 < size4) {
                n61 n61Var4 = (n61) o61Var.p0.get(i37);
                if ((n61Var4 instanceof g43) || (n61Var4 instanceof a30)) {
                    i11 = size4;
                } else {
                    n61Var4.getClass();
                    if (zS && (g63Var = n61Var4.d) != null && (ld8Var = n61Var4.e) != null && g63Var.e.j && ld8Var.e.j) {
                        i11 = size4;
                    } else {
                        int iH3 = n61Var4.h(0);
                        int iH4 = n61Var4.h(1);
                        i11 = size4;
                        boolean z10 = iH3 == 3 && n61Var4.r != 1 && iH4 == 3 && n61Var4.s != 1;
                        if (!z10 && o61Var.S(1)) {
                            if (iH3 == 3 && n61Var4.r == 0 && iH4 != 3 && !n61Var4.v()) {
                                z10 = true;
                            }
                            if (iH4 == 3 && n61Var4.s == 0 && iH3 != 3 && !n61Var4.v()) {
                                z10 = true;
                            }
                            if ((iH3 == 3 || iH4 == 3) && n61Var4.V > 0.0f) {
                                z10 = true;
                            }
                        }
                        if (!z10) {
                            iuVar.J(0, c61Var5, n61Var4);
                        }
                    }
                }
                i37++;
                size4 = i11;
            }
            ConstraintLayout constraintLayout = c61Var5.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.n;
            for (int i38 = 0; i38 < childCount2; i38++) {
                constraintLayout.getChildAt(i38);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i39 = 0; i39 < size5; i39++) {
                    ((z51) arrayList3.get(i39)).getClass();
                }
            }
        }
        iuVar.W(o61Var);
        int size6 = arrayList.size();
        int i40 = 0;
        if (i5 > 0) {
            iuVar.T(o61Var, 0, iO2, i27);
        }
        if (size6 > 0) {
            int[] iArr4 = o61Var.o0;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iMax7 = Math.max(o61Var.o(), o61Var2.a0);
            int iMax8 = Math.max(o61Var.i(), o61Var2.b0);
            for (int i41 = 0; i41 < size6; i41++) {
            }
            int i42 = 0;
            while (i42 < 2) {
                int i43 = i40;
                int i44 = i43;
                while (i43 < size6) {
                    n61 n61Var5 = (n61) arrayList.get(i43);
                    if ((n61Var5 instanceof a30) || (n61Var5 instanceof g43)) {
                        i8 = size6;
                    } else {
                        i8 = size6;
                        if (n61Var5.f0 != 8 && (!z2 || !n61Var5.d.e.j || !n61Var5.e.e.j)) {
                            int iO6 = n61Var5.o();
                            int i45 = n61Var5.i();
                            z3 = z12;
                            int i46 = n61Var5.Z;
                            z4 = z11;
                            int i47 = i42 == 1 ? 2 : 1;
                            i9 = i42;
                            c61Var2 = c61Var;
                            int i48 = (iuVar.J(i47, c61Var2, n61Var5) ? 1 : 0) | i44;
                            int iO7 = n61Var5.o();
                            int i49 = i48;
                            int i50 = n61Var5.i();
                            if (iO7 != iO6) {
                                n61Var5.K(iO7);
                                if (z4 && n61Var5.p() + n61Var5.T > iMax7) {
                                    iMax7 = Math.max(iMax7, n61Var5.g(4).d() + n61Var5.p() + n61Var5.T);
                                }
                                i49 = 1;
                            }
                            if (i50 != i45) {
                                n61Var5.H(i50);
                                if (z3 && n61Var5.q() + n61Var5.U > iMax8) {
                                    iMax8 = Math.max(iMax8, n61Var5.g(5).d() + n61Var5.q() + n61Var5.U);
                                }
                                i10 = 1;
                            } else {
                                i10 = i49;
                            }
                            if (n61Var5.E && i46 != n61Var5.Z) {
                                i10 = 1;
                            }
                        }
                        i43++;
                        size6 = i8;
                        z12 = z3;
                        c61Var = c61Var2;
                        i44 = i10;
                        z11 = z4;
                        i42 = i9;
                    }
                    z3 = z12;
                    z4 = z11;
                    i9 = i42;
                    i10 = i44;
                    c61Var2 = c61Var;
                    i43++;
                    size6 = i8;
                    z12 = z3;
                    c61Var = c61Var2;
                    i44 = i10;
                    z11 = z4;
                    i42 = i9;
                }
                int i51 = size6;
                boolean z13 = z12;
                boolean z14 = z11;
                int i52 = i42;
                c61 c61Var6 = c61Var;
                if (i44 == 0) {
                    break;
                }
                int i53 = i52 + 1;
                iuVar.T(o61Var, i53, iO2, i27);
                z12 = z13;
                c61Var = c61Var6;
                z11 = z14;
                i40 = 0;
                i42 = i53;
                size6 = i51;
            }
        }
        o61Var.C0 = i36;
        ba4.q = o61Var.S(512);
    }

    public final void l(n61 n61Var, b61 b61Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.m.get(i);
        n61 n61Var2 = (n61) sparseArray.get(i);
        if (n61Var2 == null || view == null || !(view.getLayoutParams() instanceof b61)) {
            return;
        }
        b61Var.c0 = true;
        if (i2 == 6) {
            b61 b61Var2 = (b61) view.getLayoutParams();
            b61Var2.c0 = true;
            b61Var2.p0.E = true;
        }
        n61Var.g(6).a(n61Var2.g(i2), b61Var.D, b61Var.C);
        n61Var.E = true;
        n61Var.g(3).g();
        n61Var.g(5).g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.n;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b61 b61Var = (b61) childAt.getLayoutParams();
            n61 n61Var = b61Var.p0;
            if (childAt.getVisibility() != 8 || b61Var.d0 || b61Var.e0 || zIsInEditMode) {
                int iP = n61Var.p();
                int iQ = n61Var.q();
                childAt.layout(iP, iQ, n61Var.o() + iP, n61Var.i() + iQ);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((z51) arrayList.get(i6)).i();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:233:0x05df  */
    /* JADX WARN: Code duplicated, block: B:274:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:276:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:279:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:286:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:288:0x0703  */
    /* JADX WARN: Code duplicated, block: B:289:0x070f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0716  */
    /* JADX WARN: Code duplicated, block: B:296:0x0736  */
    /* JADX WARN: Code duplicated, block: B:299:0x073e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0747  */
    /* JADX WARN: Code duplicated, block: B:304:0x0752  */
    /* JADX WARN: Code duplicated, block: B:311:0x076f  */
    /* JADX WARN: Code duplicated, block: B:312:0x077e  */
    /* JADX WARN: Code duplicated, block: B:314:0x0786  */
    /* JADX WARN: Code duplicated, block: B:315:0x078f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0797  */
    /* JADX WARN: Code duplicated, block: B:320:0x079f  */
    /* JADX WARN: Code duplicated, block: B:323:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:395:0x08c7  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        o61 o61Var;
        boolean z;
        boolean z2;
        SparseArray sparseArray;
        ArrayList arrayList;
        SparseArray sparseArray2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        n61 n61Var;
        int i7;
        int i8;
        int i9;
        int i10;
        n61 n61Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n61 n61Var3;
        int i17;
        int i18;
        int i19;
        n61 n61Var4;
        float f2;
        int i20;
        int i21;
        n61 n61Var5;
        int i22;
        int i23;
        int i24;
        int i25;
        float f3;
        n61 n61Var6;
        n61 n61Var7;
        int i26;
        n61 n61Var8;
        int i27;
        int i28;
        int i29;
        float fAbs;
        int i30;
        byte b;
        SparseArray sparseArray3;
        String str;
        int iF;
        boolean z4;
        SparseArray sparseArray4;
        ArrayList arrayList2;
        SparseArray sparseArray5;
        HashSet hashSet;
        o61 o61Var2;
        boolean z5;
        int i31;
        o61 o61Var3;
        String resourceEntryName;
        n61 n61Var9;
        ConstraintLayout constraintLayout = this;
        SparseArray sparseArray6 = constraintLayout.z;
        SparseArray sparseArray7 = constraintLayout.m;
        o61 o61Var4 = constraintLayout.f15o;
        boolean z6 = constraintLayout.t;
        constraintLayout.t = z6;
        if (!z6) {
            int childCount = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount; i32++) {
                if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                    constraintLayout.t = true;
                    break;
                }
            }
        }
        o61Var4.u0 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        if (constraintLayout.t) {
            constraintLayout.t = false;
            int childCount2 = constraintLayout.getChildCount();
            int i33 = 0;
            while (true) {
                if (i33 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i33).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i33++;
                }
            }
            if (z) {
                ArrayList arrayList3 = constraintLayout.n;
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i34 = 0; i34 < childCount3; i34++) {
                    n61 n61VarB = constraintLayout.b(constraintLayout.getChildAt(i34));
                    if (n61VarB != null) {
                        n61VarB.A();
                    }
                }
                int i35 = -1;
                if (zIsInEditMode) {
                    int i36 = 0;
                    while (i36 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i36);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.y == null) {
                                    constraintLayout.y = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.y.put(iIndexOf != i35 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray7.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                n61Var9 = viewFindViewById == constraintLayout ? o61Var4 : viewFindViewById == null ? null : ((b61) viewFindViewById.getLayoutParams()).p0;
                            }
                            n61Var9.g0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                        i36++;
                        i35 = -1;
                    }
                }
                if (constraintLayout.x != -1) {
                    for (int i37 = 0; i37 < childCount3; i37++) {
                        constraintLayout.getChildAt(i37).getId();
                    }
                }
                k61 k61Var = constraintLayout.v;
                if (k61Var != null) {
                    int childCount4 = constraintLayout.getChildCount();
                    HashMap map = k61Var.b;
                    HashSet<Integer> hashSet2 = new HashSet(map.keySet());
                    int i38 = 0;
                    while (i38 < childCount4) {
                        View childAt2 = constraintLayout.getChildAt(i38);
                        int id2 = childAt2.getId();
                        int i39 = i38;
                        if (map.containsKey(Integer.valueOf(id2))) {
                            z4 = z;
                            if (id2 == -1) {
                                hk0.o("All children of ConstraintLayout must have ids to use ConstraintSet");
                                return;
                            }
                            if (id2 != -1) {
                                if (map.containsKey(Integer.valueOf(id2))) {
                                    hashSet2.remove(Integer.valueOf(id2));
                                    f61 f61Var = (f61) map.get(Integer.valueOf(id2));
                                    if (f61Var != null) {
                                        i61 i61Var = f61Var.b;
                                        hashSet = hashSet2;
                                        g61 g61Var = f61Var.d;
                                        z5 = zIsInEditMode;
                                        j61 j61Var = f61Var.e;
                                        if (childAt2 instanceof Barrier) {
                                            g61Var.h0 = 1;
                                            Barrier barrier = (Barrier) childAt2;
                                            barrier.setId(id2);
                                            barrier.setType(g61Var.f0);
                                            barrier.setMargin(g61Var.g0);
                                            barrier.setAllowsGoneWidget(g61Var.n0);
                                            int[] iArr = g61Var.i0;
                                            if (iArr != null) {
                                                barrier.setReferencedIds(iArr);
                                            } else {
                                                String str2 = g61Var.j0;
                                                if (str2 != null) {
                                                    int[] iArrB = k61.b(barrier, str2);
                                                    g61Var.i0 = iArrB;
                                                    barrier.setReferencedIds(iArrB);
                                                }
                                            }
                                        }
                                        b61 b61Var = (b61) childAt2.getLayoutParams();
                                        b61Var.a();
                                        f61Var.a(b61Var);
                                        HashMap map2 = f61Var.f;
                                        sparseArray5 = sparseArray6;
                                        i31 = childCount3;
                                        Class<?> cls = childAt2.getClass();
                                        for (String str3 : map2.keySet()) {
                                            SparseArray sparseArray8 = sparseArray7;
                                            x51 x51Var = (x51) map2.get(str3);
                                            HashMap map3 = map2;
                                            String strM = !x51Var.a ? ua5.m("set", str3) : str3;
                                            ArrayList arrayList4 = arrayList3;
                                            try {
                                                int iB = ua5.B(x51Var.b);
                                                Class cls2 = Float.TYPE;
                                                Class cls3 = Integer.TYPE;
                                                switch (iB) {
                                                    case 0:
                                                        o61Var3 = o61Var4;
                                                        cls.getMethod(strM, cls3).invoke(childAt2, Integer.valueOf(x51Var.c));
                                                        break;
                                                    case 1:
                                                        o61Var3 = o61Var4;
                                                        cls.getMethod(strM, cls2).invoke(childAt2, Float.valueOf(x51Var.d));
                                                        break;
                                                    case 2:
                                                        o61Var3 = o61Var4;
                                                        cls.getMethod(strM, cls3).invoke(childAt2, Integer.valueOf(x51Var.g));
                                                        break;
                                                    case 3:
                                                        Method method = cls.getMethod(strM, Drawable.class);
                                                        o61Var3 = o61Var4;
                                                        try {
                                                            ColorDrawable colorDrawable = new ColorDrawable();
                                                            colorDrawable.setColor(x51Var.g);
                                                            method.invoke(childAt2, colorDrawable);
                                                        } catch (IllegalAccessException e) {
                                                            e = e;
                                                            StringBuilder sbP = ua5.p(" Custom Attribute \"", str3, "\" not found on ");
                                                            sbP.append(cls.getName());
                                                            v0.d("TransitionLayout", sbP.toString(), e);
                                                        } catch (NoSuchMethodException e2) {
                                                            e = e2;
                                                            v0.d("TransitionLayout", cls.getName() + " must have a method " + strM, e);
                                                        } catch (InvocationTargetException e3) {
                                                            e = e3;
                                                            StringBuilder sbP2 = ua5.p(" Custom Attribute \"", str3, "\" not found on ");
                                                            sbP2.append(cls.getName());
                                                            v0.d("TransitionLayout", sbP2.toString(), e);
                                                        }
                                                        break;
                                                    case 4:
                                                        cls.getMethod(strM, CharSequence.class).invoke(childAt2, x51Var.e);
                                                        o61Var3 = o61Var4;
                                                        break;
                                                    case 5:
                                                        cls.getMethod(strM, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(x51Var.f));
                                                        o61Var3 = o61Var4;
                                                        break;
                                                    case 6:
                                                        cls.getMethod(strM, cls2).invoke(childAt2, Float.valueOf(x51Var.d));
                                                        o61Var3 = o61Var4;
                                                        break;
                                                    case 7:
                                                        cls.getMethod(strM, cls3).invoke(childAt2, Integer.valueOf(x51Var.c));
                                                        o61Var3 = o61Var4;
                                                        break;
                                                    default:
                                                        o61Var3 = o61Var4;
                                                        break;
                                                }
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                o61Var3 = o61Var4;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                o61Var3 = o61Var4;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                o61Var3 = o61Var4;
                                            }
                                            sparseArray7 = sparseArray8;
                                            map2 = map3;
                                            arrayList3 = arrayList4;
                                            o61Var4 = o61Var3;
                                        }
                                        sparseArray4 = sparseArray7;
                                        arrayList2 = arrayList3;
                                        o61Var2 = o61Var4;
                                        childAt2.setLayoutParams(b61Var);
                                        if (i61Var.b == 0) {
                                            childAt2.setVisibility(i61Var.a);
                                        }
                                        childAt2.setAlpha(i61Var.c);
                                        childAt2.setRotation(j61Var.a);
                                        childAt2.setRotationX(j61Var.b);
                                        childAt2.setRotationY(j61Var.c);
                                        childAt2.setScaleX(j61Var.d);
                                        childAt2.setScaleY(j61Var.e);
                                        if (j61Var.h != -1) {
                                            View viewFindViewById2 = ((View) childAt2.getParent()).findViewById(j61Var.h);
                                            if (viewFindViewById2 != null) {
                                                float bottom = (viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f;
                                                float right = (viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f;
                                                if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                                    float left = right - childAt2.getLeft();
                                                    float top = bottom - childAt2.getTop();
                                                    childAt2.setPivotX(left);
                                                    childAt2.setPivotY(top);
                                                }
                                            }
                                        } else {
                                            if (!Float.isNaN(j61Var.f)) {
                                                childAt2.setPivotX(j61Var.f);
                                            }
                                            if (!Float.isNaN(j61Var.g)) {
                                                childAt2.setPivotY(j61Var.g);
                                            }
                                        }
                                        childAt2.setTranslationX(j61Var.i);
                                        childAt2.setTranslationY(j61Var.j);
                                        childAt2.setTranslationZ(j61Var.k);
                                        if (j61Var.l) {
                                            childAt2.setElevation(j61Var.m);
                                        }
                                    }
                                } else {
                                    sparseArray4 = sparseArray7;
                                    arrayList2 = arrayList3;
                                    sparseArray5 = sparseArray6;
                                    hashSet = hashSet2;
                                    o61Var2 = o61Var4;
                                    z5 = zIsInEditMode;
                                    i31 = childCount3;
                                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                                }
                            }
                            i38 = i39 + 1;
                            z = z4;
                            hashSet2 = hashSet;
                            zIsInEditMode = z5;
                            sparseArray6 = sparseArray5;
                            childCount3 = i31;
                            sparseArray7 = sparseArray4;
                            arrayList3 = arrayList2;
                            o61Var4 = o61Var2;
                        } else {
                            z4 = z;
                            StringBuilder sb = new StringBuilder("id unknown ");
                            try {
                                resourceEntryName = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                            } catch (Exception unused2) {
                                resourceEntryName = "UNKNOWN";
                            }
                            sb.append(resourceEntryName);
                            v0.j("ConstraintSet", sb.toString());
                        }
                        sparseArray4 = sparseArray7;
                        arrayList2 = arrayList3;
                        sparseArray5 = sparseArray6;
                        hashSet = hashSet2;
                        o61Var2 = o61Var4;
                        z5 = zIsInEditMode;
                        i31 = childCount3;
                        i38 = i39 + 1;
                        z = z4;
                        hashSet2 = hashSet;
                        zIsInEditMode = z5;
                        sparseArray6 = sparseArray5;
                        childCount3 = i31;
                        sparseArray7 = sparseArray4;
                        arrayList3 = arrayList2;
                        o61Var4 = o61Var2;
                    }
                    sparseArray = sparseArray7;
                    arrayList = arrayList3;
                    sparseArray2 = sparseArray6;
                    o61 o61Var5 = o61Var4;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    for (Integer num : hashSet2) {
                        f61 f61Var2 = (f61) map.get(num);
                        if (f61Var2 != null) {
                            g61 g61Var2 = f61Var2.d;
                            if (g61Var2.h0 == 1) {
                                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                                barrier2.setId(num.intValue());
                                int[] iArr2 = g61Var2.i0;
                                if (iArr2 != null) {
                                    barrier2.setReferencedIds(iArr2);
                                } else {
                                    String str4 = g61Var2.j0;
                                    if (str4 != null) {
                                        int[] iArrB2 = k61.b(barrier2, str4);
                                        g61Var2.i0 = iArrB2;
                                        barrier2.setReferencedIds(iArrB2);
                                    }
                                }
                                barrier2.setType(g61Var2.f0);
                                barrier2.setMargin(g61Var2.g0);
                                b61 b61VarA = a();
                                barrier2.j();
                                f61Var2.a(b61VarA);
                                constraintLayout.addView(barrier2, b61VarA);
                            }
                            if (g61Var2.a) {
                                Guideline guideline = new Guideline(constraintLayout.getContext());
                                guideline.setId(num.intValue());
                                b61 b61VarA2 = a();
                                f61Var2.a(b61VarA2);
                                constraintLayout.addView(guideline, b61VarA2);
                            }
                        }
                    }
                    for (int i40 = 0; i40 < childCount4; i40++) {
                        View childAt3 = constraintLayout.getChildAt(i40);
                        if (childAt3 instanceof z51) {
                            ((z51) childAt3).e(constraintLayout);
                        }
                    }
                    o61Var = o61Var5;
                } else {
                    sparseArray = sparseArray7;
                    arrayList = arrayList3;
                    sparseArray2 = sparseArray6;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    o61Var = o61Var4;
                }
                o61Var.p0.clear();
                int size = arrayList.size();
                char c = 2;
                if (size > 0) {
                    int i41 = 0;
                    while (i41 < size) {
                        ArrayList arrayList5 = arrayList;
                        z51 z51Var = (z51) arrayList5.get(i41);
                        HashMap map4 = z51Var.s;
                        if (z51Var.isInEditMode()) {
                            z51Var.setIds(z51Var.q);
                        }
                        a30 a30Var = z51Var.p;
                        if (a30Var == null) {
                            sparseArray3 = sparseArray;
                        } else {
                            a30Var.q0 = 0;
                            Arrays.fill(a30Var.p0, (Object) null);
                            int i42 = 0;
                            while (i42 < z51Var.n) {
                                int i43 = z51Var.m[i42];
                                SparseArray sparseArray9 = sparseArray;
                                View view = (View) sparseArray9.get(i43);
                                if (view == null && (iF = z51Var.f(constraintLayout, (str = (String) map4.get(Integer.valueOf(i43))))) != 0) {
                                    z51Var.m[i42] = iF;
                                    map4.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray9.get(iF);
                                }
                                if (view != null) {
                                    a30 a30Var2 = z51Var.p;
                                    n61 n61VarB2 = constraintLayout.b(view);
                                    a30Var2.getClass();
                                    if (n61VarB2 != a30Var2 && n61VarB2 != null) {
                                        int i44 = a30Var2.q0 + 1;
                                        n61[] n61VarArr = a30Var2.p0;
                                        if (i44 > n61VarArr.length) {
                                            n61VarArr = (n61[]) Arrays.copyOf(n61VarArr, n61VarArr.length * 2);
                                            a30Var2.p0 = n61VarArr;
                                        }
                                        int i45 = a30Var2.q0;
                                        n61VarArr[i45] = n61VarB2;
                                        a30Var2.q0 = i45 + 1;
                                    }
                                }
                                i42++;
                                sparseArray = sparseArray9;
                            }
                            sparseArray3 = sparseArray;
                            z51Var.p.getClass();
                        }
                        i41++;
                        arrayList = arrayList5;
                        sparseArray = sparseArray3;
                    }
                }
                int i46 = i3;
                for (int i47 = 0; i47 < i46; i47++) {
                    constraintLayout.getChildAt(i47);
                }
                sparseArray2.clear();
                SparseArray sparseArray10 = sparseArray2;
                sparseArray10.put(0, o61Var);
                sparseArray10.put(constraintLayout.getId(), o61Var);
                for (int i48 = 0; i48 < i46; i48++) {
                    View childAt4 = constraintLayout.getChildAt(i48);
                    sparseArray10.put(childAt4.getId(), constraintLayout.b(childAt4));
                }
                int i49 = 0;
                while (i49 < i46) {
                    View childAt5 = constraintLayout.getChildAt(i49);
                    n61 n61VarB3 = constraintLayout.b(childAt5);
                    if (n61VarB3 != null) {
                        b61 b61Var2 = (b61) childAt5.getLayoutParams();
                        o61Var.p0.add(n61VarB3);
                        o61 o61Var6 = n61VarB3.S;
                        if (o61Var6 != null) {
                            o61Var6.p0.remove(n61VarB3);
                            n61VarB3.A();
                        }
                        n61VarB3.S = o61Var;
                        b61Var2.a();
                        n61VarB3.f0 = childAt5.getVisibility();
                        n61VarB3.e0 = childAt5;
                        if (childAt5 instanceof z51) {
                            ((z51) childAt5).h(n61VarB3, o61Var.u0);
                        }
                        if (b61Var2.d0) {
                            g43 g43Var = (g43) n61VarB3;
                            int i50 = b61Var2.m0;
                            int i51 = b61Var2.n0;
                            float f4 = b61Var2.o0;
                            if (f4 == -1.0f) {
                                b = -1;
                                if (i50 != -1) {
                                    if (i50 > -1) {
                                        g43Var.p0 = -1.0f;
                                        g43Var.q0 = i50;
                                        g43Var.r0 = -1;
                                    }
                                } else if (i51 != -1 && i51 > -1) {
                                    g43Var.p0 = -1.0f;
                                    g43Var.q0 = -1;
                                    g43Var.r0 = i51;
                                }
                            } else if (f4 > -1.0f) {
                                g43Var.p0 = f4;
                                b = -1;
                                g43Var.q0 = -1;
                                g43Var.r0 = -1;
                            }
                        } else {
                            int i52 = b61Var2.f0;
                            int i53 = b61Var2.g0;
                            int i54 = b61Var2.h0;
                            int i55 = b61Var2.i0;
                            int i56 = b61Var2.j0;
                            int i57 = b61Var2.k0;
                            float f5 = b61Var2.l0;
                            int i58 = b61Var2.p;
                            if (i58 != -1) {
                                n61 n61Var10 = (n61) sparseArray10.get(i58);
                                if (n61Var10 != null) {
                                    float f6 = b61Var2.r;
                                    n61VarB3.t(7, 7, b61Var2.q, 0, n61Var10);
                                    n61VarB3.D = f6;
                                }
                                n61Var5 = n61VarB3;
                                i21 = 4;
                                i22 = 2;
                                i16 = 5;
                                i24 = 3;
                            } else {
                                if (i52 != -1) {
                                    n61 n61Var11 = (n61) sparseArray10.get(i52);
                                    if (n61Var11 != null) {
                                        i5 = i57;
                                        f = f5;
                                        i4 = i55;
                                        i6 = 2;
                                        n61VarB3.t(2, 2, ((ViewGroup.MarginLayoutParams) b61Var2).leftMargin, i56, n61Var11);
                                    } else {
                                        i4 = i55;
                                        i5 = i57;
                                        f = f5;
                                        i6 = 2;
                                    }
                                } else {
                                    i4 = i55;
                                    i5 = i57;
                                    i6 = 2;
                                    if (i53 == -1 || (n61Var = (n61) sparseArray10.get(i53)) == null) {
                                        f = f5;
                                    } else {
                                        f = f5;
                                        n61VarB3.t(2, 4, ((ViewGroup.MarginLayoutParams) b61Var2).leftMargin, i56, n61Var);
                                        i7 = 2;
                                        i8 = 4;
                                    }
                                    if (i54 != -1) {
                                        n61Var8 = (n61) sparseArray10.get(i54);
                                        if (n61Var8 != null) {
                                            n61VarB3.t(i8, i7, ((ViewGroup.MarginLayoutParams) b61Var2).rightMargin, i5, n61Var8);
                                        }
                                        i9 = i7;
                                    } else {
                                        i9 = i7;
                                        i10 = i5;
                                        if (i4 != -1 && (n61Var2 = (n61) sparseArray10.get(i4)) != null) {
                                            n61VarB3.t(i8, i8, ((ViewGroup.MarginLayoutParams) b61Var2).rightMargin, i10, n61Var2);
                                        }
                                    }
                                    i11 = i8;
                                    i12 = b61Var2.i;
                                    if (i12 != -1) {
                                        n61Var7 = (n61) sparseArray10.get(i12);
                                        if (n61Var7 != null) {
                                            i26 = 3;
                                            n61VarB3.t(3, 3, ((ViewGroup.MarginLayoutParams) b61Var2).topMargin, b61Var2.x, n61Var7);
                                        } else {
                                            i26 = 3;
                                        }
                                        i15 = i26;
                                        i16 = 5;
                                        i14 = -1;
                                    } else {
                                        i13 = b61Var2.j;
                                        if (i13 != -1 || (n61Var3 = (n61) sparseArray10.get(i13)) == null) {
                                            i14 = -1;
                                            i15 = 3;
                                            i16 = 5;
                                        } else {
                                            i14 = -1;
                                            n61VarB3.t(3, 5, ((ViewGroup.MarginLayoutParams) b61Var2).topMargin, b61Var2.x, n61Var3);
                                            i15 = 3;
                                            i16 = 5;
                                        }
                                    }
                                    i17 = b61Var2.k;
                                    if (i17 != i14) {
                                        n61Var6 = (n61) sparseArray10.get(i17);
                                        if (n61Var6 != null) {
                                            n61VarB3.t(i16, i15, ((ViewGroup.MarginLayoutParams) b61Var2).bottomMargin, b61Var2.z, n61Var6);
                                        }
                                        i18 = i15;
                                    } else {
                                        i18 = i15;
                                        i19 = b61Var2.l;
                                        if (i19 != i14 && (n61Var4 = (n61) sparseArray10.get(i19)) != null) {
                                            n61VarB3.t(i16, i16, ((ViewGroup.MarginLayoutParams) b61Var2).bottomMargin, b61Var2.z, n61Var4);
                                        }
                                    }
                                    f2 = f;
                                    i20 = b61Var2.m;
                                    if (i20 != -1) {
                                        i22 = i9;
                                        i21 = i11;
                                        n61Var5 = n61VarB3;
                                        constraintLayout.l(n61Var5, b61Var2, sparseArray10, i20, 6);
                                        constraintLayout = this;
                                        i24 = i18;
                                    } else {
                                        i21 = i11;
                                        n61Var5 = n61VarB3;
                                        i22 = i9;
                                        i23 = b61Var2.n;
                                        if (i23 != -1) {
                                            constraintLayout = this;
                                            int i59 = i18;
                                            constraintLayout.l(n61Var5, b61Var2, sparseArray10, i23, i59);
                                            i24 = i59;
                                        } else {
                                            i24 = i18;
                                            i25 = b61Var2.f399o;
                                            constraintLayout = this;
                                            if (i25 != -1) {
                                                constraintLayout.l(n61Var5, b61Var2, sparseArray10, i25, i16);
                                            }
                                        }
                                    }
                                    if (f2 >= 0.0f) {
                                        n61Var5.c0 = f2;
                                    }
                                    f3 = b61Var2.F;
                                    if (f3 >= 0.0f) {
                                        n61Var5.d0 = f3;
                                    }
                                }
                                i7 = i6;
                                i8 = 4;
                                if (i54 != -1) {
                                    n61Var8 = (n61) sparseArray10.get(i54);
                                    if (n61Var8 != null) {
                                        n61VarB3.t(i8, i7, ((ViewGroup.MarginLayoutParams) b61Var2).rightMargin, i5, n61Var8);
                                    }
                                    i9 = i7;
                                } else {
                                    i9 = i7;
                                    i10 = i5;
                                    if (i4 != -1) {
                                        n61VarB3.t(i8, i8, ((ViewGroup.MarginLayoutParams) b61Var2).rightMargin, i10, n61Var2);
                                    }
                                }
                                i11 = i8;
                                i12 = b61Var2.i;
                                if (i12 != -1) {
                                    n61Var7 = (n61) sparseArray10.get(i12);
                                    if (n61Var7 != null) {
                                        i26 = 3;
                                        n61VarB3.t(3, 3, ((ViewGroup.MarginLayoutParams) b61Var2).topMargin, b61Var2.x, n61Var7);
                                    } else {
                                        i26 = 3;
                                    }
                                    i15 = i26;
                                    i16 = 5;
                                    i14 = -1;
                                } else {
                                    i13 = b61Var2.j;
                                    if (i13 != -1) {
                                        i14 = -1;
                                        i15 = 3;
                                        i16 = 5;
                                    } else {
                                        i14 = -1;
                                        i15 = 3;
                                        i16 = 5;
                                    }
                                }
                                i17 = b61Var2.k;
                                if (i17 != i14) {
                                    n61Var6 = (n61) sparseArray10.get(i17);
                                    if (n61Var6 != null) {
                                        n61VarB3.t(i16, i15, ((ViewGroup.MarginLayoutParams) b61Var2).bottomMargin, b61Var2.z, n61Var6);
                                    }
                                    i18 = i15;
                                } else {
                                    i18 = i15;
                                    i19 = b61Var2.l;
                                    if (i19 != i14) {
                                        n61VarB3.t(i16, i16, ((ViewGroup.MarginLayoutParams) b61Var2).bottomMargin, b61Var2.z, n61Var4);
                                    }
                                }
                                f2 = f;
                                i20 = b61Var2.m;
                                if (i20 != -1) {
                                    i22 = i9;
                                    i21 = i11;
                                    n61Var5 = n61VarB3;
                                    constraintLayout.l(n61Var5, b61Var2, sparseArray10, i20, 6);
                                    constraintLayout = this;
                                    i24 = i18;
                                } else {
                                    i21 = i11;
                                    n61Var5 = n61VarB3;
                                    i22 = i9;
                                    i23 = b61Var2.n;
                                    if (i23 != -1) {
                                        constraintLayout = this;
                                        int i510 = i18;
                                        constraintLayout.l(n61Var5, b61Var2, sparseArray10, i23, i510);
                                        i24 = i510;
                                    } else {
                                        i24 = i18;
                                        i25 = b61Var2.f399o;
                                        constraintLayout = this;
                                        if (i25 != -1) {
                                            constraintLayout.l(n61Var5, b61Var2, sparseArray10, i25, i16);
                                        }
                                    }
                                }
                                if (f2 >= 0.0f) {
                                    n61Var5.c0 = f2;
                                }
                                f3 = b61Var2.F;
                                if (f3 >= 0.0f) {
                                    n61Var5.d0 = f3;
                                }
                            }
                            if (z3 && ((i30 = b61Var2.T) != -1 || b61Var2.U != -1)) {
                                int i60 = b61Var2.U;
                                n61Var5.X = i30;
                                n61Var5.Y = i60;
                            }
                            if (b61Var2.a0) {
                                n61Var5.I(1);
                                n61Var5.K(((ViewGroup.MarginLayoutParams) b61Var2).width);
                                if (((ViewGroup.MarginLayoutParams) b61Var2).width == -2) {
                                    n61Var5.I(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) b61Var2).width == -1) {
                                if (b61Var2.W) {
                                    n61Var5.I(3);
                                } else {
                                    n61Var5.I(4);
                                }
                                n61Var5.g(i22).g = ((ViewGroup.MarginLayoutParams) b61Var2).leftMargin;
                                n61Var5.g(i21).g = ((ViewGroup.MarginLayoutParams) b61Var2).rightMargin;
                            } else {
                                n61Var5.I(3);
                                n61Var5.K(0);
                            }
                            if (b61Var2.b0) {
                                i27 = -1;
                                n61Var5.J(1);
                                n61Var5.H(((ViewGroup.MarginLayoutParams) b61Var2).height);
                                if (((ViewGroup.MarginLayoutParams) b61Var2).height == -2) {
                                    n61Var5.J(2);
                                }
                            } else {
                                i27 = -1;
                                if (((ViewGroup.MarginLayoutParams) b61Var2).height == -1) {
                                    if (b61Var2.X) {
                                        n61Var5.J(3);
                                    } else {
                                        n61Var5.J(4);
                                    }
                                    n61Var5.g(i24).g = ((ViewGroup.MarginLayoutParams) b61Var2).topMargin;
                                    n61Var5.g(i16).g = ((ViewGroup.MarginLayoutParams) b61Var2).bottomMargin;
                                } else {
                                    n61Var5.J(3);
                                    n61Var5.H(0);
                                }
                            }
                            String str5 = b61Var2.G;
                            if (str5 == null || str5.length() == 0) {
                                n61Var5.V = 0.0f;
                            } else {
                                int length = str5.length();
                                int iIndexOf3 = str5.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i28 = i27;
                                    i29 = 0;
                                } else {
                                    String strSubstring = str5.substring(0, iIndexOf3);
                                    i28 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i27;
                                    i29 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str5.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str5.substring(i29);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str5.substring(i29, iIndexOf4);
                                    String strSubstring4 = str5.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= 0.0f || f8 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i28 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    n61Var5.V = fAbs;
                                    n61Var5.W = i28;
                                }
                            }
                            float f9 = b61Var2.H;
                            float[] fArr = n61Var5.j0;
                            fArr[0] = f9;
                            fArr[1] = b61Var2.I;
                            n61Var5.h0 = b61Var2.J;
                            n61Var5.i0 = b61Var2.K;
                            int i61 = b61Var2.Z;
                            if (i61 >= 0 && i61 <= 3) {
                                n61Var5.q = i61;
                            }
                            int i62 = b61Var2.L;
                            int i63 = b61Var2.N;
                            int i64 = b61Var2.P;
                            float f10 = b61Var2.R;
                            n61Var5.r = i62;
                            n61Var5.u = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            n61Var5.v = i64;
                            n61Var5.w = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i62 == 0) {
                                n61Var5.r = 2;
                            }
                            int i65 = b61Var2.M;
                            int i66 = b61Var2.O;
                            int i67 = b61Var2.Q;
                            float f11 = b61Var2.S;
                            n61Var5.s = i65;
                            n61Var5.x = i66;
                            if (i67 == Integer.MAX_VALUE) {
                                i67 = 0;
                            }
                            n61Var5.y = i67;
                            n61Var5.z = f11;
                            if (f11 <= 0.0f || f11 >= 1.0f || i65 != 0) {
                                c = 2;
                            } else {
                                c = 2;
                                n61Var5.s = 2;
                            }
                        }
                    }
                    i49++;
                    c = c;
                }
            } else {
                o61Var = o61Var4;
                z2 = z;
            }
            if (z2) {
                o61Var.q0.W(o61Var);
            }
        } else {
            o61Var = o61Var4;
        }
        o61Var.v0.getClass();
        constraintLayout.k(o61Var, constraintLayout.u, i, i2);
        int iO = o61Var.o();
        int i68 = o61Var.i();
        boolean z7 = o61Var.D0;
        boolean z8 = o61Var.E0;
        c61 c61Var = constraintLayout.A;
        int i69 = c61Var.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iO + c61Var.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i68 + i69, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.r, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.s, iResolveSizeAndState2);
        if (z7) {
            iMin |= 16777216;
        }
        if (z8) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        ArrayList arrayList = this.n;
        super.onViewAdded(view);
        n61 n61VarB = b(view);
        if ((view instanceof Guideline) && !(n61VarB instanceof g43)) {
            b61 b61Var = (b61) view.getLayoutParams();
            g43 g43Var = new g43();
            b61Var.p0 = g43Var;
            b61Var.d0 = true;
            g43Var.O(b61Var.V);
        }
        if (view instanceof z51) {
            z51 z51Var = (z51) view;
            z51Var.j();
            ((b61) view.getLayoutParams()).e0 = true;
            if (!arrayList.contains(z51Var)) {
                arrayList.add(z51Var);
            }
        }
        this.m.put(view.getId(), view);
        this.t = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.m.remove(view.getId());
        n61 n61VarB = b(view);
        this.f15o.p0.remove(n61VarB);
        n61VarB.A();
        this.n.remove(view);
        this.t = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.t = true;
        super.requestLayout();
    }

    public void setConstraintSet(k61 k61Var) {
        this.v = k61Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        SparseArray sparseArray = this.m;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.s) {
            return;
        }
        this.s = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(s61 s61Var) {
        wk0 wk0Var = this.w;
        if (wk0Var != null) {
            wk0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.u = i;
        o61 o61Var = this.f15o;
        o61Var.C0 = i;
        ba4.q = o61Var.S(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new SparseArray();
        this.n = new ArrayList(4);
        this.f15o = new o61();
        this.p = 0;
        this.q = 0;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = true;
        this.u = 257;
        this.v = null;
        this.w = null;
        this.x = -1;
        this.y = new HashMap();
        this.z = new SparseArray();
        this.A = new c61(this, this);
        i(attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b61 b61Var = new b61(layoutParams);
        b61Var.a = -1;
        b61Var.b = -1;
        b61Var.c = -1.0f;
        b61Var.d = true;
        b61Var.e = -1;
        b61Var.f = -1;
        b61Var.g = -1;
        b61Var.h = -1;
        b61Var.i = -1;
        b61Var.j = -1;
        b61Var.k = -1;
        b61Var.l = -1;
        b61Var.m = -1;
        b61Var.n = -1;
        b61Var.f399o = -1;
        b61Var.p = -1;
        b61Var.q = 0;
        b61Var.r = 0.0f;
        b61Var.s = -1;
        b61Var.t = -1;
        b61Var.u = -1;
        b61Var.v = -1;
        b61Var.w = Integer.MIN_VALUE;
        b61Var.x = Integer.MIN_VALUE;
        b61Var.y = Integer.MIN_VALUE;
        b61Var.z = Integer.MIN_VALUE;
        b61Var.A = Integer.MIN_VALUE;
        b61Var.B = Integer.MIN_VALUE;
        b61Var.C = Integer.MIN_VALUE;
        b61Var.D = 0;
        b61Var.E = 0.5f;
        b61Var.F = 0.5f;
        b61Var.G = null;
        b61Var.H = -1.0f;
        b61Var.I = -1.0f;
        b61Var.J = 0;
        b61Var.K = 0;
        b61Var.L = 0;
        b61Var.M = 0;
        b61Var.N = 0;
        b61Var.O = 0;
        b61Var.P = 0;
        b61Var.Q = 0;
        b61Var.R = 1.0f;
        b61Var.S = 1.0f;
        b61Var.T = -1;
        b61Var.U = -1;
        b61Var.V = -1;
        b61Var.W = false;
        b61Var.X = false;
        b61Var.Y = null;
        b61Var.Z = 0;
        b61Var.a0 = true;
        b61Var.b0 = true;
        b61Var.c0 = false;
        b61Var.d0 = false;
        b61Var.e0 = false;
        b61Var.f0 = -1;
        b61Var.g0 = -1;
        b61Var.h0 = -1;
        b61Var.i0 = -1;
        b61Var.j0 = Integer.MIN_VALUE;
        b61Var.k0 = Integer.MIN_VALUE;
        b61Var.l0 = 0.5f;
        b61Var.p0 = new n61();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) b61Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) b61Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) b61Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) b61Var).bottomMargin = marginLayoutParams.bottomMargin;
            b61Var.setMarginStart(marginLayoutParams.getMarginStart());
            b61Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof b61)) {
            return b61Var;
        }
        b61 b61Var2 = (b61) layoutParams;
        b61Var.a = b61Var2.a;
        b61Var.b = b61Var2.b;
        b61Var.c = b61Var2.c;
        b61Var.d = b61Var2.d;
        b61Var.e = b61Var2.e;
        b61Var.f = b61Var2.f;
        b61Var.g = b61Var2.g;
        b61Var.h = b61Var2.h;
        b61Var.i = b61Var2.i;
        b61Var.j = b61Var2.j;
        b61Var.k = b61Var2.k;
        b61Var.l = b61Var2.l;
        b61Var.m = b61Var2.m;
        b61Var.n = b61Var2.n;
        b61Var.f399o = b61Var2.f399o;
        b61Var.p = b61Var2.p;
        b61Var.q = b61Var2.q;
        b61Var.r = b61Var2.r;
        b61Var.s = b61Var2.s;
        b61Var.t = b61Var2.t;
        b61Var.u = b61Var2.u;
        b61Var.v = b61Var2.v;
        b61Var.w = b61Var2.w;
        b61Var.x = b61Var2.x;
        b61Var.y = b61Var2.y;
        b61Var.z = b61Var2.z;
        b61Var.A = b61Var2.A;
        b61Var.B = b61Var2.B;
        b61Var.C = b61Var2.C;
        b61Var.D = b61Var2.D;
        b61Var.E = b61Var2.E;
        b61Var.F = b61Var2.F;
        b61Var.G = b61Var2.G;
        b61Var.H = b61Var2.H;
        b61Var.I = b61Var2.I;
        b61Var.J = b61Var2.J;
        b61Var.K = b61Var2.K;
        b61Var.W = b61Var2.W;
        b61Var.X = b61Var2.X;
        b61Var.L = b61Var2.L;
        b61Var.M = b61Var2.M;
        b61Var.N = b61Var2.N;
        b61Var.P = b61Var2.P;
        b61Var.O = b61Var2.O;
        b61Var.Q = b61Var2.Q;
        b61Var.R = b61Var2.R;
        b61Var.S = b61Var2.S;
        b61Var.T = b61Var2.T;
        b61Var.U = b61Var2.U;
        b61Var.V = b61Var2.V;
        b61Var.a0 = b61Var2.a0;
        b61Var.b0 = b61Var2.b0;
        b61Var.c0 = b61Var2.c0;
        b61Var.d0 = b61Var2.d0;
        b61Var.f0 = b61Var2.f0;
        b61Var.g0 = b61Var2.g0;
        b61Var.h0 = b61Var2.h0;
        b61Var.i0 = b61Var2.i0;
        b61Var.j0 = b61Var2.j0;
        b61Var.k0 = b61Var2.k0;
        b61Var.l0 = b61Var2.l0;
        b61Var.Y = b61Var2.Y;
        b61Var.Z = b61Var2.Z;
        b61Var.p0 = b61Var2.p0;
        return b61Var;
    }
}
