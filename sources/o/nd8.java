package o;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.teamviewer.commonviewmodel.swig.CodecConfiguration;
import com.teamviewer.commonviewmodel.swig.IVideoCodecDetectorNative;
import com.teamviewer.commonviewmodel.swig.IntVector;
import com.teamviewer.commonviewmodel.swig.PairBooleanCodecConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nd8 extends IVideoCodecDetectorNative {
    public static final ArrayList a = qf0.N("OMX.", "c2.");
    public static final ArrayList b = qf0.N("OMX.google.", "c2.android.");

    public static boolean a(String str, List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (bc7.N(true, (String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    @Override // com.teamviewer.commonviewmodel.swig.IVideoCodecDetectorNative
    public final PairBooleanCodecConfiguration DetectCodec(boolean z, String str, int i, IntVector intVector) {
        String[] supportedTypes;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        md8 md8Var;
        boolean z2;
        boolean zIsHardwareAccelerated;
        str.getClass();
        intVector.getClass();
        CodecConfiguration codecConfiguration = new CodecConfiguration();
        int i2 = 0;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        Integer num = null;
        if (codecInfos == null) {
            md8Var = null;
            break;
        }
        int length = codecInfos.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                md8Var = null;
                break;
            }
            MediaCodecInfo mediaCodecInfo = codecInfos[i3];
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() == z && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                int length2 = supportedTypes.length;
                int i4 = i2;
                while (i4 < length2) {
                    if (bc7.H(true, supportedTypes[i4], str)) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if (capabilitiesForType == null) {
                            break;
                        }
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        codecProfileLevelArr.getClass();
                        int length3 = codecProfileLevelArr.length;
                        int i5 = i2;
                        while (true) {
                            if (i5 >= length3) {
                                codecProfileLevel = null;
                                break;
                            }
                            codecProfileLevel = codecProfileLevelArr[i5];
                            if (codecProfileLevel.profile == i) {
                                break;
                            }
                            i5++;
                        }
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (codecProfileLevel != null && videoCapabilities != null) {
                            md8Var = new md8(mediaCodecInfo, capabilitiesForType, codecProfileLevel, videoCapabilities);
                            break;
                        }
                        break;
                    }
                    i4++;
                    i2 = 0;
                }
            }
            i3++;
            i2 = 0;
        }
        if (md8Var != null) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = md8Var.b;
            MediaCodecInfo.VideoCapabilities videoCapabilities2 = md8Var.d;
            MediaCodecInfo mediaCodecInfo2 = md8Var.a;
            for (Integer num2 : intVector) {
                Integer num3 = num2;
                int[] iArr = codecCapabilities.colorFormats;
                iArr.getClass();
                num3.getClass();
                if (cx.C0(iArr, num3.intValue())) {
                    num = num2;
                    break;
                }
            }
            Integer num4 = num;
            if (num4 != null) {
                int i6 = im3.n(mediaCodecInfo2.getName(), "OMX.hisi.video.encoder.avc") ? 32 : 16;
                int i7 = im3.n(mediaCodecInfo2.getName(), "OMX.hisi.video.encoder.avc") ? 32 : 16;
                codecConfiguration.setCodecName(mediaCodecInfo2.getName());
                codecConfiguration.setMimeType(str);
                codecConfiguration.setProfile(i);
                codecConfiguration.setLevel(md8Var.c.level);
                codecConfiguration.setColorFormat(num4.intValue());
                codecConfiguration.setMinWidth(((Number) videoCapabilities2.getSupportedWidths().getLower()).intValue());
                codecConfiguration.setMinHeight(((Number) videoCapabilities2.getSupportedHeights().getLower()).intValue());
                int widthAlignment = videoCapabilities2.getWidthAlignment();
                if (widthAlignment >= i6) {
                    i6 = widthAlignment;
                }
                codecConfiguration.setWidthAlignment(i6);
                int heightAlignment = videoCapabilities2.getHeightAlignment();
                if (heightAlignment >= i7) {
                    i7 = heightAlignment;
                }
                codecConfiguration.setHeightAlignment(i7);
                if (Build.VERSION.SDK_INT >= 29) {
                    zIsHardwareAccelerated = mediaCodecInfo2.isHardwareAccelerated();
                } else {
                    String name = mediaCodecInfo2.getName();
                    name.getClass();
                    zIsHardwareAccelerated = a(name, a) && !a(name, b);
                }
                codecConfiguration.setHardwareAccelerated(zIsHardwareAccelerated);
                codecConfiguration.setIsLowLatencySupported(codecCapabilities.isFeatureSupported("low-latency"));
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        PairBooleanCodecConfiguration pairBooleanCodecConfiguration = new PairBooleanCodecConfiguration();
        pairBooleanCodecConfiguration.setFirst(z2);
        pairBooleanCodecConfiguration.setSecond(codecConfiguration);
        return pairBooleanCodecConfiguration;
    }
}
