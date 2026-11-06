package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.b5;
import io.sentry.f6;

/* JADX INFO: loaded from: classes.dex */
public final class m2 implements SensorEventListener {
    public SensorManager a;
    public Sensor b;
    public HandlerThread c;
    public Handler d;
    public volatile j2 e;
    public io.sentry.g1 f;
    public boolean g;
    public final l2 h;

    public m2(io.sentry.g1 g1Var) {
        l2 l2Var = new l2();
        l2Var.c = new w0();
        this.h = l2Var;
        this.f = g1Var;
    }

    public final synchronized void a() {
        this.g = true;
        d();
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.c = null;
            this.d = null;
        }
    }

    public final synchronized void b(Context context) {
        try {
            if (this.g) {
                return;
            }
            SensorManager sensorManager = this.a;
            if (sensorManager == null) {
                sensorManager = (SensorManager) context.getSystemService("sensor");
                this.a = sensorManager;
            }
            if (sensorManager != null && this.b == null) {
                this.b = sensorManager.getDefaultSensor(1, false);
            }
            if (this.b != null && this.c == null) {
                HandlerThread handlerThread = new HandlerThread("sentry-shake");
                this.c = handlerThread;
                handlerThread.start();
                this.d = new Handler(this.c.getLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Activity activity, j2 j2Var) {
        if (this.g) {
            return;
        }
        this.e = j2Var;
        b(activity);
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            this.f.g(f6.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            this.f.g(f6.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.d);
        }
    }

    public final synchronized void d() {
        try {
            this.e = null;
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            Handler handler = this.d;
            if (handler != null) {
                handler.post(new b5((Object) this, (byte) 9));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        int i2;
        k2 k2Var;
        int i3;
        k2 k2Var2;
        int i4 = 1;
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        boolean z = Math.sqrt((double) ((f3 * f3) + ((f2 * f2) + (f * f)))) > 13.0d;
        l2 l2Var = this.h;
        long j = sensorEvent.timestamp;
        w0 w0Var = (w0) l2Var.c;
        long j2 = j - 500000000;
        while (true) {
            i = l2Var.a;
            if (i >= 4 && (k2Var2 = (k2) l2Var.d) != null) {
                i2 = i4;
                if (j2 - k2Var2.a <= 0) {
                    break;
                }
                if (k2Var2.b) {
                    l2Var.b -= i2;
                }
                l2Var.a = i - 1;
                k2 k2Var3 = k2Var2.c;
                l2Var.d = k2Var3;
                if (k2Var3 == null) {
                    l2Var.e = null;
                }
                k2Var2.c = (k2) w0Var.a;
                w0Var.a = k2Var2;
                i4 = i2;
            } else {
                i2 = i4;
                break;
            }
        }
        k2 k2Var4 = (k2) w0Var.a;
        if (k2Var4 == null) {
            k2Var4 = new k2();
        } else {
            w0Var.a = k2Var4.c;
        }
        k2Var4.a = j;
        k2Var4.b = z;
        k2Var4.c = null;
        k2 k2Var5 = (k2) l2Var.e;
        if (k2Var5 != null) {
            k2Var5.c = k2Var4;
        }
        l2Var.e = k2Var4;
        if (((k2) l2Var.d) == null) {
            l2Var.d = k2Var4;
        }
        l2Var.a = i + i2;
        if (z) {
            l2Var.b += i2;
        }
        l2 l2Var2 = this.h;
        k2 k2Var6 = (k2) l2Var2.e;
        if (k2Var6 == null || (k2Var = (k2) l2Var2.d) == null || (i3 = l2Var2.a) < 4 || k2Var6.a - k2Var.a < 250000000 || l2Var2.b < (i3 >> 1) + (i3 >> 2)) {
            return;
        }
        while (true) {
            k2 k2Var7 = (k2) l2Var2.d;
            if (k2Var7 == null) {
                break;
            }
            l2Var2.d = k2Var7.c;
            w0 w0Var2 = (w0) l2Var2.c;
            k2Var7.c = (k2) w0Var2.a;
            w0Var2.a = k2Var7;
        }
        l2Var2.e = null;
        l2Var2.a = 0;
        l2Var2.b = 0;
        j2 j2Var = this.e;
        if (j2Var != null) {
            j2Var.c();
        }
    }
}
