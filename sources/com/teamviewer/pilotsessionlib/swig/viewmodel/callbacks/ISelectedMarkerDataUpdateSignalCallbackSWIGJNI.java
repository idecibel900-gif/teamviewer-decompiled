package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class ISelectedMarkerDataUpdateSignalCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void ISelectedMarkerDataUpdateSignalCallback_PerformCallback(long j, ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback, long j2, MarkerData markerData);

    public static final native long ISelectedMarkerDataUpdateSignalCallback_SWIGUpcast(long j);

    public static final native void ISelectedMarkerDataUpdateSignalCallback_change_ownership(ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback, long j, boolean z);

    public static final native void ISelectedMarkerDataUpdateSignalCallback_director_connect(ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback, long j, boolean z, boolean z2);

    public static final native long MarkerData_colorARGB_get(long j, MarkerData markerData);

    public static final native void MarkerData_colorARGB_set(long j, MarkerData markerData, long j2);

    public static final native int MarkerData_color_get(long j, MarkerData markerData);

    public static final native void MarkerData_color_set(long j, MarkerData markerData, int i);

    public static final native long MarkerData_digit_get(long j, MarkerData markerData);

    public static final native void MarkerData_digit_set(long j, MarkerData markerData, long j2);

    public static final native boolean MarkerData_hasColorARGB_get(long j, MarkerData markerData);

    public static final native void MarkerData_hasColorARGB_set(long j, MarkerData markerData, boolean z);

    public static final native boolean MarkerData_hasNumber_get(long j, MarkerData markerData);

    public static final native void MarkerData_hasNumber_set(long j, MarkerData markerData, boolean z);

    public static final native boolean MarkerData_markerAlive_get(long j, MarkerData markerData);

    public static final native void MarkerData_markerAlive_set(long j, MarkerData markerData, boolean z);

    public static final native String MarkerData_text_get(long j, MarkerData markerData);

    public static final native void MarkerData_text_set(long j, MarkerData markerData, String str);

    public static void SwigDirector_ISelectedMarkerDataUpdateSignalCallback_PerformCallback(ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback, long j) {
        iSelectedMarkerDataUpdateSignalCallback.PerformCallback(new MarkerData(j, false));
    }

    public static final native void delete_ISelectedMarkerDataUpdateSignalCallback(long j);

    public static final native void delete_MarkerData(long j);

    public static final native long new_ISelectedMarkerDataUpdateSignalCallback();

    public static final native long new_MarkerData();

    private static final native void swig_module_init();
}
