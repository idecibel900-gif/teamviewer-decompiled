package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import o.bj1;
import o.dj1;
import o.gy8;
import o.if6;
import o.kk0;
import o.l47;
import o.mk0;
import o.o10;
import o.pi1;
import o.pr4;
import o.qz;
import o.u20;
import o.uk0;
import o.uu4;
import o.xc0;
import o.xm3;
import o.z20;
import o.zi1;

/* JADX INFO: loaded from: classes.dex */
public class BarcodeView extends uk0 {
    public int N;
    public u20 O;
    public o10 P;
    public bj1 Q;
    public final Handler R;

    public BarcodeView(Context context) {
        super(context);
        this.N = 1;
        this.O = null;
        z20 z20Var = new z20(this, (byte) 0);
        this.Q = new gy8((byte) 4);
        this.R = new Handler(z20Var);
    }

    @Override // o.uk0
    public final void c() {
        TextureView textureView;
        SurfaceView surfaceView;
        j();
        l47.t();
        Log.d("uk0", "pause()");
        this.u = -1;
        mk0 mk0Var = this.m;
        if (mk0Var != null) {
            l47.t();
            if (mk0Var.f) {
                mk0Var.a.d(mk0Var.l);
            } else {
                mk0Var.g = true;
            }
            mk0Var.f = false;
            this.m = null;
            this.s = false;
        } else {
            this.f2219o.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.B == null && (surfaceView = this.q) != null) {
            surfaceView.getHolder().removeCallback(this.I);
        }
        if (this.B == null && (textureView = this.r) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.y = null;
        this.z = null;
        this.D = null;
        gy8 gy8Var = this.t;
        if6 if6Var = (if6) gy8Var.d;
        if (if6Var != null) {
            if6Var.disable();
        }
        gy8Var.d = null;
        gy8Var.c = null;
        gy8Var.e = null;
        this.L.j();
    }

    public bj1 getDecoderFactory() {
        return this.Q;
    }

    public final zi1 h() {
        zi1 zi1Var;
        if (this.Q == null) {
            this.Q = new gy8((byte) 4);
        }
        dj1 dj1Var = new dj1();
        HashMap map = new HashMap();
        map.put(pi1.NEED_RESULT_POINT_CALLBACK, dj1Var);
        gy8 gy8Var = (gy8) this.Q;
        gy8Var.getClass();
        EnumMap enumMap = new EnumMap(pi1.class);
        enumMap.putAll(map);
        EnumMap enumMap2 = (EnumMap) gy8Var.d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Collection collection = (Collection) gy8Var.c;
        if (collection != null) {
            enumMap.put(pi1.POSSIBLE_FORMATS, collection);
        }
        String str = (String) gy8Var.e;
        if (str != null) {
            enumMap.put(pi1.CHARACTER_SET, str);
        }
        uu4 uu4Var = new uu4();
        uu4Var.c(enumMap);
        int i = gy8Var.b;
        if (i == 0) {
            zi1Var = new zi1(uu4Var);
        } else if (i == 1) {
            zi1Var = new xm3(uu4Var);
        } else if (i != 2) {
            zi1Var = new zi1(uu4Var);
        } else {
            pr4 pr4Var = new pr4(uu4Var);
            pr4Var.c = true;
            zi1Var = pr4Var;
        }
        dj1Var.a = zi1Var;
        return zi1Var;
    }

    public final void i() {
        j();
        if (this.N == 1 || !this.s) {
            return;
        }
        o10 o10Var = new o10(getCameraInstance(), h(), this.R);
        this.P = o10Var;
        o10Var.g = getPreviewFramingRect();
        o10 o10Var2 = this.P;
        o10Var2.getClass();
        l47.t();
        HandlerThread handlerThread = new HandlerThread("o10");
        o10Var2.c = handlerThread;
        handlerThread.start();
        o10Var2.d = new Handler(((HandlerThread) o10Var2.c).getLooper(), (qz) o10Var2.i);
        o10Var2.a = true;
        mk0 mk0Var = (mk0) o10Var2.b;
        mk0Var.h.post(new kk0(mk0Var, (xc0) o10Var2.j, (byte) 0));
    }

    public final void j() {
        o10 o10Var = this.P;
        if (o10Var != null) {
            l47.t();
            synchronized (o10Var.h) {
                o10Var.a = false;
                ((Handler) o10Var.d).removeCallbacksAndMessages(null);
                ((HandlerThread) o10Var.c).quit();
            }
            this.P = null;
        }
    }

    public void setDecoderFactory(bj1 bj1Var) {
        l47.t();
        this.Q = bj1Var;
        o10 o10Var = this.P;
        if (o10Var != null) {
            o10Var.e = h();
        }
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = 1;
        this.O = null;
        z20 z20Var = new z20(this, (byte) 0);
        this.Q = new gy8((byte) 4);
        this.R = new Handler(z20Var);
    }
}
