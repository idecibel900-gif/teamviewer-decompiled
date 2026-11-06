package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy3 extends View implements View.OnClickListener {
    public static final int[] M0 = {-5};
    public static final int[] N0 = {R.attr.state_long_pressable};
    public static final int O0 = ViewConfiguration.getLongPressTimeout();
    public View A;
    public int A0;
    public cy3 B;
    public long B0;
    public boolean C;
    public boolean C0;
    public View D;
    public final StringBuilder D0;
    public int E;
    public boolean E0;
    public int F;
    public final Rect F0;
    public final HashMap G;
    public Bitmap G0;
    public tx3[] H;
    public boolean H0;
    public ay3 I;
    public Canvas I0;
    public final int J;
    public final AccessibilityManager J0;
    public int K;
    public final Context K0;
    public boolean L;
    public kd L0;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Paint T;
    public final Rect U;
    public long V;
    public long W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public long f0;
    public long g0;
    public final int[] h0;
    public GestureDetector i0;
    public int j0;
    public int k0;
    public int l0;
    public vx3 m;
    public final int m0;
    public int n;
    public boolean n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f566o;
    public tx3 o0;
    public final int p;
    public final Rect p0;
    public final int q;
    public boolean q0;
    public final float r;
    public final by3 r0;
    public final int s;
    public final int s0;
    public final TextView t;
    public final boolean t0;
    public final PopupWindow u;
    public int u0;
    public final int v;
    public float v0;
    public final int w;
    public float w0;
    public final int x;
    public final Drawable x0;
    public final int[] y;
    public final int[] y0;
    public final PopupWindow z;
    public int z0;

    public cy3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.keyboardViewStyle);
        this.n = -1;
        this.y = new int[2];
        this.L = true;
        this.d0 = -1;
        this.e0 = -1;
        this.h0 = new int[12];
        this.l0 = -1;
        this.p0 = new Rect(0, 0, 0, 0);
        this.r0 = new by3();
        this.u0 = 1;
        this.y0 = new int[12];
        this.D0 = new StringBuilder(1);
        this.F0 = new Rect();
        this.K0 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz5.b, R.attr.keyboardViewStyle, 0);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int resourceId = 0;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.x0 = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == 11) {
                this.J = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0);
            } else if (index == 2) {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 3) {
                this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0);
            } else if (index == 1) {
                this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 80);
            } else if (index == 5) {
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 18);
            } else if (index == 4) {
                this.q = typedArrayObtainStyledAttributes.getColor(index, -16777216);
            } else if (index == 7) {
                this.f566o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 14);
            } else if (index == 8) {
                this.m0 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 9) {
                this.s = typedArrayObtainStyledAttributes.getColor(index, 0);
            } else if (index == 10) {
                this.r = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        PopupWindow popupWindow = new PopupWindow(this.K0);
        this.u = popupWindow;
        if (resourceId != 0) {
            TextView textView = (TextView) layoutInflater.inflate(resourceId, (ViewGroup) null);
            this.t = textView;
            this.v = (int) textView.getTextSize();
            popupWindow.setContentView(textView);
            popupWindow.setBackgroundDrawable(null);
        } else {
            this.L = false;
        }
        popupWindow.setTouchable(false);
        PopupWindow popupWindow2 = new PopupWindow(this.K0);
        this.z = popupWindow2;
        popupWindow2.setBackgroundDrawable(null);
        this.D = this;
        Paint paint = new Paint();
        this.T = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(0.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAlpha(255);
        Rect rect = new Rect(0, 0, 0, 0);
        this.U = rect;
        this.G = new HashMap();
        this.x0.getPadding(rect);
        this.s0 = (int) (getResources().getDisplayMetrics().density * 500.0f);
        this.t0 = getResources().getBoolean(R.bool.config_swipeDisambiguation);
        this.J0 = (AccessibilityManager) context.getSystemService("accessibility");
        j();
    }

    public final CharSequence a(CharSequence charSequence) {
        return (!this.m.e || charSequence == null || charSequence.length() >= 3 || !Character.isLowerCase(charSequence.charAt(0))) ? charSequence : charSequence.toString().toUpperCase();
    }

    public final void b(int i, int i2, int i3, long j) {
        if (i != -1) {
            tx3[] tx3VarArr = this.H;
            if (i < tx3VarArr.length) {
                tx3 tx3Var = tx3VarArr[i];
                CharSequence charSequence = tx3Var.m;
                if (charSequence != null) {
                    this.I.q(charSequence);
                    this.I.l(-1);
                } else {
                    int i4 = tx3Var.a[0];
                    int[] iArr = new int[12];
                    Arrays.fill(iArr, -1);
                    d(i2, i3, iArr);
                    if (this.C0) {
                        if (this.A0 != -1) {
                            this.I.p(M0, -5);
                        } else {
                            this.A0 = 0;
                        }
                        i4 = tx3Var.a[this.A0];
                    }
                    this.I.p(iArr, i4);
                    this.I.l(i4);
                }
                this.z0 = i;
                this.B0 = j;
            }
        }
    }

    public final void c() {
        PopupWindow popupWindow = this.z;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.C = false;
            e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0 A[LOOP:4: B:93:0x0188->B:100:0x01b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:101:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:80:0x0168  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x0174 A[PHI: r6
      0x0174: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:84:0x0172, B:81:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:92:0x0186  */
    /* JADX WARN: Code duplicated, block: B:95:0x018b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1 A[LOOP:5: B:98:0x019f->B:99:0x01a1, LOOP_END] */
    public final int d(int i, int i2, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i3;
        boolean z;
        int iA;
        int[] iArr4;
        int length;
        int i4;
        int i5;
        cy3 cy3Var = this;
        tx3[] tx3VarArr = cy3Var.H;
        boolean z2 = true;
        int i6 = cy3Var.K + 1;
        int[] iArr5 = cy3Var.y0;
        Arrays.fill(iArr5, Integer.MAX_VALUE);
        vx3 vx3Var = cy3Var.m;
        if (vx3Var.f2356o == null) {
            vx3Var.m = (vx3Var.i + 9) / 10;
            vx3Var.n = (vx3Var.h + 4) / 5;
            vx3Var.f2356o = new int[50][];
            ArrayList arrayList = vx3Var.j;
            int[] iArr6 = new int[arrayList.size()];
            int i7 = vx3Var.m * 10;
            int i8 = vx3Var.n * 5;
            int i9 = 0;
            while (i9 < i7) {
                boolean z3 = z2;
                int i10 = 0;
                while (i10 < i8) {
                    tx3[] tx3VarArr2 = tx3VarArr;
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        tx3 tx3Var = (tx3) arrayList.get(i12);
                        int i13 = i6;
                        ArrayList arrayList2 = arrayList;
                        if (tx3Var.a(i9, i10) < vx3Var.p || tx3Var.a((vx3Var.m + i9) - 1, i10) < vx3Var.p || tx3Var.a((vx3Var.m + i9) - 1, (vx3Var.n + i10) - 1) < vx3Var.p || tx3Var.a(i9, (vx3Var.n + i10) - 1) < vx3Var.p) {
                            iArr6[i11] = i12;
                            i11++;
                        }
                        i12++;
                        i6 = i13;
                        arrayList = arrayList2;
                    }
                    int i14 = i6;
                    ArrayList arrayList3 = arrayList;
                    int[] iArr7 = new int[i11];
                    System.arraycopy(iArr6, 0, iArr7, 0, i11);
                    int[][] iArr8 = vx3Var.f2356o;
                    int i15 = vx3Var.n;
                    iArr8[(i9 / vx3Var.m) + ((i10 / i15) * 10)] = iArr7;
                    i10 += i15;
                    tx3VarArr = tx3VarArr2;
                    i6 = i14;
                    arrayList = arrayList3;
                }
                i9 += vx3Var.m;
                z2 = z3;
                tx3VarArr = tx3VarArr;
            }
        }
        tx3[] tx3VarArr3 = tx3VarArr;
        int i16 = i6;
        boolean z4 = z2;
        if (i < 0 || i >= vx3Var.i || i2 < 0 || i2 >= vx3Var.h) {
            iArr2 = new int[0];
        } else {
            int i17 = (i / vx3Var.m) + ((i2 / vx3Var.n) * 10);
            if (i17 < 50) {
                iArr2 = vx3Var.f2356o[i17];
            } else {
                iArr2 = new int[0];
            }
        }
        int length2 = iArr2.length;
        int length3 = iArr2.length;
        int i18 = i16;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        while (i19 < length3) {
            int i22 = iArr2[i19];
            tx3 tx3Var2 = tx3VarArr3[i22];
            int i23 = tx3Var2.f;
            int i24 = tx3Var2.f2151o;
            boolean z5 = (i24 & 1) > 0 ? z4 : false;
            boolean z6 = (i24 & 2) > 0 ? z4 : false;
            boolean z7 = (i24 & 4) > 0 ? z4 : false;
            boolean z8 = (i24 & 8) > 0 ? z4 : false;
            int i25 = tx3Var2.i;
            if (i < i25) {
                if (z5) {
                    iArr3 = iArr2;
                    if (i <= tx3Var2.e + i25) {
                    }
                    if (z) {
                        i20 = i22;
                    }
                    if (cy3Var.S) {
                        iA = tx3Var2.a(i, i2);
                        if (iA < cy3Var.K) {
                            iArr4 = tx3Var2.a;
                            if (iArr4[0] > 32) {
                                length = iArr4.length;
                                if (iA < i18) {
                                    i18 = iA;
                                    i21 = i22;
                                }
                                if (iArr == null) {
                                    for (i4 = 0; i4 < iArr5.length; i4++) {
                                        if (iArr5[i4] > iA) {
                                            int i26 = i4 + length;
                                            System.arraycopy(iArr5, i4, iArr5, i26, (iArr5.length - i4) - length);
                                            System.arraycopy(iArr, i4, iArr, i26, (iArr.length - i4) - length);
                                            for (i5 = 0; i5 < length; i5++) {
                                                int i27 = i4 + i5;
                                                iArr[i27] = tx3Var2.a[i5];
                                                iArr5[i27] = iA;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i19++;
                        cy3Var = this;
                        iArr2 = iArr3;
                    } else {
                        iA = 0;
                    }
                    if (z) {
                        iArr4 = tx3Var2.a;
                        if (iArr4[0] > 32) {
                            length = iArr4.length;
                            if (iA < i18) {
                                i18 = iA;
                                i21 = i22;
                            }
                            if (iArr == null) {
                                while (i4 < iArr5.length) {
                                    if (iArr5[i4] > iA) {
                                        int i28 = i4 + length;
                                        System.arraycopy(iArr5, i4, iArr5, i28, (iArr5.length - i4) - length);
                                        System.arraycopy(iArr, i4, iArr, i28, (iArr.length - i4) - length);
                                        while (i5 < length) {
                                            int i29 = i4 + i5;
                                            iArr[i29] = tx3Var2.a[i5];
                                            iArr5[i29] = iA;
                                        }
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i19++;
                    cy3Var = this;
                    iArr2 = iArr3;
                } else {
                    iArr3 = iArr2;
                }
                if (z) {
                    i20 = i22;
                }
                if (cy3Var.S) {
                    iA = tx3Var2.a(i, i2);
                    if (iA < cy3Var.K) {
                        iArr4 = tx3Var2.a;
                        if (iArr4[0] > 32) {
                            length = iArr4.length;
                            if (iA < i18) {
                                i18 = iA;
                                i21 = i22;
                            }
                            if (iArr == null) {
                                while (i4 < iArr5.length) {
                                    if (iArr5[i4] > iA) {
                                        int i210 = i4 + length;
                                        System.arraycopy(iArr5, i4, iArr5, i210, (iArr5.length - i4) - length);
                                        System.arraycopy(iArr, i4, iArr, i210, (iArr.length - i4) - length);
                                        while (i5 < length) {
                                            int i211 = i4 + i5;
                                            iArr[i211] = tx3Var2.a[i5];
                                            iArr5[i211] = iA;
                                        }
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i19++;
                    cy3Var = this;
                    iArr2 = iArr3;
                } else {
                    iA = 0;
                }
                if (z) {
                    iArr4 = tx3Var2.a;
                    if (iArr4[0] > 32) {
                        length = iArr4.length;
                        if (iA < i18) {
                            i18 = iA;
                            i21 = i22;
                        }
                        if (iArr == null) {
                            while (i4 < iArr5.length) {
                                if (iArr5[i4] > iA) {
                                    int i212 = i4 + length;
                                    System.arraycopy(iArr5, i4, iArr5, i212, (iArr5.length - i4) - length);
                                    System.arraycopy(iArr, i4, iArr, i212, (iArr.length - i4) - length);
                                    while (i5 < length) {
                                        int i213 = i4 + i5;
                                        iArr[i213] = tx3Var2.a[i5];
                                        iArr5[i213] = iA;
                                    }
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                }
                i19++;
                cy3Var = this;
                iArr2 = iArr3;
            } else {
                iArr3 = iArr2;
            }
            z = ((i < tx3Var2.e + i25 || (z6 && i >= i25)) && (i2 >= (i3 = tx3Var2.j) || (z7 && i2 <= i3 + i23)) && (i2 < i23 + i3 || (z8 && i2 >= i3))) ? z4 : false;
            if (z) {
                i20 = i22;
            }
            if (cy3Var.S) {
                iA = tx3Var2.a(i, i2);
                if (iA < cy3Var.K) {
                    iArr4 = tx3Var2.a;
                    if (iArr4[0] > 32) {
                        length = iArr4.length;
                        if (iA < i18) {
                            i18 = iA;
                            i21 = i22;
                        }
                        if (iArr == null) {
                            while (i4 < iArr5.length) {
                                if (iArr5[i4] > iA) {
                                    int i214 = i4 + length;
                                    System.arraycopy(iArr5, i4, iArr5, i214, (iArr5.length - i4) - length);
                                    System.arraycopy(iArr, i4, iArr, i214, (iArr.length - i4) - length);
                                    while (i5 < length) {
                                        int i215 = i4 + i5;
                                        iArr[i215] = tx3Var2.a[i5];
                                        iArr5[i215] = iA;
                                    }
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                }
                i19++;
                cy3Var = this;
                iArr2 = iArr3;
            } else {
                iA = 0;
            }
            if (z) {
                iArr4 = tx3Var2.a;
                if (iArr4[0] > 32) {
                    length = iArr4.length;
                    if (iA < i18) {
                        i18 = iA;
                        i21 = i22;
                    }
                    if (iArr == null) {
                        while (i4 < iArr5.length) {
                            if (iArr5[i4] > iA) {
                                int i216 = i4 + length;
                                System.arraycopy(iArr5, i4, iArr5, i216, (iArr5.length - i4) - length);
                                System.arraycopy(iArr, i4, iArr, i216, (iArr.length - i4) - length);
                                while (i5 < length) {
                                    int i217 = i4 + i5;
                                    iArr[i217] = tx3Var2.a[i5];
                                    iArr5[i217] = iA;
                                }
                                break;
                                break;
                            }
                        }
                    }
                }
            }
            i19++;
            cy3Var = this;
            iArr2 = iArr3;
        }
        return i20 == -1 ? i21 : i20;
    }

    public final void e() {
        this.F0.union(0, 0, getWidth(), getHeight());
        this.E0 = true;
        invalidate();
    }

    public final void f(int i) {
        tx3[] tx3VarArr = this.H;
        if (tx3VarArr != null && i >= 0 && i < tx3VarArr.length) {
            tx3 tx3Var = tx3VarArr[i];
            this.o0 = tx3Var;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i2 = tx3Var.i;
            int i3 = tx3Var.j;
            this.F0.union(i2 + paddingLeft, i3 + paddingTop, i2 + tx3Var.e + paddingLeft, i3 + tx3Var.f + paddingTop);
            g();
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    public final void g() {
        boolean z;
        int[] iArr;
        int i;
        int i2;
        Bitmap bitmap = this.G0;
        if (bitmap == null || this.H0) {
            if (bitmap == null || (this.H0 && (bitmap.getWidth() != getWidth() || this.G0.getHeight() != getHeight()))) {
                this.G0 = Bitmap.createBitmap(Math.max(1, getWidth()), Math.max(1, getHeight()), Bitmap.Config.ARGB_8888);
                this.I0 = new Canvas(this.G0);
            }
            e();
            this.H0 = false;
        }
        if (this.m == null) {
            return;
        }
        this.I0.save();
        Canvas canvas = this.I0;
        Rect rect = this.F0;
        canvas.clipRect(rect);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        tx3[] tx3VarArr = this.H;
        tx3 tx3Var = this.o0;
        int i3 = this.q;
        Paint paint = this.T;
        paint.setColor(i3);
        if (tx3Var != null) {
            Rect rect2 = this.p0;
            if (canvas.getClipBounds(rect2)) {
                int i4 = tx3Var.i;
                if ((i4 + paddingLeft) - 1 <= rect2.left) {
                    int i5 = tx3Var.j;
                    if ((i5 + paddingTop) - 1 > rect2.top || i4 + tx3Var.e + paddingLeft + 1 < rect2.right || i5 + tx3Var.f + paddingTop + 1 < rect2.bottom) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        int length = tx3VarArr.length;
        int length2 = tx3VarArr.length;
        int i6 = 0;
        while (i6 < length2) {
            tx3 tx3Var2 = tx3VarArr[i6];
            if (!z || tx3Var == tx3Var2) {
                boolean z2 = tx3Var2.l;
                int i7 = tx3Var2.f;
                Drawable drawable = tx3Var2.c;
                if (z2) {
                    iArr = tx3Var2.k ? tx3.t : tx3.s;
                } else {
                    boolean z3 = tx3Var2.h;
                    boolean z4 = tx3Var2.k;
                    if (z3) {
                        iArr = z4 ? tx3.v : tx3.u;
                    } else {
                        iArr = z4 ? tx3.x : tx3.w;
                    }
                }
                Drawable drawable2 = this.x0;
                drawable2.setState(iArr);
                CharSequence charSequence = tx3Var2.b;
                String string = charSequence == null ? null : a(charSequence).toString();
                Rect bounds = drawable2.getBounds();
                i = paddingLeft;
                int i8 = tx3Var2.e;
                i2 = paddingTop;
                if (i8 != bounds.right || i7 != bounds.bottom) {
                    drawable2.setBounds(0, 0, i8, i7);
                }
                canvas.translate(tx3Var2.i + i, tx3Var2.j + i2);
                drawable2.draw(canvas);
                Rect rect3 = this.U;
                if (string != null) {
                    if (string.length() <= 1 || tx3Var2.a.length >= 2) {
                        paint.setTextSize(this.p);
                        paint.setTypeface(Typeface.DEFAULT);
                    } else {
                        paint.setTextSize(this.f566o);
                        paint.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    paint.setShadowLayer(this.r, 0.0f, 0.0f, this.s);
                    int i9 = tx3Var2.e;
                    int i10 = rect3.left;
                    canvas.drawText(string, (((i9 - i10) - rect3.right) / 2.0f) + i10, ((paint.getTextSize() - paint.descent()) / 2.0f) + (((i7 - rect3.top) - rect3.bottom) / 2.0f) + rect3.top, paint);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else if (drawable != null) {
                    int intrinsicWidth = ((((tx3Var2.e - rect3.left) - rect3.right) - drawable.getIntrinsicWidth()) / 2) + rect3.left;
                    int intrinsicHeight = ((((i7 - rect3.top) - rect3.bottom) - drawable.getIntrinsicHeight()) / 2) + rect3.top;
                    canvas.translate(intrinsicWidth, intrinsicHeight);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.draw(canvas);
                    canvas.translate(-intrinsicWidth, -intrinsicHeight);
                }
                canvas.translate((-tx3Var2.i) - i, (-tx3Var2.j) - i2);
            } else {
                i = paddingLeft;
                i2 = paddingTop;
            }
            i6++;
            rect = rect;
            paddingLeft = i;
            paddingTop = i2;
        }
        Rect rect4 = rect;
        this.o0 = null;
        if (this.C) {
            paint.setColor(2130706432);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        this.I0.restore();
        this.E0 = false;
        rect4.setEmpty();
    }

    public vx3 getKeyboard() {
        return this.m;
    }

    public ay3 getOnKeyboardActionListener() {
        return this.I;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x0225  */
    public final void h(MotionEvent motionEvent, boolean z) {
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int x = ((int) motionEvent.getX()) - getPaddingLeft();
        int y = ((int) motionEvent.getY()) - getPaddingTop();
        int i7 = this.J;
        if (y >= (-i7)) {
            y += i7;
        }
        int i8 = y;
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        int iD = d(x, i8, null);
        this.q0 = z;
        by3 by3Var = this.r0;
        if (action == 0) {
            by3Var.c[0] = 0;
        }
        by3Var.getClass();
        long eventTime2 = motionEvent.getEventTime();
        int historySize = motionEvent.getHistorySize();
        int i9 = 0;
        while (i9 < historySize) {
            by3Var.a(motionEvent.getHistoricalX(i9), motionEvent.getHistoricalY(i9), motionEvent.getHistoricalEventTime(i9));
            i9++;
            x = x;
            i8 = i8;
        }
        int i10 = x;
        int i11 = i8;
        by3Var.a(motionEvent.getX(), motionEvent.getY(), eventTime2);
        if (!this.n0 || action == 0 || action == 3) {
            if (this.i0.onTouchEvent(motionEvent)) {
                m(-1);
                this.L0.removeMessages(3);
                this.L0.removeMessages(4);
                return;
            }
            if (!this.C || action == 3) {
                int i12 = O0;
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (iD == -1) {
                                this.L0.removeMessages(4);
                                if (iD != -1) {
                                    this.L0.sendMessageDelayed(this.L0.obtainMessage(4, motionEvent), i12);
                                }
                            } else {
                                int i13 = this.d0;
                                if (i13 == -1) {
                                    this.d0 = iD;
                                    this.g0 = eventTime - this.V;
                                } else if (iD == i13) {
                                    this.g0 = (eventTime - this.W) + this.g0;
                                } else if (this.l0 == -1) {
                                    j();
                                    this.a0 = this.d0;
                                    this.b0 = this.O;
                                    this.c0 = this.P;
                                    this.f0 = (this.g0 + eventTime) - this.W;
                                    this.d0 = iD;
                                    this.g0 = 0L;
                                }
                                this.L0.removeMessages(4);
                                if (iD != -1) {
                                    this.L0.sendMessageDelayed(this.L0.obtainMessage(4, motionEvent), i12);
                                }
                            }
                            m(this.d0);
                            this.W = eventTime;
                        } else if (action == 3) {
                            i();
                            c();
                            this.n0 = true;
                            m(-1);
                            f(this.d0);
                        }
                        i = i11;
                    } else {
                        i();
                        if (iD == this.d0) {
                            long j2 = this.g0 + (eventTime - this.W);
                            this.g0 = j2;
                            j = j2;
                        } else {
                            j();
                            this.a0 = this.d0;
                            this.f0 = (this.g0 + eventTime) - this.W;
                            this.d0 = iD;
                            this.g0 = 0L;
                            j = 0;
                        }
                        if (j >= this.f0 || j >= 70 || (i6 = this.a0) == -1) {
                            i4 = i10;
                            i5 = i11;
                        } else {
                            this.d0 = i6;
                            int i14 = this.b0;
                            i5 = this.c0;
                            i4 = i14;
                        }
                        m(-1);
                        Arrays.fill(this.h0, -1);
                        if (this.l0 == -1 && !this.C && !this.n0) {
                            b(this.d0, i4, i5, eventTime);
                        }
                        f(iD);
                        this.l0 = -1;
                        i3 = i4;
                        i2 = i5;
                    }
                    this.O = i3;
                    this.P = i2;
                }
                this.n0 = false;
                this.Q = i10;
                i = i11;
                this.R = i;
                this.b0 = i10;
                this.c0 = i;
                this.f0 = 0L;
                this.g0 = 0L;
                this.a0 = -1;
                this.d0 = iD;
                this.e0 = iD;
                long eventTime3 = motionEvent.getEventTime();
                this.V = eventTime3;
                this.W = eventTime3;
                if (iD != -1) {
                    int[] iArr = this.H[iD].a;
                    if (iArr.length > 1) {
                        this.C0 = true;
                        if (eventTime >= this.B0 + 800 || iD != this.z0) {
                            this.A0 = -1;
                        } else {
                            this.A0 = (this.A0 + 1) % iArr.length;
                        }
                    } else if (eventTime > this.B0 + 800 || iD != this.z0) {
                        j();
                    }
                }
                this.I.o(iD != -1 ? this.H[iD].a[0] : 0);
                int i15 = this.d0;
                if (i15 < 0 || !this.H[i15].r) {
                    if (this.d0 != -1) {
                        this.L0.sendMessageDelayed(this.L0.obtainMessage(4, motionEvent), i12);
                    }
                    m(iD);
                } else {
                    this.l0 = i15;
                    this.L0.sendMessageDelayed(this.L0.obtainMessage(3), 400L);
                    tx3 tx3Var = this.H[this.l0];
                    b(this.d0, tx3Var.i, tx3Var.j, this.B0);
                    if (this.n0) {
                        this.l0 = -1;
                    } else {
                        if (this.d0 != -1) {
                            this.L0.sendMessageDelayed(this.L0.obtainMessage(4, motionEvent), i12);
                        }
                        m(iD);
                    }
                }
                i3 = i10;
                i2 = i;
                this.O = i3;
                this.P = i2;
            }
        }
    }

    public final void i() {
        kd kdVar = this.L0;
        if (kdVar != null) {
            kdVar.removeMessages(3);
            this.L0.removeMessages(4);
            this.L0.removeMessages(1);
        }
    }

    public final void j() {
        this.z0 = -1;
        this.A0 = 0;
        this.B0 = -1L;
        this.C0 = false;
    }

    public final void k(int i, int i2) {
        AccessibilityManager accessibilityManager = this.J0;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
            onInitializeAccessibilityEvent(accessibilityEventObtain);
            accessibilityEventObtain.getText().add(String.valueOf((char) i2));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    public final void l(int i) {
        CharSequence charSequenceA;
        tx3[] tx3VarArr = this.H;
        if (i < 0 || i >= tx3VarArr.length) {
            return;
        }
        tx3 tx3Var = tx3VarArr[i];
        Drawable drawable = tx3Var.c;
        TextView textView = this.t;
        if (drawable != null) {
            Drawable drawable2 = tx3Var.d;
            if (drawable2 != null) {
                drawable = drawable2;
            }
            textView.setCompoundDrawables(null, null, null, drawable);
            textView.setText((CharSequence) null);
        } else {
            textView.setCompoundDrawables(null, null, null, null);
            if (this.C0) {
                StringBuilder sb = this.D0;
                sb.setLength(0);
                sb.append((char) tx3Var.a[Math.max(this.A0, 0)]);
                charSequenceA = a(sb);
            } else {
                charSequenceA = a(tx3Var.b);
            }
            textView.setText(charSequenceA);
            if (tx3Var.b.length() <= 1 || tx3Var.a.length >= 2) {
                textView.setTextSize(0, this.v);
                textView.setTypeface(Typeface.DEFAULT);
            } else {
                textView.setTextSize(0, this.p);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMax = Math.max(textView.getMeasuredWidth(), textView.getPaddingRight() + textView.getPaddingLeft() + tx3Var.e);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int i2 = this.x;
        if (layoutParams != null) {
            layoutParams.width = iMax;
            layoutParams.height = i2;
        }
        this.M = getPaddingLeft() + (tx3Var.i - textView.getPaddingLeft());
        this.N = (tx3Var.j - i2) + this.w;
        this.L0.removeMessages(2);
        int[] iArr = this.y;
        getLocationInWindow(iArr);
        iArr[0] = iArr[0] + this.E;
        iArr[1] = iArr[1] + this.F;
        textView.getBackground().setState(tx3Var.q != 0 ? N0 : View.EMPTY_STATE_SET);
        this.M += iArr[0];
        this.N += iArr[1];
        getLocationOnScreen(iArr);
        if (this.N + iArr[1] < 0) {
            int i3 = tx3Var.i + tx3Var.e;
            int width = getWidth() / 2;
            int i4 = this.M;
            int i5 = tx3Var.e;
            if (i3 <= width) {
                this.M = i4 + ((int) (((double) i5) * 2.5d));
            } else {
                this.M = i4 - ((int) (((double) i5) * 2.5d));
            }
            this.N += i2;
        }
        PopupWindow popupWindow = this.u;
        if (popupWindow.isShowing()) {
            popupWindow.update(this.M, this.N, iMax, i2);
        } else {
            popupWindow.setWidth(iMax);
            popupWindow.setHeight(i2);
            popupWindow.showAtLocation(this.D, 0, this.M, this.N);
        }
        textView.setVisibility(0);
    }

    public final void m(int i) {
        int i2 = this.n;
        this.n = i;
        tx3[] tx3VarArr = this.H;
        if (i2 != i) {
            if (i2 != -1 && tx3VarArr.length > i2) {
                tx3 tx3Var = tx3VarArr[i2];
                boolean z = i == -1;
                tx3Var.k = !tx3Var.k;
                if (tx3Var.h && z) {
                    tx3Var.l = !tx3Var.l;
                }
                f(i2);
                int i3 = tx3Var.a[0];
                k(256, i3);
                k(65536, i3);
            }
            int i4 = this.n;
            if (i4 != -1 && tx3VarArr.length > i4) {
                tx3 tx3Var2 = tx3VarArr[i4];
                tx3Var2.k = !tx3Var2.k;
                f(i4);
                int i5 = tx3Var2.a[0];
                k(128, i5);
                k(32768, i5);
            }
        }
        if (i2 == this.n || !this.L) {
            return;
        }
        this.L0.removeMessages(1);
        PopupWindow popupWindow = this.u;
        if (popupWindow.isShowing() && i == -1) {
            kd kdVar = this.L0;
            kdVar.sendMessageDelayed(kdVar.obtainMessage(2), 70L);
        }
        if (i != -1) {
            if (popupWindow.isShowing() && this.t.getVisibility() == 0) {
                l(i);
            } else {
                kd kdVar2 = this.L0;
                kdVar2.sendMessageDelayed(kdVar2.obtainMessage(1, i, 0), 0L);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i0 == null) {
            GestureDetector gestureDetector = new GestureDetector(this.K0, new ko0(this, (byte) 3));
            this.i0 = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
        }
        if (this.L0 == null) {
            this.L0 = new kd(this, Looper.getMainLooper(), (byte) 1);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PopupWindow popupWindow = this.u;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        i();
        c();
        this.G0 = null;
        this.I0 = null;
        this.G.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E0 || this.G0 == null || this.H0) {
            g();
        }
        canvas.drawBitmap(this.G0, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.J0.isTouchExplorationEnabled() && motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 7) {
                motionEvent.setAction(2);
            } else if (action == 9) {
                motionEvent.setAction(0);
            } else if (action == 10) {
                motionEvent.setAction(1);
            }
            onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        vx3 vx3Var = this.m;
        if (vx3Var == null) {
            setMeasuredDimension(paddingLeft + paddingRight, paddingTop + paddingBottom);
            return;
        }
        int size = vx3Var.i + paddingLeft + paddingRight;
        if (View.MeasureSpec.getSize(i) < size + 10) {
            size = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(size, this.m.h + paddingTop + paddingBottom);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        vx3 vx3Var = this.m;
        if (vx3Var != null) {
            ArrayList arrayList = vx3Var.q;
            arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = ((ux3) it.next()).e;
                int size = arrayList2.size();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    tx3 tx3Var = (tx3) arrayList2.get(i7);
                    if (i7 > 0) {
                        i5 += tx3Var.g;
                    }
                    i6 += tx3Var.e;
                }
                if (i5 + i6 > i) {
                    float f = (i - i5) / i6;
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        tx3 tx3Var2 = (tx3) arrayList2.get(i9);
                        int i10 = (int) (tx3Var2.e * f);
                        tx3Var2.e = i10;
                        tx3Var2.i = i8;
                        i8 += i10 + tx3Var2.g;
                    }
                }
            }
            vx3Var.i = i;
        }
        this.G0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        if (pointerCount != this.u0) {
            if (pointerCount == 1) {
                MotionEvent motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                h(motionEventObtain, false);
                motionEventObtain.recycle();
                if (action == 1) {
                    h(motionEvent, true);
                }
            } else {
                MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 1, this.v0, this.w0, motionEvent.getMetaState());
                h(motionEventObtain2, true);
                motionEventObtain2.recycle();
            }
        } else if (pointerCount == 1) {
            h(motionEvent, false);
            this.v0 = motionEvent.getX();
            this.w0 = motionEvent.getY();
        }
        this.u0 = pointerCount;
        return true;
    }

    public void setKeyboard(vx3 vx3Var) {
        if (this.m != null) {
            m(-1);
        }
        i();
        this.m = vx3Var;
        this.H = (tx3[]) vx3Var.j.toArray(new tx3[0]);
        requestLayout();
        this.H0 = true;
        e();
        tx3[] tx3VarArr = this.H;
        if (tx3VarArr != null) {
            int length = tx3VarArr.length;
            int iMin = 0;
            for (tx3 tx3Var : tx3VarArr) {
                iMin += Math.min(tx3Var.e, tx3Var.f) + tx3Var.g;
            }
            if (iMin >= 0 && length != 0) {
                int i = (int) ((iMin * 1.4f) / length);
                this.K = i * i;
            }
        }
        this.G.clear();
        this.n0 = true;
    }

    public void setOnKeyboardActionListener(ay3 ay3Var) {
        this.I = ay3Var;
    }

    public void setPopupParent(View view) {
        this.D = view;
    }

    public void setPreviewEnabled(boolean z) {
        this.L = z;
    }

    public void setProximityCorrectionEnabled(boolean z) {
        this.S = z;
    }

    public void setVerticalCorrection(int i) {
    }
}
