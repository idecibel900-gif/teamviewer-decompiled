package o;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pk0 {
    public static final /* synthetic */ int m = 0;
    public Camera a;
    public Camera.CameraInfo b;
    public sz c;
    public re d;
    public boolean e;
    public String f;
    public ae h;
    public x07 i;
    public x07 j;
    public vk0 g = new vk0();
    public int k = -1;
    public final ok0 l = new ok0(this);

    public pk0(Context context) {
    }

    public final int a() {
        int i = this.h.b;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                i2 = 90;
            } else if (i == 2) {
                i2 = 180;
            } else if (i == 3) {
                i2 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.b;
        int i3 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % 360)) % 360 : ((cameraInfo.orientation - i2) + 360) % 360;
        Log.i("pk0", "Camera Display Orientation: " + i3);
        return i3;
    }

    public final void b() {
        x07 x07Var;
        if (this.a == null) {
            hk0.o("Camera not open");
            return;
        }
        try {
            int iA = a();
            this.k = iA;
            this.a.setDisplayOrientation(iA);
        } catch (Exception unused) {
            io.sentry.android.core.v0.j("pk0", "Failed to set rotation.");
        }
        try {
            c(false);
        } catch (Exception unused2) {
            try {
                c(true);
            } catch (Exception unused3) {
                io.sentry.android.core.v0.j("pk0", "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.a.getParameters().getPreviewSize();
        if (previewSize == null) {
            x07Var = this.i;
            this.j = x07Var;
        } else {
            x07 x07Var2 = new x07(previewSize.width, previewSize.height);
            this.j = x07Var2;
            x07Var = x07Var2;
        }
        this.l.b = x07Var;
    }

    public final void c(boolean z) {
        String string;
        Camera.Parameters parameters = this.a.getParameters();
        String str = this.f;
        if (str == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            io.sentry.android.core.v0.j("pk0", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("pk0", "Initial camera parameters: " + parameters.flatten());
        if (z) {
            io.sentry.android.core.v0.j("pk0", "In camera config safe mode -- most settings will not be honored");
        }
        this.g.getClass();
        int i = ik0.a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String strA = ik0.a("focus mode", supportedFocusModes, "auto");
        if (!z && strA == null) {
            strA = ik0.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strA != null) {
            if (strA.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(strA));
            } else {
                parameters.setFocusMode(strA);
            }
        }
        if (!z) {
            ik0.b(parameters, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new x07(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new x07(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.i = null;
        } else {
            ae aeVar = this.h;
            int i2 = this.k;
            if (i2 == -1) {
                hk0.l("Rotation not calculated yet. Call configure() first.");
                return;
            }
            boolean z2 = i2 % 180 != 0;
            x07 x07Var = (x07) aeVar.c;
            if (x07Var == null) {
                x07Var = null;
            } else if (z2) {
                x07Var = new x07(x07Var.n, x07Var.m);
            }
            ds5 ds5Var = (ds5) aeVar.d;
            ds5Var.getClass();
            if (x07Var != null) {
                Collections.sort(arrayList, new pa1(ds5Var, x07Var));
            }
            Log.i("ds5", "Viewfinder size: " + x07Var);
            Log.i("ds5", "Preview in order of preference: " + arrayList);
            x07 x07Var2 = (x07) arrayList.get(0);
            this.i = x07Var2;
            parameters.setPreviewSize(x07Var2.m, x07Var2.n);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                string = "[]";
            } else {
                StringBuilder sb2 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb2.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append(']');
                string = sb2.toString();
            }
            sb.append(string);
            Log.i("CameraConfiguration", sb.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                for (int[] iArr2 : supportedPreviewFpsRange) {
                    int i3 = iArr2[0];
                    int i4 = iArr2[1];
                    if (i3 >= 10000 && i4 <= 20000) {
                        iArr = iArr2;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr3 = new int[2];
                    parameters.getPreviewFpsRange(iArr3);
                    if (Arrays.equals(iArr3, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("pk0", "Final camera parameters: " + parameters.flatten());
        this.a.setParameters(parameters);
    }

    public final void d(boolean z) {
        String flashMode;
        Camera camera = this.a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    sz szVar = this.c;
                    if (szVar != null) {
                        szVar.c();
                    }
                    Camera.Parameters parameters2 = this.a.getParameters();
                    ik0.b(parameters2, z);
                    this.g.getClass();
                    this.a.setParameters(parameters2);
                    sz szVar2 = this.c;
                    if (szVar2 != null) {
                        szVar2.a = false;
                        szVar2.b();
                    }
                }
            } catch (RuntimeException e) {
                io.sentry.android.core.v0.d("pk0", "Failed to set torch", e);
            }
        }
    }

    public final void e() {
        Camera camera = this.a;
        if (camera == null || this.e) {
            return;
        }
        camera.startPreview();
        this.e = true;
        this.c = new sz(this.a, this.g);
        vk0 vk0Var = this.g;
        re reVar = new re();
        reVar.a = this;
        reVar.b = new Handler();
        this.d = reVar;
        vk0Var.getClass();
    }
}
