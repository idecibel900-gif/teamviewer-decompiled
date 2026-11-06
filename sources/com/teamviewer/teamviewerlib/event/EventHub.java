package com.teamviewer.teamviewerlib.event;

import android.util.SparseArray;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o.fl3;
import o.he2;
import o.j1;
import o.jc2;
import o.je2;
import o.m80;
import o.mh0;
import o.nn2;
import o.og4;
import o.pc2;
import o.rb7;
import o.vd2;
import o.wd2;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/teamviewer/teamviewerlib/event/EventHub;", "", "Companion", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EventHub {
    public static final Companion e = new Companion();
    public static volatile EventHub f;
    public final EnumMap a = new EnumMap(EventType.class);
    public final EnumMap b = new EnumMap(EventType.class);
    public final SparseArray c = new SparseArray();
    public final SparseArray d = new SparseArray();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0083\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016H\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b!\u0010\u001bJ\u0088\u0001\u0010\"\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0082 ¢\u0006\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/teamviewer/teamviewerlib/event/EventHub$Companion;", "", "", "eventId", "", "boolKeys", "", "boolValues", "intKeys", "intValues", "longKeys", "", "longValues", "floatKeys", "", "floatValues", "stringKeys", "", "", "stringValues", "byteArrayKeys", "byteArrayValues", "Lo/f88;", "handleEventCallback", "(I[I[Z[I[I[I[J[I[F[I[Ljava/lang/String;[I[Ljava/lang/Object;)V", "", "isEventRegisteredCallback", "(I)Z", "jniInit", "()Z", "jniShutdown", "()V", "id", "jniIsEventRegistered", "jniTriggerEvent", "TAG", "Ljava/lang/String;", "EVENT_ANDROID_START", "I", "EVENT_ANDROID_END", "Lcom/teamviewer/teamviewerlib/event/EventHub;", "_instance", "Lcom/teamviewer/teamviewerlib/event/EventHub;", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ void a(int i, int[] iArr, boolean[] zArr, int[] iArr2, int[] iArr3, int[] iArr4, long[] jArr, int[] iArr5, float[] fArr, int[] iArr6, String[] strArr, int[] iArr7, Object[] objArr) {
            EventHub.e.handleEventCallback(i, iArr, zArr, iArr2, iArr3, iArr4, jArr, iArr5, fArr, iArr6, strArr, iArr7, objArr);
        }

        public static final /* synthetic */ boolean b(int i) {
            return EventHub.e.isEventRegisteredCallback(i);
        }

        public static final /* synthetic */ boolean c(int i) {
            return EventHub.e.jniIsEventRegistered(i);
        }

        public static final /* synthetic */ void d(int i, int[] iArr, boolean[] zArr, int[] iArr2, int[] iArr3, int[] iArr4, long[] jArr, int[] iArr5, float[] fArr, int[] iArr6, String[] strArr, int[] iArr7, Object[] objArr) {
            EventHub.e.jniTriggerEvent(i, iArr, zArr, iArr2, iArr3, iArr4, jArr, iArr5, fArr, iArr6, strArr, iArr7, objArr);
        }

        private final void handleEventCallback(int eventId, int[] boolKeys, boolean[] boolValues, int[] intKeys, int[] intValues, int[] longKeys, long[] longValues, int[] floatKeys, float[] floatValues, int[] stringKeys, String[] stringValues, int[] byteArrayKeys, Object[] byteArrayValues) {
            EnumMap enumMap;
            EventHub eventHubF = f();
            EventType eventType = (EventType) eventHubF.c.get(eventId);
            he2 he2Var = new he2();
            int length = boolKeys.length;
            int i = 0;
            while (true) {
                enumMap = he2Var.a;
                if (i >= length) {
                    break;
                }
                EventParam eventParamA = eventHubF.a(boolKeys[i]);
                if (eventParamA != null) {
                    enumMap.put(eventParamA, new m80(Boolean.valueOf(boolValues[i])));
                }
                i++;
            }
            int length2 = intKeys.length;
            for (int i2 = 0; i2 < length2; i2++) {
                EventParam eventParamA2 = eventHubF.a(intKeys[i2]);
                if (eventParamA2 != null) {
                    enumMap.put(eventParamA2, new fl3(Integer.valueOf(intValues[i2])));
                }
            }
            int length3 = longKeys.length;
            for (int i3 = 0; i3 < length3; i3++) {
                EventParam eventParamA3 = eventHubF.a(longKeys[i3]);
                if (eventParamA3 != null) {
                    enumMap.put(eventParamA3, new og4(Long.valueOf(longValues[i3])));
                }
            }
            int length4 = floatKeys.length;
            for (int i4 = 0; i4 < length4; i4++) {
                EventParam eventParamA4 = eventHubF.a(floatKeys[i4]);
                if (eventParamA4 != null) {
                    he2Var.a(eventParamA4, floatValues[i4]);
                }
            }
            int length5 = stringKeys.length;
            for (int i5 = 0; i5 < length5; i5++) {
                EventParam eventParamA5 = eventHubF.a(stringKeys[i5]);
                if (eventParamA5 != null) {
                    he2Var.c(eventParamA5, stringValues[i5]);
                }
            }
            int length6 = byteArrayKeys.length;
            for (int i6 = 0; i6 < length6; i6++) {
                EventParam eventParamA6 = eventHubF.a(byteArrayKeys[i6]);
                if (eventParamA6 != null) {
                    Object obj = byteArrayValues[i6];
                    obj.getClass();
                    enumMap.put(eventParamA6, new mh0((byte[]) obj));
                }
            }
            if (eventType != null) {
                eventHubF.d(eventType, he2Var);
            }
        }

        private final boolean isEventRegisteredCallback(int eventId) {
            boolean z;
            EventHub eventHubF = f();
            EventType eventType = (EventType) eventHubF.c.get(eventId);
            if (eventType == null) {
                return false;
            }
            synchronized (eventHubF.a) {
                List list = (List) eventHubF.a.get(eventType);
                z = !(list == null || list.isEmpty());
            }
            return z;
        }

        private final native boolean jniInit();

        private final native boolean jniIsEventRegistered(int id);

        private final native void jniShutdown();

        private final native void jniTriggerEvent(int eventId, int[] boolKeys, boolean[] boolValues, int[] intKeys, int[] intValues, int[] longKeys, long[] longValues, int[] floatKeys, float[] floatValues, int[] stringKeys, String[] stringValues, int[] byteArrayKeys, Object[] byteArrayValues);

        public final void e() {
            if (EventHub.f != null) {
                if (NativeLibTvExt.c()) {
                    jniShutdown();
                }
                EventHub eventHub = EventHub.f;
                eventHub.getClass();
                synchronized (eventHub.a) {
                    EventHub eventHub2 = EventHub.f;
                    eventHub2.getClass();
                    eventHub2.a.clear();
                    EventHub eventHub3 = EventHub.f;
                    eventHub3.getClass();
                    eventHub3.b.clear();
                }
            }
            EventHub.f = null;
            ye4.a("EventHub", "destroyed");
        }

        public final EventHub f() {
            if (EventHub.f == null) {
                EventHub.f = new EventHub();
                if (!NativeLibTvExt.c()) {
                    ye4.c("EventHub", "instance: cannot initialize native EventHub - native library not loaded");
                } else if (!jniInit()) {
                    ye4.c("EventHub", "instance: cannot initialize native EventHub - init failed");
                }
            }
            EventHub eventHub = EventHub.f;
            eventHub.getClass();
            return eventHub;
        }
    }

    public EventHub() {
        jc2 jc2Var = wd2.a;
        jc2Var.getClass();
        byte b = 0;
        j1 j1Var = new j1(jc2Var, b);
        while (j1Var.hasNext()) {
            EventType eventType = (EventType) j1Var.next();
            this.c.put(eventType.swigValue(), eventType);
        }
        jc2 jc2Var2 = wd2.b;
        jc2Var2.getClass();
        j1 j1Var2 = new j1(jc2Var2, b);
        while (j1Var2.hasNext()) {
            EventParam eventParam = (EventParam) j1Var2.next();
            this.d.put(eventParam.swigValue(), eventParam);
        }
    }

    public static void e(EventHub eventHub, EventType eventType) {
        eventHub.d(eventType, he2.b);
    }

    private static final void handleEventCallback(int i, int[] iArr, boolean[] zArr, int[] iArr2, int[] iArr3, int[] iArr4, long[] jArr, int[] iArr5, float[] fArr, int[] iArr6, String[] strArr, int[] iArr7, Object[] objArr) {
        Companion.a(i, iArr, zArr, iArr2, iArr3, iArr4, jArr, iArr5, fArr, iArr6, strArr, iArr7, objArr);
    }

    private static final boolean isEventRegisteredCallback(int i) {
        return Companion.b(i);
    }

    public final EventParam a(int i) {
        return (EventParam) this.d.get(i);
    }

    public final void b(EventType eventType, he2 he2Var) {
        ArrayList arrayList;
        eventType.getClass();
        he2Var.getClass();
        synchronized (this.a) {
            try {
                List list = (List) this.a.get(eventType);
                arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = list instanceof ArrayList ? (ArrayList) list : null;
                    Object objClone = arrayList2 != null ? arrayList2.clone() : null;
                    if (objClone instanceof ArrayList) {
                        arrayList = (ArrayList) objClone;
                    }
                }
                if (list == null || list.isEmpty()) {
                    List list2 = (List) this.b.get(eventType);
                    if (list2 != null) {
                        list2.add(he2Var);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(he2Var);
                        this.b.put(eventType, arrayList3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((vd2) it.next()).a(eventType, he2Var);
            }
        }
    }

    public final boolean c(EventType eventType, vd2 vd2Var) {
        boolean z;
        ArrayList arrayList;
        eventType.getClass();
        vd2Var.getClass();
        synchronized (this.a) {
            try {
                List list = (List) this.a.get(eventType);
                z = true;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            list.add(vd2Var);
                            break;
                        }
                        if (((vd2) it.next()) == vd2Var) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(4);
                    arrayList2.add(vd2Var);
                    this.a.put(eventType, arrayList2);
                }
                List list2 = (List) this.b.get(eventType);
                arrayList = null;
                if (list2 != null) {
                    ArrayList arrayList3 = list2 instanceof ArrayList ? (ArrayList) list2 : null;
                    Object objClone = arrayList3 != null ? arrayList3.clone() : null;
                    arrayList = objClone instanceof ArrayList ? (ArrayList) objClone : null;
                    list2.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                vd2Var.a(eventType, (he2) it2.next());
            }
        }
        return z;
    }

    public final void d(EventType eventType, he2 he2Var) {
        ArrayList arrayList;
        he2 he2Var2 = he2Var;
        eventType.getClass();
        he2Var2.getClass();
        synchronized (this.a) {
            try {
                List list = (List) this.a.get(eventType);
                arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = list instanceof ArrayList ? (ArrayList) list : null;
                    Object objClone = arrayList2 != null ? arrayList2.clone() : null;
                    if (objClone instanceof ArrayList) {
                        arrayList = (ArrayList) objClone;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                ((vd2) next).a(eventType, he2Var2);
            }
        }
        int iSwigValue = eventType.swigValue();
        if (!NativeLibTvExt.c() || iSwigValue < 10000 || iSwigValue > 19999 || !Companion.c(iSwigValue)) {
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (EventParam eventParam : he2Var2.a.keySet()) {
            eventParam.getClass();
            je2 je2Var = (je2) he2Var2.a.get(eventParam);
            if (je2Var instanceof m80) {
                i++;
            } else if (je2Var instanceof fl3) {
                i2++;
            } else if (je2Var instanceof og4) {
                i3++;
            } else if (je2Var instanceof nn2) {
                i4++;
            } else if (je2Var instanceof rb7) {
                i5++;
            } else if (je2Var instanceof mh0) {
                i6++;
            } else if (!(je2Var instanceof pc2)) {
                if (je2Var != null) {
                    ye4.c("EventHub", "triggerNativeEvent(): unknown EventValue type: ".concat(je2Var.getClass().getName()));
                } else {
                    ye4.c("EventHub", "triggerNativeEvent(): no EventValue");
                }
            }
        }
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[i];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i3];
        long[] jArr = new long[i3];
        int[] iArr5 = new int[i4];
        float[] fArr = new float[i4];
        int i7 = 0;
        int[] iArr6 = new int[i5];
        String[] strArr = new String[i5];
        int[] iArr7 = new int[i6];
        Object[] objArr = new Object[i6];
        Iterator it2 = he2Var2.a.keySet().iterator();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            EventParam eventParam2 = (EventParam) it2.next();
            eventParam2.getClass();
            int[] iArr8 = iArr;
            je2 je2Var2 = (je2) he2Var2.a.get(eventParam2);
            if (je2Var2 instanceof m80) {
                zArr[i7] = ((Boolean) ((m80) je2Var2).a).booleanValue();
                iArr8[i7] = eventParam2.swigValue();
                i7++;
            } else if (je2Var2 instanceof fl3) {
                iArr3[i8] = ((Number) ((fl3) je2Var2).a).intValue();
                iArr2[i8] = eventParam2.swigValue();
                i8++;
            } else if (je2Var2 instanceof og4) {
                jArr[i9] = ((Number) ((og4) je2Var2).a).longValue();
                iArr4[i9] = eventParam2.swigValue();
                i9++;
            } else if (je2Var2 instanceof nn2) {
                fArr[i10] = ((Number) ((nn2) je2Var2).a).floatValue();
                iArr5[i10] = eventParam2.swigValue();
                i10++;
            } else if (je2Var2 instanceof rb7) {
                strArr[i11] = (String) ((rb7) je2Var2).a;
                iArr6[i11] = eventParam2.swigValue();
                i11++;
            } else if (je2Var2 instanceof mh0) {
                objArr[i12] = (byte[]) ((mh0) je2Var2).a;
                iArr7[i12] = eventParam2.swigValue();
                i12++;
            } else if (!(je2Var2 instanceof pc2)) {
                if (je2Var2 != null) {
                    ye4.c("EventHub", "triggerNativeEvent(): unknown EventValue type: ".concat(je2Var2.getClass().getName()));
                } else {
                    ye4.c("EventHub", "triggerNativeEvent(): no EventValue");
                }
            }
            it2 = it3;
            he2Var2 = he2Var;
            iArr = iArr8;
        }
        int[] iArr9 = iArr;
        if (NativeLibTvExt.c()) {
            Companion.d(iSwigValue, iArr9, zArr, iArr2, iArr3, iArr4, jArr, iArr5, fArr, iArr6, strArr, iArr7, objArr);
        }
    }

    public final boolean f(vd2 vd2Var) {
        boolean z;
        vd2Var.getClass();
        synchronized (this.a) {
            z = false;
            for (List list : this.a.values()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (vd2Var == ((vd2) it.next())) {
                        list.remove(vd2Var);
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }
}
