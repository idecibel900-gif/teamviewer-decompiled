package com.teamviewer.commonresourcelib.swig;

import com.teamviewer.swigcallbacklib.BoolSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class IFeedbackViewModelSWIGJNI {
    public static final native void IFeedbackViewModel_SetCategory(long j, IFeedbackViewModel iFeedbackViewModel, String str);

    public static final native void IFeedbackViewModel_SetComment(long j, IFeedbackViewModel iFeedbackViewModel, String str);

    public static final native void IFeedbackViewModel_SetEmail(long j, IFeedbackViewModel iFeedbackViewModel, String str);

    public static final native void IFeedbackViewModel_SetIsARSupported(long j, IFeedbackViewModel iFeedbackViewModel, boolean z);

    public static final native void IFeedbackViewModel_SetLogFileAttached(long j, IFeedbackViewModel iFeedbackViewModel, boolean z);

    public static final native void IFeedbackViewModel_SetRating(long j, IFeedbackViewModel iFeedbackViewModel, int i);

    public static final native void IFeedbackViewModel_SetSubcategory(long j, IFeedbackViewModel iFeedbackViewModel, String str);

    public static final native void IFeedbackViewModel_UploadFeedback(long j, IFeedbackViewModel iFeedbackViewModel, String str, long j2, BoolSignalCallback boolSignalCallback);

    public static final native void delete_IFeedbackViewModel(long j);
}
