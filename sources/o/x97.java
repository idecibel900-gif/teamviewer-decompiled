package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;

/* JADX INFO: loaded from: classes.dex */
public final class x97 implements wi1 {
    public final tp6 a;

    public x97(tp6 tp6Var) {
        this.a = tp6Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    @Override // o.wi1
    public final p70 a(t67 t67Var, za5 za5Var) {
        ImageDecoder.Source sourceCreateSource;
        wg5 wg5VarV0;
        Bitmap.Config configA = ne3.a(za5Var);
        Context context = za5Var.a;
        if (configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) {
            te3 te3Var = t67Var.a;
            if (te3Var.getFileSystem() != sj2.m || (wg5VarV0 = te3Var.v0()) == null) {
                vs1 vs1VarK = te3Var.K();
                if (vs1VarK instanceof hx) {
                    sourceCreateSource = ImageDecoder.createSource(context.getAssets(), ((hx) vs1VarK).e);
                } else if ((vs1VarK instanceof mb1) && Build.VERSION.SDK_INT >= 29) {
                    try {
                        AssetFileDescriptor assetFileDescriptor = ((mb1) vs1VarK).e;
                        Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                        sourceCreateSource = ImageDecoder.createSource(new io.sentry.r0(assetFileDescriptor, (byte) 7));
                    } catch (ErrnoException unused) {
                        sourceCreateSource = null;
                    }
                } else if (vs1VarK instanceof cc6) {
                    cc6 cc6Var = (cc6) vs1VarK;
                    if (cc6Var.e.equals(context.getPackageName())) {
                        sourceCreateSource = ImageDecoder.createSource(context.getResources(), cc6Var.f);
                    } else if (vs1VarK instanceof oh0) {
                        sourceCreateSource = ImageDecoder.createSource(((oh0) vs1VarK).e);
                    } else {
                        sourceCreateSource = null;
                    }
                } else if (vs1VarK instanceof oh0) {
                    sourceCreateSource = ImageDecoder.createSource(((oh0) vs1VarK).e);
                } else {
                    sourceCreateSource = null;
                }
            } else {
                sourceCreateSource = ImageDecoder.createSource(wg5VarV0.toFile());
            }
            if (sourceCreateSource != null) {
                return new p70(sourceCreateSource, t67Var.a, za5Var, this.a);
            }
        }
        return null;
    }
}
