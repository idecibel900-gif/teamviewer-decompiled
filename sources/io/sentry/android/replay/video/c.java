package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.jvm.functions.Function0;
import o.ub7;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends yz3 implements Function0 {
    public static final c n = new c(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            name.getClass();
            if (ub7.Q(name, "c2.exynos", false)) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
