package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.teamviewer.chatviewmodel.swig.IConversationUIModel;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ y(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ve2 ve2Var;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int i2;
        int iMin;
        double dMax;
        int iE;
        int iE2;
        int i3;
        gj5 status;
        byte b = this.m;
        byte b2 = 0;
        b2 = 0;
        b2 = 0;
        f88 f88Var = f88.a;
        Object obj = this.n;
        switch (b) {
            case 0:
                b0 b0Var = (b0) obj;
                Object obj2 = b0Var.G;
                if (obj2 != null) {
                    b0Var.s(obj2, true);
                }
                return f88Var;
            case 1:
                ((xd0) obj).V0();
                return f88Var;
            case 2:
                ((f5) obj).V0();
                return f88Var;
            case 3:
                ((ja) obj).h.invoke(ea0.n);
                return f88Var;
            case 4:
                return Float.valueOf(((in1) obj).d0(125.0f));
            case 5:
                d18 d18Var = (d18) ((a72) obj).q.getValue();
                long j = d18Var.a;
                return d18Var;
            case 6:
                hm3.f(((xj) obj).f2521o, null);
                return f88Var;
            case 7:
                yo1.H((lk) obj);
                return f88Var;
            case 8:
                return ((fp7) obj).P();
            case ep1.b /* 9 */:
                return f88Var;
            case ep1.c /* 10 */:
                return hm3.v((Object[]) obj);
            case 11:
                ((m20) obj).A.getClass();
                throw new ClassCastException();
            case ep1.d /* 12 */:
                return (xo) obj;
            case 13:
                p70 p70Var = (p70) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                za5 za5Var = p70Var.b;
                m70 m70Var = new m70(((te3) p70Var.d).E0());
                w36 w36Var = new w36(m70Var);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new v36(w36Var.peek()), null, options);
                Exception exc = (Exception) m70Var.f1442o;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = ff2.a;
                String str = options.outMimeType;
                ((ef2) p70Var.e).getClass();
                if ((str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) == true) {
                    cf2 cf2Var = new cf2(new df2(new v36(w36Var.peek())));
                    ye2 ye2VarC = cf2Var.c("Orientation");
                    if (ye2VarC == null) {
                        iE = 1;
                    } else {
                        try {
                            iE = ye2VarC.e(cf2Var.e);
                        } catch (NumberFormatException unused) {
                            iE = 1;
                        }
                    }
                    boolean z2 = iE == 2 || iE == 7 || iE == 4 || iE == 5;
                    ye2 ye2VarC2 = cf2Var.c("Orientation");
                    if (ye2VarC2 == null) {
                        iE2 = 1;
                    } else {
                        try {
                            iE2 = ye2VarC2.e(cf2Var.e);
                        } catch (NumberFormatException unused2) {
                            iE2 = 1;
                        }
                    }
                    switch (iE2) {
                        case 3:
                        case 4:
                            i3 = 180;
                            break;
                        case 5:
                        case 8:
                            i3 = 270;
                            break;
                        case 6:
                        case 7:
                            i3 = 90;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    ve2Var = new ve2(i3, z2);
                } else {
                    ve2Var = ve2.c;
                }
                int i4 = ve2Var.b;
                boolean z3 = ve2Var.a;
                Exception exc2 = (Exception) m70Var.f1442o;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                f4 f4Var = ne3.c;
                ColorSpace colorSpace = (ColorSpace) nv1.x(za5Var, f4Var);
                Context context = za5Var.a;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) nv1.x(za5Var, f4Var);
                }
                options.inPremultiplied = ((Boolean) nv1.x(za5Var, ne3.d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) nv1.x(za5Var, ne3.b);
                if ((z3 || i4 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) nv1.x(za5Var, ne3.h)).booleanValue() && config == Bitmap.Config.ARGB_8888 && im3.n(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i5 = options.outWidth;
                try {
                    if (i5 <= 0 || (i = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        z = false;
                        options.inScaled = false;
                    } else {
                        int i6 = (i4 == 90 || i4 == 270) ? i : i5;
                        if (i4 != 90 && i4 != 270) {
                            i5 = i;
                        }
                        w07 w07Var = za5Var.b;
                        oi6 oi6Var = za5Var.c;
                        f4 f4Var2 = me3.b;
                        long jY = j51.y(i6, i5, w07Var, oi6Var, (w07) nv1.x(za5Var, f4Var2));
                        int i7 = (int) (jY >> 32);
                        int i8 = (int) (jY & 4294967295L);
                        int iHighestOneBit = Integer.highestOneBit(i6 / i7);
                        int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
                        int iOrdinal = oi6Var.ordinal();
                        if (iOrdinal != 0) {
                            i2 = 1;
                            if (iOrdinal == 1) {
                                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                            } else {
                                gk0.s();
                            }
                            return null;
                        }
                        i2 = 1;
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        int i9 = iMin;
                        if (i9 < i2) {
                            i9 = 1;
                        }
                        options.inSampleSize = i9;
                        double d = i9;
                        double d2 = ((double) i6) / d;
                        double d3 = ((double) i5) / d;
                        w07 w07Var2 = (w07) nv1.x(za5Var, f4Var2);
                        double d4 = ((double) i7) / d2;
                        double d5 = ((double) i8) / d3;
                        int iOrdinal2 = oi6Var.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                dMax = Math.min(d4, d5);
                            } else {
                                gk0.s();
                            }
                            return null;
                        }
                        dMax = Math.max(d4, d5);
                        j12 j12Var = w07Var2.a;
                        if (j12Var instanceof g12) {
                            double d6 = ((double) ((g12) j12Var).a) / d2;
                            if (dMax > d6) {
                                dMax = d6;
                            }
                        }
                        j12 j12Var2 = w07Var2.b;
                        if (j12Var2 instanceof g12) {
                            double d7 = ((double) ((g12) j12Var2).a) / d3;
                            if (dMax > d7) {
                                dMax = d7;
                            }
                        }
                        if (za5Var.d == pp5.n && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z4 = dMax == 1.0d;
                        options.inScaled = !z4;
                        if (!z4) {
                            if (dMax > 1.0d) {
                                options.inDensity = vn4.r0(2.147483647E9d / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = vn4.r0(2.147483647E9d * dMax);
                            }
                        }
                        z = false;
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new v36(w36Var), null, options);
                    w36Var.close();
                    Exception exc3 = (Exception) m70Var.f1442o;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        hk0.l("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z3 || i4 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z3) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i4 > 0) {
                            matrix.postRotate(i4, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i4 == 90 || i4 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, ff2.a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    xd3 xd3VarP = bt1.p(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                    if (options.inSampleSize > 1 || options.inScaled) {
                        z = true;
                    }
                    return new qi1(xd3VarP, z);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kh.n(w36Var, th);
                        throw th2;
                    }
                }
                break;
            case 14:
                dj5 dj5Var = (dj5) ((k76) obj).m;
                if (dj5Var != null && (status = dj5Var.getStatus()) != null && !status.equals(fj5.a)) {
                    b2 = 1;
                }
                return Boolean.valueOf(b2 ^ 1);
            case 15:
                return (v56) obj;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int i10 = lc0.P0;
                bb5 bb5Var = ((lc0) obj).r0;
                if (bb5Var != null) {
                    bb5Var.D0();
                }
                return f88Var;
            case 17:
                zc0 zc0Var = (zc0) obj;
                GroupListElementViewModel groupListElementViewModel = zc0Var.K;
                if (groupListElementViewModel != null) {
                    zc0Var.I.setText(groupListElementViewModel != null ? GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModel.c, groupListElementViewModel) : null);
                    zc0Var.r();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                int i11 = ed0.L0;
                bb5 bb5Var2 = ((ed0) obj).r0;
                if (bb5Var2 != null) {
                    bb5Var2.D0();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                zd0 zd0Var = (zd0) obj;
                int iV0 = zd0Var.V0();
                PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = zd0Var.n;
                int iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize = (pLManagerDevicesV2ViewModel != null ? (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel) : 0) + iV0;
                if (iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize > 0) {
                    zd0Var.p.setValue(Integer.valueOf(iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize));
                } else {
                    zd0Var.q.setValue(Boolean.TRUE);
                }
                return f88Var;
            case 20:
                ((fe0) obj).V0();
                return f88Var;
            case 21:
                int i12 = le0.M0;
                bb5 bb5Var3 = ((le0) obj).r0;
                if (bb5Var3 != null) {
                    bb5Var3.D0();
                }
                return f88Var;
            case 22:
                qe0 qe0Var = (qe0) obj;
                if (qe0Var.P != null) {
                    qe0Var.v(true);
                }
                return f88Var;
            case 23:
                Iterator it = ((we0) obj).f2402o.iterator();
                while (it.hasNext()) {
                    Callable callable = (Callable) ((WeakReference) it.next()).get();
                    if (callable != null) {
                    }
                }
                return f88Var;
            case 24:
                kp0 kp0Var = (kp0) obj;
                IConversationUIModel iConversationUIModel = kp0Var.M;
                if (iConversationUIModel != null) {
                    kp0Var.t(iConversationUIModel, true);
                    kp0Var.s(iConversationUIModel.GetLastActivityTimestamp());
                }
                return f88Var;
            case 25:
                int i13 = ClientViewOpenGL.F;
                bu7.MAIN.a(new st0((ClientViewOpenGL) obj, b2));
                return f88Var;
            case 26:
                return ((Iterable) obj).iterator();
            case 27:
                Function0 function0 = ((sw0) obj).W;
                if (function0 != null) {
                    function0.a();
                }
                return Boolean.TRUE;
            case 28:
                return h57.p((Set) obj);
            default:
                return qf0.K((vd5) obj);
        }
    }
}
