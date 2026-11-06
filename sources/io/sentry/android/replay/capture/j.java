package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import io.sentry.android.replay.a0;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.i7;
import io.sentry.k7;
import io.sentry.l4;
import io.sentry.n1;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.x4;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.ct1;
import o.ds1;
import o.e8;
import o.ea2;
import o.hg4;
import o.im3;
import o.iq8;
import o.jg4;
import o.k76;
import o.l54;
import o.lv0;
import o.u14;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:130:0x038f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0250 A[EDGE_INSN: B:222:0x0250->B:87:0x0250 BREAK  A[LOOP:2: B:47:0x0193->B:85:0x0243], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0236  */
    /* JADX WARN: Code duplicated, block: B:85:0x0243 A[LOOP:2: B:47:0x0193->B:85:0x0243, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static m a(n1 n1Var, g7 g7Var, long j, Date date, w wVar, int i, int i2, int i3, h7 h7Var, io.sentry.android.replay.k kVar, int i4, int i5, String str, List list, Deque deque, List list2, List list3) {
        Throwable th;
        ArrayList arrayList;
        int i6;
        int i7;
        boolean z;
        int i8;
        io.sentry.h hVar;
        Object obj;
        int i9;
        Object obj2;
        List list4;
        List list5;
        io.sentry.util.a aVar;
        List<io.sentry.h> list6;
        boolean z2;
        io.sentry.rrweb.b bVarA;
        io.sentry.rrweb.a aVar2;
        Object obj3;
        Object obj4;
        io.sentry.rrweb.a aVar3;
        g7Var.getClass();
        wVar.getClass();
        list2.getClass();
        list3.getClass();
        if (kVar != null) {
            g7 g7Var2 = kVar.m;
            long jMin = Math.min(j, 300000L);
            long time = date.getTime();
            File file = new File(kVar.q(), i + ".mp4");
            io.sentry.util.a aVar4 = kVar.q;
            ArrayList arrayList2 = kVar.t;
            long j2 = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            aVar4.e();
            try {
                if (arrayList2.isEmpty()) {
                    try {
                        arrayList = new ArrayList();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            iq8.l(aVar4, th);
                            throw th3;
                        }
                    }
                } else {
                    arrayList = lv0.Q0(arrayList2);
                }
                ArrayList arrayList3 = arrayList;
                io.sentry.android.replay.e eVar = null;
                iq8.l(aVar4, null);
                if (arrayList3.isEmpty()) {
                    g7Var2.getLogger().g(f6.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                    i6 = i2;
                    i7 = i3;
                    hVar = null;
                    z = true;
                } else {
                    List list7 = arrayList2;
                    List list8 = arrayList3;
                    i6 = i2;
                    i7 = i3;
                    io.sentry.android.replay.video.a aVar5 = new io.sentry.android.replay.video.a(file, i7, i6, i4, i5);
                    g7Var2.getClass();
                    io.sentry.android.core.d dVar = new io.sentry.android.core.d();
                    dVar.m = g7Var2;
                    dVar.n = aVar5;
                    io.sentry.android.replay.video.c cVar = io.sentry.android.replay.video.c.n;
                    l54 l54Var = l54.n;
                    MediaCodec mediaCodecCreateByCodecName = ((Boolean) ds1.X(l54Var, cVar).getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar5.f);
                    mediaCodecCreateByCodecName.getClass();
                    dVar.f100o = mediaCodecCreateByCodecName;
                    dVar.p = ds1.X(l54Var, new a0(dVar, (byte) 3));
                    dVar.q = new MediaCodec.BufferInfo();
                    String absolutePath = aVar5.a.getAbsolutePath();
                    absolutePath.getClass();
                    dVar.r = new io.sentry.android.replay.video.b(absolutePath, aVar5.d);
                    try {
                        MediaCodec mediaCodec = (MediaCodec) dVar.f100o;
                        mediaCodec.configure((MediaFormat) ((u14) dVar.p).getValue(), (Surface) null, (MediaCrypto) null, 1);
                        dVar.s = mediaCodec.createInputSurface();
                        mediaCodec.start();
                        dVar.d(false);
                        kVar.r = dVar;
                        io.sentry.util.a aVar6 = aVar4;
                        long j3 = 1000 / ((long) i4);
                        Object objO0 = lv0.o0(list8);
                        z = true;
                        long j4 = time + jMin;
                        jg4 jg4Var = j4 <= Long.MIN_VALUE ? jg4.p : new jg4(time, j4 - 1);
                        jg4Var.getClass();
                        ct1.r(j3 > 0, Long.valueOf(j3));
                        long j5 = jg4Var.m;
                        long j6 = jg4Var.n;
                        long j7 = jg4Var.f971o > 0 ? j3 : -j3;
                        long j8 = new hg4(j5, j6, j7).n;
                        if ((j7 > 0 && j5 <= j8) || (j7 < 0 && j8 <= j5)) {
                            Object obj5 = objO0;
                            i8 = 0;
                            while (true) {
                                Iterator it = list8.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = obj5;
                                        io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) it.next();
                                        long j9 = j5 + j3;
                                        i9 = i8;
                                        Iterator it2 = it;
                                        long j10 = lVar.b;
                                        if (j5 <= j10 && j10 <= j9) {
                                            obj2 = lVar;
                                            break;
                                        }
                                        if (j10 <= j9) {
                                            obj5 = obj;
                                            i8 = i9;
                                            it = it2;
                                        }
                                    } else {
                                        obj = obj5;
                                        i9 = i8;
                                    }
                                    obj2 = obj;
                                    break;
                                }
                                io.sentry.android.replay.l lVar2 = (io.sentry.android.replay.l) obj2;
                                if (lVar2 != null) {
                                    try {
                                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(lVar2.a.getAbsolutePath());
                                        io.sentry.android.core.d dVar2 = kVar.r;
                                        if (dVar2 != null) {
                                            bitmapDecodeFile.getClass();
                                            dVar2.e(bitmapDecodeFile);
                                        }
                                        bitmapDecodeFile.recycle();
                                        Object obj6 = obj2;
                                        i8 = i9 + 1;
                                        obj5 = obj6;
                                        j8 = j8;
                                        list4 = list7;
                                        list5 = list8;
                                        aVar = aVar6;
                                    } catch (Throwable th4) {
                                        g7Var2.getLogger().d(f6.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th4);
                                        if (obj2 != null) {
                                            kVar.j(((io.sentry.android.replay.l) obj2).a);
                                            aVar6.e();
                                            try {
                                                e8.f(list7);
                                                list4 = list7;
                                                list4.remove(obj2);
                                                aVar = aVar6;
                                                iq8.l(aVar, null);
                                                list5 = list8;
                                                list5.remove(obj2);
                                                i8 = i9;
                                                obj5 = null;
                                            } catch (Throwable th5) {
                                                io.sentry.util.a aVar7 = aVar6;
                                                try {
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    iq8.l(aVar7, th5);
                                                    throw th6;
                                                }
                                            }
                                        } else {
                                            aVar = aVar6;
                                            list4 = list7;
                                            list5 = list8;
                                            obj5 = obj2;
                                            i8 = i9;
                                        }
                                    }
                                    if (j5 != j8) {
                                        break;
                                    }
                                    j5 += j7;
                                    list7 = list4;
                                    list8 = list5;
                                    aVar6 = aVar;
                                    j8 = j8;
                                }
                                if (obj2 != null) {
                                    kVar.j(((io.sentry.android.replay.l) obj2).a);
                                    aVar6.e();
                                    e8.f(list7);
                                    list4 = list7;
                                    list4.remove(obj2);
                                    aVar = aVar6;
                                    iq8.l(aVar, null);
                                    list5 = list8;
                                    list5.remove(obj2);
                                    i8 = i9;
                                    obj5 = null;
                                } else {
                                    aVar = aVar6;
                                    list4 = list7;
                                    list5 = list8;
                                    obj5 = obj2;
                                    i8 = i9;
                                }
                                if (j5 != j8) {
                                    break;
                                    break;
                                }
                                j5 += j7;
                                list7 = list4;
                                list8 = list5;
                                aVar6 = aVar;
                                j8 = j8;
                            }
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 0) {
                            g7Var2.getLogger().g(f6.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                            io.sentry.android.core.d dVar3 = kVar.r;
                            if (dVar3 != null) {
                                dVar3.l();
                            }
                            kVar.r = null;
                            kVar.j(file);
                            eVar = null;
                            hVar = null;
                        } else {
                            io.sentry.android.core.d dVar4 = kVar.r;
                            if (dVar4 != null) {
                                dVar4.l();
                            }
                            io.sentry.android.core.d dVar5 = kVar.r;
                            if (dVar5 != null) {
                                io.sentry.android.replay.video.b bVar = (io.sentry.android.replay.video.b) dVar5.r;
                                if (bVar.e != 0) {
                                    j2 = (bVar.f + bVar.a) / 1000;
                                }
                            }
                            hVar = null;
                            kVar.r = null;
                            kVar.z(j4);
                            eVar = new io.sentry.android.replay.e(file, i8, j2);
                        }
                    } catch (Throwable th7) {
                        dVar.l();
                        throw th7;
                    }
                }
                if (eVar != null) {
                    File file2 = eVar.a;
                    int i10 = eVar.b;
                    long j11 = eVar.c;
                    if (list == null) {
                        k76 k76Var = new k76();
                        k76Var.m = ea2.m;
                        if (n1Var != null) {
                            n1Var.r(new io.sentry.android.fragment.c(k76Var, (byte) 2));
                        }
                        list6 = (List) k76Var.m;
                    } else {
                        list6 = list;
                    }
                    Date date2 = new Date(date.getTime() + j11);
                    i7 i7Var = new i7();
                    i7Var.m = wVar;
                    i7Var.E = wVar;
                    i7Var.F = i;
                    i7Var.G = date2;
                    i7Var.H = date;
                    i7Var.D = h7Var;
                    i7Var.B = file2;
                    i7Var.K = list2;
                    i7Var.L = list3;
                    ArrayList arrayList4 = new ArrayList();
                    io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
                    jVar.n = date.getTime();
                    jVar.p = i6;
                    jVar.q = i7;
                    arrayList4.add(jVar);
                    io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
                    mVar.n = date.getTime();
                    mVar.p = i;
                    mVar.r = j11;
                    mVar.w = i10;
                    mVar.q = file2.length();
                    mVar.y = i4;
                    mVar.u = i6;
                    mVar.v = i7;
                    mVar.z = 0;
                    mVar.A = 0;
                    arrayList4.add(mVar);
                    LinkedList linkedList = new LinkedList();
                    io.sentry.h hVar2 = hVar;
                    for (io.sentry.h hVar3 : list6) {
                        if (hVar2 == null || !im3.n(hVar2.s, "network.event")) {
                            z2 = false;
                        } else {
                            Map mapB = hVar2.b();
                            mapB.getClass();
                            Object obj7 = mapB.get("action");
                            if (obj7 == null) {
                                obj7 = hVar;
                            }
                            if (im3.n(obj7, "NETWORK_AVAILABLE") && im3.n(hVar3.s, "network.event") && hVar3.b().containsKey("network_type") && hVar3.c().getTime() + 5000 >= date.getTime()) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                        }
                        if ((hVar3.c().getTime() >= date.getTime() || z2) && hVar3.c().getTime() < date2.getTime() && (bVarA = g7Var.getReplayController().getY().a(hVar3)) != null) {
                            arrayList4.add(bVarA);
                            if (bVarA instanceof io.sentry.rrweb.a) {
                                aVar3 = (io.sentry.rrweb.a) bVarA;
                            } else {
                                aVar2 = hVar;
                            }
                            if (aVar2 != 0) {
                                aVar2 = aVar3;
                                obj3 = aVar2.r;
                            } else {
                                aVar2 = aVar3;
                                obj3 = hVar;
                            }
                            if (im3.n(obj3, "navigation")) {
                                io.sentry.rrweb.a aVar8 = (io.sentry.rrweb.a) bVarA;
                                ConcurrentHashMap concurrentHashMap = aVar8.u;
                                if (concurrentHashMap == null || (obj4 = concurrentHashMap.get("to")) == null) {
                                    obj4 = hVar;
                                }
                                if (obj4 instanceof String) {
                                    ConcurrentHashMap concurrentHashMap2 = aVar8.u;
                                    concurrentHashMap2.getClass();
                                    Object obj8 = concurrentHashMap2.get("to");
                                    obj8.getClass();
                                    linkedList.add((String) obj8);
                                }
                            }
                        }
                        hVar2 = hVar3;
                    }
                    if (str != null && !im3.n(lv0.o0(linkedList), str)) {
                        linkedList.addFirst(str);
                    }
                    long time2 = date2.getTime();
                    Iterator it3 = deque.iterator();
                    it3.getClass();
                    while (it3.hasNext()) {
                        io.sentry.rrweb.b bVar2 = (io.sentry.rrweb.b) it3.next();
                        long j12 = bVar2.n;
                        if (j12 < time2) {
                            if (j12 >= date.getTime()) {
                                arrayList4.add(bVar2);
                            }
                            it3.remove();
                        }
                    }
                    if (i == 0) {
                        io.sentry.rrweb.k kVar2 = new io.sentry.rrweb.k(io.sentry.rrweb.c.Custom);
                        HashMap map = new HashMap();
                        kVar2.p = map;
                        kVar2.f259o = "options";
                        u sdkVersion = g7Var.getSdkVersion();
                        if (sdkVersion != null) {
                            map.put("nativeSdkName", sdkVersion.m);
                            map.put("nativeSdkVersion", sdkVersion.n);
                        }
                        k7 sessionReplay = g7Var.getSessionReplay();
                        Double d = sessionReplay.e;
                        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) sessionReplay.a;
                        map.put("errorSampleRate", d);
                        map.put("sessionSampleRate", sessionReplay.d);
                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                        map.put("quality", sessionReplay.f.serializedName());
                        map.put("maskedViewClasses", copyOnWriteArraySet);
                        map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.b);
                        map.put("screenshotStrategy", sessionReplay.n == x4.PIXEL_COPY ? "pixelCopy" : "canvas");
                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.p.isEmpty()));
                        if (!sessionReplay.p.isEmpty()) {
                            map.put("networkDetailAllowUrls", sessionReplay.p);
                            map.put("networkRequestHeaders", sessionReplay.s);
                            map.put("networkResponseHeaders", sessionReplay.t);
                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.r));
                            if (!sessionReplay.q.isEmpty()) {
                                map.put("networkDetailDenyUrls", sessionReplay.q);
                            }
                        }
                        arrayList4.add(kVar2);
                    }
                    l4 l4Var = new l4();
                    l4Var.m = Integer.valueOf(i);
                    l4Var.n = lv0.J0(arrayList4, new i());
                    i7Var.I = linkedList;
                    return new k(i7Var, l4Var);
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
        return l.a;
    }
}
