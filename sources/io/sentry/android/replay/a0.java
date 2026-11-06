package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import io.sentry.f6;
import io.sentry.g7;
import java.io.File;
import kotlin.jvm.functions.Function0;
import o.f88;
import o.hk0;
import o.mb2;
import o.oj2;
import o.px4;
import o.u18;
import o.ub7;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f138o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, byte b) {
        super(0);
        this.n = b;
        this.f138o = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        boolean z = false;
        switch (this.n) {
            case 0:
                ((b0) this.f138o).p.set(true);
                return f88.a;
            case 1:
                Matrix matrix = new Matrix();
                c0 c0Var = ((io.sentry.android.replay.screenshot.c) this.f138o).d;
                matrix.preScale(c0Var.c, c0Var.d);
                return matrix;
            case 2:
                return new Canvas((Bitmap) ((io.sentry.android.replay.util.e) this.f138o).m.getValue());
            case 3:
                io.sentry.android.core.d dVar = (io.sentry.android.core.d) this.f138o;
                io.sentry.android.replay.video.a aVar = (io.sentry.android.replay.video.a) dVar.n;
                g7 g7Var = (g7) dVar.m;
                String str = aVar.f;
                int iIntValue = aVar.e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) dVar.f100o).getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities();
                    if (videoCapabilities != null && !videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        g7Var.getLogger().g(f6.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        objClamp.getClass();
                        iIntValue = ((Number) objClamp).intValue();
                    }
                    break;
                } catch (Throwable th) {
                    g7Var.getLogger().d(f6.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, aVar.b, aVar.c);
                mediaFormatCreateVideoFormat.getClass();
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar.d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case 4:
                return Integer.valueOf(((io.sentry.android.sqlite.c) this.f138o).m.getCount());
            case 5:
                ((io.sentry.android.sqlite.h) this.f138o).m.f();
                return f88.a;
            case 6:
                ((px4) this.f138o).setValue(Boolean.FALSE);
                return f88.a;
            case 7:
                u18 u18Var = (u18) this.f138o;
                Object objP0 = u18Var.a.p0();
                mb2 mb2Var = mb2.f1456o;
                if (objP0 == mb2Var && u18Var.d.getValue() == mb2Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                Object obj = oj2.d;
                File file = (File) this.f138o;
                synchronized (obj) {
                    oj2.c.remove(file.getAbsolutePath());
                }
                return f88.a;
            default:
                File file2 = (File) ((io.sentry.android.sqlite.d) this.f138o).a();
                String name = file2.getName();
                name.getClass();
                if (!ub7.q0('.', name, "").equals("preferences_pb")) {
                    hk0.h(file2, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
        }
    }
}
