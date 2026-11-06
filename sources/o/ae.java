package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ae {
    public static final jn3 e = new jn3((byte) 0);
    public static final jn3 f = new jn3((byte) 1);
    public static ae g;
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    public ae(yk3 yk3Var, h44 h44Var) {
        Object ok1Var;
        this.a = (byte) 9;
        ae aeVar = h44Var.a;
        int i = yk3Var.m;
        if (i < 0) {
            ni3.c("negative nearestRange.first");
        }
        int iMin = Math.min(yk3Var.n, aeVar.b - 1);
        if (iMin < i) {
            vw4 vw4Var = h65.a;
            vw4Var.getClass();
            this.c = vw4Var;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        vw4 vw4Var2 = new vw4(i2);
        xx4 xx4Var = (xx4) aeVar.c;
        if (i < 0 || i >= aeVar.b) {
            ni3.e("Index " + i + ", size " + aeVar.b);
        }
        if (iMin < 0 || iMin >= aeVar.b) {
            ni3.e("Index " + iMin + ", size " + aeVar.b);
        }
        if (iMin < i) {
            ni3.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iP = it1.p(i, xx4Var);
        int i3 = ((am3) xx4Var.m[iP]).a;
        while (i3 <= iMin) {
            am3 am3Var = (am3) xx4Var.m[iP];
            Function1 function1 = (Function1) am3Var.c.n;
            int i4 = am3Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (am3Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (function1 != null) {
                        ok1Var = function1.invoke(Integer.valueOf(iMax - i4));
                        ok1Var = ok1Var == null ? new ok1(iMax) : ok1Var;
                    }
                    vw4Var2.g(iMax, ok1Var);
                    ((Object[]) this.d)[iMax - this.b] = ok1Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += am3Var.b;
            iP++;
        }
        this.c = vw4Var2;
    }

    public static int d(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int e(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public void a(int i, ep3 ep3Var) {
        if (i < 0) {
            ni3.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        am3 am3Var = new am3(this.b, i, ep3Var);
        this.b += i;
        ((xx4) this.c).b(am3Var);
    }

    public void b() {
        y41 y41Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            h62.a(drawable);
        }
        if (drawable == null || (y41Var = (y41) this.d) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = us.b;
        bc6.i(drawable, y41Var, drawableState);
    }

    public void c(RecyclerView recyclerView, c76 c76Var) {
        recyclerView.getClass();
        c76Var.getClass();
        View viewR = ((s) c76Var).r();
        viewR.getClass();
        Object tag = viewR.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = be8.a;
            viewR.setElevation(fFloatValue);
        }
        viewR.setTag(R.id.item_touch_helper_previous_elevation, null);
        viewR.setTranslationX(0.0f);
        viewR.setTranslationY(0.0f);
    }

    public am3 f(int i) {
        if (i < 0 || i >= this.b) {
            ni3.e("Index " + i + ", size " + this.b);
        }
        am3 am3Var = (am3) this.d;
        if (am3Var != null) {
            int i2 = am3Var.a;
            if (i < am3Var.b + i2 && i2 <= i) {
                return am3Var;
            }
        }
        xx4 xx4Var = (xx4) this.c;
        am3 am3Var2 = (am3) xx4Var.m[it1.p(i, xx4Var)];
        this.d = am3Var2;
        return am3Var2;
    }

    public int g(Object obj) {
        vw4 vw4Var = (vw4) this.c;
        int iD = vw4Var.d(obj);
        if (iD >= 0) {
            return vw4Var.c[iD];
        }
        return -1;
    }

    public int h(RecyclerView recyclerView, c76 c76Var) {
        recyclerView.getClass();
        c76Var.getClass();
        int iW = c76Var instanceof s ? ((s) c76Var).w() : 0;
        return iW | (iW << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int i(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i9 = this.b;
        int i10 = i9 + 3;
        this.b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            ki3.c("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            ki3.c("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = w56.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public int j(RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.b;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.b = dimensionPixelSize;
        }
        int interpolation = (int) (e.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public void k(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = zz5.f;
        ep3 ep3VarX = ep3.x(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        be8.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) ep3VarX.f733o, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = uf0.p(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h62.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(ep3VarX.i(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(h62.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            ep3VarX.B();
        }
    }

    public void l(Canvas canvas, RecyclerView recyclerView, c76 c76Var, float f2, float f3, int i, boolean z) {
        canvas.getClass();
        c76Var.getClass();
        s sVar = (s) c76Var;
        View viewR = sVar.r();
        viewR.getClass();
        float f4 = 0.0f;
        if (i == 1) {
            r rVar = r.m;
            r rVar2 = f2 > 0.0f ? r.n : rVar;
            View viewS = sVar.s();
            if (viewS != null) {
                viewS.setAlpha(rVar2 == rVar ? 0.0f : 1.0f);
            }
            View viewU = sVar.u();
            if (viewU != null) {
                viewU.setAlpha(rVar2 == rVar ? 1.0f : 0.0f);
            }
        }
        float width = viewR.getWidth() * 0.7f;
        if (Math.abs(f2) > width) {
            f2 = Math.signum(f2) * width;
        }
        if (z && viewR.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = be8.a;
            Float fValueOf = Float.valueOf(viewR.getElevation());
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != viewR) {
                    WeakHashMap weakHashMap2 = be8.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f4) {
                        f4 = elevation;
                    }
                }
            }
            viewR.setElevation(f4 + 1.0f);
            viewR.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        viewR.setTranslationX(f2);
        viewR.setTranslationY(f3);
    }

    public void m(int i) {
        this.b = i;
        boolean z = i == 0;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        linkedHashSet.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            weakReference.getClass();
            if (weakReference.get() == null) {
                it.remove();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            de4 de4Var = (de4) ((WeakReference) it2.next()).get();
            if (de4Var != null) {
                LockManager lockManager = de4Var.a;
                SharedPreferences sharedPreferences = lockManager.b;
                if (z) {
                    if (!lockManager.b()) {
                        lockManager.c = SystemClock.elapsedRealtime();
                        lockManager.f = lockManager.a();
                    }
                } else if (lockManager.e && lockManager.a()) {
                    lockManager.e = false;
                    fx3.q(sharedPreferences, "lock_enabled", true);
                } else {
                    if (lockManager.f & (!lockManager.a()) & sharedPreferences.getBoolean("lock_enabled", false)) {
                        fx3.q(sharedPreferences, "lock_enabled", false);
                    }
                }
            }
        }
    }

    public void n(int i) {
        ImageView imageView = (ImageView) this.c;
        if (i != 0) {
            Drawable drawableP = uf0.p(imageView.getContext(), i);
            if (drawableP != null) {
                h62.a(drawableP);
            }
            imageView.setImageDrawable(drawableP);
        } else {
            imageView.setImageDrawable(null);
        }
        b();
    }

    public void o(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = w56.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i7 = this.b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = w56.b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case ep1.d /* 12 */:
                return "{device:" + ((String) this.c) + ", contact:" + this.b + ", authorization:" + ((ij6) this.d) + "}";
            case 13:
            default:
                return super.toString();
            case 14:
                StringBuilder sb = new StringBuilder();
                if (((yw5) this.c) == yw5.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
        }
    }

    public /* synthetic */ ae(Object obj, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = serializable;
        this.b = i;
    }

    public ae(RemoteControlApplication remoteControlApplication) {
        this.a = (byte) 1;
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        remoteControlApplication.registerActivityLifecycleCallbacks(new v7(this, (byte) 0));
    }

    public ae(yw5 yw5Var, int i, String str) {
        this.a = (byte) 14;
        this.c = yw5Var;
        this.b = i;
        this.d = str;
    }

    public ae(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = (byte) 2;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            hk0.g("changes cannot be empty");
            throw null;
        }
    }

    public ae(ImageView imageView) {
        this.a = (byte) 3;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ ae(byte b) {
        this.a = b;
    }

    public ae() {
        this.a = (byte) 8;
        this.c = new xx4(new am3[16]);
    }

    public ae(ee8 ee8Var) {
        this.a = (byte) 5;
        this.c = ee8Var;
    }

    public ae(View view, j93 j93Var) {
        this.a = (byte) 0;
        this.b = -1;
        this.c = view;
        this.d = j93Var;
    }
}
