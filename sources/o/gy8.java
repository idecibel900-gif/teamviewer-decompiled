package o;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gy8 implements bj1 {
    public static gy8 f;
    public static gy8 g;
    public static HandlerThread h;
    public static Handler i;
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x0024, B:6:0x002a, B:9:0x0042), top: B:18:0x0024 }] */
    public gy8(Context context, Uri uri) {
        this.a = (byte) 6;
        context.getClass();
        this.c = context;
        this.d = uri;
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name", "_size"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    this.e = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    this.b = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("_size"));
                } else {
                    this.e = null;
                    this.b = 0;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kh.n(cursorQuery, th);
                    throw th2;
                }
            }
        } else {
            this.e = null;
            this.b = 0;
        }
        kh.n(cursorQuery, null);
    }

    public static void a(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i2 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
            }
        }
    }

    public static synchronized gy8 t(Context context) {
        gy8 gy8Var;
        gy8Var = f;
        if (gy8Var == null) {
            gy8Var = new gy8(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new wy4("MessengerIpcClient"))));
            f = gy8Var;
        }
        return gy8Var;
    }

    public void b(wk0 wk0Var) {
        if (wk0Var != null) {
            nq1 nq1Var = (nq1) wk0Var;
            w20 w20Var = (w20) this.c;
            w20[] w20VarArr = (w20[]) nq1Var.f2420o;
            for (w20 w20Var2 : w20VarArr) {
                if (w20Var2 != null) {
                    w20Var2.c();
                }
            }
            nq1Var.M(w20VarArr, w20Var);
            la0 la0Var = (la0) nq1Var.n;
            boolean z = nq1Var.p;
            wc6 wc6Var = z ? la0Var.b : la0Var.d;
            wc6 wc6Var2 = z ? la0Var.c : la0Var.e;
            int iT = nq1Var.t((int) wc6Var.b);
            int iT2 = nq1Var.t((int) wc6Var2.b);
            int i2 = -1;
            int iMax = 1;
            int i3 = 0;
            while (iT < iT2) {
                w20 w20Var3 = w20VarArr[iT];
                if (w20Var3 != null) {
                    int i4 = w20Var3.f;
                    int i5 = i4 - i2;
                    if (i5 == 0) {
                        i3++;
                    } else {
                        if (i5 == 1) {
                            iMax = Math.max(iMax, i3);
                            i2 = w20Var3.f;
                        } else if (i5 < 0 || i4 >= w20Var.f || i5 > iT) {
                            w20VarArr[iT] = null;
                        } else {
                            if (iMax > 2) {
                                i5 *= iMax - 2;
                            }
                            boolean z2 = i5 >= iT;
                            for (int i6 = 1; i6 <= i5 && !z2; i6++) {
                                z2 = w20VarArr[iT - i6] != null;
                            }
                            if (z2) {
                                w20VarArr[iT] = null;
                            } else {
                                i2 = w20Var3.f;
                            }
                        }
                        i3 = 1;
                    }
                }
                iT++;
            }
        }
    }

    public void c() {
        synchronized (this.e) {
            try {
                if (((Handler) this.c) == null) {
                    if (this.b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.d = handlerThread;
                    handlerThread.start();
                    this.c = new Handler(((HandlerThread) this.d).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable) {
        synchronized (this.e) {
            c();
            ((Handler) this.c).post(runnable);
        }
    }

    public long e() {
        Paint paint = (Paint) this.c;
        return Build.VERSION.SDK_INT >= 29 ? un8.a.a(paint) : j51.i(paint.getColor());
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.b + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ((Object[]) this.d)[i3];
            if (obj instanceof fq6) {
                fq6 fq6Var = (fq6) obj;
                boolean zN = im3.n(fq6Var.k(), lc7.e);
                int[] iArr = (int[]) this.e;
                if (!zN) {
                    int i4 = iArr[i3];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(fq6Var.f(i4));
                    }
                } else if (iArr[i3] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i3]);
                    sb.append("]");
                }
            } else if (obj == yl7.C) {
                sb.append("[<debug info disabled>]");
            } else if (obj != jk0.B) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int g() {
        Paint.Cap strokeCap = ((Paint) this.c).getStrokeCap();
        int i2 = strokeCap == null ? -1 : lj.a[strokeCap.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int h() {
        Paint.Join strokeJoin = ((Paint) this.c).getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : lj.b[strokeJoin.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void i() {
        int i2 = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i2);
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = -1;
        }
        cx.I0(0, 0, 14, (int[]) this.e, iArr);
        this.e = iArr;
    }

    public void j(float f2) {
        ((Paint) this.c).setAlpha((int) Math.rint(f2 * 255.0f));
    }

    public void k(int i2) {
        if (this.b == i2) {
            return;
        }
        this.b = i2;
        Paint paint = (Paint) this.c;
        if (Build.VERSION.SDK_INT >= 29) {
            un8.a.b(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(j51.V(i2)));
        }
    }

    public void l(long j) {
        Paint paint = (Paint) this.c;
        if (Build.VERSION.SDK_INT >= 29) {
            un8.a.c(paint, j);
        } else {
            paint.setColor(j51.U(j));
        }
    }

    public void m(tv0 tv0Var) {
        this.e = tv0Var;
        ((Paint) this.c).setColorFilter(tv0Var != null ? tv0Var.a : null);
    }

    public void n(int i2) {
        ((Paint) this.c).setFilterBitmap(!(i2 == 0));
    }

    public void o(Shader shader) {
        this.d = shader;
        ((Paint) this.c).setShader(shader);
    }

    public void p(int i2) {
        Paint.Cap cap;
        Paint paint = (Paint) this.c;
        if (i2 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i2 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i2 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void q(int i2) {
        Paint.Join join;
        Paint paint = (Paint) this.c;
        if (i2 == 0) {
            join = Paint.Join.MITER;
        } else if (i2 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i2 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void r(float f2) {
        ((Paint) this.c).setStrokeWidth(f2);
    }

    public void s(int i2) {
        ((Paint) this.c).setStyle(i2 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                int i2 = this.b;
                wk0[] wk0VarArr = (wk0[]) this.d;
                wk0 wk0Var = wk0VarArr[0];
                if (wk0Var == null) {
                    wk0Var = wk0VarArr[i2 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i3 = 0; i3 < ((w20[]) wk0Var.f2420o).length; i3++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i3));
                        for (int i4 = 0; i4 < i2 + 2; i4++) {
                            wk0 wk0Var2 = wk0VarArr[i4];
                            if (wk0Var2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                w20 w20Var = ((w20[]) wk0Var2.f2420o)[i3];
                                if (w20Var == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(w20Var.f), Integer.valueOf(w20Var.e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } catch (Throwable th) {
                        try {
                            formatter.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                String string = formatter.toString();
                formatter.close();
                return string;
            case 8:
                return f();
            default:
                return super.toString();
        }
    }

    public synchronized hy8 u(yx8 yx8Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(yx8Var.toString()));
            }
            if (!((tx8) this.e).a(yx8Var)) {
                tx8 tx8Var = new tx8(this);
                this.e = tx8Var;
                tx8Var.a(yx8Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return yx8Var.b.a;
    }

    public gy8(int i2, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 10;
        this.b = i2;
        this.e = str;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public gy8(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = (byte) 0;
        this.e = new tx8(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public gy8(lm lmVar, lm lmVar2, lm lmVar3, int i2) {
        this.a = (byte) 2;
        this.c = lmVar;
        this.d = lmVar2;
        this.e = lmVar3;
        this.b = i2;
    }

    public /* synthetic */ gy8(byte b) {
        this.a = b;
    }

    public gy8(dq3 dq3Var) {
        this.a = (byte) 8;
        this.c = dq3Var;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public gy8(List list) {
        this.a = (byte) 4;
        this.c = list;
    }

    public gy8() {
        this.a = (byte) 3;
        this.b = 0;
        this.e = new Object();
    }

    public gy8(w20 w20Var, la0 la0Var) {
        this.a = (byte) 5;
        this.c = w20Var;
        int i2 = w20Var.b;
        this.b = i2;
        this.e = la0Var;
        this.d = new wk0[i2 + 2];
    }

    public gy8(Paint paint) {
        this.a = (byte) 1;
        this.c = paint;
        this.b = 3;
    }

    public gy8(int i2) {
        this.a = (byte) 7;
        this.c = new SparseIntArray[9];
        this.d = new ArrayList();
        this.e = new hv2(this);
        this.b = i2;
    }
}
