package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Handler;
import com.teamviewer.outgoingsessionlib.swig.StreamType;
import com.teamviewer.remotecontrollib.compress.NativeCompress;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.rsmodules.NativeNegotiateVideoCodec;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class qt0 {
    public static final List x = qf0.L(cx5.MS_CAN_CONTROL, cx5.MS_MUST_EXPAND_SCREEN_GRABBING_FIRST);
    public final ss4 a;
    public final EventHub b;
    public eu6 c;
    public kg6 d;
    public final List e;
    public final ArrayList f;
    public final eu6 g;
    public final EventHub h;
    public final RemoteControlApplication i;
    public final SharedPreferences j;
    public final Settings k;
    public final qi7 l;
    public final io.sentry.android.core.n1 m;
    public d11 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wk7 f1863o;
    public final oh3 p;
    public of1 q;
    public i22 r;
    public yt0 s;
    public boolean t;
    public ep3 u;
    public int v;
    public pt0 w;

    public qt0(eu6 eu6Var, EventHub eventHub, RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, Settings settings, qi7 qi7Var, io.sentry.android.core.n1 n1Var) {
        eventHub.getClass();
        sharedPreferences.getClass();
        settings.getClass();
        qi7Var.getClass();
        n1Var.getClass();
        ss4 ss4Var = ss4.f2048o;
        ss4Var.getClass();
        List list = x;
        list.getClass();
        eventHub.getClass();
        eventHub.getClass();
        this.a = ss4Var;
        this.b = eventHub;
        this.d = kg6.m;
        StreamType streamType = StreamType.StreamType_Unknown;
        this.e = list;
        new ArrayList();
        new ArrayList();
        this.f = new ArrayList(list);
        this.g = eu6Var;
        this.h = eventHub;
        this.i = remoteControlApplication;
        this.j = sharedPreferences;
        this.k = settings;
        this.l = qi7Var;
        this.m = n1Var;
        this.p = new oh3(new mt6(eu6Var));
        this.w = pt0.m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:364:0x088e  */
    /* JADX WARN: Code duplicated, block: B:467:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [o.d11] */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v71, types: [boolean] */
    public final boolean a(ak7 ak7Var) {
        int i;
        int i2;
        String str;
        ha6 ha6Var;
        ak7 ak7Var2;
        boolean z;
        j22 j22Var;
        List listK;
        Collection collectionK0;
        Integer numValueOf;
        Point point;
        j22 j22Var2;
        Object obj;
        ?? d11Var;
        Integer numValueOf2;
        float f;
        ClientViewOpenGL clientViewOpenGL;
        boolean z2;
        nf1 nf1Var;
        int i3;
        ep3 ep3Var;
        int iOrdinal = ak7Var.C().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 11) {
                    qi7 qi7Var = this.l;
                    zh7 zh7VarS = ak7Var.s(xi7.m);
                    Object obj2 = zh7VarS.n;
                    int i4 = zh7VarS.m;
                    ye4.a("ClientModuleScreen", "received clipboard data. content length: " + i4);
                    if (i4 > 0 && !im3.n(obj2, qi7Var.b())) {
                        qi7Var.c((String) obj2);
                        return true;
                    }
                } else {
                    if (iOrdinal != 12) {
                        if (iOrdinal != 19) {
                            if (iOrdinal == 36) {
                                d11 d11Var2 = this.n;
                                if (d11Var2 == null) {
                                    ye4.a.g("ClientModuleScreen", "processCommand: compress is null");
                                    return true;
                                }
                                ((Handler) d11Var2.f578o).obtainMessage(1, ak7Var).sendToTarget();
                                ak7Var.b = true;
                                return true;
                            }
                            if (iOrdinal == 50 || iOrdinal == 54) {
                                ep3Var = this.u;
                                if (ep3Var != null) {
                                    try {
                                        ((LinkedBlockingQueue) ep3Var.n).put(ak7Var);
                                        ak7Var.b = true;
                                    } catch (InterruptedException e) {
                                        ye4.d("MultimediaManager", e);
                                    }
                                }
                            } else if (iOrdinal != 79) {
                                if (iOrdinal == 90) {
                                    NativeNegotiateVideoCodec.ReceivedNegotiateVideoCodec(this.g.u.c, ak7Var.a);
                                    return true;
                                }
                                switch (iOrdinal) {
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                        ep3Var = this.u;
                                        if (ep3Var != null) {
                                            ((LinkedBlockingQueue) ep3Var.n).put(ak7Var);
                                            ak7Var.b = true;
                                        }
                                        break;
                                    case 46:
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case 72:
                                            case 73:
                                                ep3Var = this.u;
                                                if (ep3Var != null) {
                                                    ((LinkedBlockingQueue) ep3Var.n).put(ak7Var);
                                                    ak7Var.b = true;
                                                }
                                                break;
                                            case 74:
                                                break;
                                            default:
                                                return false;
                                        }
                                        break;
                                }
                            } else {
                                eu6 eu6Var = this.g;
                                ha6 ha6Var2 = eu6Var.f283o;
                                ig5 ig5VarN = ak7Var.n(ti7.Value);
                                if (ig5VarN.a > 0) {
                                    ha6Var2.u.postValue(Boolean.valueOf(ig5VarN.b));
                                }
                                fa6 fa6Var = eu6Var.p;
                                ig5 ig5VarN2 = ak7Var.n(ti7.CanLock);
                                if (ig5VarN2.a > 0) {
                                    fa6Var.n = ig5VarN2.b;
                                    return true;
                                }
                            }
                        } else {
                            ig5 ig5VarN3 = ak7Var.n(wi7.m);
                            if (ig5VarN3.a > 0) {
                                this.g.f283o.i(!ig5VarN3.b);
                                return true;
                            }
                        }
                        return true;
                    }
                    of1 of1Var = this.q;
                    if (of1Var != null) {
                        ye4 ye4Var = ye4.a;
                        wk7 wk7Var = of1Var.a;
                        zh7 zh7VarM = ak7Var.m(zi7.MaskInfo);
                        if (zh7VarM.m > 0) {
                            zh7 zh7VarM2 = ak7Var.m(zi7.Mask);
                            if (zh7VarM2.m == 0) {
                                ye4.c("Cursor", "receivedCursor: mask is missing");
                            } else {
                                Object obj3 = zh7VarM2.n;
                                obj3.getClass();
                                byte[] bArr = (byte[]) obj3;
                                zh7 zh7VarM3 = ak7Var.m(zi7.ColorInfo);
                                if (zh7VarM3.m > 0) {
                                    Object obj4 = zh7VarM3.n;
                                    obj4.getClass();
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) obj4);
                                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferWrap.getInt();
                                    int i5 = byteBufferWrap.getInt();
                                    int i6 = byteBufferWrap.getInt();
                                    byteBufferWrap.getShort();
                                    short s = byteBufferWrap.getShort();
                                    byteBufferWrap.getInt();
                                    byteBufferWrap.getInt();
                                    byteBufferWrap.getInt();
                                    byteBufferWrap.getInt();
                                    byteBufferWrap.getInt();
                                    byteBufferWrap.getInt();
                                    Object obj5 = ak7Var.m(zi7.Color).n;
                                    obj5.getClass();
                                    byte[] bArr2 = (byte[]) obj5;
                                    if (s != 32) {
                                        ye4Var.g("Cursor", "receivedCursor: invalid bitCount=" + ((int) s));
                                    }
                                    if (i5 <= 0) {
                                        ye4Var.g("Cursor", "receivedCursor: invalid width=" + i5);
                                    }
                                    if (i6 <= 0) {
                                        ye4Var.g("Cursor", "receivedCursor: invalid height=" + i6);
                                    }
                                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
                                    int[] iArr = new int[i5 * i6];
                                    int i7 = (s / 8) * ((i5 / s) + (i5 % s > 0 ? 1 : 0));
                                    if (s == 32) {
                                        int i8 = i6 - 1;
                                        for (int i9 = -1; i9 < i8; i9 = -1) {
                                            int i10 = i8 * i5;
                                            int i11 = 0;
                                            while (i11 < i5) {
                                                int i12 = (((i6 - i8) - 1) * i7 * 8) + i11;
                                                int i13 = byteBufferWrap2.get() & 255;
                                                int i14 = byteBufferWrap2.get() & 255;
                                                int i15 = i8;
                                                int i16 = byteBufferWrap2.get() & 255;
                                                int i17 = byteBufferWrap2.get() & 255;
                                                if ((bArr[i12 >> 3] & (1 << (7 - (i12 % 8)))) != 0) {
                                                    i17 = 0;
                                                } else if (i17 <= 0) {
                                                    i17 = 255;
                                                }
                                                iArr[i10] = (i17 << 24) | (i16 << 16) | (i14 << 8) | i13;
                                                i11++;
                                                i10++;
                                                i8 = i15;
                                            }
                                            i8--;
                                        }
                                    } else if (s == 16) {
                                        int i18 = i6 - 1;
                                        while (-1 < i18) {
                                            int i19 = i18 * i5;
                                            int i20 = 0;
                                            while (i20 < i5) {
                                                int i21 = (((i6 - i18) - 1) * i7 * 8) + i20;
                                                int i22 = ((byteBufferWrap2.get() & 255) << 8) | (byteBufferWrap2.get() & 255);
                                                int i23 = i18;
                                                iArr[i19] = (((i22 >> 5) << 2) & 255) | ((((1 << (7 - (i21 % 8))) & bArr[i21 >> 3]) == 0 ? 255 : 0) << 24) | ((i22 & 31) << 19) | ((((i22 >> 11) << 3) & 255) << 8);
                                                i20++;
                                                i19++;
                                                i18 = i23;
                                            }
                                            i18--;
                                        }
                                    }
                                    nf1Var = new nf1(i5, i6, iArr);
                                } else {
                                    Object obj6 = zh7VarM.n;
                                    obj6.getClass();
                                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap((byte[]) obj6);
                                    byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferWrap3.getInt();
                                    int i24 = byteBufferWrap3.getInt();
                                    int i25 = byteBufferWrap3.getInt();
                                    byteBufferWrap3.getShort();
                                    byteBufferWrap3.getShort();
                                    byteBufferWrap3.getInt();
                                    byteBufferWrap3.getInt();
                                    byteBufferWrap3.getInt();
                                    byteBufferWrap3.getInt();
                                    byteBufferWrap3.getInt();
                                    byteBufferWrap3.getInt();
                                    int i26 = i25 / 2;
                                    if (i24 <= 0) {
                                        ye4Var.g("Cursor", "receivedCursor: invalid width=" + i24);
                                    }
                                    if (i26 <= 0) {
                                        ye4Var.g("Cursor", "receivedCursor: invalid height=" + i26);
                                    }
                                    int i27 = i26 * i24;
                                    int i28 = i27 >> 3;
                                    LinkedHashSet linkedHashSetQ0 = lv0.q0(new yk3(0, bArr.length - 1, 1), new yk3(i28, (i28 * 2) - 1, 1));
                                    if (linkedHashSetQ0.isEmpty()) {
                                        z2 = true;
                                        break;
                                    }
                                    Iterator it = linkedHashSetQ0.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z2 = true;
                                            break;
                                        }
                                        if ((bArr[((Number) it.next()).intValue()] & 255) != 255) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    int[] iArr2 = new int[i27];
                                    for (int i29 = 0; i29 < i26; i29++) {
                                        int i30 = ((i26 - i29) - 1) * i24;
                                        int i31 = i29 * i24;
                                        int i32 = 0;
                                        while (i32 < i24) {
                                            int i33 = -16777216;
                                            if (z2) {
                                                i33 = (bArr[i30 >> 3] & (1 << (7 - (i30 % 8)))) == 0 ? 0 : -16777216;
                                                i3 = 0;
                                            } else {
                                                int i34 = i30 >> 3;
                                                int i35 = 1 << (7 - (i30 % 8));
                                                i3 = (bArr[i34] & i35) != 0 ? 16777215 : 0;
                                                if ((bArr[i34 + i28] & i35) != 0) {
                                                    i33 = 0;
                                                }
                                            }
                                            i30++;
                                            iArr2[i31] = i33 | i3;
                                            i32++;
                                            i31++;
                                        }
                                    }
                                    nf1Var = new nf1(i24, i26, iArr2);
                                }
                                int i36 = ak7Var.q(zi7.XHotSpot).b;
                                int i37 = ak7Var.q(zi7.YHotSpot).b;
                                int i38 = nf1Var.a;
                                int i39 = nf1Var.b;
                                int[] iArr3 = nf1Var.c;
                                if (i38 <= 0 || i39 <= 0) {
                                    ye4.c("TVMouse", "setBitmap: invalid dimension w: " + i38 + " h: " + i39);
                                } else {
                                    wk7Var.h = Bitmap.createBitmap(iArr3, i38, i39, Bitmap.Config.ARGB_8888);
                                    if (((a2) wk7Var.a).f283o.d()) {
                                        wk7Var.g = wk7Var.h;
                                    }
                                    Point point2 = wk7Var.e;
                                    point2.x = i36;
                                    point2.y = i37;
                                    wk7Var.f();
                                }
                            }
                        } else if (wk7Var.h == null) {
                            ye4.c("Cursor", "receivedCursor(): No MaskInfo received but mouse is null");
                            wk7Var.h = BitmapFactory.decodeResource(wk7Var.c, 2131231303);
                            if (((a2) wk7Var.a).f283o.d()) {
                                wk7Var.g = wk7Var.h;
                            }
                            wk7Var.f();
                        }
                        if (((a2) wk7Var.a).f283o.p) {
                            int i40 = ak7Var.q(zi7.X).b;
                            int i41 = ak7Var.q(zi7.Y).b;
                            Point point3 = wk7Var.f;
                            Point point4 = wk7Var.l;
                            int i42 = i40 - point4.x;
                            point3.x = i42;
                            int i43 = i41 - point4.y;
                            point3.y = i43;
                            pq6 pq6Var = wk7Var.s;
                            if (pq6Var != null) {
                                float f2 = pq6Var.a;
                                point3.x = (int) (i42 * f2);
                                point3.y = (int) (i43 * f2);
                            }
                            ar arVar = wk7Var.f2423o;
                            if (arVar != null) {
                                ((y) arVar.n).a();
                            }
                            boolean z3 = ak7Var.n(zi7.Grabbing).a;
                        }
                    }
                    yt0 yt0Var = this.s;
                    if (yt0Var != null && (clientViewOpenGL = yt0Var.f2640o) != null) {
                        clientViewOpenGL.requestRender();
                        return true;
                    }
                }
            }
            d11 d11Var3 = this.n;
            if (d11Var3 == null) {
                ye4.a.g("ClientModuleScreen", "processCommand: compress is null");
                return true;
            }
            d11Var3.r = this.s;
            ((Handler) d11Var3.f578o).obtainMessage(1, ak7Var).sendToTarget();
            ak7Var.b = true;
            return true;
        }
        eu6 eu6Var2 = this.g;
        ha6 ha6Var3 = eu6Var2.f283o;
        int i44 = ak7Var.q(cj7.Width).b;
        int i45 = ak7Var.q(cj7.Height).b;
        int i46 = ak7Var.q(cj7.Bpp).b;
        int i47 = ak7Var.q(cj7.MaxBPP).b;
        Integer numValueOf3 = Integer.valueOf(i47);
        if (i47 == 0) {
            numValueOf3 = null;
        }
        int iIntValue = numValueOf3 != null ? numValueOf3.intValue() : 32;
        j22 j22Var3 = new j22(i44, i45, iIntValue, 60);
        ha6Var3.getClass();
        ha6Var3.e = j22Var3;
        int i48 = ak7Var.q(cj7.Monitors).b;
        if (i48 < 1) {
            ye4.a.g("RemoteSettings", "received invalid monitor count: " + i48);
            i = 1;
        } else {
            i = i48;
        }
        if (ha6Var3.l != i) {
            ha6Var3.l = i;
            ha6Var3.m.postValue(Boolean.valueOf(i > 1));
            ArrayList arrayList = ha6Var3.r;
            if (arrayList == null) {
                ha6Var3.r = new ArrayList();
                int i49 = ha6Var3.l;
                for (int i50 = 0; i50 < i49; i50++) {
                    ArrayList arrayList2 = ha6Var3.r;
                    if (arrayList2 != null) {
                        arrayList2.add(new Point(-1, -1));
                    }
                }
            } else {
                int size = ha6Var3.l - arrayList.size();
                if (size > 0) {
                    while (size > 0) {
                        ArrayList arrayList3 = ha6Var3.r;
                        if (arrayList3 != null) {
                            arrayList3.add(new Point(-1, -1));
                        }
                        size--;
                    }
                } else {
                    ArrayList arrayList4 = ha6Var3.r;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    int i51 = ha6Var3.l;
                    for (int i52 = 0; i52 < i51; i52++) {
                        ArrayList arrayList5 = ha6Var3.r;
                        if (arrayList5 != null) {
                            arrayList5.add(new Point(-1, -1));
                        }
                    }
                }
            }
        }
        int i53 = ak7Var.q(cj7.CurrentMonitor).b;
        if (i53 < 0 || i53 >= i48) {
            ye4.c("ClientModuleScreen", "invalid current monitor received");
            i2 = 0;
        } else {
            i2 = i53;
        }
        ig5 ig5VarN4 = ak7Var.n(cj7.ViMoDriverInstalled);
        if (ig5VarN4.a) {
            if (this.w == pt0.m) {
                ye4.a("ClientModuleScreen", "Send virtual monitor ready signal.");
                bk7 bk7Var = bk7.TVCmdVirtualMonitor;
                KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                xj7 xj7Var = xj7.CommandType;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putShort((short) 1);
                byte[] bArrArray = byteBufferAllocate.array();
                bArrArray.getClass();
                ak7VarN.a(xj7Var, bArrArray);
                this.g.f(ak7VarN, true);
            }
            this.w = ig5VarN4.b ? pt0.f1773o : pt0.n;
        }
        ci7 ci7VarQ = ak7Var.q(cj7.VDesktopOffsetX);
        int i54 = ci7VarQ.a > 0 ? ci7VarQ.b : 0;
        ci7 ci7VarQ2 = ak7Var.q(cj7.VDesktopOffsetY);
        int i55 = ci7VarQ2.a > 0 ? ci7VarQ2.b : 0;
        ci7 ci7VarQ3 = ak7Var.q(cj7.DPIFactor);
        int i56 = ci7VarQ3.a() ? ci7VarQ3.b : 0;
        ha6Var3.i = i56;
        wk7 wk7Var2 = this.f1863o;
        if (wk7Var2 != null) {
            wk7Var2.t = i56;
            wk7Var2.f();
        }
        wk7 wk7Var3 = this.f1863o;
        if (wk7Var3 != null) {
            Point point5 = wk7Var3.l;
            point5.x = i54;
            point5.y = i55;
        }
        if (i2 == ha6Var3.k) {
            ye4.a.g("RemoteSettings", "skipping set current monitor - no change");
        } else if (i2 > ha6Var3.l) {
            ye4.c("RemoteSettings", "current monitor is higher than monitor count - switch to primary monitory");
            ha6Var3.k = 0;
        } else {
            ha6Var3.k = i2 == true ? 1 : 0;
        }
        boolean z4 = ak7Var.n(cj7.IsSingleWindow).b;
        int i57 = ak7Var.q(cj7.Quality).b;
        int i58 = ak7Var.q(cj7.TileSize).b;
        int i59 = iIntValue;
        long j = ak7Var.r(cj7.TileFeatures).a;
        int iOrdinal2 = this.w.ordinal();
        if (iOrdinal2 == 0) {
            str = "Not supported";
        } else if (iOrdinal2 == 1) {
            str = "Not installed";
        } else {
            if (iOrdinal2 != 2) {
                gk0.s();
                return false;
            }
            str = "Installed";
        }
        StringBuilder sbJ = fx3.j(i44, i45, "Server display is ", "x", "x");
        sbJ.append(i46);
        sbJ.append(", quali=");
        sbJ.append(i57);
        sbJ.append(", monitors=");
        sbJ.append(i2 == true ? 1 : 0);
        sbJ.append("/");
        sbJ.append(i48);
        sbJ.append(", sw=");
        sbJ.append(z4);
        sbJ.append(", tileSize=");
        sbJ.append(i58);
        sbJ.append(", tileFeatures=");
        sbJ.append(j);
        sbJ.append(", dpi=");
        sbJ.append(i56);
        sbJ.append(", VirtualMonitorDriver=");
        sbJ.append(str);
        ye4.a("ClientModuleScreen", sbJ.toString());
        if (z4) {
            ye4.a("ClientModuleScreen", "Single window mode");
            ha6Var = ha6Var3;
            synchronized (ha6Var.d) {
                ha6Var.d.clear();
            }
            ak7Var2 = ak7Var;
            z = false;
        } else {
            ha6Var = ha6Var3;
            ak7Var2 = ak7Var;
            zh7 zh7VarS2 = ak7Var2.s(cj7.DevModes);
            if (zh7VarS2.m > 0) {
                Object obj7 = zh7VarS2.n;
                obj7.getClass();
                String str2 = (String) obj7;
                try {
                    Pattern patternCompile = Pattern.compile(";");
                    patternCompile.getClass();
                    try {
                        ub7.k0(0);
                        Matcher matcher = patternCompile.matcher(str2);
                        if (matcher.find()) {
                            ArrayList arrayList6 = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList6.add(str2.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList6.add(str2.subSequence(iEnd, str2.length()).toString());
                            listK = arrayList6;
                        } else {
                            listK = qf0.K(str2.toString());
                        }
                        if (listK.isEmpty()) {
                            collectionK0 = ea2.m;
                            break;
                        }
                        ListIterator listIterator = listK.listIterator(listK.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                collectionK0 = ea2.m;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                collectionK0 = lv0.K0(listK, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        z = false;
                        try {
                            String[] strArr = (String[]) collectionK0.toArray(new String[0]);
                            synchronized (ha6Var.d) {
                                ha6Var.d.clear();
                                for (String str3 : strArr) {
                                    ha6Var.d.add(new j22(str3));
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            e = e2;
                            ye4.a("RemoteSettings", " parseDisplayResolution exception caught: ".concat(str2));
                            ye4.d("RemoteSettings", e);
                        }
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        e = e3;
                        z = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e4) {
                    e = e4;
                    z = false;
                }
                EventHub.e(EventHub.e.f(), EventType.EVENT_RESOLUTION_CHANGE);
            } else {
                z = false;
            }
            Iterator it2 = ha6Var.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    j22Var = null;
                    break;
                }
                j22Var = (j22) it2.next();
                int i60 = j22Var.m;
                int i61 = i60 % 4 == 0 ? i60 : (((i60 * 4) + 31) & (-32)) / 4;
                if (i44 == i60 || i44 == i61) {
                    if (j22Var.n != i45) {
                        continue;
                    } else {
                        int i62 = i59;
                        if (j22Var.f1122o == i62) {
                            break;
                        }
                        i59 = i62;
                    }
                }
            }
            if (j22Var != null) {
                ha6Var.e = j22Var;
            } else {
                ye4.c("ClientModuleScreen", "got DisplayParams with no matching resolution");
            }
        }
        pq6 pq6Var2 = ha6Var.c;
        ci7 ci7VarQ4 = ak7Var2.q(cj7.Width);
        if (ci7VarQ4.a()) {
            numValueOf = Integer.valueOf(ci7VarQ4.b);
        } else {
            ye4.c("ServerScalingFactor", "onReceiveDisplayParams: no width");
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            ci7 ci7VarQ5 = ak7Var2.q(cj7.Height);
            if (ci7VarQ5.a()) {
                numValueOf2 = Integer.valueOf(ci7VarQ5.b);
            } else {
                ye4.c("ServerScalingFactor", "onReceiveDisplayParams: no height");
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                int iIntValue3 = numValueOf2.intValue();
                ci7 ci7VarQ6 = ak7Var2.q(cj7.OriginalResolutionX);
                ci7 ci7VarQ7 = ak7Var2.q(cj7.OriginalResolutionY);
                float f3 = pq6Var2.a;
                if (ci7VarQ6.a() && ci7VarQ7.a()) {
                    int i63 = ci7VarQ6.b;
                    int i64 = ci7VarQ7.b;
                    point = new Point(i63, i64);
                    f = ((iIntValue3 / i64) + (iIntValue2 / i63)) / 2.0f;
                    pq6Var2.a = f;
                } else {
                    f = 1.0f;
                    pq6Var2.a = 1.0f;
                    point = null;
                }
                if (Float.compare(f, f3) != 0) {
                    float f4 = pq6Var2.a;
                    he2 he2Var = new he2();
                    he2Var.a(EventParam.EP_SCALING_FACTOR_VALUE_NEW, f4);
                    he2Var.a(EventParam.EP_SCALING_FACTOR_VALUE_OLD, f3);
                    EventHub.e.f().d(EventType.EVENT_SCALING_FACTOR_CHANGED, he2Var);
                }
                ye4.a("ServerScalingFactor", "Scaling factor is " + pq6Var2.a);
            } else {
                point = null;
            }
        } else {
            point = null;
        }
        j22 j22Var4 = point == null ? j22Var3 : new j22(point.x, point.y, j22Var3.f1122o, j22Var3.p);
        ha6Var.f = j22Var4;
        if (ha6Var.g == null) {
            ha6Var.g = new j22[ha6Var.l];
        }
        ?? r12 = i2;
        if (i2 >= ha6Var.l) {
            ye4.c("RemoteSettings", "setNativeDisplayResolution: current monitor is higher than monitor count - switch to primary monitory");
            r12 = z;
        }
        j22[] j22VarArr = ha6Var.g;
        j22VarArr.getClass();
        if (r12 < j22VarArr.length) {
            j22[] j22VarArr2 = ha6Var.g;
            j22VarArr2.getClass();
            j22Var2 = j22VarArr2[r12];
        } else {
            j22Var2 = null;
        }
        if (j22Var2 == null) {
            j22[] j22VarArr3 = ha6Var.g;
            if (j22VarArr3 == null) {
                ye4.c("RemoteSettings", "Native display resolutions list is null.");
            } else if (r12 < j22VarArr3.length) {
                j22VarArr3[r12] = j22Var4;
                ha6Var.a();
            } else {
                ye4.c("RemoteSettings", "Cannot set resolution: Monitor index " + r12 + " is out of bounds.");
            }
        } else {
            int i65 = j22Var2.n;
            int i66 = j22Var2.m;
            int i67 = j22Var4.m;
            int i68 = j22Var4.n;
            if ((i67 > i68 && i66 < i65) || (i67 < i68 && i66 > i65)) {
                j22[] j22VarArr4 = ha6Var.g;
                j22VarArr4.getClass();
                j22VarArr4[r12] = new j22(i65, i66, j22Var2.f1122o, j22Var2.p);
                ha6Var.a();
            }
        }
        ye4.a("ClientModuleScreen", "reset current display resources");
        d11 d11Var4 = this.n;
        if (d11Var4 != null) {
            d11Var4.o();
            obj = null;
            this.n = null;
        } else {
            obj = null;
        }
        ye4.a("ClientModuleScreen", "creating new display resources");
        ju juVar = d11.s;
        RemoteControlApplication remoteControlApplication = this.i;
        eu6 eu6Var3 = this.c;
        if (eu6Var3 == null) {
            ye4.c("ClientModuleScreen", "creating new display resources failed senderTVCommand null");
        } else {
            ParticipantIdentifier participantIdentifierA = eu6Var2.r.a();
            long j2 = ak7Var2.a;
            synchronized (juVar) {
                try {
                    remoteControlApplication.getClass();
                    try {
                        d11Var = new d11(eu6Var3, participantIdentifierA, j2);
                    } catch (Throwable th) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        ye4.c("Compress", "create Bitmap throwable: ".concat(message));
                        bu7.MAIN.a(new jy0((byte) 2, 1, remoteControlApplication.getString(R.string.tv_errorMessage_InternalAndroidError) + th.getMessage(), remoteControlApplication));
                        d11Var = obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.n = d11Var;
            if (d11Var == 0) {
                ye4.c("ClientModuleScreen", "creating new display resources failed");
            } else {
                this.m.k();
                if (this.t) {
                    i22 i22Var = this.r;
                    if (i22Var != null) {
                        i22Var.P();
                    } else {
                        ye4.c("ClientModuleScreen", "receivedDisplayParams(): ClientView is null. Cannot do a re-init.");
                    }
                } else {
                    this.t = true;
                    eu6 eu6Var4 = this.g;
                    i41 i41Var = i41.w;
                    ps6 ps6Var = eu6Var4.m;
                    ps6Var.getClass();
                    ps6Var.g(i41Var);
                    rk5 rk5Var = es6.n;
                    String string = this.j.getString("ENABLE_AUTO_LOCKING", "default");
                    string.getClass();
                    rk5Var.getClass();
                    for (Object obj8 : es6.s) {
                        if (((es6) obj8).m.equals(string)) {
                            obj = obj8;
                            break;
                        }
                    }
                    es6 es6Var = (es6) obj;
                    if (es6Var == null) {
                        es6Var = es6.Automatic;
                    }
                    fa6 fa6Var2 = this.g.p;
                    boolean z5 = fa6Var2.n;
                    if (z5 && fa6Var2.m == fj7.TRUE) {
                        ha6Var.f(es6.Disable != es6Var ? true : z);
                    } else if (z5) {
                        ha6Var.f(es6.Always == es6Var ? true : z);
                    } else {
                        ye4.a("ClientModuleScreen", "Server does not support autolocking");
                    }
                    i22 i22Var2 = this.r;
                    if (i22Var2 != null) {
                        i22Var2.j0();
                    } else {
                        ye4.c("ClientModuleScreen", "receivedDisplayParams(): ClientView is null. Cannot set wr to false.");
                    }
                }
            }
        }
        return true;
    }

    public final void b(kg6 kg6Var) {
        int iOrdinal = kg6Var.ordinal();
        if (iOrdinal == 1) {
            if (cx.B0(this.d, new kg6[]{kg6.m, kg6.q, kg6.r})) {
                ye4.a("ClientModuleScreen", "Skipping provided feature negotiation");
                cx5[] cx5VarArr = {cx5.MS_CAN_CONTROL};
                ArrayList arrayList = this.f;
                List listAsList = Arrays.asList(cx5VarArr);
                listAsList.getClass();
                arrayList.addAll(listAsList);
                this.d = kg6Var;
                ye4.a("RSModule", "module initialized: " + this.a);
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            if (this.d == kg6.n) {
                ye4.a("RSModule", "module pending: " + this.a);
                this.d = kg6Var;
                return;
            }
            return;
        }
        if (iOrdinal == 3) {
            if (cx.B0(this.d, new kg6[]{kg6.n, kg6.f1263o})) {
                this.u = new ep3(this.i, this.g, this.h, this.j, this.k);
                this.t = false;
                eu6 eu6Var = this.g;
                EventHub eventHub = this.h;
                Resources resources = this.i.getResources();
                resources.getClass();
                wk7 wk7Var = new wk7(eu6Var, eventHub, resources);
                wk7Var.s = eu6Var.f283o.c;
                this.f1863o = wk7Var;
                this.q = new of1(wk7Var);
                if (this.f.contains(cx5.MS_MUST_EXPAND_SCREEN_GRABBING_FIRST)) {
                    ye4.a("ClientModuleScreen", "Skipping module expansion");
                }
                this.d = kg6Var;
                ye4.a("RSModule", "module started: " + this.a);
                he2 he2Var = new he2();
                he2Var.b(EventParam.EP_RS_MODULE_TYPE, this.a);
                this.b.d(EventType.EVENT_RS_MODULE_STARTED, he2Var);
                return;
            }
            return;
        }
        if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                ye4.c("RSModule", "setRunState: error in " + this.a);
                this.d = kg6Var;
                return;
            }
            ye4.c("RSModule", "setRunState: unhandled state: " + kg6Var + " currentstate: " + this.d);
            return;
        }
        if (this.d == kg6.p) {
            wk7 wk7Var2 = this.f1863o;
            if (wk7Var2 != null) {
                ye4.a("TVMouse", "stop called");
                h10 h10Var = wk7Var2.n;
                if (h10Var != null) {
                    h10Var.n = false;
                    try {
                        ye4.a("TVMouse", "join called");
                        h10Var.join();
                        wk7Var2.n = null;
                        ye4.a("TVMouse", "join returned");
                    } catch (InterruptedException e) {
                        ua5.v("InterruptedException in stop: ", e.getMessage(), "TVMouse");
                    }
                    if (!wk7Var2.b.f(wk7Var2.u)) {
                        ye4.c("TVMouse", "unregister InputDisabled event failed");
                    }
                }
                wk7Var2.m = null;
                wk7Var2.f2423o = null;
                hm3.f(wk7Var2.r, null);
                wk7Var2.g = null;
                wk7Var2.h = null;
                wk7Var2.p = null;
                this.f1863o = null;
            }
            this.q = null;
            d11 d11Var = this.n;
            if (d11Var != null) {
                d11Var.o();
                synchronized (d11Var) {
                    NativeCompress.Release();
                }
                this.n = null;
            }
            this.r = null;
            ep3 ep3Var = this.u;
            if (ep3Var != null) {
                xv4 xv4Var = (xv4) ep3Var.p;
                ye4.a("MultimediaManager", "shutdown");
                try {
                    xv4Var.interrupt();
                    xv4Var.join();
                } catch (InterruptedException e2) {
                    e41.s("interrupted in close ", e2.getMessage(), "MultimediaManager");
                }
                this.u = null;
            }
            this.d = kg6Var;
            ye4.a("RSModule", "module stopped: " + this.a);
            he2 he2Var2 = new he2();
            he2Var2.b(EventParam.EP_RS_MODULE_TYPE, this.a);
            this.b.d(EventType.EVENT_RS_MODULE_STOPPED, he2Var2);
        }
    }
}
