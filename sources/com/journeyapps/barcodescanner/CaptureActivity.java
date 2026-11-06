package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import o.gy8;
import o.hj1;
import o.hm3;
import o.lg3;
import o.mk0;
import o.ni1;
import o.oi1;
import o.pi1;
import o.ql0;
import o.sl0;
import o.tl0;
import o.uu4;
import o.v20;
import o.vk0;

/* JADX INFO: loaded from: classes.dex */
public class CaptureActivity extends Activity {
    public tl0 m;
    public DecoratedBarcodeView n;

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        Set setNoneOf;
        int intExtra;
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.n = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.n;
        tl0 tl0Var = new tl0(this, decoratedBarcodeView);
        this.m = tl0Var;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle != null) {
            tl0Var.c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                int i = tl0Var.c;
                if (i == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i2 = getResources().getConfiguration().orientation;
                    if (i2 == 2) {
                        if (rotation == 0 || rotation == 1) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                    } else if (i2 == 1) {
                        i = (rotation == 0 || rotation == 3) ? 1 : 9;
                    } else {
                        i = 0;
                    }
                    tl0Var.c = i;
                }
                setRequestedOrientation(i);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                Pattern pattern = ni1.a;
                String stringExtra = intent.getStringExtra("SCAN_FORMATS");
                EnumMap enumMap = null;
                List listAsList = stringExtra != null ? Arrays.asList(ni1.a.split(stringExtra)) : null;
                String stringExtra2 = intent.getStringExtra("SCAN_MODE");
                if (listAsList != null) {
                    setNoneOf = EnumSet.noneOf(v20.class);
                    try {
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            setNoneOf.add(v20.valueOf((String) it.next()));
                        }
                    } catch (IllegalArgumentException unused) {
                        if (stringExtra2 != null) {
                            setNoneOf = (Set) ni1.b.get(stringExtra2);
                        } else {
                            setNoneOf = null;
                        }
                    }
                } else if (stringExtra2 != null) {
                    setNoneOf = (Set) ni1.b.get(stringExtra2);
                } else {
                    setNoneOf = null;
                }
                int i3 = oi1.a;
                Bundle extras = intent.getExtras();
                if (extras != null && !extras.isEmpty()) {
                    enumMap = new EnumMap(pi1.class);
                    for (pi1 pi1Var : pi1.values()) {
                        if (pi1Var != pi1.CHARACTER_SET && pi1Var != pi1.NEED_RESULT_POINT_CALLBACK && pi1Var != pi1.POSSIBLE_FORMATS) {
                            String strName = pi1Var.name();
                            Class cls = pi1Var.m;
                            if (extras.containsKey(strName)) {
                                if (cls.equals(Void.class)) {
                                    enumMap.put(pi1Var, Boolean.TRUE);
                                } else {
                                    Object obj = extras.get(strName);
                                    if (cls.isInstance(obj)) {
                                        enumMap.put(pi1Var, obj);
                                    } else {
                                        v0.j("oi1", "Ignoring hint " + pi1Var + " because it is not assignable from " + obj);
                                    }
                                }
                            }
                        }
                    }
                    Log.i("oi1", "Hints from the Intent: " + enumMap);
                }
                vk0 vk0Var = new vk0();
                if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                    vk0Var.a = intExtra;
                }
                if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
                    decoratedBarcodeView.m.setTorch(true);
                }
                String stringExtra3 = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra3 != null) {
                    decoratedBarcodeView.setStatusText(stringExtra3);
                }
                int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
                new uu4().c(enumMap);
                decoratedBarcodeView.m.setCameraSettings(vk0Var);
                BarcodeView barcodeView = decoratedBarcodeView.m;
                gy8 gy8Var = new gy8((byte) 4);
                gy8Var.c = setNoneOf;
                gy8Var.d = enumMap;
                gy8Var.e = stringExtra4;
                gy8Var.b = intExtra2;
                barcodeView.setDecoderFactory(gy8Var);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                tl0Var.i.b = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra5 = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                tl0Var.e = booleanExtra;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                tl0Var.f = stringExtra5;
            }
            if (intent.hasExtra("TIMEOUT")) {
                z = true;
                tl0Var.j.postDelayed(new ql0(tl0Var, (byte) 1), intent.getLongExtra("TIMEOUT", 0L));
            } else {
                z = true;
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                tl0Var.d = z;
            }
        }
        tl0 tl0Var2 = this.m;
        DecoratedBarcodeView decoratedBarcodeView2 = tl0Var2.b;
        sl0 sl0Var = tl0Var2.l;
        BarcodeView barcodeView2 = decoratedBarcodeView2.m;
        hj1 hj1Var = new hj1(decoratedBarcodeView2, sl0Var);
        barcodeView2.N = 2;
        barcodeView2.O = hj1Var;
        barcodeView2.i();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        tl0 tl0Var = this.m;
        tl0Var.g = true;
        tl0Var.h.a();
        tl0Var.j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.n.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        tl0 tl0Var = this.m;
        tl0Var.h.a();
        BarcodeView barcodeView = tl0Var.b.m;
        mk0 cameraInstance = barcodeView.getCameraInstance();
        barcodeView.c();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.g && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        tl0 tl0Var = this.m;
        tl0Var.getClass();
        if (i == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                tl0Var.b.m.d();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            tl0Var.a.setResult(0, intent);
            if (tl0Var.e) {
                tl0Var.b(tl0Var.f);
            } else {
                tl0Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        tl0 tl0Var = this.m;
        CaptureActivity captureActivity = tl0Var.a;
        if (hm3.h(captureActivity, "android.permission.CAMERA") == 0) {
            tl0Var.b.m.d();
        } else if (!tl0Var.m) {
            hm3.A(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            tl0Var.m = true;
        }
        lg3 lg3Var = tl0Var.h;
        if (!lg3Var.c) {
            lg3Var.a.registerReceiver(lg3Var.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            lg3Var.c = true;
        }
        Handler handler = lg3Var.d;
        handler.removeCallbacksAndMessages(null);
        if (lg3Var.f) {
            handler.postDelayed(lg3Var.e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.m.c);
    }
}
