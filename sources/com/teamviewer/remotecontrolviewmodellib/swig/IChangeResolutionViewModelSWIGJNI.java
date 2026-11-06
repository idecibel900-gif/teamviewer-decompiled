package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IChangeResolutionViewModelSWIGJNI {
    public static final native long IChangeResolutionViewModel_AllResolutions(long j, IChangeResolutionViewModel iChangeResolutionViewModel);

    public static final native long IChangeResolutionViewModel_CurrentResolution(long j, IChangeResolutionViewModel iChangeResolutionViewModel);

    public static final native long IChangeResolutionViewModel_OriginalResolution(long j, IChangeResolutionViewModel iChangeResolutionViewModel);

    public static final native void IChangeResolutionViewModel_SelectResolution(long j, IChangeResolutionViewModel iChangeResolutionViewModel, int i);

    public static final native void ListOfResolutions_clear(long j, ListOfResolutions listOfResolutions);

    public static final native void ListOfResolutions_doAdd__SWIG_0(long j, ListOfResolutions listOfResolutions, long j2, Resolution resolution);

    public static final native void ListOfResolutions_doAdd__SWIG_1(long j, ListOfResolutions listOfResolutions, int i, long j2, Resolution resolution);

    public static final native long ListOfResolutions_doGet(long j, ListOfResolutions listOfResolutions, int i);

    public static final native long ListOfResolutions_doRemove(long j, ListOfResolutions listOfResolutions, int i);

    public static final native void ListOfResolutions_doRemoveRange(long j, ListOfResolutions listOfResolutions, int i, int i2);

    public static final native long ListOfResolutions_doSet(long j, ListOfResolutions listOfResolutions, int i, long j2, Resolution resolution);

    public static final native int ListOfResolutions_doSize(long j, ListOfResolutions listOfResolutions);

    public static final native boolean ListOfResolutions_isEmpty(long j, ListOfResolutions listOfResolutions);

    public static final native long NativeLiveDataListOfResolutions_GetNativeValue(long j, NativeLiveDataListOfResolutions nativeLiveDataListOfResolutions);

    public static final native void NativeLiveDataListOfResolutions_RegisterNative(long j, NativeLiveDataListOfResolutions nativeLiveDataListOfResolutions, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long NativeLiveDataResolution_GetNativeValue(long j, NativeLiveDataResolution nativeLiveDataResolution);

    public static final native void NativeLiveDataResolution_RegisterNative(long j, NativeLiveDataResolution nativeLiveDataResolution, long j2, VoidSignalCallback voidSignalCallback);

    public static final native boolean Resolution_Equal(long j, Resolution resolution, long j2, Resolution resolution2);

    public static final native int Resolution_height_get(long j, Resolution resolution);

    public static final native int Resolution_id_get(long j, Resolution resolution);

    public static final native int Resolution_width_get(long j, Resolution resolution);

    public static final native void delete_IChangeResolutionViewModel(long j);

    public static final native void delete_ListOfResolutions(long j);

    public static final native void delete_Resolution(long j);
}
